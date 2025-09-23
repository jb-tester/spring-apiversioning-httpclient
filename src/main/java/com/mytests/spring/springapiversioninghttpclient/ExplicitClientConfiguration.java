package com.mytests.spring.springapiversioninghttpclient;

import org.springframework.web.client.ApiVersionInserter;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

// explicit configuration of baseUri and apiVersionInserter:
//@Configuration
public class ExplicitClientConfiguration {

    //@Bean
    public SomeClient someClient() {
        RestClient restClient = RestClient.builder()
                .baseUrl("http://localhost:8080")
                .apiVersionInserter(ApiVersionInserter.useQueryParam("version_query_param"))
                //.apiVersionInserter(ApiVersionInserter.useHeader("API-Version"))
                .build();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient)).build();
        return factory.createClient(SomeClient.class);
    }
}
