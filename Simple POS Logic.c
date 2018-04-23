//Project is to make a file that will accept 3 item inputs, calculate subtotal, 
//tax, and total with tax

//Begin

#include <stdio.h>
#include <stdlib.h>

main() {

	//Declare all variables for program

	double item1, item2, item3, taxRate = 0.075, subtotal, taxAmount, total;

	//Allow users to enter data for cost of items

	printf("Enter double value for item1: ");
	scanf("%lf", &item1);
	printf("item1 cost is %$%.2lf \n\n", item1);

	printf("Enter double value for item2: ");
	scanf("%lf", &item2);
	printf("item2 cost is %$%.2lf \n\n", item2);

	printf("Enter double value for item3: ");
	scanf("%lf", &item3);
	printf("item3 cost is %$%.2lf \n\n", item3);

	//Calculate Subtotal, Tax Due, and Final Total

	subtotal = (item1 + item2 + item3);
	printf("Subtotal: %$%.2lf \n", subtotal);
	taxAmount = (subtotal * taxRate);
	printf("Tax due: %$%.2lf \n\n", taxAmount);
	total = (subtotal + taxAmount);
	printf("Total due: %$%.2lf \n\n", total);

	printf("Thank you for supporting A Gift For Teaching! \n\n");

	system("pause");
}