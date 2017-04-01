
/**
 *@author JUAN DAVID REYES CORTES
 * @version 1.0.0
 */
public class Television extends Electrodomestico{
    /**
     * atributo que contiene la resolucio de la tv
     */
    private double resolucion;
  
    /**
     * atributo que contiene el si es TDT o no
     */
    private boolean sintonizadortdt;
  
    /**
     * Metodo retorna precio final de la television
     * @return 
     */
    @Override
    public double precioFinal(){
        double precio1=super.precioFinal();
        if (resolucion>40){
            precio1+=precio*0.3;
        }
        if (sintonizadortdt){
            precio1=precio1+50;
        }
  
        return precio1;
    }

    /**
     * Constructor por defecto
     */
     public Television() {
        this.resolucion=20;
        this.sintonizadortdt=false;
    }
    /**
     * constructor con los parametros: 
     * @param precio
     * @param peso 
     */
    public Television(double precio, double peso) {
        super(precio, peso);
    }
    /**
     * Constructor con los parametros:
     * @param resolucion
     * @param sintonizadortdt
     * @param precio
     * @param color
     * @param consumo
     * @param peso 
     */
    public Television(double resolucion, boolean sintonizadortdt, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadortdt = sintonizadortdt;
    }

   
    
}
