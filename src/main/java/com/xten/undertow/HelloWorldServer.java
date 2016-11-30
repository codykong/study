package com.xten.undertow;

import io.undertow.Undertow;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 2016/11/30
 * Time: 下午5:16
 */
public class HelloWorldServer {

    public static void main(final String[] args) {
        Undertow server = Undertow.builder()
                .addListener(8080, "localhost")
                .setHandler(new HttpHandler() {
                    @Override
                    public void handleRequest(final HttpServerExchange exchange) throws Exception {
                        exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/plain");
                        exchange.getResponseSender().send("Hello World");
                    }
                }).build();
        server.start();
    }
}
