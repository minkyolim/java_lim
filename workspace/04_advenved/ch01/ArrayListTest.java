package ch01;

import org.w3c.dom.Node;

public class ArrayListTest {
    public static void main(String[] args) {
        String[] fruits = {"바나나", "사과", "오렌지", "파인애플", "수박"};
        printFruits(fruits);


    }

    static void printFruits(String[] fruits) {
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }

        for(int i = 0; i < fruits.length;i++){
            System.out.println(fruits[i]);
        }
    }
}
