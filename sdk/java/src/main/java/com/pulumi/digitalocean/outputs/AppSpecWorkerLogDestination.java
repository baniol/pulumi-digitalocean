// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.AppSpecWorkerLogDestinationDatadog;
import com.pulumi.digitalocean.outputs.AppSpecWorkerLogDestinationLogtail;
import com.pulumi.digitalocean.outputs.AppSpecWorkerLogDestinationPapertrail;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecWorkerLogDestination {
    /**
     * @return Datadog configuration.
     * 
     */
    private @Nullable AppSpecWorkerLogDestinationDatadog datadog;
    /**
     * @return Logtail configuration.
     * 
     */
    private @Nullable AppSpecWorkerLogDestinationLogtail logtail;
    /**
     * @return The name of the component.
     * 
     */
    private String name;
    /**
     * @return Papertrail configuration.
     * 
     */
    private @Nullable AppSpecWorkerLogDestinationPapertrail papertrail;

    private AppSpecWorkerLogDestination() {}
    /**
     * @return Datadog configuration.
     * 
     */
    public Optional<AppSpecWorkerLogDestinationDatadog> datadog() {
        return Optional.ofNullable(this.datadog);
    }
    /**
     * @return Logtail configuration.
     * 
     */
    public Optional<AppSpecWorkerLogDestinationLogtail> logtail() {
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
    public Optional<AppSpecWorkerLogDestinationPapertrail> papertrail() {
        return Optional.ofNullable(this.papertrail);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecWorkerLogDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AppSpecWorkerLogDestinationDatadog datadog;
        private @Nullable AppSpecWorkerLogDestinationLogtail logtail;
        private String name;
        private @Nullable AppSpecWorkerLogDestinationPapertrail papertrail;
        public Builder() {}
        public Builder(AppSpecWorkerLogDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datadog = defaults.datadog;
    	      this.logtail = defaults.logtail;
    	      this.name = defaults.name;
    	      this.papertrail = defaults.papertrail;
        }

        @CustomType.Setter
        public Builder datadog(@Nullable AppSpecWorkerLogDestinationDatadog datadog) {
            this.datadog = datadog;
            return this;
        }
        @CustomType.Setter
        public Builder logtail(@Nullable AppSpecWorkerLogDestinationLogtail logtail) {
            this.logtail = logtail;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder papertrail(@Nullable AppSpecWorkerLogDestinationPapertrail papertrail) {
            this.papertrail = papertrail;
            return this;
        }
        public AppSpecWorkerLogDestination build() {
            final var o = new AppSpecWorkerLogDestination();
            o.datadog = datadog;
            o.logtail = logtail;
            o.name = name;
            o.papertrail = papertrail;
            return o;
        }
    }
}