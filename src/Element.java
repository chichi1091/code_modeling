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

    private int offense;
    private int defense;

    Element(int offense, int defense) {
        this.offense = offense;
        this.defense = defense;
    }

    public int getOffense() {
        return this.offense;
    }

    public int getDefense() {
        return this.defense;
    }
}
