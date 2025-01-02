// Version: 1.0 Creada por Miguel Angel Espinosa

import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Restaurante {
    public static void main(String[] args) {

    Stack<String> entregados = new Stack<>();
    Scanner leer = new Scanner(System.in);
    Queue<String> pedidos = new LinkedList<String>();
//Inicializamos las variables
    int f = 9;
    int c = 2;
    int clientes = 0;
    int numero = 0;

    String menu[][] = new String[f][c];

    menu[0][0]= "Chilaquiles";
    menu[1][0]= "Cochinita";
    menu[2][0]= "Hotcakes";
    menu[3][0]= "Hamburguesa";
    menu[4][0]= "Costillas";
    menu[5][0]= "Pollo frito";
    menu[6][0]= "Tacos ";
    menu[7][0]= "Arrachera";
    menu[8][0]= "Quesadilla";

//Incluimos el menu y asignamos.

    for (int i=0; i<f; i++){
        if (i < 3){
            menu[i][1] = "Desayunos";
        }
        if (i >= 3 && i < 6){
            menu[i][1] = "Comida";
        }
        if (i>=6){
            menu[i][1] = "Cena";
        }
    }

    System.out.print("Bienvenido a nuestro restaurante! \n \n");

    for (int i=0; i<f; i++){
        System.out.print((i+1)+ " " + menu[i][0] + "\t" + menu[i][1] + "\n \n");
        }

    System.out.print("Cuantos clientes hay en el restaurante? ");
    clientes = leer.nextInt();

    //Le preguntamos la cantidad de clientes que hay en el restaurante.
    
    for (int i=0; i < clientes; i++){
        System.out.print("\n \n Hola Cliente " + (i+1) +"! Que desea ordenar? Favor de utilizar el NUMERO del menu: ");
        numero = leer.nextInt();
        pedidos.add(menu[(numero - 1)][0]);
    }


    
    for(int i=0; i<numero; i++){
        System.out.print("\n" + pedidos + " pedidos restantes. \n");
        System.out.print("Preparando " + pedidos.peek() + "...\n");
        entregados.push(pedidos.poll());
        }
    
    System.out.print("\n ##################################################");

    System.out.print("\n \n Pedidos por entregar: \n \n" + entregados + "\n \n");
    for(int i=0; i<numero; i++){
        System.out.print("Entregando " + entregados.pop() + "... \n \n");
        if (entregados.isEmpty()){
            System.out.print("\n" + "No hay pedidos restantes");
        } else {
        System.out.print("\n" + entregados + " Pedidos por entregar \n");
        }
    }
//Imprimimos los pedidos.



    }
}

