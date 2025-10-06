#include <stdio.h>
#include <stdlib.h>

void inputcase(int n , int* arr){
   
   
    printf("Enter the elements of an array: ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
}

void outputcase(int n, int* arr){
    printf("You have entered the following elements: \n");
    for(int i=0;i<n;i++){
        printf("%d\n",arr[i]);
}
}

int main(){
    int option,n=0;
    int arr[100];
    
    
    while(1){
    printf("\n----Array Operations------\n");
    printf("1.Input\n2.Output\nSelect 1 or 2\n(Click any other key to exit):  ");
    scanf("%d",&option);
    switch(option){
        case 1: {
             printf("Enter the size of a array: "); // Now I understood the thing about the main use of a pointer
             scanf("%d",&n);
              if(n==0){
        printf("Array is empty, please input the elements first\n");
       
       
    }   
            inputcase(n,arr);
            break;
        }

        case 2:{
            outputcase(n,arr);
            break;
        }
        default:exit(1);
    }
    }
    return 0;
}
