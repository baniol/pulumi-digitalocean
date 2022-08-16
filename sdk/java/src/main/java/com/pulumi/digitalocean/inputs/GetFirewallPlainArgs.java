// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.GetFirewallInboundRule;
import com.pulumi.digitalocean.inputs.GetFirewallOutboundRule;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFirewallPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallPlainArgs Empty = new GetFirewallPlainArgs();

    /**
     * The list of the IDs of the Droplets assigned to
     * the Firewall.
     * 
     */
    @Import(name="dropletIds")
    private @Nullable List<Integer> dropletIds;

    /**
     * @return The list of the IDs of the Droplets assigned to
     * the Firewall.
     * 
     */
    public Optional<List<Integer>> dropletIds() {
        return Optional.ofNullable(this.dropletIds);
    }

    /**
     * The ID of the firewall to retrieve information
     * about.
     * 
     */
    @Import(name="firewallId", required=true)
    private String firewallId;

    /**
     * @return The ID of the firewall to retrieve information
     * about.
     * 
     */
    public String firewallId() {
        return this.firewallId;
    }

    @Import(name="inboundRules")
    private @Nullable List<GetFirewallInboundRule> inboundRules;

    public Optional<List<GetFirewallInboundRule>> inboundRules() {
        return Optional.ofNullable(this.inboundRules);
    }

    @Import(name="outboundRules")
    private @Nullable List<GetFirewallOutboundRule> outboundRules;

    public Optional<List<GetFirewallOutboundRule>> outboundRules() {
        return Optional.ofNullable(this.outboundRules);
    }

    /**
     * The names of the Tags assigned to the Firewall.
     * 
     */
    @Import(name="tags")
    private @Nullable List<String> tags;

    /**
     * @return The names of the Tags assigned to the Firewall.
     * 
     */
    public Optional<List<String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetFirewallPlainArgs() {}

    private GetFirewallPlainArgs(GetFirewallPlainArgs $) {
        this.dropletIds = $.dropletIds;
        this.firewallId = $.firewallId;
        this.inboundRules = $.inboundRules;
        this.outboundRules = $.outboundRules;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallPlainArgs $;

        public Builder() {
            $ = new GetFirewallPlainArgs();
        }

        public Builder(GetFirewallPlainArgs defaults) {
            $ = new GetFirewallPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dropletIds The list of the IDs of the Droplets assigned to
         * the Firewall.
         * 
         * @return builder
         * 
         */
        public Builder dropletIds(@Nullable List<Integer> dropletIds) {
            $.dropletIds = dropletIds;
            return this;
        }

        /**
         * @param dropletIds The list of the IDs of the Droplets assigned to
         * the Firewall.
         * 
         * @return builder
         * 
         */
        public Builder dropletIds(Integer... dropletIds) {
            return dropletIds(List.of(dropletIds));
        }

        /**
         * @param firewallId The ID of the firewall to retrieve information
         * about.
         * 
         * @return builder
         * 
         */
        public Builder firewallId(String firewallId) {
            $.firewallId = firewallId;
            return this;
        }

        public Builder inboundRules(@Nullable List<GetFirewallInboundRule> inboundRules) {
            $.inboundRules = inboundRules;
            return this;
        }

        public Builder inboundRules(GetFirewallInboundRule... inboundRules) {
            return inboundRules(List.of(inboundRules));
        }

        public Builder outboundRules(@Nullable List<GetFirewallOutboundRule> outboundRules) {
            $.outboundRules = outboundRules;
            return this;
        }

        public Builder outboundRules(GetFirewallOutboundRule... outboundRules) {
            return outboundRules(List.of(outboundRules));
        }

        /**
         * @param tags The names of the Tags assigned to the Firewall.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable List<String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The names of the Tags assigned to the Firewall.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public GetFirewallPlainArgs build() {
            $.firewallId = Objects.requireNonNull($.firewallId, "expected parameter 'firewallId' to be non-null");
            return $;
        }
    }

}
