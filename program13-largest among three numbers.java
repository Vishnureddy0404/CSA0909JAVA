import java.util.Scanner;
public class large{
  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    
    int n1 = a.nextInt();
    int n2 = a.nextInt();
    int n3 = a.nextInt();
    
    if(n1>n2 && n1>n3 ){
      System.out.println("n1 is largest");
    }
    if(n2>n3 && n2>n1){
      System.out.println("n2 is largest");
    }
    if(n3>n1 && n3>n2){
      System.out.println("n3 is largest");
    }
  }
}
