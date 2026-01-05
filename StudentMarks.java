import java.util.Scanner;
class StudentMarks{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    int d = s.nextInt();
    int e = s.nextInt();
    int totalmark = a+b+c+d+e;
    int avg = totalmark/5;
    if(avg<35){
      System.out.println("Additional class is required");
    }
    else {
      System.out.println("You are good to do");
    }
    
  }
}
