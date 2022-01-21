package Classes;

public abstract class ChristmasBall {
    private int ballDiameter;
    private String ballColour;
    private double ballPrice;

    public ChristmasBall(int ballDiameter, String ballColour, double ballPrice) {
        this.ballDiameter = ballDiameter;
        this.ballColour = ballColour;
        this.ballPrice = ballPrice;
    }

    public int getBallDiameter() {
        return ballDiameter;
    }

    public void setBallDiameter(int ballDiameter) {
        this.ballDiameter = ballDiameter;
    }

    public String getBallColour() {
        return ballColour;
    }

    public void setBallColour(String ballColour) {
        this.ballColour = ballColour;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }
}
