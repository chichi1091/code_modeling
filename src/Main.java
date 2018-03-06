import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream.of(Character.values()).forEach(a ->{
                Stream.of(Element.values()).forEach(b-> {
                    Stream.of(Equipment.values()).forEach(c-> {
                        Job fighter = new Fighter(a, b, c);
                        Job magician = new Magician(a, b, c);
                        Job martial = new Martial(a, b, c);

                        System.out.println(a.toString() + "/" + b.toString() + "/" + c.toString());
                        System.out.println("戦士　　：[攻撃力]" + fighter.getOffense()
                                + " [防御力]" + fighter.getDefense()
                                + " [スキル]" + fighter.getSkill().getName());

                        System.out.println("魔法使い：[攻撃力]" + magician.getOffense()
                                + " [防御力]" + magician.getDefense()
                                + " [スキル]" + magician.getSkill().getName());

                        System.out.println("武道家　：[攻撃力]" + martial.getOffense()
                                + " [防御力]" + martial.getDefense()
                                + " [スキル]" + martial.getSkill().getName());
                        System.out.println("------------------------------");
                    });
                });
        });

        test_戦士_男性_風_剣();
        test_戦士_女性_雷_グローブ();

        test_魔法使い_男性_水_杖();
        test_魔法使い_女性_雷_剣();

        test_武道家_男性_風_グローブ();
        test_武道家_女性_水_杖();
    }

    public static void test_戦士_男性_風_剣() {
        System.out.print("[戦士_男性_風_剣]");
        Job test = new Fighter(Character.Male, Element.Wind, Equipment.Sword);
        System.out.print("攻撃力:");
        if(test.getOffense() == 60) System.out.print("OK");
        else System.out.print("NG");

        System.out.print(" 防御力:");
        if(test.getDefense() == 40) System.out.print("OK");
        else System.out.print("NG");

        System.out.print(" スキル：");
        if(Skill.GigaSlash.name().equals(test.getSkill().name())) System.out.println("OK");
        else System.out.println("NG");
    }

    public static void test_戦士_女性_雷_グローブ() {
        System.out.print("[戦士_女性_雷_グローブ]");
        Job test = new Fighter(Character.Female, Element.Thunder, Equipment.Glove);
        System.out.print("攻撃力:");
        if(test.getOffense() == 35) System.out.print("OK");
        else System.out.print("NG");

        System.out.print(" 防御力:");
        if(test.getDefense() == 25) System.out.print("OK");
        else System.out.print("NG");

        System.out.print(" スキル：");
        if(Skill.BigBang.name().equals(test.getSkill().name())) System.out.println("OK");
        else System.out.println("NG");
    }

    public static void test_魔法使い_男性_水_杖() {
        System.out.print("[魔法使い_男性_水_杖]");
        Job test = new Magician(Character.Male, Element.Water, Equipment.Stick);
        System.out.print("攻撃力:");
        if(test.getOffense() == 65) System.out.print("OK");
        else System.out.print("NG");

        System.out.print(" 防御力:");
        if(test.getDefense() == 15) System.out.print("OK");
        else System.out.print("NG");

        System.out.print(" スキル：");
        if(Skill.Begirama.name().equals(test.getSkill().name())) System.out.println("OK");
        else System.out.println("NG");
    }

    public static void test_魔法使い_女性_雷_剣() {
        System.out.print("[魔法使い_女性_雷_剣]");
        Job test = new Magician(Character.Female, Element.Thunder, Equipment.Sword);
        System.out.print("攻撃力:");
        if(test.getOffense() == 45) System.out.print("OK");
        else System.out.print("NG");

        System.out.print(" 防御力:");
        if(test.getDefense() == 40) System.out.print("OK");
        else System.out.print("NG");

        System.out.print(" スキル：");
        if(Skill.Melami.name().equals(test.getSkill().name())) System.out.println("OK");
        else System.out.println("NG");
    }

    public static void test_武道家_男性_風_グローブ() {
        System.out.print("[武道家_男性_風_グローブ]");
        Job test = new Martial(Character.Male, Element.Wind, Equipment.Glove);
        System.out.print("攻撃力:");
        if(test.getOffense() == 70) System.out.print("OK");
        else System.out.print("NG");

        System.out.print(" 防御力:");
        if(test.getDefense() == 50) System.out.print("OK");
        else System.out.print("NG");

        System.out.print(" スキル：");
        if(Skill.Boost.name().equals(test.getSkill().name())) System.out.println("OK");
        else System.out.println("NG");
    }

    public static void test_武道家_女性_水_杖() {
        System.out.print("[武道家_女性_水_杖]");
        Job test = new Martial(Character.Female, Element.Water, Equipment.Stick);
        System.out.print("攻撃力:");
        if(test.getOffense() == 40) System.out.print("OK");
        else System.out.print("NG");

        System.out.print(" 防御力:");
        if(test.getDefense() == 20) System.out.print("OK");
        else System.out.print("NG");

        System.out.print(" スキル：");
        if(Skill.Counter.name().equals(test.getSkill().name())) System.out.println("OK");
        else System.out.println("NG");
    }
}
