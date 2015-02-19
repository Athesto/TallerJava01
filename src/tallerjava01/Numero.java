/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerjava01;

/**
 *
 * @author Gustavo
 */
public class Numero {
    private long value = 1; //Valor del numero
    private long codeValue;
    private final int iteracion = 100; //valor de iteración
    private int [] vectorValue;
    

    public void setCodeValue() {
        int[] valorPreCodificado;
        makeArray();
        valorPreCodificado = getVectorValue();
        for (int i = 0;i<4;i++){
            if (valorPreCodificado[i] >=3) valorPreCodificado[i]-=3;
            else valorPreCodificado[i]+=7;
        }
        valorPreCodificado = swapVector(valorPreCodificado,0,2);
        valorPreCodificado = swapVector(valorPreCodificado,1,3);
        setVectorValue(valorPreCodificado);        
    }
    public void getUncodeValue() {
        makeArray();
        int[] valorDecodificado = getVectorValue();
        valorDecodificado = swapVector(valorDecodificado,0,2);
        valorDecodificado = swapVector(valorDecodificado,1,3);
        
        for (int i = 0;i<4;i++){
            if (valorDecodificado[i] <=6) valorDecodificado[i]+=3;
            else valorDecodificado[i]-=7;
        }
        setVectorValue(valorDecodificado);        
    }
    
    
    
    public int[] swapVector(int[] vector, int FromSlot, int ToSlot){
        int tmp;
        tmp = vector[ToSlot];
        vector[ToSlot] = vector[FromSlot];
        vector[FromSlot] = tmp;
        return vector;
    
    }
    
    
    public void makeArray(){
        int[] b = new int[4];
        b[0]= (int)value;
        b[1]=(b[0]/10);b[0]=(b[0]%10);
        b[2]=(b[1]/10);b[1]=(b[1]%10);
        b[3]=(b[2]/10);b[2]=(b[2]%10);
        vectorValue = b;
    }
    
    
    
    public int[] includevalue(int[] vectorIn, int value){
        int[] vectorOut = new int[vectorIn.length+1];
        System.arraycopy(vectorIn, 0, vectorOut, 0, vectorIn.length);
        vectorOut[vectorOut.length-1] = value;
        return vectorOut;
    }
    
    public int[] divnum10 (int value){
        int[] vector = new int[2];
        vector[0] = value/10;
        vector[1] = value%10;
        return vector;
    
    }
    
    public int mod10(int value){
        return value%10;        
    }

    public double euler(){
        return euler(1, this.iteracion);
    }

    public double euler(double variable){
            return euler(variable, this.iteracion);
    }
    
    public double euler(double variable,int iteracion){
        if (iteracion==0){
            return 1;
        } else {
            return (expoint(variable,iteracion)/factorial(iteracion) + euler(variable,iteracion-1));
        }        
    }
    
    public double expoint(double base, int exponente){
        if (exponente ==0) return 1;
        else return base * expoint(base,exponente-1);
    }
    
    public float factorial(){
        if (value == 0) {
            return 1;
        } else {
            return value * factorial(value-1);
        }
    }
      
    public float factorial(float value){
        if (value == 0) {
            return 1;
        } else {
            return value * factorial(value-1);
        }
    }
        
             
    public  boolean isPrime() {
        long n=value;
    if (n <= 3) {
        return n > 1;
    } else if (n % 2 == 0 || n % 3 == 0) {
        return false;
    } else {
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}



    public void setCodeValue(long codeValue) {
        this.codeValue = codeValue;
    }

/**
 *  Retorna el valor que tiene el numero
 * 
 * @return 
 */
    public long getValue() {
        return value;
    }
/**
 * Se define el valor del numero (entero)
 * @param value 
 */
    public void setValue(long value) {
        this.value = value;
    }

    public int[] getVectorValue() {
        return vectorValue;
    }

    public void setVectorValue(int[] vectorValue) {
        this.vectorValue = vectorValue;
    }
    
}
