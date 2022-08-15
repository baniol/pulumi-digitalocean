// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecServiceHealthCheck {
    /**
     * @return The number of failed health checks before considered unhealthy.
     * 
     */
    private final @Nullable Integer failureThreshold;
    /**
     * @return The route path used for the HTTP health check ping.
     * 
     */
    private final @Nullable String httpPath;
    /**
     * @return The number of seconds to wait before beginning health checks.
     * 
     */
    private final @Nullable Integer initialDelaySeconds;
    /**
     * @return The number of seconds to wait between health checks.
     * 
     */
    private final @Nullable Integer periodSeconds;
    /**
     * @return The number of successful health checks before considered healthy.
     * 
     */
    private final @Nullable Integer successThreshold;
    /**
     * @return The number of seconds after which the check times out.
     * 
     */
    private final @Nullable Integer timeoutSeconds;

    @CustomType.Constructor
    private AppSpecServiceHealthCheck(
        @CustomType.Parameter("failureThreshold") @Nullable Integer failureThreshold,
        @CustomType.Parameter("httpPath") @Nullable String httpPath,
        @CustomType.Parameter("initialDelaySeconds") @Nullable Integer initialDelaySeconds,
        @CustomType.Parameter("periodSeconds") @Nullable Integer periodSeconds,
        @CustomType.Parameter("successThreshold") @Nullable Integer successThreshold,
        @CustomType.Parameter("timeoutSeconds") @Nullable Integer timeoutSeconds) {
        this.failureThreshold = failureThreshold;
        this.httpPath = httpPath;
        this.initialDelaySeconds = initialDelaySeconds;
        this.periodSeconds = periodSeconds;
        this.successThreshold = successThreshold;
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * @return The number of failed health checks before considered unhealthy.
     * 
     */
    public Optional<Integer> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    /**
     * @return The route path used for the HTTP health check ping.
     * 
     */
    public Optional<String> httpPath() {
        return Optional.ofNullable(this.httpPath);
    }
    /**
     * @return The number of seconds to wait before beginning health checks.
     * 
     */
    public Optional<Integer> initialDelaySeconds() {
        return Optional.ofNullable(this.initialDelaySeconds);
    }
    /**
     * @return The number of seconds to wait between health checks.
     * 
     */
    public Optional<Integer> periodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }
    /**
     * @return The number of successful health checks before considered healthy.
     * 
     */
    public Optional<Integer> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }
    /**
     * @return The number of seconds after which the check times out.
     * 
     */
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecServiceHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer failureThreshold;
        private @Nullable String httpPath;
        private @Nullable Integer initialDelaySeconds;
        private @Nullable Integer periodSeconds;
        private @Nullable Integer successThreshold;
        private @Nullable Integer timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(AppSpecServiceHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.httpPath = defaults.httpPath;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Builder httpPath(@Nullable String httpPath) {
            this.httpPath = httpPath;
            return this;
        }
        public Builder initialDelaySeconds(@Nullable Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Builder periodSeconds(@Nullable Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Builder successThreshold(@Nullable Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }        public AppSpecServiceHealthCheck build() {
            return new AppSpecServiceHealthCheck(failureThreshold, httpPath, initialDelaySeconds, periodSeconds, successThreshold, timeoutSeconds);
        }
    }
}
