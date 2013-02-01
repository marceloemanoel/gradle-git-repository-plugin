package com.github.marceloemanoel.gradle.git

import org.gradle.api.Plugin
import org.gradle.api.Project

import com.github.marceloemanoel.gradle.git.artifacts.repositories.GitHubArtifactRepository

class RepositoryPlugin implements Plugin<Project>{

    @Override
    public void apply(Project project) {
        project.repositories.add(new GitHubArtifactRepository())
    }

}
