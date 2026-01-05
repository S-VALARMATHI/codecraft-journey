import java.util.Scanner;
class ScoreEvaluator{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int score = s.nextInt();
    if(score<50)
    {
      System.out.println("You need to improve");
    }
    else if(score==50 || score>50 && score<70){
      System.out.println("Good job");
    }
    else if(score>70){
      System.out.println("Excellent performance");
    }
    
  }
}
