import java.util.Scanner;
class main{
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    String name = s.nextLine();
    double score = s.nextDouble();
    s.nextLine();
    String department = s.nextLine();
    System.out.println("My name is "+ name);
    System.out.println("My score is "+ score/10+"/10");
    System.out.println("My department is "+ department);
  }
}
