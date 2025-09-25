 interface GameLevel extends Cloneable {
    GameLevel clone();
    void designLevel();
 }
 class NormalLevel implements GameLevel {
    @Override
    public GameLevel clone() {
        return new NormalLevel();
 }
    @Override
    public void designLevel() {
        System.out.println("Designing a normal game level...");
 }
 }

  class HardLevel implements GameLevel {
 @Override
 public GameLevel clone() {
 return new HardLevel();
 }
 @Override
 public void designLevel() {
 System.out.println("Designing a hard game level...");
 }
 }


 public class Exercise2 {
 public static void main(String[] args) {
 GameLevel normalLevelPrototype = new NormalLevel();
 GameLevel normalLevelDesign = normalLevelPrototype.clone();
 normalLevelDesign.designLevel();

 GameLevel hardLevelPrototype = new HardLevel();

 GameLevel hardLevelDesign = hardLevelPrototype.clone();
 hardLevelDesign.designLevel();
 }
 }





  // dont forget the class diagrams

  // submission by github repo link and zip file of codes.