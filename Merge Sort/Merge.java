import java.util.Random;
import java.util.Scanner;
public class Merge
{
	public static void main(String args[])
	{
		int a[]=new int[100000];
		Scanner s=new Scanner(System.in);
		long st,e;
		System.out.println("Enter np. of elemens to sort ");
		int n=s.nextInt();
		Random rand=new Random();
		for(int i=0;i<n;i++)
			a[i]=rand.nextInt(100);
		System.out.println("Arary elements to be sorted");
		for(int i=0;i<n;i++)
			System.out.println(a[i]+" ");
		st=System.nanoTime();
		mergesorttt(a,0,n-1);
		e=System.nanoTime();
		System.out.println("Sorted elements are");
		for(int i=0;i<n;i++)
			System.out.println(a[i]+" ");
		System.out.println("The time taken is "+(e-st));
	}


static void mergesorttt(int a[],int low,int high)
{
	int mid;
	if(low<high){
		mid=(low+high)/2;
		mergesorttt(a,low,mid);
		mergesorttt(a,mid+1,high);
		merge(a,low,mid,high);
		
	}
}
static void merge(int a[],int low,int mid,int high)
{
	int i,j,h,k,b[]=new int[100000];
	h=low;i=low;j=mid+1;
	while((h<=mid)&&(j<=high))
	{
		if(a[h]<a[j])
		{
			b[i]=a[h];
			h++;
		}
		else
		{
			b[i]=a[j];
			j++;
		}
		i++;
	}
		if(h>mid)
		{
			for(k=j;k<=high;k++){
				b[i]=a[k];
				i++;
		}
		}
		else
		{
				for(k=h;k<=mid;k++){
					b[i]=a[k];
					i++;
				}
		}
			for(k=low;k<=high;k++)
				a[k]=b[k];
		
	}
}


	

	


