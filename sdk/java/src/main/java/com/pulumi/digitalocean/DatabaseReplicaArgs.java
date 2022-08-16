// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.enums.DatabaseSlug;
import com.pulumi.digitalocean.enums.Region;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseReplicaArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseReplicaArgs Empty = new DatabaseReplicaArgs();

    /**
     * The ID of the original source database cluster.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The ID of the original source database cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * The name for the database replica.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for the database replica.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the VPC where the database replica will be located.
     * 
     */
    @Import(name="privateNetworkUuid")
    private @Nullable Output<String> privateNetworkUuid;

    /**
     * @return The ID of the VPC where the database replica will be located.
     * 
     */
    public Optional<Output<String>> privateNetworkUuid() {
        return Optional.ofNullable(this.privateNetworkUuid);
    }

    /**
     * DigitalOcean region where the replica will reside.
     * 
     */
    @Import(name="region")
    private @Nullable Output<Either<String,Region>> region;

    /**
     * @return DigitalOcean region where the replica will reside.
     * 
     */
    public Optional<Output<Either<String,Region>>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Database Droplet size associated with the replica (ex. `db-s-1vcpu-1gb`).
     * 
     */
    @Import(name="size")
    private @Nullable Output<Either<String,DatabaseSlug>> size;

    /**
     * @return Database Droplet size associated with the replica (ex. `db-s-1vcpu-1gb`).
     * 
     */
    public Optional<Output<Either<String,DatabaseSlug>>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * A list of tag names to be applied to the database replica.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of tag names to be applied to the database replica.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DatabaseReplicaArgs() {}

    private DatabaseReplicaArgs(DatabaseReplicaArgs $) {
        this.clusterId = $.clusterId;
        this.name = $.name;
        this.privateNetworkUuid = $.privateNetworkUuid;
        this.region = $.region;
        this.size = $.size;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseReplicaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseReplicaArgs $;

        public Builder() {
            $ = new DatabaseReplicaArgs();
        }

        public Builder(DatabaseReplicaArgs defaults) {
            $ = new DatabaseReplicaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The ID of the original source database cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The ID of the original source database cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param name The name for the database replica.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the database replica.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateNetworkUuid The ID of the VPC where the database replica will be located.
         * 
         * @return builder
         * 
         */
        public Builder privateNetworkUuid(@Nullable Output<String> privateNetworkUuid) {
            $.privateNetworkUuid = privateNetworkUuid;
            return this;
        }

        /**
         * @param privateNetworkUuid The ID of the VPC where the database replica will be located.
         * 
         * @return builder
         * 
         */
        public Builder privateNetworkUuid(String privateNetworkUuid) {
            return privateNetworkUuid(Output.of(privateNetworkUuid));
        }

        /**
         * @param region DigitalOcean region where the replica will reside.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<Either<String,Region>> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region DigitalOcean region where the replica will reside.
         * 
         * @return builder
         * 
         */
        public Builder region(Either<String,Region> region) {
            return region(Output.of(region));
        }

        /**
         * @param region DigitalOcean region where the replica will reside.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Either.ofLeft(region));
        }

        /**
         * @param region DigitalOcean region where the replica will reside.
         * 
         * @return builder
         * 
         */
        public Builder region(Region region) {
            return region(Either.ofRight(region));
        }

        /**
         * @param size Database Droplet size associated with the replica (ex. `db-s-1vcpu-1gb`).
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Either<String,DatabaseSlug>> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size Database Droplet size associated with the replica (ex. `db-s-1vcpu-1gb`).
         * 
         * @return builder
         * 
         */
        public Builder size(Either<String,DatabaseSlug> size) {
            return size(Output.of(size));
        }

        /**
         * @param size Database Droplet size associated with the replica (ex. `db-s-1vcpu-1gb`).
         * 
         * @return builder
         * 
         */
        public Builder size(String size) {
            return size(Either.ofLeft(size));
        }

        /**
         * @param size Database Droplet size associated with the replica (ex. `db-s-1vcpu-1gb`).
         * 
         * @return builder
         * 
         */
        public Builder size(DatabaseSlug size) {
            return size(Either.ofRight(size));
        }

        /**
         * @param tags A list of tag names to be applied to the database replica.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tag names to be applied to the database replica.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tag names to be applied to the database replica.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public DatabaseReplicaArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            return $;
        }
    }

}
