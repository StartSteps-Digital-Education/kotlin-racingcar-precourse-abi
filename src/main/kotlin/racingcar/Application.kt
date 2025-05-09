package racingcar

fun main() {
    // TODO: Implement the program

    val getCarname =  CarNameInput();

  val validCarNames = getCarname.getValidCarNames()

    println(validCarNames)

    val  raceRoundInput = RaceRoundInput();
    raceRoundInput.getRaceRound();
}
