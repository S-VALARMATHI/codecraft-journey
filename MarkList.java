import java.util.*;
class MarkList{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int[] mark = new int[5];
    for(int i=0;i<=4;i=i+1)
    {
      mark[i] = s.nextInt();
    }
    System.out.println(mark[0]);
    System.out.println(mark[1]);
    System.out.println(mark[2]);
    System.out.println(mark[3]);
    System.out.println(mark[4]);

  }
}
