public class Magician extends Job {

    public Magician(Character character, Element element, Equipment equipment) {
        super(character, element, equipment);
    }

    @Override
    protected JobType getJobType() {
        return JobType.Magician;
    }

    @Override
    protected Skill getSkill() {
        if(character == Character.Male) {
            return Skill.Begirama;
        }
        return Skill.Melami;
    }
}
