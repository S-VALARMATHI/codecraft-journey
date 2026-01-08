import java.util.*;
class EvenNumber{
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    for(int i=a;i<=b;i=i+1){
      if(i%2==0){
        System.out.println("Even Number:" + i);
      }
    }
  }
}
