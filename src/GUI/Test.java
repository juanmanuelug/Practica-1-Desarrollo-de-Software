/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import p1s1.Controller;

/**
 *
 * @author jesus
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller controlador = new Controller();
        ObserverView observer = new ObserverView();
        
        observer.setControlador(controlador);
        
        new Thread(controlador).start();
        new Thread(controlador.uo).start();
    }
    
}
