import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class searchInFile implements Runnable {

	public static int countOfAllFiles = 0;
	private int singelFilecount;
	private String fileName;
	private String word;
	
	public searchInFile(String fileName,String word) {
		this.fileName = fileName;
		this.word = word;
	}

	@Override
	public void run() {
		File file = new File(fileName);
		try
		{
			Scanner scn = new Scanner(file);
			while(scn.hasNext()) {
				String input = scn.next();
				if (input.compareTo(word) == 0) {
					singelFilecount++;
					CountPP();
				}
			}
			System.out.println("Word '" + word + "' appears in " + fileName + " " + singelFilecount + " times");
			scn.close();
		}
			catch (FileNotFoundException e) {
				System.out.println("File " + fileName + " Not found");
				return;
		}
	}

	

	public int getcountOfAllFiles() {
		return countOfAllFiles;
	}

	public static synchronized void CountPP() {
		searchInFile.countOfAllFiles++;
	}
	
}
