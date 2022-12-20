package com.ead.course.repositories;

import com.ead.course.models.ModuleModels;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ModuleRepository extends JpaRepository<ModuleModels, UUID> {
}
