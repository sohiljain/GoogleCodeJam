import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class Logging {

	private static String output;

	public static void main(String[] args) throws IOException {

		ArrayList<String> lines = new ArrayList<String>();
		lines = (ArrayList<String>) FileUtils.readLines(new File("input.txt"));
		
		for (int i = 1; i <= Integer.parseInt(lines.get(0))*2; i++) {
			int sum = 0;
			long length = Long.parseLong(lines.get(i).split(" ")[0]);
			i++; 
			int []arr = new int[(int) length];
			for (int j = 0; j < length; j++) {
				String []arr1 = lines.get(i).split(" ");
				arr[j] = Integer.parseInt(arr1[j]);
				
				if(j>0) {
					if(arr[j]<arr[j-1]) {
						sum = sum + arr[j-1] - arr[j];
					}
				}
			}			
			
			int max = arr[0] - arr[1], totalDiff=0;
			for (int j = 1; j < length; j++) {
				int diff = arr[j-1] - arr[j];
				
				if(max < diff)
					max = diff;

				if(diff>0)
					totalDiff = totalDiff + diff;
			}

			int sum1=0;
			for (int j = 0; j < length-1; j++) {
				if(max>arr[j]) 
					sum1 = sum1 + arr[j];
				else
					sum1 = sum1 + max;
				
			}
			
			
			System.out.println(sum1);
			
			
			String data = "Case #" + i/2 + ": " + sum + " " + sum1 + "\n";
			FileUtils.write(new File("output.txt"), data, true);
		}
	}
}
