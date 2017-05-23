package designPatterns;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Mate on 2017. 05. 16..
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            int b = scanner.nextInt();
            A[i] = b;
        }
        scanner.close();
        int newNumber = 0;
        int[] ezaz = new int[N];
        for (int i = N-1; i >= 0; i--) {
            ezaz[newNumber] = A[i];
            newNumber++;
        }

        System.out.println(Arrays.toString(ezaz));

        reverseList(A);
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
    }

    public static int[] reverseList(int[] myList) {
        int size = myList.length-1;
        int temp;
        for(int i = 0; i < myList.length / 2; i++) {
            temp = myList[size];
            myList[size] = myList[i];
            myList[i] = temp;
            size--;
        }
        return myList;
    }
}
