package ranwidplus.interfaces;

public class MyOwnDialogueClass {

    public static String getDialogueForPotion(String potionID) {
        String dialogue = null;

        dialogue = ColorlessDialogue.getPotionDialogue(potionID);
        if(dialogue != null) return dialogue;

        dialogue = IroncladDialogue.getPotionDialogue(potionID);
        if(dialogue != null) return dialogue;

        dialogue = SilentDialogue.getPotionDialogue(potionID);
        if(dialogue != null) return dialogue;

        dialogue = DefectDialogue.getPotionDialogue(potionID);
        if(dialogue != null) return dialogue;

        dialogue = WatcherDialogue.getPotionDialogue(potionID);
        if(dialogue != null) return dialogue;

        return "Default Dialogue";
    }

    public static String getDialogueForCard(String cardID) {
        String dialogue = null;

        dialogue = ColorlessDialogue.getCardDialogue(cardID);
        if(dialogue != null) return dialogue;

        dialogue = IroncladDialogue.getCardDialogue(cardID);
        if(dialogue != null) return dialogue;

        dialogue = SilentDialogue.getCardDialogue(cardID);
        if(dialogue != null) return dialogue;

        dialogue = DefectDialogue.getCardDialogue(cardID);
        if(dialogue != null) return dialogue;

        dialogue = WatcherDialogue.getCardDialogue(cardID);
        if(dialogue != null) return dialogue;

        return "Default Dialogue";
    }
}

