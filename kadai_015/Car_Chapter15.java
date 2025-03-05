package kadai_015;    

//車クラス
public class Car_Chapter15 {
	 // フィールド
	private int   gear  = 1; //1速から5速を表す
	private int   speed = 10; //ギアチェン時後の速度を表す
	 
	
	//メソッド
	public void gearChange ( int afterGear ) {
	
	System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
	
		this.gear = afterGear;
		//ギアの値
		switch (afterGear) {
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		default -> this.speed = 10;
 	};
 	
  }
	
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");

	}
}