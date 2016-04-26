package com.kevinmichie;

public class NonEmptyBST<D extends Comparable> implements Tree<D> {

    // root is the data
    D data;
    Tree<D> left;
    Tree<D> right;



    public NonEmptyBST(D elt) {
        data = elt;
        left = new EmptyBST<D>();
        right = new EmptyBST<D>();
    }

    public NonEmptyBST(D elt, Tree<D> leftTree, Tree<D> rightTree){
        data = elt;
        left = leftTree;
        right = rightTree;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cadinality() {
        return 1 + left.cadinality() + right.cadinality();
    }

    @Override
    public boolean member(D elt) {
        if (data == elt){
            return true;
        }else {
            if( elt.compareTo(data) < 0){
                return left.member(elt);
            }else {
                return right.member(elt);
            }
        }
    }

    @Override
    public NonEmptyBST<D> add(D elt) {
        if (data == elt){
            return this;
        } else {
            if (elt.compareTo(data) < 0){
                return new NonEmptyBST(data,left.add(elt), right);
            }else{
                return new NonEmptyBST(data, left, right.add(elt));
            }
        }
    }
}
