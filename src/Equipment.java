/**
 * 装備
 */
public enum Equipment {
    /** 剣 */
    Sword(30, 30)
    /** 杖 */
    , Stick(30, 10)
    /** グローブ */
    , Glove(20, 20);

    private int offens;
    private int defense;

    Equipment(int offens, int defense) {
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
