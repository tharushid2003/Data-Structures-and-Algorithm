/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InclassActivity;

import java.util.PriorityQueue;
import java.util.Queue;


/**
 *
 * @author tharu
 */
public class PriorityQueueQueue {
    public static void main(String[] args) {
        Queue<Integer> pQueue = new PriorityQueue<>();

        pQueue.add(35);
        pQueue.add(20);
        pQueue.add(25);

        System.out.println(pQueue);

        int size = pQueue.size();
        for (int i = 0; i < size; i++) {
            System.out.println(pQueue.poll());
        }
    }
}
    

