import java.io.IOException;
import java.util.*;
import java.util.logging.*;

public class LoggingTest {

	private static Logger log= Logger.getLogger("com.NomeProgetto");
	private static FileHandler fh;;
	public static void main(String[] args) throws SecurityException, IOException {
		// TODO Auto-generated method stub

		 fh= new FileHandler("myLog.txt");
		 log.addHandler(fh);
		 
		 log.setLevel(Level.ALL);
		 
		 log.info("First log file!");
		 
	}

}
