/*Intro to Programming Assignment 3
Written by: Nick Belli 09/20/2016*/

//Begin
#include <stdio.h>
#include <stdlib.h>

main() {

	//Declare all variables for program

	double test1Grade, test2Grade, test3Grade, test4Grade, gradeTotal, gradeAverage;

	//Allow user to enter Grades for Tests and confirm entries

	printf("Enter Grade for Test 1: ");
	scanf("%lf", &test1Grade);
	printf("Test 1 Grade is %.2lf \n\n", test1Grade);

	printf("Enter Grade for Test 2: ");
	scanf("%lf", &test2Grade);
	printf("Test 2 Grade is %.2lf \n\n", test2Grade);

	printf("Enter Grade for Test 3: ");
	scanf("%lf", &test3Grade);
	printf("Test 3 Grade is %.2lf \n\n", test3Grade);

	printf("Enter Grade for Test 4: ");
	scanf("%lf", &test4Grade);
	printf("Test 4 Grade is %.2lf \n\n", test4Grade);

	//Calculate Total Score and Average

	gradeTotal = (test1Grade + test2Grade + test3Grade + test4Grade);
	printf("Total to Average is %.2lf \n\n", gradeTotal);
	gradeAverage = (gradeTotal / 4);
	printf("Grade Average is %.2lf \n\n", gradeAverage);

	//Set Average to Letter value

	if (gradeAverage < 60.00) {
		printf("Letter Grade: F \n\n");
	}
	else {
		if (gradeAverage < 70.00) {
			printf("Letter Grade: D \n\n");
		}
		else {
			if (gradeAverage < 80.00) {
				printf("Letter Grade: C \n\n");
			}
			else {
				if (gradeAverage < 90.00) {
					printf("Letter Grade: B \n\n");
				}
				else {
					printf("Letter Grade: A \n\n");
				}
			}
		}
	}

	system("pause");

}


//Alternate Approach to Average to Letter transfer

//if (gradeAverage >= 90.0) {
//		printf("Letter Grade: A \n\n");
//	}
//if (gradeAverage < 90.0 && gradeAverage >= 80.0) {
//		printf("Letter Grade: B \n\n");
//	}
//if (gradeAverage < 80.0 && gradeAverage >= 70.0) {
//		printf("Letter Grade: C \n\n");
//	}
//if (gradeAverage < 70.0 && gradeAverage >= 60.0) {
//	printf("Letter Grade: D \n\n");
//}
//else {
//	printf("Letter Grade: F \n\n");
//}	

