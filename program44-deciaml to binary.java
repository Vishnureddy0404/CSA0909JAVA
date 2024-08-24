import java.util.Scanner;
public class binary{
  public static void main(String[] args){
    Scanner b = new Scanner(System.in);
    
    int dec = b.nextInt();
    String bin = Integer.toBinaryString(dec);
    System.out.print(bin);
    
    String rs = new StringBuilder(bin).reverse().toString();
    System.out.print(rs);
  }
}
