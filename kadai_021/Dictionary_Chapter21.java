package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    private HashMap<String, String> dictionaryMap;

    public Dictionary_Chapter21() {
        dictionaryMap = new HashMap<>();
        dictionaryMap.put("apple", "りんご");
        dictionaryMap.put("peach", "もも");
        dictionaryMap.put("banana", "バナナ");
        dictionaryMap.put("lemon", "レモン");
        dictionaryMap.put("pear", "なし");
        dictionaryMap.put("kiwi", "キウイ");
        dictionaryMap.put("strawberry", "いちご");
        dictionaryMap.put("grape", "ぶどう");
        dictionaryMap.put("muscat", "マスカット");
        dictionaryMap.put("cherry", "さくらんぼ");
    }

    public String getMeaning(String word) {
        return dictionaryMap.getOrDefault(word, "辞書に存在しません");
    }

    public void searchWords(String[] words) {
        for (String word : words) {
            System.out.println(word + "の意味は" + getMeaning(word));
        }
    }
}
