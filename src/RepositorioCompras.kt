/**
 * Clase que representa un repositorio de compras.
 */
class RepositorioCompras {
    private val compras: MutableList<Compra> = mutableListOf()

    /**
     * Agrega una compra al repositorio de compras.
     * @param compra La compra a agregar.
     */
    fun agregarCompra(compra: Compra) {
        compras.add(compra)
    }

    /**
     * Retorna los domicilios únicos de cada cliente al cual se le debe enviar una factura de compra.
     * @return Un conjunto de cadenas de caracteres que representan los domicilios únicos.
     */
    fun domicilios(): Set<String> {
        val domicilios = mutableSetOf<String>()
        for (compra in compras) {
            domicilios.add(compra.cliente.domicilio.dirCompleta())
        }
        return domicilios
    }
}