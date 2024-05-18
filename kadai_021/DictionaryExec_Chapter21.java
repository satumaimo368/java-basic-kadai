package kadai_021;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21 {

	public static void main(String[] args) {
		//Dictionary_Chapter21クラスのオブジェクトを作る
		Dictionary_Chapter21 search = new Dictionary_Chapter21();
		
		String[] fruits = {"apple", "banana", "grape", "orange"};
		
		search.searchDic(fruits);
	}
}
