package kadai_021;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary_Chapter21_2 {

	public void searchDic(String[] input) {
	
		HashMap<String,String> dictionary = new HashMap<String,String>();
	
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("stawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
		
		
		//Scannerクラスのオブジェクトを生成
		Scanner scanner = new Scanner(System.in);
	
		//拡張for文でHashMapのEntryをSet型で繰り返し取得
		for (HashMap.Entry<String, String> fruits: dictionary.entrySet()) {
			String word = scanner.next();
			if (word != fruits.getKey()) {
				System.out.println(word + "は辞書に存在しません");
			} else {
				System.out.println(fruits.getKey() + "の意味は" + fruits.getValue());
			}
			scanner.close();
		}
	
	}
}
