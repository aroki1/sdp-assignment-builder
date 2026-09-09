public class CharacterObjectBuilder implements CharacterBuilder {
    private String name;
    private String role;
    private String weapon;
    private int level;

    @Override
    public CharacterObjectBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public CharacterObjectBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    @Override
    public CharacterObjectBuilder setWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    @Override
    public CharacterObjectBuilder setLevel(int level) {
        this.level = level;
        return this;
    }

    public GameCharacter getResult() {
        CharacterValidation.validate(name, role, weapon, level);
        return new GameCharacter(name, role, weapon, level);
    }
}
