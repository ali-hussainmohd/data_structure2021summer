package chapter2.ssl;

public class demo {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.add(10);
        list.add(20);

        list.add(50);
        list.add(30);
        list.add(2,60);
        System.out.println(list);
        System.out.println(list.indexOf(50)+"\t"+ list.indexOfLoopFor(50));
        System.out.println(list.remove(3));
        System.out.println(list);
    }//main
}//class
