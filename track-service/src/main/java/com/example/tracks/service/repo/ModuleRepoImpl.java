package com.example.tracks.service.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.tracks.service.model.Module;

@Repository
public class ModuleRepoImpl implements ModuleRepo {
	
	@Autowired
	private MongoTemplate mongo;

	@Override
	public Module create(Module module) {
		return mongo.save(module);
	}

	@Override
	public List<Module> findAll() {
		return mongo.findAll(Module.class);
	}

}
