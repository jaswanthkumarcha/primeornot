import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a = obj.nextInt();
        boolean flag = false;
        for(int i=2;i<=a/2;i++)
        {
            if(a%i==0){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("it is a prime number");
        }
        else {
            System.out.println("it is not a prime number");
        }

    }
}