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
        
        //hola esto es unico para el dev version
       //Test box -------------------
     
        //End Test box---------------------------------
        
        switch (Integer.parseInt(opt)){
            case 4: //Programa 4: Decodificacion de Datos
                
                MyNum.setValue(Integer.parseInt((JOptionPane.showInputDialog("Ingresar codigo codificado"))));
                MyNum.getUncodeValue();
                for (int i = 3; i>=0;i--) System.out.print(MyNum.getVectorValue()[i]);
                System.out.println();
                
                
                break;
                
            case 3: //Programa 3: Codificador de Datos
                
                MyNum.setValue(Integer.parseInt((JOptionPane.showInputDialog("Ingresar codigo"))));
                MyNum.setCodeValue();
                for (int i = 3; i>=0;i--) System.out.print(MyNum.getVectorValue()[i]);
                System.out.println();
                break;
                
            case 2: //Programa 2: Promedio de asignatura
                Nota misNotas = new Nota();
                misNotas.setNombre(JOptionPane.showInputDialog("Nombre del estudiante"));
                misNotas.setNumNotas(Integer.parseInt(JOptionPane.showInputDialog("Cantidad de evaluaciones")));
                misNotas.calcular();
                
                break;
            case 7: //Programa 7: Calcular el Euler (e^n)
                System.out.println("7) Calculo de e^n: \n");                
                MyNum.setValue(Double.parseDouble(JOptionPane.showInputDialog("Introducir n, para hallar e^n: ")));
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
                
           default:
                break;
        }
        
    }
               
    
    
}
