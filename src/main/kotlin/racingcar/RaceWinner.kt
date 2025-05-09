package racingcar

import camp.nextstep.edu.missionutils.Randoms

class RaceWinner {
    fun printTheWinner(validCarNames: MutableList<String>, numOfRound: Int) {
        var carMap: HashMap<String, Int> = HashMap<String, Int>()
        for (round in 0..numOfRound)
            println("------Round $round ------- ")
        for (car in validCarNames) {
            val random = Randoms.pickNumberInRange(0, 9);
            if (random >= 4) {
                if (carMap.contains(car)) {
                    carMap.put(car, carMap.get(car)!! + 1)
                } else {
                    carMap.put(car, 1);
                }
            }
        }
        println(carMap)
    }


}