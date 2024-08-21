public class desire{
  public static void main(String[] args){
    int i,j;
    int n = 1;
    for(i = 0; i <= 3; i++){
      for(j= 0; j <= i; j++){
        System.out.print((n * n)+ " ");
        n++;
      }
      System.out.println();
    }
  }
}
