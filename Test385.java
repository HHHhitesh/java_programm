import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class Test385
{
	public static void main(String[]args) throws IOException
	{
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream("d:/abc.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		finally
		{
			//cleanin here
			if(fis!=null)
			{
				fis.close();
			}
			System.out.println("file closed");
		}
	}
}