package ranwidplus.patches;

import ranwidplus.interfaces.MyOwnDialogueClass;
import com.evacipated.cardcrawl.modthespire.lib.*;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.events.shrines.WeMeetAgain;
import com.megacrit.cardcrawl.potions.AbstractPotion;
import com.megacrit.cardcrawl.localization.EventStrings;

import java.lang.reflect.Field;

import static basemod.BaseMod.logger;


@SpirePatch(
        clz = WeMeetAgain.class,
        method = "buttonEffect",
        paramtypez = {int.class}
)
public class WeMeetAgainDialoguePatch {
    public static int lastChoice = -1;
    @SpirePostfixPatch
    public static void Postfix(WeMeetAgain _instance, int buttonPressed) throws NoSuchFieldException, IllegalAccessException {

        EventStrings eventStrings = CardCrawlGame.languagePack.getEventString(WeMeetAgain.ID);
        String[] DESCRIPTIONS = eventStrings.DESCRIPTIONS;

        // Use reflection to get the value of private variables
        Field potionOptionField = _instance.getClass().getDeclaredField("potionOption");
        potionOptionField.setAccessible(true);
        AbstractPotion potionOption = (AbstractPotion) potionOptionField.get(_instance);

        Field cardOptionField = _instance.getClass().getDeclaredField("cardOption");
        cardOptionField.setAccessible(true);
        AbstractCard cardOption = (AbstractCard) cardOptionField.get(_instance);


// Replace the dialogue when the player gives up a potion
        if (buttonPressed == 0 && potionOption != null && lastChoice != 1 && lastChoice != 2 && lastChoice != 3) {
            logger.info(lastChoice);
            lastChoice = 0;
            logger.info(lastChoice);
            String newDialogue = MyOwnDialogueClass.getDialogueForPotion(potionOption.ID);
            if (newDialogue != null && !newDialogue.equals("Default Dialogue")) {
                _instance.imageEventText.updateBodyText(newDialogue);
            } else {
                // Use the original dialogue for the potion case
                _instance.imageEventText.updateBodyText(DESCRIPTIONS[1] + DESCRIPTIONS[5]);
            }
        }

        if (buttonPressed == 1 && lastChoice != 0 && lastChoice != 2 && lastChoice != 3) {
            logger.info(lastChoice);
            lastChoice = 1;
            logger.info(lastChoice);
                // Use the original dialogue for the potion case
                _instance.imageEventText.updateBodyText(DESCRIPTIONS[2] + DESCRIPTIONS[5]);
        }

        // Replace the dialogue when the player gives up a card
        if (buttonPressed == 2 && cardOption != null && lastChoice != 0 && lastChoice != 1 && lastChoice != 3) {
            logger.info(lastChoice);
            lastChoice = 2;
            logger.info(lastChoice);
            String newDialogue = MyOwnDialogueClass.getDialogueForCard(cardOption.cardID);
            if (newDialogue != null && !newDialogue.equals("Default Dialogue")) {
                _instance.imageEventText.updateBodyText(newDialogue);
            } else {
                // Use the original dialogue for the card case
                _instance.imageEventText.updateBodyText(DESCRIPTIONS[3] + DESCRIPTIONS[5]);
            }
        }

        if (buttonPressed == 3 && lastChoice != 0 && lastChoice != 1 && lastChoice != 2) {
            logger.info(lastChoice);
            lastChoice = 3;
            logger.info(lastChoice);
            // Use the original dialogue for the potion case
            _instance.imageEventText.updateBodyText(DESCRIPTIONS[4]);
        }

    }

}