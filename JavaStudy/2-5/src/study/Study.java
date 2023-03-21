package study;



import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

	public class Study {

	    public static final String SHOP_SHOHIN_00 = "バナナ";
	    public static final String SHOP_SHOHIN_01 = "牛乳";
	    public static final String SHOP_SHOHIN_02 = "豚肉";
	    public static final String SHOP_SHOHIN_03 = "コロッケ";

	public static void main(String[] args) {
		List<String> shohinList = new ArrayList <String>();
		shohinList.add(SHOP_SHOHIN_00);
		shohinList.add(SHOP_SHOHIN_01);
		shohinList.add(SHOP_SHOHIN_02);
		shohinList.add(SHOP_SHOHIN_03);
		
	 // ① 定数を全て使って、String型のListを記述してください。


    // ② 以下の「shopMap.put(shohinList.get(1), 180);」の処理について、コメントを記述してください。
    /*
     * 各価格を要素として追加。
     *
     */
    LinkedHashMap<String, Integer> shopMap = new LinkedHashMap<String, Integer>();
    shopMap.put(shohinList.get(0), 125);
    shopMap.put(shohinList.get(1), 180);
    shopMap.put(shohinList.get(2), 350);
    shopMap.put(shohinList.get(3), 100);
    for (String key : shopMap.keySet()) {
    	int value = shopMap.get(key);
    	System.out.println(key +"=" + value + "円になります!");
    }
    
   
    
    	}
        
      


    


    // ③ カリキュラムを参考に拡張for文を使って、課題の画像と同じ表示になるよう記述してください。
    // 「shohinList」と「shopMap」が保持する値を上手く利用しましょう。




	}
	
	


