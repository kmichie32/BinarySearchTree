package com.kevinmichie;

public interface Tree <D extends Comparable>{

    public boolean isEmpty();
    public int cadinality();
    public boolean member(D elt);
    public NonEmptyBST<D> add(D elt);
}
