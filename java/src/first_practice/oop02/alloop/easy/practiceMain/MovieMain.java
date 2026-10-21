package first_practice.oop02.alloop.easy.practiceMain;

import first_practice.oop02.alloop.easy.practice.CinemaHall;
import first_practice.oop02.alloop.easy.practice.MovieTicket;

public class MovieMain {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Shrek", 34.5, 5, new CinemaHall(3, "Imax"));

        ticket.printTicketInfo();
    }
}