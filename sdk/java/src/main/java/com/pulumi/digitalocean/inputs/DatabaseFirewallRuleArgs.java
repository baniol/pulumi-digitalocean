// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseFirewallRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseFirewallRuleArgs Empty = new DatabaseFirewallRuleArgs();

    /**
     * The date and time when the firewall rule was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The date and time when the firewall rule was created.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The type of resource that the firewall rule allows to access the database cluster. The possible values are: `droplet`, `k8s`, `ip_addr`, `tag`, or `app`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of resource that the firewall rule allows to access the database cluster. The possible values are: `droplet`, `k8s`, `ip_addr`, `tag`, or `app`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * A unique identifier for the firewall rule.
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return A unique identifier for the firewall rule.
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    /**
     * The ID of the specific resource, the name of a tag applied to a group of resources, or the IP address that the firewall rule allows to access the database cluster.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The ID of the specific resource, the name of a tag applied to a group of resources, or the IP address that the firewall rule allows to access the database cluster.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private DatabaseFirewallRuleArgs() {}

    private DatabaseFirewallRuleArgs(DatabaseFirewallRuleArgs $) {
        this.createdAt = $.createdAt;
        this.type = $.type;
        this.uuid = $.uuid;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseFirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseFirewallRuleArgs $;

        public Builder() {
            $ = new DatabaseFirewallRuleArgs();
        }

        public Builder(DatabaseFirewallRuleArgs defaults) {
            $ = new DatabaseFirewallRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt The date and time when the firewall rule was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The date and time when the firewall rule was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param type The type of resource that the firewall rule allows to access the database cluster. The possible values are: `droplet`, `k8s`, `ip_addr`, `tag`, or `app`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of resource that the firewall rule allows to access the database cluster. The possible values are: `droplet`, `k8s`, `ip_addr`, `tag`, or `app`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param uuid A unique identifier for the firewall rule.
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid A unique identifier for the firewall rule.
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        /**
         * @param value The ID of the specific resource, the name of a tag applied to a group of resources, or the IP address that the firewall rule allows to access the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The ID of the specific resource, the name of a tag applied to a group of resources, or the IP address that the firewall rule allows to access the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DatabaseFirewallRuleArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
