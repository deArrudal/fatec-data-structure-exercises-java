package view;

import java.util.Scanner;

import controller.MusicPlayerControl;
import linkedlist.model.LinkedList;
import model.Song;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        MusicPlayerControl methods = new MusicPlayerControl();

        LinkedList<Song> musicPlayer = new LinkedList<>();

        String prompt = "Vitufy - Music Player\n"
                + "1.Add new Song\n2.Remove Song\n"
                + "3.Start playlist\n9.Quit\n"
                + "Enter option: ";

        String option;

        String songName;
        String songArtist;
        String songDuration;

        int id;

        do {
            System.out.print(prompt);
            option = scan.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Enter song: ");
                    songName = scan.nextLine();
                    System.out.print("Enter artist: ");
                    songArtist = scan.nextLine();
                    System.out.print("Enter duration [s]: ");
                    songDuration = scan.nextLine();
                    methods.addSong(musicPlayer, songName + ";" + songArtist + ";" + songDuration);
                    break;

                case "2":
                    try {
                        musicPlayer.printList();

                        System.out.print("Enter position: ");
                        id = Integer.parseInt(scan.nextLine());

                        if (id < 0 || id > musicPlayer.size()) {
                            System.out.println("Invalid id");
                        } else {
                            methods.removeSong(musicPlayer, id);
                        }
                    } catch (NumberFormatException errInteger) {
                        System.err.println(errInteger);
                    } catch (Exception errList) {
                        System.err.println(errList);
                    }
                    break;

                case "3":
                    try {
                        methods.playSong(musicPlayer);
                    } catch (Exception errList) {
                        System.err.println(errList);
                    }
                    break;

                case "9":
                    System.out.println("Quit");
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (!option.equals("9"));

        scan.close();
    }
}
