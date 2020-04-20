// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

func LookupLoadBalancer(ctx *pulumi.Context, args *LookupLoadBalancerArgs, opts ...pulumi.InvokeOption) (*LookupLoadBalancerResult, error) {
	var rv LookupLoadBalancerResult
	err := ctx.Invoke("digitalocean:index/getLoadBalancer:getLoadBalancer", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLoadBalancer.
type LookupLoadBalancerArgs struct {
	// The name of load balancer.
	Name string `pulumi:"name"`
}

// A collection of values returned by getLoadBalancer.
type LookupLoadBalancerResult struct {
	Algorithm           string                          `pulumi:"algorithm"`
	DropletIds          []int                           `pulumi:"dropletIds"`
	DropletTag          string                          `pulumi:"dropletTag"`
	EnableProxyProtocol bool                            `pulumi:"enableProxyProtocol"`
	ForwardingRules     []GetLoadBalancerForwardingRule `pulumi:"forwardingRules"`
	Healthcheck         GetLoadBalancerHealthcheck      `pulumi:"healthcheck"`
	// id is the provider-assigned unique ID for this managed resource.
	Id                  string                        `pulumi:"id"`
	Ip                  string                        `pulumi:"ip"`
	Name                string                        `pulumi:"name"`
	RedirectHttpToHttps bool                          `pulumi:"redirectHttpToHttps"`
	Region              string                        `pulumi:"region"`
	Status              string                        `pulumi:"status"`
	StickySessions      GetLoadBalancerStickySessions `pulumi:"stickySessions"`
	Urn                 string                        `pulumi:"urn"`
	VpcUuid             string                        `pulumi:"vpcUuid"`
}
