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
public final class AppSpecStaticSiteRoute {
    /**
     * @return Paths must start with `/` and must be unique within the app.
     * 
     */
    private @Nullable String path;
    /**
     * @return An optional flag to preserve the path that is forwarded to the backend service.
     * 
     */
    private @Nullable Boolean preservePathPrefix;

    private AppSpecStaticSiteRoute() {}
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

    public static Builder builder(AppSpecStaticSiteRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String path;
        private @Nullable Boolean preservePathPrefix;
        public Builder() {}
        public Builder(AppSpecStaticSiteRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.preservePathPrefix = defaults.preservePathPrefix;
        }

        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder preservePathPrefix(@Nullable Boolean preservePathPrefix) {
            this.preservePathPrefix = preservePathPrefix;
            return this;
        }
        public AppSpecStaticSiteRoute build() {
            final var o = new AppSpecStaticSiteRoute();
            o.path = path;
            o.preservePathPrefix = preservePathPrefix;
            return o;
        }
    }
}
