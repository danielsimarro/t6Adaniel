/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motocicletas;

/**
 *
 * @author NitroPc
 */
public class ClaseC extends claseB {
    
    private double peso;

    public ClaseC(double peso, int cilindrada, String marca, String modelo, int potencia, double nivelDeposito, double consumo) {
        super(cilindrada, marca, modelo, potencia, nivelDeposito, consumo);
        this.peso = peso;
    }

    
    //Metodos polimorficos
    @Override
    public void kilometrosRecorrido(double km) {
        double consumido = ((km * super.getConsumo()) / 100) - super.getNivelDeposito() ;
        if ((consumido) > 0) {
            super.setNivelDeposito(super.getNivelDeposito()-consumido);
            System.out.println("Se han realizado los km indicados en la motocicleta");
        } else {
            System.out.println("No se han podidio realizar los km indicados, ya que no hay conbustible suficiente en la motocicleta");
        }

    }
    //Metodos polimorficos
    @Override
    public void expectativas(){
        if(super.getCilindrada()>200){
            System.out.println("Novea loco eso tiene que corre");
        }else{
            System.out.println("Novea que castaña");
        }
    }
    
    public void nivelDepositoSubida(){
        if(peso>1500){
            double subida = super.getNivelDeposito()*1.5;
            super.setNivelDeposito(subida);
        }
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    //Metodos polimorficos
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        return hash;
    }
    //Metodos polimorficos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClaseC other = (ClaseC) obj;
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        return true;
    }
    //Metodos polimorficos
    @Override
    public String toString() {
        return super.toString() +"ClaseC{" + "peso=" + peso + '}';
    }

    
    
    
    
}
