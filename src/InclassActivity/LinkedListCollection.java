/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InclassActivity;

import java.util.LinkedList;
import java.util.Collection;

/**
 *
 * @author tharu
 */
public class LinkedListCollection {
    public LinkedListCollection(){
        Collection c = new LinkedList();
        c.add(7);
        c.add(2);
        System.out.println(c.isEmpty());
        System.out.println(c.size());
        System.out.println(c.contains(5));
        c.remove(5);
        System.out.println(c);
    }

    public static void main(String[] args) {
        new LinkedListCollection();
    }
    }
    

