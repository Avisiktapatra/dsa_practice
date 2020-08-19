public class EmojiSupport {

    public static void main(String[]args){
        String bear = "\ud83d\udc3b";
        int bearCodepoint = bear.codePointAt(bear.offsetByCodePoints(0, 0));
        int mysteryAnimalCodepoint = bearCodepoint + 1;

        char mysteryAnimal[] = {Character.highSurrogate(mysteryAnimalCodepoint),
                Character.lowSurrogate(mysteryAnimalCodepoint)};
        System.out.println("The Coderland Zoo's latest attraction: "
                + String.valueOf(mysteryAnimal));
    }
}
