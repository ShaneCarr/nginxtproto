package com.shane.nginxtest.graphgw;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.Map;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class GraphGwResource {

  @GET
  @Path("health")
  public Response health(@Context HttpHeaders headers, @Context UriInfo uriInfo) {
    return Response.ok(Map.of(
            "status", "ok",
            "service", "graph-gw",
            "path", uriInfo.getPath(),
            "headers", headers.getRequestHeaders()
    )).build();
  }
}