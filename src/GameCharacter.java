public final class GameCharacter {
    private final String name;
    private final String role;
    private final String weapon;
    private final int level;

    GameCharacter(String name, String role, String weapon, int level) {
        this.name = name;
        this.role = role;
        this.weapon = weapon;
        this.level = level;
    }

    public String getName() { return name; }
    public String getRole() { return role; }
    public String getWeapon() { return weapon; }
    public int getLevel() { return level; }

    @Override
    public String toString() {
        return "GameCharacter[name=" + name + ", role=" + role
                + ", weapon=" + weapon + ", level=" + level + "]";
    }
}
