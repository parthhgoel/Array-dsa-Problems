import java.util.*;
public class condition1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a =sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter 1 for addition ,2 for subtraction,3 for multiplication ,4 for divider, and 5 for modulos");
        int c = sc.nextInt();
        switch(c)
        {
            case 1 : System.out.println(a+b);
                      break;
            case 2 : System.out.println(a-b);
                      break;
            case 3 : System.out.println(a*b);
                      break;
            case 4 : System.out.println(a/b);
                      break;
            case 5 : System.out.println(a%b);
                      break;
            default: System.out.println("enter valid input");
        }
    }
    
}

