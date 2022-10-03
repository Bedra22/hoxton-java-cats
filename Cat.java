public class Cat {

    public String name;
    public int age;
    public boolean likesCuddles;

    public Cat(String name, int age, boolean likesCuddles) {

        this.name = name;
        this.age = age;
        this.likesCuddles = likesCuddles;
    }

    void displayInfo() {
        if (likesCuddles) {
            System.out.printf("This is %s, who is %s year(s) old and likes cuddles!\n", name, age);
        } else {
            System.out.printf("This is %s, who is %s year(s) old and doesn't like cuddles!\n", name, age);
        }
    }
}
