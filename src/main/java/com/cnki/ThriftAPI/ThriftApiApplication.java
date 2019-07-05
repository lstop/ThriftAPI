package com.cnki.ThriftAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ThriftApiApplication {
    private static RPCThriftServer rpcThriftServer;
	public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ThriftApiApplication.class, args);
        try {
            rpcThriftServer = context.getBean(RPCThriftServer.class);
            rpcThriftServer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
