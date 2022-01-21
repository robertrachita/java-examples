package Classes;

import java.util.HashSet;
import java.util.Iterator;

public class Intratuin {
    private HashSet<ChristmasTree> christmasTrees;
    private HashSet<ChristmasLight> christmasLights;
    private HashSet<ChristmasBall> christmasBalls;

    public Intratuin() {
        this.christmasTrees = new HashSet<>();
        this.christmasLights = new HashSet<>();
        this.christmasBalls = new HashSet<>();
    }

    public HashSet<ChristmasTree> getChristmasTrees() {
        return christmasTrees;
    }

    public void setChristmasTrees(ChristmasTree christmasTree) {
        this.christmasTrees.add(christmasTree);
    }

    public HashSet<ChristmasLight> getChristmasLights() {
        return christmasLights;
    }

    public void setChristmasLights(ChristmasLight christmasLight) {
        this.christmasLights.add(christmasLight);
    }

    public HashSet<ChristmasBall> getChristmasBalls() {
        return christmasBalls;
    }

    public void setChristmasBalls(ChristmasBall christmasBall) {
        this.christmasBalls.add(christmasBall);
    }

    public void createInvoice()
    {
        for (ChristmasTree christmasTree : christmasTrees)
        {
            if (christmasTree.getChristmasLight() == null)
            {
                System.out.println(christmasTree.getTreeType() + " - " + "€" + christmasTree.getPrice());
            }else{
                System.out.println(christmasTree.getTreeType() + " (with " + christmasTree.getChristmasLight().getColourOfLight() + " Christmas Lights" + " (" + christmasTree.getChristmasLight().getLightLength() + "m) - €" + christmasTree.getPrice());
            }
        }
        for (ChristmasLight christmasLight : christmasLights)
        {
            System.out.println(christmasLight.getColourOfLight() + " Christmas Lights (" + christmasLight.getLightLength() + "m) - €" + christmasLight.getPrice());
        }
        for (ChristmasBall christmasBall : christmasBalls)
        {
            System.out.println(christmasBall.getBallColour() + " ball - €" + christmasBall.getBallPrice());
        }
    }

    public void turnAllLightsOn()
    {
        for (ChristmasTree christmasTree : christmasTrees)
        {
            if (christmasTree.getChristmasLight() != null){
                christmasTree.getChristmasLight().turnOnLights();
            }
        }
    }

}
