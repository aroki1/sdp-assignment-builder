public class Main {
    public static void main(String[] args) {
        CharacterDirector director = new CharacterDirector();
        CharacterObjectBuilder objectBuilder = new CharacterObjectBuilder();
        CharacterSheetBuilder sheetBuilder = new CharacterSheetBuilder();

        director.makeWarrior(objectBuilder);
        GameCharacter warrior = objectBuilder.getResult();
        director.makeWarrior(sheetBuilder);
        System.out.println(warrior);
        System.out.println(sheetBuilder.getResult());
        System.out.println();

        director.makeMage(objectBuilder);
        GameCharacter mage = objectBuilder.getResult();
        director.makeMage(sheetBuilder);
        System.out.println(mage);
        System.out.println(sheetBuilder.getResult());
        System.out.println();

        System.out.println("Original warrior: " + warrior);

        try {
            new CharacterObjectBuilder().getResult();
        } catch (IllegalStateException exception) {
            System.out.println("Validation error: " + exception.getMessage());
        }
    }
}
