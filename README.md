# Game Character - Builder Pattern

## Design
- GameCharacter: Product.
- CharacterBuilder: Builder interface.
- CharacterObjectBuilder: ConcreteBuilder for Character object.
- CharacterSheetBuilder: ConcreteBuilder for Character text card.
- CharacterDirector: Director for using builders to build warrior and mage recipes.
- CharacterValidation: checks for required text and level 1-100.
- Main: Main file with usage of both builders.