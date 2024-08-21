import java.util.Scanner;
 public class division{
   public static void main(String[] args){
     Scanner div = new Scanner(System.in);
     
     double num1 = div.nextDouble();
     double num2 = div.nextDouble();
     
     double q = num1 / num2;
     double r = num1 % num2;
     System.out.println(q);
     System.out.println(r);
   }
 }
