import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class Mushroom {

	private static String output;

	public static void main(String[] args) throws IOException {

		ArrayList<String> lines = new ArrayList<String>();
		lines = (ArrayList<String>) FileUtils.readLines(new File("/home/sohil/Downloads/input.txt"));
		for (int i = 1; i < lines.size(); i++) {
			
			int length = Integer.parseInt(lines.get(i));
			int [][]arr = new int[(int) length][2];
			
			for (int j = 0; j < length; j++) {
				i++;
				arr[j][0] = Integer.parseInt(lines.get(i).split(" ")[0]);
				arr[j][1] = Integer.parseInt(lines.get(i).split(" ")[1]);
			}
			
			float []m = new float[length];
			for (int k = 0; k < length; k++) {
				for (int k2 = 0; k2 < length; k2++) {
					float y = arr[k2][1]-arr[k][1];
					float x = arr[k2][0]-arr[k][0];
					if(x==0)
						m[k]=99;
					else
						m[k] = y/x;
					System.out.println(m[k]);
				}
				
			}
			
			
//			String data = "Case #" + i/2 + ": " + sum + " " + sum1 + "\n";
//			FileUtils.write(new File("output.txt"), data, true);
		}
	}
}
