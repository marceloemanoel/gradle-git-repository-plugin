package com.github.marceloemanoel.gradle.git.artifacts.repositories;

import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.gradle.api.internal.artifacts.repositories.AbstractAuthenticationSupportedRepository

public class GitHubArtifactRepository extends AbstractAuthenticationSupportedRepository implements GitArtifactRepository {

    @Override
    public DependencyResolver createResolver() {
        return null;
    }

}
