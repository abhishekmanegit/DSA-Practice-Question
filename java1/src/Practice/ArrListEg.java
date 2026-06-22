package Practice;

import java.util.ArrayList;

public class ArrListEg {

    public static void main(String [] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(89);
        list.add(99);
        list.add(123);

        System.out.println(list);
        list.set(3,95);

        System.out.println(list);

        System.out.println(list.contains(4));
    }

}
