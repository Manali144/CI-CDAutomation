package app.constants;

import java.time.Duration;


	public abstract class ApplicationConstants {

		public static String URL = "https://1moveuat.1pay.in/intro-slider";
		//public static String URL = "https://one-pay8564.beta.drapcode.io/login" ;
	//	public static String ADMINURL = "https://stg4admin.1veda.in/site/login";
		public static String browser = "chrome";
		public static String environment = "Automation QA";
		public static final Duration EXP_WAIT = Duration.ofSeconds(30);
		//public static final Duration Page_load_timeout=Duration.ofMillis(2000);
		public static final Duration Page_load_timeout=Duration.ofSeconds(30);

		public static final long IMP_WAIT=10;
	
		
	}

