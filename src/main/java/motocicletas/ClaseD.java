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
public class ClaseD extends claseB{
    private int velocidadMaxima;

    public ClaseD(int velocidadMaxima, int cilindrada, String marca, String modelo, int potencia, double nivelDeposito, double consumo) {
        super(cilindrada, marca, modelo, potencia, nivelDeposito, consumo);
        this.velocidadMaxima = velocidadMaxima;
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
    
    @Override
    public void expectativas(){
        if(super.getCilindrada()>1900){
            System.out.println("Novea loco eso tiene que corre");
        }else{
            System.out.println("Novea que castaña");
        }
    }
    
    public void segunVelocidad(){
        if(velocidadMaxima>200){
            double subidaConsumo = super.getConsumo()*1.90;
            double bajadaDeposito = super.getNivelDeposito()*0.85;
            super.setConsumo(subidaConsumo);
            super.setNivelDeposito(bajadaDeposito);
        }
    }
    
    public int getVelocidadmaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadmaxima(int velocidadmaxima) {
        this.velocidadMaxima = velocidadmaxima;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.velocidadMaxima;
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
        final ClaseD other = (ClaseD) obj;
        if (this.velocidadMaxima != other.velocidadMaxima) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "ClaseD{" + "velocidadMaxima=" + velocidadMaxima + '}';
    }
    
    
}
