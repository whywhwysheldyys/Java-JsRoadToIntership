package second_practice.oop02.composition.practice;

public class RAM {
    private int sizeGb;
    private String type;

    public RAM(int sizeGb, String type) {
        this.sizeGb = sizeGb;
        this.type = type;
    }

    public int getSizeGb() {
        return sizeGb;
    }

    public void setSizeGb(int sizeGb) {
        this.sizeGb = sizeGb;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}