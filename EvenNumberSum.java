class EvenNumberSum{
  public static void main(String[] args){
    int evencount = 0;
    for(int i=1;i<=10;i=i+1)
    {
      if(i%2==0)
      {
        evencount = evencount + i;
      }
    }
        System.out.println(evencount);

  }
}
