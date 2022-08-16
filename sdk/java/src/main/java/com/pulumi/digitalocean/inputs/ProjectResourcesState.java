// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectResourcesState extends com.pulumi.resources.ResourceArgs {

    public static final ProjectResourcesState Empty = new ProjectResourcesState();

    /**
     * the ID of the project
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return the ID of the project
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * a list of uniform resource names (URNs) for the resources associated with the project
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<String>> resources;

    /**
     * @return a list of uniform resource names (URNs) for the resources associated with the project
     * 
     */
    public Optional<Output<List<String>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    private ProjectResourcesState() {}

    private ProjectResourcesState(ProjectResourcesState $) {
        this.project = $.project;
        this.resources = $.resources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectResourcesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectResourcesState $;

        public Builder() {
            $ = new ProjectResourcesState();
        }

        public Builder(ProjectResourcesState defaults) {
            $ = new ProjectResourcesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param project the ID of the project
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project the ID of the project
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param resources a list of uniform resource names (URNs) for the resources associated with the project
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources a list of uniform resource names (URNs) for the resources associated with the project
         * 
         * @return builder
         * 
         */
        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources a list of uniform resource names (URNs) for the resources associated with the project
         * 
         * @return builder
         * 
         */
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        public ProjectResourcesState build() {
            return $;
        }
    }

}
