package acuario

fun construirAcuario() {
    val acuario1 = Acuario()
    acuario1.imprimirTamano()

    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamano()

    val acuario3 = Acuario(alto = 35, largo = 110)
    acuario3.imprimirTamano()

    val acuario4 = Acuario(alto = 35 , ancho = 25, largo = 110)
    acuario4.imprimirTamano()

    val acuario5 = Acuario(numeroDePeces = 29)
    acuario5.imprimirTamano()

    val acuario6 = Acuario(numeroDePeces = 29)
    acuario6.imprimirTamano()
    acuario6.volumen = 70
    acuario6.imprimirTamano()

    val acuario7 = Acuario(largo = 25, ancho = 25, alto = 40)
    acuario7.imprimirTamano()

    val miAcuario = Acuario(ancho = 25, alto =40)
    miAcuario.imprimirTamano()
    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()

}

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()
    println("Color del tiburón: ${tiburon.color}")
    tiburon.comer()
    println("Color del pez payaso: ${pezPayaso.color}")
    pezPayaso.comer()
}

fun main() {
    construirAcuario()
    crearPeces()
}