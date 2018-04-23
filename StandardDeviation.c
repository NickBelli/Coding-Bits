#include <stdio.h>
#include <stdlib.h>
#include <math.h>

//Nick Belli
#define SIZE 100000

int sum(int a[], int size) {
	int i, result = 0;

	for (i = 0; i < size; i++) {
		result += a[i];
	}

	return result;
}

double calcStandardDeviation(int a[], int mean, int size) {
	int i;
	double result = 0;

	for (i = 0; i < size; i++) {
		result += (a[i] - mean)*(a[i] - mean);
	}

	result /= size;

	return sqrt(result);
}

/*BR Declare Array of ints that has 100 elements
  Create a loop that fills the array with random numbers from 1-1000
  Create a function called sum that takes the array of ints and the size of the array, and return the sum of the elements in the array
  Calculate the mean of the elements in the array
  Variance function that returns the sum of the array elements - mean in an absolute value*/

main() {
	int randomArray[SIZE] = { 0 };
	int i, sumOfValues, meanValue;
	double standardDeviation;
	
	srand(time(NULL));

	for (i = 0; i < SIZE; i++) {
		randomArray[i] = rand() % 1000 + 1;
	}

	sumOfValues = sum(randomArray, SIZE);
	meanValue = sumOfValues / SIZE;
	standardDeviation = calcStandardDeviation(randomArray, meanValue, SIZE);


	printf("The sum of the array is %i \n", sumOfValues);
	printf("The mean value is %i \n", meanValue);
	printf("The Standard Deviation is %lf \n", standardDeviation);
	system("pause");
}