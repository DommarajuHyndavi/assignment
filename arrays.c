#include<stdio.h>
void main()
{
	int a[100],n,i,j,temp,b;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				temp = a[i];
				a[i] = a[j];
				a[j] =temp;
			}
		}
	}
	b = a[n-1]*a[n-2];
	printf("%d",b);
}