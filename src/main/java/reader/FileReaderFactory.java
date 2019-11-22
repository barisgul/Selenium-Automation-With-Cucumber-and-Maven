package reader;

public class FileReaderFactory {
 
	private static FileReaderFactory fileReaderManager = new FileReaderFactory();
	private static ConfigFileReader configFileReader;
 
	private FileReaderFactory() {
	}
 
	 public static FileReaderFactory getInstance( ) {
	      return fileReaderManager;
	 }
 
	 public ConfigFileReader getConfigReader() {
		 return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	 }
}