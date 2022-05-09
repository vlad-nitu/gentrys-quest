package location;
import java.util.ArrayList;

import artifact.Artifact;
import enemy.Enemy;

public class BattleArea {
  private final String name;
  private final boolean isBossArea;
  private ArrayList<Enemy> enemies = new ArrayList<Enemy>();
  private ArrayList<Artifact> artifacts = new ArrayList<Artifact>();
  
  public BattleArea(String name, boolean isBossArea, ArrayList<Enemy> enemies, ArrayList<Artifact> artifacts){
    this.name = name;
    this.isBossArea = isBossArea;
    this.enemies = enemies;
    this.artifacts = artifacts;
  }

  public String getName() {
    return name;
  }
}
