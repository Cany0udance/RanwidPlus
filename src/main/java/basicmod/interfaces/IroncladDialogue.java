package basicmod.interfaces;

import com.megacrit.cardcrawl.cards.red.*;
import com.megacrit.cardcrawl.potions.BloodPotion;
import com.megacrit.cardcrawl.potions.Elixir;
import com.megacrit.cardcrawl.potions.HeartOfIron;

public class IroncladDialogue {
    public static String getCardDialogue(String cardID) {
        if (Anger.ID.equals(cardID)) {
            return "\"Unbridled @anger@ can be truly detrimental! Perhaps it's for your own good that I take this from you...\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Armaments.ID.equals(cardID)) {
            return "\"This piece of armor can upgrade your accompanying gear, you say?! I assure you, I will take good care of it!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (BodySlam.ID.equals(cardID)) {
            return "\"The best offense is a good defense! Or so they say, anyway.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Clash.ID.equals(cardID)) {
            return "\"Exciting!! Nothing gets the blood pumping quite like an up-close-and-personal duel. Heard that from a friend.\"  NL NL He rummages around his various pockets. NL \"That friend being ~you~ ... \" Ranwid sheepishly mutters as he hands you the relic. NL NL ...You do not know this man.";
        }
        if (Cleave.ID.equals(cardID)) {
            return "\"Yes, an essential move when facing multiple foes!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Clothesline.ID.equals(cardID)) {
            return "\"Your enemies must have been clutching their jaws after this move! Just try not to use it against #gSneckos, will you? Their mandibles are awfully fragile.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Flex.ID.equals(cardID)) {
            return "\"I struggle to see how flexing your muscles helps you during- wait, you're saying it actually makes you @stronger?!@ Curious.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\" NL NL As you walk away, you turn around and catch a glimpse of Ranwid pathetically flexing his biceps.";
        }
        if (Havoc.ID.equals(cardID)) {
            return "\"An unpredictable move to not only your foes, but also yourself...Innovative!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Headbutt.ID.equals(cardID)) {
            return "\"Go for the nose! Unless they're wearing a helmet, of course.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (HeavyBlade.ID.equals(cardID)) {
            return "Ranwid sweats as he tries to pick up the weapon you've given him. NL NL \"Mind... ~*huff*~ ...giving your pal... ~*huff*~ ...a hand?\" NL NL While he is struggling to pick up the blade, you reach into Ranwid's pocket and extract the relic from within. NL NL \"PLEASE??\" Ranwid shouts as you walk away.";
        }
        if (IronWave.ID.equals(cardID)) {
            return "Ranwid (lightly) slams the weapon onto the ground, and a small but fleeting wall of defensive iron appears in front of him. NL NL \"Fascinating! I will experiment with this further in my lab.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (PerfectedStrike.ID.equals(cardID)) {
            return "\"Fear not the man who has practiced 10,000 strikes once, but the man who has practiced one strike 10,000 times! Or however many times you've practiced this.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (PommelStrike.ID.equals(cardID)) {
            return "\"A blow from the pommel of your sword, the perfect way to set up for your follow-up maneuver!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (ShrugItOff.ID.equals(cardID)) {
            return "\"If the body physically demonstrates a lack of concern for damage, it takes less damage? Ah, there's so much to learn in the Spire!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SwordBoomerang.ID.equals(cardID)) {
            return "\"How do you control where it goes?...oh, it doesn't matter? Such confidence!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (ThunderClap.ID.equals(cardID)) {
            return "\"AH!! Please tell me to cover my ears next time you demonstrate something like that!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it! Can you hear me? I can't hear me! When does this wear off? Oh, there we go.\"";
        }
        if (TrueGrit.ID.equals(cardID)) {
            return "\"Inspirational! Every combatant should learn this.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (TwinStrike.ID.equals(cardID)) {
            return "\"They'll never see the second one coming.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Warcry.ID.equals(cardID)) {
            return "\"How many times did you have to practice that? Or does it come naturally? Disregard, I'll figure it out.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\" NL NL In the distance, you hear Ranwid practicing his shout. NL It sounds like a dying Byrd.";
        }
        if (WildStrike.ID.equals(cardID)) {
            return "\"Woah, easy, easy! Would you like a bandage for that #rwound? Let me take that attack from you, I think this ~relic~ will serve you better.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (BattleTrance.ID.equals(cardID)) {
            return "\"A staple technique of the Ironclads; offers greater control of the battlefield. This will be stored securely in my collection!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (BloodForBlood.ID.equals(cardID)) {
            return "\"Revenge really motivates you, doesn't it? Remind me not to cross you!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Bloodletting.ID.equals(cardID)) {
            return "\"Morbid! I have never come across someone who gains energy by losing their vitality.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (BurningPact.ID.equals(cardID)) {
            return "\"To whom do you make the pact with? Oh, I'm asking too much? Forget I asked.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Carnage.ID.equals(cardID)) {
            return "\"Don't do that! Such messy moves make it difficult for me to examine fallen monsters.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Combust.ID.equals(cardID)) {
            return "\"Creative! As long as you can withstand the heat, y-\"  NL NL Ranwid emits a burst of #rfire that leaves his clothing charred and tattered. NL A relic drops from a hole in his pocket and rolls over to your feet. NL NL Ranwid grins and hurries away. \"The implications of this power! @THE@ @IMPLICATIONS!!\"@ ";
        }
        if (DarkEmbrace.ID.equals(cardID)) {
            return "As soon as you hand the power over to Ranwid, #pdark #phands emerge from the ground and begin to swarm him. NL NL The hands reach into his pocket, grab the relic inside, and toss it to you before waving goodbye. NL NL Ranwid is speechless. He jots down notes @enthusiastically@ as you journey upwards.";
        }
        if (Disarm.ID.equals(cardID)) {
            return "\"A classic! The logical solution to preventing your enemy from attacking.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\" NL NL You grasp the relic in your hands, and Ranwid playfully disarms you, causing you to drop the relic to the ground. NL NL You are @not@ amused.";
        }
        if (Dropkick.ID.equals(cardID)) {
            return "\"Dramatic! It would be amusing to be able to do this to the same foe repeatedly. If only.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (DualWield.ID.equals(cardID)) {
            return "\"A tactic for only the most skilled of warriors, as described in Zoroth's manifesto.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Entrench.ID.equals(cardID)) {
            return "\"Deeper into cover, as long as you have cover.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Evolve.ID.equals(cardID)) {
            return "\"Groundbreaking! Rapid adaptability vastly increases potential. I must test this on a #bJaw #bWorm, for science!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (FeelNoPain.ID.equals(cardID)) {
            return "\"Now, I'm not going to ask you to hurt me as a means to test this power, I'll just take your word for it that it works. Will be useful for all those Louse shells I have laying around the lab...man I need some shoes.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (FireBreathing.ID.equals(cardID)) {
            return "Ranwid turns around, trying not to let his #r~fiery~ #r~breath~ harm you.  NL NL \"Woah! This is remarkable! Reach into my pocket and take the relic, you've earned it!\" NL NL You gladly comply and go on your merry way. NL NL \"Hey, when does my breath turn back to normal? Hello?\"";
        }
        if (FlameBarrier.ID.equals(cardID)) {
            return "Ranwid takes a metallic orb from one of his pockets and attempts to crack a joke. Something about a \"fire wall\". NL The joke goes completely over your head. NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (GhostlyArmor.ID.equals(cardID)) {
            return "\"Effective, yet lightweight! Perhaps TOO lightweight...\" The #barmor dissipates into the air. Ranwid shrugs. NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Hemokinesis.ID.equals(cardID)) {
            return "\"Riveting! Quite the morbid, yet effective combat technique.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (InfernalBlade.ID.equals(cardID)) {
            return "\"There's some kind of weapon stuck in the ground, but only the hilt is surfaced. I suppose we won't know what the weapon is until we extract it.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Inflame.ID.equals(cardID)) {
            return "\"Igniting a weapon to make it more effective? Most intriguing!\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Intimidate.ID.equals(cardID)) {
            return "\"Oh, y-you want this relic? It's yours...\" NL NL He nervously rummages around his various pockets, glancing at you every once in a while. NL \"Here, take it take it!\" NL NL You stare him down before marching away.";
        }
        if (Metallicize.ID.equals(cardID)) {
            return "\"By converting one's flesh to metal, susceptibility decreases dramatically. Curious.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Pummel.ID.equals(cardID)) {
            return "\"An onslaught of blows to the adversary! ~WHACK~ ~WHACK~ ~WHACK~ ~WHACK~ How fun!\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (PowerThrough.ID.equals(cardID)) {
            return "\"Ah, the impermeable will of an Ironclad!\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Rage.ID.equals(cardID)) {
            return "\"Fascinating! The Ironclads have been known to thrive defensively on the battlefield through their relentless attacks. How intimidating.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Rampage.ID.equals(cardID)) {
            return "\"An attack that only gets better as it's used. Curious. I will study the properties of this further in my chambers.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (RecklessCharge.ID.equals(cardID)) {
            return "\"Ooh, can I try it? Can I try it?\" NL NL Ranwid rummages through his pockets and pulls out a small hastily-thrown-together dummy which resembles a #bCultist. He slashes through it. NL NL \"Neat! Look what I've got for you toda- ...Ah, I appear to be slightly ~dizzy.~ Please excuse me while I find a place to rest.\"";
        }
        if (Rupture.ID.equals(cardID)) {
            return "\"Eeuuugghhh!! Masochism makes me ~squirm,~ but if it helps in battle, who am I to judge?\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SearingBlow.ID.equals(cardID)) {
            return "You hand the #rburning blade to Ranwid and instruct him to douse it in flames. NL He obliges, and the flames grow larger as they dance around the endlessly flammable steel of the blade. NL NL \"This burns forever, you say? And the flames can only grow larger? Is this weapon the key to #b@perpetual@ #b@energy?\"@ NL NL He rummages around his various pockets (with extra enthusiasm)... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SecondWind.ID.equals(cardID)) {
            return "\"That's the spirit! Never give up, there's always another chance.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SeeingRed.ID.equals(cardID)) {
            return "#r\"Exemplary! #rI #rshall #rstudy #rthis #rfurther #rin #rmy #rchambers.\" NL NL #rHe #rrummages #raround #rhis #rvarious #rpockets... NL #r\"Here, #rlook #rwhat #rI've #rgot #rfor #ryou #rtoday! #rTake #rit #rtake #rit!\"";
        }
        if (Sentinel.ID.equals(cardID)) {
            return "\"I always thought being a watchdog would be an ~exhausting~ job. Who has time to stand around when there's so much #bscience to be done?\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SeverSoul.ID.equals(cardID)) {
            return "\"What happens when one's soul gets split in two? Can there be two Ranwids studying the Spire? Quite the ambitious experiment I'll conduct...\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Shockwave.ID.equals(cardID)) {
            return "You demonstrate your power to Ranwid. NL He takes a couple of steps back from the sheer force of your ability. NL NL \"I do not feel good in the slightest! I feel so #r~exposed.\"~ NL NL He rummages around his various pockets... NL #b~Glup~ #b~glup~ #b~glup~ NL NL \"Ah, those [#ff6c00]orange[] [#ff6c00]pellets[] really hit the spot. Oh, and also look what I've got for you today! Take it take it!\"";
        }
        if (SpotWeakness.ID.equals(cardID)) {
            return "\"Stay still, will you? Hm...I am unable to identify your weakness. Does this thing even work?\"  NL NL You force your hand into Ranwid's pocket and extract the relic within. NL \"HEY!! Did you just @scam@ me?\" NL NL By the time Ranwid has time to register what happened, you are already gone. NL You have no weakness.";
        }
        if (Uppercut.ID.equals(cardID)) {
            return "\"WHAM! A hit like that will knock any creature off its feet.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Whirlwind.ID.equals(cardID)) {
            return "#b~Woosh~ #b~woosh~ #b~woosh~ NL NL \"Ha! So fun. I could do this all day! Come try to lift my coin now, you #rmask #rwearing #rhoodlums!\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Barricade.ID.equals(cardID)) {
            return "\"Never let your defenses down for even a second. Seems obvious, but is easier said than done.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Berserk.ID.equals(cardID)) {
            return "\"A short-term consequence for long-term benefits, you say? Situational, yes, but potentially vital.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Bludgeon.ID.equals(cardID)) {
            return "@Thwack!!!@ NL NL Ranwid collapses to the floor as you use your sledgehammer to cave his skull in. NL NL You rummage through his #rbloodied remains and find something ~useful.~";
        }
        if (Brutality.ID.equals(cardID)) {
            return "You begin to tear into your own flesh in a display of power. NL Ranwid watches in awe as your body begins to cauterize itself, fueled by the #rburning desire of your blood. NL NL Ranwid says nothing. He hands you a relic as he jots down notes in his journal, titled NL NL ~The~ ~Fascinating~ ~Properties~ of the ~Ironclad~ ~Clan~";
        }
        if (Corruption.ID.equals(cardID)) {
            return "Reality is falling apart. NL NL Your vision evolves as #rdemonic #rpowers hijack your being. You begin to see colors that have never before been seen, envision tactics that could not possibly be executed by a mere mortal. NL NL Where is Ranwid? NL Does it matter? NL You see something ~shiny~ on the ground and take it before it becomes @[#9200ff]corrupt[]@ too. NL NL You really are the strongest now.";
        }
        if (DemonForm.ID.equals(cardID)) {
            return "As you begin to channel the #rdemons, your demonstration is cut off by Ranwid. NL NL \"Woah woah woah! Let's not unleash such evil here.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (DoubleTap.ID.equals(cardID)) {
            return "\"Follow up an attack with the exact same thing! It's so predictable, it loops back around to becoming unpredictable.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Exhume.ID.equals(cardID)) {
            return "Following your instruction, Ranwid tears a hole into a pocket dimension of the unrecoverable. NL His face lights up as he reaches inside and pulls out a pair of...shoes? NL NL \"Here!! Here they are! It's been years since I've lost my #b@science@ #b@slippers!\"@ He rummages around his various pockets... NL NL \"I can recover anything! Thank you thank you! Take this trinket I came across, perhaps it will help you!\"";
        }
        if (Feed.ID.equals(cardID)) {
            return "Ranwid's eyes widen in fear as you begin to #r@devour@ him. NL NL As his life force ~slips~ away, you rummage around his various pockets and find a useful trinket. NL NL You feel no guilt. The man was annoying, anyway.";
        }
        if (FiendFire.ID.equals(cardID)) {
            return "Using the knowledge you have taught him, Ranwid channels his efforts. His belongings (journal, satchel, and all) turn to ash as he unleashes a @flurry@ of #rfireballs into a nearby wall. NL NL \"Remarkable! While I already miss my belongings, the tradeoff of highly concentrated destruction is extravagant to say the least.\" NL NL \"Oh, it appears one of my items was left behind in the ash! Take it take it!\"";
        }
        if (Immolate.ID.equals(cardID)) {
            return "Your attack causes the entire room to burst into #r@flames.@ NL Ranwid, catching fire, yelps as he drops to the ground and awkwardly ~rolls~ away. NL NL You step through the ember and pick up an #bitem the strange man left behind. NL NL Leaving the room, you can't help but notice you #rburned yourself a bit.";
        }
        if (Impervious.ID.equals(cardID)) {
            return "\"Much appreciated! Maybe next time I run into those #rmask #rwearing #rhoodlums they'll be deterred by this impenetrable defense.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Juggernaut.ID.equals(cardID)) {
            return "\"Adding a bit of chaos to your defense! Unique, unique.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (LimitBreak.ID.equals(cardID)) {
            return "\"Woah! It's like a real-life version of the villain's gimmick from #gSnecktales! Not that I read children's books at my age, no. Heh...heh.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Offering.ID.equals(cardID)) {
            return "You raise your sword and bring it down onto yourself. NL Through the pain, a swirling dark vortex appears on the floor and a multitude of tools and weapons are @vomited@ out. NL NL \"I am curious as to what type of pact you made to obtain this power! I must research this further. In the meantime, here! Take this.\"";
        }
        if (Reaper.ID.equals(cardID)) {
            return "\"Siphoning the life force of others and transferring it to your own vessel? Morbidly intriguing.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        return null;
    }

    public static String getPotionDialogue(String potionID) {
        if (Elixir.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a series of @burps.@ NL \"I feel empty inside, and not in a negative way! As if my burdens have vanished.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (BloodPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and makes a concerned face. NL \"Thick liquid, yet has a metallic taste. What did you just give me? Eh, I'm quenched.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (HeartOfIron.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a @burp@ as he slowly discards the flask. NL \"I certainly feel more sturdy, but...what happened to my pulse? I can no longer feel it. Eh, I'll look into it later.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        return null;
    }
}
