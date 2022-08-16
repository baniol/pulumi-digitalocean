// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAppPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppPlainArgs Empty = new GetAppPlainArgs();

    /**
     * The ID of the app to retrieve information about.
     * 
     */
    @Import(name="appId", required=true)
    private String appId;

    /**
     * @return The ID of the app to retrieve information about.
     * 
     */
    public String appId() {
        return this.appId;
    }

    private GetAppPlainArgs() {}

    private GetAppPlainArgs(GetAppPlainArgs $) {
        this.appId = $.appId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppPlainArgs $;

        public Builder() {
            $ = new GetAppPlainArgs();
        }

        public Builder(GetAppPlainArgs defaults) {
            $ = new GetAppPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The ID of the app to retrieve information about.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            $.appId = appId;
            return this;
        }

        public GetAppPlainArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            return $;
        }
    }

}
