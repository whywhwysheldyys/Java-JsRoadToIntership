package first_practice.oop02.alloop.easy.practice;

public class CinemaHall {
    private int hallNumber;
    private String format;

    public CinemaHall(int hallNumber, String format) {
        this.hallNumber = hallNumber;
        this.format = format;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}