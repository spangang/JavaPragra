public class JavaSwap {

    public static void main(String args[]){

        int a = 10;
        int b = 20;

        System.out.println("Values before swapping:");
        System.out.println(" a:"+a);
        System.out.println(" b:"+b);

        int c = a;
         a = b;
         b = c;

         System.out.println("Values after swapping:");
        System.out.println(" a:"+a);
        System.out.println(" b:"+b);
    }
}
