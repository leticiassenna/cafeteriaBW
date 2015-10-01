/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.model;

import br.ifes.edu.model.AbstractFactoryCafe;

/**
 *
 * @author 20111bsi0161
 */
public class FabricaCafe {

    public Cafe fazerCafe(String cafe) throws Exception {
        
        AbstractFactoryCafe fabricaCafe  = null;
                
        try {
            if (cafe.equals("normal")) {
                System.out.println("Cafe Normal");
                fabricaCafe = new FabricaCafeNormal();
            }
            if (cafe.equals("cappuccino")) {
                System.out.println("Cafe Cappuccino");
                fabricaCafe = new FabricaCafeCappuccino();
            }
            if (cafe.equals("descafeinado")) {
                System.out.println("Cafe Descafeinado");
                fabricaCafe = new FabricaCafeDescafeinado();
            }
            return fabricaCafe.criarCafe();
        } catch (Exception e) {
            throw new Exception("Invalido");
        }

    }
}
