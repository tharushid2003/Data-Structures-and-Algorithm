/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InclassActivity;

import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author tharu
 */
public class HashSetSet {
    public HashSetSet() {
        Set<Integer> myset = new HashSet();
        myset.add(4);
        myset.add(6);
        myset.add(5);
        myset.add(1);
        myset.add(4);
        myset.remove(1);
        System.out.println(myset);
    }
    
    public static void main(String[] args) {
        new HashSetSet();
    }
}
