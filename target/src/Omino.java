import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;

public class Omino {

	public static void main(String[] args) throws IOException {

		ArrayList<String> lines = new ArrayList<String>();
		lines = (ArrayList<String>) FileUtils.readLines(new File("input.txt"));
		
		for (int i = 1; i <= Integer.parseInt(lines.get(0)); i++) {
			int x = Integer.parseInt(lines.get(i).split(" ")[0]);
			int r = Integer.parseInt(lines.get(i).split(" ")[1]);
			int c = Integer.parseInt(lines.get(i).split(" ")[2]);
			
			String output="RICHARD";
			switch (x) {
			case 1:
				if(r*c%x==0)
					output="GABRIEL";
				break;
			case 2:
				if(r*c%x==0)
					output="GABRIEL";
				break;
			case 3:
				if( (r*c%x==0) && ( (r==3 && c==3)  || ((r%3==0 && c%1==0) || (r%1==0 && c%3==0)) && ((r%2==0 && c%1==0) || (r%1==0 && c%2==0)) ))
					output="GABRIEL";
				break;
			case 4:
				if( (r*c%x==0) && ( (r==4 && c==4)  || ((r==3 && c==4) || (r==4 && c==3)) || ((r%4==0 && c%1==0) || (r%1==0 && c%4==0)) && ((r%3==0 && c%1==0) || (r%1==0 && c%3==0)) && ((r%2==0 && c%2==0)) ))
					output="GABRIEL";
				break;
			default:
					output="unknown";
				break;
			}
			String data = "Case #" + i + ": " + output + "\n";
			FileUtils.write(new File("output.txt"), data, true);
		}
	}
}
