package hw04;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        System.out.println("---- Start with Integers ----\n");

        CustomList<Integer> myIntList = new CustomList<>();
        Random rand = new Random();
        myIntList.add(30);
        
        // Fill a list with random numbers
        for (int i = 0; i < 10; i++) {
            myIntList.add(rand.nextInt(10));
            if (i == 5) {
                myIntList.add(30);
            }
        }
        myIntList.add(30);
        System.out.println("Filled list is:");
        myIntList.print();

        myIntList.remove(1);
        myIntList.remove(5);
        System.out.println("\nRemoved 2 elements");
        myIntList.print();

        myIntList.removeAll(30);
        System.out.println("\nRemoved all elements with value = 30");
        myIntList.print();

        myIntList.add(50);
        System.out.println("\nAdded element 50 to the end of list");
        myIntList.print();

        try {
            System.out.printf("\nMin elem %d\n", myIntList.getMin());
            System.out.printf("Max elem %d\n", myIntList.getMax());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("Index of %d is %d\n", 4, myIntList.indexOf(4));
        System.out.printf("Is list contains 5? %b\n\n", myIntList.contains(5));
        
        try {
            myIntList.BubbleSort();
            // myIntList.InsertionSort();
            // myIntList.SelectionSort();
            System.out.println("Sorted list is:");
            myIntList.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        

        System.out.printf("\nElement at index %d is %d\n", 0, myIntList.get(0));
        // System.out.println(myIntList.get(30));

        System.out.printf("\nReplaced element %d at index 4\n", myIntList.set(4, 100));
        myIntList.print();

        System.out.println("\n----  End with Integers  ----\n\n");



        System.out.println("----  Start with Strings ----\n");

        CustomList<String> myStringList = new CustomList<>();
        myStringList.add("Orange");
        myStringList.add("Banana");
        myStringList.add("Watermelon");
        myStringList.add("Apple");
        myStringList.add("Pear");
        myStringList.add("Kiwi");
        myStringList.add("Lime");
        myStringList.add("Orange");
        myStringList.add("Cherry");
        myStringList.add("Grape");
        myStringList.add("Strawberry");
        myStringList.add("Pineapple");
        myStringList.add("Lemon");
        myStringList.add("Orange");
        
        System.out.println("Filled list is:");
        myStringList.print();

        myStringList.remove(1);
        myStringList.remove(5);
        System.out.println("\nRemoved 2 elements");
        myStringList.print();

        myStringList.removeAll("Orange");
        System.out.println("\nRemoved all elements with value = Orange");
        myStringList.print();

        myStringList.add("Mango");
        System.out.println("\nAdded element Mango to the end of list");
        myStringList.print();

        try {
            System.out.printf("\nMin elem %s\n", myStringList.getMin());
            System.out.printf("Max elem %s\n", myStringList.getMax());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("Index of Grape is %d\n", 4, myStringList.indexOf("Grape"));
        System.out.printf("Is list contains Watermelon? %b\n\n", myStringList.contains("Watermelon"));

        try {
            // myStringList.BubbleSort();
            myStringList.InsertionSort();
            // myStringList.SelectionSort();
            System.out.println("Sorted list is:");
            myStringList.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        

        System.out.printf("\nElement at index %d is %s\n", 0, myStringList.get(0));

        System.out.printf("\nReplaced element %s at index 4\n", myStringList.set(4, "Apricot"));
        myStringList.print();

        System.out.println("\n----  End with Strings  ----\n\n");



        System.out.println("---- Start with Human ----\n");

        CustomList<Human> myHumanList = new CustomList<>();
        myHumanList.add(new Human("Vasya", 180));
        String[] names = new String[]{"Petya", "Igor", "Alex", "Vova", "Stas", "Nastya", "Irina", "Olya", "Natasha", "Masha"};
        // Fill a list with random humans
        for (int i = 0; i < 10; i++) {
            myHumanList.add(new Human(names[rand.nextInt(10)], 160 + rand.nextInt(30)));
            if (i == 5) {
                myHumanList.add(new Human("Vasya", 180));
            }
        }
        myHumanList.add(new Human("Vasya", 180));
        
        System.out.println("Filled list is:");
        myHumanList.print();

        myHumanList.remove(1);
        myHumanList.remove(5);
        System.out.println("\nRemoved 2 elements");
        myHumanList.print();

        myHumanList.removeAll(new Human("Vasya", 180));
        System.out.println("\nRemoved all elements with value = 30");
        myHumanList.print();

        myHumanList.add(new Human("Vika", 170));
        System.out.println("\nAdded element Vika to the end of list");
        myHumanList.print();

        try {
            System.out.printf("\nMin elem %s\n", myHumanList.getMin());
            System.out.printf("Max elem %s\n", myHumanList.getMax());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("Index of Vika is %d\n", 4, myHumanList.indexOf(new Human("Vika", 170)));
        System.out.printf("Is list contains Vika? %b\n\n", myHumanList.contains(new Human("Vika", 170)));

        try {
            // myHumanList.BubbleSort();
            // myHumanList.InsertionSort();
            myHumanList.SelectionSort();
            System.out.println("Sorted list is:");
            myHumanList.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        

        System.out.printf("\nElement at index %d is %s\n", 0, myHumanList.get(0));

        System.out.printf("\nReplaced element %s at index 4\n", myHumanList.set(4, new Human("Dima", 185)));
        myHumanList.print();

        System.out.println("\n----  End with Human  ----\n\n");
    }
}
