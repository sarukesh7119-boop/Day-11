class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
         String str1 = "";
        String str2 = "";
        String str3 = "";
        if (length >= 10000 || width >= 10000 || height >= 10000) {
            str1 = "Bulky";
        }
        long v = 1L * length * width * height;
        if (v >= 1000000000) {
            str1 = "Bulky";
        }
        if (mass >= 100) {
            str2 = "Heavy";
        }
        if (str1.equals("Bulky") && str2.equals("Heavy")) {
            str3 = "Both";
        } else if (!str1.equals("Bulky") && !str2.equals("Heavy")) {
            str3 = "Neither";
        } else if (str1.equals("Bulky") && !str2.equals("Heavy")) {
            str3 = "Bulky";
        } else if (!str1.equals("Bulky") && str2.equals("Heavy")) {
            str3 = "Heavy";
        }

        return str3;
    }
}