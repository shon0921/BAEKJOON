#include <stdio.h>

void main()
{
	int arr[5];
	int a;
	int i;
	int b=1;
	for(i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}

	while(b==1)
	{
		for(i=0;i<4;i++)
		{
			if(arr[i]>arr[i+1])
			{
				a=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=a;
				printf("%d %d %d %d %d \n",arr[0],arr[1],arr[2],arr[3],arr[4]);
			}
		}
		if(arr[0]<arr[1]&&arr[1]<arr[2]&&arr[2]<arr[3]&&arr[3]<arr[4])
		{

			break;
		}
	}

		
}
				
