#include <stdio.h>
#include<conio.h>
int main()
{
    int spl_num,fact,d=0,sum,i;
    for(spl_num=1;spl_num<=200;spl_num++)
    {
        fact=1;
        sum=0;
        d=0;
    for(i=spl_num;i>0;i=i/10)
    {
        d = i % 10;
        while(d > 0)
        {
            fact=fact*d;
            d--;
        }
        d=0;
        sum=sum+fact;
        fact=1;
    }
    if(spl_num == sum)
        printf("%d  Number is Special\n",spl_num);
    }
    getch();
	return 0;
}
