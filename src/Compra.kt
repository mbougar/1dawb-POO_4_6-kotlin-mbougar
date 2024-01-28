
/**
 * Clase que representa una compra realizada por un cliente en un día específico por un monto determinado.
 * @property cliente El cliente que realizó la compra.
 * @property dia El día en que se realizó la compra.
 * @property monto El monto de la compra.
 */
data class Compra(val cliente: Cliente, val dia: Int, val monto: Double)