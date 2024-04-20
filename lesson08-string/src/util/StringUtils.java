package util;

public class StringUtils {
	
	private StringUtils() {
	}
	
	// CharSequence là interface cha của String và StringBuilder, StringBuffer
	public static void print(String varName, CharSequence var) {
		System.out.println(varName + "(value=" + var + ", hash=" + System.identityHashCode(var) + ")");
	}
	
}
