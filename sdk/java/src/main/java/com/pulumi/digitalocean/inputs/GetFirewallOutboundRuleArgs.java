// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFirewallOutboundRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetFirewallOutboundRuleArgs Empty = new GetFirewallOutboundRuleArgs();

    /**
     * An array of strings containing the IPv4
     * addresses, IPv6 addresses, IPv4 CIDRs, and/or IPv6 CIDRs to which the
     * outbound traffic will be allowed.
     * 
     */
    @Import(name="destinationAddresses")
    private @Nullable Output<List<String>> destinationAddresses;

    /**
     * @return An array of strings containing the IPv4
     * addresses, IPv6 addresses, IPv4 CIDRs, and/or IPv6 CIDRs to which the
     * outbound traffic will be allowed.
     * 
     */
    public Optional<Output<List<String>>> destinationAddresses() {
        return Optional.ofNullable(this.destinationAddresses);
    }

    /**
     * An array containing the IDs of
     * the Droplets to which the outbound traffic will be allowed.
     * 
     */
    @Import(name="destinationDropletIds")
    private @Nullable Output<List<Integer>> destinationDropletIds;

    /**
     * @return An array containing the IDs of
     * the Droplets to which the outbound traffic will be allowed.
     * 
     */
    public Optional<Output<List<Integer>>> destinationDropletIds() {
        return Optional.ofNullable(this.destinationDropletIds);
    }

    @Import(name="destinationKubernetesIds")
    private @Nullable Output<List<String>> destinationKubernetesIds;

    public Optional<Output<List<String>>> destinationKubernetesIds() {
        return Optional.ofNullable(this.destinationKubernetesIds);
    }

    /**
     * An array containing the IDs
     * of the Load Balancers to which the outbound traffic will be allowed.
     * 
     */
    @Import(name="destinationLoadBalancerUids")
    private @Nullable Output<List<String>> destinationLoadBalancerUids;

    /**
     * @return An array containing the IDs
     * of the Load Balancers to which the outbound traffic will be allowed.
     * 
     */
    public Optional<Output<List<String>>> destinationLoadBalancerUids() {
        return Optional.ofNullable(this.destinationLoadBalancerUids);
    }

    /**
     * An array containing the names of Tags
     * corresponding to groups of Droplets to which the outbound traffic will
     * be allowed.
     * traffic.
     * 
     */
    @Import(name="destinationTags")
    private @Nullable Output<List<String>> destinationTags;

    /**
     * @return An array containing the names of Tags
     * corresponding to groups of Droplets to which the outbound traffic will
     * be allowed.
     * traffic.
     * 
     */
    public Optional<Output<List<String>>> destinationTags() {
        return Optional.ofNullable(this.destinationTags);
    }

    /**
     * The ports on which traffic will be allowed
     * specified as a string containing a single port, a range (e.g. &#34;8000-9000&#34;),
     * or &#34;1-65535&#34; to open all ports for a protocol. Required for when protocol is
     * `tcp` or `udp`.
     * 
     */
    @Import(name="portRange")
    private @Nullable Output<String> portRange;

    /**
     * @return The ports on which traffic will be allowed
     * specified as a string containing a single port, a range (e.g. &#34;8000-9000&#34;),
     * or &#34;1-65535&#34; to open all ports for a protocol. Required for when protocol is
     * `tcp` or `udp`.
     * 
     */
    public Optional<Output<String>> portRange() {
        return Optional.ofNullable(this.portRange);
    }

    /**
     * The type of traffic to be allowed.
     * This may be one of &#34;tcp&#34;, &#34;udp&#34;, or &#34;icmp&#34;.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The type of traffic to be allowed.
     * This may be one of &#34;tcp&#34;, &#34;udp&#34;, or &#34;icmp&#34;.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    private GetFirewallOutboundRuleArgs() {}

    private GetFirewallOutboundRuleArgs(GetFirewallOutboundRuleArgs $) {
        this.destinationAddresses = $.destinationAddresses;
        this.destinationDropletIds = $.destinationDropletIds;
        this.destinationKubernetesIds = $.destinationKubernetesIds;
        this.destinationLoadBalancerUids = $.destinationLoadBalancerUids;
        this.destinationTags = $.destinationTags;
        this.portRange = $.portRange;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallOutboundRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallOutboundRuleArgs $;

        public Builder() {
            $ = new GetFirewallOutboundRuleArgs();
        }

        public Builder(GetFirewallOutboundRuleArgs defaults) {
            $ = new GetFirewallOutboundRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationAddresses An array of strings containing the IPv4
         * addresses, IPv6 addresses, IPv4 CIDRs, and/or IPv6 CIDRs to which the
         * outbound traffic will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(@Nullable Output<List<String>> destinationAddresses) {
            $.destinationAddresses = destinationAddresses;
            return this;
        }

        /**
         * @param destinationAddresses An array of strings containing the IPv4
         * addresses, IPv6 addresses, IPv4 CIDRs, and/or IPv6 CIDRs to which the
         * outbound traffic will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(List<String> destinationAddresses) {
            return destinationAddresses(Output.of(destinationAddresses));
        }

        /**
         * @param destinationAddresses An array of strings containing the IPv4
         * addresses, IPv6 addresses, IPv4 CIDRs, and/or IPv6 CIDRs to which the
         * outbound traffic will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }

        /**
         * @param destinationDropletIds An array containing the IDs of
         * the Droplets to which the outbound traffic will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder destinationDropletIds(@Nullable Output<List<Integer>> destinationDropletIds) {
            $.destinationDropletIds = destinationDropletIds;
            return this;
        }

        /**
         * @param destinationDropletIds An array containing the IDs of
         * the Droplets to which the outbound traffic will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder destinationDropletIds(List<Integer> destinationDropletIds) {
            return destinationDropletIds(Output.of(destinationDropletIds));
        }

        /**
         * @param destinationDropletIds An array containing the IDs of
         * the Droplets to which the outbound traffic will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder destinationDropletIds(Integer... destinationDropletIds) {
            return destinationDropletIds(List.of(destinationDropletIds));
        }

        public Builder destinationKubernetesIds(@Nullable Output<List<String>> destinationKubernetesIds) {
            $.destinationKubernetesIds = destinationKubernetesIds;
            return this;
        }

        public Builder destinationKubernetesIds(List<String> destinationKubernetesIds) {
            return destinationKubernetesIds(Output.of(destinationKubernetesIds));
        }

        public Builder destinationKubernetesIds(String... destinationKubernetesIds) {
            return destinationKubernetesIds(List.of(destinationKubernetesIds));
        }

        /**
         * @param destinationLoadBalancerUids An array containing the IDs
         * of the Load Balancers to which the outbound traffic will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder destinationLoadBalancerUids(@Nullable Output<List<String>> destinationLoadBalancerUids) {
            $.destinationLoadBalancerUids = destinationLoadBalancerUids;
            return this;
        }

        /**
         * @param destinationLoadBalancerUids An array containing the IDs
         * of the Load Balancers to which the outbound traffic will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder destinationLoadBalancerUids(List<String> destinationLoadBalancerUids) {
            return destinationLoadBalancerUids(Output.of(destinationLoadBalancerUids));
        }

        /**
         * @param destinationLoadBalancerUids An array containing the IDs
         * of the Load Balancers to which the outbound traffic will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder destinationLoadBalancerUids(String... destinationLoadBalancerUids) {
            return destinationLoadBalancerUids(List.of(destinationLoadBalancerUids));
        }

        /**
         * @param destinationTags An array containing the names of Tags
         * corresponding to groups of Droplets to which the outbound traffic will
         * be allowed.
         * traffic.
         * 
         * @return builder
         * 
         */
        public Builder destinationTags(@Nullable Output<List<String>> destinationTags) {
            $.destinationTags = destinationTags;
            return this;
        }

        /**
         * @param destinationTags An array containing the names of Tags
         * corresponding to groups of Droplets to which the outbound traffic will
         * be allowed.
         * traffic.
         * 
         * @return builder
         * 
         */
        public Builder destinationTags(List<String> destinationTags) {
            return destinationTags(Output.of(destinationTags));
        }

        /**
         * @param destinationTags An array containing the names of Tags
         * corresponding to groups of Droplets to which the outbound traffic will
         * be allowed.
         * traffic.
         * 
         * @return builder
         * 
         */
        public Builder destinationTags(String... destinationTags) {
            return destinationTags(List.of(destinationTags));
        }

        /**
         * @param portRange The ports on which traffic will be allowed
         * specified as a string containing a single port, a range (e.g. &#34;8000-9000&#34;),
         * or &#34;1-65535&#34; to open all ports for a protocol. Required for when protocol is
         * `tcp` or `udp`.
         * 
         * @return builder
         * 
         */
        public Builder portRange(@Nullable Output<String> portRange) {
            $.portRange = portRange;
            return this;
        }

        /**
         * @param portRange The ports on which traffic will be allowed
         * specified as a string containing a single port, a range (e.g. &#34;8000-9000&#34;),
         * or &#34;1-65535&#34; to open all ports for a protocol. Required for when protocol is
         * `tcp` or `udp`.
         * 
         * @return builder
         * 
         */
        public Builder portRange(String portRange) {
            return portRange(Output.of(portRange));
        }

        /**
         * @param protocol The type of traffic to be allowed.
         * This may be one of &#34;tcp&#34;, &#34;udp&#34;, or &#34;icmp&#34;.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The type of traffic to be allowed.
         * This may be one of &#34;tcp&#34;, &#34;udp&#34;, or &#34;icmp&#34;.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public GetFirewallOutboundRuleArgs build() {
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}
