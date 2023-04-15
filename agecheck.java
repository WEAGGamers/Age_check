import java.util.Scanner;
public static void main(String args[])
{
  System.out.println("Enter your age : ");
    int age = new Scanner(System.in);
    if(age<18)
    {
        System.out.println("Sorry You are not eligible for voting");
        }
    else
    {
        System.out.println("You are Eligible for voting");
    }


}
