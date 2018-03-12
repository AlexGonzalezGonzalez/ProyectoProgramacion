
package proyectoprogramacion;

import ficheros.Escritura;
import ficheros.Lectura;
import java.io.File;
import java.util.*;
import static javafx.scene.input.KeyCode.K;
import static javafx.scene.input.KeyCode.V;
import personalizacion_grafica.Sesion;




public class Proyecto {
        static Juegos juego= new Juegos();
        static ArrayList <Juegos> listaJuegos;
    public static void main(String[] args) {
        
        
         
//        listaJuegos= new ArrayList();
        
//            juego= new Juegos();
////           Juegos j1=juego.nuevoJuego();
////           
////           listaJuegos.add(j1);
////        Escritura e = new Escritura();
////        Lectura l=new Lectura();
//////        e.escribir(new File("juegos.txt"),j1,listaJuegos);
////        l.leer(new File("juegos.txt"));
           Sesion admin= new Sesion();
         admin.setVisible(true); 
            Buscador b= new Buscador();
            b.modificar();
    }
    
   
    
}
