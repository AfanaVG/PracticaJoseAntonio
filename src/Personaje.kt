import kotlin.random.Random

open class Personaje(var nombre: String, var vivo: Boolean) {

    class Mago (nombre: String ,vivo: Boolean,var energia : Int) : Personaje(nombre, vivo) {
         fun recargarVara(energia: Int){
             this.energia = this.energia+(30-energia);

             if(this.energia > 30){
                 this.energia = 30;
             }
         }

        fun poderVara(){
            println("Energia de la vara de "+this.nombre+" : "+this.energia)
        }
     }

    class Elfo (nombre: String ,vivo: Boolean,var carcaj : Int) : Personaje(nombre, vivo) {

    }

    class Hobbit (nombre: String ,vivo: Boolean,var anillo : Boolean) : Personaje(nombre, vivo) {

    }
}