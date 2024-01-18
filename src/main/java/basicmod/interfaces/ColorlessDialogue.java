package basicmod.interfaces;

import com.megacrit.cardcrawl.cards.colorless.*;
import com.megacrit.cardcrawl.potions.*;

public class ColorlessDialogue {
    public static String getCardDialogue(String cardID) {
        if (BandageUp.ID.equals(cardID)) {
            return "\"Gauze is very handy around these parts. Will be nice to have next time I get chomped by a pesky #bJaw #bWorm!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Blind.ID.equals(cardID)) {
            return "\"Ah! @AHHHH!!@ My eyesight has been terminated!\"  NL NL Ranwid stumbles around momentarily before bumping into a wall. NL The impact causes a ~shiny~ trinket to fall out of one of his pockets, which you take. NL NL \"Hello? Would you mind reversing this?\" NL @\"Hello???\"@";
        }
        if (DarkShackles.ID.equals(cardID)) {
            return "\"Shackles used by those wretched #rSlavers in the City. Very easily snaps onto a target, as if they have a mind of their own. Such twisted technology.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (DeepBreath.ID.equals(cardID)) {
            return "\"Sometimes, it helps to take a moment to perform a mental reset.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Discovery.ID.equals(cardID)) {
            return "\"Fascinating! It's like an encyclopedia of one's own mind.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (DramaticEntrance.ID.equals(cardID)) {
            return "\"A fashionable beginning to any encounter! The unexpected nature of this will affect even the most hardened of foes.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Enlightenment.ID.equals(cardID)) {
            return "\"That's it... @that's@ @IT!!!\"@  NL NL Ranwid throws his hands in the air, mouth wide open, bathing in his epiphany. NL \"I didn't lose my special #gspoon after all, it must have been @stolen@ by that #bmasked #bguy when he visited last week! What a jerk!\" NL NL He rummages around his various pockets, mumbling angrily... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Finesse.ID.equals(cardID)) {
            return "Ranwid flicks his wrist and a shiny object peeks out of his sleeve. He grabs it with his fingers and presents it to you. NL The maneuver was surprisingly slick coming from a man as @erratic@ as he. NL NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (FlashOfSteel.ID.equals(cardID)) {
            return "\"An attack so sudden, they won't even know what hit 'em! Well, they'll know it's something metallic at least.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Forethought.ID.equals(cardID)) {
            return "\"It's always wise to plan your next move, but to plan your ~final~ move? Brilliant, just brilliant.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (GoodInstincts.ID.equals(cardID)) {
            return "\"Exemplary! I shall study this further in my chambers.\"  NL NL He stops for a second and thinks before rummaging through one of his pockets... NL \"Aha! Figured it was in that one. Look what I've got for you today! Take it take it!\"";
        }
        if (Impatience.ID.equals(cardID)) {
            return "Ranwid practically shoves an #bitem into your hands. NL NL \"Good talk fella, now take it and go! I have experiments to conduct in my lab.\"";
        }
        if (JackOfAllTrades.ID.equals(cardID)) {
            return "\"Well aren't you the renaissance man of the Spire? Nice to have knowledge in many fields.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Madness.ID.equals(cardID)) {
            return "\"Ah, ah, ahhh, yes! Things do seem to make much more sense now.\"  NL NL Ranwid lunges towards the nearest wall and begins to walk up it vertically, defying gravity. NL #bSomething falls out of one of his pockets and lands conveniently at your feet. NL NL What just happened?";
        }
        if (MindBlast.ID.equals(cardID)) {
            return "\"Taking 'knowledge is power' to a literal notion!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Panacea.ID.equals(cardID)) {
            return "#b~Glup~ #b~glup~ #b~glup~ NL NL \"Ah, many thanks! This shall make it easier to study #gSneckos up close.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (PanicButton.ID.equals(cardID)) {
            return "\"A dramatic safeguard against heavy attacks.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Purity.ID.equals(cardID)) {
            return "\"A way to expunge your current burdens! Intriguing.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SwiftStrike.ID.equals(cardID)) {
            return "@\"Ouch!!@ What'd'ya do that for? Unnecessary demonstration, jerk.\"  NL NL He grumpily rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it! And don't do that again, there wasn't even time to react!\"";
        }
        if (Trip.ID.equals(cardID)) {
            return "Ranwid opens his mouth to say something, but slips on a #ybanana peel and crashes into the ground. NL NL \"Which environmentally negligent hoodlum placed that there?? Ah, anyways, look what I've got for you today! Take it take it!\"";
        }
        if (Apotheosis.ID.equals(cardID)) {
            return "\"Can it truly be that simple to reach your maximum potential? @Revolutionary!!@ I am unsure why you would forfeit this to me, but I digress.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Chrysalis.ID.equals(cardID)) {
            return "\"Interesting. It seems this allows you to place yourself into a shell to reach your next form later. Will look into this further.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (HandOfGreed.ID.equals(cardID)) {
            return "\"The severed hand of a fallen king! It is said that his obsession with wealth turned him into a #ygolden statue, and anyone struck by his new body will suffer a similar fate.\"  NL NL He rummages around his various pockets... NL \"Just imagine! I could afford all the equipment necessary to conduct even the most ~complex~ of research. But that would mean I'd need to sacrifice lives to get there...maintain your morals, Ranwid! Maintain them!\" NL NL \"Oh yes, I do owe you now don't I? Here, look what I've got for you today! Take it take it!\"";
        }
        if (Magnetism.ID.equals(cardID)) {
            return "An object flies out of Ranwid's pockets and lands in your hand. NL NL \"Fascinating!! I will keep this technique hidden forever. If those #rmask #rwearing #rhoodlums got a hold of this, they'd be able to snatch everyone's #ygold from afar!\"";
        }
        if (MasterOfStrategy.ID.equals(cardID)) {
            return "\"Such a powerful ability! I am in awe at your sheer confidence; if you're willing to give this to me it must mean you're highly capable in battle.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Mayhem.ID.equals(cardID)) {
            return "\"Unpredictable! Who knows what will happen next.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Metamorphosis.ID.equals(cardID)) {
            return "\"Ah, just like an insect from its cocoon! Except a bit more violent.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Panache.ID.equals(cardID)) {
            return "\"Such flamboyant radiance! No creature can ignore these moves.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SadisticNature.ID.equals(cardID)) {
            return "\"Can't say I approve of these questionable methods. Do you like hurting other people?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SecretTechnique.ID.equals(cardID)) {
            return "\"Marvelous! Provides easy access to your most essential equipment.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SecretWeapon.ID.equals(cardID)) {
            return "\"Marvelous! Provides easy access to your most deadly weapons.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (TheBomb.ID.equals(cardID)) {
            return "Ranwid stares at the explosive device you've given him, a grin emerging on his face. NL NL \"Want to try robbing me again, you #rmask #rwearing #rhoodlums? Well I got something right here for you. ~Heh~ ~heh~ ~heh.\"~ NL NL \"Oh right, your reward. Here, look what I've got for you today! Take it take it!\"";
        }
        if (ThinkingAhead.ID.equals(cardID)) {
            return "\"Sounds obvious, but if only it were so simple! How easy it is to act purely on instinct.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Transmutation.ID.equals(cardID)) {
            return "\"By focusing all your effort, you can create anything? This calls for further examination in my chambers.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Violence.ID.equals(cardID)) {
            return "\"An unfortunately necessary means to an end, especially in the less civilized parts of the Spire.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Apparition.ID.equals(cardID)) {
            return "\"Become a #p~ghost~ at will? Nonsense, that's-\"  NL NL Ranwid is cut off as his body becomes transparent, and one of the heavier #bitems from his pockets falls to the floor. NL NL \"This is rendering me speechless! From whom did you learn this power? Oh, and you can keep that item!\"";
        }
        if (Bite.ID.equals(cardID)) {
            return "\"The signature move of those ~creepy~ ~pale~ ~figures!~ Saps the life force from the unfortunate victim.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (JAX.ID.equals(cardID)) {
            return "Ranwid @snatches@ the needle from your hand and throws it into the distance. NL NL \"No, no! I understand you want to grow stronger, but injecting #gmysterious #gsubstances is not the correct path to do so!\" NL NL \"Here, take this! This is bound to ACTUALLY help you, with no harmful side effects!\"";
        }
        if (RitualDagger.ID.equals(cardID)) {
            return "\"Ah, the ever-powerful dagger used in #bCultist rituals. Very difficult to obtain one of these. You didn't partake in a ritual, did you?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        return null;
    }

    public static String getPotionDialogue(String potionID) {
        if (ColorlessPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a satisfied @burp.@ NL \"Ooh, so many subtle flavors! A bit bland though.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (CultistPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a @burp@ as his pupils dilate. NL @\"CAW!@ @CAAAW\"@ NL NL He rummages around his various pockets and pulls out a small branch. NL @\"CAW@ @CAW!!@ #b@CAW\"@";
        }
        if (DexterityPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #g~Glup~ #g~glup~ #g~glup~ NL NL He downs the potion in one go and lets out a smooth @burp.@ NL \"That went down the ol' pipes quite cleanly.\" NL NL He swiftly sorts through his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (DistilledChaosPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a series of @burps,@ each different from the last. NL \"The findings of my studies have been quite tasty yet it's curious how those #rbandits @CAW!!@ given the state of the architecture of #bher chair it's rational to assume #gDr. #gSnecko's big secret will be revealed as soon as-\" NL NL You snatch something shiny out of his pocket and walk away.";
        }
        if (DuplicationPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a @burp,@ followed by another burp which sounds exactly the same. NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\" NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (EnergyPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #y~Glup~ #y~glup~ #y~glup~ NL NL He downs the potion in one go and lets out a high-energy @burp.@ NL \"A #yjolt of life! I can't just stand here, I need to take a run!!\" NL NL Ranwid sprints away, but something shiny falls out of his pocket in the process. NL You grab it and continue on your way.";
        }
        if (EntropicBrew.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a @burp.@ NL Then, he looks down and sees that the slots of his belts have been filled with various flasks. NL \"Ooh, where did these come from? I must examine this phenomenon more closely in my chambers.\" NL NL He rummages around his various pockets (most of which are now filled with flasks)... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (EssenceOfSteel.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a @burp@ as he grows a thin metallic exoskeleton around his skin. NL \"Most intriguing! It seems this liquid provides a flexible defensive layer around the consumer.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (ExplosivePotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and you hear a #r@boom@ sound as #rbloody pieces of Ranwid's torso fly in multiple directions. NL NL You take one of his more ~intriguing~ belongings, wipe the blood off of it, and leave the scene.";
        }
        if (FairyPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling pa- Whuhh? I'm not drinking this! That said, it will make an excellent test subject in my lab.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (FearPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a @burp@ as his eyes widen. NL #r\"They could be anywhere!! I need to hide!\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it, and if you see those #rmasked fellas, @don't@ tell them I was here!\"";
        }
        if (FirePotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #r~Glup~ #r~glup~ #r~glup~ NL NL He downs the potion in one go and lets out a fiery @burp.@ NL \"I do enjoy a good hot sauce, though this seems especially potent.\" NL NL He rummages around his various pockets while panting... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SteroidPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a confident @burp.@ NL \"WOOOOOOO!!! Just what I needed, I'm capable of anything!\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (FruitJuice.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out an extremely satisfied @burp.@ NL \"So fruity! Haven't tasted anything quite this delicious since the onset of Spireblight.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (GamblersBrew.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a mischievous @burp.@ NL NL He rummages around his various pockets and pulls out a few trinkets, wrapped in cloth... NL \"Pick one, pick one! Whichever you select is yours to keep.\" NL NL You select one, and Ranwid lifts the cloth to reveal your reward.";
        }
        if (LiquidBronze.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a @burp@ as quills begin to protrude from his skin. NL \"Aha!! Try and harass me now, you dreaded #yByrds!\" NL NL He rummages around his various pockets, tearing his cloth slightly as he does so... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (LiquidMemories.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a contemplative @burp.@ NL \"That's it! @That's@ @the@ @formula@ @I've@ @forgotten!!\"@ NL NL He furiously scribbles text in his journal... NL \"Much appreciated for the memory boost! Here, look what I've got for you today! Take it take it!\"";
        }
        if (PowerPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a powerful @burp.@ NL \"There's potential surging through my body. What a wondrous feeling!\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (RegenPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a sigh of relief. NL \"Y'know, I had stubbed my toe this morning and #rbruised it very badly, but whatever you've provided me is making the pain rapidly disappear.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SkillPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a @burp.@ NL \"Those #rmask #rwearing #rhoodlums said I was only good for pencil pushing and 'nerd stuff'. I'm worth more than that! I'll show those jerks!\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SmokeBomb.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling pa- Whuhh? This isn't something to consume, but shall be useful next time I encounter those #rmask #rwearing #rhoodlums.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SneckoOil.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ NL NL He takes one sip of the potion and lets out a disgusted @burp.@ NL \"Blegh! ~Horrid!~ Just @horrid!@ How could anybody drink this abomination?\" NL NL He rummages around his various pockets... NL \"I'm not even sure you deserve a reward today, but here! Take it take it!\"";
        }
        if (SpeedPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #g~Glup~ #g~glup~ #g~glup~ NL NL He downs the potion in one go and lets out a @burp.@ NL NL You blink, and next thing you know, Ranwid has his hand extended, offering a relic. NL @\"HerelookwhatI'vegotforyoutodaytakeittakeit!\"@";
        }
        if (StrengthPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out an intimidating @burp@ as his muscles grow in size. NL \"Those #rmask #rwearing #rhoodlums shall never mess with me again!!\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SwiftPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a calculated @burp.@ NL NL He rummages around his various pockets... NL \"Hm, I could give you this...or this...but what about this? So many options! Here, look what I've got for you today! Take it take it!\"";
        }
        if (WeakenPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a weak @burp.@ NL \"Ooh, the taste of that one is rather...uninspiring.\" NL NL He slowly rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        return null;
    }
}
