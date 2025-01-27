// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDropletSnapshotPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDropletSnapshotPlainArgs Empty = new GetDropletSnapshotPlainArgs();

    /**
     * If more than one result is returned, use the most recent Droplet snapshot.
     * 
     */
    @Import(name="mostRecent")
    private @Nullable Boolean mostRecent;

    /**
     * @return If more than one result is returned, use the most recent Droplet snapshot.
     * 
     */
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }

    /**
     * The name of the Droplet snapshot.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the Droplet snapshot.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A regex string to apply to the Droplet snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to apply to the Droplet snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * A &#34;slug&#34; representing a DigitalOcean region (e.g. `nyc1`). If set, only Droplet snapshots available in the region will be returned.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return A &#34;slug&#34; representing a DigitalOcean region (e.g. `nyc1`). If set, only Droplet snapshots available in the region will be returned.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetDropletSnapshotPlainArgs() {}

    private GetDropletSnapshotPlainArgs(GetDropletSnapshotPlainArgs $) {
        this.mostRecent = $.mostRecent;
        this.name = $.name;
        this.nameRegex = $.nameRegex;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDropletSnapshotPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDropletSnapshotPlainArgs $;

        public Builder() {
            $ = new GetDropletSnapshotPlainArgs();
        }

        public Builder(GetDropletSnapshotPlainArgs defaults) {
            $ = new GetDropletSnapshotPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mostRecent If more than one result is returned, use the most recent Droplet snapshot.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            $.mostRecent = mostRecent;
            return this;
        }

        /**
         * @param name The name of the Droplet snapshot.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param nameRegex A regex string to apply to the Droplet snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param region A &#34;slug&#34; representing a DigitalOcean region (e.g. `nyc1`). If set, only Droplet snapshots available in the region will be returned.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetDropletSnapshotPlainArgs build() {
            return $;
        }
    }

}
