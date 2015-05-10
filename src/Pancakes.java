import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

import org.apache.commons.io.FileUtils;

public class Pancakes {

	public static void main(String[] args) throws IOException {

		ArrayList<String> lines = new ArrayList<String>();
		lines = (ArrayList<String>) FileUtils.readLines(new File("input.txt"));
		int output = 0;
		for (int i = 2; i <= Integer.parseInt(lines.get(0))*2; i=i+2) {
			
			String[] arr = lines.get(i).split(" ");
			int max = Integer.parseInt(arr[0]);

			for (int j = 0; j < arr.length; j++) {
				int num = Integer.parseInt(arr[j]);
				if(num>max)
					max=num;
			}
			switch (max) {
			case 1:
				output=1;	break;
			case 2:
				output=2;	break;
			case 3:
				output=3;	break;
			case 4:
				output=3;	break;
			case 5:
				output=4;	break;
			case 6:
				output=4;	break;
			case 7:
				output=5;	break;
			case 8:
				output=5;	break;
			case 9:
				output=6;	break;
			default:
				break;
			}
			String data = "Case #" + i/2 + ": " + output + "\n";
			FileUtils.write(new File("output.txt"), data, true);
		}
	}
}
