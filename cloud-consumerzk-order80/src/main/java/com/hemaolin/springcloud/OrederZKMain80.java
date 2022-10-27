package com.hemaolin.springcloud;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shkstart
 * @create 2022-10- 19- 15:36
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrederZKMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrederZKMain80.class,args);
    }
}
