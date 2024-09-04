package iut.but2.tp1

import kotlin.system.measureNanoTime

fun main() {
    val randomData = generateRandomData(1000)
    val fileArrayList = FileArrayList<Int>()
    val fileChainee = FileChainee<Int>()

    // Temps d'insertion
    val timeInsertArrayList = measureNanoTime {
        randomData.forEach { fileArrayList.insererEnQueue(it) }
    }
    val timeInsertChainee = measureNanoTime {
        randomData.forEach { fileChainee.insererEnQueue(it) }
    }

    // Temps de suppression
    val timeDeleteArrayList = measureNanoTime {
        repeat(randomData.size) { fileArrayList.supprimerEnTete() }
    }
    val timeDeleteChainee = measureNanoTime {
        repeat(randomData.size) { fileChainee.supprimerEnTete() }
    }

    // Temps de listage
    val timeListArrayList = measureNanoTime {
        fileArrayList.listerDepuisDebut()
        fileArrayList.listerDepuisFin()
    }
    val timeListChainee = measureNanoTime {
        fileChainee.listerDepuisDebut()
        fileChainee.listerDepuisFin()
    }

    // Results
    println("Insertion Time (ArrayList): $timeInsertArrayList ns")
    println("Insertion Time (Chainee): $timeInsertChainee ns")
    println("Le plus rapide est : ${if (timeInsertArrayList < timeInsertChainee) "ArrayList" else "Chainee"}")
    println("Deletion Time (ArrayList): $timeDeleteArrayList ns")
    println("Deletion Time (Chainee): $timeDeleteChainee ns")
    println("Le plus rapide est : ${if (timeDeleteArrayList < timeDeleteChainee) "ArrayList" else "Chainee"}")
    println("Listing Time (ArrayList): $timeListArrayList ns")
    println("Listing Time (Chainee): $timeListChainee ns")
    println("Le plus rapide est : ${if (timeListArrayList < timeListChainee) "ArrayList" else "Chainee"}")
}

fun generateRandomData(size: Int): List<Int> {
    return List(size) { (0..1000).random() }
}