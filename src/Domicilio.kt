
/**
 * Clase que representa un domicilio, compuesto por una calle y un número.
 * @property calle El nombre de la calle del domicilio.
 * @property numero El número del domicilio en la calle.
 */
data class Domicilio(val calle: String, val numero: Int) {

    /**
     * Obtiene la dirección completa del domicilio.
     * @return Una cadena de caracteres que representa la dirección completa del domicilio.
     */
    fun dirCompleta(): String {
        return "$calle $numero"
    }
}