/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ifes.edu.model.Cafe;
import br.ifes.edu.model.FabricaCafe;
import br.ifes.edu.model.FabricaCafeNormal;
import br.ifes.edu.model.Ingrediente;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Leticia
 */
public class CafeTeste extends TestCase {
    
    private FabricaCafeNormal fabricaCafeNormal;
    private FabricaCafe fabricaCafe;
    
	
    @Before
    public void before()
    {
        fabricaCafe = new FabricaCafe();
        fabricaCafeNormal = new FabricaCafeNormal();
    }

    @Test
    public void testFactoryCafe() throws Exception
    {
        
        Cafe cafe = fabricaCafe.fazerCafe("normal");
                //fabricaCafeNormal.criarCafe();
        //Assert.assertNotNull(cafe);
        //Assert.assertSame(Cafe.class, cafe.getClass());
        //Assert.assertSame(Ingrediente.class, cafe.getClass());
        
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
