package RAJU;

import org.checkerframework.checker.units.qual.s;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  int a[] = new int [5];
a[0]=2;
a[1]=6;
a[2]=1;
a[3]=9;
a[4]=12;
int b[]= {1,4,3,7,5,8};
for(int i=0;i<b.length;i++)
{
	System.out.println(b[i]);
}
	}

}
		int a[][] = new int [2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=7;
		System.out.println(a[1][0]);
	}
}*/
		int b[][]= {{2,4,5},{3,4,7},{5,2,1}};
		System.out.println(b[2][1]);


/*
int a[][] = new int [2][3];
a[0][0]=2;
a[0][1]=4;
a[0][2]=5;
a[1][0]=3;
a[1][1]=4;
a[1][2]=7;
for(int i=0;i<2;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.println(a[i][j]);
	}
}
*/
	

	/*	int abc[][]= {{2,4,5},{3,0,7},{1,2,9}};
		int max=abc[0] [0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]>max)
				{
					max=abc[i][j];
				}
			}
		} 
		
		int abc[][]= {{2,4,5},{3,0,7},{1,5,9}};
		int min=abc[0] [0];
		int mincolumn=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
					mincolumn=j;
				}
			}
		}
		int max=abc[0][mincolumn];
		int k=0;
		while(k<3)
		{
			if(abc[k][mincolumn]>max)
			{
				max=abc[k][mincolumn];
			}
			k++;
		}
		System.out.println(max);*/
			
		

/*int arr[]= {2,4,5,6,8,7,3};

for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]+arr[j]==10)
		{
		System.out.println(arr[i]+","+arr[j]);	
		}
	}
}*/
	}
}

