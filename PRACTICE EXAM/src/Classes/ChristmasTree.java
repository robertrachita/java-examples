package Classes;


public abstract class ChristmasTree {
    private String treeType;
    private double treeHeight;
    private ChristmasLight christmasLight;
    private double price;


    public ChristmasTree(String treeType, double treeHeight, double price) {
        this.treeType = treeType;
        this.treeHeight = treeHeight;
        this.price = price;
    }

    public String getTreeType() {
        return treeType;
    }

    public void setTreeType(String treeType) {
        this.treeType = treeType;
    }

    public double getTreeHeight() {
        return treeHeight;
    }

    public void setTreeHeight(double treeHeight) {
        this.treeHeight = treeHeight;
    }

    public ChristmasLight getChristmasLight() {
        return christmasLight;
    }

    public void setChristmasLight(ChristmasLight christmasLight) {
        this.christmasLight = christmasLight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}