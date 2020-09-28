package com.star.partner.api.business;

class Info{
    public final static String domain = "partner-service";
    public final static String url = "${star.url}:" + "${star.port." + domain + "}";

}