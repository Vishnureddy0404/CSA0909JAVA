import java.util.Scanner;
class Bank_Account
{
 String name,type;
 int acc_num;
 double bal;
 Bank_Account(String n,int a,String t,double b)
 {
 name=n;
 acc_num=a;
 type=t;
 bal=b;
 }
 void deposit(double d)
 {
 if(d>0)
 bal=bal+d;
 else
 System.out.println("Invalid amt");
 }
 void withdraw(double w)
 {
 if(w>0 && w<=bal)
 bal=bal-w;
 else
 System.out.println("Invalid amt");
 }
 void display()
 {
 System.out.println("Name: "+name);
 System.out.println("balance: "+bal);
 }
}
public class ak
{
 public static void main(String[] args)
 {
 Scanner input=new Scanner(System.in);
 String n,t;
 int a;
 double b;
 System.out.print("Enter the name: ");
 n=input.next();
 System.out.print("Enter Account number: ");
 a=input.nextInt();
 System.out.print("Enter the type of account: ");
 t= input.next();
 System.out.print("Enter the balance amt: ");
 b=input.nextInt();
 Bank_Account bank=new Bank_Account(n,a,t,b);
 bank.display();
 }
}
