/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipodearreglo;

/**
 *
 * @author Yosiney Mora
 */
public class TipodeArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    public static void tipo(){
        int [] arreglo ={4,3,2,1};
        boolean esAscendente =true;
        boolean esDecendente= true;
        int i=1;
        while(i<arreglo.length){
            if(!(arreglo[i]==arreglo[i-1]+1)){
                esAscendente=false;
            }
            if(!(arreglo[i]==arreglo[i-1]-1)){
                esDecendente=false;
            }
            i++;
        }
        if(esAscendente)
            System.out.println("Ascendente");
        else if (esDecendente) {
            System.out.println("Descendente");
        }else{
            System.out.println("No cumple ninguna");
        }
    }
}
