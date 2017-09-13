#include<stdio.h>
#include<conio.h>
#include<math.h>
int main()
{
    int num,original_num,remainder,n=0,result=0;
    printf("enter the number");
    scanf("%d",&num);
    original_num=num;
    while(original_num!=0)
    {
        original_num=original_num/10;
        n++;
    }
    original_num = 0;
    original_num=num;
    while(original_num!=0)
    {
        remainder=original_num%10;
        result=result+pow(remainder,n);
        original_num=original_num/10;
    }
        printf("the number %d is armstrong number",pow(1,5));

    if(result==num)
    {
        printf("the number %d is armstrong number",num);
    }
    else
    {
        printf("the number %d is not a armstrong number",num);
    }
    getch();
    return 0;
}
