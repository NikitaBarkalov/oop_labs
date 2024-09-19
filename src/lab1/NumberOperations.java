package lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class NumberOperations {

    public static void printList(ArrayList<Number> Numbers, int mode, String message){
        System.out.print(message + "[ ");
        for (Number number: Numbers){
            switch(mode){
                // case for integer
                case 0: 
                    System.out.printf("%d ", number.intValue());
                    break;
                // case for float
                case 1: 
                    System.out.printf("%.2f ", number.floatValue());
                    break;
                // case without types
                default: 
                    System.out.print(number + " ");
                    break;
            }
        }
        System.out.print("]\n");
    }
    public static void main(String[] args){
        ArrayList<Number> Numbers = new ArrayList<Number>(Arrays.asList(10, 20.5, 30, 40.7, 50, 60.3, 70, 80.1f, 90, 100.9));

        int num1 = 5;
        double num2 = 6.36;
        long num3 = 45879;
        float num4 = 4.06f;
        Collections.addAll(Numbers, num1, num2, num3, num4);

        printList(Numbers, 2, "All numbers: ");
        printList(Numbers, 0, "All numbers like integers: ");
        printList(Numbers, 1, "All numbers like floats: ");

        HashMap<Class<?>, ArrayList<? super Number>> numlists = new HashMap<>(); 
        numlists.put(Integer.class, new ArrayList<Number>());
        numlists.put(Double.class, new ArrayList<Number>());
        numlists.put(Float.class, new ArrayList<Number>());
        numlists.put(Long.class, new ArrayList<Number>());

        for (Number num: Numbers){
            // search and adding numbers by types
            (numlists.get(num.getClass())).add(num);
        }
        System.out.println("Lists with numbers of the same types: ");
        System.out.println(numlists);

        // extra task in variant 2: find summ of all numbers
        double sum = 0;
        for (Number num: Numbers){
            sum += num.doubleValue();
        }
        System.out.printf("The sum of numbers: %.2f", sum);
    }
}
