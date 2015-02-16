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
        
        Numero MyNum = new Numero(); //numero en cuestión
        
        
        //Test box -------------------
        /*
        Console console = System.console();
        String [] anArray = new String[3];

        Numero miNum = new Numero();
        miNum.setValue(9);
        System.out.println(miNum.factorial());
        System.out.println(miNum.factorial(7));
        System.exit(0);
        
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
        //} do while (deacuerdo == false);
        System.out.println(vector[vector.length-1] + "}");
        
        
        anArray[1] = JOptionPane.showInputDialog("Colocar los porcentajes separados por coma");
        
        
        
        
        for (int i=1;i<=200;i+=6) System.out.println(i + "\t= " + MyNum.euler(i)+"\t");
        */
        //lSystem.out.println(MyNum.euler(5));
        
        //System.exit(0);
        
        //End Test box---------------------------------
        
        switch (Integer.parseInt(opt)){
            case 3:
                
                break;
                
            case 2: //Programa 2: Promedio de asignatura
                Nota misNotas = new Nota();
                misNotas.setNombre(JOptionPane.showInputDialog("Nombre dle estudiante"));
                misNotas.setNumNotas(Integer.parseInt(JOptionPane.showInputDialog("Cantidad de evaluaciones")));
                misNotas.calcular();
                
                break;
            case 7: //Programa 7: Calcular el Euler (e)
                System.out.println("7) Calculo de e^n: \n");                
                MyNum.setValue(Long.parseLong(JOptionPane.showInputDialog("Introducir n, para hallar e^n: ")));
                System.out.println("e^" + MyNum.getValue() + " = " + MyNum.euler(MyNum.getValue()));
                
                break;
            case 6: //Programa 6: Constante Euler (e)
                System.out.println("6) Constante Euler (e) = " + MyNum.euler());
                
                break;
            case 5: //Programa 5: Factorial de un numero
                System.out.println("5) Factorial de un numero\n");
                MyNum.setValue(Long.parseLong(JOptionPane.showInputDialog("Factorial de: ")));
                System.out.println(MyNum.getValue() + "! = " + MyNum.factorial());
                
                break;
            case 1: //Programa 1: Rango de numeros primos
                System.out.println("1) Rango de numeros primos:\n");
                String numMin, numMax;
                int contador = 0;
                numMin = JOptionPane.showInputDialog("Limite inferior");
                numMax = JOptionPane.showInputDialog("Limite superior");
                
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
            default:
                break;
        }
        
    }
               
    
    
}
