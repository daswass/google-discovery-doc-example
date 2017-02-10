package com.groupservus.servus.business.api;

import com.google.api.server.spi.config.ApiMethod;

import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

public class AdminAPI extends ServUsAPIBase {
    @ApiMethod(name = "admin.manualChargeUserCustomAmount", httpMethod = "GET")
    public void manualChargeUserCustomAmount(HttpServletRequest req, @Named("userId") long userId,
                                             @Named("price") double price) {
    }
}
