package content;

import artifact.Artifact;
import buff.Buff;
import enemy.Enemy;
import location.BattleArea;
import weapon.Verbs;
import weapon.Weapon;
import java.util.ArrayList;
import java.util.List;

public class BattleAreas {
    private static ArrayList<BattleArea> contentBattleAreas = new ArrayList<BattleArea>();
    public BattleAreas(){
        //empty constructor lol
    }

    private static ArrayList<Artifact> getFamilyArtifacts(String family){
        ArrayList<Artifact> artifactList = new ArrayList<Artifact>();
        for(Artifact artifact: artifacts.getContentArtifacts()){
            if(artifact.getFamily().equals(family)) artifactList.add(artifact);
        }
        return artifactList;
    }

    public static void initializeContentBattleAreas(){
        BattleArea braydensHouse = new BattleArea(
            "Brayden's House",
            false,
            new ArrayList<Enemy>(
                List.of(new Enemy(
                    "A voice from Brayden's head",
                    60,
                    6,
                    3,
                    new Weapon(
                        "Psychology",
                        2,
                        "Mental",
                        2,
                        new Buff(""),
                        new Verbs("messed with", "tricked"),
                        "A psychic weapon."
                    ),
                "A voice that often talks to Brayden.")
                )
            ),
            new ArrayList<Artifact>(List.of(getFamilyArtifacts("brayden messerschmidt")))
        );

        BattleArea unfinishedConstructionSite = new BattleArea(
            "Unfinished Construction Site",
            true,
            new ArrayList<Enemy>(
                List.of(new Enemy(
                    "OSHA Worker",
                    30,
                    3,
                    1,
                    new Weapon(
                        "Clipboard",
                        1,
                        "Clipboard",
                        1,
                        new Buff(""),
                        new Verbs("smacked", "broke the clipboard in the process of smacking"),
                        "A wooden clipboard"
                    ),
                "An OSHA worker with an unlimited supply of clipboards.")
                )

            ),
            new ArrayList<Artifact>(List.of(getFamilyArtifacts("max shrum")))
        );

        contentBattleAreas.add(braydensHouse);
        contentBattleAreas.add(unfinishedConstructionSite);
    }

    public static ArrayList<BattleArea> getContentBattleAreas() {
        return contentBattleAreas;
    }
}