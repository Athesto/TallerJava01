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
public class Nota {
    Console console = System.console();
    
    private String Nombre;
    private int numNotas;
    public float[] ListaNotas;
    public float[] ListaPesos;
    private float valPromedio = 0;
    private final String [] Resultado;

    public Nota() {
        this.Resultado = new String[]{"Reprobado", "Aprobado"};
    }

    
    
    public void calcular(){
        int i;
        System.out.println("\nCalculo para el Estudiante: " + Nombre);
        setPesos();
        System.out.println("\n");
        setNotas();
        promedio();
        if (valPromedio >= 2.95) i = 1; else i= 0;
        System.out.println("\nEl estudiante "+ Nombre + " a " + Resultado[i] + 
                " con promedio de " + valPromedio);
    
    }
    private void setPesos (){
        ListaPesos = new float[numNotas]; 
        for (int i = 0;i<numNotas;i++)
            ListaPesos[i]= Float.parseFloat(console.readLine("Peso de Nota " + i+1 + ": "));            
        
    }    
    private void setNotas (){
        ListaNotas = new float[numNotas]; 

        for (int i = 0;i<numNotas;i++)
            ListaNotas[i]= Float.parseFloat(console.readLine("Valor de Nota " + i + ": "));            
        
    }

    private float promedio(){
        float totalPesos = 0;
        for (int i = 0; i < this.numNotas;i++){
            valPromedio+= ListaPesos[i]*ListaNotas[i];
            totalPesos += ListaPesos[i];
        }
        valPromedio = valPromedio/totalPesos;
    return valPromedio;
    }
    
    public int getNumNotas() {
        return numNotas;
    }

    public void setNumNotas(int numNotas) {
        this.numNotas = numNotas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
