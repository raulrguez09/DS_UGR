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
        this.puntos = {0,0};
    }

    // Fija el valor que le pasamos y notifica a los observadores que
    // estan pendientes del cambio de estado de los objetos de esta
    // clase, que su etado se ha visto alterado
    public void setValor(int nValor[]) {
       this.puntos = nValor;

       setChanged();
       notifyObservers();
       }


    // Devuelve el valor actual que tiene el objeto
    public int [] getValor() {
       return( this.puntos );
       }

    
}

