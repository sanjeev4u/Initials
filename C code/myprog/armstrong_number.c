#include<stdio.h>
#include<conio.h>
int main()
{
    int arm_num,i,arm_alias=0,sum=0,dig=0,count=0,mul_var=1;
    printf("Enter the number you wanna  check\n");
    scanf("%d",&arm_num);
    arm_alias = arm_num;
    while(arm_num > 0)
    {
        arm_num=arm_num / 10;
        count++;
    }
    arm_num=0;
    arm_num=arm_alias;
    while(arm_num>0)
    {
        dig = arm_num % 10;
        for(i=1; i<=count; i++)
        {
            mul_var=mul_var * dig;
        }
        sum = sum + mul_var;
        arm_num = arm_num/10;
        mul_var=1;
    }
    if(arm_alias == sum)
        printf("%d   is armstrong number\n",arm_alias);
    else
        printf("%d   is not armstrong number",arm_alias);
    getch();
    return 0;
}
