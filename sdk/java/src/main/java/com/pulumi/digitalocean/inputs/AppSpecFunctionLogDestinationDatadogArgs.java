// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecFunctionLogDestinationDatadogArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecFunctionLogDestinationDatadogArgs Empty = new AppSpecFunctionLogDestinationDatadogArgs();

    /**
     * Datadog API key.
     * 
     */
    @Import(name="apiKey", required=true)
    private Output<String> apiKey;

    /**
     * @return Datadog API key.
     * 
     */
    public Output<String> apiKey() {
        return this.apiKey;
    }

    /**
     * Datadog HTTP log intake endpoint.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return Datadog HTTP log intake endpoint.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    private AppSpecFunctionLogDestinationDatadogArgs() {}

    private AppSpecFunctionLogDestinationDatadogArgs(AppSpecFunctionLogDestinationDatadogArgs $) {
        this.apiKey = $.apiKey;
        this.endpoint = $.endpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecFunctionLogDestinationDatadogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecFunctionLogDestinationDatadogArgs $;

        public Builder() {
            $ = new AppSpecFunctionLogDestinationDatadogArgs();
        }

        public Builder(AppSpecFunctionLogDestinationDatadogArgs defaults) {
            $ = new AppSpecFunctionLogDestinationDatadogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiKey Datadog API key.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey Datadog API key.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param endpoint Datadog HTTP log intake endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint Datadog HTTP log intake endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public AppSpecFunctionLogDestinationDatadogArgs build() {
            $.apiKey = Objects.requireNonNull($.apiKey, "expected parameter 'apiKey' to be non-null");
            return $;
        }
    }

}
