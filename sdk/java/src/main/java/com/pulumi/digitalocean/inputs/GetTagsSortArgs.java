// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTagsSortArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetTagsSortArgs Empty = new GetTagsSortArgs();

    /**
     * The sort direction. This may be either `asc` or `desc`.
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return The sort direction. This may be either `asc` or `desc`.
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Sort the tags by this key. This may be one of `name`, `total_resource_count`,  `droplets_count`, `images_count`, `volumes_count`, `volume_snapshots_count`, or `databases_count`.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Sort the tags by this key. This may be one of `name`, `total_resource_count`,  `droplets_count`, `images_count`, `volumes_count`, `volume_snapshots_count`, or `databases_count`.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    private GetTagsSortArgs() {}

    private GetTagsSortArgs(GetTagsSortArgs $) {
        this.direction = $.direction;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagsSortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagsSortArgs $;

        public Builder() {
            $ = new GetTagsSortArgs();
        }

        public Builder(GetTagsSortArgs defaults) {
            $ = new GetTagsSortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction The sort direction. This may be either `asc` or `desc`.
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction The sort direction. This may be either `asc` or `desc`.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param key Sort the tags by this key. This may be one of `name`, `total_resource_count`,  `droplets_count`, `images_count`, `volumes_count`, `volume_snapshots_count`, or `databases_count`.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Sort the tags by this key. This may be one of `name`, `total_resource_count`,  `droplets_count`, `images_count`, `volumes_count`, `volume_snapshots_count`, or `databases_count`.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public GetTagsSortArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
