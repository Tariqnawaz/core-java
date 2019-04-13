package DesignPattern.prototype.Movie;

public interface PrototypeCapable extends Cloneable{
    public PrototypeCapable clone() throws CloneNotSupportedException;
}