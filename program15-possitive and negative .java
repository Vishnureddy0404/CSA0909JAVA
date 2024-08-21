import java.util.Scanner;
public class p{
  public static void main(String[] args){
    Scanner ne = new Scanner(System.in);
    
    double n = ne.nextDouble();
    
    if(n >= 0){
      System.out.println("possitive");
    }
    else{
      System.out.println("negative");
    }
  }
}
