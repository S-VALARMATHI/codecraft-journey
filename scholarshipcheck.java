import java.util.Scanner;
class Scholarshipcheck{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    if( a>7000 ){
      System.out.println("Scholarship is available");
    }
    else{
      System.out.println("Not eligible for scholarship");
    }
  }
}
