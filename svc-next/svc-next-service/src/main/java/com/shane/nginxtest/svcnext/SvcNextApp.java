package com.shane.nginxtest.svcnext;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class SvcNextApp extends Application<SvcNextConfiguration> {
  public static void main(String[] args) throws Exception {
    new SvcNextApp().run(args);
  }

  @Override
  public void run(SvcNextConfiguration config, Environment env) {
    env.jersey().register(new SvcNextResource());
  }
}
