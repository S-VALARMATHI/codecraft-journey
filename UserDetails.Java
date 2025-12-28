import java.util.Scanner;
class hello{
    public static void main(String[] b){
        Scanner s = new Scanner(System.in);
        String name= s.nextLine();
        int age= s.nextInt();
        s.nextLine();
        String address= s.nextLine();
        System.out.println("My name is "+ name);
        System.out.println("My age is "+ age);
        System.out.println("My address is "+ address);
        
    }
}
