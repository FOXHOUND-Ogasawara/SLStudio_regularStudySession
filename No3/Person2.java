public class Person2 {
    // 氏名
    private String name;
    // 年齢
    private int age;
    // 住所
    private String address;

    // コンストラクタ
    public Person2(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // メソッド
    public void showProfile() {
        System.out.println("私は" + name + "、年齢は" + age + "歳です。");
        System.out.println(address + "に住んでいます。");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("名前を設定しました");
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("年齢を設定しました");
    }

    public void setAddress(String address) {
        this.address = address;
        System.out.println("住所を設定しました");
    }
}