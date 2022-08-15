// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecServiceEnv {
    /**
     * @return The name of the environment variable.
     * 
     */
    private final @Nullable String key;
    /**
     * @return The visibility scope of the environment variable. One of `RUN_TIME`, `BUILD_TIME`, or `RUN_AND_BUILD_TIME` (default).
     * 
     */
    private final @Nullable String scope;
    /**
     * @return The type of the environment variable, `GENERAL` or `SECRET`.
     * 
     */
    private final String type;
    /**
     * @return The threshold for the type of the warning.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private GetAppSpecServiceEnv(
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("scope") @Nullable String scope,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") @Nullable String value) {
        this.key = key;
        this.scope = scope;
        this.type = type;
        this.value = value;
    }

    /**
     * @return The name of the environment variable.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return The visibility scope of the environment variable. One of `RUN_TIME`, `BUILD_TIME`, or `RUN_AND_BUILD_TIME` (default).
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * @return The type of the environment variable, `GENERAL` or `SECRET`.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The threshold for the type of the warning.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecServiceEnv defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private @Nullable String scope;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppSpecServiceEnv defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.scope = defaults.scope;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public GetAppSpecServiceEnv build() {
            return new GetAppSpecServiceEnv(key, scope, type, value);
        }
    }
}
