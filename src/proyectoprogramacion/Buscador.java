/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author estudios
 */
public class Buscador {
    String[] lineaDividida,lineaDividida2;
    String ficheroCompleto="";
    String line;
    public void modificar(){
        
        
        try {
            final BufferedReader reader = new BufferedReader(new FileReader("Juegos.txt"));
            
            
            while ((line = reader.readLine()) != null) {
                
                lineaDividida = new String[7];
                lineaDividida = line.split(",");
                for (int i = 0; i < lineaDividida.length; i++) {
                    
                    lineaDividida2 = new String[2];
                    lineaDividida2 = lineaDividida[i].split("\\s*:");
                    
                }
                
            }
            
            reader.close();
            } catch (FileNotFoundException ex) {
                System.out.println("fichero no encontrado");
            
        } catch (IOException ex) {
            Logger.getLogger(Buscador.class.getName()).log(Level.SEVERE, null, ex);
        }
}       
}

