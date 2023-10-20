package model;

public class Song {
    String nameSong;
    String nameArtist;
    int durationTime;

    public Song(String nameSong, String nameArtist, int durationTime) {
        this.nameSong = nameSong;
        this.nameArtist = nameArtist;
        this.durationTime = durationTime;
    }

    public String displayInfo() {
        return "[Song:" + nameSong + " - Artist:" + nameArtist + " - Duration:" + durationTime + "]";
    }

    @Override
    public String toString() {
        return "[" + nameSong + ", " + nameArtist + "]";
    }
}