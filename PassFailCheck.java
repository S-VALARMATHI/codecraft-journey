import java.util.Scanner;
class hello{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int mark = s.nextInt();
    if(mark>34){
      System.out.println("Pass");
    }
    else{
      System.out.println("Fail");
    }
  }
}
