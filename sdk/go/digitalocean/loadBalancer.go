// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package digitalocean

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a DigitalOcean Load Balancer resource. This can be used to create,
// modify, and delete Load Balancers.
// 
// > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/r/loadbalancer.html.markdown.
type LoadBalancer struct {
	pulumi.CustomResourceState

	// The load balancing algorithm used to determine
	// which backend Droplet will be selected by a client. It must be either `roundRobin`
	// or `leastConnections`. The default value is `roundRobin`.
	Algorithm pulumi.StringPtrOutput `pulumi:"algorithm"`
	// A list of the IDs of each droplet to be attached to the Load Balancer.
	DropletIds pulumi.IntArrayOutput `pulumi:"dropletIds"`
	// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
	DropletTag pulumi.StringPtrOutput `pulumi:"dropletTag"`
	// A boolean value indicating whether PROXY
	// Protocol should be used to pass information from connecting client requests to
	// the backend service. Default value is `false`.
	EnableProxyProtocol pulumi.BoolPtrOutput `pulumi:"enableProxyProtocol"`
	// A list of `forwardingRule` to be assigned to the
	// Load Balancer. The `forwardingRule` block is documented below.
	ForwardingRules LoadBalancerForwardingRuleArrayOutput `pulumi:"forwardingRules"`
	// A `healthcheck` block to be assigned to the
	// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
	Healthcheck LoadBalancerHealthcheckOutput `pulumi:"healthcheck"`
	Ip pulumi.StringOutput `pulumi:"ip"`
	// The Load Balancer name
	Name pulumi.StringOutput `pulumi:"name"`
	// A boolean value indicating whether
	// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
	// Default value is `false`.
	RedirectHttpToHttps pulumi.BoolPtrOutput `pulumi:"redirectHttpToHttps"`
	// The region to start in
	Region pulumi.StringOutput `pulumi:"region"`
	Status pulumi.StringOutput `pulumi:"status"`
	// A `stickySessions` block to be assigned to the
	// Load Balancer. The `stickySessions` block is documented below. Only 1 stickySessions block is allowed.
	StickySessions LoadBalancerStickySessionsOutput `pulumi:"stickySessions"`
	// The uniform resource name for the Load Balancer
	Urn pulumi.StringOutput `pulumi:"urn"`
}

// NewLoadBalancer registers a new resource with the given unique name, arguments, and options.
func NewLoadBalancer(ctx *pulumi.Context,
	name string, args *LoadBalancerArgs, opts ...pulumi.ResourceOption) (*LoadBalancer, error) {
	if args == nil || args.ForwardingRules == nil {
		return nil, errors.New("missing required argument 'ForwardingRules'")
	}
	if args == nil || args.Region == nil {
		return nil, errors.New("missing required argument 'Region'")
	}
	if args == nil {
		args = &LoadBalancerArgs{}
	}
	var resource LoadBalancer
	err := ctx.RegisterResource("digitalocean:index/loadBalancer:LoadBalancer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadBalancer gets an existing LoadBalancer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadBalancer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadBalancerState, opts ...pulumi.ResourceOption) (*LoadBalancer, error) {
	var resource LoadBalancer
	err := ctx.ReadResource("digitalocean:index/loadBalancer:LoadBalancer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadBalancer resources.
type loadBalancerState struct {
	// The load balancing algorithm used to determine
	// which backend Droplet will be selected by a client. It must be either `roundRobin`
	// or `leastConnections`. The default value is `roundRobin`.
	Algorithm *string `pulumi:"algorithm"`
	// A list of the IDs of each droplet to be attached to the Load Balancer.
	DropletIds []int `pulumi:"dropletIds"`
	// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
	DropletTag *string `pulumi:"dropletTag"`
	// A boolean value indicating whether PROXY
	// Protocol should be used to pass information from connecting client requests to
	// the backend service. Default value is `false`.
	EnableProxyProtocol *bool `pulumi:"enableProxyProtocol"`
	// A list of `forwardingRule` to be assigned to the
	// Load Balancer. The `forwardingRule` block is documented below.
	ForwardingRules []LoadBalancerForwardingRule `pulumi:"forwardingRules"`
	// A `healthcheck` block to be assigned to the
	// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
	Healthcheck *LoadBalancerHealthcheck `pulumi:"healthcheck"`
	Ip *string `pulumi:"ip"`
	// The Load Balancer name
	Name *string `pulumi:"name"`
	// A boolean value indicating whether
	// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
	// Default value is `false`.
	RedirectHttpToHttps *bool `pulumi:"redirectHttpToHttps"`
	// The region to start in
	Region *string `pulumi:"region"`
	Status *string `pulumi:"status"`
	// A `stickySessions` block to be assigned to the
	// Load Balancer. The `stickySessions` block is documented below. Only 1 stickySessions block is allowed.
	StickySessions *LoadBalancerStickySessions `pulumi:"stickySessions"`
	// The uniform resource name for the Load Balancer
	Urn *string `pulumi:"urn"`
}

type LoadBalancerState struct {
	// The load balancing algorithm used to determine
	// which backend Droplet will be selected by a client. It must be either `roundRobin`
	// or `leastConnections`. The default value is `roundRobin`.
	Algorithm pulumi.StringPtrInput
	// A list of the IDs of each droplet to be attached to the Load Balancer.
	DropletIds pulumi.IntArrayInput
	// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
	DropletTag pulumi.StringPtrInput
	// A boolean value indicating whether PROXY
	// Protocol should be used to pass information from connecting client requests to
	// the backend service. Default value is `false`.
	EnableProxyProtocol pulumi.BoolPtrInput
	// A list of `forwardingRule` to be assigned to the
	// Load Balancer. The `forwardingRule` block is documented below.
	ForwardingRules LoadBalancerForwardingRuleArrayInput
	// A `healthcheck` block to be assigned to the
	// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
	Healthcheck LoadBalancerHealthcheckPtrInput
	Ip pulumi.StringPtrInput
	// The Load Balancer name
	Name pulumi.StringPtrInput
	// A boolean value indicating whether
	// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
	// Default value is `false`.
	RedirectHttpToHttps pulumi.BoolPtrInput
	// The region to start in
	Region pulumi.StringPtrInput
	Status pulumi.StringPtrInput
	// A `stickySessions` block to be assigned to the
	// Load Balancer. The `stickySessions` block is documented below. Only 1 stickySessions block is allowed.
	StickySessions LoadBalancerStickySessionsPtrInput
	// The uniform resource name for the Load Balancer
	Urn pulumi.StringPtrInput
}

func (LoadBalancerState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerState)(nil)).Elem()
}

type loadBalancerArgs struct {
	// The load balancing algorithm used to determine
	// which backend Droplet will be selected by a client. It must be either `roundRobin`
	// or `leastConnections`. The default value is `roundRobin`.
	Algorithm *string `pulumi:"algorithm"`
	// A list of the IDs of each droplet to be attached to the Load Balancer.
	DropletIds []int `pulumi:"dropletIds"`
	// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
	DropletTag *string `pulumi:"dropletTag"`
	// A boolean value indicating whether PROXY
	// Protocol should be used to pass information from connecting client requests to
	// the backend service. Default value is `false`.
	EnableProxyProtocol *bool `pulumi:"enableProxyProtocol"`
	// A list of `forwardingRule` to be assigned to the
	// Load Balancer. The `forwardingRule` block is documented below.
	ForwardingRules []LoadBalancerForwardingRule `pulumi:"forwardingRules"`
	// A `healthcheck` block to be assigned to the
	// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
	Healthcheck *LoadBalancerHealthcheck `pulumi:"healthcheck"`
	// The Load Balancer name
	Name *string `pulumi:"name"`
	// A boolean value indicating whether
	// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
	// Default value is `false`.
	RedirectHttpToHttps *bool `pulumi:"redirectHttpToHttps"`
	// The region to start in
	Region string `pulumi:"region"`
	// A `stickySessions` block to be assigned to the
	// Load Balancer. The `stickySessions` block is documented below. Only 1 stickySessions block is allowed.
	StickySessions *LoadBalancerStickySessions `pulumi:"stickySessions"`
}

// The set of arguments for constructing a LoadBalancer resource.
type LoadBalancerArgs struct {
	// The load balancing algorithm used to determine
	// which backend Droplet will be selected by a client. It must be either `roundRobin`
	// or `leastConnections`. The default value is `roundRobin`.
	Algorithm pulumi.StringPtrInput
	// A list of the IDs of each droplet to be attached to the Load Balancer.
	DropletIds pulumi.IntArrayInput
	// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
	DropletTag pulumi.StringPtrInput
	// A boolean value indicating whether PROXY
	// Protocol should be used to pass information from connecting client requests to
	// the backend service. Default value is `false`.
	EnableProxyProtocol pulumi.BoolPtrInput
	// A list of `forwardingRule` to be assigned to the
	// Load Balancer. The `forwardingRule` block is documented below.
	ForwardingRules LoadBalancerForwardingRuleArrayInput
	// A `healthcheck` block to be assigned to the
	// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
	Healthcheck LoadBalancerHealthcheckPtrInput
	// The Load Balancer name
	Name pulumi.StringPtrInput
	// A boolean value indicating whether
	// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
	// Default value is `false`.
	RedirectHttpToHttps pulumi.BoolPtrInput
	// The region to start in
	Region pulumi.StringInput
	// A `stickySessions` block to be assigned to the
	// Load Balancer. The `stickySessions` block is documented below. Only 1 stickySessions block is allowed.
	StickySessions LoadBalancerStickySessionsPtrInput
}

func (LoadBalancerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerArgs)(nil)).Elem()
}

