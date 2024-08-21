import java.util.Scanner;
public class sum{
  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    
    int n1 = a.nextInt();
    int n2 = a.nextInt();
    
    System.out.println("the value of n1:"+n1);
    System.out.println("the value of n2:"+n2);
    
    int s;
    int v;
    s = n1 + n2;
    v = s / 2;
    
    System.out.println("the sum is :"+s);
    System.out.println("the average is:"+v);
  }
}
