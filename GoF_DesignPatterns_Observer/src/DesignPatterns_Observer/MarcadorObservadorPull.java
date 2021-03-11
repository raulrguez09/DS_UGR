/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns_Observer;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Observable;
import java.util.Observer;

public class MarcadorObservadorPull extends Thread implements Observer {
    private int local;
    private int visitante;
    public ValorObservable vo;
    private boolean hacambiado = true;
    
    public MarcadorObservadorPull (ValorObservable o){
        this.vo = o;
    }
    
    public void preguntarDatos(){
        local = vo.getLocal();
        visitante = vo.getVisitante();
        
        System.out.println("Observando con Pull: " +local+ " - "+visitante);
    }
    
    public void update(Observable obs, Object obj){
        
    }
    
    @Override
    public void run(){
        while(true){
                preguntarDatos();
            try{
                Thread.sleep(3000);
            } catch (InterruptedException ex){
                //Logger.getLogger(ControlValor.class.getName()).log(Level.WARNING, null, ex);
            }
        }
    }
    
    public int getLocal(){
        return local;
    }
    
    public int getVisitante(){
        return visitante;
    }
}
