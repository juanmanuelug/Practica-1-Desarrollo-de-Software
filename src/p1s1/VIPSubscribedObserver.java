/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1s1;

import java.util.Observable;
import GUI.VIPInterface;

/**
 *
 * @author jesus
 */
public class VIPSubscribedObserver extends SubscribedObserver{
    
    public VIPInterface interfaz;
    
    public VIPSubscribedObserver (Criptomoneda cripto){
        super(cripto);
    }
    
    public void setValorObservable(double num){
        sujetoObservable.setValor(num);
    }
    

    public void setInterface(VIPInterface interfaz){
        this.interfaz = interfaz;
    }
    
    @Override
    public void update(Observable o, Object obj) {
        interfaz.actualizarVista();
        System.out.println("VIPSubscribed: Modificación notificada " + obj);
    }
}
