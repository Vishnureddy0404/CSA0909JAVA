import java.util.Scanner;
class abc
 {
 abc(int x,int y)
 {
 System.out.print(x+","+y);
 }
 }
 public class ak extends abc
 {
 ak(int x,int y)
 {
 super(x,y);
 }
 public static void main(String[] args)
 {
 Scanner input=new Scanner(System.in);
 int a1=input.nextInt();
 int b1=input.nextInt();
 ak obj=new ak(a1,b1);
 }
 }
