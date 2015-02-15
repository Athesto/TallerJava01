/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerjava01;


import java.io.Console;
import javax.swing.JOptionPane;
/**
 *
 * @author Gustavo
 */
public class TallerJava01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opt;
        System.out.println("Bienvenido a la Aplicacion: TallerJava01\n\n"
                + "Nota: Para poder continuar con la Aplicacion recomendamos\n"
                + "abrir el programa desde la linea comando\n"
                + "(leer el README.TXT en la carpeta dist)\n\n");
        
        
        opt = JOptionPane.showInputDialog("Seleccione un punto del taller\n\n"
                + "1) Rango de numeros primos\n"
                + "2) Promedio de asignatura\n"
                + "3) Codificador de Datos\n"
                + "4) Decodificador de Datos\n"
                + "5) Factorial de un numero\n"
                + "6) Calculo de e\n"
                + "7) Calculo de e^x\n\n");
        
        Console console = System.console();
        
        String [] anArray = new String[3];
        int [] vector;
        int tam;
        boolean deacuerdo = false;
        //do{
            tam = Integer.parseInt(console.readLine("tamaño de datos: "));
            //anArray[1] = console.readLine("Enter input: ");
            vector = new int[tam];
            System.out.printf("{");
            for (int i =0;i<=vector.length-2;i++){
                System.out.printf(vector[i] +" ,");
            }
            System.out.println(vector[vector.length-1] + "}");
        
            vector = new int[tam+1];
            System.out.printf("{");
            for (int i =0;i<=vector.length-2;i++){
                System.out.printf(vector[i] +" ,");
            }
        //} w   hile (deacuerdo == false);
        System.out.println(vector[vector.length-1] + "}");
        
        
        anArray[1] = JOptionPane.showInputDialog("Colocar los porcentajes separados por coma");
        
        
        
        System.exit(0);
        switch (Integer.parseInt(opt)){
            //Programa 1: Rango de numeros primos 
            case 1: 
                System.out.println("Rango de numeros primos:\n");
                String numMin, numMax;
                int contador = 0;
                numMin = JOptionPane.showInputDialog("Limite inferior");
                numMax = JOptionPane.showInputDialog("Limite superior");
                Numero MyNum = new Numero();
                System.out.println("Entre " + numMin + " y " + numMax + " (cerrado)"
                                  + " Existen los sgtes numeros primos:\n");
                for (long i = Long.parseLong(numMin);i<=Long.parseLong(numMax);i++){
                    MyNum.setValue(i);
                    if (MyNum.isPrime()==true){
                        contador +=1 ;
                        System.out.printf(MyNum.getValue() + "\t");
                    }
                }
                System.out.println("\n\nTotal: " + contador + " numeros");
                break;
                
            //Programa 2: Rango de numeros primos
            case 2:
                break;
            default:
                break;
        }
        
    }
               
    
    
}
