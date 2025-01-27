// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseCaPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseCaPlainArgs Empty = new GetDatabaseCaPlainArgs();

    /**
     * The ID of the source database cluster.
     * 
     */
    @Import(name="clusterId", required=true)
    private String clusterId;

    /**
     * @return The ID of the source database cluster.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }

    private GetDatabaseCaPlainArgs() {}

    private GetDatabaseCaPlainArgs(GetDatabaseCaPlainArgs $) {
        this.clusterId = $.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseCaPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseCaPlainArgs $;

        public Builder() {
            $ = new GetDatabaseCaPlainArgs();
        }

        public Builder(GetDatabaseCaPlainArgs defaults) {
            $ = new GetDatabaseCaPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The ID of the source database cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public GetDatabaseCaPlainArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            return $;
        }
    }

}
