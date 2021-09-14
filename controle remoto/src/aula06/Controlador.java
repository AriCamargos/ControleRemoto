package aula06;
/**
*@author AriCamargos
*@version 8.0 (July 12, 2021)
* Estudando a classe Interface com herança de classe
*O objetivo aqui é mostrar todas as funcinalidedes de um controle remoto real 
**/
public interface Controlador {
    // Métodos abstratratos obs: void é prq não retorna nada
    public abstract void ligar();
    public abstract void delisgar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
    
    
}
