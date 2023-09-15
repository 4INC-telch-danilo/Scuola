/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjarray;

/**
 *
 * @author danilo.telch
 */
public class ArrayInt {
    
    private int[] arrayInt;
    private int dimL;
    
    public ArrayInt (int dimF) {
        this.arrayInt = new int[dimF + dimF*10/100];
        dimL = 0;
    }
    
    public boolean add(int add) {
       boolean risultato = false;
       
       if (!isFull()){
           arrayInt[dimL] = add;
           risultato = true;
           dimL++;
       } 
       return risultato;
    }
    
    public boolean addAll(int[] add) {
        boolean risultato = false;
        if (!isFull() && arrayInt.length-dimL >= add.length){
            
            for (int i = 0; i < add.length; i++)
                arrayInt[dimL+i] = add[i];
            
            dimL += add.length;
            risultato = true;
        } else {
            
            int lunghezza = arrayInt.length + add.length;
            int[] arrayTemp = new int[lunghezza + lunghezza*10/100];
            
            for (int i = 0; i < dimL; i++)
                arrayTemp[i] = arrayInt[i];
            
            for (int i = dimL; i < arrayTemp.length; i++)
                arrayTemp[i] = add[i-dimL];
            
            dimL += add.length;
            risultato = true;
            
        }
        return risultato;
    }
    
    public boolean addFirst(int add) {
        if (!isFull()){
            for (int i = arrayInt.length-1; i > 0; i--){
                arrayInt[i] = arrayInt[i-1];
            }
            arrayInt[0] = add;
            dimL++;
        }
        return isFull();
    }
    
    public boolean addPos (int elem, int pos) {
        boolean risultato = false;
        
        if (!isFull()){
            for (int i = dimL; i > pos; i--)
                arrayInt[i] = arrayInt[i-1];
            arrayInt[pos] = elem;
            dimL++;
            risultato = true;
        } else {
          ensureCapacity(arrayInt.length);
          for (int i = dimL; i > pos; i--)
                arrayInt[i] = arrayInt[i-1];
            arrayInt[pos] = elem;
            dimL++;
            risultato = true;
        }
        return risultato;
    }
    
    public boolean remove(int elem) {
       if (indexOf(elem) != -1){
           removeElem(indexOf(elem));
       } 
       return indexOf(elem) != -1;
    }
    
    public int removeElem(int pos) {
        int valore = arrayInt[pos];
        for (int i = pos; i < dimL-1; i++)
            arrayInt[i] = arrayInt[i+1];
        
        if (isFull()) 
            arrayInt[arrayInt.length] = 0;
        
        dimL--;
        return valore;
    }
    
    public boolean isFull() {
        return dimL == arrayInt.length;
    }
    
    public boolean isEmpty() {
        return dimL == 0;
    }
    
    public int indexOf(int elem) {
        int posizione = -1;
        int i = 0;
        while (i < this.arrayInt.length){
            if (this.arrayInt[i] == elem) {
                posizione = i;
                i = arrayInt.length;
            }
            i++;
        }
        return posizione;  
    }
    
    public int get(int pos){
        return arrayInt[pos];
    }
    
    public void ensureCapacity(int minCapacity){
        if (minCapacity >= arrayInt.length) {
            int[] array = new int[minCapacity + minCapacity*10/100];
            for (int i = 0; i < arrayInt.length; i++)
                array[i] = arrayInt[i];
            arrayInt = array;
        }
    }
    
    public boolean contains(int elem) {
        return indexOf(elem) != -1;       
    }
    
    public int[] cloneArray() {
        int[] cloneArray = new int[arrayInt.length];
        for (int i = 0; i < arrayInt.length; i++)
            cloneArray[i] = arrayInt[i];
        return cloneArray;
    }
    
    
    public int size() {
        return dimL;
    }
    
    
    
    
}
