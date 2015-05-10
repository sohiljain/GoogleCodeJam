import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class Dijkastra {

	private static String output;

	public static void main(String[] args) throws IOException {

		ArrayList<String> lines = new ArrayList<String>();
		lines = (ArrayList<String>) FileUtils.readLines(new File("/home/sohil/Downloads/input.txt"));
		for (int i = 1; i <= Integer.parseInt(lines.get(0)); i++) {
			
			i++;
			long length = Long.parseLong(lines.get(i));
			int [][]arr = new int[(int) length][2];
			
			for (int j = 0; j < length; j++) {
				i++;
				arr[j][0] = Integer.parseInt(lines.get(i).split(" ")[0]);
				arr[j][1] = Integer.parseInt(lines.get(i).split(" ")[1]);
			}
			
			System.out.println(arr);
			

//			String data = "Case #" + i/2 + ": " + output + "\n";
//			 FileUtils.write(new File("output.txt"), data, true);
		}
	}
}
