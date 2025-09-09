public class Scene {
    private String description;
    private String choiceA, choiceB, choiceC;
    private String itemA, itemB, itemC;
    private Scene nextSceneA, nextSceneB, nextSceneC;
    private int damageA, damageB, damageC;
    private int XPA, XPB, XPC;
    private boolean isEnd;

    public Scene(String description, String choiceA, Scene nextSceneA, int damageA, int XPA, String itemA,
                 String choiceB, Scene nextSceneB, int damageB, int XPB, String itemB,
                 String choiceC, Scene nextSceneC, int damageC, int XPC, String itemC, boolean isEnd) {
        this.description = description;
        this.choiceA = choiceA;
        this.nextSceneA = nextSceneA;
        this.damageA = damageA;
        this.XPA = XPA;
        this.itemA = itemA;
        this.choiceB = choiceB;
        this.nextSceneB = nextSceneB;
        this.damageB = damageB;
        this.XPB = XPB;
        this.itemB = itemB;
        this.choiceC = choiceC;
        this.nextSceneC = nextSceneC;
        this.damageC = damageC;
        this.XPC = XPC;
        this.itemC = itemC;
        this.isEnd = isEnd;
    }

    public void write(String textInput){
        for(int i = 0; i < textInput.length(); i++){
            System.out.printf("%c", textInput.charAt(i));
            try {
                Thread.sleep(10);    
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("\n");
    }

    public void displayScene() {
        write(description);
        if(isEnd == true) {
            System.exit(0);
        }
        System.out.println("A. " + choiceA);
        System.out.println("B. " + choiceB);
        System.out.println("C. " + choiceC);
        System.out.println("INFO. Tampilkan Informasi");
    }

    public Scene makeChoice(String choice, Character player) {
        switch (choice.toUpperCase()) {
            case "A":
                player.takeDamage(damageA);
                player.addXP(XPA);
                player.setItem(itemA);
                return nextSceneA;
            case "B":
                player.takeDamage(damageB);
                player.addXP(XPB);
                player.setItem(itemB);
                return nextSceneB;
            case "C":
                player.takeDamage(damageC);
                player.addXP(XPC);
                player.setItem(itemC);
                return nextSceneC;
            default:
                return null;
        }
    }
}