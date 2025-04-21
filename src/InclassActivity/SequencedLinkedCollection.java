/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InclassActivity;

import java.util.LinkedList;
import java.util.SequencedCollection;


/**
 *
 * @author tharu
 */
public class SequencedLinkedCollection {
    public SequencedLinkedCollection() {
        SequencedCollection sc = new LinkedList();
        sc.addFirst(3);
        sc.addFirst(6);
        sc.addLast(7);
        System.out.println(sc.getFirst());
        System.out.println(sc.removeLast());
        System.out.println(sc);
        System.out.println(sc.reversed());
    }

    public static void main(String[] args) {
        new SequencedLinkedCollection();
    }
}
