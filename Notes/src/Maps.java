import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner s = new Scanner(new File("covid317.csv"));
			int count = 0;
			//long total = 0;
			s.nextLine(); // skips the column header
			
			HashMap<String, Integer> states = new HashMap<String, Integer>();
			
			
			while(s.hasNextLine()) {
				//death for CA
				
				String currLine = s.nextLine();
				String[] split = currLine.split(",");
				
				
				/*if(split[1].equals("CA")&&split[2].length() > 0) {
					System.out.println("CA: " + currLine);
					total += Integer.valueOf(split[2]);
				}
				*/
				if(split[2].length() > 0) {
					if(states.containsKey(split[1])){
						int total = states.get(split[1]); //grab from map
						total += Integer.valueOf(split[2]); //update from file's current row
						
						//update the map
						states.put(split[1], total);
						
					}else {
						states.put(split[1], Integer.valueOf(split[2]));
					}
				} 
				
				
				System.out.println(states.get("FL"));
				
				
				
			}
		}catch(FileNotFoundException e) {
			System.out.println(e);
		} 
	}

}
