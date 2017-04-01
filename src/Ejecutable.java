
import java.util.Scanner;

/**
 *@author JUAN DAVID REYES CORTES 
 * @version 1.0.0
 */
public class Ejecutable {
    
    public static void main(String[] args) {
   
        
        Electrodomestico Articulo[]=new Electrodomestico[10];
        Scanner x = new Scanner(System.in);
        Articulo[0]=new Lavadora(6, 100, "azul", 'A', 15);
        System.out.println(Articulo[0].precioFinal()+" Euros es el costo lavadota ");
        Articulo[1]=new Lavadora(20, 80, "verde", 'B', 48);
        System.out.println(Articulo[1].precioFinal()+" Euros es el costo lavadora ");
        Articulo[2]=new Television(40, false, 60, "negro", 'C', 50);
        System.out.println(Articulo[2].precioFinal()+" Euros es el costo television ");
        Articulo[3]=new Television(30, false ,10, "gris", 'F', 13);
        System.out.println(Articulo[3].precioFinal()+" Euros es el costo television ");
        Articulo[4]=new Television(60, false, 30, "gris", 'E', 20);
        System.out.println(Articulo[4].precioFinal()+" Euros es el costo television ");
        Articulo[5]=new Lavadora(14, 80, "blanco", 'B', 40);
        System.out.println(Articulo[5].precioFinal()+" Euros es el costo lavadora  ");
        Articulo[6]=new Television(25, false, 100, "rojo", 'A', 75);
        System.out.println(Articulo[6].precioFinal()+"Euros  es el costo televion ");
        Articulo[7]=new Lavadora(40, 50, "verde", 'D', 80);
        System.out.println(Articulo[7].precioFinal()+" Euros es el costo lavadotra ");
        Articulo[8]=new Television(42, false, 50, "naranja", 'D', 52);
        System.out.println(Articulo[8].precioFinal()+"costo  televisionen ");
        Articulo[9]=new Television(50, false, 10, "naranja", 'F', 18);
        System.out.println(Articulo[9].precioFinal() +" Euros es el costo television en ");
        
        /**
         * impresion de los resultados 
         */
        System.out.println("El costo total de la compra  de lavadoras en euros es:");
        System.out.println(Articulo[0].precioFinal()+Articulo[1].precioFinal()+Articulo[5].precioFinal()+Articulo[7].precioFinal()+" ");
        System.out.println("El costo total de la compra  de Televisores en euros es:");
        System.out.println(Articulo[2].precioFinal()+Articulo[3].precioFinal()+Articulo[4].precioFinal()+Articulo[6].precioFinal()+Articulo[8].precioFinal()+Articulo[9].precioFinal()+" ");
        System.out.println("El costo total de la compra todos los articulos en euros es:");
        System.out.println(Articulo[0].precioFinal()+Articulo[1].precioFinal()+Articulo[2].precioFinal()+Articulo[3].precioFinal()+Articulo[4].precioFinal()+Articulo[5].precioFinal()+Articulo[6].precioFinal()+Articulo[7].precioFinal()+Articulo[8].precioFinal()+Articulo[9].precioFinal()+" ");
    }
}
