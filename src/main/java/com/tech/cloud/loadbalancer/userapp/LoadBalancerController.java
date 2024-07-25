package com.tech.cloud.loadbalancer.userapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoadBalancerController {

	private LoadBalancer loadBalancer;

	@Autowired
	public LoadBalancerController(LoadBalancer loadBalancer) {
		this.loadBalancer = loadBalancer;
	}

	@GetMapping("/server")
	public String getServer() {
		return loadBalancer.chooseServer();
	}
}
