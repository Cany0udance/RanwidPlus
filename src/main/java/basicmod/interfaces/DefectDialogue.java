package basicmod.interfaces;


import com.megacrit.cardcrawl.cards.blue.*;
import com.megacrit.cardcrawl.potions.EssenceOfDarkness;
import com.megacrit.cardcrawl.potions.FocusPotion;
import com.megacrit.cardcrawl.potions.PotionOfCapacity;

public class DefectDialogue {
    public static String getCardDialogue(String cardID) {
        if (BallLightning.ID.equals(cardID)) {
            return "\"A reliable blow, followed by a consistent output of #yelectrical damage to your foes? Oh how I wish I were an automaton! Not really. But kinda.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Barrage.ID.equals(cardID)) {
            return "\"Your #borbs not only have special properties, but can be used for physical damage as well. Curious.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (BeamCell.ID.equals(cardID)) {
            return "\"So bright, so flashy!\"  NL NL He attempts to rummage around his various pockets, but notices you've lasered a hole in one of them, causing #bsomething to fall out. NL \"What an amazing display of mechanical intuition! Yes, it's yours, take it take it!\"";
        }
        if (ConserveBattery.ID.equals(cardID)) {
            return "\"Similar to the other automatons of the Spire, you must replenish your core to function. Fascinating.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Claw.ID.equals(cardID)) {
            return "\"Retractable claws that become endlessly sharper when used...Curious!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (ColdSnap.ID.equals(cardID)) {
            return "~\"Brrrr!~ Like being hit by a rapidly-moving snowball.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (CompileDriver.ID.equals(cardID)) {
            return "\"Knowledge begets more knowledge! Fascinating how automatons can be so similar to humans.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Coolheaded.ID.equals(cardID)) {
            return "\"Interesting! It's as if you turned a figurative expression into a literal one. Or perhaps the figurative expression is derived from the literal?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (GoForTheEyes.ID.equals(cardID)) {
            return "#y[OBJECTIVE] #gOBTAIN #gRESOURCE NL #y[IDENTIFY] #gWEAK #gSPOT #gDETECTED NL #y[EXECUTE] #gWEAK #gSPOT #rDAMAGED NL #y[EXECUTE] #gOBTAINING #gRESOURCE... NL #y[UPDATE] #gSCENE #gEVACUATED";
        }
        if (Hologram.ID.equals(cardID)) {
            return "\"My eyes deceive me! Which of you is the real one?\"  NL NL He rummages around his various pockets... NL \"Ah, I'm just going to place this on the ground. Whichever of you is the ~real~ one, step forward and take it!\"";
        }
        if (Leap.ID.equals(cardID)) {
            return "\"Such height! It seems your mechanical legs allow you a greater boost from the ground.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Rebound.ID.equals(cardID)) {
            return "\"Dwellers of #yThe #yCity use this very tactic while playing #bSpireball. Effective and enjoyable.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Recursion.ID.equals(cardID)) {
            return "\"Exemplary! I shall study this further in my chambers.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\" NL NL \"Exemplary! I shall study this further in my chambers.\" NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Stack.ID.equals(cardID)) {
            return "\"Variable defense! Automatons have such curious defensive mechanisms.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SteamBarrier.ID.equals(cardID)) {
            return "#y[OBJECTIVE] #gOBTAIN #gRESOURCE NL #y[OBJECTIVE] #gIMPRESS #gRESOURCE #gHOLDER NL #y[EXECUTE] #rSTEAM #rBARRIER #rINITITATED NL #y[OBSERVE] #gRESOURCE #gHOLDER #gCLAPPING NL #y[OBSERVE] #gRESOURCE #gHOLDER #gOFFERING #gRESOURCE NL #y[UPDATE] #bOBJECTIVES #gCOMPLETE";
        }
        if (Streamline.ID.equals(cardID)) {
            return "You give knowledge to Ranwid. NL He is thankful. NL You receive a #brelic.";
        }
        if (SweepingBeam.ID.equals(cardID)) {
            return "\"Quite the spectacle! The laser #rsinges everything it touches. On a slightly related note, are you available for hire as a bodyguard?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Turbo.ID.equals(cardID)) {
            return "\"I see! Just like- oh, you're in a rush? Well okay, here, take this take this!";
        }
        if (Aggregate.ID.equals(cardID)) {
            return "\"Enthusiasm based on the amount of options ahead of you. You would make a fantastic scientist!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (AutoShields.ID.equals(cardID)) {
            return "\"Instant defense, reminiscent of the same technology used by #yThe #yGuardian. The connections are apparent.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Blizzard.ID.equals(cardID)) {
            return "\"Amazing! Never before have I seen such harsh weather inside the Spire.\"  NL NL He rummages around his various pockets, fingers shaking, teeth chattering... NL #b@\"Brrrrr....@ He-here, look what I've got for you today! Take it take it!\" NL NL A large piece of hail then hits Ranwid in the head, knocking him out.";
        }
        if (BootSequence.ID.equals(cardID)) {
            return "\"Reliable protection upon entering dangerous situations. Automatons sure do have it easy sometimes.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (LockOn.ID.equals(cardID)) {
            return "#y[OBJECTIVE] #gOBTAIN #gRESOURCE NL #y[EXECUTE] #rFORCEFUL #rCONDUCTIVITY #rapplied #rto #rTARGET NL #y[OBSERVE] #gTARGET #gEMITTING #gHIGH-PITCHED #gSQUEAL NL #y[OBSERVE] #gTARGET #gFORFEITING #gRESOURCE";
        }
        if (Capacitor.ID.equals(cardID)) {
            return "\"Marvelous! It seems you're able to update your storage capacity without external assistance. Self-improvement is no longer exclusive to organisms?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Chaos.ID.equals(cardID)) {
            return "\"Using @randomness@ to determine your assets? Interesting.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Chill.ID.equals(cardID)) {
            return "\"Fascinating! When faced with stress, I tend to #bfreeze up, whereas you...well, you also tend to #bfreeze up! Perhaps we aren't so different after all.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Consume.ID.equals(cardID)) {
            return "\"What an innovative automaton you are, sacrificing storage for computational power!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Darkness.ID.equals(cardID)) {
            return "\"Am I the only one feeling the sudden onset of #pdread?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it! I've got a feeling I should bail.\"";
        }
        if (Defragment.ID.equals(cardID)) {
            return "\"I am unsure of how this works. Would you mind open-sourcing your code?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (DoomAndGloom.ID.equals(cardID)) {
            return "\"Terrifying! If only I had a similar option for when those #rmask #rwearing #rhoodlums inevitably show up again.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (DoubleEnergy.ID.equals(cardID)) {
            return "\"Unbelievable! It's as if your action queue undergoes a technological mitosis.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Equilibrium.ID.equals(cardID)) {
            return "You give Ranwid something. NL Ranwid gives you #bsomething. NL Perfectly balanced.";
        }
        if (FTL.ID.equals(cardID)) {
            return "\"What a bold claim! If you're as fast as you say, then take the #brelic from my leftmost pocket.\"  NL NL \"Did you hear me? I said take the relic from my pocket.\" NL NL He attempts to pull out the relic in frustration... NL \"Whuhhh?? It's gone? Amazing! Keep it, you earned it!\"";
        }
        if (ForceField.ID.equals(cardID)) {
            return "\"A personal barrier that adapts to your computational load! Magnificent.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Fusion.ID.equals(cardID)) {
            return "\"The orb acts as an additional energy source to the owner. Bizarre.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (GeneticAlgorithm.ID.equals(cardID)) {
            return "\"Defensive programs that improve their efficiency! New age technology is exciting, isn't it?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Glacier.ID.equals(cardID)) {
            return "Ranwid's eyes stare in awe as a gargantuan #bice #bwall appears before him.  NL NL \"You act as a combat automaton AND a #brefrigerator? Marvellous!! Here, look what I've got for you today! Take it take it!\"";
        }
        if (Heatsinks.ID.equals(cardID)) {
            return "\"All that spent energy must go ~somewhere,~ right?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (HelloWorld.ID.equals(cardID)) {
            return "\"A log of your first 'thoughts'. How adorable!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Loop.ID.equals(cardID)) {
            return "\"What would happen if you were to do this infinitely?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Melter.ID.equals(cardID)) {
            return "\"Fascinating! It seems your laser melts all metallic material. Maybe that arrogant #rcrownbearer in #yThe #yCity would finally be humbled if on the receiving end of this.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Overclock.ID.equals(cardID)) {
            return "\"I can feel the #rheat ~radiating~ from you! Don't overwork yourself now.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Recycle.ID.equals(cardID)) {
            return "\"Your creators did excellent work programming #gpositive #genvironmental #ghabits into you!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (ReinforcedBody.ID.equals(cardID)) {
            return "\"All your energy accumulated into one effective defensive motion! Simple.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Reprogram.ID.equals(cardID)) {
            return "\"Wise choice, giving this up to me! Forfeiting your uniqueness to become more human-like is an unnecessary venture. I seek to study you as you currently are!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (RipAndTear.ID.equals(cardID)) {
            return "#y[OBJECTIVE] #gOBTAIN #gRESOURCE NL #y[EXECUTE] #rSLASH #rTHROUGH #rTARGET NL #y[OBSERVE] #gTARGET #gDISPATCHED NL #y[EXECUTE] #gSCAVENGING #gRESOURCE";
        }
        if (Scrape.ID.equals(cardID)) {
            return "\"Such a violent act of desperation.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (SelfRepair.ID.equals(cardID)) {
            return "\"It's as if your creators intended for you to become entirely self sufficient. Oh how I'd love to meet them!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Skim.ID.equals(cardID)) {
            return "\"Hey, slow down! Let me read all those file names. Ah forget it.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (StaticDischarge.ID.equals(cardID)) {
            return "#y[OBSERVE] #gRECEIVING #gRESOURCE NL #y[ERROR] #rIMMATURE #rDISCHARGE #rDETECTED NL #y[OBSERVE] #gFRIENDLY #gMAN #g@TWITCHING@ #gon #gFLOOR NL NL #b01001111 #b01001111 #b01010000 #b01010011";
        }
        if (Storm.ID.equals(cardID)) {
            return "\"Dark clouds and lightning? Inside the Spire?!\"  NL NL He rummages around his various pockets (also looking for his umbrella)... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Sunder.ID.equals(cardID)) {
            return "\"What a fascinating display of power! Would love to see this used against those annoying little #rgremlin jerks.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Tempest.ID.equals(cardID)) {
            return "\"Creating a lightning strike and harnessing the strength of it for your own electrical orbs? Creative!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (WhiteNoise.ID.equals(cardID)) {
            return "#y[WARNING] #rMISSING #rLOGS #gDETECTED NL #y[ERROR] #gCANNOT #gACCESS #rMISSING #rLOGS NL #y[ASSESS] #gUNKNOWN #gRESOURCE #gOBTAINED NL #y[CONCLUDE] #gRESOURCE #gOBTAINED #gDURING #rUNLOGGED #rEVENT";
        }
        if (AllForOne.ID.equals(cardID)) {
            return "\"A mass recall of your low level functions. Curious.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Amplify.ID.equals(cardID)) {
            return "\"WOW that is a @powerful@ signal! Are you trying to communicate something?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (BiasedCognition.ID.equals(cardID)) {
            return "\"Fascinating! Even automatons can be subject to bias.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Buffer.ID.equals(cardID)) {
            return "\"After all my years of searching, I've finally found it; an #b~immovable~ #b~object!~ Now I just need to find an #r@unstoppable@ #r@force@ and then a groundbreaking experiment shall be conducted!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (CoreSurge.ID.equals(cardID)) {
            return "\"You come equipped with an #bantivirus #bsoftware? Your creators were truly ahead of their time!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (CreativeAI.ID.equals(cardID)) {
            return "\"Can an AI as advanced as you be considered sentient? Hm. After you've completed whatever goal you have, come back to my chambers! Need to conduct some tests...\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (EchoForm.ID.equals(cardID)) {
            return "\"Fascinating! It's as if there's two of you. Wait, are there ACTUALLY two of you? Unbelievable!\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you guys today! One of you, take it take it!\"";
        }
        if (Electrodynamics.ID.equals(cardID)) {
            return "\"Master of electricity! Wonder what else you could master given enough time.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Fission.ID.equals(cardID)) {
            return "\"Ooh, to where do those orbs disperse?\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Hyperbeam.ID.equals(cardID)) {
            return "#y[EXECUTE] #rHYPERBEAM #rINITIATED NL #y[OBSERVE] #gASH #gPILE #gDETECTED NL #y[OBSERVE] #gINTACT #gRESOURCE #gDETECTED";
        }
        if (MachineLearning.ID.equals(cardID)) {
            return "\"All these self-improvement functions! If only it were so easy for regular people.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (MeteorStrike.ID.equals(cardID)) {
            return "As Ranwid finishes speaking, a @loud@ @crash@ can be head overhead. NL NL By the time Ranwid looks up, it's already too late. He is #rcrushed underneath the weight of an inexplicable meteor. NL NL You harness the radiant power of the meteor and pick up the only #bobject that remains of Ranwid's possessions.";
        }
        if (MultiCast.ID.equals(cardID)) {
            return "\"Such elegant juggling! Mesmerizing.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Rainbow.ID.equals(cardID)) {
            return "\"So [#ff0000]p[#ff7000]r[#ffec00]e[#36ff00]t[#00d4ff]t[#003bff]y[#a600ff]! So beautiful! What a light show.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (Reboot.ID.equals(cardID)) {
            return "#y[EXECUTE] #rSYSTEM #rREBOOT #rINITIATED NL . NL .. NL ... NL .... NL #y[UPDATE] #gREBOOT #gC0MPLETE NL #y[SYSTEM] #b(1) #gADDITIONAL #gRESOURCE #gDETECTED";
        }
        if (Seek.ID.equals(cardID)) {
            return "\"As an odd #gserpent once told me, 'The most fulfilling of lives is that in which you can ~find~ anything!' Pretty sure that's what they said, anyway.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        if (ThunderStrike.ID.equals(cardID)) {
            return "\"Concentrated electrical destruction! Perhaps I should consider wearing a plastic outfit when around you.\"  NL NL He rummages around his various pockets... NL \"Here, look what I've got for you today! Take it take it!\"";
        }
        return null;
    }

    public static String getPotionDialogue(String potionID) {
        if (EssenceOfDarkness.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a melancholy @burp.@ NL \"Oh, it's just another one of those days...there's brighter skies ahead, Ranwid. Brighter skies.\" NL NL He rummages around his various pockets, visibly upset... NL \"Here, I've got this for you today. Enjoy or whatever.\"";
        }
        if (FocusPotion.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ #b~glup~ #b~glup~ NL NL He downs the potion in one go and lets out a @burp,@ distracted by something. NL \"Are you aware you have a #ystain on your shirt? I'm sorry, it's very distracting, let me get that for you.\" NL NL He rummages around his various pockets for a cloth... NL \"Much better! Looking spiff. Also, look what I've got for you today! Take it take it!\"";
        }
        if (PotionOfCapacity.POTION_ID.equals(potionID)) {
            return "\"Exquisite! Was feeling parched.\" NL #b~Glup~ NL NL He downs a single sip of the potion before spitting it out. NL @\"Oil?!@ You tried to give me @oil?@ Not everyone is an automaton, you know!\" NL NL He rummages around his various pockets... NL \"You have a lot to learn about the Spire. It's not your fault. Take this.\"";
        }
        return null;
    }
}
