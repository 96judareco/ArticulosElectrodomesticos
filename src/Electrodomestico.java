
/**
 * @author JUAN DAVID REYES CORTES 
 * @version 1.0.0
 */
public abstract class Electrodomestico implements IElectrodomestico {
   /**
    * atributo que contiene el precio
    */
    protected double precio;
    /**
     * atributo que contiene el color
     */
    protected String color;
    /**
     * atributo que contiene el consumo
     */
    protected char consumo;
    /**
     * atributo que contiene el peso
     */
    protected double peso;
    
    /**
     * constructor por defecto
     */
    public Electrodomestico(){
        this.precio=100;
        this.color="blanco";
        this.consumo='F';
        this.peso=5;
}
    /**
     * constructor con el atributo peso y precio
     * @param precio
     * @param peso 
     */
    public Electrodomestico(double precio, double peso){
        this.precio=precio;
        this.peso=peso;
    }
    /**
     * constructor con todos los atributos
     * @param precio
     * @param color
     * @param consumo
     * @param peso 
     */

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }
    /**
     * metodo verifica si es una letra segun la condicion planteada
     * 
     */
    
    
    public void comprobarConsumoE(){
          
         if(consumo>=65 && consumo<=70){
            this.consumo=consumo;
        }else{
            this.consumo=consumo;
        }

    }
    
    /**
     * retorna verdadero o falso segun el color
     * @return 
     */
    public static boolean comprobarColor(){
         String coloresD[]={"blanco", "negro", "rojo", "azul", "gris"};
        for(int i=0;i<4;i++){
        if ((coloresD[i]=="blanco")||(coloresD[i]=="negro")||(coloresD[i]=="azul")||(coloresD[i]=="gris")){
            System.out.println("El color es correcto");
        }    
    }
          return true;
    }
    /**
     * metodo retornara el precio con las nuevas condiciones
     * @return 
     */
   
    public double precioFinal(){
         double  precio1=0;
        if (consumo == 'A'){
            precio1=precio1+100;  }
        else if(consumo=='B'){
            precio1=precio1+80; }
        else if(consumo=='C'){
            precio1=precio1+60; }
        else if(consumo=='D'){
            precio1=precio1+50;  }
        else if(consumo=='E'){
            precio1=precio1+30;  }
        else if (consumo=='F'){
            precio1=precio1+10;    }
        if(peso>=0 && peso<=19){
            precio1=precio1+10;  }
        else if(peso>=20 && peso<=49){
            precio1=precio1+50;}
        else if(peso>=50 && peso<=79){
            precio1=precio1+80;}
        else if(peso>=80){
            precio1=precio1+100;} 
       return precio=precio1;
    }
    /**
     * metodo retorna precio
     * @return 
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * metodo retorna color
     * @return 
     */
    public String getColor() {
        return color;
    }
    /**
     * metodo retorna consumo
     * @return 
     */
    public char getConsumo() {
        return consumo;
    }
    /**
     * metodo retorna peso
     * @return 
     */
    public double getPeso() {
        return peso;
    }
    
        
}
    
    
    
