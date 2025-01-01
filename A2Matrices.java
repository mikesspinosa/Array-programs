import java.util.Scanner;
public class A2Matrices
{
	public static void main(String[] args) {
	    
	    int f = 3;
	    int c = 3;
	    
        int[][] m = new int[f][c];
        int[][] t = new int[f][c];
        
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++){
            System.out.print("Fila " + (i + 1) + ":" + "\n");
            for (int j = 0; j < 3; j++){
                System.out.print("Ingresa el valor " + (j + 1) + ": ");
                m[i][j] = leer.nextInt();
                t[j][i] = m[i][j];
                
	        }
	        
	        System.out.print("\n");
        }
        System.out.print("Matriz Original:" + "\n");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(m[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        
        System.out.print("Matriz traspuesta:" + "\n");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(t[i][j] + "\t");
            }
            System.out.print("\n");
        }
        
        
    

	}
}
