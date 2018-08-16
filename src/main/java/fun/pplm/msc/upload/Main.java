package fun.pplm.msc.upload;

import fun.pplm.msc.framework.vertx.VerticleRunner;

public class Main {
	
	public static void main(String[] args) {
		VerticleRunner.startup(UploadVerticle.class);
	}
}
