package session2.furniture.shop;

public class FurnitureMaterial {

    private String materialType;
    private String fireBehaviour;
    private String stressBehaviour;

    public String getMaterialType() {
        return materialType;
    }

    public FurnitureMaterial(String materialType, String fireBehaviour, String stressBehaviour) {
        this.materialType = materialType;
        this.fireBehaviour = fireBehaviour;
        this.stressBehaviour = stressBehaviour;
    }

    public String getFireBehaviour() {
        return fireBehaviour;
    }

    public void setFireBehaviour(String fireBehaviour) {
        this.fireBehaviour = fireBehaviour;
    }

    public String getStressBehaviour() {
        return stressBehaviour;
    }

    public void setStressBehaviour(String stressBehaviour) {
        this.stressBehaviour = stressBehaviour;
    }
}
