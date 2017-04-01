
/**
 *@author JUAN DAVID REYES CORTES
 * @version 1.0.0
 */
public class Lavadora extends Electrodomestico {
    /**
     * atributo que contiene la carga de la lavadora
     */
    protected double carga;
    /**
     * constructor por defecto
     */
     public Lavadora(){
        this.carga=5;
    }
    /**
     * constructor con parametros :
     * @param precio
     * @param peso 
     */
    public Lavadora(double precio, double peso) {
        super(precio, peso);
    }
    /**
     * constructor con parametros :
     * @param carga
     * @param precio
     * @param color
     * @param consumo
     * @param peso 
     */
    public Lavadora(double carga, double precio, String color, char consumo, double peso){
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    /**
     * Metodo retorna la carga de la lavadora
     * @return
     */
    public double getCarga() {
        return carga;
    }

    /**
     * Metodo retorna Precio final de la lavadora
     * @return precio final de la lavadora
     */
    @Override
    public double precioFinal() {
        double precio1=super.precioFinal();
        if (carga>30){
            precio1+=50;
        }
        return precio1;
    }
    
}
