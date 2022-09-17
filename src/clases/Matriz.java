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
    private int cont[][];

    public Matriz() {
    }
    
    public Matriz(int[][] cont) {
        this.cont = cont;
    }
    
    //Suma para matrices de 2x2
    public int [][] suma2(int M1_0_0, int M1_0_1, int M1_1_0, int M1_1_1, 
            int M2_0_0, int M2_0_1, int M2_1_0, int M2_1_1){
            int [][] resultado = new int [2][2];
            resultado[0][0] = M1_0_0 + M2_0_0;
            resultado[0][1] = M1_0_1 + M2_0_1;
            resultado[1][0] = M1_1_0 + M2_1_0;
            resultado[1][1] = M1_1_1 + M2_1_1;
        return resultado;
    }
    
    //Resta para matrices de 2x2
    public int [][] resta2(int M1_0_0, int M1_0_1, int M1_1_0, int M1_1_1, 
            int M2_0_0, int M2_0_1, int M2_1_0, int M2_1_1){
            int [][] resultado = new int [2][2];
            resultado[0][0] = M1_0_0 - M2_0_0;
            resultado[0][1] = M1_0_1 - M2_0_1;
            resultado[1][0] = M1_1_0 - M2_1_0;
            resultado[1][1] = M1_1_1 - M2_1_1;
        return resultado;
    }
    
    //Suma matrices de 3x3
    public int [][] suma3(int M1_0_0, int M1_0_1, int M1_0_2, int M1_1_0, int M1_1_1, int M1_1_2, int M1_2_0,int M1_2_1, int M1_2_2,
            int M2_0_0, int M2_0_1, int M2_0_2, int M2_1_0, int M2_1_1, int M2_1_2, int M2_2_0,int M2_2_1, int M2_2_2){
            int [][] resultado = new int [3][3];
            resultado[0][0] = M1_0_0 + M2_0_0;
            resultado[0][1] = M1_0_1 + M2_0_1;
            resultado[0][2] = M1_0_2 + M2_0_2;
            resultado[1][0] = M1_1_0 + M2_1_0;
            resultado[1][1] = M1_1_1 + M2_1_1;
            resultado[1][2] = M1_1_2 + M2_1_2;
            resultado[2][0] = M1_2_0 + M2_2_0;
            resultado[2][1] = M1_2_1 + M2_2_1;
            resultado[2][2] = M1_2_2 + M2_2_2;
        return resultado;
    }
    
    //Resta para matrices de 3x3
    public int [][] resta3(int M1_0_0, int M1_0_1, int M1_0_2, int M1_1_0, int M1_1_1, int M1_1_2, int M1_2_0,int M1_2_1, int M1_2_2,
            int M2_0_0, int M2_0_1, int M2_0_2, int M2_1_0, int M2_1_1, int M2_1_2, int M2_2_0,int M2_2_1, int M2_2_2){
            int [][] resultado = new int [3][3];
            resultado[0][0] = M1_0_0 - M2_0_0;
            resultado[0][1] = M1_0_1 - M2_0_1;
            resultado[0][2] = M1_0_2 - M2_0_2;
            resultado[1][0] = M1_1_0 - M2_1_0;
            resultado[1][1] = M1_1_1 - M2_1_1;
            resultado[1][2] = M1_1_2 - M2_1_2;
            resultado[2][0] = M1_2_0 - M2_2_0;
            resultado[2][1] = M1_2_1 - M2_2_1;
            resultado[2][2] = M1_2_2 - M2_2_2;
        return resultado;
    }
    
    //Resta para matrices de 3x3
    public int [][] suma4(int M1_0_0, int M1_0_1, int M1_0_2, int M1_1_0, int M1_1_1, int M1_1_2, int M1_2_0,int M1_2_1, int M1_2_2,
            int M2_0_0, int M2_0_1, int M2_0_2, int M2_1_0, int M2_1_1, int M2_1_2, int M2_2_0,int M2_2_1, int M2_2_2){
            int [][] resultado = new int [3][3];
            resultado[0][0] = M1_0_0 - M2_0_0;
            resultado[0][1] = M1_0_1 - M2_0_1;
            resultado[0][2] = M1_0_2 - M2_0_2;
            resultado[1][0] = M1_1_0 - M2_1_0;
            resultado[1][1] = M1_1_1 - M2_1_1;
            resultado[1][2] = M1_1_2 - M2_1_2;
            resultado[2][0] = M1_2_0 - M2_2_0;
            resultado[2][1] = M1_2_1 - M2_2_1;
            resultado[2][2] = M1_2_2 - M2_2_2;
        return resultado;
    }
    
    public int[][] getCont() {
        return cont;
    }

    public void setCont(int[][] cont) {
        this.cont = cont;
    }
}
