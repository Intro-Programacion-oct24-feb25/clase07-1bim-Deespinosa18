/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo101 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite_tabla = 12;
        /* no utilizamos limite tabla ya que ahora pedimos
         al ususario que ponga el limite de la tabla
        */
        int contador = 1;
        int operacion;
        int tabla;
        int limite;
        
        System.out.println("Ingrese el número de tabla a generar");
        tabla = entrada.nextInt();
        
        System.out.println("Ingrese el limite de la tabla");
        limite = entrada.nextInt();
        if (tabla <=0 || ( tabla >12))
            tabla = 12;
        String cadena = ""; // cadena acumulador
        cadena = String.format("%sTabla de multiplicar\n", cadena);
        
        while (contador <= limite){
            operacion = tabla * contador;
            
            cadena = String.format("%s%d*%d=%d\n", 
                    cadena, 
                    tabla, 
                    contador,
                    operacion);
            contador = contador + 1;
        }
                
        System.out.printf("%s\n", cadena);
        
    }
}
