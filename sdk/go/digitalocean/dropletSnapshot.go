// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource which can be used to create a snapshot from an existing DigitalOcean Droplet.
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
//			web, err := digitalocean.NewDroplet(ctx, "web", &digitalocean.DropletArgs{
//				Size:   pulumi.String("s-1vcpu-1gb"),
//				Image:  pulumi.String("ubuntu-22-04-x64"),
//				Region: pulumi.String("nyc3"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = digitalocean.NewDropletSnapshot(ctx, "web-snapshot", &digitalocean.DropletSnapshotArgs{
//				DropletId: web.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = digitalocean.NewDroplet(ctx, "from-snapshot", &digitalocean.DropletArgs{
//				Image:  web_snapshot.ID(),
//				Region: pulumi.String("nyc3"),
//				Size:   pulumi.String("s-2vcpu-4gb"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Droplet Snapshots can be imported using the `snapshot id`, e.g.
//
// ```sh
//
//	$ pulumi import digitalocean:index/dropletSnapshot:DropletSnapshot mysnapshot 123456
//
// ```
type DropletSnapshot struct {
	pulumi.CustomResourceState

	// The date and time the Droplet snapshot was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// The ID of the Droplet from which the snapshot will be taken.
	DropletId pulumi.StringOutput `pulumi:"dropletId"`
	// The minimum size in gigabytes required for a Droplet to be created based on this snapshot.
	MinDiskSize pulumi.IntOutput `pulumi:"minDiskSize"`
	// A name for the Droplet snapshot.
	Name pulumi.StringOutput `pulumi:"name"`
	// A list of DigitalOcean region "slugs" indicating where the droplet snapshot is available.
	Regions pulumi.StringArrayOutput `pulumi:"regions"`
	// The billable size of the Droplet snapshot in gigabytes.
	Size pulumi.Float64Output `pulumi:"size"`
}

// NewDropletSnapshot registers a new resource with the given unique name, arguments, and options.
func NewDropletSnapshot(ctx *pulumi.Context,
	name string, args *DropletSnapshotArgs, opts ...pulumi.ResourceOption) (*DropletSnapshot, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DropletId == nil {
		return nil, errors.New("invalid value for required argument 'DropletId'")
	}
	var resource DropletSnapshot
	err := ctx.RegisterResource("digitalocean:index/dropletSnapshot:DropletSnapshot", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDropletSnapshot gets an existing DropletSnapshot resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDropletSnapshot(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DropletSnapshotState, opts ...pulumi.ResourceOption) (*DropletSnapshot, error) {
	var resource DropletSnapshot
	err := ctx.ReadResource("digitalocean:index/dropletSnapshot:DropletSnapshot", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DropletSnapshot resources.
type dropletSnapshotState struct {
	// The date and time the Droplet snapshot was created.
	CreatedAt *string `pulumi:"createdAt"`
	// The ID of the Droplet from which the snapshot will be taken.
	DropletId *string `pulumi:"dropletId"`
	// The minimum size in gigabytes required for a Droplet to be created based on this snapshot.
	MinDiskSize *int `pulumi:"minDiskSize"`
	// A name for the Droplet snapshot.
	Name *string `pulumi:"name"`
	// A list of DigitalOcean region "slugs" indicating where the droplet snapshot is available.
	Regions []string `pulumi:"regions"`
	// The billable size of the Droplet snapshot in gigabytes.
	Size *float64 `pulumi:"size"`
}

type DropletSnapshotState struct {
	// The date and time the Droplet snapshot was created.
	CreatedAt pulumi.StringPtrInput
	// The ID of the Droplet from which the snapshot will be taken.
	DropletId pulumi.StringPtrInput
	// The minimum size in gigabytes required for a Droplet to be created based on this snapshot.
	MinDiskSize pulumi.IntPtrInput
	// A name for the Droplet snapshot.
	Name pulumi.StringPtrInput
	// A list of DigitalOcean region "slugs" indicating where the droplet snapshot is available.
	Regions pulumi.StringArrayInput
	// The billable size of the Droplet snapshot in gigabytes.
	Size pulumi.Float64PtrInput
}

func (DropletSnapshotState) ElementType() reflect.Type {
	return reflect.TypeOf((*dropletSnapshotState)(nil)).Elem()
}

type dropletSnapshotArgs struct {
	// The ID of the Droplet from which the snapshot will be taken.
	DropletId string `pulumi:"dropletId"`
	// A name for the Droplet snapshot.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a DropletSnapshot resource.
type DropletSnapshotArgs struct {
	// The ID of the Droplet from which the snapshot will be taken.
	DropletId pulumi.StringInput
	// A name for the Droplet snapshot.
	Name pulumi.StringPtrInput
}

func (DropletSnapshotArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dropletSnapshotArgs)(nil)).Elem()
}

type DropletSnapshotInput interface {
	pulumi.Input

	ToDropletSnapshotOutput() DropletSnapshotOutput
	ToDropletSnapshotOutputWithContext(ctx context.Context) DropletSnapshotOutput
}

func (*DropletSnapshot) ElementType() reflect.Type {
	return reflect.TypeOf((**DropletSnapshot)(nil)).Elem()
}

func (i *DropletSnapshot) ToDropletSnapshotOutput() DropletSnapshotOutput {
	return i.ToDropletSnapshotOutputWithContext(context.Background())
}

func (i *DropletSnapshot) ToDropletSnapshotOutputWithContext(ctx context.Context) DropletSnapshotOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DropletSnapshotOutput)
}

// DropletSnapshotArrayInput is an input type that accepts DropletSnapshotArray and DropletSnapshotArrayOutput values.
// You can construct a concrete instance of `DropletSnapshotArrayInput` via:
//
//	DropletSnapshotArray{ DropletSnapshotArgs{...} }
type DropletSnapshotArrayInput interface {
	pulumi.Input

	ToDropletSnapshotArrayOutput() DropletSnapshotArrayOutput
	ToDropletSnapshotArrayOutputWithContext(context.Context) DropletSnapshotArrayOutput
}

type DropletSnapshotArray []DropletSnapshotInput

func (DropletSnapshotArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DropletSnapshot)(nil)).Elem()
}

func (i DropletSnapshotArray) ToDropletSnapshotArrayOutput() DropletSnapshotArrayOutput {
	return i.ToDropletSnapshotArrayOutputWithContext(context.Background())
}

func (i DropletSnapshotArray) ToDropletSnapshotArrayOutputWithContext(ctx context.Context) DropletSnapshotArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DropletSnapshotArrayOutput)
}

// DropletSnapshotMapInput is an input type that accepts DropletSnapshotMap and DropletSnapshotMapOutput values.
// You can construct a concrete instance of `DropletSnapshotMapInput` via:
//
//	DropletSnapshotMap{ "key": DropletSnapshotArgs{...} }
type DropletSnapshotMapInput interface {
	pulumi.Input

	ToDropletSnapshotMapOutput() DropletSnapshotMapOutput
	ToDropletSnapshotMapOutputWithContext(context.Context) DropletSnapshotMapOutput
}

type DropletSnapshotMap map[string]DropletSnapshotInput

func (DropletSnapshotMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DropletSnapshot)(nil)).Elem()
}

func (i DropletSnapshotMap) ToDropletSnapshotMapOutput() DropletSnapshotMapOutput {
	return i.ToDropletSnapshotMapOutputWithContext(context.Background())
}

func (i DropletSnapshotMap) ToDropletSnapshotMapOutputWithContext(ctx context.Context) DropletSnapshotMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DropletSnapshotMapOutput)
}

type DropletSnapshotOutput struct{ *pulumi.OutputState }

func (DropletSnapshotOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DropletSnapshot)(nil)).Elem()
}

func (o DropletSnapshotOutput) ToDropletSnapshotOutput() DropletSnapshotOutput {
	return o
}

func (o DropletSnapshotOutput) ToDropletSnapshotOutputWithContext(ctx context.Context) DropletSnapshotOutput {
	return o
}

// The date and time the Droplet snapshot was created.
func (o DropletSnapshotOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *DropletSnapshot) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// The ID of the Droplet from which the snapshot will be taken.
func (o DropletSnapshotOutput) DropletId() pulumi.StringOutput {
	return o.ApplyT(func(v *DropletSnapshot) pulumi.StringOutput { return v.DropletId }).(pulumi.StringOutput)
}

// The minimum size in gigabytes required for a Droplet to be created based on this snapshot.
func (o DropletSnapshotOutput) MinDiskSize() pulumi.IntOutput {
	return o.ApplyT(func(v *DropletSnapshot) pulumi.IntOutput { return v.MinDiskSize }).(pulumi.IntOutput)
}

// A name for the Droplet snapshot.
func (o DropletSnapshotOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DropletSnapshot) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A list of DigitalOcean region "slugs" indicating where the droplet snapshot is available.
func (o DropletSnapshotOutput) Regions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DropletSnapshot) pulumi.StringArrayOutput { return v.Regions }).(pulumi.StringArrayOutput)
}

// The billable size of the Droplet snapshot in gigabytes.
func (o DropletSnapshotOutput) Size() pulumi.Float64Output {
	return o.ApplyT(func(v *DropletSnapshot) pulumi.Float64Output { return v.Size }).(pulumi.Float64Output)
}

type DropletSnapshotArrayOutput struct{ *pulumi.OutputState }

func (DropletSnapshotArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DropletSnapshot)(nil)).Elem()
}

func (o DropletSnapshotArrayOutput) ToDropletSnapshotArrayOutput() DropletSnapshotArrayOutput {
	return o
}

func (o DropletSnapshotArrayOutput) ToDropletSnapshotArrayOutputWithContext(ctx context.Context) DropletSnapshotArrayOutput {
	return o
}

func (o DropletSnapshotArrayOutput) Index(i pulumi.IntInput) DropletSnapshotOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DropletSnapshot {
		return vs[0].([]*DropletSnapshot)[vs[1].(int)]
	}).(DropletSnapshotOutput)
}

type DropletSnapshotMapOutput struct{ *pulumi.OutputState }

func (DropletSnapshotMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DropletSnapshot)(nil)).Elem()
}

func (o DropletSnapshotMapOutput) ToDropletSnapshotMapOutput() DropletSnapshotMapOutput {
	return o
}

func (o DropletSnapshotMapOutput) ToDropletSnapshotMapOutputWithContext(ctx context.Context) DropletSnapshotMapOutput {
	return o
}

func (o DropletSnapshotMapOutput) MapIndex(k pulumi.StringInput) DropletSnapshotOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DropletSnapshot {
		return vs[0].(map[string]*DropletSnapshot)[vs[1].(string)]
	}).(DropletSnapshotOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DropletSnapshotInput)(nil)).Elem(), &DropletSnapshot{})
	pulumi.RegisterInputType(reflect.TypeOf((*DropletSnapshotArrayInput)(nil)).Elem(), DropletSnapshotArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DropletSnapshotMapInput)(nil)).Elem(), DropletSnapshotMap{})
	pulumi.RegisterOutputType(DropletSnapshotOutput{})
	pulumi.RegisterOutputType(DropletSnapshotArrayOutput{})
	pulumi.RegisterOutputType(DropletSnapshotMapOutput{})
}
