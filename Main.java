import java.util.Scanner;
class Main
{
  public static void  main(String args[])
  {
    //changing specific bit 0 to 1
    //seting a bit to 1
    Scanner sc = new Scanner(System.in);
    System.out.print("enter n and position");
    int n=sc.nextInt();
    int pos=sc.nextInt();

    int bitmask =~(1<<pos);
   System.out.println(bitmask&n);


    

  }
}