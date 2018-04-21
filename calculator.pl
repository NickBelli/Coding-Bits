nbelli@osclinux:~$ cat calculator.pl
#!/usr/bin/perl

#####################
# Simple Calculator #
# by: Nick Belli    #
# April 7, 2018     #
#####################

##################################################################
# This application is designed to accept two numbers             #
# as arguments to a series of functions, which will              #
# perform the necessary calculations and return the result.      #
# The result will be returned with a distinct message.           #
# If the selection is "0", the application will exit.            #
# If the selection is not "0" through "4", the application       #
# will generate an error message and prompt for a new selection. #
##################################################################

#Welcome users to the application and initialize the userSelection:

print "\nWelcome to the Calculator! \n\n";
$userSelection;

until ($userSelection =~ /[0]/){

        #Print out the number prompts:

        print "Please enter the first number: ";
        $num1 = <>;
        chomp ($num1);
        print "Please enter the second number: ";
        $num2 = <>;
        chomp ($num2);
        print "Thank you\n";

        #Print out the Menu and ask for Action Choice:

        print "\n\tMenu\n";
        print "\n\t1. Add.";
        print "\n\t2. Subtract.";
        print "\n\t3. Multiply.";
        print "\n\t4. Divide.";
        print "\n\t0. Exit.\n";
        print "Choice: ";
        $userSelection = <>;
        chomp ($userSelection);

        #Execute the business logic methods for arithmetic expressions:

        if($userSelection == 1) {
                print addTwoNumbers();
        }
        elsif ($userSelection == 2) {
                print subtractTwoNumbers();
        }
        elsif ($userSelection == 3) {
                print multiplyTwoNumbers();
        }
        elsif ($userSelection == 4) {
                if ($num2 == 0){
                        print "\tError: Cannot divide by Zero\n";
                } else {
                        print divideTwoNumbers();
                }
        }
        elsif ($userSelection =~ /[0]/) {
                print "Thank you for using Nick's simple calculator!\n";
        }
        else {
                print "\t$userSelection is not a valid entry\n";
        }

        #Uncomment the $userSelection variable line to test one loop at a time.
        #This also prevents infinite looping on initial loop coding.
        #$userSelection = 0;
}

#Subroutine to add two numbers
sub addTwoNumbers {
        $result = $num1 + $num2;
        return "\nThe sum is $result \n";
}

#Subroutine to subtract one number from another
sub subtractTwoNumbers {
        $result = $num1 - $num2;
        return "\nThe difference is $result \n";
}

#Subroutine to multiply two numbers
sub multiplyTwoNumbers {
        $result = $num1 * $num2;
        return "\nThe product is $result \n";
}

#Subroutine to divide one number by the 2nd number
sub divideTwoNumbers {
        $result = $num1 / $num2;
        return "\nThe quotient is $result \n";
}

#####################################################
# Learning opportunities                            #
#                                                   #
# Subroutines to print the menu and number prompt   #
# that I couldn't get to work. Both routines        #
# kept leaving a "1" artifact after execution       #
# in the Standard Output. I want to leave           #
# this in my code to remind me to research why      #
# it leaves the artifacts                           #
#####################################################

#sub printMenu {
#       print "\n\tMenu\n";
#       print "\n\t1. Add.";
#       print "\n\t2. Subtract.";
#       print "\n\t3. Multiply.";
#       print "\n\t4. Divide.";
#       print "\n\t0. Exit.\n";
#       print "Choice: ";
#       $userSelection = <>;
#       chomp ($userSelection);
#}

#sub numberPrompt{
#       print "Please enter the first number: ";
#       $num1 = <>;
#       chomp ($num1);
#       print "Please enter the second number: ";
#       $num2 = <>;
#       chomp ($num2);
#       print "Thank you\n";
#}
