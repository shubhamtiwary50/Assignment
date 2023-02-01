package assignments;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {

        int n;
        System.out.println("Enter the number of elements : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int x[] = new int[n];
        System.out.println("Enter the value for elements in Array : ");
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        int b = isOnionArray(x);
        System.out.println(b);
    }

    static int isOnionArray(int[] a) {
        int j = 0;
        int k = 0;
        int rValue = 0;
        int middleIndex = 0;
        int isOddOrEven = a.length % 2;

        if (isOddOrEven == 0) {
            middleIndex = a.length / 2 - 1;
        } else {
            middleIndex = a.length / 2;
        }

        for (int counter = 0; counter <= middleIndex; counter++) {
            j = counter;
            k = a.length - counter - 1;

            if (j >= 0 && k >= 0 && j + k + 1 == a.length && j != k) {
                if (a[j] + a[k] <= 10) {
                    rValue = 1;
                } else return 0;
            }
        }
        return rValue;
    }
}


