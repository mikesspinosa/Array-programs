import java.util.Random;
public class ArreglosEnterosE4
{
	public static void main(String[] args) {
	    
    
    int f = 80;
    float fix;
    float suma = 0.0f;
    float promedio = 0.0f;
    int mayor = 0;
    int menor = 0;
    
    float arreglo[] = new float[f];
    
    Random rand = new Random();
    
    for (int i=0; i< f; i++){
        arreglo[i] = rand.nextFloat() * 10.0f;
        suma += arreglo[i];
        
        }
    
    promedio = (suma/f);    
    
    for (int i=0; i< f - 1; i++){
        for (int k= i + 1; k<f; k++){
            if (arreglo[i] > arreglo[(k)]){
                fix = arreglo[k];
                arreglo[k] = arreglo[i];
                arreglo[i] = fix;
                }
            }
        }
    System.out.print("Calificación mas alta: " + String.format("%.1f" ,  arreglo[(f - 1)]) + "\n");
    System.out.print("Calificación mas baja: " + String.format("%.1f" ,  arreglo[0]) + "\n");
    System.out.print("Promedio de las calificaciones: " + String.format("%.1f" ,  promedio) + "\n");
    
    for (int i=0; i< f; i++){
        if (arreglo[i] < 6.0f){
            menor++;
        }
        if (arreglo[i] > 8.5f){
            mayor++;
        }
    }
    System.out.print("Calificaciones arriba de 8.5: " + mayor + "\n");
    System.out.print("Calificaciones abajo de 6.0: " + menor + "\n");
    
    
        }
	}

