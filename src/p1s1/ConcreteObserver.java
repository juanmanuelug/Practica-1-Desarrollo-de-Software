package p1s1;

import java.util.Observer;
import java.util.Observable;

import GUI.BasicInterface;

public class ConcreteObserver implements Observer {

	protected Criptomoneda sujetoObservable;
        public BasicInterface interfaz;
        
        public ConcreteObserver(Criptomoneda cripto){
            sujetoObservable = cripto;
        }
        
        public double getValor(){
            return sujetoObservable.getValor();
        }
        
        public void setInterface(BasicInterface interfaz){
            this.interfaz = interfaz;
        }
        
        @Override
	public void update(Observable o, Object obj) {
            interfaz.actualizarVista();
	}

}