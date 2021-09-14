package aula06;
/**
*@author AriCamargos
*@version 8.0 (July 12, 2021)
* Estudando a classe Interface com herança de classe
*O objetivo aqui é mostrar todas as funcinalidedes de um controle remoto real
**/
public class Aula06 {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.menosVolume();
        c.play();
        c.abrirMenu();
        c.ligarMudo();
        c.fecharMenu();
    }
    
}
