import java.util.Scanner;
class StudentScore{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
      int score = s.nextInt();
      if(score>35 && score<60){
        System.out.println("I can get vedio game");
      }
      else if(score>60 && score<90){
        System.out.println("I can get Iphone");
      }
      else if(score>90){
        System.out.println("Macbook pro");
      }
  }
}
