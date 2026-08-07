import java.util.Scanner;
public class perfectnum{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n= sc.nextInt();
        int number=n;
        int sum=0;
        for(int i=1;i<n;i++){
            if(number%i==0)
                sum=sum+i;
        }
        if( sum==number){
            System.out.print("it is a perfect number");
        }    
        else
        {
            System.out.print("it isn't a perfect number");
        }
    }

    }


