package session2.furniture.shop;

public abstract class Furniture {

    private int furniturePrice;
    private String furnitureColor;
    private String furnitureBrand;

    private FurnitureMaterial material;

    public int getFurniturePrice() {
        return furniturePrice;
    }

    public void setFurniturePrice(int furniturePrice) {
        this.furniturePrice = furniturePrice;
    }

    public String getFurnitureColor() {
        return furnitureColor;
    }

    public void setFurnitureColor(String furnitureColor) {
        this.furnitureColor = furnitureColor;
    }

    public String getFurnitureBrand() {
        return furnitureBrand;
    }

    public void setFurnitureBrand(String furnitureBrand) {
        this.furnitureBrand = furnitureBrand;
    }

    public FurnitureMaterial getMaterial() {
        return material;
    }

    public void setMaterial(FurnitureMaterial material) {
        this.material = material;
    }

    public Furniture(int furniturePrice, String furnitureColor, String furnitureBrand, FurnitureMaterial material) {
        this.furniturePrice = furniturePrice;
        this.furnitureColor = furnitureColor;
        this.furnitureBrand = furnitureBrand;
        this.material = material;
    }
}
