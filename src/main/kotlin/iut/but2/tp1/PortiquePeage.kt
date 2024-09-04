package iut.but2.tp1

import java.util.LinkedList
import java.util.Queue

class PortiquePeage(val id: Int) {
    private val queue: Queue<Vehicule> = LinkedList()

    fun ajouterVehicule(vehicule: Vehicule) {
        queue.add(vehicule)
        println("Véhicule ${vehicule.id} ajouté au Portique $id")
    }

    fun traiterVehicule() {
        val vehicule = queue.poll()
        if (vehicule != null) {
            println("Véhicule ${vehicule.id} traité au Portique $id")
        }
    }

    fun tailleQueue(): Int {
        return queue.size
    }
}