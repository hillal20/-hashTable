package hashTable;

import java.security.KeyStore;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hashtable<String, String> ht1 = new Hashtable<String, String>();
        Hashtable ht2 = new Hashtable();

        ht1.put("hil1", "aiss1");
        ht1.put("hil2", "aiss2");
        ht1.put("hil3", "aiss3");
        ht1.put("hil4", "aiss4");
        ht1.put("hil5", "aiss5");
        ht1.put("hil6", "aiss6");
        ht1.put("hil7", "aiss7");

        System.out.println("ht1 ==> "+ ht1);
        ht2 = (Hashtable) ht1.clone();
        System.out.println("ht2 ==> "+ ht2);

        ///// printing using enumeration
         Enumeration  enu1 =  ht1.elements();


         while(enu1.hasMoreElements()){
             System.out.println("enu1 ==> "+ enu1.nextElement());
         }

        ///// printing using entrySet
           Set set =  ht1.entrySet();

        System.out.println( ht2.equals(ht1));
        System.out.println( ht2.get("hil1"));
        System.out.println( ht2.hashCode());

        ////  printing  using lambda expressions :
        ht2.forEach( (key , value) -> {
            System.out.println(key + " " + value);
            System.out.println(key + " ====>  " + value);
        });


       //////////////////////////////////////////////
       ///// printing using  iterator
        ///////////////////////////////////////////

        ArrayList<String> a = new ArrayList<String>();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");


        ///////////// printing via iterator

        Iterator i =  a.iterator() ;

        while(i.hasNext()){
            System.out.println("i ==> "+ i.next());
        }

       ////////////////printing using lambda ex

        a.forEach(e ->{
            System.out.println(" e ===> "+ e);
        });


    ////////////// printing using while loop
        int j  = 0 ;
        while( j <  a.size()){
            System.out.println("j ===> "+ a.get(j));
            j++;
        }
    //////////////////// printing using for loop

        for (int f = 0; f < a.size(); f++) {
            System.out.println("f === " + a.get(f));
        }
//////////////////// printing using for forEachREMAINIGN && ITERATOR

        Iterator it2 = a.iterator();

        it2.forEachRemaining(e ->{
            System.out.println("it2==> "+ e);
        });

    //// ////// using for each loop
        for (String k : a) {
            System.out.println("k  ===> "+ k);
        }

        /////////// using  list iterator in both directions ;

        ListIterator lI = a.listIterator(a.size());
              while (lI.hasPrevious()){
                  System.out.println("li ===> "+ lI.previous());
              }


}
}
