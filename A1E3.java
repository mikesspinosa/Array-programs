import java.util.Random;
public class A1E3
{
	public static void main(String[] args) {
	    
	    int f = 10;
	    int fix = 0;
	    int j = 0;
        int arreglo[] = new int[f];
        
        Random rand = new Random();
        
        for (int i=0; i< f; i++){
            
            arreglo[i] = rand.nextInt(100);
            
        }

        for (int i=0; i< f - 1; i++){
            for (int k= i + 1; k<f; k++){
                if (arreglo[i] > arreglo[(k)]){
                    fix = arreglo[k];
                    arreglo[k] = arreglo[i];
                    arreglo[i] = fix;
                    }
                }
            }
            
        System.out.print("Arreglo en orden ascendente: " + "\n");
        for (int i=0; i<f; i++){
            System.out.print(arreglo[i] + "\t");
        }
            
        
        for (int i=0; i< f - 1; i++){
            for (int k= i + 1; k<f; k++){
                if (arreglo[i] < arreglo[(k)]){
                    fix = arreglo[k];
                    arreglo[k] = arreglo[i];
                    arreglo[i] = fix;
                    }
                }
            }
        
            

        System.out.print("\n" + "\n" + "Arreglo en orden descendente: " + "\n");
        
        for (int i=0; i<f; i++){
            System.out.print(arreglo[i] + "\t");
        }
        
	}
}
