// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package digitalocean

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a DigitalOcean SSH key resource to allow you to manage SSH
// keys for Droplet access. Keys created with this resource
// can be referenced in your Droplet configuration via their ID or
// fingerprint.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/r/ssh_key.html.markdown.
type SshKey struct {
	pulumi.CustomResourceState

	// The fingerprint of the SSH key
	Fingerprint pulumi.StringOutput `pulumi:"fingerprint"`
	// The name of the SSH key for identification
	Name pulumi.StringOutput `pulumi:"name"`
	// The public key. If this is a file, it
	// can be read using the file interpolation function
	PublicKey pulumi.StringOutput `pulumi:"publicKey"`
}

// NewSshKey registers a new resource with the given unique name, arguments, and options.
func NewSshKey(ctx *pulumi.Context,
	name string, args *SshKeyArgs, opts ...pulumi.ResourceOption) (*SshKey, error) {
	if args == nil || args.PublicKey == nil {
		return nil, errors.New("missing required argument 'PublicKey'")
	}
	if args == nil {
		args = &SshKeyArgs{}
	}
	var resource SshKey
	err := ctx.RegisterResource("digitalocean:index/sshKey:SshKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSshKey gets an existing SshKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSshKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SshKeyState, opts ...pulumi.ResourceOption) (*SshKey, error) {
	var resource SshKey
	err := ctx.ReadResource("digitalocean:index/sshKey:SshKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SshKey resources.
type sshKeyState struct {
	// The fingerprint of the SSH key
	Fingerprint *string `pulumi:"fingerprint"`
	// The name of the SSH key for identification
	Name *string `pulumi:"name"`
	// The public key. If this is a file, it
	// can be read using the file interpolation function
	PublicKey *string `pulumi:"publicKey"`
}

type SshKeyState struct {
	// The fingerprint of the SSH key
	Fingerprint pulumi.StringPtrInput
	// The name of the SSH key for identification
	Name pulumi.StringPtrInput
	// The public key. If this is a file, it
	// can be read using the file interpolation function
	PublicKey pulumi.StringPtrInput
}

func (SshKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*sshKeyState)(nil)).Elem()
}

type sshKeyArgs struct {
	// The name of the SSH key for identification
	Name *string `pulumi:"name"`
	// The public key. If this is a file, it
	// can be read using the file interpolation function
	PublicKey string `pulumi:"publicKey"`
}

// The set of arguments for constructing a SshKey resource.
type SshKeyArgs struct {
	// The name of the SSH key for identification
	Name pulumi.StringPtrInput
	// The public key. If this is a file, it
	// can be read using the file interpolation function
	PublicKey pulumi.StringInput
}

func (SshKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sshKeyArgs)(nil)).Elem()
}
