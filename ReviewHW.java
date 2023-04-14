package homeworkReviewClasses;

import java.util.Scanner;

public class ReviewHW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter ten numbers ");

        int sum = 0;
       for (int i = 0; i <10 ; i++) {
           int num=scan.nextInt();
        sum = num + sum;
        }
        System.out.println(sum);




    }
}
