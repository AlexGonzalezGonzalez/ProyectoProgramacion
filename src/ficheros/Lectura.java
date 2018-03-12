/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author estudios
 */
public class Lectura {

    String ficheroCompleto = "";
    static String[] lineaDividida;
    static String[] lineaDividida2;

    public String[] leer(File fichero) {
        try {

            final BufferedReader reader = new BufferedReader(new FileReader(fichero));
            try {
                String line = "";
                while ((line = reader.readLine()) != null) {
                    ficheroCompleto = ficheroCompleto + "\n" + line;
                    lineaDividida = new String[7];
                    lineaDividida = line.split(",");
                    for (int i = 0; i < lineaDividida.length; i++) {
                        lineaDividida2 = new String[7];
                        lineaDividida2 = lineaDividida[i].split("\\s*:");
                        
                    }

                }

                reader.close();
            } catch (FileNotFoundException ex) {
                System.out.println("fichero no encontrado");
            }
        } catch (IOException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);

        }
        return lineaDividida2;
    }
        public String leerCompleto(File fichero) {
            int conta = 0;
        try {

            final BufferedReader reader = new BufferedReader(new FileReader(fichero));
            try {
                String line = "";
                while ((line = reader.readLine()) != null) {
                    if (conta==0) {
                        ficheroCompleto=line;
                    }else
                    ficheroCompleto = ficheroCompleto + "\n" + line;
                    
                    lineaDividida = new String[7];
                    lineaDividida = line.split(",");
                    for (int i = 0; i < lineaDividida.length; i++) {
                        lineaDividida2 = new String[7];
                        lineaDividida2 = lineaDividida[i].split("\\s*:");
                        
                    }
                    conta ++;
                }

                reader.close();
            } catch (FileNotFoundException ex) {
                System.out.println("fichero no encontrado");
            }
        } catch (IOException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);

        }
        return ficheroCompleto;
    }
}
