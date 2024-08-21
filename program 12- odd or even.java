import java.util.Scanner;
public class o{
  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    
    int n = a.nextInt();
    
    if (n % 2 == 0){
      System.out.println("even number");
      
    }
    else{
      System.out.println("odd number");
    }
  }
}
