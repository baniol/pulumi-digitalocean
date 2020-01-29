// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package digitalocean

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a DigitalOcean Kubernetes cluster resource. This can be used to create, delete, and modify clusters. For more information see the [official documentation](https://www.digitalocean.com/docs/kubernetes/).
// 
// > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/r/kubernetes_cluster.html.markdown.
type KubernetesCluster struct {
	pulumi.CustomResourceState

	// The range of IP addresses in the overlay network of the Kubernetes cluster.
	ClusterSubnet pulumi.StringOutput `pulumi:"clusterSubnet"`
	// The date and time when the Kubernetes cluster was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// The base URL of the API server on the Kubernetes master node.
	Endpoint pulumi.StringOutput `pulumi:"endpoint"`
	// The public IPv4 address of the Kubernetes master node.
	Ipv4Address pulumi.StringOutput `pulumi:"ipv4Address"`
	KubeConfigs KubernetesClusterKubeConfigArrayOutput `pulumi:"kubeConfigs"`
	// A name for the Kubernetes cluster.
	Name pulumi.StringOutput `pulumi:"name"`
	// A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `.KubernetesNodePool` resource. The following arguments may be specified:
	// - `name` - (Required) A name for the node pool.
	// - `size` - (Required) The slug identifier for the type of Droplet to be used as workers in the node pool.
	// - `nodeCount` - (Optional) The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
	// - `autoScale` - (Optional) Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
	// - `minNodes` - (Optional) If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
	// - `maxNodes` - (Optional) If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
	// - `tags` - (Optional) A list of tag names to be applied to the Kubernetes cluster.
	NodePool KubernetesClusterNodePoolOutput `pulumi:"nodePool"`
	// The slug identifier for the region where the Kubernetes cluster will be created.
	Region pulumi.StringOutput `pulumi:"region"`
	// The range of assignable IP addresses for services running in the Kubernetes cluster.
	ServiceSubnet pulumi.StringOutput `pulumi:"serviceSubnet"`
	// A string indicating the current status of the cluster. Potential values include running, provisioning, and errored.
	Status pulumi.StringOutput `pulumi:"status"`
	// A list of tag names to be applied to the Kubernetes cluster.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// The date and time when the Kubernetes cluster was last updated.
	// * `kube_config.0` - A representation of the Kubernetes cluster's kubeconfig with the following attributes:
	// - `rawConfig` - The full contents of the Kubernetes cluster's kubeconfig file.
	// - `host` - The URL of the API server on the Kubernetes master node.
	// - `clusterCaCertificate` - The base64 encoded public certificate for the cluster's certificate authority.
	// - `token` - The DigitalOcean API access token used by clients to access the cluster.
	// - `clientKey` - The base64 encoded private key used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
	// - `clientCertificate` - The base64 encoded public certificate used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
	// - `expiresAt` - The date and time when the credentials will expire and need to be regenerated.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
	// The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
	Version pulumi.StringOutput `pulumi:"version"`
}

// NewKubernetesCluster registers a new resource with the given unique name, arguments, and options.
func NewKubernetesCluster(ctx *pulumi.Context,
	name string, args *KubernetesClusterArgs, opts ...pulumi.ResourceOption) (*KubernetesCluster, error) {
	if args == nil || args.NodePool == nil {
		return nil, errors.New("missing required argument 'NodePool'")
	}
	if args == nil || args.Region == nil {
		return nil, errors.New("missing required argument 'Region'")
	}
	if args == nil || args.Version == nil {
		return nil, errors.New("missing required argument 'Version'")
	}
	if args == nil {
		args = &KubernetesClusterArgs{}
	}
	var resource KubernetesCluster
	err := ctx.RegisterResource("digitalocean:index/kubernetesCluster:KubernetesCluster", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKubernetesCluster gets an existing KubernetesCluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKubernetesCluster(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KubernetesClusterState, opts ...pulumi.ResourceOption) (*KubernetesCluster, error) {
	var resource KubernetesCluster
	err := ctx.ReadResource("digitalocean:index/kubernetesCluster:KubernetesCluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KubernetesCluster resources.
type kubernetesClusterState struct {
	// The range of IP addresses in the overlay network of the Kubernetes cluster.
	ClusterSubnet *string `pulumi:"clusterSubnet"`
	// The date and time when the Kubernetes cluster was created.
	CreatedAt *string `pulumi:"createdAt"`
	// The base URL of the API server on the Kubernetes master node.
	Endpoint *string `pulumi:"endpoint"`
	// The public IPv4 address of the Kubernetes master node.
	Ipv4Address *string `pulumi:"ipv4Address"`
	KubeConfigs []KubernetesClusterKubeConfig `pulumi:"kubeConfigs"`
	// A name for the Kubernetes cluster.
	Name *string `pulumi:"name"`
	// A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `.KubernetesNodePool` resource. The following arguments may be specified:
	// - `name` - (Required) A name for the node pool.
	// - `size` - (Required) The slug identifier for the type of Droplet to be used as workers in the node pool.
	// - `nodeCount` - (Optional) The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
	// - `autoScale` - (Optional) Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
	// - `minNodes` - (Optional) If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
	// - `maxNodes` - (Optional) If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
	// - `tags` - (Optional) A list of tag names to be applied to the Kubernetes cluster.
	NodePool *KubernetesClusterNodePool `pulumi:"nodePool"`
	// The slug identifier for the region where the Kubernetes cluster will be created.
	Region *string `pulumi:"region"`
	// The range of assignable IP addresses for services running in the Kubernetes cluster.
	ServiceSubnet *string `pulumi:"serviceSubnet"`
	// A string indicating the current status of the cluster. Potential values include running, provisioning, and errored.
	Status *string `pulumi:"status"`
	// A list of tag names to be applied to the Kubernetes cluster.
	Tags []string `pulumi:"tags"`
	// The date and time when the Kubernetes cluster was last updated.
	// * `kube_config.0` - A representation of the Kubernetes cluster's kubeconfig with the following attributes:
	// - `rawConfig` - The full contents of the Kubernetes cluster's kubeconfig file.
	// - `host` - The URL of the API server on the Kubernetes master node.
	// - `clusterCaCertificate` - The base64 encoded public certificate for the cluster's certificate authority.
	// - `token` - The DigitalOcean API access token used by clients to access the cluster.
	// - `clientKey` - The base64 encoded private key used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
	// - `clientCertificate` - The base64 encoded public certificate used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
	// - `expiresAt` - The date and time when the credentials will expire and need to be regenerated.
	UpdatedAt *string `pulumi:"updatedAt"`
	// The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
	Version *string `pulumi:"version"`
}

type KubernetesClusterState struct {
	// The range of IP addresses in the overlay network of the Kubernetes cluster.
	ClusterSubnet pulumi.StringPtrInput
	// The date and time when the Kubernetes cluster was created.
	CreatedAt pulumi.StringPtrInput
	// The base URL of the API server on the Kubernetes master node.
	Endpoint pulumi.StringPtrInput
	// The public IPv4 address of the Kubernetes master node.
	Ipv4Address pulumi.StringPtrInput
	KubeConfigs KubernetesClusterKubeConfigArrayInput
	// A name for the Kubernetes cluster.
	Name pulumi.StringPtrInput
	// A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `.KubernetesNodePool` resource. The following arguments may be specified:
	// - `name` - (Required) A name for the node pool.
	// - `size` - (Required) The slug identifier for the type of Droplet to be used as workers in the node pool.
	// - `nodeCount` - (Optional) The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
	// - `autoScale` - (Optional) Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
	// - `minNodes` - (Optional) If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
	// - `maxNodes` - (Optional) If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
	// - `tags` - (Optional) A list of tag names to be applied to the Kubernetes cluster.
	NodePool KubernetesClusterNodePoolPtrInput
	// The slug identifier for the region where the Kubernetes cluster will be created.
	Region pulumi.StringPtrInput
	// The range of assignable IP addresses for services running in the Kubernetes cluster.
	ServiceSubnet pulumi.StringPtrInput
	// A string indicating the current status of the cluster. Potential values include running, provisioning, and errored.
	Status pulumi.StringPtrInput
	// A list of tag names to be applied to the Kubernetes cluster.
	Tags pulumi.StringArrayInput
	// The date and time when the Kubernetes cluster was last updated.
	// * `kube_config.0` - A representation of the Kubernetes cluster's kubeconfig with the following attributes:
	// - `rawConfig` - The full contents of the Kubernetes cluster's kubeconfig file.
	// - `host` - The URL of the API server on the Kubernetes master node.
	// - `clusterCaCertificate` - The base64 encoded public certificate for the cluster's certificate authority.
	// - `token` - The DigitalOcean API access token used by clients to access the cluster.
	// - `clientKey` - The base64 encoded private key used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
	// - `clientCertificate` - The base64 encoded public certificate used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
	// - `expiresAt` - The date and time when the credentials will expire and need to be regenerated.
	UpdatedAt pulumi.StringPtrInput
	// The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
	Version pulumi.StringPtrInput
}

func (KubernetesClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*kubernetesClusterState)(nil)).Elem()
}

type kubernetesClusterArgs struct {
	// A name for the Kubernetes cluster.
	Name *string `pulumi:"name"`
	// A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `.KubernetesNodePool` resource. The following arguments may be specified:
	// - `name` - (Required) A name for the node pool.
	// - `size` - (Required) The slug identifier for the type of Droplet to be used as workers in the node pool.
	// - `nodeCount` - (Optional) The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
	// - `autoScale` - (Optional) Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
	// - `minNodes` - (Optional) If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
	// - `maxNodes` - (Optional) If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
	// - `tags` - (Optional) A list of tag names to be applied to the Kubernetes cluster.
	NodePool KubernetesClusterNodePool `pulumi:"nodePool"`
	// The slug identifier for the region where the Kubernetes cluster will be created.
	Region string `pulumi:"region"`
	// A list of tag names to be applied to the Kubernetes cluster.
	Tags []string `pulumi:"tags"`
	// The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
	Version string `pulumi:"version"`
}

// The set of arguments for constructing a KubernetesCluster resource.
type KubernetesClusterArgs struct {
	// A name for the Kubernetes cluster.
	Name pulumi.StringPtrInput
	// A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `.KubernetesNodePool` resource. The following arguments may be specified:
	// - `name` - (Required) A name for the node pool.
	// - `size` - (Required) The slug identifier for the type of Droplet to be used as workers in the node pool.
	// - `nodeCount` - (Optional) The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
	// - `autoScale` - (Optional) Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
	// - `minNodes` - (Optional) If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
	// - `maxNodes` - (Optional) If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
	// - `tags` - (Optional) A list of tag names to be applied to the Kubernetes cluster.
	NodePool KubernetesClusterNodePoolInput
	// The slug identifier for the region where the Kubernetes cluster will be created.
	Region pulumi.StringInput
	// A list of tag names to be applied to the Kubernetes cluster.
	Tags pulumi.StringArrayInput
	// The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
	Version pulumi.StringInput
}

func (KubernetesClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kubernetesClusterArgs)(nil)).Elem()
}

