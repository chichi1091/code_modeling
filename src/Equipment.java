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

    private int offense;
    private int defense;

    Equipment(int offense, int defense) {
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
