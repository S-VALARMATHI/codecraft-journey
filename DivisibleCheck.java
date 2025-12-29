import java.util.Scanner;
class divisibleCheck{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    if(a%3==0 && a%5==0){
      System.out.println("number is divisible by 3 and 5");
    }
    else{
      System.out.println("number is not divisible by 3 and 5");
    }
  }
}
