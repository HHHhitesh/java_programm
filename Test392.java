import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
class ReadAndWrite
{
	void readFile() throws FileNotFoundException

	{
		FileInputStream fis=new FileInputStream("/home/hitesh/Desktop");
	}
	void saveFile() throws FileNotFoundException
	{
		String text="this is done!";
		FileInputStream fas=new FileInputStream("/home/hitesh/Desktop");
	}
}
class Test392
{
	public static void main(String[]args)
	{  
		ReadAndWrite rw=new ReadAndWrite();
		try
		{
			rw.readFile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("hello");
		
	}
}