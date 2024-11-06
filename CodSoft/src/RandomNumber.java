import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        Random random=new Random();
        int a=random.nextInt(100),b=1,s=0;
        System.out.println("Welcome to the Number Game  \nEnjoy the Experience \nRandom Number Generates From 0 to 99");
        while(b<=5)
        {
            System.out.print("Enter The Number:    ");
            int c=k.nextInt();
            if(c>a)
            {
                System.out.println("Large value. Think less than this Number!!");
                s++;
            }
            else if(c<a)
            {
                System.out.println("Small value. Think Greater than this Number!!");
                s++;
            }
            else
            {
                System.out.println("Succesful • Yeah!! It is Right Answer");
                break;
            }
            b++;
            System.out.println("You only have"+ (6-b) +"chances left");
        }
        int f=5-s;

        if(s==5)
        {
            System.out.println("Sorry for the inconvenience • better luck next time!!");
        }
        else
        {
            System.out.println("Congrats!! You Have Won The Game!!  \nYou are an Cracker  \nPlay Again!!");
            System.out.println("Your Score is "+f+"/5");
        }
        System.out.println("The Random Number is "+a);
    }
}
