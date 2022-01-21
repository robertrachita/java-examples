import Classes.*;

public class Main {

    public static void main(String[] args) {
        WhiteBall whiteBall = new WhiteBall(3);
        NordmannTree nordmannTree = new NordmannTree(20);
        NordwaySpruceTree nordwaySpruceTree = new NordwaySpruceTree(10);
        ChristmasLight christmasLight = new ChristmasLight(LengthOfLight.TEN_METER, ColourOfLight.white);
        nordwaySpruceTree.setChristmasLight(christmasLight);
        Intratuin intratuin = new Intratuin();
        intratuin.setChristmasTrees(nordmannTree);
        intratuin.setChristmasTrees(nordwaySpruceTree);
        intratuin.setChristmasBalls(whiteBall);
        intratuin.setChristmasLights(christmasLight);
        intratuin.createInvoice();
        System.out.println(christmasLight.getLightLength());
        for (int i =0; i<= christmasLight.getLightLength(); i++)
        {
            System.out.println(christmasLight.getLeds().get(i+1).isPowerState());
        }

        intratuin.turnAllLightsOn();
        for (int i =0; i<= christmasLight.getLightLength(); i++)
        {
            System.out.println(christmasLight.getLeds().get(i+1).isPowerState());
        }

    }
}
