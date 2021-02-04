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
public class claseB extends ClaseA {
    
    private int cilindrada;

    public claseB(int cilindrada, String marca, String modelo, int potencia, double nivelDeposito, double consumo) {
        super(marca, modelo, potencia, nivelDeposito, consumo);
        this.cilindrada = cilindrada;
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
    
    public void expectativas(){
        if(cilindrada>1900){
            System.out.println("Novea loco eso tiene que corre");
        }else{
            System.out.println("Novea que castaña");
        }
    }
    
    public void subidaConsumo(){
        if(cilindrada>1500){
            double subida = super.getConsumo()*1.20;
            super.setConsumo(subida);
        }
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    //Metodos polimorficos
    @Override
    public String toString() {
        
        return super.toString() + "claseB{" + "cilindrada=" + cilindrada + '}';
    }

    

    //Metodos polimorficos
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.cilindrada;
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
        final claseB other = (claseB) obj;
        if (this.cilindrada != other.cilindrada) {
            return false;
        }
        return true;
    }
    
    
}
