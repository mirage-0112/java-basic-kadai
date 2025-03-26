package kadai_028;

import java.util.Scanner;

public class JyankenExec_Chapter28 {
   
	
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String choice = scanner.nextLine().toLowerCase();
        
        
        while (!choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
            System.out.println("無効な入力です。r, s, p のいずれかを入力してください: ");
            choice = scanner.nextLine().toLowerCase();
        }
        return choice;
    }

    
    public String getRandom() {
        int random = (int) Math.floor(Math.random() * 3); 
        switch (random) {
            case 0: return "r"; 
            case 1: return "s"; 
            case 2: return "p"; 
            default: return ""; 
        }
    }

    public void playGame() {
        String myChoice = getMyChoice();
        String opponentChoice = getRandom();

        System.out.println("自分の手は" + convertToJapanese(myChoice) + ", 対戦相手の手は" + convertToJapanese(opponentChoice));

        
        if (myChoice.equals(opponentChoice)) {
            System.out.println("引き分けです");
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) || 
                   (myChoice.equals("s") && opponentChoice.equals("p")) || 
                   (myChoice.equals("p") && opponentChoice.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }

    private String convertToJapanese(String choice) {
        switch (choice) {
            case "r": return "グー";
            case "s": return "チョキ";
            case "p": return "パー";
            default: return "";
        }
    }
}