package games;
import java.util.Scanner;
import java.util.Random;
class player1 {
	Scanner in;
	public void run() {
	Random rand = new Random();
	
	System.out.print("enter your choice : \n0.rock\n1.paper\n2.scissor\n");
	in = new Scanner(System.in);
	int n= in.nextInt();
	while(n>2 || n<0) {
		System.out.println("Please enter a valid choice:");
		n= in.nextInt();
	}
    System.out.print("computer chose :");
	int m= rand.nextInt(3);
	if(m==0)
		System.out.println("rock");
	else if(m==1)
		System.out.println("paper");
	else
		System.out.println("Scissor");
	
	Random rand1 = new Random();
	
	if(m==n)
		System.out.println("Tie");
	else if(m==2)
	{
		if(n==1)
			System.out.println("computer wins");
		else 
			System.out.println("you win");
	}
	else if(m==1)
	{
		if(n==0) {
			System.out.println("computer wins");
		}
		else 
			System.out.println("you win");
	}
	else if(m==0)
	{
		if(n==2) {
			System.out.println("computer wins");
		}
		else 
			System.out.println("you win");
	}
	}
	
}
public class rps {
	public static void main(String[] args)
	{
		player1 p=new player1();
		p.run();
	}
}