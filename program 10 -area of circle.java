import java.util.Scanner;
public class area{
  public static void main(String[] args){
    Scanner r = new Scanner(System.in);
    
    double n = r.nextDouble();
    System.out.println("the radius is:"+n);
    
    double v;
    v = n*n*(22/7);
    
    System.out.println(v);
    
  }
}
