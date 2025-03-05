package kadai_015;

public class Car_Chapter15 {
    public static void main(String[] args) {
        // インスタンス化（1つのオブジェクトを作成）
        CarExec_Chapter15 car = new CarExec_Chapter15(1,10);

        // ギアを3に変更
        car.gearChange(3);

        // 車の状態を表示
        car.run();
    }
}
