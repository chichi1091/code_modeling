public class Martial extends Job {

    public Martial(Character character, Element element, Equipment equipment) {
        super(character, element, equipment);
    }

    @Override
    protected Skill getSkill() {
        if (Character.Male.equals(character)) return Skill.Boost;
        return Skill.Counter;
    }

    @Override
    protected int getOffenseCorrection() {
        int correction = 0;
        if(Element.Wind.equals(element)) correction += 20;
        if(Equipment.Glove.equals(equipment)) correction += 20;
        return correction;
    }

    @Override
    protected int getDefenseCorrection() {
        if(Equipment.Glove.equals(equipment)) return 20;
        return 0;
    }
}