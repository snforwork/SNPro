package co.jp.chapter13;

import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class log {
	 public static void main(String[] args) throws IOException{  
	        Logger log = Logger.getLogger("tesglog");  
	        log.setLevel(Level.ALL);  
	        FileHandler fileHandler = new FileHandler("testlog.log");  
	        fileHandler.setLevel(Level.ALL);  
	        fileHandler.setFormatter(new LogFormatter());  
	        log.addHandler(fileHandler);  
	        log.info("WARNING---This is a java LOG.");     
	    }  
	  
	}  
	  
	class LogFormatter extends Formatter {  
	    @Override  
	    public String format(LogRecord record) {  
	        Date date = new Date();  
	        String sDate = date.toString();  
	        return "[" + sDate + "]" + "[" + record.getLevel() + "]"  
	                + record.getClass() + record.getMessage() + "\n";  
	    }


}
