package chapter2;

import java.util.Arrays;

public class kwArraylist <E> {
    private E theDate[] ;
    private int size;
    private static final int INITIAL_CAPACITY =10;
    private int capcity;

    @SuppressWarnings("unchecked")
    public kwArraylist(){
        size=0;
        capcity = INITIAL_CAPACITY;
        theDate=(E[]) new Object [capcity];
    }
    @SuppressWarnings("unchecked")
    public kwArraylist(int cap){
        size=0;
        capcity = cap;
        theDate=(E[]) new Object [capcity];
    }
    public int size(){return size;}

    public boolean isEmpty(){
        /*if(size == 0)
            return true;
        else
            return false;*/

        return size == 0;
    }
    public boolean add ( E anEntry){
        // check if the array is full
        if(size == capcity)
            reallocate ();
        //Adds object anEntry at the end of the list and returns true.
        theDate[size++]=anEntry;
        return true;
    }

    private void reallocate(){
      //Private method to expand the array by allocating a new array
     // of double the previous capacity. Called if the list becomes full
     // create new capcity
    capcity = capcity*2;
    // new array with new capcity
    E temp [] =(E[]) new Object[capcity];
    //insert thedate value to temp
    for(int i = 0; i < size; i++ )
     temp[i]=theDate[i];
    // make thedate to become temp
    theDate=temp;
    // shortcut
    /* theDate= Arrays.copyOf(theDate, capcity); */

    }//reallocate

    public String toString(){
        String date= "[ ";
        for(int i = 0 ; i < size ; i++)
            date += theDate[i] + " ,";
        date += " ]";
       return date;
    }

    public void add (int index, E anEntry){
       if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        //shafting backword
        for(int i = size ; i > index ;i--)
            theDate[i]=theDate[i-1];
        theDate[index]=anEntry;
        size++;
    }

    public int indexOf(E anEntry){
        // use loop and if to search the element in case available return number of index otherwise return -1;
        for(int i = 0; i < size ; i++ )
            if(theDate[i].equals(anEntry)   )
                return i;
        return -1;
    }

    public boolean contians(E anEntry ){

        if(indexOf(anEntry) == -1)
            return false;
        else
            return true;
    }

    public E get (int index){
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        return theDate[index];
    }

    public E set(int index, E lastValue){
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();

        E oldValue= theDate[index];
        theDate[index]=lastValue;
        return oldValue;
    }

    public E remove (int index){

        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();

        E removed= theDate[index];
        for(int i = index+1 ; i < size;i++)
            theDate[i-1]=theDate[i];
        size--;
        return removed;
    }

    public boolean remove(E anEntry){

        int index = indexOf(anEntry);
        if(index != -1 ){
            remove(index);
        return true;}
        else
            return false;
    }

    public void clear(){
        for(int i=0; i < size; i ++ )
            theDate[i]=null;
        size=0;
    }



}//class
