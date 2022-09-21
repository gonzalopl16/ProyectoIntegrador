/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Luis Gonzalo <https://github.com/gonzalopl16>
 */
public class Matriz {
    public Matriz() {
    }
    
    //Renfactorizando codigo
    public double [][] sumaGlobal(double [][]matriz1, double[][]matriz2, int tamaño){
        double [][] resultado = new double[tamaño][tamaño];
        for(int i = 0; i < resultado.length;i++){
            for(int j = 0; j < resultado[i].length; j++){
                resultado[i][j] = matriz1[i][j]+matriz2[i][j];
            }
        }
        return resultado;
    }
    
    //Prueba mostrar procedimiento
    public String sumaGlobalProcedimiento(double [][]matriz1, double[][]matriz2, int tamaño){
        String acum = "";
        double [][] resultado = new double[tamaño][tamaño];
        for(int i = 0; i < resultado.length;i++){
            for(int j = 0; j < resultado[i].length; j++){
                resultado[i][j] = matriz1[i][j]+matriz2[i][j];
                acum += "resultado["+i+"]["+j+"] = " + matriz1[i][j]+ " + " + matriz2[i][j] + "= " +  resultado[i][j] + "\n";
            }
            acum += "\n";
        }
        acum += "\nResultado: \n" + imprimirMatriz(resultado);
        return acum;
    }
    
    public double [][] restaGlobal(double [][]matriz1, double[][]matriz2, int tamaño){
        double [][] resultado = new double[tamaño][tamaño];
        for(int i = 0; i < resultado.length;i++){
            for(int j = 0; j < resultado[i].length; j++){
                resultado[i][j] = matriz1[i][j]-matriz2[i][j];
            }
        }
        return resultado;
    }
    
    public double [][] multiplicacionGlobal(double [][]matriz1, double[][]matriz2, int tamaño){
        double [][] resultado = new double[tamaño][tamaño];
        for(int i = 0; i < resultado.length;i++){
            for(int j = 0; j < resultado[i].length; j++){
                for(int k = 0; k<resultado.length;k++){
                    resultado[i][j] += matriz1[i][k]*matriz2[k][j];
                }
            }
        }
        return resultado;
    }
    
    /*************************Gauss*****************************/
    //Convirtiendo a 1 la diagonal y rellenando la mitad inferior con 0
//    public double [][] mitadInferior(double [][]matriz){
//        double[][] resultado = matriz;
//        double valorPosicion;
//        for(int i=0; i<resultado.length;i++){
//            valorPosicion = resultado[i][i];
//            for(int j=0;j<resultado[0].length;j++){
//                resultado[i][j]= resultado[i][j]/valorPosicion;
//            }
//            if(i<=resultado.length-2){
//                for(int j=i+1; j<resultado.length;j++){
//                    valorPosicion = resultado[j][i];
//                    for(int k=0;k<resultado.length;k++){
//                        resultado[j][k]=(resultado[j][k]-(valorPosicion- resultado[i][k]));
//                    }
//                }
//            }
//        }
//        return resultado;
//    }
    
    public String imprimirMatriz(double[][]resultado){
        String acum = "";
        for(int i = 0; i < resultado.length;i++){
            for(int j = 0; j < resultado[i].length; j++){
                acum += "[ " + resultado[i][j] + " ]";
            }
            acum+="\n";
        }
        return acum;
    }
}
