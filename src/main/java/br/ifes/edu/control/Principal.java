/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.control;

import br.ifes.edu.model.Cafe;
import br.ifes.edu.model.FabricaCafe;
import br.ifes.edu.view.TelaCafe;

/**
 *
 * @author 20111bsi0161
 */
public class Principal {
    
    public static void main(String [] args) throws Exception{
        FabricaCafe fabricaCafe = new FabricaCafe();
        TelaCafe telaCafe = new TelaCafe();
        
        
        Cafe cafe = fabricaCafe.fazerCafe(telaCafe.telaCafe());
        cafe.getIngredientes();
    }
    
}
