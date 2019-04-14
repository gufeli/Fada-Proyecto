/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author ASERWEB
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int f = 6;
        int c = 5;
        int mat1[][] = new int[f][c];
        int mat2[][] = new int[f][c];
        //int mat2[][]= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        //int resul[][]=new int[3][3];
        int ofi = 10;
        int paq1 = 1;
        int paq2 = 2;
        int paq3 = 3;
        int paq4 = 4;
        int paq5 = 5;
        int paq6 = 6;
        mat1[1][3] = ofi;
        mat1[0][4] = paq1;
        mat1[2][0] = paq2;
        mat1[4][1] = paq3;
        mat1[5][0] = paq4;
        mat1[5][4] = paq5;
        mat1[2][2] = paq6;

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                //mat1[f][c]=a;  
                //a++;
                int a = i + 1;
                int b = j + 1;
                //System.out.println("["+a+"]"+"["+b+"]"+" = "+"["+mat1[i][j]+"]");
            }
        }
        //int dis=Math.abs(mat1[1][3]-mat1[0][4]);
        //System.out.println("Valor oficina = "+mat1[1][3]);
        //System.out.println("Valor paquete 1 = "+mat1[0][4]);
        //System.out.println("Valor distancia = "+dis);
        path(1, 3);
    }

    public static void path(int currentX, int currentY) {
        int f = 6;
        int c = 5;
        int mat1[][] = new int[f][c];
        int mat2[][] = new int[f][c];
        //int mat2[][]= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        //int resul[][]=new int[3][3];
        int ofi = 10;
        int paq1 = 1;
        int paq2 = 2;
        int paq3 = 3;
        int paq4 = 4;
        int paq5 = 5;
        int paq6 = 6;
        mat1[1][3] = ofi;
        mat1[0][4] = paq1;
        mat1[2][0] = paq2;
        mat1[4][1] = paq3;
        mat1[5][0] = paq4;
        mat1[5][4] = paq5;
        mat1[2][2] = paq6;
        int[][] ratings = new int[6][5];
        int value = 0;
        for (int i = 0; i < ratings.length; i++) {
            value = Math.abs(i - currentX);
            for (int j = 0; j < ratings[i].length; j++) {
                ratings[i][j] = value + Math.abs(j - currentY);
            }
        }
        System.out.println("Paquete: " + mat1[0][4] + " Distancia: " +ratings[0][4]);
        System.out.println("Paquete: " + mat1[2][0] + " Distancia: " +ratings[2][0]);
        System.out.println("Paquete: " + mat1[4][1] + " Distancia: " +ratings[4][1]);
        System.out.println("Paquete: " + mat1[5][0] + " Distancia: " +ratings[5][0]);
        System.out.println("Paquete: " + mat1[5][4] + " Distancia: " +ratings[5][4]);
        System.out.println("Paquete: " + mat1[2][2] + " Distancia: " +ratings[2][2]);
    }
    
}
