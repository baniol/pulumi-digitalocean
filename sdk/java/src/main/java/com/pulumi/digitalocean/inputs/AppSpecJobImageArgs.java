// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.AppSpecJobImageDeployOnPushArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecJobImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecJobImageArgs Empty = new AppSpecJobImageArgs();

    /**
     * Whether to automatically deploy new commits made to the repo.
     * 
     */
    @Import(name="deployOnPushes")
    private @Nullable Output<List<AppSpecJobImageDeployOnPushArgs>> deployOnPushes;

    /**
     * @return Whether to automatically deploy new commits made to the repo.
     * 
     */
    public Optional<Output<List<AppSpecJobImageDeployOnPushArgs>>> deployOnPushes() {
        return Optional.ofNullable(this.deployOnPushes);
    }

    /**
     * The registry name. Must be left empty for the `DOCR` registry type. Required for the `DOCKER_HUB` registry type.
     * 
     */
    @Import(name="registry")
    private @Nullable Output<String> registry;

    /**
     * @return The registry name. Must be left empty for the `DOCR` registry type. Required for the `DOCKER_HUB` registry type.
     * 
     */
    public Optional<Output<String>> registry() {
        return Optional.ofNullable(this.registry);
    }

    /**
     * The registry type. One of `DOCR` (DigitalOcean container registry) or `DOCKER_HUB`.
     * 
     */
    @Import(name="registryType", required=true)
    private Output<String> registryType;

    /**
     * @return The registry type. One of `DOCR` (DigitalOcean container registry) or `DOCKER_HUB`.
     * 
     */
    public Output<String> registryType() {
        return this.registryType;
    }

    /**
     * The repository name.
     * 
     */
    @Import(name="repository", required=true)
    private Output<String> repository;

    /**
     * @return The repository name.
     * 
     */
    public Output<String> repository() {
        return this.repository;
    }

    /**
     * The repository tag. Defaults to `latest` if not provided.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return The repository tag. Defaults to `latest` if not provided.
     * 
     */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    private AppSpecJobImageArgs() {}

    private AppSpecJobImageArgs(AppSpecJobImageArgs $) {
        this.deployOnPushes = $.deployOnPushes;
        this.registry = $.registry;
        this.registryType = $.registryType;
        this.repository = $.repository;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecJobImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecJobImageArgs $;

        public Builder() {
            $ = new AppSpecJobImageArgs();
        }

        public Builder(AppSpecJobImageArgs defaults) {
            $ = new AppSpecJobImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deployOnPushes Whether to automatically deploy new commits made to the repo.
         * 
         * @return builder
         * 
         */
        public Builder deployOnPushes(@Nullable Output<List<AppSpecJobImageDeployOnPushArgs>> deployOnPushes) {
            $.deployOnPushes = deployOnPushes;
            return this;
        }

        /**
         * @param deployOnPushes Whether to automatically deploy new commits made to the repo.
         * 
         * @return builder
         * 
         */
        public Builder deployOnPushes(List<AppSpecJobImageDeployOnPushArgs> deployOnPushes) {
            return deployOnPushes(Output.of(deployOnPushes));
        }

        /**
         * @param deployOnPushes Whether to automatically deploy new commits made to the repo.
         * 
         * @return builder
         * 
         */
        public Builder deployOnPushes(AppSpecJobImageDeployOnPushArgs... deployOnPushes) {
            return deployOnPushes(List.of(deployOnPushes));
        }

        /**
         * @param registry The registry name. Must be left empty for the `DOCR` registry type. Required for the `DOCKER_HUB` registry type.
         * 
         * @return builder
         * 
         */
        public Builder registry(@Nullable Output<String> registry) {
            $.registry = registry;
            return this;
        }

        /**
         * @param registry The registry name. Must be left empty for the `DOCR` registry type. Required for the `DOCKER_HUB` registry type.
         * 
         * @return builder
         * 
         */
        public Builder registry(String registry) {
            return registry(Output.of(registry));
        }

        /**
         * @param registryType The registry type. One of `DOCR` (DigitalOcean container registry) or `DOCKER_HUB`.
         * 
         * @return builder
         * 
         */
        public Builder registryType(Output<String> registryType) {
            $.registryType = registryType;
            return this;
        }

        /**
         * @param registryType The registry type. One of `DOCR` (DigitalOcean container registry) or `DOCKER_HUB`.
         * 
         * @return builder
         * 
         */
        public Builder registryType(String registryType) {
            return registryType(Output.of(registryType));
        }

        /**
         * @param repository The repository name.
         * 
         * @return builder
         * 
         */
        public Builder repository(Output<String> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository The repository name.
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        /**
         * @param tag The repository tag. Defaults to `latest` if not provided.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag The repository tag. Defaults to `latest` if not provided.
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        public AppSpecJobImageArgs build() {
            $.registryType = Objects.requireNonNull($.registryType, "expected parameter 'registryType' to be non-null");
            $.repository = Objects.requireNonNull($.repository, "expected parameter 'repository' to be non-null");
            return $;
        }
    }

}