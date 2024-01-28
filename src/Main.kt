

fun main() {
    val repositorioCompras = RepositorioCompras()
    val listaCompras = listOf(
        Compra(Cliente("Nuria Costa", Domicilio("Calle Las Flores", 355)), 5, 12780.78),
        Compra(Cliente("Jorge Russo", Domicilio("Mirasol", 218)), 7, 699.0),
        Compra(Cliente("Nuria Costa", Domicilio("Calle Las Flores", 355)), 7, 532.90),
        Compra(Cliente("Julián Rodriguez", Domicilio("La Mancha", 761)), 12, 5715.99),
        Compra(Cliente("Jorge Russo", Domicilio("Mirasol", 218)), 15, 958.0)
    )

    for (compra in listaCompras) {
        repositorioCompras.agregarCompra(compra)
    }

    val domiciliosClientes = repositorioCompras.domicilios()

    println("Domicilios a los que se enviarán facturas:")
    for (domicilio in domiciliosClientes) {
        println("- $domicilio")
    }
}