import java.util.Scanner;
 public class Addition{
   public static void main(String[] args){
     Scanner add = new Scanner(System.in);
     
     double num1 = add.nextDouble();
     double num2 = add.nextDouble();
     
     double addition = num1 + num2;
     
     System.out.println(addition);
   }
 }
