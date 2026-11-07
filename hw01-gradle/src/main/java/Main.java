import com.google.common.base.Joiner;

public class Main {
    public static void main(String[] args) {
        String result = Joiner.on(", ").join("Java", "Gradle", "Guava");
        System.out.println("Результат работы Guava: " + result);
        System.out.println("Hello Gradle!");
    }
}