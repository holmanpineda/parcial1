package org.yourcompany.parcial1;
public class Caballero{

    public String nombre;
    public int vida;
    public int cosmos;
public Armadura armadura;
public Caballero(String nombre, int vida, int cosmos, Armadura armadura) {
    this.nombre = nombre;
    this.vida = vida;
    this.cosmos = cosmos;
    this.armadura = armadura;
    

}   

public void atacar(Caballero enemigo){

    if (cosmos >=50){
    int vidaenemigo =enemigo.vida-this.armadura.ataque + enemigo.armadura.defensa;
    int cosmoscaballero = this.cosmos - 50;

    enemigo.vida = vidaenemigo;
    this.cosmos = cosmoscaballero;


       
}


}
}