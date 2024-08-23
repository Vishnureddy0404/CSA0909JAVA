import java.util.Scanner;
public class validation{
  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    
    String n = a.nextLine();
    String b = a.nextLine();
    
    if(n.equals(b)){
      System.out.println("valid");
    }
    else{
      System.out.println("invalid");
    }
  }
}
