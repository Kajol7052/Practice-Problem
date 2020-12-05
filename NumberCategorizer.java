import java.util.Scanner;
public class NumberCategorizer {

	public static void printOdd(int n)
	{
			int odd[] = new int[n];
			int count=0;
			int sum=0;
			for(int i=1;i<=n;i++)
			{
				if(isOdd(i))
				{
					odd[count++] = i;
					sum+=i;
				}
			}
			for(int i=0;i<count;i++)
			{
				System.out.print(odd[i]+" ");
			}
			System.out.println();
			System.out.println("Sum of all odd numbers "+sum);

	}
	public static void printEven(int n)
	{
		int even[] = new int[n];
		int count=0;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(isEven(i))
			{
				even[count++] = i;
				sum+=i;
			}
		}
		for(int i=0;i<count;i++)
		{
			System.out.print(even[i]+" ");
		}
		System.out.println();
		System.out.println("Sum of all even numbers "+sum);
	}
	public static void printPrime(int n)
	{
		int prime[] = new int[n];
		int count=0;
		int sum=0;
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
			{
				prime[count++] = i;
				sum+=i;
			}
		}
		for(int i=0;i<count;i++)
		{
			System.out.print(prime[i]+" ");
		}
		System.out.println();
		System.out.println("Sum of all prime numbers "+sum);
	}
	public static Boolean isOdd(int a)
	{
		if(a%2==0)
			return false;
		return true;
	}
	public static Boolean isEven(int a)
	{
		if(a%2==1)
			return false;
		return true;
	}
	public static Boolean isPrime(int a)
	{
		for(int i=2;i<a;i++)
		{
			if(a%i == 0)
				return false;
		}
		return true;
	}
	public static void main(String args[])
	{
		int n;
		int ch;
		Scanner in = new Scanner(System.in);
		while(true)
		{
			n=-1;
			System.out.println("Enter your choice 1. Odd 2. Even 3. Prime");
			ch=in.nextInt();
			if(ch==1||ch==2||ch==3)
			{
			System.out.println("Enter the number");
			n=in.nextInt();
			}
			switch(ch)
			{
			case 1: printOdd(n);
					break;
			case 2: printEven(n);
					break;
			case 3: printPrime(n);
					break;
			default:System.out.println("Invalid Choice");
					break;
			}
		}
	}
}
