import java.util.HashMap;
import java.util.Map;

public class test {
	public static void main(String[] args) {		
		String[][] source = new String[][]	{
				{"ll", "l"} ,
				{"li", "i"} ,
				{"lj", "j"} ,
				{"lk", "k"} ,
				{"il", "i"} ,
				{"ii", "-l"} ,
				{"ij", "k"} ,
				{"ik", "-j"} ,
				{"jl", "j"} ,
				{"ji", "-k"} ,
				{"jj", "-l"} ,
				{"jk", "i"} ,
				{"kl", "k"} ,
				{"ki", "j"} ,
				{"kj", "-i"} ,
				{"kk", "-l"} 
		};

		Map<String, String> map = new HashMap<String, String>();
		for (String[] strings : source) {
			map.put(strings[0], strings[1]);
		}
		
		String string="ikjjjlkiikl";
		boolean flag = false;
		String s2 = string.substring(0, 1);
		int start=1;
		if(s2.substring(0, 1)=="-") {
			start++;  s2 = s2.substring(start, start+1);
			flag = !flag;
		}
		
		for ( int i = start ; i < string.length(); i++) {
			String s1 = string.substring(i, i+1);
			if(s1.substring(0, 1)=="-") {
				i++;  s1 = s1.substring(i, i+1);
				flag = !flag;
			}

			String s = s2 + s1;
			s2 = map.get(s);

			if(s2.substring(0, 1).equals("-")) {
				flag = !flag;
				s2 = s2.substring(1, 2);
			}
		}
		
		
		
		
		
		
	}
}
