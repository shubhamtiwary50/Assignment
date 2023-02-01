package assignments;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        int a;
        System.out.println("Enter your input : ");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        for(int i=0;i<=a;i++){
            toBinary(i);
        }
    }

    static void toBinary(int n){
        System.out.println(Integer.toBinaryString(n));
    }
}
