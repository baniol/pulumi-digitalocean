// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.AppSpecFunctionLogDestinationDatadog;
import com.pulumi.digitalocean.outputs.AppSpecFunctionLogDestinationLogtail;
import com.pulumi.digitalocean.outputs.AppSpecFunctionLogDestinationPapertrail;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecFunctionLogDestination {
    /**
     * @return Datadog configuration.
     * 
     */
    private final @Nullable AppSpecFunctionLogDestinationDatadog datadog;
    /**
     * @return Logtail configuration.
     * 
     */
    private final @Nullable AppSpecFunctionLogDestinationLogtail logtail;
    /**
     * @return The name of the component.
     * 
     */
    private final String name;
    /**
     * @return Papertrail configuration.
     * 
     */
    private final @Nullable AppSpecFunctionLogDestinationPapertrail papertrail;

    @CustomType.Constructor
    private AppSpecFunctionLogDestination(
        @CustomType.Parameter("datadog") @Nullable AppSpecFunctionLogDestinationDatadog datadog,
        @CustomType.Parameter("logtail") @Nullable AppSpecFunctionLogDestinationLogtail logtail,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("papertrail") @Nullable AppSpecFunctionLogDestinationPapertrail papertrail) {
        this.datadog = datadog;
        this.logtail = logtail;
        this.name = name;
        this.papertrail = papertrail;
    }

    /**
     * @return Datadog configuration.
     * 
     */
    public Optional<AppSpecFunctionLogDestinationDatadog> datadog() {
        return Optional.ofNullable(this.datadog);
    }
    /**
     * @return Logtail configuration.
     * 
     */
    public Optional<AppSpecFunctionLogDestinationLogtail> logtail() {
        return Optional.ofNullable(this.logtail);
    }
    /**
     * @return The name of the component.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Papertrail configuration.
     * 
     */
    public Optional<AppSpecFunctionLogDestinationPapertrail> papertrail() {
        return Optional.ofNullable(this.papertrail);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecFunctionLogDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AppSpecFunctionLogDestinationDatadog datadog;
        private @Nullable AppSpecFunctionLogDestinationLogtail logtail;
        private String name;
        private @Nullable AppSpecFunctionLogDestinationPapertrail papertrail;

        public Builder() {
    	      // Empty
        }

        public Builder(AppSpecFunctionLogDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datadog = defaults.datadog;
    	      this.logtail = defaults.logtail;
    	      this.name = defaults.name;
    	      this.papertrail = defaults.papertrail;
        }

        public Builder datadog(@Nullable AppSpecFunctionLogDestinationDatadog datadog) {
            this.datadog = datadog;
            return this;
        }
        public Builder logtail(@Nullable AppSpecFunctionLogDestinationLogtail logtail) {
            this.logtail = logtail;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder papertrail(@Nullable AppSpecFunctionLogDestinationPapertrail papertrail) {
            this.papertrail = papertrail;
            return this;
        }        public AppSpecFunctionLogDestination build() {
            return new AppSpecFunctionLogDestination(datadog, logtail, name, papertrail);
        }
    }
}
