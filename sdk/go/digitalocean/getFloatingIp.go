// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package digitalocean

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

func LookupFloatingIp(ctx *pulumi.Context, args *LookupFloatingIpArgs, opts ...pulumi.InvokeOption) (*LookupFloatingIpResult, error) {
	var rv LookupFloatingIpResult
	err := ctx.Invoke("digitalocean:index/getFloatingIp:getFloatingIp", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFloatingIp.
type LookupFloatingIpArgs struct {
	// The allocated IP address of the specific floating IP to retrieve.
	IpAddress string `pulumi:"ipAddress"`
}

// A collection of values returned by getFloatingIp.
type LookupFloatingIpResult struct {
	DropletId int `pulumi:"dropletId"`
	// id is the provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	IpAddress string `pulumi:"ipAddress"`
	Region    string `pulumi:"region"`
	Urn       string `pulumi:"urn"`
}
