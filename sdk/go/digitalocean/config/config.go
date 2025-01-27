// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

// The URL to use for the DigitalOcean API.
func GetApiEndpoint(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "digitalocean:apiEndpoint")
	if err == nil {
		return v
	}
	return getEnvOrDefault("https://api.digitalocean.com", nil, "DIGITALOCEAN_API_URL").(string)
}

// The access key ID for Spaces API operations.
func GetSpacesAccessId(ctx *pulumi.Context) string {
	return config.Get(ctx, "digitalocean:spacesAccessId")
}

// The URL to use for the DigitalOcean Spaces API.
func GetSpacesEndpoint(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "digitalocean:spacesEndpoint")
	if err == nil {
		return v
	}
	return getEnvOrDefault("", nil, "SPACES_ENDPOINT_URL").(string)
}

// The secret access key for Spaces API operations.
func GetSpacesSecretKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "digitalocean:spacesSecretKey")
}

// The token key for API operations.
func GetToken(ctx *pulumi.Context) string {
	return config.Get(ctx, "digitalocean:token")
}
