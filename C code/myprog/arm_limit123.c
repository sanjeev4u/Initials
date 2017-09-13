#include<stdio.h>
#include<conio.h>
int main()
{
    int i,j,arm_alias=0,sum=0,dig=0,count=0,mul_var=1;
    for(j=10 ; j<=10000 ; j++)
    {
        arm_alias = j;
        while(j > 0)
        {
            j = j / 10;
            count++;
        }
        j=0;
        j=arm_alias;
        while(j>0)
        {
            dig = j % 10;
            for(i=1 ; i<=count ; i++)
            {
                mul_var = mul_var * dig;
            }
            sum = sum + mul_var;
            j = j/10;
            mul_var=1;
        }
        if(arm_alias == sum)
            printf("%d   is armstrong number\n",arm_alias);
       // else
         //   printf("\n%d   is not armstrong number\n",arm_alias);
        j=arm_alias;
        arm_alias = 0;
        sum = 0;
        count = 0;
        mul_var = 1;
    }
        getch();
        return 0;
}
