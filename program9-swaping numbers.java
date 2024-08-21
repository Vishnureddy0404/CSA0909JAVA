import java.util.Scanner;
public class swap{
  public static void main(String[] args){
    Scanner two = new Scanner(System.in);
    
    int n1 = two.nextInt();
    int n2 = two.nextInt();
    System.out.println("Before swapping");
    System.out.println("the value of n1 is"+n1);
    System.out.println("the value of n2 is"+n2);
    
    int temp = n1;
    n1 = n2;
    n2 = temp;
    System.out.println("After swaping");
    System.out.println("the value of n1 is"+n1);
    System.out.println("the value of n2 is"+n2);
  }
}
