import java.util.Scanner;

public class questionManager {
    Scanner scan = new Scanner(System.in);

    public int queryInt(String question) {
        String response = query(question);

        return Integer.parseInt(response);
    }

    public String query(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(question);

        return scanner.nextLine();
    }
}
