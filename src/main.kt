import kotlin.random.Random

fun main (args: Array<String>){

    println("Hola mundo");


    var gandalf = Personaje.Mago("Gandalf",true,30)
    var legolas = Personaje.Elfo("Legolas",true,20)
    var salaM : Sala.Magico;
    var salaA : Sala.Accion;
    var salaH : Sala.Habilidad;
    var ranSala : Int;

    gandalf.recargarVara(Random.nextInt(1,29))
    gandalf.poderVara()
    legolas.lanzarFlecha()
    legolas.lanzarFlecha()
    legolas.lanzarFlecha()
    print("flechas "+legolas.carcaj)
    legolas.recargarFlechas(1)
    print("flechas "+legolas.carcaj)

    for (num in 1..36){
        ranSala = Random.nextInt(1,3)
        if (ranSala==1){
            salaM = Sala.Magico("",0)
            salaM.completarMagico()
        }else if (ranSala==2){
            salaA = Sala.Accion("",0,0)
            salaA.completarAccion()
        }else if (ranSala==3){
            salaH = Sala.Habilidad("")
            salaH.completarHabilidad()
        }

    }

}


