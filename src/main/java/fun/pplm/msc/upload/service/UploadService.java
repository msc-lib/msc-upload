package fun.pplm.msc.upload.service;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import fun.pplm.msc.framework.vertx.utils.PrintHelper;
import fun.pplm.msc.framework.vertx.utils.ResHelper;
import io.vertx.core.http.HttpServerRequest;

@Path("/upload")
@Produces(MediaType.APPLICATION_JSON)
public class UploadService {
	
	@POST
	@Consumes(MediaType.WILDCARD)
	public Object onPostUpload(@Context HttpServerRequest request) throws IOException {
		PrintHelper.jsonPretty(request.headers());
		return ResHelper.success();
	}
	
}
