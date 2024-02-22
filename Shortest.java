public class Shortest {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println();
        } else {
            String shortest = args[0];
            for (String str : args) {
                if (str.length() < shortest.length()) {
                    shortest = str;
                }
            }
            System.out.println(shortest);
        }
    }
}
