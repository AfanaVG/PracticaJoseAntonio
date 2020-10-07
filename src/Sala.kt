import kotlin.random.Random

open class Sala(var tipo: String) {

    class Magico (tipo: String ,var poder_maligno : Int) : Sala(tipo){

        fun completarMagico(){
            this.tipo = "magico"
            this.poder_maligno = Random.nextInt(1,10)
        }

    }

    class Accion(tipo: String ,var flechas : Int,var enemigos : Int) : Sala(tipo){

        fun completarAccion(){
            this.tipo = "accion"
            this.flechas = Random.nextInt(1,10)
            this.enemigos = Random.nextInt(1,10)
        }

    }

    class  Habilidad(tipo: String) : Sala(tipo){

        fun completarHabilidad(){
            this.tipo = "habilidad"
        }

    }
}