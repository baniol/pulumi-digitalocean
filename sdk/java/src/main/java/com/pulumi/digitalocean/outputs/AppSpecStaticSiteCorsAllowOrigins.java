// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecStaticSiteCorsAllowOrigins {
    /**
     * @return The `Access-Control-Allow-Origin` header will be set to the client&#39;s origin only if the client&#39;s origin exactly matches the value you provide.
     * 
     */
    private final @Nullable String exact;
    /**
     * @return The `Access-Control-Allow-Origin` header will be set to the client&#39;s origin if the beginning of the client&#39;s origin matches the value you provide.
     * 
     */
    private final @Nullable String prefix;
    /**
     * @return The `Access-Control-Allow-Origin` header will be set to the client&#39;s origin if the client’s origin matches the regex you provide, in [RE2 style syntax](https://github.com/google/re2/wiki/Syntax).
     * 
     */
    private final @Nullable String regex;

    @CustomType.Constructor
    private AppSpecStaticSiteCorsAllowOrigins(
        @CustomType.Parameter("exact") @Nullable String exact,
        @CustomType.Parameter("prefix") @Nullable String prefix,
        @CustomType.Parameter("regex") @Nullable String regex) {
        this.exact = exact;
        this.prefix = prefix;
        this.regex = regex;
    }

    /**
     * @return The `Access-Control-Allow-Origin` header will be set to the client&#39;s origin only if the client&#39;s origin exactly matches the value you provide.
     * 
     */
    public Optional<String> exact() {
        return Optional.ofNullable(this.exact);
    }
    /**
     * @return The `Access-Control-Allow-Origin` header will be set to the client&#39;s origin if the beginning of the client&#39;s origin matches the value you provide.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return The `Access-Control-Allow-Origin` header will be set to the client&#39;s origin if the client’s origin matches the regex you provide, in [RE2 style syntax](https://github.com/google/re2/wiki/Syntax).
     * 
     */
    public Optional<String> regex() {
        return Optional.ofNullable(this.regex);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecStaticSiteCorsAllowOrigins defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String exact;
        private @Nullable String prefix;
        private @Nullable String regex;

        public Builder() {
    	      // Empty
        }

        public Builder(AppSpecStaticSiteCorsAllowOrigins defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exact = defaults.exact;
    	      this.prefix = defaults.prefix;
    	      this.regex = defaults.regex;
        }

        public Builder exact(@Nullable String exact) {
            this.exact = exact;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder regex(@Nullable String regex) {
            this.regex = regex;
            return this;
        }        public AppSpecStaticSiteCorsAllowOrigins build() {
            return new AppSpecStaticSiteCorsAllowOrigins(exact, prefix, regex);
        }
    }
}
