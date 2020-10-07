import kotlin.random.Random
//Clase principal que definira datos de nuestros personajes
open class Personaje(var nombre: String, var vivo: Boolean) {

    //Subclase de personaje : Mago
    class Mago (nombre: String ,vivo: Boolean,var energia : Int) : Personaje(nombre, vivo) {
        //Funcion que recargar la energia con un numero dado en el programa
         fun recargarVara(energia: Int){

            //Controla que la energia no pase de 30
             if(this.energia+energia > 30){
                 this.energia = 30;

              //Controla que la energia no sea menos de 1
             }else if(this.energia<1){
                this.energia=1;
             }else{
                 this.energia = this.energia+energia;
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
            println(this.nombre+" ha encontrado "+flechas+" flechas")
            if (this.carcaj + flechas > 20){
                this.carcaj = 20;
            //Controla que siempre tengamos una flecha
            }else if(this.carcaj<1){
                this.carcaj=1;
            } else{
                this.carcaj +=flechas;
            }

        }
    }

    //Subclase de personaje : Hobbit
    class Hobbit (nombre: String ,vivo: Boolean,var anillo : Boolean) : Personaje(nombre, vivo) {

        fun ponerseAnillo(){
            println(this.nombre+" se pone el anillo")
            this.anillo = true;
        }

        fun quitarseAnillo(){
            println(this.nombre+" se quita el anillo")
            this.anillo=false;
        }
    }

    //Esta funcion decidira si nuestro personaje logra huir o muere
    fun muerte(probabilidad : Int){

            if (Random.nextInt(0,100) <= probabilidad){

                println(this.nombre+" ha logrado escapar por un pelo")

            }else{

                println(this.nombre+" ha muerto")
                this.vivo = false

            }


    }
}