public class loop{
  public static void main(String[] args) {
    int i,j;
    for(i = 1; i<=3; i++){
      for(j = 1; j<=i; j++){
        System.out.print("I");
      }
      System.out.println();
    }
    
    for(i = 3-1 ;i >= 1; i--){
      for(j= 1; j<=i ; j++){
        System.out.print("I");
      }
      System.out.println();
    }
  }
}
