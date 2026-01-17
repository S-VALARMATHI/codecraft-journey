class Laptop{
    String name ="";
    String proc ="";
    int ram = 0;
    int price = 0;
    public static void main(String[] args){
      Laptop lap1 = new Laptop();
      lap1.name = "hpp";
      lap1.proc = "15";
      lap1.ram =6;
      lap1.price =40000;
      
      Laptop lap2 = new Laptop();
      lap2.name = "Lenevo";
      lap2.proc = "18";
      lap2.ram=7;
      lap2.price =75000;
      
      Laptop lap3 = new Laptop(); 
      lap3.price=12;
      System.out.println("lap3.price=" +lap3.price);
    }
    
  }
