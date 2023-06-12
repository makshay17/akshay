package June8th;
import java.io.*;
import java.util.*;
public class ReadCsv {
	

	public static void main(String[] args) {
		String csvFile = "C:\\Users\\aksha\\OneDrive\\Desktop\\Java\\akshay\\src\\June8th\\Data.csv";
	    String line = "";
	    String cvsSplitBy = ",";
	    List<List<String>> red = new ArrayList<>();
	    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
	        while ((line = br.readLine()) != null) {
	            red.add(Arrays.asList(line.split(cvsSplitBy)));
	        }
	        red.sort(new Comparator<List<String>>() {
	            
	            public int compare(List<String> o1, List<String> o2) {
	                return o1.get(1).compareTo(o2.get(1));
	            }
	        });
	        System.out.println(red);

	    } catch (IOException xyz) {
	        xyz.printStackTrace();
	    }

	
	}
}
