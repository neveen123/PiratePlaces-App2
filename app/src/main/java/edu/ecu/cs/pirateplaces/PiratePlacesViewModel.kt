package edu.ecu.cs.pirateplaces

import androidx.lifecycle.ViewModel

class PiratePlacesViewModel: ViewModel() {
  private val sampleNames = listOf(
        "Bill", "James", "Edward", "Mary", "Alice", "Susan", "Joe", "Beth"
    )

     val piratePlaceList = List(100) {
        PiratePlace("Place $it", sampleNames.shuffled().take(it%3+1).joinToString(", "))
    }

  /**private val places = mutableListOf<PiratePlace>()
    init {
        for (i in 0 until 100) {
            val place = PiratePlace(name = "ECU", visitedWith = "sally" )
            place.name= "Place #$i"
            place.visitedWith = i % 2 == 0
             places += place
        }**/


    // TODO: Can the rest of the code in this class be removed?
  /** var currentIndex = 0

    val currentName : String
        get() = piratePlaceList[currentIndex].name

    val currentVisitedWith: String
        get() = piratePlaceList[currentIndex].visitedWith

   /** val canMoveToNext : Boolean
        get() = (currentIndex + 1) < piratePlaceList.size

    val canMoveToPrev : Boolean
        get() = currentIndex > 0

    fun moveToNext() {
        if (currentIndex + 1 < piratePlaceList.size) {
            ++currentIndex
        }
    }

    fun moveToPrev() {
        if (currentIndex > 0) {
            --currentIndex
        }
    }**/**/
}
