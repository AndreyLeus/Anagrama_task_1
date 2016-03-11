import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	String str = "";
	try {
		str = reader.readLine();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	String temp = new String(str);
	Map<Integer,String> contents =  new HashMap<Integer,String>();

	char [] ch = str.toCharArray();
	for (int i = 0; i < str.length(); i++ ){
		if (checker(ch[i])) {
			continue;
		}
		else{
			contents.put(i, String.valueOf(ch[i]));
			temp = temp.substring(0,i)+temp.substring(i+1,temp.length());
		}
	}
				
	String []text = str.split(" ");
	
	String result = "";
	
	for(int i = 0; i < text.length; i++){
		char [] chTemp = text[i].toCharArray();
					
		for(int j = chTemp.length-1; j >=0; j--){
			if (checker(chTemp[j])) {
                result += chTemp[j];
            }
		}		
		result +=" ";
	}
	
	result = result.trim();
	
	for (Map.Entry entry : contents.entrySet()) {
	    result = result.substring(0, (int) entry.getKey()) + entry.getValue() + result.substring((int) entry.getKey(), result.length());
	}
	
	System.out.println(result);
	
	
	}
	static boolean checker (char args) {
		String list = "qwertyuiopasdfghjklzxcvbnm ";
		return list.contains(String.valueOf(args));
	}
}
	
	
	/*
	 * import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	String str = /*"abcd efgh";"a1bcd efg!h";
	

	//char[] t1Char = new char[t1.length()];
	
	String []t1String = str.split(" ");
	
	String result = "";
	
	for(int i = 0; i < t1String.length; i++){
		char [] ch = t1String[i].toCharArray();
		char [] temp = new char[ch.length];
		
			
		for(int j = ch.length-1; j >=0; j--){
			if (checker(ch[j])) {
                temp[ch.length-1-j] = ch[j];
            }
			else {
				if (temp[j] !=  '\u0000'){
					temp[j] = ch[j];
				}
				else {
					for (int k = ch.length-1; k >= j; k--){
						temp[k] = temp[k-1];
						temp[j] = ch[j];
					}
				}
			}
        }		
		result += String.valueOf(temp);
		result +=" ";
	}
	
	result = result.trim();
	
	System.out.println(result);
	
	
	}
	static boolean checker (char args) {
		String list = "qwertyuiopasdfghjklzxcvbnm";
		return list.contains(String.valueOf(args));
	}
}
	
	
	
	
	



	 * 
	 * 
	 * 
	 */
	
	


/*STRING
 * 
 * public static void main(String[] args) {
	String str = /*"abcd efgh";
	//String t2 = "efg!h";
	

	//char[] t1Char = new char[t1.length()];
	
	String []t1String = str.split(" ");
	
	String result = "";
	
	for(int i = 0; i < t1String.length; i++){
		char [] ch = t1String[i].toCharArray();
		
			
		for(int j = ch.length-1; j >=0; j--){
			if (checker(ch[j])) {
                result += ch[j];
            }
			else {
				result = result.substring(0, j) + String.valueOf(ch[j]) + result.substring(j,result.length()-1);
			}
        }		
		result +=" ";
	}
	
	result = result.trim();
	
	System.out.println(result);
	
	
	}
	static boolean checker (char args) {
		String list = "qwertyuiopasdfghjklzxcvbnm";
		return list.contains(String.valueOf(args));
	}
}

 * 
 * 
 */
