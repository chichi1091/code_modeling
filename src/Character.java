/**
 * キャラクター
 */
public enum Character {
    /** 男性 */
    Male(5, 0)
    /** 女性 */
    , Female(0, 5);

    private int offense;
    private int defense;

    Character(int offense, int defense) {
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
