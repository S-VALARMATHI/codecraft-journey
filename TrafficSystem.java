import java.util.Scanner;
class TrafficSystem {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String color = s.nextLine();
    if(color.equals("Red")){
      System.out.println("Stop");
    }
    else if(color.equals("Yellow")){
      System.out.println("Get Ready");
    }
    else if(color.equals("Green")){
      System.out.println("Go");
    }
  }
}
