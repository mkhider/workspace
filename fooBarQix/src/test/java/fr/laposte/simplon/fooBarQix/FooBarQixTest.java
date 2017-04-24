package fr.laposte.simplon.fooBarQix;

import static org.junit.Assert.*;

import org.junit.Test;

public class FooBarQixTest {
	private final FooBarQix fooBarQix = new FooBarQix();
	@Test
	public void calculerCorrespondance_doit_renvoyer_1_pour_1(){
		//given
		int entier =1;
		//When
		String resultat = fooBarQix.calculerCorrespondance(entier);
		//Then
		assertEquals("1",resultat);
	
	}

	//
	
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
public void calculerCorrespondance_doit_renvoyer_Qix_pour_7(){
	
		
		//given
		FooBarQix fooBarQix = new FooBarQix();
		int entier = 7;
	
		//when
		String resultat = fooBarQix.calculerCorrespondance(entier);
		
		//then
		if(!"Qix".equals(resultat)){
			fail("ça ne marche pas comme prévu: renvoie " + resultat);
		
		}
		
	}
	@Test
	//@Ignore : pour ignorer la suite des tests
	
public void calculerCorrespondance_doit_renvoyer_Foo_pour_3(){
		
		//given
		FooBarQix fooBarQix = new FooBarQix();
		int entier = 3;
	
		//when
		String resultat = fooBarQix.calculerCorrespondance(entier);
		
		//then
		if(!"Foo".equals(resultat)){
			fail("ça ne marche pas comme prévu: renvoie " + resultat);
		
		}
}
@Test
public void calculerCorrespondance_doit_renvoyer_Bar_pour_5() {
	
	//given
	FooBarQix fooBarQix = new FooBarQix();
	int entier = 5;

	//when
	String resultat = fooBarQix.calculerCorrespondance(entier);
	
	//then
	if(!"Bar".equals(resultat)){
		fail("ça ne marche pas comme prévu: renvoie " + resultat);
}

}
}

