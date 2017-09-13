#include<stdio.h>
#include<conio.h>
#include<string.h>
int main(int argc,char *argv[])
{
    FILE *file_ptr;
    char ch;
    if(argc != 2)
        printf("Undefined arguments\n");
    else
    {
        scanf("%s",argv[1]);
        file_ptr = fopen(argv[1],"r");
        ch = getc(file_ptr);
        while(ch != EOF)
        {
            printf("%c",ch);
            ch=getc(file_ptr);
        }
        fclose(file_ptr);
        getch();
        return 0;
    }

}
