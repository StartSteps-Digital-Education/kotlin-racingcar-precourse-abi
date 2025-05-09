package racingcar
import java.util.*

/* get carnames from user
* */
class CarNameInput {
    fun getValidCarNames(): MutableList<String> {
        println("Enter the Car Name")
        val scan = Scanner(System.`in`)
        val input = scan.nextLine().trim();
        val carNames = input.split(",")
        val validCarNames = mutableListOf<String>()
        for ( carName in carNames) {
            if (carName.isEmpty()) {
                throw IllegalArgumentException("The Car name is empty")
            } else if (carName.length >= 4) {
                validCarNames.add(carName)
            }
            else{
                throw IllegalArgumentException(carName + " = is not a valid name")
            }
        }
        return validCarNames

    }

}

