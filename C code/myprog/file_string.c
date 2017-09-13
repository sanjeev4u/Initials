#include<stdio.h>
#include<conio.h>
#include<string.h>
int main()
{
    FILE *file_pointer;
    char str[50];
    file_pointer = fopen("creatFile.txt","w");
    if(file_pointer == 0)
        printf("File not created\n");
    else
    {
        printf("File Created Please enter the content");
        gets(str);
        fputs(str,file_pointer);
    }
    fclose(file_pointer);
    getch();
    return 0;
}
