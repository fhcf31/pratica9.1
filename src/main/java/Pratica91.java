/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fernando
 */
public class Pratica91 {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        System.out.println("Nome do sistema operacional: "+os);
        
        Runtime rt = Runtime.getRuntime();
        System.out.println("Numeros de processadores: "+rt.availableProcessors());
        System.out.println("Memoria total: "+(rt.totalMemory()/1024)/1024);
        System.out.println("Memoria livre: "+(rt.freeMemory()/1024)/1024);
        System.out.println("Memoria maxima utilizada pela maquina virtual: "+rt.maxMemory()/1024/1024);
        
    }
    
}
