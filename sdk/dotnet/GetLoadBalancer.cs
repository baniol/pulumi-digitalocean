// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetLoadBalancer
    {
        public static Task<GetLoadBalancerResult> InvokeAsync(GetLoadBalancerArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetLoadBalancerResult>("digitalocean:index/getLoadBalancer:getLoadBalancer", args ?? new GetLoadBalancerArgs(), options.WithVersion());
    }


    public sealed class GetLoadBalancerArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of load balancer.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetLoadBalancerArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetLoadBalancerResult
    {
        public readonly string Algorithm;
        public readonly ImmutableArray<int> DropletIds;
        public readonly string DropletTag;
        public readonly bool EnableProxyProtocol;
        public readonly ImmutableArray<Outputs.GetLoadBalancerForwardingRuleResult> ForwardingRules;
        public readonly Outputs.GetLoadBalancerHealthcheckResult Healthcheck;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Ip;
        public readonly string Name;
        public readonly bool RedirectHttpToHttps;
        public readonly string Region;
        public readonly string Status;
        public readonly Outputs.GetLoadBalancerStickySessionsResult StickySessions;
        public readonly string Urn;
        public readonly string VpcUuid;

        [OutputConstructor]
        private GetLoadBalancerResult(
            string algorithm,

            ImmutableArray<int> dropletIds,

            string dropletTag,

            bool enableProxyProtocol,

            ImmutableArray<Outputs.GetLoadBalancerForwardingRuleResult> forwardingRules,

            Outputs.GetLoadBalancerHealthcheckResult healthcheck,

            string id,

            string ip,

            string name,

            bool redirectHttpToHttps,

            string region,

            string status,

            Outputs.GetLoadBalancerStickySessionsResult stickySessions,

            string urn,

            string vpcUuid)
        {
            Algorithm = algorithm;
            DropletIds = dropletIds;
            DropletTag = dropletTag;
            EnableProxyProtocol = enableProxyProtocol;
            ForwardingRules = forwardingRules;
            Healthcheck = healthcheck;
            Id = id;
            Ip = ip;
            Name = name;
            RedirectHttpToHttps = redirectHttpToHttps;
            Region = region;
            Status = status;
            StickySessions = stickySessions;
            Urn = urn;
            VpcUuid = vpcUuid;
        }
    }
}