package com.example.demo.discovery.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class DiscoveryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryClientApplication.class, args);
	}

}

@RestController
class InstanceController{
	
	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping("/services/{name}")
	public List<ServiceInstance> getServiceByName(@PathVariable String name){
		return this.client.getInstances(name);
	}
	
	@RequestMapping("/services/")
	public List<String> getServices(){
		return this.client.getServices();
	}
}
