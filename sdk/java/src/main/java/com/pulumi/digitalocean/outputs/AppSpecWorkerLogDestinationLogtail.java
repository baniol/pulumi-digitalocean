// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AppSpecWorkerLogDestinationLogtail {
    /**
     * @return Logtail token.
     * 
     */
    private final String token;

    @CustomType.Constructor
    private AppSpecWorkerLogDestinationLogtail(@CustomType.Parameter("token") String token) {
        this.token = token;
    }

    /**
     * @return Logtail token.
     * 
     */
    public String token() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecWorkerLogDestinationLogtail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String token;

        public Builder() {
    	      // Empty
        }

        public Builder(AppSpecWorkerLogDestinationLogtail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.token = defaults.token;
        }

        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }        public AppSpecWorkerLogDestinationLogtail build() {
            return new AppSpecWorkerLogDestinationLogtail(token);
        }
    }
}
