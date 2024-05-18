package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
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
		
		
		//拡張for文でHashMapのEntryをSet型で繰り返し取得
		for (int i = 0; i < input.length; i++) {
			String result = dictionary.get(input[i]);
			if (result == null) {
				System.out.println(input[i] + "は辞書に存在しません");
			} else {
				System.out.println(input[i] + "の意味は" + result);
			}
		}
	
	}
}
