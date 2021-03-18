/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1s1;

import java.util.Observable;

/**
 *
 * @author jesus
 */
public class SubscribedObserver extends ConcreteObserver{
    
    public SubscribedObserver(Criptomoneda cripto){
        super(cripto);
    }
    @Override
    public void update(Observable o, Object obj) {
        super.update(o, obj);
        System.out.println("Subscribed: Modificación notificada " + obj);
    }
}
