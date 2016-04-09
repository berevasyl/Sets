package org.sourceit.impl;

import org.sourceit.Sets;
import org.sourceit.entities.Box;

import javax.swing.text.html.HTMLDocument;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetImpl implements Sets {

    Set storage = new HashSet();
    int count = 0;

    @Override
    public boolean equal(Sets sets) {
        return false;
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
        Iterator iterator = storage.iterator();
        if (count != 0) {
            return (Box) iterator.next();/*get(--count);*/
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
//        Collections.sort(this.storage);
    }
}
