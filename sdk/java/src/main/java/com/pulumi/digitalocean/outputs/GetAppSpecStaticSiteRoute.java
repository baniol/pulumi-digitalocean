// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecStaticSiteRoute {
    /**
     * @return Paths must start with `/` and must be unique within the app.
     * 
     */
    private final @Nullable String path;
    /**
     * @return An optional flag to preserve the path that is forwarded to the backend service.
     * 
     */
    private final @Nullable Boolean preservePathPrefix;

    @CustomType.Constructor
    private GetAppSpecStaticSiteRoute(
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("preservePathPrefix") @Nullable Boolean preservePathPrefix) {
        this.path = path;
        this.preservePathPrefix = preservePathPrefix;
    }

    /**
     * @return Paths must start with `/` and must be unique within the app.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return An optional flag to preserve the path that is forwarded to the backend service.
     * 
     */
    public Optional<Boolean> preservePathPrefix() {
        return Optional.ofNullable(this.preservePathPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecStaticSiteRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String path;
        private @Nullable Boolean preservePathPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppSpecStaticSiteRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.preservePathPrefix = defaults.preservePathPrefix;
        }

        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder preservePathPrefix(@Nullable Boolean preservePathPrefix) {
            this.preservePathPrefix = preservePathPrefix;
            return this;
        }        public GetAppSpecStaticSiteRoute build() {
            return new GetAppSpecStaticSiteRoute(path, preservePathPrefix);
        }
    }
}
