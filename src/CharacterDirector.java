public class CharacterDirector {
    private static final String WARRIOR_NAME = "Arthur";
    private static final String WARRIOR_ROLE = "Warrior";
    private static final String WARRIOR_WEAPON = "Sword";
    private static final int WARRIOR_LEVEL = 10;

    private static final String MAGE_NAME = "Merlin";
    private static final String MAGE_ROLE = "Mage";
    private static final String MAGE_WEAPON = "Staff";
    private static final int MAGE_LEVEL = 15;

    public void makeWarrior(CharacterBuilder builder) {
        builder.setName(WARRIOR_NAME)
                .setRole(WARRIOR_ROLE)
                .setWeapon(WARRIOR_WEAPON)
                .setLevel(WARRIOR_LEVEL);
    }

    public void makeMage(CharacterBuilder builder) {
        builder.setName(MAGE_NAME)
                .setRole(MAGE_ROLE)
                .setWeapon(MAGE_WEAPON)
                .setLevel(MAGE_LEVEL);
    }
}
