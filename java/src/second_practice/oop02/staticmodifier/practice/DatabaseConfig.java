package second_practice.oop02.staticmodifier.practice;

public class DatabaseConfig {
    public static final String DB_URL;
    public static final int PORT;

    static {
        System.out.println("Инициализация конфигурации БД...");
        DB_URL = "jdbc:mysql://localhost:3306/mydb";
        PORT = 3306;
    }
}