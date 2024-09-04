package iut.but2.tp1

class Cellule<E>(private val valeur: E) {
    private var suivant: Cellule<E>? = null
    private var precedent: Cellule<E>? = null

    fun valeur(): E = valeur

    fun suivant(): Cellule<E>? = suivant

    fun precedent(): Cellule<E>? = precedent

    fun modifieSuivant(suivant: Cellule<E>?) {
        this.suivant = suivant
    }

    fun modifiePrecedent(precedent: Cellule<E>?) {
        this.precedent = precedent
    }
}