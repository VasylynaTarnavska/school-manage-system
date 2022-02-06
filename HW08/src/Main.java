import model.Box;
import model.MyList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Box box = new Box("qwerty");
//        String str = (String)box.getObj();
//        box.setObj(3L);

//        Box<String> box = new Box<>("qwerty");
//                box.setObj("123");
//
//        Box <Integer> integerBox = new Box<>(55);
//        integerBox.getObj();

        MyList<Integer> myList = new MyList<>();
        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);
        myList.add(11);
        myList.add(12);

        System.out.println(myList.toString());
        System.out.println(myList.get(10));
        System.out.println(myList.contains(10));
        myList.add(7, 15);
        System.out.println(myList.toString());
        myList.remove(7);
        System.out.println(myList.toString());
    }
}
