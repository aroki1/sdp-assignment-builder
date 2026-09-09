public class CharacterSheetBuilder implements CharacterBuilder {
    private String name;
    private String role;
    private String weapon;
    private int level;

    @Override
    public CharacterSheetBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public CharacterSheetBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    @Override
    public CharacterSheetBuilder setWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    @Override
    public CharacterSheetBuilder setLevel(int level) {
        this.level = level;
        return this;
    }

    public String getResult() {
        CharacterValidation.validate(name, role, weapon, level);
        return "=== Character Sheet ===\n"
                + "Name: " + name + "\n"
                + "Role: " + role + "\n"
                + "Weapon: " + weapon + "\n"
                + "Level: " + level;
    }
}
