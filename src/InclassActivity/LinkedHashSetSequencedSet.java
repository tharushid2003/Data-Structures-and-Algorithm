/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InclassActivity;
import java.util.LinkedHashSet;
import java.util.SequencedSet;


/**
 *
 * @author tharu
 */
public class LinkedHashSetSequencedSet {
     public LinkedHashSetSequencedSet() {
        SequencedSet<Integer> myset = new LinkedHashSet<>();
        myset.add(7);
        myset.add(3);
        myset.add(7);
        myset.add(2);
        myset.add(5);
        myset.remove(3);
        System.out.println(myset);
    }
    
    public static void main(String[] args) {
        new LinkedHashSetSequencedSet();
    }
}
    
