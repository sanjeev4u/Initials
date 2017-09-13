#include<stdio.h>
#include<conio.h>
#include<string.h>
int main()
{
    FILE *file_pointer;
    char ch;
    file_pointer=fopen("file_self_content.c","r");
    if(file_pointer == 0)
    {
        printf("Unable to print the file\n");
    }
    else
    {
        ch=getc(file_pointer);
        while(ch != EOF)
