package error;

import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class UseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ArrayList = new ArrayList<>(5);
        ArrayList.add(20);
        ArrayList.add(25);
        ArrayList.add(35);

        System.out.println(20);
        System.out.println(25);
        System.out.println(35);

        LinkedList linkedList = new LinkedList();
        linkedList.add("Nerd");
        linkedList.add("5");
        linkedList.add("Bums");
        linkedList.add(10);

        System.out.println("LinkedList:" + linkedList);
        System.out.println("Head of the list:" + linkedList.peek());

        Object G = 20;
        ArrayList.remove(20);
        ArrayList.remove(25);
        Integer remove = ArrayList.remove(35);

        System.out.println("20" + ArrayList.get(20));
        System.out.println("25" + ArrayList.get(25));
        System.out.println("35" + ArrayList.get(35));

















    }
}
