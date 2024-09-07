
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 6student107
 */

import java.util.LinkedList;


public class ass_9_3 {
    public static void main(String[] args) {
        LinkedList<String> movies = new LinkedList<>();
        
        movies.add("Inception");
        movies.add("The Matrix");
        movies.add("Interstellar");
        movies.add("The Dark Knight");

        System.out.println("Movies List: " + movies);

        movies.addFirst("The Shawshank Redemption");
        movies.addLast("Fight Club");

        System.out.println("Updated Movies List: " + movies);

        movies.remove("Interstellar");
        System.out.println("After Removing Interstellar: " + movies);

        System.out.println("First Movie: " + movies.getFirst());
        System.out.println("Last Movie: " + movies.getLast());
    }
}

