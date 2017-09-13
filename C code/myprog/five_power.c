#include<stdio.h>
#include<conio.h>
int main()
{
   int num,a=0,i=0,count=0;
    printf("enter the number\n");
   scanf("%d",&num);
   a=num;
   for(i=num; (num % 5 ) == 0 ;num=num/5)
            {
                count++;
            }
            if(num==1)
                {
                    printf("%d,is a perfect squre and the index is %d\n",a,count);
                }
    getch();
   	return 0;
}

