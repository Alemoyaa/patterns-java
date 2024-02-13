package com.patterns.spring.realworld.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {

    private static LoadBalancer instance;
    private List<String> servers = new ArrayList<String>();
    private Random random = new Random();

    private static Object syncLock = new Object();

    protected LoadBalancer() {
        servers.add("Server 1");
        servers.add("Server 2");
        servers.add("Server 3");
        servers.add("Server 4");
        servers.add("Server 5");
    }

    public static LoadBalancer getInstance() {
        // Support multithreaded applications through 'Double Checked Locking' pattern
        if (instance == null) {
            synchronized (syncLock) {
                if (instance == null) {
                    instance = new LoadBalancer();
                }
            }
        }
        return instance;
    }

    public String getServer() {
        int i = random.nextInt(servers.size());
        return servers.get(i);
    }

}
