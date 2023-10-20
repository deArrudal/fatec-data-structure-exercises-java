package controller;

import linkedlist.model.LinkedList;
import model.Song;

public class MusicPlayerControl {
    public MusicPlayerControl() {
        super();
    }

    public void addSong(LinkedList<Song> musicPlayer, String song) {
        String[] songData = song.split(";");

        try {
            musicPlayer.addLast(new Song(songData[0], songData[1], Integer.parseInt(songData[2])));
            System.out.println("Song added");

        } catch (NumberFormatException errInteger) {
            System.err.println(errInteger);
        } catch (Exception errList) {
            System.err.println(errList);
        }
    }

    public void removeSong(LinkedList<Song> musicPlayer, int id) {
        try {
            musicPlayer.remove(id);
            System.out.println("Song removed");

        } catch (Exception errList) {
            System.err.println(errList);
        }
    }

    public void playSong(LinkedList<Song> musicPlayer) throws Exception {
        if (musicPlayer.isEmpty()) {
            throw new Exception("Empty playlist");
        }

        Song playingSong;
        while (!musicPlayer.isEmpty()) {
            playingSong = musicPlayer.removeFirst();
            System.out.println(playingSong.displayInfo());

            Thread.sleep(1000);
        }
    }
}
