// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides access to the available DigitalOcean Kubernetes Service versions.
func GetKubernetesVersions(ctx *pulumi.Context, args *GetKubernetesVersionsArgs, opts ...pulumi.InvokeOption) (*GetKubernetesVersionsResult, error) {
	var rv GetKubernetesVersionsResult
	err := ctx.Invoke("digitalocean:index/getKubernetesVersions:getKubernetesVersions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKubernetesVersions.
type GetKubernetesVersionsArgs struct {
	VersionPrefix *string `pulumi:"versionPrefix"`
}

// A collection of values returned by getKubernetesVersions.
type GetKubernetesVersionsResult struct {
	// id is the provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The most recent version available.
	LatestVersion string `pulumi:"latestVersion"`
	// A list of available versions.
	ValidVersions []string `pulumi:"validVersions"`
	VersionPrefix *string  `pulumi:"versionPrefix"`
}
