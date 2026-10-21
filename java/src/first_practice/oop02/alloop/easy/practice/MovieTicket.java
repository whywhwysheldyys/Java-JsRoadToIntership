package first_practice.oop02.alloop.easy.practice;

public class MovieTicket {
    private String movieTitle;
    private double price;
    private int seatNumber;
    private CinemaHall hall;

    public MovieTicket(String movieTitle, double price, int seatNumber, CinemaHall hall) {
        this.movieTitle = movieTitle;
        this.price = price;
        this.seatNumber = seatNumber;
        this.hall = hall;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public CinemaHall getHall() {
        return hall;
    }

    public void setHall(CinemaHall hall) {
        this.hall = hall;
    }

    public void printTicketInfo() {
        System.out.println("=== \t Информация о вашем билете \t ===" + "\n"
                            + "Название фильма \t " + movieTitle + "\n"
                            + "Стоимость билета \t " + price + "\n"
                            + "Номер зала \t " + hall.getHallNumber() + "\n"
                            + "Формат фильма \t " + hall.getFormat());
    }
}