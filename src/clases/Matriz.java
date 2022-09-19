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
    
    /******************************PRIMER PROTOTIPO************************************/
    
    
//    //Suma para matrices de 2x2
//    public int [][] suma2(int M1_0_0, int M1_0_1, int M1_1_0, int M1_1_1, 
//            int M2_0_0, int M2_0_1, int M2_1_0, int M2_1_1){
//            int [][] resultado = new int [2][2];
//            resultado[0][0] = M1_0_0 + M2_0_0;
//            resultado[0][1] = M1_0_1 + M2_0_1;
//            resultado[1][0] = M1_1_0 + M2_1_0;
//            resultado[1][1] = M1_1_1 + M2_1_1;
//        return resultado;
//    }
    
    
    /******************************SEGUNDO PROTOTIPO************************************/
    //Sumar para matrices, pasando como argumentos matrices
    public int [][] suma2x2(int [][]matriz1, int [][]matriz2){
            int [][] resultado = new int [2][2];
            resultado[0][0] = matriz1[0][0] + matriz2[0][0];
            resultado[0][1] = matriz1[0][1] + matriz2[0][1];
            resultado[1][0] = matriz1[1][0] + matriz2[1][0];
            resultado[1][1] = matriz1[1][1] + matriz2[1][1];
        return resultado;
    }
    
    //Suma matrices de 3x3
    public int [][] suma3x3(int [][]matriz1,int [][]matriz2){
            int [][] resultado = new int [3][3];
            resultado[0][0] = matriz1[0][0] + matriz2[0][0];
            resultado[0][1] = matriz1[0][1] + matriz2[0][1];
            resultado[0][2] = matriz1[0][2] + matriz2[0][2];
            resultado[1][0] = matriz1[1][0] + matriz2[1][0];
            resultado[1][1] = matriz1[1][1] + matriz2[1][1];
            resultado[1][2] = matriz1[1][2] + matriz2[1][2];
            resultado[2][0] = matriz1[2][0] + matriz2[2][0];
            resultado[2][1] = matriz1[2][1] + matriz2[2][1];
            resultado[2][2] = matriz1[2][2] + matriz2[2][2];
        return resultado;
    }
    
    //Resta para matrices de 3x3
    public int [][] resta3x3(int [][]matriz1,int [][]matriz2){
            int [][] resultado = new int [3][3];
            resultado[0][0] = matriz1[0][0] - matriz2[0][0];
            resultado[0][1] = matriz1[0][1] - matriz2[0][1];
            resultado[0][2] = matriz1[0][2] - matriz2[0][2];
            resultado[1][0] = matriz1[1][0] - matriz2[1][0];
            resultado[1][1] = matriz1[1][1] - matriz2[1][1];
            resultado[1][2] = matriz1[1][2] - matriz2[1][2];
            resultado[2][0] = matriz1[2][0] - matriz2[2][0];
            resultado[2][1] = matriz1[2][1] - matriz2[2][1];
            resultado[2][2] = matriz1[2][2] - matriz2[2][2];
        return resultado;
    }
    
    //Suma para matrices de 4x4
    public int [][] suma4x4(int [][]matriz1,int [][]matriz2){
            int [][] resultado = new int [4][4];
            resultado[0][0] = matriz1[0][0] + matriz2[0][0];
            resultado[0][1] = matriz1[0][1] + matriz2[0][1];
            resultado[0][2] = matriz1[0][2] + matriz2[0][2];
            resultado[0][3] = matriz1[0][3] + matriz2[0][3];
            resultado[1][0] = matriz1[1][0] + matriz2[1][0];
            resultado[1][1] = matriz1[1][1] + matriz2[1][1];
            resultado[1][2] = matriz1[1][2] + matriz2[1][2];
            resultado[1][3] = matriz1[1][3] + matriz2[1][3];
            resultado[2][0] = matriz1[2][0] + matriz2[2][0];
            resultado[2][1] = matriz1[2][1] + matriz2[2][1];
            resultado[2][2] = matriz1[2][2] + matriz2[2][2];
            resultado[2][3] = matriz1[2][3] + matriz2[2][3];
            resultado[3][0] = matriz1[3][0] + matriz2[3][0];
            resultado[3][1] = matriz1[3][1] + matriz2[3][1];
            resultado[3][2] = matriz1[3][2] + matriz2[3][2];
            resultado[3][3] = matriz1[3][3] + matriz2[3][3];
        return resultado;
    }
    
    //Resta para matrices de 4x4
    public int [][] resta4x4(int [][]matriz1,int [][]matriz2){
            int [][] resultado = new int [4][4];
            resultado[0][0] = matriz1[0][0] - matriz2[0][0];
            resultado[0][1] = matriz1[0][1] - matriz2[0][1];
            resultado[0][2] = matriz1[0][2] - matriz2[0][2];
            resultado[0][3] = matriz1[0][3] - matriz2[0][3];
            resultado[1][0] = matriz1[1][0] - matriz2[1][0];
            resultado[1][1] = matriz1[1][1] - matriz2[1][1];
            resultado[1][2] = matriz1[1][2] - matriz2[1][2];
            resultado[1][3] = matriz1[1][3] - matriz2[1][3];
            resultado[2][0] = matriz1[2][0] - matriz2[2][0];
            resultado[2][1] = matriz1[2][1] - matriz2[2][1];
            resultado[2][2] = matriz1[2][2] - matriz2[2][2];
            resultado[2][3] = matriz1[2][3] - matriz2[2][3];
            resultado[3][0] = matriz1[3][0] - matriz2[3][0];
            resultado[3][1] = matriz1[3][1] - matriz2[3][1];
            resultado[3][2] = matriz1[3][2] - matriz2[3][2];
            resultado[3][3] = matriz1[3][3] - matriz2[3][3];
        return resultado;
    }
    
    
    /******************************TERCER PROTOTIPO************************************/
    
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
    public double [][] mitadInferior(double [][]matriz){
        double[][] resultado = matriz;
        double valorPosicion;
        for(int i=0; i<resultado.length;i++){
            valorPosicion = resultado[i][i];
            for(int j=0;j<resultado[0].length;j++){
                resultado[i][j]= resultado[i][j]/valorPosicion;
            }
            if(i<=resultado.length-2){
                for(int j=i+1; j<resultado.length;j++){
                    valorPosicion = resultado[j][i];
                    for(int k=0;k<resultado.length;k++){
                        resultado[j][k]=(resultado[j][k]-(valorPosicion- resultado[i][k]));
                    }
                }
            }
        }
        return resultado;
    }
    
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
