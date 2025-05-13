package com.shane.nginxtest.graphgw;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class GraphGwApp extends Application<GraphGwConfiguration> {
  public static void main(String[] args) throws Exception {
    new GraphGwApp().run(args);
  }

  @Override
  public void run(GraphGwConfiguration config, Environment env) {
    env.jersey().register(new GraphGwResource());
  }
}