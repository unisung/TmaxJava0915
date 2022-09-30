package ch12.verify;

public class FileWriterExample2 {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("file.txt");) {
			fw.write("Java");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}