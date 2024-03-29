// 子クラス
public class EngineerB extends PersonB{
    // コンストラクタの定義
    public EngineerB(int history) {
        // 親クラスのコンストラクタを呼び出す
        super("engineerB");

        // 処理
        System.out.println("エンジニア歴は" + history + "年です");
    }
}