package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class KahawaLoveProjectDependency extends DelegatingProjectDependency {

    @Inject
    public KahawaLoveProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":app"
     */
    public AppProjectDependency getApp() { return new AppProjectDependency(getFactory(), create(":app")); }

    /**
     * Creates a project dependency on the project at path ":mkahawa"
     */
    public MkahawaProjectDependency getMkahawa() { return new MkahawaProjectDependency(getFactory(), create(":mkahawa")); }

    /**
     * Creates a project dependency on the project at path ":mkahawademo"
     */
    public MkahawademoProjectDependency getMkahawademo() { return new MkahawademoProjectDependency(getFactory(), create(":mkahawademo")); }

}
