class CountEvenOdd
 {
   public static void main(String[]args)
    {
      int a=2799;
      int even=0;
      int odd=0;
   
      do
      {
        int r=0;r=a%10;
        if(r%2==0)
          {
           even++;
          }
        else
          {
           odd++;
          }
        a=a/10;
      }while(a>0);
       
      System.out.println("odd number= "+odd+" even number= "+even);
    }
 }