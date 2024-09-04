package iut.but2.tp1

class Peage(private val nombreDePortiques: Int) {
    private val portiques: List<PortiquePeage> = List(nombreDePortiques) { PortiquePeage(it + 1) }

    fun arriverVehicule(vehicule: Vehicule) {
        val portique = choisirPortique()
        portique.ajouterVehicule(vehicule)
    }

    fun traiterTousLesVehicules() {
        while (portiques.any { it.tailleQueue() > 0 }) {
            portiques.forEach { it.traiterVehicule() }
        }
    }

    fun mesurerTempsTraitement(): Long {
        val startTime = System.nanoTime()
        traiterTousLesVehicules()
        return System.nanoTime() - startTime
    }

    private fun choisirPortique(): PortiquePeage {
        return portiques.minByOrNull { it.tailleQueue() } ?: portiques[0]
    }
}