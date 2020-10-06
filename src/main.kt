import kotlin.random.Random

fun main (args: Array<String>){

    println("Hola mundo");


    var gandalf = Personaje.Mago("Gandalf",true,30)
    var legolas = Personaje.Elfo("Legolas",true,20)

    gandalf.recargarVara(Random.nextInt(1,29))
    gandalf.poderVara()
    legolas.lanzarFlecha()
    legolas.lanzarFlecha()
    legolas.lanzarFlecha()
    print("flechas "+legolas.carcaj)
    legolas.recargarFlechas(1)
    print("flechas "+legolas.carcaj)

}