package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		
		//入力したじゃんけんの手を取得
		Scanner scanner = new Scanner(System.in);
		String myChoice = scanner.nextLine();
		
		//正しいじゃんけんの手か判定
			if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
				scanner.close();
			} else {
				System.out.println("正しいじゃんけんの手ではありません");
				return null;
			}
		return myChoice;
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		
		String[] hands = {"r", "s", "p"};
		int i = (int)Math.floor(Math.random() * 3);
		return hands[i];
	}
	
	//じゃんけんを行う
	public void playGame() {
		HashMap<String, String> handsMap = new HashMap<String, String>();
		
		handsMap.put("r", "グー");
		handsMap.put("s", "チョキ");
		handsMap.put("p", "パー");
		
		
		String myHand = getMyChoice();
		//不正な入力の場合はゲームを終了する
		if (myHand == null) {
			return;
		}		
		String yourHand = getRandom();
		
		//自分と対戦相手のじゃんけんの手を出力する
		System.out.println("自分の手は" + handsMap.get(myHand) + "、対戦相手の手は" + handsMap.get(yourHand) );
		
		//自分と対戦相手のじゃんけんの手を比較する
		if (myHand.equals(yourHand)) {
			System.out.println("あいこです");
		} else if (myHand.equals("r") && yourHand.equals("p")) {
			System.out.println("自分の負けです");
		} else if (myHand.equals("r") && yourHand.equals("s")) {
			System.out.println("自分の勝ちです");
		} else if (myHand.equals("s") && yourHand.equals("r")) {
			System.out.println("自分の負けです");
		} else if (myHand.equals("s") && yourHand.equals("p")) {
			System.out.println("自分の勝ちです");
		} else if (myHand.equals("p") && yourHand.equals("s")) {
			System.out.println("自分の負けです");
		} else if (myHand.equals("p") && yourHand.equals("r")) {
			System.out.println("自分の勝ちです");
		} 
		
	}
}
