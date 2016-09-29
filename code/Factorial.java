import java.io.*;

public class Factorial{
    static void f(int n)
    {
        if (n == 0)
        {
            System.out.printf("move 1 step\n");
            System.out.printf("rotate 1 degree\n");
        }
        else
        {
            for(int i = 0; i < n; i++)
            {
                f(n-1);
            }
        }
    }
    public static void main(String args[])
    {
        f(3);
    }
}
