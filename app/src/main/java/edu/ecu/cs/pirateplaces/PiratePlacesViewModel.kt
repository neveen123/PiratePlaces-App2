package edu.ecu.cs.pirateplaces

import androidx.lifecycle.ViewModel

class PiratePlacesViewModel: ViewModel() {
  private val sampleNames = listOf(
        "Bill", "James", "Edward", "Mary", "Alice", "Susan", "Joe", "Beth"
    )

     val piratePlaceList = List(101) {
        PiratePlace("Place $it", sampleNames.shuffled().take(it%3+1).joinToString(", "))
    }
}
