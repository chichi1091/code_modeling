public class Fighter extends Job {

    public Fighter(Character character, Element element, Equipment equipment) {
        super(character, element, equipment);
    }

    @Override
    protected JobType getJobType() {
        return JobType.Fighter;
    }

    @Override
    protected Skill getSkill() {
        if(character == Character.Male) {
            return Skill.GigaSlash;
        }
        return Skill.BigBang;
    }
}
