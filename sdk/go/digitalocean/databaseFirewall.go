// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DigitalOcean database firewall resource allowing you to restrict
// connections to your database to trusted sources. You may limit connections to
// specific Droplets, Kubernetes clusters, or IP addresses.
//
// ## Example Usage
// ### Create a new database firewall allowing multiple IP addresses
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := digitalocean.NewDatabaseCluster(ctx, "postgres-example", &digitalocean.DatabaseClusterArgs{
// 			Engine:    pulumi.String("pg"),
// 			Version:   pulumi.String("11"),
// 			Size:      pulumi.String("db-s-1vcpu-1gb"),
// 			Region:    pulumi.String("nyc1"),
// 			NodeCount: pulumi.Int(1),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = digitalocean.NewDatabaseFirewall(ctx, "example-fw", &digitalocean.DatabaseFirewallArgs{
// 			ClusterId: postgres_example.ID(),
// 			Rules: DatabaseFirewallRuleArray{
// 				&DatabaseFirewallRuleArgs{
// 					Type:  pulumi.String("ip_addr"),
// 					Value: pulumi.String("192.168.1.1"),
// 				},
// 				&DatabaseFirewallRuleArgs{
// 					Type:  pulumi.String("ip_addr"),
// 					Value: pulumi.String("192.0.2.0"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Create a new database firewall allowing a Droplet
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		web, err := digitalocean.NewDroplet(ctx, "web", &digitalocean.DropletArgs{
// 			Size:   pulumi.String("s-1vcpu-1gb"),
// 			Image:  pulumi.String("centos-7-x64"),
// 			Region: pulumi.String("nyc3"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = digitalocean.NewDatabaseCluster(ctx, "postgres-example", &digitalocean.DatabaseClusterArgs{
// 			Engine:    pulumi.String("pg"),
// 			Version:   pulumi.String("11"),
// 			Size:      pulumi.String("db-s-1vcpu-1gb"),
// 			Region:    pulumi.String("nyc1"),
// 			NodeCount: pulumi.Int(1),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = digitalocean.NewDatabaseFirewall(ctx, "example-fw", &digitalocean.DatabaseFirewallArgs{
// 			ClusterId: postgres_example.ID(),
// 			Rules: DatabaseFirewallRuleArray{
// 				&DatabaseFirewallRuleArgs{
// 					Type:  pulumi.String("droplet"),
// 					Value: web.ID(),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Database firewalls can be imported using the `id` of the target database cluster For example
//
// ```sh
//  $ pulumi import digitalocean:index/databaseFirewall:DatabaseFirewall example-fw 5f55c6cd-863b-4907-99b8-7e09b0275d54
// ```
type DatabaseFirewall struct {
	pulumi.CustomResourceState

	// The ID of the target database cluster.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
	Rules DatabaseFirewallRuleArrayOutput `pulumi:"rules"`
}

// NewDatabaseFirewall registers a new resource with the given unique name, arguments, and options.
func NewDatabaseFirewall(ctx *pulumi.Context,
	name string, args *DatabaseFirewallArgs, opts ...pulumi.ResourceOption) (*DatabaseFirewall, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.Rules == nil {
		return nil, errors.New("invalid value for required argument 'Rules'")
	}
	var resource DatabaseFirewall
	err := ctx.RegisterResource("digitalocean:index/databaseFirewall:DatabaseFirewall", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDatabaseFirewall gets an existing DatabaseFirewall resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDatabaseFirewall(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DatabaseFirewallState, opts ...pulumi.ResourceOption) (*DatabaseFirewall, error) {
	var resource DatabaseFirewall
	err := ctx.ReadResource("digitalocean:index/databaseFirewall:DatabaseFirewall", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DatabaseFirewall resources.
type databaseFirewallState struct {
	// The ID of the target database cluster.
	ClusterId *string `pulumi:"clusterId"`
	// A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
	Rules []DatabaseFirewallRule `pulumi:"rules"`
}

type DatabaseFirewallState struct {
	// The ID of the target database cluster.
	ClusterId pulumi.StringPtrInput
	// A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
	Rules DatabaseFirewallRuleArrayInput
}

func (DatabaseFirewallState) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseFirewallState)(nil)).Elem()
}

type databaseFirewallArgs struct {
	// The ID of the target database cluster.
	ClusterId string `pulumi:"clusterId"`
	// A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
	Rules []DatabaseFirewallRule `pulumi:"rules"`
}

// The set of arguments for constructing a DatabaseFirewall resource.
type DatabaseFirewallArgs struct {
	// The ID of the target database cluster.
	ClusterId pulumi.StringInput
	// A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
	Rules DatabaseFirewallRuleArrayInput
}

func (DatabaseFirewallArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseFirewallArgs)(nil)).Elem()
}

type DatabaseFirewallInput interface {
	pulumi.Input

	ToDatabaseFirewallOutput() DatabaseFirewallOutput
	ToDatabaseFirewallOutputWithContext(ctx context.Context) DatabaseFirewallOutput
}

func (*DatabaseFirewall) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseFirewall)(nil)).Elem()
}

func (i *DatabaseFirewall) ToDatabaseFirewallOutput() DatabaseFirewallOutput {
	return i.ToDatabaseFirewallOutputWithContext(context.Background())
}

func (i *DatabaseFirewall) ToDatabaseFirewallOutputWithContext(ctx context.Context) DatabaseFirewallOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseFirewallOutput)
}

// DatabaseFirewallArrayInput is an input type that accepts DatabaseFirewallArray and DatabaseFirewallArrayOutput values.
// You can construct a concrete instance of `DatabaseFirewallArrayInput` via:
//
//          DatabaseFirewallArray{ DatabaseFirewallArgs{...} }
type DatabaseFirewallArrayInput interface {
	pulumi.Input

	ToDatabaseFirewallArrayOutput() DatabaseFirewallArrayOutput
	ToDatabaseFirewallArrayOutputWithContext(context.Context) DatabaseFirewallArrayOutput
}

type DatabaseFirewallArray []DatabaseFirewallInput

func (DatabaseFirewallArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseFirewall)(nil)).Elem()
}

func (i DatabaseFirewallArray) ToDatabaseFirewallArrayOutput() DatabaseFirewallArrayOutput {
	return i.ToDatabaseFirewallArrayOutputWithContext(context.Background())
}

func (i DatabaseFirewallArray) ToDatabaseFirewallArrayOutputWithContext(ctx context.Context) DatabaseFirewallArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseFirewallArrayOutput)
}

// DatabaseFirewallMapInput is an input type that accepts DatabaseFirewallMap and DatabaseFirewallMapOutput values.
// You can construct a concrete instance of `DatabaseFirewallMapInput` via:
//
//          DatabaseFirewallMap{ "key": DatabaseFirewallArgs{...} }
type DatabaseFirewallMapInput interface {
	pulumi.Input

	ToDatabaseFirewallMapOutput() DatabaseFirewallMapOutput
	ToDatabaseFirewallMapOutputWithContext(context.Context) DatabaseFirewallMapOutput
}

type DatabaseFirewallMap map[string]DatabaseFirewallInput

func (DatabaseFirewallMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseFirewall)(nil)).Elem()
}

func (i DatabaseFirewallMap) ToDatabaseFirewallMapOutput() DatabaseFirewallMapOutput {
	return i.ToDatabaseFirewallMapOutputWithContext(context.Background())
}

func (i DatabaseFirewallMap) ToDatabaseFirewallMapOutputWithContext(ctx context.Context) DatabaseFirewallMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseFirewallMapOutput)
}

type DatabaseFirewallOutput struct{ *pulumi.OutputState }

func (DatabaseFirewallOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseFirewall)(nil)).Elem()
}

func (o DatabaseFirewallOutput) ToDatabaseFirewallOutput() DatabaseFirewallOutput {
	return o
}

func (o DatabaseFirewallOutput) ToDatabaseFirewallOutputWithContext(ctx context.Context) DatabaseFirewallOutput {
	return o
}

// The ID of the target database cluster.
func (o DatabaseFirewallOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseFirewall) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
func (o DatabaseFirewallOutput) Rules() DatabaseFirewallRuleArrayOutput {
	return o.ApplyT(func(v *DatabaseFirewall) DatabaseFirewallRuleArrayOutput { return v.Rules }).(DatabaseFirewallRuleArrayOutput)
}

type DatabaseFirewallArrayOutput struct{ *pulumi.OutputState }

func (DatabaseFirewallArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseFirewall)(nil)).Elem()
}

func (o DatabaseFirewallArrayOutput) ToDatabaseFirewallArrayOutput() DatabaseFirewallArrayOutput {
	return o
}

func (o DatabaseFirewallArrayOutput) ToDatabaseFirewallArrayOutputWithContext(ctx context.Context) DatabaseFirewallArrayOutput {
	return o
}

func (o DatabaseFirewallArrayOutput) Index(i pulumi.IntInput) DatabaseFirewallOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DatabaseFirewall {
		return vs[0].([]*DatabaseFirewall)[vs[1].(int)]
	}).(DatabaseFirewallOutput)
}

type DatabaseFirewallMapOutput struct{ *pulumi.OutputState }

func (DatabaseFirewallMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseFirewall)(nil)).Elem()
}

func (o DatabaseFirewallMapOutput) ToDatabaseFirewallMapOutput() DatabaseFirewallMapOutput {
	return o
}

func (o DatabaseFirewallMapOutput) ToDatabaseFirewallMapOutputWithContext(ctx context.Context) DatabaseFirewallMapOutput {
	return o
}

func (o DatabaseFirewallMapOutput) MapIndex(k pulumi.StringInput) DatabaseFirewallOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DatabaseFirewall {
		return vs[0].(map[string]*DatabaseFirewall)[vs[1].(string)]
	}).(DatabaseFirewallOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseFirewallInput)(nil)).Elem(), &DatabaseFirewall{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseFirewallArrayInput)(nil)).Elem(), DatabaseFirewallArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseFirewallMapInput)(nil)).Elem(), DatabaseFirewallMap{})
	pulumi.RegisterOutputType(DatabaseFirewallOutput{})
	pulumi.RegisterOutputType(DatabaseFirewallArrayOutput{})
	pulumi.RegisterOutputType(DatabaseFirewallMapOutput{})
}
