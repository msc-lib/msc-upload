package fun.pplm.msc.upload;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jboss.resteasy.plugins.server.vertx.VertxRegistry;
import org.jboss.resteasy.plugins.server.vertx.VertxResteasyDeployment;

import fun.pplm.msc.framework.vertx.ResteasyVerticle;
import fun.pplm.msc.framework.vertx.provider.ExceptionProvider;
import fun.pplm.msc.upload.service.UploadService;
import fun.pplm.msc.upload.service.InfoService;

public class UploadVerticle extends ResteasyVerticle {

	@Override
	protected void deploy(VertxResteasyDeployment deployment) {
		deployment.setActualProviderClasses(Stream.of(ExceptionProvider.class).collect(Collectors.toList()));
	}

	@Override
	protected void register(VertxRegistry registry) {
		registry.addPerInstanceResource(InfoService.class);
		registry.addPerInstanceResource(UploadService.class);
	}

}
