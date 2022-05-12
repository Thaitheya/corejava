package base;

public class Anagram {
    public static boolean isAnagram(String X, String Y) {
    	if(X == null || Y == null) {
    		return false;
    	}
		if(X.length() != Y.length()) {
			return false;
		}
		return false;
    }
	public static void main(String[] args) {
		Anagram.isAnagram(null, null);
	}
}
