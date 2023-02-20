package pkg6;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

	public void append() {
		FileWriter a = null;
		try {
			a = new FileWriter("a.txt");
			a.write(65);
			a.write(97);
		}catch(FileNotFoundException e) {//파일이 없을 때 발생하는 예외.
			e.printStackTrace();
		}catch(IOException e) {//입출력이 일어나지 않았을 때 exception?
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 a = new Test1();
		a.append();
	}

}
