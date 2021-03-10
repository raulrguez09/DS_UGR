/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns_Observer;
import java.util.ArrayList;
import java.util.Observable;

public class ValorObservable extends Observable {
    private ArrayList<Integer> puntos;

    // Constructor al que indicamos el valor en que comenzamos y los
    // limites inferior y superior que no deben sobrepasarse
    public ValorObservable(){
        super();
        this.puntos = new ArrayList<Integer>();
        puntos.add(0, 0);
        puntos.add(1, 0);
    }

    // Fija el valor que le pasamos y notifica a los observadores que
    // estan pendientes del cambio de estado de los objetos de esta
    // clase, que su etado se ha visto alterado
    public void incrementarMarcador(ArrayList<Integer> nValor) {
        int local = puntos.get(0) + nValor.get(0);
        int visitante = puntos.get(1) + nValor.get(1);
        this.puntos.set(0, local);
        this.puntos.set(1, visitante);
       
       System.out.println("Sujeto Observable: "+puntos.get(0)+ " - "+puntos.get(1));
       
       setChanged();
       ArrayList<Integer> obj = new ArrayList<Integer>();
       obj.add(puntos.get(0));
       obj.add(puntos.get(1));
       notifyObservers(obj);
       }


    // Devuelve el valor actual que tiene el objeto
    public int getLocal() {
       return( this.puntos.get(0) );
    }
    
    public int getVisitante() {
       return( this.puntos.get(1) );
    }

    
}

