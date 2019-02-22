package session2.furniture.shop;

public class Table extends Furniture {

    private int legCount;


    public Table(int furniturePrice, String furnitureColor, String furnitureBrand, FurnitureMaterial material) {
        super(furniturePrice, furnitureColor, furnitureBrand, material);
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }
}
