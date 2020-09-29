package com.star.customer.api.business;

class Info{
    public final static String domain = "customer-service";
    public final static String URL = "${star.url}:" + "${star.port." + domain + "}";
    public static final String JAXRS_PATH = domain;
    public static final String WEB_PATH = "";


}