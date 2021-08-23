package section7_DesignPatterns.section68_composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Data{
	public void doubleClick();
}

class File implements Data{
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void doubleClick() {
		System.out.println(this.name + " is opened!");
	}
	
}

class Folder implements Data{

	private String name;
	List<Data> files = new ArrayList<Data>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void doubleClick() {
		System.out.println(this.name + " folder is opened.");
		for (Iterator iterator = files.iterator(); iterator.hasNext();) {
			Data data = (Data) iterator.next();
			data.doubleClick();
		}
	}
	
	public void add(Data data) {
		this.files.add(data);
	}
	
	public void remove(Data data) {
		this.files.remove(data);
	}
	
}

public class CompositeDesignPatternApplication {

	public static void main(String[] args) {
		
		Folder folder1 = new Folder();
		folder1.setName("Folder 1");
		Folder folder2 = new Folder();
		folder2.setName("Folder 2");
	
		File file1 = new File();
		file1.setName("File 1");
		File file2 = new File();
		file2.setName("File 2");
		
		File file3 = new File();
		file3.setName("File 3");
		File file4 = new File();
		file4.setName("File 4");
		
		folder1.add(file1);
		folder2.add(file2);
		folder1.add(file3);
		folder1.add(file4);
		
		folder1.doubleClick();
		folder2.doubleClick();
		
		
		
	}

}
