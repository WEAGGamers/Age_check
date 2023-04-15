import java.util.Scanner;
class agecheck
{
public static void main(String args[])
{
  Scanner x = new Scanner(System.in);
  System.out.println("Enter your age : ");
    int age = x.nextInt();
    if(age<18)
    {
        System.out.println("Sorry You are not eligible for voting");
        }
    else
    {
        System.out.println("You are Eligible for voting");
    }


}
}
