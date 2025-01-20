import java.util.ArrayList;

public class s24GEnerateIP {
    public static void main(String[] args) {
      String s = "11211";
      System.out.println(GenerateIPAddres(s));
    }

    public static ArrayList<String> GenerateIPAddres(String s) {

        ArrayList<String> result = new ArrayList<>();

        int n = s.length();
        if (n < 4 || n > 12) {
            result.add("-1");
            return result;
        }

        for (int i = 1; i < n && i < 4; i++) {
            for (int j = i + 1; j < n && j < i + 4; j++) {
                for (int k = j + 1; j < n && k < j + 4; k++) {
                    if (k < n) {
                        String part1 = s.substring(0, i);
                        String part2 = s.substring(i, j);
                        String part3 = s.substring(j, k);
                        String part4 = s.substring(k);
                        if (isVAlid(part1) && isVAlid(part2) && isVAlid(part3) && isVAlid(part4)) {
                            result.add(part1 + "." + part2 + "." + part3 + "." + part4);
                        }
                    }
                }
            }
        }

        if (result.isEmpty()) {
            result.add("-1");
        }
        return result;
    }

    private static boolean isVAlid(String part) {
        if (part.length() > 3 || part.length() == 0) {
            return false;
        }
        if (part.charAt(0) == '0' && part.length() > 1) {
            return false;
        }

        int value = Integer.parseInt(part);
        return value >= 0 && value <= 255;
    }

}
