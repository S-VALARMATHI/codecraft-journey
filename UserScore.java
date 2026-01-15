import java.util.Scanner;
class UserScore{
  public static void main(String[] args){
    int[] score = new int[5];
    Scanner s = new Scanner(System.in);

    score[0] = s.nextInt();
    score[1] = s.nextInt();
    score[2] = s.nextInt();
    score[3] = s.nextInt();
    score[4] = s.nextInt();
    System.out.println(score[4]);
  }
}
