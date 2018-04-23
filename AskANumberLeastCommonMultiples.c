#include <stdio.h>
#include <stdlib.h>

//Calculate all multiples of the first number that are less than or equal to the product of the two numbers entered
int multipleTwoEntry(int firstNumber, int secondNumber) {
	int result;
	int maxSize, countOne = 0, countTwo = 0, firstNumberMultiple = 0, secondNumberMultiple = 1;

	while (firstNumberMultiple != secondNumberMultiple) {
		if (firstNumberMultiple < (firstNumber*secondNumber) && firstNumberMultiple != secondNumberMultiple) {
			firstNumberMultiple = firstNumber * (countOne + 1);
			countOne++;
		}
		else if (firstNumberMultiple = (firstNumber*secondNumber) && firstNumberMultiple != secondNumberMultiple) {
			firstNumberMultiple = 0;
			countOne = 0;
			secondNumberMultiple = secondNumber * (countTwo + 1);
			countTwo++;
		}
	}
	result = firstNumberMultiple;
	return result;
}

main() {
	int yourNumber, yourSecondNumber, result;

	printf("Please enter a number: ");
	scanf("%i", &yourNumber);
	printf("Please enter a second number: ");
	scanf("%i", &yourSecondNumber);

	//Call the output for the multipleTwoEntry process
	result = multipleTwoEntry(yourNumber, yourSecondNumber);

	printf("The Least common multiple of %i and %i is %i \n", yourNumber, yourSecondNumber, result);
	system("pause");
}
