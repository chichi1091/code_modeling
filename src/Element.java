/**
 * 属性
 */
public enum Element {
    /** 風 */
    Wind(5, 10)
    /** 水 */
    , Water(10, 5)
    /** 雷 */
    , Thunder(15, 0);

    private int offens;
    private int defense;

    Element(int offens, int defense) {
        this.offens = offens;
        this.defense = defense;
    }

    public int getOffens() {
        return this.offens;
    }

    public int getDefense() {
        return this.defense;
    }
}
