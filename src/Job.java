public abstract class Job {
    protected Character character;
    protected Element element;
    protected Equipment equipment;

    public Job(Character character, Element element, Equipment equipment) {
        this.character = character;
        this.element = element;
        this.equipment = equipment;
    }

    protected abstract JobType getJobType();
    protected abstract Skill getSkill();

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

    /**
     * 攻撃力補正
     * @return
     */
    private int getOffenseCorrection() {
        int correction = 0;

        if(element == Element.Wind && getJobType() == JobType.Martial) {
            correction += 20;
        }

        if(equipment == Equipment.Sword && getJobType() == JobType.Fighter) {
            correction += 20;
        } else if(equipment == Equipment.Stick && getJobType() == JobType.Magician) {
            correction += 20;
        } else if(equipment == Equipment.Glove && getJobType() == JobType.Martial) {
            correction += 20;
        }

        return correction;
    }

    /**
     * 防御力補正
     * @return
     */
    private int getDefenseCorrection() {
        int correction = 0;

        if(element == Element.Water && getJobType() == JobType.Fighter) {
            correction += 10;
        }else if(element == Element.Thunder && getJobType() == JobType.Magician) {
            correction += 5;
        }

        if(equipment == Equipment.Glove && getJobType() == JobType.Martial) {
            correction += 20;
        }

        return correction;
    }
}
