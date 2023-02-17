package examen1_oliveriraheta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Examen1_OliverIraheta {

    static Scanner rm = new Scanner(System.in);
    static ArrayList<Object> list = new ArrayList();
    static int[][] matriz = new int[4][5];

    public static void main(String[] args) throws Exception {
        Racional rac = new Racional(100, 200);
        rac.simpli(rac);
        System.out.println(rac.getNumerador());
        System.out.println(rac.getDenominador());
        
        /*
        llenarMatriz();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println(Arrays.toString(backtracking(matriz, 0)));
*/
//        char opc = 'a';
//        while (opc != 'g') {
//            System.out.print("""
//                                                         MENU
//                               a-	Probar el método Recursivo.
//                               b-	Agregar al arrayList un nuevo conjunto de complejos y n elementos a dicho conjunto
//                               c-	Simplificar el racional de un imaginario de algún complejo de uno de los conjuntos 
//                               d-	Unir dos conjuntos del arraylist y guardar dicho conjunto en el mismo arrayList
//                               e-	Sumar dos números complejos de cualquier conjunto del arraylist
//                               f-	Imprimir todos los conjuntos del arrayList
//                               g-	salir
//                               -> """);
//            rm = new Scanner(System.in);
//            opc = rm.next().toLowerCase().charAt(0);
//            switch (opc) {
//                case 'a' ->
//                    System.out.println(backtracking(matriz, 0, 0));
//                case 'f'-> {
//                    for (Object o : list) {
//                        System.out.println(o);
//                    }
//                }
//            }
//        }

    }

    public static int[] min_cols(int[][] matrix) {
        int[] min_cols = new int[matrix[0].length];
        Arrays.fill(min_cols, Integer.MAX_VALUE);
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] < min_cols[col]) {
                    min_cols[col] = matrix[row][col];
                }
            }
        }
        return min_cols;
    }

    public static void llenarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 2 * (i + 2) + (j + 2);
            }
        }
    }

    public static int min(int[] col, int p) {
        int min = 0;
        if (p == col.length - 1) {
            return col[p];
        } else {
            min = min(col, p + 1);
            if (col[p] < min) {
                return col[p];
            } else {
                return min;
            }
        }
    }

    public static int[] backtracking(int[][] matriz, int y) {

        ArrayList<Integer> numMin;
        if (y == matriz[0].length - 1) {
            numMin = new ArrayList();
            for (int i = 0; i < matriz[0].length-1; i++) {
                numMin.add(matriz[i][y]);
            }
            return matriz[0];
        } else {
            numMin = new ArrayList();
            for (int i = 0; i < matriz[0].length-1; i++) 
                numMin.add(matriz[i][y]);            
            matriz[0][y]= Collections.min(numMin);
        }

        
        return backtracking(matriz, y+1);
    }

}
