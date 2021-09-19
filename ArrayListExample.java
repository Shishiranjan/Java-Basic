package com.Ccranjan;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>(10);

        list.add(43);
        list.add(53);
        list.add(63);
        list.add(73);
        list.add(83);
        list.add(93);
        list.add(13);
        list.add(23);
         list.add(333);
        list.add(433);
        list.add(639);
        list.add(743);
        list.add(493);
        list.add(143);

        System.out.println(list);

        list.set(3, 88);
        list.remove(4);

        System.out.println(list);


    }
}
