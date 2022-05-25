#include <stdio.h>
#include <stdlib.h>
#include <strings.h>
#include <locale.h>

struct contacts
{
    int code;
    char name[50];
    char phone[15];
    char email[50];
};

int main()
{
    int op, counter = 1;
    int i;
    struct contacts person[5];

    do
    {
        printf("Make a choose: 1-Register, 2-Search, 0-Finish: \n\n");
        printf("Write your choice: \n\n ");
        scanf("%d", &op);
        fflush(stdin);

        switch (op)
        {
        case 1:
            if (counter <= 5)
            {
                printf("\n\n Register \n\n");
                printf("\tCode: %d", counter);
                fflush(stdin);

                printf("\n\t Write your name: ");
                fgets(person[counter].name, 50, stdin);
                fflush(stdin);

                printf("\n\t Write your phone: ");
                fgets(person[counter].phone, 15, stdin);
                fflush(stdin);

                printf("\n\t Write your email: ");
                fgets(person[counter].email, 50, stdin);
                fflush(stdin);

                printf("\n\n Successful Registration \n\n");
                counter++;
                system("pause");
                system("cls");
            }
            else
            {
                printf("\n\n Schedule is fully booked  \n\n");
                system("pause");
                system("cls");
            }
            break;
        case 2:
            if (counter == 1)
            {
                printf("\n\t Empty list  \n\n");
                system("pause");
                system("cls");
            }
            else
            {
                system("cls");
                printf("\n\n Search results \n\n");
                for (i = 1; i < counter; i++)
                {
                    printf("Code: %d\n", i);
                    printf("Name: %s", person[i].name);
                    printf("Phone: %s", person[i].phone);
                    printf("E-mail: %s\n", person[i].email);
                }
                system("pause");
                system("cls");
            }
            break;
        case 0:
            printf("\n Program finalized \n\n");
            break;
        default:
            printf("\n\n Error: Invalid option \n\n");
            system("pause");
            system("cls");
        }
    } while (op != 0);
    return (0);
}