package fr.ubordeaux.ao.domain.model;

import java.rmi.server.UID;

public class Reference {
	private static long _cptid = 0;
	private long _id;
	public long get_id() {
		return _id;
	}

	public String get_nom() {
		return _nom;
	}

	public String get_description() {
		return _description;
	}

	public double get_prix() {
		return _prix;
	}

	private String _nom;
	private String _description;
	private double _prix;
	
	public Reference(String nom, String desc, double prix)
	{
		_id = _cptid;
		_cptid++;
		_nom = nom;
		_description = desc;
		_prix = prix;
	}
	
	@Override
	public String toString()
	{
		return _id + " : " + _nom + " ; " + _description + " ; " + _prix;
	}
}