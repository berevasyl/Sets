package org.sourceit.main;

import org.sourceit.Sets;
import org.sourceit.entities.Box;
import org.sourceit.impl.ArrayListImpl;

/**
 * Main class where you launch code.
 */
public class Main {

    public static void main(String[] args) {
        Sets sets = new ArrayListImpl();

        sets.add(new Box(1, 1, 1));
        sets.add(new Box(2, 2, 2));
        sets.add(new Box(3, 3, 3));

        Sets sets1 = new ArrayListImpl();

        sets1.add(new Box(1, 1, 1));
        sets1.add(new Box(2, 2, 1));
        sets1.add(new Box(3, 3, 3));

        System.out.println(sets.equal(sets1));
    }
}
