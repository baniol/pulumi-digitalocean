// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides access to the available DigitalOcean Kubernetes Service versions.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/d/kubernetes_versions.html.markdown.
func LookupKubernetesVersions(ctx *pulumi.Context, args *GetKubernetesVersionsArgs) (*GetKubernetesVersionsResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["versionPrefix"] = args.VersionPrefix
	}
	outputs, err := ctx.Invoke("digitalocean:index/getKubernetesVersions:getKubernetesVersions", inputs)
	if err != nil {
		return nil, err
	}
	return &GetKubernetesVersionsResult{
		LatestVersion: outputs["latestVersion"],
		ValidVersions: outputs["validVersions"],
		VersionPrefix: outputs["versionPrefix"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getKubernetesVersions.
type GetKubernetesVersionsArgs struct {
	VersionPrefix interface{}
}

// A collection of values returned by getKubernetesVersions.
type GetKubernetesVersionsResult struct {
	// The most recent version available.
	LatestVersion interface{}
	// A list of available versions.
	ValidVersions interface{}
	VersionPrefix interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}
