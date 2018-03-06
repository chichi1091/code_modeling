public class Martial extends Job {

    public Martial(Character character, Element element, Equipment equipment) {
        super(character, element, equipment);
    }

    @Override
    protected JobType getJobType() {
        return JobType.Martial;
    }

    @Override
    protected Skill getSkill() {
        if(character == Character.Male) {
            return Skill.Boost;
        }
        return Skill.Counter;
    }
}
