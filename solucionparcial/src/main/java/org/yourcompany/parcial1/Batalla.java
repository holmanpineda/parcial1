package org.yourcompany.parcial1;

public class Batalla{


    public void inicioBatalla(){ 
    Bronce bronce = new Bronce("Armadura de Bronce");
    Plata plata = new Plata("Armadura de Plata");

    Caballero caballero1 = new Caballero("pegaso",1000,800,bronce);
    Caballero caballero2 = new Caballero("tauro",1000,200,plata);

    while (caballero1.vida >0 && caballero2.vida >0){
        caballero1.atacar(caballero2);
        caballero2.atacar(caballero1);

        System.out.println("Vida de " + caballero1.nombre + ": " + caballero1.vida + " - Cosmos: " + caballero1.cosmos);
        System.out.println("Vida de " + caballero2.nombre + ": " + caballero2.vida + " - Cosmos: " + caballero2.cosmos);
        
        if (caballero1.cosmos <= 0 || caballero2.cosmos <= 0){
            System.out.println("El ganador es");
            break;
        }
    }
    if (caballero1.vida < caballero2.vida){
        System.out.println(caballero2.nombre);
    } else if (caballero2.vida == caballero1.vida){

        System.out.println("empate");
    
    } else {
        System.out.println("gana" + caballero1.nombre);
    }
}

}