import java.util.Scanner;
public class vote{
  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    
    int l = 18;
    int n = a.nextInt();
    int b = l - n;
    
    if(l == n){
      System.out.println("eligible for vote");
    }
    else{
      System.out.println("you need"+" "+ b +" " +"more years for eligibility");
    }
  }
}
