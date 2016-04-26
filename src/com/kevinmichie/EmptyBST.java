package com.kevinmichie;


public class EmptyBST<D extends Comparable> implements Tree<D> {

    public EmptyBST(){

    }
    public boolean isEmpty(){
        return true;
    }

    @Override
    public int cadinality() {
        return 0;
    }

    @Override
    public boolean member(D elt) {
        return false;
    }


    @Override
    public NonEmptyBST<D> add(D elt) {
        return new NonEmptyBST<D>(elt);
    }
}
