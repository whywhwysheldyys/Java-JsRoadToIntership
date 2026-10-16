package alloop.easy.practiceMain;

import alloop.easy.practice.CinemaHall;
import alloop.easy.practice.MovieTicket;

public class MovieMain {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Shrek", 34.5, 5, new CinemaHall(3, "Imax"));

        ticket.printTicketInfo();
    }
}