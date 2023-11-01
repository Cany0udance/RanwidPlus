package basicmod.patches;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.events.shrines.WeMeetAgain;

@SpirePatch(
        clz = WeMeetAgain.class,
        method = SpirePatch.CONSTRUCTOR
)
public class WeMeetAgainResetPatch {
    @SpirePostfixPatch
    public static void Postfix(WeMeetAgain _instance) {
        WeMeetAgainDialoguePatch.lastChoice = -1;  // Reset lastChoice when the event is constructed
    }
}