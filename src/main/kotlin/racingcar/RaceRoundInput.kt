package racingcar

import java.util.*

/*Accept user input for number of rounds
* */
class RaceRoundInput {
    fun getRaceRound(): Int {
        println("Enter The number of Round")
        val scanner = Scanner(System.`in`)
        val noOfRound = scanner.nextLine().toInt()
        return noOfRound
    }


}