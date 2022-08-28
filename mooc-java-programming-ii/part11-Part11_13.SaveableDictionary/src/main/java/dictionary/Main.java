package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary test = new SaveableDictionary("word.txt");
        test.load();
    }
}
