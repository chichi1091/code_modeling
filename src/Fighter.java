public class Fighter extends Job {

    public Fighter(Character character, Element element, Equipment equipment) {
        super(character, element, equipment);
    }

    @Override
    protected Skill getSkill() {
        if(Character.Male.equals(character)) return Skill.GigaSlash;
        return Skill.BigBang;
    }

    @Override
    protected int getOffenseCorrection() {
        if(Equipment.Sword.equals(equipment)) return 20;
        return 0;
    }

    @Override
    protected int getDefenseCorrection() {
        if(Element.Water.equals(element)) return 10;
        return 0;
    }
}
