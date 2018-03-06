public enum Skill {
    GigaSlash("ギガスラッシュ")
    , BigBang("ビックバン")
    , Begirama("ベギラマ")
    , Melami("メラミ")
    , Boost("ブースト")
    , Counter("カウンター");

    private String name;

    Skill(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
