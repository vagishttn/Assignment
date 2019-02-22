package session2.furniture.shop;

public class Chair extends Furniture {

    private boolean reclinerChair;
    private boolean rollingChair;


    public Chair(int furniturePrice, String furnitureColor, String furnitureBrand, FurnitureMaterial material) {
        super(furniturePrice, furnitureColor, furnitureBrand, material);
    }

    public boolean isReclinerChair() {
        return reclinerChair;
    }

    public void setReclinerChair(boolean reclinerChair) {
        this.reclinerChair = reclinerChair;
    }

    public boolean isRollingChair() {
        return rollingChair;
    }

    public void setRollingChair(boolean rollingChair) {
        this.rollingChair = rollingChair;
    }
}
