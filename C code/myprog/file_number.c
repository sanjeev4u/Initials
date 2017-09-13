#include<stdio.h>
#include<conio.h>
int main()
{
    FILE *fp;
    char name[25];
    int age;
    printf("Enter your age and name\n");
    scanf("%s%d",name,&age);
    fp = fopen("newsvg.txt","w");
    if(fp==0)
    {
        printf("unable to open file\n");
    }
    else
    {
        fprintf(fp,"%s\t%d",name,age);
        fclose(fp);
    }
}
