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
public class ClaseC extends ClaseA {
    
    private double peso;

    public ClaseC(double peso, String marca, String modelo, int potencia, double nivelDeposito, double consumo) {
        super(marca, modelo, potencia, nivelDeposito, consumo);
        this.peso = peso;
    }

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        return hash;
    }

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

    @Override
    public String toString() {
        return super.toString() + "ClaseC{" + "peso=" + peso + '}';
    }

    
    
    
    
}
