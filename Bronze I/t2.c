#include <stdio.h>

void main()
{
	int arr[1001];

	int num = 1;
	int num1,num2;
	int sum =0;

	for(int i=1;i<=1000;i++)
	{
		for(int j = 1; j <= i ; j++)
		{
			arr[num]=i;
			if(num>1000)
			{
				break;
			}
			num++;
		}
		
	}

	printf("�Է� : ");
	scanf("%d %d",&num1,&num2);

	for(int i = num1; i <=num2; i++)
	{
		sum += arr[i];
	}

	printf("%d",sum);
}
	
		
