package fun.pplm.msc.upload;

import java.util.List;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataReader;
import org.jboss.resteasy.plugins.server.vertx.VertxRegistry;

import fun.pplm.msc.framework.vertx.ResteasyVerticle;
import fun.pplm.msc.framework.vertx.provider.ExceptionProvider;
import fun.pplm.msc.upload.service.UploadService;
import fun.pplm.msc.upload.service.InfoService;

public class UploadVerticle extends ResteasyVerticle {

	@Override
	protected void registerProviders(List<Class<?>> classes) {
		classes.add(ExceptionProvider.class);
		classes.add(MultipartFormDataReader.class);
	}

	@Override
	protected void registerService(VertxRegistry registry) {
		registry.addPerInstanceResource(InfoService.class);
		registry.addPerInstanceResource(UploadService.class);
	}

}
