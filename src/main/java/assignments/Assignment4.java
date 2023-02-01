package assignments;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check for triangulation");
        n = sc.nextInt();
        System.out.println("Input value : " + n);

        if (isTriangular(n)==1) {
            System.out.println("Given number is triangular");
        } else {
            System.out.println("Given number is not triangular");
        }

    }
    static int isTriangular ( int n){
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
            if (s == n) {
                return 1;
            }
        }
        return 0;
    }
}
