/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motocicletas;

import java.util.Objects;

/**
 *
 * @author NitroPc
 */
public class ClaseA {
     
    private String marca;
    private String modelo;
    private int potencia;
    private double nivelDeposito; //Litors de combustible que tiene el deposito
    private double consumo;//Litors que consume cada 100 Km

    public ClaseA(String marca, String modelo, int potencia, double nivelDeposito, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.nivelDeposito = nivelDeposito;
        this.consumo = consumo;
    }
    
    public void kilometrosRecorrido(double km){
        double consumido = (km * consumo)/100; 
        if((this.nivelDeposito=- consumido)>0){
            this.nivelDeposito=-consumido;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public float getNivelDeposito() {
        return nivelDeposito;
    }

    public void setNivelDeposito(float nivelDeposito) {
        this.nivelDeposito = nivelDeposito;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "ClaseA{" + "marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", nivelDeposito=" + nivelDeposito + ", consumo=" + consumo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.marca);
        hash = 53 * hash + Objects.hashCode(this.modelo);
        hash = 53 * hash + this.potencia;
        hash = 53 * hash + Float.floatToIntBits(this.nivelDeposito);
        hash = 53 * hash + Float.floatToIntBits(this.consumo);
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
        final ClaseA other = (ClaseA) obj;
        if (this.potencia != other.potencia) {
            return false;
        }
        if (Float.floatToIntBits(this.nivelDeposito) != Float.floatToIntBits(other.nivelDeposito)) {
            return false;
        }
        if (Float.floatToIntBits(this.consumo) != Float.floatToIntBits(other.consumo)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

    
    
    
}
