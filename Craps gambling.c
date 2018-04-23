#include <stdio.h>
#include <stdlib.h>
#define die1 rand()%6+1
#define die2 rand()%6+1

//Nick Belli
main() {
	int /*die1, die2, */dice, point, win1 = 0, win2 = 0, lose1 = 0, lose2 = 0, count = 0;

	srand(time(NULL));

	for (count = 0; count < 10; count++) {
		/*die1 = rand() % 6 + 1;
		die2 = rand() % 6 + 1;*/
		dice = die1 + die2;
		
		if (dice == 2 || dice == 3 || dice == 12) {
			lose1++;
			printf("You lose. Try again next trip.\n\n");
		}
		else if (dice == 7 || dice == 11) {
			win1++;
			printf("Your winning roll was %i \n", dice);
			printf("You win! Collect your winnings at the back of the casino. Ask for Big Jim.\n\n");
		}
		else {
			point = dice;
			/*die1 = rand() % 6 + 1;
			die2 = rand() % 6 + 1;*/
			dice = die1 + die2;

			while (dice != 7 && dice != point) {
				/*die1 = rand() % 6 + 1;
				die2 = rand() % 6 + 1;*/
				dice = die1 + die2;
			}
			if (dice == 7) {
				lose2++;
				printf("You lose. See Fast Eddie at the front.\n\n");
			}
			else /*if (dice == point) */{
				win2++;
				printf("Your winning roll was %i \n", point);
				printf("You win. See Slim at the back of the casino.\n\n");
			}
		}
	} 
	
	printf("You won on the first roll %i times \n\n", win1);
	printf("You won on the second roll %i times \n\n", win2);
	printf("You lost on the first roll %i times \n\n", lose1);
	printf("You lost on the second roll %i times \n\n", lose2);
	system("pause");
}