/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motocicletas;

import java.util.ArrayList;

/**
 *
 * @author NitroPc
 */
public class Prueba {
    public static void main(String[] args) {
        
        ClaseA a1 = new ClaseA("yamaha","jog",4,10,2);
        ClaseA a2 = new ClaseA("yamaha","mt",45,20,3);
        
        claseB b1 = new claseB(1200,"honda","cbr",34,18,3.5);
        claseB b2 = new claseB(2000,"suzuki","hdj",32,12,5);
        
        ClaseC c1 = new ClaseC(220,2000,"kawasaki","h2",50,15,5);
        ClaseC c2 = new ClaseC(80,49,"piaggio","zip",4,10,2);
        
        ClaseD d1 = new ClaseD(50,80,"piaggio","zip",4,10,2);
        ClaseD d2 = new ClaseD(50,80,"yamaha","tmx",4,10,2);
        
        ArrayList <ClaseA> listaClase = new ArrayList<>();
        // Conversiones implícitas entre la jerarquía
        listaClase.add(a1);
        listaClase.add(a2);
        listaClase.add(b1);
        listaClase.add(b2);
        listaClase.add(c1);
        listaClase.add(c2);
        listaClase.add(d1);
        listaClase.add(d2);
        
        System.out.println("-----------------------------");
        for (ClaseA aux : listaClase) {
            // Conversiones explícitas
           if (aux instanceof claseB){
               ((claseB) aux).subidaConsumo();
           }
           if (aux instanceof ClaseC){
               ((ClaseC) aux).nivelDepositoSubida();
           }
           if (aux instanceof ClaseD){
               ((ClaseD) aux).segunVelocidad();
           }
           
           aux.kilometrosRecorrido(500);
           
        }
        
        String honda = "honda";
        
        
        
    }
}
