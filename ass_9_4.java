/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 6student107
 */
import java.util.LinkedList;


public class ass_9_4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        // Find the middle node
        int middleIndex = list.size() / 2;
        Integer middleNode = list.get(middleIndex);

        // Output the middle node
        System.out.println("Middle Node: " + middleNode);
    }
}