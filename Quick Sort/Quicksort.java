import java.util.Random;
import java.util.Scanner;
public class Quicksort
{
	public static void main(String args[])
	{
		int a[]=new int[100000];
		Scanner s=new Scanner(System.in);
		long st,e;
		System.out.println("Enter number of elemens to sort ");
		int n=s.nextInt();
		Random rand=new Random();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		a[i]=rand.nextInt(100);
		System.out.println("Arary elements to be sorted");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		a[n]=99;
		st=System.nanoTime();
		quicksort(a,0,n-1);
		e=System.nanoTime();
		System.out.println("Sorted elements are");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		System.out.println("The time taken is "+(e-st)+"ns");
	}
	static void quicksort(int a[],int p,int q){
		int j;
		if(p<q){
			j=partition(a,p,q);
			quicksort(a,p,j-1);
			quicksort(a,j+1,q);
		}
		
	}
	static int partition(int a[],int p,int q){
		int i,j;
		int r=a[p];
		i=p;
		j=q;
		while(i<=j){
			while(a[i]<=r)
				i++;
			while(a[j]>r)
				j--;
			if(i<j)
			swap(a,i,j);
		}
		a[p]=a[j];
		a[j]=r;
		return j;
	}
	static void swap(int a[],int i,int j){
		int p;
		p=a[i];
		a[i]=a[j];
		a[j]=p;
	}
		
	
}


 
