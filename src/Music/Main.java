package Music;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static ArrayList<Album> albums = new ArrayList<Album>();

    public static void printList(LinkedList<Song> playList){
        System.out.println("--------------------------");

        Iterator<Song> iterator = playList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    public static void main(String[] args){
        Album album_1 = new Album("Purpose", "Justin Bieber");
        album_1.addSong("One love", 3.5);
        album_1.addSong("Love yourself", 4.2);
        album_1.addSong("Sorry", 3);
        album_1.addSong("Sorry", 3);

        albums.add(album_1);

        Album album_2 = new Album("Relapse", "Eminem");
        album_2.addSong("Not afraid", 4);
        album_2.addSong("Rap god", 3.8);

        albums.add(album_2);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Sorry", playList);
        albums.get(0).addToPlaylist("sSorry", playList);
        albums.get(1).addToPlaylist("Not afraid", playList);

        printList(playList);
    }
}
