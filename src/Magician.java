public class Magician extends Job {

    public Magician(Character character, Element element, Equipment equipment) {
        super(character, element, equipment);
    }

    @Override
    protected Skill getSkill() {
        if(Character.Male.equals(character)) return Skill.Begirama;
        return Skill.Melami;
    }

    @Override
    protected int getOffenseCorrection() {
        if(Equipment.Stick.equals(equipment)) return 20;
        return 0;
    }

    @Override
    protected int getDefenseCorrection() {
        if(Element.Thunder.equals(element)) return 5;
        return 0;
    }
}
