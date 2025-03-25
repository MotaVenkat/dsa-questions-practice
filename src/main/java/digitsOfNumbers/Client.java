package digitsOfNumbers;

import javax.sound.midi.Soundbank;

public class Client {



    public static void main (String a[]){
        int n =  500;
        // printing each digit from left to right
        while (n>0){
            int d = n%10;
            System.out.println(d);
            n= n/10;

        }
        int num = 500;
        int sum=0;
        // sum of the given number
        while (num>0){
            int d= num%10;
            sum =sum +d;
            num=num/10;
        }
        System.out.println("Sum of the  given number is "+ sum);
        // reversing the given number

        int number = 500;
        int reversed_num = 0;
        while (number > 0){
            int d= number%10;
            reversed_num = reversed_num*10+d;
            number = number/10;

        }
        System.out.println("reversed number "+reversed_num);
        // Amstrong number (sum of each cubed digit in a number is
        // equal to the original number )
        // 153 = (1*1*1 + 5*5*5 + 3*3*)
        int number1 = 152;
        int original_num =number1;
        int cubesum= 0;
        while (number1>0){
            int d= number1%10;
            cubesum = cubesum +(d*d*d);
            number1 = number1/10;
        }
        if(original_num==cubesum){
            System.out.println("Given number is Amstrong number " +original_num);
        }else
            System.out.println("Given number is not an Amstrong number " +original_num);
    }
}
