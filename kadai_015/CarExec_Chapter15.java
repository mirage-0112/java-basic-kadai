package kadai_015;    

// 車クラス
public class CarExec_Chapter15 {
    // フィールド
    private int gear  = 1;  // 1速から5速を表す
    private int speed = 10; // ギアチェン時後の速度を表す

    // コンストラクタ（初期化処理）
    public CarExec_Chapter15(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // ギアを変更するメソッド
    public void gearChange(int afterGear) {
        int beforeGear = this.gear; // 変更前のギアを記録
        this.gear = afterGear;

        // ギアの値に応じた速度の変更
        switch (afterGear) {
            case 1 -> this.speed = 10;
            case 2 -> this.speed = 20;
            case 3 -> this.speed = 30;
            case 4 -> this.speed = 40;
            case 5 -> this.speed = 50;
            default -> this.speed = 10;
        }

        // ギア変更メッセージを正しく表示
        System.out.println("ギア" + beforeGear + "から" + afterGear + "に切り替えました");
    }

    // 車の速度を表示するメソッド
    public void run() {
        System.out.println("速度は時速" + this.speed + "kmです");
    }
}
