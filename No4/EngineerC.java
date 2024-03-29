public class EngineerC extends PersonC {
    String job;

    public EngineerC(String name, String job) {
        super(name);
        this.job = job;
    }

    public void sayHello() {
        System.out.println("Hello!! 僕は" + this.name + "、" + this.job + "エンジニアさ");
    }
}