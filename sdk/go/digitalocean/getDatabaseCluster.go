// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information on a DigitalOcean database cluster resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := digitalocean.LookupDatabaseCluster(ctx, &GetDatabaseClusterArgs{
//				Name: "example-cluster",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("databaseOutput", example.Uri)
//			return nil
//		})
//	}
//
// ```
func LookupDatabaseCluster(ctx *pulumi.Context, args *LookupDatabaseClusterArgs, opts ...pulumi.InvokeOption) (*LookupDatabaseClusterResult, error) {
	var rv LookupDatabaseClusterResult
	err := ctx.Invoke("digitalocean:index/getDatabaseCluster:getDatabaseCluster", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatabaseCluster.
type LookupDatabaseClusterArgs struct {
	// The name of the database cluster.
	Name string   `pulumi:"name"`
	Tags []string `pulumi:"tags"`
}

// A collection of values returned by getDatabaseCluster.
type LookupDatabaseClusterResult struct {
	// Name of the cluster's default database.
	Database string `pulumi:"database"`
	// Database engine used by the cluster (ex. `pg` for PostreSQL).
	Engine string `pulumi:"engine"`
	// Database cluster's hostname.
	Host string `pulumi:"host"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Defines when the automatic maintenance should be performed for the database cluster.
	MaintenanceWindows []GetDatabaseClusterMaintenanceWindow `pulumi:"maintenanceWindows"`
	Name               string                                `pulumi:"name"`
	// Number of nodes that will be included in the cluster.
	NodeCount int `pulumi:"nodeCount"`
	// Password for the cluster's default user.
	Password string `pulumi:"password"`
	// Network port that the database cluster is listening on.
	Port int `pulumi:"port"`
	// Same as `host`, but only accessible from resources within the account and in the same region.
	PrivateHost string `pulumi:"privateHost"`
	// The ID of the VPC where the database cluster is located.
	PrivateNetworkUuid string `pulumi:"privateNetworkUuid"`
	// Same as `uri`, but only accessible from resources within the account and in the same region.
	PrivateUri string `pulumi:"privateUri"`
	// DigitalOcean region where the cluster will reside.
	Region string `pulumi:"region"`
	// Database droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`).
	Size string   `pulumi:"size"`
	Tags []string `pulumi:"tags"`
	// The full URI for connecting to the database cluster.
	Uri string `pulumi:"uri"`
	// The uniform resource name of the database cluster.
	Urn string `pulumi:"urn"`
	// Username for the cluster's default user.
	User string `pulumi:"user"`
	// Engine version used by the cluster (ex. `11` for PostgreSQL 11).
	Version string `pulumi:"version"`
}

func LookupDatabaseClusterOutput(ctx *pulumi.Context, args LookupDatabaseClusterOutputArgs, opts ...pulumi.InvokeOption) LookupDatabaseClusterResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDatabaseClusterResult, error) {
			args := v.(LookupDatabaseClusterArgs)
			r, err := LookupDatabaseCluster(ctx, &args, opts...)
			var s LookupDatabaseClusterResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDatabaseClusterResultOutput)
}

// A collection of arguments for invoking getDatabaseCluster.
type LookupDatabaseClusterOutputArgs struct {
	// The name of the database cluster.
	Name pulumi.StringInput      `pulumi:"name"`
	Tags pulumi.StringArrayInput `pulumi:"tags"`
}

func (LookupDatabaseClusterOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseClusterArgs)(nil)).Elem()
}

// A collection of values returned by getDatabaseCluster.
type LookupDatabaseClusterResultOutput struct{ *pulumi.OutputState }

func (LookupDatabaseClusterResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseClusterResult)(nil)).Elem()
}

func (o LookupDatabaseClusterResultOutput) ToLookupDatabaseClusterResultOutput() LookupDatabaseClusterResultOutput {
	return o
}

func (o LookupDatabaseClusterResultOutput) ToLookupDatabaseClusterResultOutputWithContext(ctx context.Context) LookupDatabaseClusterResultOutput {
	return o
}

// Name of the cluster's default database.
func (o LookupDatabaseClusterResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) string { return v.Database }).(pulumi.StringOutput)
}

// Database engine used by the cluster (ex. `pg` for PostreSQL).
func (o LookupDatabaseClusterResultOutput) Engine() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) string { return v.Engine }).(pulumi.StringOutput)
}

// Database cluster's hostname.
func (o LookupDatabaseClusterResultOutput) Host() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) string { return v.Host }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDatabaseClusterResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) string { return v.Id }).(pulumi.StringOutput)
}

// Defines when the automatic maintenance should be performed for the database cluster.
func (o LookupDatabaseClusterResultOutput) MaintenanceWindows() GetDatabaseClusterMaintenanceWindowArrayOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) []GetDatabaseClusterMaintenanceWindow { return v.MaintenanceWindows }).(GetDatabaseClusterMaintenanceWindowArrayOutput)
}

func (o LookupDatabaseClusterResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) string { return v.Name }).(pulumi.StringOutput)
}

// Number of nodes that will be included in the cluster.
func (o LookupDatabaseClusterResultOutput) NodeCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) int { return v.NodeCount }).(pulumi.IntOutput)
}

// Password for the cluster's default user.
func (o LookupDatabaseClusterResultOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) string { return v.Password }).(pulumi.StringOutput)
}

// Network port that the database cluster is listening on.
func (o LookupDatabaseClusterResultOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) int { return v.Port }).(pulumi.IntOutput)
}

// Same as `host`, but only accessible from resources within the account and in the same region.
func (o LookupDatabaseClusterResultOutput) PrivateHost() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) string { return v.PrivateHost }).(pulumi.StringOutput)
}

// The ID of the VPC where the database cluster is located.
func (o LookupDatabaseClusterResultOutput) PrivateNetworkUuid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) string { return v.PrivateNetworkUuid }).(pulumi.StringOutput)
}

// Same as `uri`, but only accessible from resources within the account and in the same region.
func (o LookupDatabaseClusterResultOutput) PrivateUri() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) string { return v.PrivateUri }).(pulumi.StringOutput)
}

// DigitalOcean region where the cluster will reside.
func (o LookupDatabaseClusterResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) string { return v.Region }).(pulumi.StringOutput)
}

// Database droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`).
func (o LookupDatabaseClusterResultOutput) Size() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) string { return v.Size }).(pulumi.StringOutput)
}

func (o LookupDatabaseClusterResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// The full URI for connecting to the database cluster.
func (o LookupDatabaseClusterResultOutput) Uri() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) string { return v.Uri }).(pulumi.StringOutput)
}

// The uniform resource name of the database cluster.
func (o LookupDatabaseClusterResultOutput) Urn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) string { return v.Urn }).(pulumi.StringOutput)
}

// Username for the cluster's default user.
func (o LookupDatabaseClusterResultOutput) User() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) string { return v.User }).(pulumi.StringOutput)
}

// Engine version used by the cluster (ex. `11` for PostgreSQL 11).
func (o LookupDatabaseClusterResultOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseClusterResult) string { return v.Version }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDatabaseClusterResultOutput{})
}
