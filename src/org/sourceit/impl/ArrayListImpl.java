package org.sourceit.impl;

import org.sourceit.Sets;
import org.sourceit.entities.Box;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListImpl implements Sets {

    List storage = new ArrayList();
    int count = 0;


    @Override
    public boolean equal(Sets sets) {
        sets.sort();
        boolean equals = true;
        Box temp = null;
        while ((temp = sets.getBox()) != null) {
            if(!(equals = temp.equals(this.getBox()))) {
                break;
            }
        }
        sets.reset();
        return equals;
    }

    @Override
    public Sets sum(Sets sets) {
        return null;
    }

    @Override
    public Sets product(Sets sets) {
        return null;
    }

    @Override
    public Sets difference(Sets sets) {
        return null;
    }

    @Override
    public Sets symmetricDifference(Sets sets) {
        return null;
    }

    @Override
    public void add(Box box) {
        storage.add(box);
        count++;
    }

    @Override
    public Box getBox() {
        if (count != 0) {
            return (Box) storage.get(--count);
        }
        return null;
    }

    @Override
    public int size() {
        return storage.size();
    }

    @Override
    public void reset() {
        count = storage.size() - 1;
    }

    @Override
    public void sort() {
        Collections.sort(this.storage);
    }
}
