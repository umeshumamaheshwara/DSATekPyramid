package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleSongs {

    public static void main(String[] args) {

        int[] songs = {1, 2, 3, 4, 5};

        List<Integer> playlist = new ArrayList<>();

        for (int song : songs) {
            playlist.add(song);
        }
        Collections.shuffle(playlist);

        System.out.println("Songs played in random order:");
        for (int song : playlist) {
            System.out.print(song + " ");
        }
    }
}


