#include<stdio.h>
#include<conio.h>
#include<string.h>
int main()
{
    FILE *file_pointer;

    char ch;
    file_pointer = fopen("sanjeev.txt","r");
    if(file_pointer == 0)
        printf("File not found\n");
    else
    {
        printf("File found\n");
        while(!feof(file_pointer))
        {
            ch=fgetc(file_pointer);
            printf("%c",ch);
        }
        fclose(file_pointer);
    }
    getch();
    return 0;
}
