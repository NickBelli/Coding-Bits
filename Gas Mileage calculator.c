
//Nick Belli
#include <stdio.h>
#include <stdlib.h>

//Calculate Gas Mileage
//Ask user how much gas was purchased in gallons (8.3) (-1 to quit)
//Ask user how many miles they drove (int)
//Print mileage in mpg

main() {
	int miles, totalMiles = 0;
	double gallons, mpg, totalGas = 0, averageMpg;

	printf("How many gallons were purchased? (-1 to quit) \n");
	scanf("%lf", &gallons);
	printf("You purchased %.2lf gallons. \n", gallons);

	while (gallons != -1) {
		printf("How many miles did you drive? \n");
		scanf("%i", &miles);
		printf("You drove %i miles. \n", miles);
		mpg = miles / gallons;
		totalGas += gallons;
		totalMiles += miles;
		printf("For this tank you got %.2lf Miles per Gallon. Congrats! \n\n", mpg);
		
		printf("How many gallons were purchased? (-1 to quit) \n");
		scanf("%lf", &gallons);
		printf("You purchased %.2lf gallons. \n", gallons);
	}
	averageMpg = totalMiles / totalGas;
	printf("Your Average Miles per Gallon is %.2lf. Check your spark plugs. \n\n", averageMpg);
	system("pause");
}