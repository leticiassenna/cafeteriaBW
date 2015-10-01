/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.model;

import java.util.ArrayList;

/**
 *
 * @author 20111bsi0161
 */
public class Cafe {
    ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
    String preco;

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public void getIngredientes() {
        for (Ingrediente item: ingredientes){
            
            System.out.println(item.name()+" = "+ item.getQuantidade());
        }
    }

    public void setIngredientes(Ingrediente ingredientes) {
        this.ingredientes.add(ingredientes);
    }
    
    
}
