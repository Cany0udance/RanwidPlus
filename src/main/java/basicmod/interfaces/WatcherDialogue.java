package basicmod.interfaces;

import com.megacrit.cardcrawl.cards.purple.*;
import com.megacrit.cardcrawl.potions.Ambrosia;
import com.megacrit.cardcrawl.potions.BottledMiracle;
import com.megacrit.cardcrawl.potions.StancePotion;

public class WatcherDialogue {
    public static String getCardDialogue(String cardID) {
        if (BowlingBash.ID.equals(cardID)) {
            return "\"You've been having a bit too much fun with this one, haven't you?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Consecrate.ID.equals(cardID)) {
            return "\"Intriguing! To proselytize enemies at such a high level causes them physical pain. Will examine this further.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Crescendo.ID.equals(cardID)) {
            return "\"Controlled recklessness! What an intriguing paradox.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (CrushJoints.ID.equals(cardID)) {
            return "Your arms move swiftly, brutally @shattering@ Ranwid's elbow into pieces. NL NL \"AAGHH!! Stop, please stop! Take this, just take it and leave me be!\"";
        }
        if (CutThroughFate.ID.equals(cardID)) {
            return "\"Incredible! With this, one may slightly bend reality to their will. Presents fascinating options for all situations.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (EmptyBody.ID.equals(cardID)) {
            return "\"What a remarkable meditative technique, focused on your own vessel. Offers a reliable physical reset when needed.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (EmptyFist.ID.equals(cardID)) {
            return "\"A punch at this level causes your emotions to ~dissipate~ into the recipient of the attack. Certainly one way to resolve a strong mood.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Evaluate.ID.equals(cardID)) {
            return "#gGreen skin. NL Herbs packed in a disorganized satchel. NL Short and erratic. NL NL It seems likely that this 'Ranwid' is a curious mind, perhaps specializing in #bfloral #bresearch. NL NL \"Why are you looking at me that way? Here, I have something for you! Take it take it!\"";
        }
        if (FlurryOfBlows.ID.equals(cardID)) {
            return "\"An unrelenting attack, powered by your emotional shifts. Fascinating!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (FlyingSleeves.ID.equals(cardID)) {
            return "\"Disobedient young 'uns tend to use this very move against authority figures. Not that I'd know anything about that, heh!...Man I should apologize to Mom.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (FollowUp.ID.equals(cardID)) {
            return "\"A smooth transition from one attack to the next. Perhaps you could do this endlessly?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Halt.ID.equals(cardID)) {
            return "\"Understood!\" NL NL \"Oh that's it? You were simply showing off your skill? Very funny.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (JustLucky.ID.equals(cardID)) {
            return "\"A bit of fortune on your side never hurt anyone! Except the opposition of course.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (PressurePoints.ID.equals(cardID)) {
            return "@\"Ouch!@ Don't do that again pleas- #r@OUCH!!!@ It hurt even more the second time! Okay okay here, take this and leave me be! No more touching!\"";
        }
        if (Prostrate.ID.equals(cardID)) {
            return "\"A universal sign of unyielding faith.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Protect.ID.equals(cardID)) {
            return "\"A treacherous journey such as yours is bound to have pushback. Best be prepared for it!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SashWhip.ID.equals(cardID)) {
            return "\"Being hit by your sash must be quite embarrassing for the enemy.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (ThirdEye.ID.equals(cardID)) {
            return "\"That's how you see despite being blind! What a fascinating staff.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Tranquility.ID.equals(cardID)) {
            return "\"Instant sedation? It appears #pThe #pWatchers have perfected meditative efficiency.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (BattleHymn.ID.equals(cardID)) {
            return "\"A never-ending combat song. Marvellous!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (CarveReality.ID.equals(cardID)) {
            return "\"Everything about this defies science. I will attempt to experiment with this, but I fear it's a bit beyond my expertise.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Collect.ID.equals(cardID)) {
            return "\"Ah! Having the ability to grab fortune out of thin air will be extraordinarily helpful for my work.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Conclude.ID.equals(cardID)) {
            return "You grab a relic off of Ranwid and leave.";
        }
        if (DeceiveReality.ID.equals(cardID)) {
            return "\"You can trick reality itself into giving you protection in a time of need? What a breathtaking technique.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (EmptyMind.ID.equals(cardID)) {
            return "Ranwid's face goes blank and he begins ~drooling~ over himself.  NL NL You poke him in the face. No reaction. NL NL Not everyone can handle the mental techniques you employ. You grab a #brelic off of his still body and leave.";
        }
        if (Fasting.ID.equals(cardID)) {
            return "\"A lack of sustenance seems to increase discipline, but also sluggishness. Situationally great for some warriors.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (FearNoEvil.ID.equals(cardID)) {
            return "\"An essential mindset for warriors, as taught by Kublai the Great.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (ForeignInfluence.ID.equals(cardID)) {
            return "\"Taking inspiration from those with unique moves, just as I'm doing with you right now. Clever!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Foresight.ID.equals(cardID)) {
            return "\"What a remarkable display of tactical intuition!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Indignation.ID.equals(cardID)) {
            return "You're working hard to defeat the evils of the Spire, and what is Ranwid doing? Frolicking around? NL NL He doesn't need that #brelic. ~You~ do. NL NL You forcefully steal the asset from Ranwid's uniform. He does not dare resist.";
        }
        if (InnerPeace.ID.equals(cardID)) {
            return "\"Many thanks, many thanks! More options seem to present themselves while in a stable state.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (LikeWater.ID.equals(cardID)) {
            return "\"Such marvellous flow, as if your matter is composed of liquid.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Meditate.ID.equals(cardID)) {
            return "\"Will be most useful in my spare time, though I am curious, how did you manage to pull this off in battle?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (MentalFortress.ID.equals(cardID)) {
            return "\"It is quite fitting for a #pWatcher to be able to break the unperceived mental barriers that restrain them.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Nirvana.ID.equals(cardID)) {
            return "Ranwid's erratic behavior instantly dissipates as you transfer your knowledge over to him. NL NL He calmly shuffles through his pockets... NL \"Here, fella. I have no need for this.\"";
        }
        if (Perseverance.ID.equals(cardID)) {
            return "\"The ability to keep on going, despite the difficult times. Essential for anyone who wishes to thrive in the Spire.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Pray.ID.equals(cardID)) {
            return "\"Does it matter which ~holy~ ~deity~ I pray to? Will I still receive the positive effects you describe? Time for some good ol' trial and error!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (ReachHeaven.ID.equals(cardID)) {
            return "\"A potent attack hiding under the guise of a noble goal. Sneaky!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Rushdown.ID.equals(cardID)) {
            return "You #r@rush@ towards Ranwid, willing to do whatever it takes to obtain the #buseful #btrinket he is implied to have.  NL NL He squeals and empties the contents of his pockets onto the floor. NL NL While in a fetal position, he exclaims \"Please, please don't hurt me! Take what you want!\"";
        }
        if (Sanctity.ID.equals(cardID)) {
            return "\"Finally! Perhaps with this level of holy authority, those #rmask #rwearing #rhoodlums shall bother me no more!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SandsOfTime.ID.equals(cardID)) {
            return "\"Wait for it...\" NL ~\"Wait~ ~for~ ~it...\"~ NL @\"Wait@ @for@ @it...\"@ NL NL #r@\"POWW!!@ Ha!...that sort of takes a while to set up, huh?\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SignatureMove.ID.equals(cardID)) {
            return "\"Even those unfamiliar with the specifics of the #pWatcher clan are aware of this attack! Very popular due to its effectiveness.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SimmeringFury.ID.equals(cardID)) {
            return "Ranwid's eyes dart over to your fists, which are curled up into tightly-squeezed balls of #rrage.  NL NL \"He- hey, no need to become uneasy now! Look I brought you something! Take it take it!\"";
        }
        if (Study.ID.equals(cardID)) {
            return "\"This isn't useful, I already perform this for a living! Eh, I still appreciate your efforts.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Swivel.ID.equals(cardID)) {
            return "\"So fluid, like a magic trick! Can you do that again?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (TalkToTheHand.ID.equals(cardID)) {
            return "\"That's not a- @hey,@ are you even listening to me??\"  NL NL He rummages around his various pockets... NL \"I see you wish not to be bothered today. Take this and I'll see you later maybe!\"";
        }
        if (Tantrum.ID.equals(cardID)) {
            return "\"I apologize, but this #brelic is ~very~ powerful, and I think it's only fair if you-\"  NL NL \"I- I get that, but it's not unreasonable to expect something in retu-\" NL NL \"Okay, okay, just take it!!\"";
        }
        if (Wallop.ID.equals(cardID)) {
            return "\"A blow so powerful, it transcends offense and goes back to...defense? Curious.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (WaveOfTheHand.ID.equals(cardID)) {
            return "\"The sheer disrespect of this causes foes to lose confidence in their own abilities. Intriguing.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Weave.ID.equals(cardID)) {
            return "\"Interconnected strings of combat, reliably granting an attack when you plan ahead. Advanced!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (WheelKick.ID.equals(cardID)) {
            return "\"An advanced circular motion which allows a greater set of follow-up options. Quite the skilled martial artist, you are!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (WindmillStrike.ID.equals(cardID)) {
            return "\"It seems your #ystaff defies the laws of momentum, spinning faster and faster until you're ready to deliver a devastating blow.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Worship.ID.equals(cardID)) {
            return "\"Not for me, you see. It's quite the slippery slope, just look at how many of the Spire's denizens turned to Mazaleth and became #bCultists!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it tak- @CAWW!@ Oh no, it's happening.\"";
        }
        if (WreathOfFlame.ID.equals(cardID)) {
            return "\"Spectacular! It seems dipping your weapon into this inferno empowers its next attack.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Alpha.ID.equals(cardID)) {
            return "\"This skill seems very...work-in-progress. Does it eventually do something of significance?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Blasphemy.ID.equals(cardID)) {
            return "@\"HEY!@ Keep your voice down, you don't want any #bCultists to overhear you saying that!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Brilliance.ID.equals(cardID)) {
            return "\"Perhaps it would be too on-the-nose to call this attack 'brilliant', but it truly is!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (ConjureBlade.ID.equals(cardID)) {
            return "\"Using all your energy to summon a blade? How familiar! Reminds me of the #gsnake #glady from the upper levels.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (DeusExMachina.ID.equals(cardID)) {
            return "\"A miraculous intervention! There appears to be a higher power with our best interests in mind.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (DevaForm.ID.equals(cardID)) {
            return "Your body is overtaken by a spectacular #pdivine #pbeing. You begin levitating as Ranwid watches in sheer awe. NL NL \"So it's true, #pThe #pWatchers were correct in their worship! Look what I have to offer you, take it take it!\"";
        }
        if (Devotion.ID.equals(cardID)) {
            return "\"A steady flow of praise to the holy ones will lead to #pgreatness, you say? Perhaps it's worth a shot, for science!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Establishment.ID.equals(cardID)) {
            return "\"Curious! It appears this allows one to control the jurisdiction of battle in their favor.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Judgement.ID.equals(cardID)) {
            return "\"It appears your enemies have such high respect for you, they forfeit life upon noticing your disappointed posture. Oh, how I can't wait to test this out against that little brat #rPointy!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (LessonLearned.ID.equals(cardID)) {
            return "#p\"Watchers make it their goal to never stop learning, and as they say, knowledge is @power!\"@  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (MasterReality.ID.equals(cardID)) {
            return "\"Oh, you have nothing for me today? Disappointing.\"  NL NL He walks away with his head hung low. NL NL Little does he know, the relic is no longer in his possession, but rather #pyours. NL NL You willed it so.";
        }
        if (Omniscience.ID.equals(cardID)) {
            return "\"What better solution to science than omni-science? Heh heh. @THE@ @KNOWLEDGE@ @IS@ @MINE!!\"@  NL NL He hustles away, laughing maniacally. NL A #brelic falls out of his pocket as he does so. Surely he knows, but does not seem to care.";
        }
        if (Ragnarok.ID.equals(cardID)) {
            return "\"The wrath of the heaven rains down upon us!! Surely this will stop any foe in their tracks.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Scrawl.ID.equals(cardID)) {
            return "Ranwid jots this newfound knowledge in his journal. NL NL Then he writes some more, then more until all the space in his journal is filled with notes. NL NL \"Got a little carried away there didn't I? I have this for you, take it take it!\"";
        }
        if (SpiritShield.ID.equals(cardID)) {
            return "\"Holy protection!! Will come in handy next time those #rmask #rwearing #rhoodlums show up.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Vault.ID.equals(cardID)) {
            return "\"A fresh reset for everyone on the battlefield! You may find yourself in a more favorable position as a result.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Wish.ID.equals(cardID)) {
            return "\"Can only be used once? Hmm...well I wish for @more@ wishes! Doesn't work? If only there were a way to make it happen.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        return null;
    }

    public static String getPotionDialogue(String potionID) {
        if (Ambrosia.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #p~Glup~ #p~glup~ #p~glup~ NL NL He downs the potion in one go and lets out an enlightened @burp.@ NL \"As if it came straight from the heavens! What a wonderful beverage.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (BottledMiracle.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #y~Glup~ #y~glup~ #y~glup~ NL NL He downs the potion in one go and lets out a relieved @burp.@ NL \"My favorite flavor! How'd you know?\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (StancePotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a reflective @burp@ as he changes his standing posture. NL \"Ah, that's much easier on my ol' back!\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        return null;
    }
}
