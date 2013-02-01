package com.github.marceloemanoel.gradle.git.artifacts.repositories;

import org.gradle.api.artifacts.repositories.ArtifactRepository
import org.gradle.api.artifacts.repositories.AuthenticationSupported

public interface GitArtifactRepository extends ArtifactRepository, AuthenticationSupported {}