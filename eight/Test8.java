package eight;

public class Test8 {
    int age = 18;
    String sex = "男";
    int height = 100;
    void speak() {
        System.out.println("hello");
    }

    String getName(String name) {
        height = height + 1;
        System.out.println(height);
        return name;
    }

    void happyYear(String hi) {
        age = age + 1;
        if (hi.equals("no")) {
            System.out.println("none");
            return;
        } else System.out.println(hi + " " + age);
    }

    public static void main(String[] args) {
        Test8 per = new Test8();
        per.age = 19;
        System.out.println(per.age);
        per.happyYear("yes");
        System.out.println(per.getName("LiHua"));
     }

}
