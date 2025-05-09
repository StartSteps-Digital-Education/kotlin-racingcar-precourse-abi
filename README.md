# kotlin-racingcar-precourse

Kotlin Racing Car Game
A console-based racing game developed in Kotlin.
Cars move based on random values, and the winners are determined after a set number of rounds.
Built under Woowacourse precourse constraints with full test coverage.

✅ Features
Accept user input for car names (comma-separated) 
Validate each car name:
Not empty
Max 5 characters
Accept user input for number of rounds
Each round:
Generate random number (0–9) for each car
Move car forward if number ≥ 4
Show progress for each car
Determine the winner(s)
Show winners (comma-separated if multiple)
Throw IllegalArgumentException on invalid input
Use camp.nextstep.edu.missionutils.Console for input
Use camp.nextstep.edu.missionutils.Randoms for randomness
All logic tested with JUnit 5 and AssertJ

pseudocode:
1= get carName from user
eg 3 name with comma- separate

2=the name should be 5character, if it is more then 5
if the input is not match requirement, should thorough, illegalArgumention 

3 then the round number user will give

4=generate random number (0-9) for each car
 
5= if the random number is >=4 then the car move forward

6= based on the user input round the for loop will run and show the winner
if the winner is multiple person should be (,comma separate)






