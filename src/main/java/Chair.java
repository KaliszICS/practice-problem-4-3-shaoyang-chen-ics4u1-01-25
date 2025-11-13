/**
 * Chair class represents a chair with legs and material.
 * It provides constructors, getters, and setters for all instance variables.
 *
 * @author Shaoyang Chen
 * @version 114.514.1919.8.10
 */

public class Chair {
    private int legs;
    private String material;

    /**
     * Constructs a chair with specified legs and material.
     *
     * @param legs     amount of legs on the chair
     * @param material the material of the chair
     */
    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    /**
     * Constructs a chair with default legs and material. legs = 4, material = wood.
     */

    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }

    /**
     * Constructs a chair with specified legs and default material. material = wood.
     *
     * @param legs amount of legs on the chair
     */
    public Chair(int legs) {
        this.legs = legs;
        this.material = "wood";
    }

    /**
     * Returns the amount of legs of the chair
     *
     * @return the amount of legs of the chair
     */
    public int getLegs() {
        return legs;
    }

    /**
     * Sets the amount of legs of the chair
     *
     * @param legs amount of legs on the chair
     */

    public void setLegs(int legs) {
        this.legs = legs;
    }

    /**
     * Returns the material of the chair
     *
     * @return the material of the chair
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the material of the chair
     *
     * @param material the material of the chair
     */
    public void setMaterial(String material) {
        this.material = material;
    }

}
