package com.tech.cloud.loadbalancer.userapp;

import java.util.List;
import java.util.Random;


public class RandomLoadBalancer implements LoadBalancer{

    private final List<String> servers;
    private final Random random;

    public RandomLoadBalancer(List<String> servers) {
        this.servers = servers;
        this.random = new Random();
    }

    @Override
    public String chooseServer() {
        int index = random.nextInt(servers.size());
        return servers.get(index);
    }
}
