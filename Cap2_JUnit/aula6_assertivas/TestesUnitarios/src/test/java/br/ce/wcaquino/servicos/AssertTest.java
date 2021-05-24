package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;


public class AssertTest {
	
	@Test
	public void test() {
		
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		Assert.assertEquals("Erro comparacao",1, 1);
		Assert.assertEquals(0.512, 0.512844, 0.001);
		
		int i = 5;
		Integer i2 = 5;
		
		Assert.assertEquals(Integer.valueOf(i), i2);
		Assert.assertEquals(i, i2.intValue());
		
		
		Assert.assertEquals("bola", "bola");
		Assert.assertEquals("bola", "bola");
		Assert.assertNotEquals("bola", "tijolo");
		
		Assert.assertTrue("bola".equalsIgnoreCase("bola"));
		Assert.assertTrue("bola".startsWith("bo"));
		
		
		Usuario u1 = new Usuario("user1");
		Usuario u2 = new Usuario("user1");
		Usuario u3 = u2;
		Usuario u4 = null;
		
		Assert.assertEquals(u1, u1);
		
		Assert.assertSame(u1, u1); //verifica se sao da mesma instancia
		Assert.assertSame(u3, u2);
		Assert.assertNotSame(u1, u2);
		
		
		Assert.assertTrue(u3 == null);
		Assert.assertNull(u3);
		Assert.assertNotNull(u1);
		
	}

}
