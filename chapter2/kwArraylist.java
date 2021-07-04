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


}//class
