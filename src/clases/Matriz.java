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

    //Prueba mostrar procedimiento
    public String sumaGlobalProcedimiento(double[][] matriz1, double[][] matriz2, int tamaño) {
        String acum = "";
        acum += "------------------------------------------------\n";
        double[][] resultado = new double[tamaño][tamaño];
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                acum += "resultado[" + i + "][" + j + "] = " + matriz1[i][j] + " + " + matriz2[i][j] + " = " + resultado[i][j] + "\n";
            }
            acum += "\n";
        }
        acum += "\nResultado: \n" + imprimirMatriz(resultado);
        return acum;
    }

    public String restaGlobal(double[][] matriz1, double[][] matriz2, int tamaño) {
        String acum = "";
        acum += "------------------------------------------------\n";
        double[][] resultado = new double[tamaño][tamaño];
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
                acum += "resultado[" + i + "][" + j + "] = " + matriz1[i][j] + " - " + matriz2[i][j] + " = " + resultado[i][j] + "\n";
            }
            acum += "\n";
        }
        acum += "\nResultado: \n" + imprimirMatriz(resultado);
        return acum;
    }

    public String multiplicacionProcedimiento(double[][] matriz1, double[][] matriz2, int tamaño) {
        String acum = "";
        acum += "------------------------------------------------\n";
        double[][] resultado = new double[tamaño][tamaño];
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                acum += "resultado[" + i + "][" + j + "] = ";
                for (int k = 0; k < resultado.length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                    if (k == resultado.length - 1) {
                        acum += matriz1[i][k] + " * " + matriz2[k][j] + " * " + resultado[k][j] + "\n";
                    } else {
                        acum += matriz1[i][k] + " * " + matriz2[k][j] + " * " + resultado[k][j] + "+";
                    }
                }
            }
            acum += "\n";
        }
        acum += "\nResultado: \n" + imprimirMatriz(resultado);
        return acum;
    }

    public double[][] multiplicacion(double[][] matriz1, double[][] matriz2, int tamaño) {
        double[][] resultado = new double[tamaño][tamaño];
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                for (int k = 0; k < resultado.length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return resultado;
    }

    /**
     * ***********************Gauss****************************
     */
    //Llenando matriz identidad
    public double[][] matrizIdentidad(int tamaño) {
        double[][] identidad = new double[tamaño][tamaño];
        for (int i = 0; i < identidad.length; i++) {
            for (int j = 0; j < identidad.length; j++) {
                if (i == j) {
                    identidad[i][j] = 1;
                } else {
                    identidad[i][j] = 0;
                }
            }
        }
        return identidad;
    }

    //Reducción por renglones
    public double[][] reduccion(double[][] matriz, int tamaño) {
        double[][] identidad = matrizIdentidad(tamaño);
        double aux, pivote;
        for (int i = 0; i < matriz.length; i++) {
            pivote = matriz[i][i];
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = matriz[i][j] / pivote;
                identidad[i][j] = identidad[i][j] / pivote;
            }
            for (int j = 0; j < matriz.length; j++) {
                if (i != j) {
                    aux = matriz[j][i];
                    for (int k = 0; k < matriz.length; k++) {
                        matriz[j][k] = (matriz[j][k] - (aux * matriz[i][k]));
                        identidad[j][k] = (identidad[j][k] - (aux * identidad[i][k]));
                    }
                }
            }
        }
        return identidad;
    }

    //División de Matrices
    public double[][] división(double[][] matriz1, double[][] matriz2, int tamaño) {
        //inversa de matriz2
        double[][] resultado = new double[tamaño][tamaño];
        double[][] matriz2Inversa = reduccion(matriz2, tamaño);
        resultado = multiplicacion(matriz1, matriz2Inversa, tamaño);
        return resultado;
    }

    //reducción con procedimiento
    public String reduccionProcedimiento(double[][] matriz, int tamaño) {
        String acum = "";
        int contador = 0;
        double[][] identidad = matrizIdentidad(tamaño);
        acum += "La Matriz que se operará será: \n" + imprimirMatriz(matriz) + " \nLa matriz identidad será: \n" + imprimirMatriz(identidad);
        double aux, pivote;
        acum += "Primero conertimos la matriz resultado en la matriz identidad:\n";
        while (contador <= 1) {
            for (int i = 0; i < matriz.length; i++) {
                pivote = matriz[i][i];
                acum += "El pivote será:\n"
                        + pivote + "\n\nOperando en la fila\n";
                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = matriz[i][j] / pivote;
                    identidad[i][j] = identidad[i][j] / pivote;
                    if (contador == 0) {
                        acum += "M[" + i + " , " + j + "] = " + matriz[i][j] + "÷" + pivote + "\n";
                    } else {
                        acum += "Identidad[" + i + " , " + j + "] = " + identidad[i][j] + "÷" + pivote + "\n";
                    }
                }
                for (int j = 0; j < matriz.length; j++) {
                    if (i != j) {
                        aux = matriz[j][i];
                        acum += "El auxiliar será:\n" + aux + "\n";
                        for (int k = 0; k < matriz.length; k++) {
                            matriz[j][k] = (matriz[j][k] - (aux * matriz[i][k]));
                            identidad[j][k] = (identidad[j][k] - (aux * identidad[i][k]));
                            if (contador == 0) {
                                acum += "M[" + j + " , " + k + "] = ( " + matriz[i][k] + " - ( " + aux + " × " + matriz[i][k] + " )) = "+ matriz[j][k] + "\n";
                            } else {
                                 acum += "Identidad[" + j + " , " + k + "] = ( " + identidad[i][k] + " - ( " + aux + " × " + identidad[i][k] + " )) = "+ identidad[j][k]+"\n";
                            }
                        }
                    }
                }
                acum += "\n";
            }
            if(contador == 0){
                acum += "Ahora el mismo procedimiento se realizará en la matriz identidad\n"; 
            }
            contador++;
        }
        acum += "\nLa matriz inversa será:\n" + imprimirMatriz(identidad);
        return acum;
    }

    public String imprimirMatriz(double[][] resultado) {
        String acum = "";
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                acum += "[ " + resultado[i][j] + " ]";
            }
            acum += "\n";
        }
        return acum;
    }
}
