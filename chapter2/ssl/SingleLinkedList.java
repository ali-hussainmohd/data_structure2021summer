package chapter2.ssl;

public class SingleLinkedList<E> {

    private static class Node<E>{
    private  E   data;
    private  Node   next;

    private Node(E data){
        this.data = data;
        next = null;
       }
    private Node(E data, Node next){
        this.data=data;
        this.next=next;
      }

    }
    /////////////////////////////end Node//////////////////////////////////////
    private Node head;
    private int size;

    public SingleLinkedList(){
        head= null;
        size= 0;
    }

    public boolean isEmpty(){ return head == null;}

    public int size(){return size;}

    private void addFirst(E item){
        //create node
        Node node = new Node(item);
        head = node;
        size++;
    }

    private void addAfter( Node ref,E item){
        //create node
        //Node node = new Node(item,ref.next);
        Node node = new Node(item);
        node.next= ref.next;// no need if use line 41
        ref.next=node;

        size++;
    }

    private Node getNode(int index){
        Node node= head;
        for(int i= 0; i < index && node!= null; i++)
        { node=node.next;}
        return node;
    }

    public void add(int index, E anEntry){
        if(index < 0 || index > size)
            throw  new IndexOutOfBoundsException(Integer.toString(index));
        if(index == 0)
            addFirst(anEntry);
        else{
            Node ref = getNode(index-1);
            addAfter(ref,anEntry);
            //addAfter(getNode(index-1),anEntry);
        }

    }

    public boolean add(E anEntry){
        add(size,anEntry);
        return true;
    }

    public void addMaunal(int index , E anEntry){
        if(index < 0 || index > size)
            throw  new IndexOutOfBoundsException(Integer.toString(index));

        if(index == 0){
            //addFirst
            Node node = new Node(anEntry);
            head = node;
        }
        else{
            //getNode
            Node ref= head;
            for(int i= 0; i < index && ref!= null; i++)
                ref=ref.next;
            //addAfter
            Node node = new Node(anEntry);
            node.next= ref.next;
            ref.next=node;

        }
        size++;
    }

    public String toString(){
        String str = "";
        Node nodeStr= head;

        for(int i= 0 ; i < size && nodeStr != null ; i++){
            str+= nodeStr.data + "\t";
            nodeStr=nodeStr.next;
        }

        return str;
    }

    private E removeFirst(){
        Node <E>tempNode = head;
        if(head == null)
            return null;
        else{
            head= head.next;
            size--;
            return tempNode.data;
        }
    }
    //ref mean the pre node of cut node or removed node
    private E removeAfter(Node ref){
        Node <E>temp= ref.next;
        if(temp == null)
            return null;
        else{
            ref.next= temp.next;
            size--;
            return temp.data;
        }

    }
    public E remove (int index){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException(Integer.toString(index));
        if(index == 0)
           return removeFirst();
        else
          return  removeAfter(getNode(index-1));

    }//E remove

    public int indexOf(E anEntry){
       int index=0;
       Node node = head;
       while(node != null){

           if(anEntry.equals(node.data))
               return index;
           else{
               node= node.next;
                index++;}

       }



        return -1;
    }//indexOf

    public int indexOfLoopFor(E anEntry){
        Node node = head;
        for(int i=0;i < size && node!=null; i++)
        {
            if(anEntry.equals(node.data))
                return i;
            //update
            node=node.next;
        }

        return -1;
    }

    public boolean remove(E anEntry){
        int index = indexOf(anEntry);
        if(index == -1)
            return false;
        else{
            remove(index);
            return true;
        }
    }//boolean remove

    public boolean contains(E anEntry){
        int index = indexOf(anEntry); // no need use this line in case use comment if
        if(index == -1) // if (indexOf(anEntry) == -1)
            return false;
        else
            return true;
    }
    public void clear(){
        while(head != null)
            head=head.next;
        size=0;
    }

    public E get (int index){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException(Integer.toString(index));
        return  (E) getNode(index).data;
    }

    public E set(int index, E newValue){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException(Integer.toString(index));
        Node <E>node = getNode(index);
        E oldValue = node.data;
        node.data=newValue;
        return oldValue;
    }

 }//class






