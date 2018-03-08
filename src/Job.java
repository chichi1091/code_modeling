public abstract class Job {
    protected Character character;
    protected Element element;
    protected Equipment equipment;

    public Job(Character character, Element element, Equipment equipment) {
        this.character = character;
        this.element = element;
        this.equipment = equipment;
    }

    protected abstract Skill getSkill();
    protected abstract int getOffenseCorrection();
    protected abstract int getDefenseCorrection();

    public int getOffense() {
        return character.getOffense()
                + element.getOffense()
                + equipment.getOffense()
                + getOffenseCorrection();
    }

    public int getDefense() {
        return character.getDefense()
                + element.getDefense()
                + equipment.getDefense()
                + getDefenseCorrection();
    }
}
