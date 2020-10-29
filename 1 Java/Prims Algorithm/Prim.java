import java.util.*;
public class Prim {
public static void main(String args[]) {
	int cost[][]=new int[10][10];
	int i,j,mincost=0;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number of nodes");
	int n=in.nextInt();
	System.out.println("Enter the cost matrix");
	for(i=1;i<=n;i++){
	for(j=1;j<=n;j++)
	cost[i][j]=in.nextInt();
	}
	System.out.println("The enetred cost matrix is :");
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		System.out.print(cost[i][j]+"\t");
		System.out.println();
	}
	System.out.println("Minimum spanning tree edges and costs are");
	mincost=pr(cost,n,mincost);
	System.out.println("The minimum spanning tree cost is "+mincost);
}
 static int pr(int cost[][],int n,int mincost)
{
	int nearv[]=new int[10], t[][]=new int[10][3],u=0,i,j,k;
	for(i=2;i<=n;i++)
	nearv[i]=1;
	nearv[1]=0;
	for(i=1;i<n;i++)
	{
		int min=999;
		for(j=1;j<=n;j++)
		{
			if(nearv[j]!=0&&cost[j][nearv[j]]<min)
			{
				min=cost[j][nearv[j]];
				u=j;
			}
		}
		t[i][1]=u;
		t[i][2]=nearv[u];
		mincost+=min;
		nearv[u]=0;
		for(k=1;k<=n;k++)
		{
			if(nearv[k]!=0&&cost[k][nearv[k]]>cost[k][u])
				nearv[k]=u;
		}
		System.out.println(i+" Minimum edge is "+t[i][1]+","+ t[i][2]+" and its cost is : "+min);
	}
	return mincost;
}
}

