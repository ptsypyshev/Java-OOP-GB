package hw04;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        CustomList<Integer> myIntList = new CustomList<>();
        Random rand = new Random();
        myIntList.add(30);
        for (int i = 0; i < 10; i++) {
            myIntList.add(rand.nextInt(10));
        }
        myIntList.add(30);
        myIntList.print();

        myIntList.remove(1);
        myIntList.remove(5);
        myIntList.print();

        myIntList.removeAll(30);
        myIntList.print();

        try {
            System.out.println(myIntList.getMin());
            System.out.println(myIntList.getMax());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(myIntList.indexOf(4));
        System.out.println(myIntList.contains(5));

        // myIntList.BubbleSort();
        myIntList.InsertionSort();
        // myIntList.SelectionSort();
        myIntList.print();

        System.out.println(myIntList.get(0));
        // System.out.println(myIntList.get(30));

        System.out.println(myIntList.set(4, 100));
        myIntList.print();

        
        try {
            System.out.println(myIntList.getSum());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



        // CustomList<String> myStringList = new CustomList<>();
        // myStringList.add("Five");
        // myStringList.add("Two");
        // myStringList.add("One");
        // myStringList.add("Four");
        // myStringList.add("Four");
        // myStringList.print();
        

        // myStringList.remove(0);
        // myStringList.remove(1);
        // myStringList.print();

        // myStringList.removeAll("Four");
        // myStringList.print();

        // try {
        //     System.out.println(myStringList.getMin());
        //     System.out.println(myStringList.getMax());
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        // System.out.println(myStringList.indexOf("One"));
        // System.out.println(myStringList.contains("Five"));
        // System.out.println(myStringList.contains("Ten"));
        

        // myStringList.remove(20);
        // CustomList<Integer> myAnotherIntList = new CustomList<>(new Integer[]{1});
        // myAnotherIntList.removeAll(1);
        // myAnotherIntList.print();

        // CustomList<Human> myHumanList = new CustomList<>();
        // myHumanList.add(new Human("Vasya", 180));
        // myHumanList.add(new Human("Petya", 173));
        // myHumanList.add(new Human("Igor", 194));
        // myHumanList.add(new Human("Alex", 186));
        // myHumanList.add(new Human("Vova", 179));
        // myHumanList.add(new Human("Stas", 168));

        // myHumanList.print();
        // try {
        //     System.out.println(myHumanList.getMin());
        //     System.out.println(myHumanList.getMax());
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
    }
}
