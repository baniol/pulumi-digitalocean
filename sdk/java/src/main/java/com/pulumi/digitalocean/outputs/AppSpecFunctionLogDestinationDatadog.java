// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecFunctionLogDestinationDatadog {
    /**
     * @return Datadog API key.
     * 
     */
    private final String apiKey;
    /**
     * @return Datadog HTTP log intake endpoint.
     * 
     */
    private final @Nullable String endpoint;

    @CustomType.Constructor
    private AppSpecFunctionLogDestinationDatadog(
        @CustomType.Parameter("apiKey") String apiKey,
        @CustomType.Parameter("endpoint") @Nullable String endpoint) {
        this.apiKey = apiKey;
        this.endpoint = endpoint;
    }

    /**
     * @return Datadog API key.
     * 
     */
    public String apiKey() {
        return this.apiKey;
    }
    /**
     * @return Datadog HTTP log intake endpoint.
     * 
     */
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecFunctionLogDestinationDatadog defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiKey;
        private @Nullable String endpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(AppSpecFunctionLogDestinationDatadog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.endpoint = defaults.endpoint;
        }

        public Builder apiKey(String apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }        public AppSpecFunctionLogDestinationDatadog build() {
            return new AppSpecFunctionLogDestinationDatadog(apiKey, endpoint);
        }
    }
}
