class OddNumberSum{
  public static void main(String[] args){
    int oddcount = 0;
    for(int i=1;i<=10;i=i+1)
    {
      if(i%2!=0)
      {
        oddcount = oddcount + i;
      }
    }
        System.out.println(oddcount);

  }
}
