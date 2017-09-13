#include <stdio.h>
#include<conio.h>
int main()
{
    int spl_num,fact=1,d=0,sum=0,i;
    printf("Enter the number u wanna check\n");
    scanf("%d",&spl_num);
    for(i=spl_num;i>0;i=i/10)
    {
        d = i % 10;
        while(d > 0)
        {
            fact=fact*d;
            d--;
        }
        sum=sum+fact;
        fact=1;
    }
    if(spl_num == sum)
        printf("\n%d  Number is Special Number\n",spl_num);
    else
        printf("\n%d  Number is not Special Number\n",spl_num);
    getch();
	return 0;
}
