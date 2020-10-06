import kotlin.random.Random

fun main (args: Array<String>){

    //Objetos personaje y salas
    var gandalf = Personaje.Mago("Gandalf",true,30)
    var legolas = Personaje.Elfo("Legolas",true,20)
    var frodo = Personaje.Hobbit("Frodo",true,false)
    var salaM : Sala.Magico;
    var salaA : Sala.Accion;
    var salaH : Sala.Habilidad;

    var ranSala : Int; //Guardara un int que indica que sala se genera
    var n : Int =0; //Contador de salas superadas



    do {//El bucle se realizara hasta que se completen 36 salas o alguien muera
        ranSala = Random.nextInt(1,3) //Genera un numero del 1 al 3 para decidir la sala
        if (ranSala==1 && gandalf.vivo){
            salaM = Sala.Magico("",0)
            salaM.completarMagico()
            gandalf.recargarVara(Random.nextInt(1,10))
            gandalf.poderVara()
            //Si el poder maligno de la sala es menor que la energia de Gandalf el exito esta asegurado
            if (gandalf.energia > salaM.poder_maligno){

                println(gandalf.nombre+" ha derrotado el mal sin problema")
                gandalf.energia = gandalf.energia-salaM.poder_maligno
            //Si la energia es igual el exito tendra un probabilidad
            }else if(gandalf.energia == salaM.poder_maligno){

                println(gandalf.nombre+" esta teniendo problemas")
                //tiene un 60% de probabilidades de tener exito
                if (Random.nextInt(0,100) <= 60){

                    println("Tras algunas dificultades "+gandalf.nombre+" ha conseguido vencer")
                    gandalf.energia = gandalf.energia-salaM.poder_maligno
                //Si no tiene exito intentara huir con un 80% de exito
                }else{

                    println(gandalf.nombre+" ha perdido e intenta escapar")
                    gandalf.muerte(80)

                }
            //Si la energia de gandal es menor que el poder maligno la probabilidad sera del 30
            }else if(gandalf.energia < salaM.poder_maligno){
                println(gandalf.nombre+" esta teniendo muchos problemas")
                if (Random.nextInt(0,100) <= 30){
                    println("Tras muchas dificultades "+gandalf.nombre+" ha conseguido vencer")
                    gandalf.energia = gandalf.energia-salaM.poder_maligno
                }else{
                    println(gandalf.nombre+" ha perdido e intenta escapar")
                    gandalf.muerte(80)
                }

            }

        }else if (ranSala==2 && legolas.vivo){
            salaA = Sala.Accion("",0,0)
            salaA.completarAccion()
            //Legolas disparara hasta acabar con todos los enemigos o se quede sin flechas
            for (num in 1..salaA.enemigos){
                if (legolas.carcaj > 0 && legolas.vivo){
                    println("Legolas combate diestramente con su arco de SUCIO ELFO")
                    legolas.lanzarFlecha()
                    salaA.enemigos -=1
                //Si se queda sin flechas tratara de huir
                }else{

                    legolas.muerte(80)

                }
                //Si sobrevive y acaba con todos los enemigos legolas recarga sus flechas
                if(legolas.vivo && salaA.enemigos==0){
                    legolas.recargarFlechas(salaA.flechas)
                }
            }
        }else if (ranSala==3 && frodo.vivo){
            salaH = Sala.Habilidad("")
            salaH.completarHabilidad()

            //Frodo se pone o quita el anillo en un 50/50 he intenta huir
            if (Random.nextInt(0,100) <= 50){
                //Si se lo pone la probabilidad es 90%
                frodo.ponerseAnillo()
                frodo.muerte(90)
            }else{
                //Si no se lo pone la probabilidad es 20%
                frodo.quitarseAnillo()
                frodo.muerte(20)
            }
        }
    n++;//Va sumando las salas completadas
    }while (n !=36 && legolas.vivo && frodo.vivo && gandalf.vivo)

    //Si la variable "n" es 36 implica que todos han sobrevivido
    if (n == 36){
        println("Nuestros heroes han sobrevivido")
    }else{
        println("Lamentablemente nuestros heroes han muerto")
    }

}




