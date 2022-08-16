// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVolumeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumeArgs Empty = new GetVolumeArgs();

    /**
     * Text describing a block storage volume.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Text describing a block storage volume.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of block storage volume.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of block storage volume.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The region the block storage volume is provisioned in.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region the block storage volume is provisioned in.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private GetVolumeArgs() {}

    private GetVolumeArgs(GetVolumeArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumeArgs $;

        public Builder() {
            $ = new GetVolumeArgs();
        }

        public Builder(GetVolumeArgs defaults) {
            $ = new GetVolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Text describing a block storage volume.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Text describing a block storage volume.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of block storage volume.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of block storage volume.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param region The region the block storage volume is provisioned in.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region the block storage volume is provisioned in.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetVolumeArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
