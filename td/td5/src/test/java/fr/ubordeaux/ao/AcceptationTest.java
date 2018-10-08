package fr.ubordeaux.ao;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fr.ubordeaux.ao.domain.model.Reference;
import fr.ubordeaux.ao.domain.type.Price;
import fr.ubordeaux.ao.infrastructure.inmemory.CatalogImpl;

public class AcceptationTest {
	
	CatalogImpl ctlg;
	
	@Before
	public void initialize()
	{
		ctlg = new CatalogImpl();
	}
	
	@Test
	public void testReferenceCatalogue() {
		Reference r = new Reference("id","name","desc",new Price(12));
		ctlg.addReference(r);
		assertEquals("Ajout raté", 1, ctlg.size());
		assertEquals("Recherche non fonctionnelle", r, ctlg.findReferenceById("id"));
	}

}