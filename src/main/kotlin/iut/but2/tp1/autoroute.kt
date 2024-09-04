package iut.but2.tp1

fun main() {
    val nombreDePortiquesList = listOf(1, 2, 5, 10, 20)
    val vehicules = List(10) { Vehicule(it + 1, "Voiture") }
    val tempsTraitementMap = mutableMapOf<Int, Long>()

    for (nombreDePortiques in nombreDePortiquesList) {
        val peage = Peage(nombreDePortiques)

        // Simuler l'arrivée de véhicules
        vehicules.forEach { peage.arriverVehicule(it) }

        // Mesurer le temps de traitement
        val tempsTraitement = peage.mesurerTempsTraitement()
        tempsTraitementMap[nombreDePortiques] = tempsTraitement
        println("Temps de traitement avec $nombreDePortiques portiques: $tempsTraitement ns")
    }

    // Résumé des temps d'exécution
    println("\nRésumé des temps d'exécution:")
    tempsTraitementMap.forEach { (nombreDePortiques, tempsTraitement) ->
        println("Nombre de portiques: $nombreDePortiques, Temps de traitement: $tempsTraitement ns")
    }
}