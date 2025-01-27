// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVolumeSnapshotArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumeSnapshotArgs Empty = new GetVolumeSnapshotArgs();

    /**
     * If more than one result is returned, use the most recent volume snapshot.
     * 
     */
    @Import(name="mostRecent")
    private @Nullable Output<Boolean> mostRecent;

    /**
     * @return If more than one result is returned, use the most recent volume snapshot.
     * 
     */
    public Optional<Output<Boolean>> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }

    /**
     * The name of the volume snapshot.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the volume snapshot.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A regex string to apply to the volume snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to apply to the volume snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * A &#34;slug&#34; representing a DigitalOcean region (e.g. `nyc1`). If set, only volume snapshots available in the region will be returned.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return A &#34;slug&#34; representing a DigitalOcean region (e.g. `nyc1`). If set, only volume snapshots available in the region will be returned.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private GetVolumeSnapshotArgs() {}

    private GetVolumeSnapshotArgs(GetVolumeSnapshotArgs $) {
        this.mostRecent = $.mostRecent;
        this.name = $.name;
        this.nameRegex = $.nameRegex;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumeSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumeSnapshotArgs $;

        public Builder() {
            $ = new GetVolumeSnapshotArgs();
        }

        public Builder(GetVolumeSnapshotArgs defaults) {
            $ = new GetVolumeSnapshotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mostRecent If more than one result is returned, use the most recent volume snapshot.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(@Nullable Output<Boolean> mostRecent) {
            $.mostRecent = mostRecent;
            return this;
        }

        /**
         * @param mostRecent If more than one result is returned, use the most recent volume snapshot.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(Boolean mostRecent) {
            return mostRecent(Output.of(mostRecent));
        }

        /**
         * @param name The name of the volume snapshot.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the volume snapshot.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nameRegex A regex string to apply to the volume snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to apply to the volume snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        /**
         * @param region A &#34;slug&#34; representing a DigitalOcean region (e.g. `nyc1`). If set, only volume snapshots available in the region will be returned.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region A &#34;slug&#34; representing a DigitalOcean region (e.g. `nyc1`). If set, only volume snapshots available in the region will be returned.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetVolumeSnapshotArgs build() {
            return $;
        }
    }

}
