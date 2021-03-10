package DesignPatterns_Observer;

/**
 *
 * @author raulrguez
 */
import java.util.Observer;
import java.util.Observable;

public class MarcadorObservador implements Observer {
    private int local;
    private int visitante;
    public ValorObservable vo = null;
    

    // Constructor en el que creamos una ventana donde poder introducir
    // el valor numerico que represente la cantidad que corresponda
    // al objeto observable
    public MarcadorObservador( ValorObservable vo ) {
        this.vo = vo;
    }

    // Actualizamos el valor del objeto que estamos observando en
    // nuestro campo de texto, para reflejar el valor actual del
    // objeto
    public void update( Observable obs,Object obj ) {
        if( obs == vo )
            System.out.println(String.valueOf)
        }
    }

