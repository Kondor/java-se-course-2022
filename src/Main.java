package src;

public class Main {

    public static void main(String[] args) {
        /*
            Note note1 = new Note("name1","text2");
            /аутентификация
            /авторизация - прошли аутентификацию (проверка прав)

            System.out.println("Hello");
            Scanner s = new Scanner(System.in); // помогает работать с потоками данных с консоли

            String str = s.nextLine(); // остановить пока не введем строку
        */

        /*
            Note note1 = new Note("Elena", "Why is time running so fast");
            System.out.println(note1.getAuthor() + ' ' + note1.getName() + ' ' + note1.getText());
        */

        int code = Authentication.authenticate();

        if (code == 0) {
            System.out.println("Login success!");
        } else {
            System.out.println("Login failed!");
        }
    }
}
