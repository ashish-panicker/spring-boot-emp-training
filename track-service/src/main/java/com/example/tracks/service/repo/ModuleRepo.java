package com.example.tracks.service.repo;

import java.util.List;

import com.example.tracks.service.model.Module;

public interface ModuleRepo {

	Module create(Module module);

	List<Module> findAll();
}
