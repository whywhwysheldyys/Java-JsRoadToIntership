package alloop.medium.practice;

public class Reader {
    private String readerId;
    private String fullName;

    public Reader(String readerId, String fullName) {
        this.readerId = readerId;
        this.fullName = fullName;
    }

    public String getReaderId() {
        return readerId;
    }

    public void setReaderId(String readerId) {
        this.readerId = readerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}