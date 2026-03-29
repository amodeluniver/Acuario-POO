package acuario

import kotlin.math.PI

open class Acuario(open var ancho: Int = 20, open var alto: Int = 40, open var largo: Int = 100) {

    open var volumen: Int
        get() = ancho * largo * alto / 1000
        set(value) {
            alto = (value * 1000) / (ancho * largo)
        }

    fun imprimirTamano(){
        println(forma)
        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm "
        )
        println("Volumen: $volumen l | Agua: $agua l (${agua/volumen*100.0}% lleno)")
    }

    init {
        println("Inicializando acuario")
    }



    constructor(numeroDePeces: Int) : this() {
        val tanque = numeroDePeces * 2000 * 1.1
        alto = (tanque / (largo * ancho)).toInt()
    }

    open val forma = "rectangulo"

    open var agua: Double = 0.0
        get() = volumen * 0.9

}

class TanqueTorre(override var alto: Int, var diametro: Int): Acuario(alto = alto, ancho = diametro, largo = diametro) {
    override var volumen: Int
        get() = (ancho/2 * largo/2 * alto /1000 * PI).toInt()
    set(value) {
        alto = ((value * 1000 / PI) / (ancho/2 * largo*2)).toInt()
    }

    override var agua = volumen * 0.8
    override val forma = "Cilindro"
}

