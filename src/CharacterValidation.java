public class CharacterValidation {
    public static final int MIN_LEVEL = 1;
    public static final int MAX_LEVEL = 100;

    public static void validate(String name, String role, String weapon, int level) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalStateException("Character name is required.");
        }
        if (role == null || role.trim().isEmpty()) {
            throw new IllegalStateException("Character role is required.");
        }
        if (weapon == null || weapon.trim().isEmpty()) {
            throw new IllegalStateException("Character weapon is required.");
        }
        if (level < MIN_LEVEL || level > MAX_LEVEL) {
            throw new IllegalStateException("Level must be between "
                    + MIN_LEVEL + " and " + MAX_LEVEL + ".");
        }
    }
}
