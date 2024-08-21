import java.util.Scanner;
public class root{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    int n = s.nextInt();
    
    double a = Math.sqrt(n);
    
    if(a == Math.floor(a)){
      System.out.println("perfect square");
    }
    else{
      System.out.println("not perfect square");
    }
  }
}
