package Classes;

import java.lang.reflect.Array;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class ChristmasLight {
    private int lightLength;
    private ColourOfLight colourOfLight;
    private HashMap<Integer,LED> leds;
    private double price;

    public ChristmasLight(LengthOfLight lightLength, ColourOfLight colourOfLight) {
        this.lightLength = ledLengthChecker(lightLength);
        this.colourOfLight = colourOfLight;
        this.leds = new HashMap<>();
        for (int i = 0; i <= (this.lightLength * 10); i++)
        {
            if (this.colourOfLight == ColourOfLight.white)
            {
                this.leds.put(i+1,new LED(false, true, true, true));
            } else if (this.colourOfLight == ColourOfLight.purple)
            {
                this.leds.put(i+1,new LED(false, true, true, false));
            }else
            {
                this.leds.put(i+1,new LED(false, true, false, false));
            }
        }
        this.price = priceChecker(colourOfLight);
    }

    public int getLightLength() {
        return lightLength;
    }

    public void setLightLength(int lightLength) {
        this.lightLength = lightLength;
    }

    public ColourOfLight getColourOfLight() {
        return colourOfLight;
    }

    public void setColourOfLight(ColourOfLight colourOfLight) {
        this.colourOfLight = colourOfLight;
    }

    public HashMap<Integer, LED> getLeds() {
        return leds;
    }

    public void setLeds(HashMap<Integer, LED> leds) {
        this.leds = leds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private int ledLengthChecker(LengthOfLight lengthOfLight)
    {
        return switch (lengthOfLight) {
            case FIVE_METER -> 5;
            case TEN_METER -> 10;
            case THIRTY_METER -> 30;
        };
    }

    private double priceChecker(ColourOfLight colourOfLight)
    {
        if (colourOfLight == ColourOfLight.white)
        {
            return (5+(0.03*this.lightLength));
        } else if (colourOfLight == ColourOfLight.purple){
            return (9.50 + (0.08 * this.lightLength));
        } else {
            return (8 + (0.05 * this.lightLength));
        }
    }

    public void turnOnLights()
    {
        for (Map.Entry<Integer, LED> entry : leds.entrySet()){
            LED led = entry.getValue();
            led.setPowerState(true);
        }
    }
}
