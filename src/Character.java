/**
 * キャラクター
 */
public enum Character {
    /** 男性 */
    Male(5, 0)
    /** 女性 */
    , Female(0, 5);

    private int offens;
    private int defense;

    Character(int offens, int defense) {
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
