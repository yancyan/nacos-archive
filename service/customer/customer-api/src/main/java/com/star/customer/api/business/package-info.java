package com.star.customer.api.business;

class Info{
    public final static String domain = "customer-service";
    public final static String url = "${star.url}:" + "${star.port." + domain + "}";

}