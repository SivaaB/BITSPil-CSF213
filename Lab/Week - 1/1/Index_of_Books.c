#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define MAX_BOOKS 1

struct Books {
    char name[100];
    char writer[50];
    int ed;
    float cost;
    int copies;

};

void main() {
    int count=0;
    int menu_choice;
    struct Books b[MAX_BOOKS];

    while(1) {

        int num = count;
        printf("Menu:\n  1. View Books\n  2. Add Book\n  3. Search Book\n  4. Edit Book Details\n  5. Delete Book\n  6. Quit \n");
        printf("Please enter the desired option: ");
        scanf("%d", &menu_choice);

        if(menu_choice==1) { // 1. View Books
            for (int j=0; j<count; j++) {
                printf("\nThe book with serial number %d is %s by %s \n", j+1, b[j].name, b[j].writer);

            }
            printf("\n");
        }

        else if(menu_choice==2) { // 2. Add Book

            if (count >= MAX_BOOKS) {
                printf("\nMax number of books reached. Try deleting some first.\n\n");
                continue;
            }

            printf("\nThe Serial Number of this book is %d\n", count+1);

            printf("Please Enter the title of the book: ");
            getchar();
            gets(b[count].name);

            printf("Please Enter the author of the book: ");
            gets(b[count].writer);

            printf("Please Enter the edition of the book: ");
            scanf("%d", &b[count].ed);

            printf("Please Enter the price of the book: ");
            scanf("%f", &b[count].cost);

            printf("Please Enter the number of copies of the book: ");
            scanf("%d", &b[count].copies);
            printf("\n");

            count++;

        }

        else if(menu_choice==3) { // 3. Search Book
            int index=1;

            printf("\nPlease enter the Serial Number of the book to search for: ");
            scanf("%d", &index);
            index--;

            if(index>=0 && index<count) {
                printf("The title of the book: %s\n", b[index].name);
                printf("The author of the book: %s\n", b[index].writer);
                printf("The edition of the book: %d\n", b[index].ed);
                printf("The price of the book: %.2f\n", b[index].cost);
                printf("The number of copies of the book: %d\n\n", b[index].copies);
            }

            else {
                printf("\nBook doesn't Exist!\n\n");
            }

        }

        else if(menu_choice==4) { // 4. Edit Book Details
            int index=1;

            printf("\nPlease enter the Serial Number of the book to edit: ");
            scanf("%d", &index); getchar();
            printf("\n");
            index = index-1;

            if(index>=0 && index<count) {
                printf("Please Enter the new title of the book: ");

                gets(b[index].name);

                printf("Please Enter the new author of the book: ");
                gets(b[index].writer);

                printf("Please Enter the new edition of the book: ");
                scanf("%d", &b[index].ed);

                printf("Please Enter the new price of the book: ");
                scanf("%f", &b[index].cost);

                printf("Please Enter the updated number of copies of the book: ");
                scanf("%d", &b[index].copies);
                printf("\n");

            }

            else {
                printf("Book doesn't Exist!\n\n");
            }

        }

        else if(menu_choice==5) { // 5. Delete Book
            int index=0;

            printf("\nPlease enter the Serial Number of the book to delete: ");
            scanf("%d", &index);
            printf("\n");
            index--;

            if(index>=0 && index<count) {
                for(int j=index+1; j<count; j++) {
                    b[j-1]=b[j];

                }

                count--;

                printf("Done!\n\n");

            }
            else {
                printf("Book doesn't Exist!\n\n");
            }

        }
        else if(menu_choice==6) { // 6. Quit
            break;

        }
        else {
            printf("\nPlease enter a valid option\n");

        }
    }
}
