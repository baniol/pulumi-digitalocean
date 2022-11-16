// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// Get the reserved IP:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			publicIp := cfg.RequireObject("publicIp")
//			example, err := digitalocean.LookupReservedIp(ctx, &GetReservedIpArgs{
//				IpAddress: publicIp,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("fipOutput", example.DropletId)
//			return nil
//		})
//	}
//
// ```
func LookupReservedIp(ctx *pulumi.Context, args *LookupReservedIpArgs, opts ...pulumi.InvokeOption) (*LookupReservedIpResult, error) {
	var rv LookupReservedIpResult
	err := ctx.Invoke("digitalocean:index/getReservedIp:getReservedIp", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getReservedIp.
type LookupReservedIpArgs struct {
	// The allocated IP address of the specific reserved IP to retrieve.
	IpAddress string `pulumi:"ipAddress"`
}

// A collection of values returned by getReservedIp.
type LookupReservedIpResult struct {
	DropletId int `pulumi:"dropletId"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	IpAddress string `pulumi:"ipAddress"`
	Region    string `pulumi:"region"`
	Urn       string `pulumi:"urn"`
}

func LookupReservedIpOutput(ctx *pulumi.Context, args LookupReservedIpOutputArgs, opts ...pulumi.InvokeOption) LookupReservedIpResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupReservedIpResult, error) {
			args := v.(LookupReservedIpArgs)
			r, err := LookupReservedIp(ctx, &args, opts...)
			var s LookupReservedIpResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupReservedIpResultOutput)
}

// A collection of arguments for invoking getReservedIp.
type LookupReservedIpOutputArgs struct {
	// The allocated IP address of the specific reserved IP to retrieve.
	IpAddress pulumi.StringInput `pulumi:"ipAddress"`
}

func (LookupReservedIpOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupReservedIpArgs)(nil)).Elem()
}

// A collection of values returned by getReservedIp.
type LookupReservedIpResultOutput struct{ *pulumi.OutputState }

func (LookupReservedIpResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupReservedIpResult)(nil)).Elem()
}

func (o LookupReservedIpResultOutput) ToLookupReservedIpResultOutput() LookupReservedIpResultOutput {
	return o
}

func (o LookupReservedIpResultOutput) ToLookupReservedIpResultOutputWithContext(ctx context.Context) LookupReservedIpResultOutput {
	return o
}

func (o LookupReservedIpResultOutput) DropletId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupReservedIpResult) int { return v.DropletId }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupReservedIpResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReservedIpResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupReservedIpResultOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReservedIpResult) string { return v.IpAddress }).(pulumi.StringOutput)
}

func (o LookupReservedIpResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReservedIpResult) string { return v.Region }).(pulumi.StringOutput)
}

func (o LookupReservedIpResultOutput) Urn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReservedIpResult) string { return v.Urn }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupReservedIpResultOutput{})
}