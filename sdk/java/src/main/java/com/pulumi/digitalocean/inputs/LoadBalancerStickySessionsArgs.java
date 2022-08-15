// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerStickySessionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerStickySessionsArgs Empty = new LoadBalancerStickySessionsArgs();

    /**
     * The name to be used for the cookie sent to the client. This attribute is required when using `cookies` for the sticky sessions type.
     * 
     */
    @Import(name="cookieName")
    private @Nullable Output<String> cookieName;

    /**
     * @return The name to be used for the cookie sent to the client. This attribute is required when using `cookies` for the sticky sessions type.
     * 
     */
    public Optional<Output<String>> cookieName() {
        return Optional.ofNullable(this.cookieName);
    }

    /**
     * The number of seconds until the cookie set by the Load Balancer expires. This attribute is required when using `cookies` for the sticky sessions type.
     * 
     */
    @Import(name="cookieTtlSeconds")
    private @Nullable Output<Integer> cookieTtlSeconds;

    /**
     * @return The number of seconds until the cookie set by the Load Balancer expires. This attribute is required when using `cookies` for the sticky sessions type.
     * 
     */
    public Optional<Output<Integer>> cookieTtlSeconds() {
        return Optional.ofNullable(this.cookieTtlSeconds);
    }

    /**
     * An attribute indicating how and if requests from a client will be persistently served by the same backend Droplet. The possible values are `cookies` or `none`. If not specified, the default value is `none`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return An attribute indicating how and if requests from a client will be persistently served by the same backend Droplet. The possible values are `cookies` or `none`. If not specified, the default value is `none`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private LoadBalancerStickySessionsArgs() {}

    private LoadBalancerStickySessionsArgs(LoadBalancerStickySessionsArgs $) {
        this.cookieName = $.cookieName;
        this.cookieTtlSeconds = $.cookieTtlSeconds;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerStickySessionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerStickySessionsArgs $;

        public Builder() {
            $ = new LoadBalancerStickySessionsArgs();
        }

        public Builder(LoadBalancerStickySessionsArgs defaults) {
            $ = new LoadBalancerStickySessionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cookieName The name to be used for the cookie sent to the client. This attribute is required when using `cookies` for the sticky sessions type.
         * 
         * @return builder
         * 
         */
        public Builder cookieName(@Nullable Output<String> cookieName) {
            $.cookieName = cookieName;
            return this;
        }

        /**
         * @param cookieName The name to be used for the cookie sent to the client. This attribute is required when using `cookies` for the sticky sessions type.
         * 
         * @return builder
         * 
         */
        public Builder cookieName(String cookieName) {
            return cookieName(Output.of(cookieName));
        }

        /**
         * @param cookieTtlSeconds The number of seconds until the cookie set by the Load Balancer expires. This attribute is required when using `cookies` for the sticky sessions type.
         * 
         * @return builder
         * 
         */
        public Builder cookieTtlSeconds(@Nullable Output<Integer> cookieTtlSeconds) {
            $.cookieTtlSeconds = cookieTtlSeconds;
            return this;
        }

        /**
         * @param cookieTtlSeconds The number of seconds until the cookie set by the Load Balancer expires. This attribute is required when using `cookies` for the sticky sessions type.
         * 
         * @return builder
         * 
         */
        public Builder cookieTtlSeconds(Integer cookieTtlSeconds) {
            return cookieTtlSeconds(Output.of(cookieTtlSeconds));
        }

        /**
         * @param type An attribute indicating how and if requests from a client will be persistently served by the same backend Droplet. The possible values are `cookies` or `none`. If not specified, the default value is `none`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type An attribute indicating how and if requests from a client will be persistently served by the same backend Droplet. The possible values are `cookies` or `none`. If not specified, the default value is `none`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public LoadBalancerStickySessionsArgs build() {
            return $;
        }
    }

}
