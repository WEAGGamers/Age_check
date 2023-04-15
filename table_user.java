import java.util.Scanner;
class table_user
{
    public static void main(String[] args) 
    {
        Scanner X = new Scanner(System.in);
        System.out.println("Enter the number");
        int Tab_Num = X.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(Tab_Num + " * " + i + " = " + (Tab_Num*i));
        }
    }
}
