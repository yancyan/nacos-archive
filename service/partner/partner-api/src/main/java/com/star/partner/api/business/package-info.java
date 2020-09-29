package com.star.partner.api.business;

class Info{
    public final static String domain = "partner-service";
    public final static String URL = "${star.url}:" + "${star.port." + domain + "}";
    public static final String JAXRS_PATH = domain;
    public static final String WEB_PATH = "";

}