package fr.ubordeaux.ao.domain.model;

public interface Catalog {
    public boolean addReference(Reference ref);
    public boolean deleteReference(long id);
    public String toString();
}