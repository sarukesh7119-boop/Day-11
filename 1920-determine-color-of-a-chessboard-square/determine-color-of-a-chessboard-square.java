class Solution {
    public boolean squareIsWhite(String coordinates) {
        char letter = coordinates.charAt(0);
        int number = coordinates.charAt(1);

        int letterPosition = letter - 'a' + 1;

        if((letterPosition % 2) == (number % 2)){
            return false;
        }
        return true;
    }
}