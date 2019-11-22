package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class StringUtil {	
	
	public String getFileName()
	{
		return createFileName();
	}
	
	//generates random string
	public String getRandomString(int length) {
		 Random rand=new Random();
		   String possibleLetters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ.";   
		   StringBuilder sb = new StringBuilder(length);
		   for(int i = 0; i < length; i++) 
		      sb.append(possibleLetters.charAt(rand.nextInt(possibleLetters.length())));
		   return sb.toString();
	}
	
	//generates new file with given timestamp
	private String createFileName() {
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		return timeStamp+"_results.txt";
	}

}
