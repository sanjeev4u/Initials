#include<stdio.h>
#include<conio.h>
#include<string.h>
int main()
{
    FILE *fpointer;
    char data[25]="Sanju is best";
    int length=strlen(data);
    int counter;
    char str = 's';
    fpointer = fopen("Sanjeev.txt","w");
    if(fpointer != 0)
    {
        printf("File created");
        for(counter=0; counter < length; counter++)
        {
            printf("Writing the character %c \n",data[counter]);
            fputc(data[counter],fpointer);
        }
        fputc(str,filepointer);
    }
    else
        printf("unable to reate");
    fclose(fpointer);
    return 0;
}
