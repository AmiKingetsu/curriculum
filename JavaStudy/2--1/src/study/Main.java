package study;

public class Main {

	public static void main(String[] args) {
		String firstName ="Ami";
		String lastName= "Kingetsu";
		
		//① firstNameとlastNameという名前の変数を定義し、
	      //   firstNameには自分の名前、lastNameには自分の名字で初期化しなさい

	
	System.out.println(getName(firstName, lastName));
    System.out.println();
    
  //③ arr 配列をループさせ、isOdd関数を使って配列の要素が奇数かどうかの判定を行いなさい。
    //   要素が奇数の場合には「nは奇数です。」と出力されます。
    int[] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

		for (int i = 0; i < arr.length; i++)
			isOdd(arr[i]);
		
	}
	 //② 関数を定義しなさい。
    //   関数名：getName
    //  修飾子：public
    //   引数には①で定義したfirstNameとlastNameを引数で受け取り、
    //  連結した値を返り値とする変数を定義しなさい。

	public static String getName(String firstName, String lastName) {
    	String fullName = lastName + firstName;
    	return fullName;
    }
	//奇数の判定を行う。
    public static void isOdd(int num) {
    	if(num %2 !=0) {
    		System.out.println(num + "は奇数です。");
    	
    }

    }
    }



