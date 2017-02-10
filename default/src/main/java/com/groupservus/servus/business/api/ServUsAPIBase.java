package com.groupservus.servus.business.api;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiNamespace;

@Api(name = "servUsApi", version = "v1", namespace = @ApiNamespace(
        ownerDomain = "groupservus.servus.com", ownerName = "groupservus.servus.com"))
public class ServUsAPIBase {

}
