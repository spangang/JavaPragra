import com.sun.corba.se.impl.orbutil.concurrent.Sync;

import java.util.Scanner;

public class GreaterNum {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter first value: ");
        int a = sc.nextInt();
        System.out.printf("Enter second value: ");
        int b = sc.nextInt();
        System.out.printf("Enter third value: ");
        int c = sc.nextInt();

        boolean great = a > b;
        boolean greater = b > c;

        if(great && greater){
            System.out.printf("First value is greater");
        }else if(!great && greater){
            System.out.printf("Second value is greater");
        }else{
            System.out.printf("Third value is greater");
        }

        }

    }

