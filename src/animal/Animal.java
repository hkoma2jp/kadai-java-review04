package animal;

public class Animal {
    // フィールド（名前:name 年齢:age）
    private String name;
    private int age;

    // コンストラクタ
    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter / setter

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name セットする name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age セットする age
     */
    public void setAge(int age) {
        this.age = age;
    }

    // メソッド（名前と年齢を言う）
    public void say () {
        System.out.println(name + "です。" + age +"歳です。");
    }

}
