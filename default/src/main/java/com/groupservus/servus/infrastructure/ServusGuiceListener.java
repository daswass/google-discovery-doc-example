package com.groupservus.servus.infrastructure;

import com.google.api.server.spi.guice.EndpointsModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

import com.groupservus.servus.business.api.AdminAPI;

import java.util.HashSet;
import java.util.Set;

public class ServusGuiceListener extends GuiceServletContextListener {
    static class ServletModule extends EndpointsModule {
        @Override
        protected void configureServlets() {
            super.configureServlets();
            Set<Class<?>> serviceClasses = new HashSet<>();
            serviceClasses.add(AdminAPI.class);
        }
    }

    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new ServletModule());
    }
}
