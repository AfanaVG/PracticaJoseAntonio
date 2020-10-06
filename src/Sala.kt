open class Sala(var tipo: String) {

    class Magico (tipo: String ,var poder_maligno : Int) : Sala(tipo){

    }

    class Accion(tipo: String ,var flechas : Int,var enemigos : Int) : Sala(tipo){

    }

    class  Habilidad(tipo: String) : Sala(tipo){

    }
}