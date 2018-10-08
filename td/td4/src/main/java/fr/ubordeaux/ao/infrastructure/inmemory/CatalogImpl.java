package fr.ubordeaux.ao.infrastructure.inmemory;

import java.util.ArrayList;

import fr.ubordeaux.ao.domain.model.Catalog;
import fr.ubordeaux.ao.domain.model.Reference;

public class CatalogImpl implements Catalog {

	private static ArrayList<Reference> _refs = new ArrayList<>();
	
	
	@Override
	public boolean addReference(Reference ref) {
		Reference looking = null;
		for(Reference r : _refs)
			if(r.get_id() == ref.get_id())
			{
				looking = r;
				break;
			}
		if(looking == null)
		{
			_refs.add(ref);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteReference(long id) {
		Reference looking = null;
		for(Reference r : _refs)
			if(r.get_id() == id)
			{
				looking = r;
				break;
			}
		if(looking != null)
		{
			_refs.remove(looking);
			return true;
		}
		return false;
		
	}
	
	@Override
	public String toString()
	{
		StringBuilder stb = new StringBuilder();
		for(Reference r : _refs)
			stb.append(r.toString()).append("\n");
		return stb.toString();
	}
    
}