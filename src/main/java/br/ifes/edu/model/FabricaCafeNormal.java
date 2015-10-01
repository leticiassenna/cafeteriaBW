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
public class FabricaCafeNormal extends AbstractFactoryCafe{

    @Override
    public Cafe criarCafe() {
        Cafe cafe = new Cafe();
        cafe.setPreco("2.00");
        
        Ingrediente ingrediente = Ingrediente.CAFE_SOLUVEL;
        ingrediente.setQuantidade("50g");
        cafe.setIngredientes(ingrediente);
        
        ingrediente = Ingrediente.ACUCAR;
        ingrediente.setQuantidade("200g");
        cafe.setIngredientes(ingrediente);
        
        ingrediente = Ingrediente.LEITE;
        ingrediente.setQuantidade("100ml");
        cafe.setIngredientes(ingrediente);
        
        ingrediente = Ingrediente.AGUA;
        ingrediente.setQuantidade("100ml");
        cafe.setIngredientes(ingrediente);
        
        
        return cafe;
    }
    
}
