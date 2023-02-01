package assignments;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

            int n;
            System.out.println("Enter the number of Items you want to Buy : ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int x[] = new int[n];
            System.out.println("Enter the price for each Items : ");
            for(int i=0;i<n;i++){
                x[i]=sc.nextInt();
            }
           for(int i=0;i<n;i++){
               System.out.print(x[i]+"");
           }
           int solution = BuyTwoOffer(n,x);
        System.out.println("Solution : "+ solution);
        }

        static int BuyTwoOffer(int n, int arr[]){

            int temp = 0;
            int sum=0;
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if(arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println();
            System.out.println("Sorted List (as per price) : ");
            for (int i = 0; i < (n-1); i++) {
                System.out.print(arr[i] + " ");
//                if(i>0){
                    sum=sum+arr[i];
//                }
            }
            System.out.println();
            for (int i = n-1; i >=0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
//            System.out.println(arr[n-2]+""+"+");
//            System.out.print(arr[n-3]+" = "+(arr[n-3]+arr[n-2]));
//             return (arr[n-3]+arr[n-2]);
            return sum;

        }
    }
