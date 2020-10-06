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
        //Resta flechas del carcaj de este personaje
        fun lanzarFlecha(){
            this.carcaj -=1;
        }
        //Recarga las flechas por un valor obtenido de un objeto Sala de la subclase Accion
        fun recargarFlechas(flechas : Int){
            //Controla el carcaj no supere 20 flechas
            if (this.carcaj + flechas > 20){
                this.carcaj = 20;
            }else{
                this.carcaj +=flechas;
            }

        }
    }

    //Subclase de personaje : Hobbit
    class Hobbit (nombre: String ,vivo: Boolean,var anillo : Boolean) : Personaje(nombre, vivo) {

        fun ponerseAnillo(){
            this.anillo = true;
        }

        fun quitarseAnillo(){
            this.anillo=false;
        }
    }
}