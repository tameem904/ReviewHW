package homeworkReviewClasses;

import java.util.Scanner;

public class ArrayAndScanner {

    public static void main(String[] args) {
               /*
                 and then we want to calculate the average of numbers
               */
        Scanner scan = new Scanner (System.in);
        System.out.println("How many integers you want to store");

      int size= scan.nextInt();
      int[]numbers=new int[size];
      int sum=0;
      double ave=0;

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Please enter "+(i+1)+" element");
            numbers[i]=scan.nextInt();
            sum=sum+numbers[i]; // finding sum of all the numbers
            ave=ave/ numbers.length;
            ave=sum/numbers.length;




        }
        System.out.println(ave);
    }
}
