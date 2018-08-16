package fun.pplm.msc.upload.util;

import java.sql.Timestamp;

public final class Constant {
	public static final SystemInfo SYSTEM_INFO = new SystemInfo();
	
	static class SystemInfo {
		public String name = "msc upload";
		public String version = "1.0.0 20180816";
		public String startup = new Timestamp(System.currentTimeMillis()).toString();

		public SystemInfo() {
			super();
		}
	}
	
}
