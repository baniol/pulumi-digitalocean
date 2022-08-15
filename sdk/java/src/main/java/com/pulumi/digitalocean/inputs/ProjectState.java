// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectState extends com.pulumi.resources.ResourceArgs {

    public static final ProjectState Empty = new ProjectState();

    /**
     * the date and time when the project was created, (ISO8601)
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return the date and time when the project was created, (ISO8601)
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * the description of the project
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return the description of the project
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * the environment of the project&#39;s resources. The possible values are: `Development`, `Staging`, `Production`)
     * 
     */
    @Import(name="environment")
    private @Nullable Output<String> environment;

    /**
     * @return the environment of the project&#39;s resources. The possible values are: `Development`, `Staging`, `Production`)
     * 
     */
    public Optional<Output<String>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * a boolean indicating whether or not the project is the default project. (Default: &#34;false&#34;)
     * 
     */
    @Import(name="isDefault")
    private @Nullable Output<Boolean> isDefault;

    /**
     * @return a boolean indicating whether or not the project is the default project. (Default: &#34;false&#34;)
     * 
     */
    public Optional<Output<Boolean>> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }

    /**
     * The name of the Project
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Project
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * the id of the project owner.
     * 
     */
    @Import(name="ownerId")
    private @Nullable Output<Integer> ownerId;

    /**
     * @return the id of the project owner.
     * 
     */
    public Optional<Output<Integer>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    /**
     * the unique universal identifier of the project owner.
     * 
     */
    @Import(name="ownerUuid")
    private @Nullable Output<String> ownerUuid;

    /**
     * @return the unique universal identifier of the project owner.
     * 
     */
    public Optional<Output<String>> ownerUuid() {
        return Optional.ofNullable(this.ownerUuid);
    }

    /**
     * the purpose of the project, (Default: &#34;Web Application&#34;)
     * 
     */
    @Import(name="purpose")
    private @Nullable Output<String> purpose;

    /**
     * @return the purpose of the project, (Default: &#34;Web Application&#34;)
     * 
     */
    public Optional<Output<String>> purpose() {
        return Optional.ofNullable(this.purpose);
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

    /**
     * the date and time when the project was last updated, (ISO8601)
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return the date and time when the project was last updated, (ISO8601)
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    private ProjectState() {}

    private ProjectState(ProjectState $) {
        this.createdAt = $.createdAt;
        this.description = $.description;
        this.environment = $.environment;
        this.isDefault = $.isDefault;
        this.name = $.name;
        this.ownerId = $.ownerId;
        this.ownerUuid = $.ownerUuid;
        this.purpose = $.purpose;
        this.resources = $.resources;
        this.updatedAt = $.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectState $;

        public Builder() {
            $ = new ProjectState();
        }

        public Builder(ProjectState defaults) {
            $ = new ProjectState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt the date and time when the project was created, (ISO8601)
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt the date and time when the project was created, (ISO8601)
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param description the description of the project
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description the description of the project
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param environment the environment of the project&#39;s resources. The possible values are: `Development`, `Staging`, `Production`)
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<String> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment the environment of the project&#39;s resources. The possible values are: `Development`, `Staging`, `Production`)
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param isDefault a boolean indicating whether or not the project is the default project. (Default: &#34;false&#34;)
         * 
         * @return builder
         * 
         */
        public Builder isDefault(@Nullable Output<Boolean> isDefault) {
            $.isDefault = isDefault;
            return this;
        }

        /**
         * @param isDefault a boolean indicating whether or not the project is the default project. (Default: &#34;false&#34;)
         * 
         * @return builder
         * 
         */
        public Builder isDefault(Boolean isDefault) {
            return isDefault(Output.of(isDefault));
        }

        /**
         * @param name The name of the Project
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Project
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ownerId the id of the project owner.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(@Nullable Output<Integer> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        /**
         * @param ownerId the id of the project owner.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(Integer ownerId) {
            return ownerId(Output.of(ownerId));
        }

        /**
         * @param ownerUuid the unique universal identifier of the project owner.
         * 
         * @return builder
         * 
         */
        public Builder ownerUuid(@Nullable Output<String> ownerUuid) {
            $.ownerUuid = ownerUuid;
            return this;
        }

        /**
         * @param ownerUuid the unique universal identifier of the project owner.
         * 
         * @return builder
         * 
         */
        public Builder ownerUuid(String ownerUuid) {
            return ownerUuid(Output.of(ownerUuid));
        }

        /**
         * @param purpose the purpose of the project, (Default: &#34;Web Application&#34;)
         * 
         * @return builder
         * 
         */
        public Builder purpose(@Nullable Output<String> purpose) {
            $.purpose = purpose;
            return this;
        }

        /**
         * @param purpose the purpose of the project, (Default: &#34;Web Application&#34;)
         * 
         * @return builder
         * 
         */
        public Builder purpose(String purpose) {
            return purpose(Output.of(purpose));
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

        /**
         * @param updatedAt the date and time when the project was last updated, (ISO8601)
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt the date and time when the project was last updated, (ISO8601)
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public ProjectState build() {
            return $;
        }
    }

}
