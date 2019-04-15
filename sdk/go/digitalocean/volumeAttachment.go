// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Manages attaching a Volume to a Droplet.
// 
// > **NOTE:** Volumes can be attached either directly on the `digitalocean_droplet` resource, or using the `digitalocean_volume_attachment` resource - but the two cannot be used together. If both are used against the same Droplet, the volume attachments will constantly drift.
type VolumeAttachment struct {
	s *pulumi.ResourceState
}

// NewVolumeAttachment registers a new resource with the given unique name, arguments, and options.
func NewVolumeAttachment(ctx *pulumi.Context,
	name string, args *VolumeAttachmentArgs, opts ...pulumi.ResourceOpt) (*VolumeAttachment, error) {
	if args == nil || args.DropletId == nil {
		return nil, errors.New("missing required argument 'DropletId'")
	}
	if args == nil || args.VolumeId == nil {
		return nil, errors.New("missing required argument 'VolumeId'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["dropletId"] = nil
		inputs["volumeId"] = nil
	} else {
		inputs["dropletId"] = args.DropletId
		inputs["volumeId"] = args.VolumeId
	}
	s, err := ctx.RegisterResource("digitalocean:index/volumeAttachment:VolumeAttachment", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &VolumeAttachment{s: s}, nil
}

// GetVolumeAttachment gets an existing VolumeAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVolumeAttachment(ctx *pulumi.Context,
	name string, id pulumi.ID, state *VolumeAttachmentState, opts ...pulumi.ResourceOpt) (*VolumeAttachment, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["dropletId"] = state.DropletId
		inputs["volumeId"] = state.VolumeId
	}
	s, err := ctx.ReadResource("digitalocean:index/volumeAttachment:VolumeAttachment", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &VolumeAttachment{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *VolumeAttachment) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *VolumeAttachment) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// ID of the Droplet to attach the volume to.
func (r *VolumeAttachment) DropletId() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["dropletId"])
}

// ID of the Volume to be attached to the Droplet.
func (r *VolumeAttachment) VolumeId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["volumeId"])
}

// Input properties used for looking up and filtering VolumeAttachment resources.
type VolumeAttachmentState struct {
	// ID of the Droplet to attach the volume to.
	DropletId interface{}
	// ID of the Volume to be attached to the Droplet.
	VolumeId interface{}
}

// The set of arguments for constructing a VolumeAttachment resource.
type VolumeAttachmentArgs struct {
	// ID of the Droplet to attach the volume to.
	DropletId interface{}
	// ID of the Volume to be attached to the Droplet.
	VolumeId interface{}
}
