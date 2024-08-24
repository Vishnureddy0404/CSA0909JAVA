public class factors{
  public static void main(String[] args){
    int n = 6;
    int count = 0;
    for(int i = 1; i <= n; i++){
      if( n % i == 0){
        System.out.print(i+" ");
        count++;
      }
    }
    System.out.println(count);
  }
}
