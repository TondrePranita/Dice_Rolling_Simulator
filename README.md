This project is a simple "Dice Rolling Simulator" implemented in Java. 
It allows users to roll a specified number of dice and see the outcomes displayed visually in the console.
=> The program begins by asking the user to input their name for a personalized interaction.
=> It then prompts the user to specify the number of dice they want to roll.
=> A Random object is used to generate a random number between 1 and 6 for each die, simulating the outcome of rolling dice.
=> The program uses a try-catch block to handle invalid inputs. If the user enters a non-numeric value, an error message is shown, and they are prompted to try again.
=> The display method converts the numerical result of each die roll into a visual representation of a dice face.
=> The program runs in a loop until valid input is received. 
=> Once the dice are rolled and results displayed, the program terminates.

Example:
If the user inputs 3, the program simulates rolling three dice and outputs something like:

-----------
|  o   o  |
|         |
|  o   o  |
-----------
-----------
|    o    |
|         |
|    o    |
-----------
-----------
|  o   o  |
|  o   o  |
|  o   o  |
-----------

This project demonstrates the use of:
o Random number generation.
o Control structures like loops and conditionals.
o Basic exception handling in Java.
o ASCII art for text-based UI design.
