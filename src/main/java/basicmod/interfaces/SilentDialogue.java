package basicmod.interfaces;

import com.megacrit.cardcrawl.cards.green.*;
import com.megacrit.cardcrawl.potions.CunningPotion;
import com.megacrit.cardcrawl.potions.GhostInAJar;
import com.megacrit.cardcrawl.potions.PoisonPotion;

public class SilentDialogue {
    public static String getCardDialogue(String cardID) {
        if (Acrobatics.ID.equals(cardID)) {
            return "\"Oh, I could ~never~ perform such advanced gymnastics! Do it again, do it again!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Backflip.ID.equals(cardID)) {
            return "\"A smooth dodge that allows for better positioning afterwards. Incredible!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Bane.ID.equals(cardID)) {
            return "\"For when poison is too slow and you need the results to come sooner.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (BladeDance.ID.equals(cardID)) {
            return "\"Many minor injuries accumulating to certain death! Seems unorthodox for a huntress, but if it works...\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (CloakAndDagger.ID.equals(cardID)) {
            return "\"Get closer, you say? Well, your teachings must be top-secret!\"  NL NL Ranwid leans in, expecting a whisper, but instead is met by the #r@slash@ of a dagger you had concealed. NL NL You take what you want and fade into the shadows, leaving Ranwid ~writhing~ on the ground.";
        }
        if (DaggerSpray.ID.equals(cardID)) {
            return "\"Perhaps those #rmask #rwearing #rhoodlums will reconsider their lifestyle when I introduce them to some high-velocity blades!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (DaggerThrow.ID.equals(cardID)) {
            return "\"So precise! The exact sort of maneuver I'd expect a skill huntress to know.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (DeadlyPoison.ID.equals(cardID)) {
            return "\"A potent #gpoison that begins to take effect almost immediately! Will study the chemical composition of this in my chambers.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Deflect.ID.equals(cardID)) {
            return "\"When as skilled as you, an otherwise risky defensive maneuver can be performed effortlessly.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (DodgeAndRoll.ID.equals(cardID)) {
            return "\"A slick move that allows the transfer of momentum to be used in the future! Impressive.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (FlyingKnee.ID.equals(cardID)) {
            return "\"Give those stomachs some bruisin'! Though, how is this supposed to be used against those ~tiny~ #g~slimes?~ Hmm.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Outmaneuver.ID.equals(cardID)) {
            return "Very swiftly, you duck behind Ranwid and take a firm hold of him, threatening him with your blade.  NL NL \"H-hey, no need for such threats! We're all pals here! Look what I have for you today!\"";
        }
        if (PiercingWail.ID.equals(cardID)) {
            return "\"Aren't you fogland hunters supposed to be discrete?...The gaze you're giving seems to imply that I should stop inquiring.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (PoisonedStab.ID.equals(cardID)) {
            return "\"A two-part murder plan. Morbid!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Prepared.ID.equals(cardID)) {
            return "\"You have extra supplies in your pockets too?! Brilliant, it's like we were meant to meet.\"  NL NL He rummages around his own various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (QuickSlash.ID.equals(cardID)) {
            return "\"A reliable attack that provides more of my favorite thing; @options.\"@  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Slice.ID.equals(cardID)) {
            return "\"You make it look so effortless! Perhaps one day I can be as skilled as you.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SneakyStrike.ID.equals(cardID)) {
            return "Before Ranwid even has a chance to say anything, he heels over, his stomach area greatly #pbruised. NL NL \"Agghhh! You @jerk!@ You're not getting a #brelic today.\" NL NL As he checks his pocket, he notices the #brelic is gone. NL Looking up, he notices you too are gone.";
        }
        if (SuckerPunch.ID.equals(cardID)) {
            return "An unexpected move on your part leaves Ranwid with a few less teeth. NL NL You stand over him, #rdominant. NL NL @\"Freaking@ @jerk!!@ Now I have to go to those sketchy dentists in #yThe #yCity again. Take this and leave me alone.\"";
        }
        if (Accuracy.ID.equals(cardID)) {
            return "\"Unprecedented precision! With this, I can win ~any~ game of darts! Will keep in mind as a backup financial plan in case this whole research thing falls apart.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (AllOutAttack.ID.equals(cardID)) {
            return "\"A one-sided mass brawl. Curious.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Backstab.ID.equals(cardID)) {
            return "The second Ranwid finishes his plea, you unleash an unexpected #r@stab@ into his jugular.  NL NL By the time he even has the chance to register what happened, he's already dead. NL NL You scavenge his corpse and find #b~something~ of use.";
        }
        if (Blur.ID.equals(cardID)) {
            return "\"Moving so swiftly, the naked eye can't see your still image. Will be very handy for getting me in and out of sketchy areas of potential note.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (BouncingFlask.ID.equals(cardID)) {
            return "\"As if it has a mind of its own! Will study this more closely in my chambers.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (CalculatedGamble.ID.equals(cardID)) {
            return "\"An otherwise risky play, made feasible by careful calculation.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Caltrops.ID.equals(cardID)) {
            return "You skillfully throw all of your available spikes on the ground around Ranwid and stare at him. NL NL \"What are you doing? Uh, here, if I give you this will you let me go?\" NL NL He tosses you a #brelic and you proceed to the next floor. NL NL \"Please don't leave me here! @I@ @forgot@ @to@ @wear@ @my@ @shoes@ @today!\"@";
        }
        if (Catalyst.ID.equals(cardID)) {
            return "\"A multiplicative effect on #gtoxin! Brilliant technique.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Choke.ID.equals(cardID)) {
            return "Your garotte appears ~lonely,~ so you decide to introduce it to Ranwid's neck. NL NL After a minute of a #ragony, he falls to the ground and you loot his most useful possession.";
        }
        if (Concentrate.ID.equals(cardID)) {
            return "\"A skill I already possess, though perhaps your approach is more...battle-oriented?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (CripplingPoison.ID.equals(cardID)) {
            return "The room suddenly fills with a deadly #ggreen haze. NL NL Ranwid, too #y~weak~ to move, coughs desperately. NL Eventually, he drops #rdead. NL NL Breathing through the filter of your skeletal headwear, you rummage through his body and find #bsomething of use.";
        }
        if (Dash.ID.equals(cardID)) {
            return "\"Defensive AND offensive! Great practicality for those often in danger.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Distraction.ID.equals(cardID)) {
            return "\"Huhh? A #ppurple #pSnecko? Where, where?\"  NL NL He spins around, trying to find the creature you alleged was nearby. NL NL By the time he turns back around, you're already gone.";
        }
        if (EndlessAgony.ID.equals(cardID)) {
            return "\"AAAAHHHHHH!!! @AGGHGHGHGHH!!!\"@  NL NL Ranwid clutches his head, #bcrying as a perpetual migraine begins to set in. NL NL Through his pain, he doesn't even seem to notice you robbing him.";
        }
        if (EscapePlan.ID.equals(cardID)) {
            return "\"How fitting for a huntress like you to have a backup plan. Perhaps I myself should practice foresight more often.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Eviscerate.ID.equals(cardID)) {
            return "Ranwid's insides are now outsides, and his #brelic is now your #brelic. NL NL Now THAT is a fair trade.";
        }
        if (Expertise.ID.equals(cardID)) {
            return "\"The natural result of countless hunts! I'm something of an expert myself, you know...in terms of research.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Finisher.ID.equals(cardID)) {
            return "\"The unleashing of all stored oppressive energy is bound to eradicate the unfortunate soul on the receiving end.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Flechettes.ID.equals(cardID)) {
            return "\"Oh, believe me, I have plenty of #gskills, so this will be highly effective in my hands!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Footwork.ID.equals(cardID)) {
            return "\"Majestic! If I ever need a ~dancing~ partner, I know who to contact! Ha ha. It was a joke please don't kill me.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (HeelHook.ID.equals(cardID)) {
            return "You get low on the ground and wrestle Ranwid to @submission.@  NL NL \"Agghhh!! Let go of my foot, you jerk! Here, look, I have #bsomething for you!\"";
        }
        if (InfiniteBlades.ID.equals(cardID)) {
            return "\"Infinite? Impossible! Perhaps there is a blacksmith you have trapped in a pocket dimension? I shall study this further in my chambers.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (LegSweep.ID.equals(cardID)) {
            return "In a swift motion, you knock Ranwid off his feet. NL He @crashes@ onto the ground, insulted and mildly confused. NL NL When he looks up at you, he sees you holding the #brelic he would have offered. NL NL There is nothing he can do as you walk away.";
        }
        if (MasterfulStab.ID.equals(cardID)) {
            return "\"A reward for perfection! No room for error, now.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (NoxiousFumes.ID.equals(cardID)) {
            return "The room suddenly fills with a #ggreen haze, becoming more deadly by the second. NL NL Ranwid attempts to flee, not realizing you planned ahead and @blocked@ all exits. NL NL Eventually, he drops #rdead. NL NL Breathing through the filter of your skeletal headwear, you rummage through his body and find #bsomething of use.";
        }
        if (Predator.ID.equals(cardID)) {
            return "\"A figurative message to the opponent, saying 'your days are numbered'. Horrifying!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Reflex.ID.equals(cardID)) {
            return "\"Your reaction time is blatantly inhuman! I must update the #g'Fogland #gFolk' section of my encyclopedia.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (RiddleWithHoles.ID.equals(cardID)) {
            return "Moving swiftly, you lunge at Ranwid and #rstab him many times in various locations on his body. NL NL He stumbles backwards, a @betrayed@ look on his face, before collapsing. NL NL You loot the bloody mess you left behind and find #bsomething of use.";
        }
        if (Setup.ID.equals(cardID)) {
            return "\"Nothing for me today? Disappointing.\"  NL NL He steps backwards, #ytriggering the trap you had stealthily placed moments ago. NL NL It #r@chomps@ down on his leg and he cries in shock as you spring forward, taking advantage of the situation by stealing of his more #bintriguing possessions.";
        }
        if (Skewer.ID.equals(cardID)) {
            return "\"A gruesome, yet effective penetration of the enemy. Takes a lot of effort though.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Terror.ID.equals(cardID)) {
            return "Ranwid begins to shield his face as #rfear overtakes his mind. NL NL \"NO, PLEASE!!! DON'T HURT ME!! I- here, take this!!\" NL NL You snag Ranwid's offer. NL As you walk away, you grin, knowing that Ranwid will have #pnightmares about you for the rest of his pitiful life.";
        }
        if (Tactician.ID.equals(cardID)) {
            return "\"Ah, what a brilliant plan! I have a lot to learn from you.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (WellLaidPlans.ID.equals(cardID)) {
            return "\"An unfathomable strategy! You truly are a genius on the battlefield.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (AThousandCuts.ID.equals(cardID)) {
            return "\"Inhumane! Truly disgusting behavior, I cannot support someone so-\"  NL NL He notices your ~twisted~ gaze... NL \"Y'know, I've reconsidered. Look what I've got for you today! Take it take it!\"";
        }
        if (Adrenaline.ID.equals(cardID)) {
            return "\"Always proven to be useful in desperate situations! How kind of you to offer this to me.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (AfterImage.ID.equals(cardID)) {
            return "\"There are semi-transparent versions of you appearing as you move! Intriguing. Imagine the @pranks@ I can pull with such power.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Alchemize.ID.equals(cardID)) {
            return "\"So kind of you to teach me how to brew my own concoctions! I shall never be parched again!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (BulletTime.ID.equals(cardID)) {
            return "Focusing intently, you #ypause the environment around you. NL NL You rummage through the belongings of Ranwid, who is stuck with a ~goofy~ ~grin~ on his face. NL NL You're out of there before time decides to resume.";
        }
        if (Burst.ID.equals(cardID)) {
            return "\"With a lightning-fast maneuver, you're able to perform any given operation twice. How useful.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (CorpseExplosion.ID.equals(cardID)) {
            return "\"Y'know fella, I really do hate those #rmask #rwearing #rhoodlums, but perhaps this solution is a bit too gruesome for my liking, as effective as it would be.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (DieDieDie.ID.equals(cardID)) {
            return "With Ranwid in the range of your #rblossom #rof #rdeath, you attack repeatedly until he draws his final breath. NL NL Through the shadows, you step over to his corpse and loot one of his valuables.";
        }
        if (Doppelganger.ID.equals(cardID)) {
            return "\"Hey, I wasn't aware you had a ~twin!~ Wait, they're not real? They...look very real.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Envenom.ID.equals(cardID)) {
            return "\"A #gpoisonous hint to every blow.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (GlassKnife.ID.equals(cardID)) {
            return "\"A carefully designed knife, capable of unreasonably clean cuts. Appears a bit brittle, though.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (GrandFinale.ID.equals(cardID)) {
            return "\"The ultimate showstopper! Perhaps it's not too late for me to be a #yColosseum entertainer after all.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Malaise.ID.equals(cardID)) {
            return "\"If I had a regular job, I'd consider using this on myself to get out of work! Okay not really. I'm highly passionate.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Nightmare.ID.equals(cardID)) {
            return "Ranwid closes his eyes and begins to sweat nervously. NL NL \"No! #gBear, listen we can work this out. Just take the #ygold!! Oh h-hey #rRomeo, of course I have some for you too. No, that's all I have! No no please don't call over that #rstabby fella!\"  NL NL During his illusion, he doesn't notice you ~robbing~ him, which seems awfully fitting given the described contents of his nightmare.";
        }
        if (PhantasmalKiller.ID.equals(cardID)) {
            return "A #pghostly replica of you appears, causing Ranwid to feel heavily threatened.  NL NL He desperately rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it and don't hurt me!\"";
        }
        if (StormOfSteel.ID.equals(cardID)) {
            return "A conjured tornado appears at your will, spewing #yshivs in every direction. NL NL Ranwid screams as he scurries out of the room, dropping #bsomething #buseful behind as he goes.";
        }
        if (ToolsOfTheTrade.ID.equals(cardID)) {
            return "\"Ah, so this is the secret of your notorious sneakiness! Interesting.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Unload.ID.equals(cardID)) {
            return "\"Powerful attack, leaving the user exposed afterwards. Useful in desperate situations where offense is necessary.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (WraithForm.ID.equals(cardID)) {
            return "\"Ah, a spooky #p@apparition!@ Wait, it's still you? And you're effectively immune to harm? Incredible!!!! Can't wait to employ this against those #rmask #rwearing #rhoodlums.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        return null;
    }

    public static String getPotionDialogue(String potionID) {
        if (CunningPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a @burp@ as he glances away. NL \"I want you to know that I have the sudden urge to not reimburse you for what you've given me, but I must remain honorable.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (GhostInAJar.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling pa- Whuhh? An actual #p~ghost?~ Spooky, yet intriguing!\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (PoisonPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #g~Glup~ #g~glup~ #g~glup~ NL NL He downs the potion in one go and lets out a final @burp@ as he collapses to the ground. NL NL You bend down to loot Ranwid's @twitching@ body and find #bsomething of use.";
        }
        return null;
    }
}
