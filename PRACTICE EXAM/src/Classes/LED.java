package Classes;

public class LED {
    private boolean powerState;
    private boolean redDiode;
    private boolean blueDiode;
    private boolean greenDiode;

    public LED(boolean powerState, boolean redDiode, boolean blueDiode, boolean greenDiode) {
        this.powerState = powerState;
        this.redDiode = redDiode;
        this.blueDiode = blueDiode;
        this.greenDiode = greenDiode;
    }

    public boolean isPowerState() {
        return powerState;
    }

    public void setPowerState(boolean powerState) {
        this.powerState = powerState;
    }

    public boolean isRedDiode() {
        return redDiode;
    }

    public void setRedDiode(boolean redDiode) {
        this.redDiode = redDiode;
    }

    public boolean isBlueDiode() {
        return blueDiode;
    }

    public void setBlueDiode(boolean blueDiode) {
        this.blueDiode = blueDiode;
    }

    public boolean isGreenDiode() {
        return greenDiode;
    }

    public void setGreenDiode(boolean greenDiode) {
        this.greenDiode = greenDiode;
    }
}
