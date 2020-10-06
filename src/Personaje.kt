import kotlin.random.Random
//Clase principal que definira datos de nuestros personajes
open class Personaje(var nombre: String, var vivo: Boolean) {

    //Subclase de personaje : Mago
    class Mago (nombre: String ,vivo: Boolean,var energia : Int) : Personaje(nombre, vivo) {
        //Funcion que recargar la energia con un numero dado en el programa
         fun recargarVara(energia: Int){

            //Controla que la energia no pase de 30
             if(this.energia+(30-energia) > 30){
                 this.energia = 30;
             }else{
                 this.energia = this.energia+(30-energia);
             }
         }
        //Muestra la energia actual de la vara
        fun poderVara(){
            println("Energia de la vara de "+this.nombre+" : "+this.energia)
        }
     }

    //Subclase de personaje : Elfo
    class Elfo (nombre: String ,vivo: Boolean,var carcaj : Int) : Personaje(nombre, vivo) {

    }

    //Subclase de personaje : Hobbit
    class Hobbit (nombre: String ,vivo: Boolean,var anillo : Boolean) : Personaje(nombre, vivo) {

    }
}