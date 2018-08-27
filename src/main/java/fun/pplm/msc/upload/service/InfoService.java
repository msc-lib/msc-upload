package fun.pplm.msc.upload.service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import fun.pplm.msc.framework.vertx.utils.ResHelper;
import fun.pplm.msc.upload.util.Constant;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class InfoService {
	
	@GET
	@Path("/sysinfo")
	public Object doGetSysinfo() {
		return ResHelper.success(Constant.SYSTEM_INFO);
	}
	
}
