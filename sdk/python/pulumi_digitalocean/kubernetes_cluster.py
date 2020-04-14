# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class KubernetesCluster(pulumi.CustomResource):
    cluster_subnet: pulumi.Output[str]
    """
    The range of IP addresses in the overlay network of the Kubernetes cluster.
    """
    created_at: pulumi.Output[str]
    """
    The date and time when the Kubernetes cluster was created.
    """
    endpoint: pulumi.Output[str]
    """
    The base URL of the API server on the Kubernetes master node.
    """
    ipv4_address: pulumi.Output[str]
    """
    The public IPv4 address of the Kubernetes master node.
    """
    kube_configs: pulumi.Output[list]
    name: pulumi.Output[str]
    """
    A name for the Kubernetes cluster.
    """
    node_pool: pulumi.Output[dict]
    """
    A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `.KubernetesNodePool` resource. The following arguments may be specified:
    - `name` - (Required) A name for the node pool.
    - `size` - (Required) The slug identifier for the type of Droplet to be used as workers in the node pool.
    - `node_count` - (Optional) The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
    - `auto_scale` - (Optional) Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
    - `min_nodes` - (Optional) If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
    - `max_nodes` - (Optional) If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
    - `tags` - (Optional) A list of tag names to be applied to the Kubernetes cluster.
    - `labels` - (Optional) A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).

      * `actual_node_count` (`float`)
      * `auto_scale` (`bool`)
      * `id` (`str`) - A unique ID that can be used to identify and reference a Kubernetes cluster.
      * `labels` (`dict`)
      * `max_nodes` (`float`)
      * `min_nodes` (`float`)
      * `name` (`str`) - A name for the Kubernetes cluster.
      * `node_count` (`float`)
      * `nodes` (`list`)
        * `created_at` (`str`) - The date and time when the Kubernetes cluster was created.
        * `droplet_id` (`str`)
        * `id` (`str`) - A unique ID that can be used to identify and reference a Kubernetes cluster.
        * `name` (`str`) - A name for the Kubernetes cluster.
        * `status` (`str`) - A string indicating the current status of the cluster. Potential values include running, provisioning, and errored.
        * `updated_at` (`str`) - The date and time when the Kubernetes cluster was last updated.
          * `kube_config.0` - A representation of the Kubernetes cluster's kubeconfig with the following attributes:
          - `raw_config` - The full contents of the Kubernetes cluster's kubeconfig file.
          - `host` - The URL of the API server on the Kubernetes master node.
          - `cluster_ca_certificate` - The base64 encoded public certificate for the cluster's certificate authority.
          - `token` - The DigitalOcean API access token used by clients to access the cluster.
          - `client_key` - The base64 encoded private key used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
          - `client_certificate` - The base64 encoded public certificate used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
          - `expires_at` - The date and time when the credentials will expire and need to be regenerated.

      * `size` (`str`)
      * `tags` (`list`) - A list of tag names to be applied to the Kubernetes cluster.
    """
    region: pulumi.Output[str]
    """
    The slug identifier for the region where the Kubernetes cluster will be created.
    """
    service_subnet: pulumi.Output[str]
    """
    The range of assignable IP addresses for services running in the Kubernetes cluster.
    """
    status: pulumi.Output[str]
    """
    A string indicating the current status of the cluster. Potential values include running, provisioning, and errored.
    """
    tags: pulumi.Output[list]
    """
    A list of tag names to be applied to the Kubernetes cluster.
    """
    updated_at: pulumi.Output[str]
    """
    The date and time when the Kubernetes cluster was last updated.
    * `kube_config.0` - A representation of the Kubernetes cluster's kubeconfig with the following attributes:
    - `raw_config` - The full contents of the Kubernetes cluster's kubeconfig file.
    - `host` - The URL of the API server on the Kubernetes master node.
    - `cluster_ca_certificate` - The base64 encoded public certificate for the cluster's certificate authority.
    - `token` - The DigitalOcean API access token used by clients to access the cluster.
    - `client_key` - The base64 encoded private key used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
    - `client_certificate` - The base64 encoded public certificate used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
    - `expires_at` - The date and time when the credentials will expire and need to be regenerated.
    """
    version: pulumi.Output[str]
    """
    The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
    """
    def __init__(__self__, resource_name, opts=None, name=None, node_pool=None, region=None, tags=None, version=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a DigitalOcean Kubernetes cluster resource. This can be used to create, delete, and modify clusters. For more information see the [official documentation](https://www.digitalocean.com/docs/kubernetes/).



        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: A name for the Kubernetes cluster.
        :param pulumi.Input[dict] node_pool: A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `.KubernetesNodePool` resource. The following arguments may be specified:
               - `name` - (Required) A name for the node pool.
               - `size` - (Required) The slug identifier for the type of Droplet to be used as workers in the node pool.
               - `node_count` - (Optional) The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
               - `auto_scale` - (Optional) Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
               - `min_nodes` - (Optional) If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
               - `max_nodes` - (Optional) If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
               - `tags` - (Optional) A list of tag names to be applied to the Kubernetes cluster.
               - `labels` - (Optional) A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
        :param pulumi.Input[str] region: The slug identifier for the region where the Kubernetes cluster will be created.
        :param pulumi.Input[list] tags: A list of tag names to be applied to the Kubernetes cluster.
        :param pulumi.Input[str] version: The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)

        The **node_pool** object supports the following:

          * `actual_node_count` (`pulumi.Input[float]`)
          * `auto_scale` (`pulumi.Input[bool]`)
          * `id` (`pulumi.Input[str]`) - A unique ID that can be used to identify and reference a Kubernetes cluster.
          * `labels` (`pulumi.Input[dict]`)
          * `max_nodes` (`pulumi.Input[float]`)
          * `min_nodes` (`pulumi.Input[float]`)
          * `name` (`pulumi.Input[str]`) - A name for the Kubernetes cluster.
          * `node_count` (`pulumi.Input[float]`)
          * `nodes` (`pulumi.Input[list]`)
            * `created_at` (`pulumi.Input[str]`) - The date and time when the Kubernetes cluster was created.
            * `droplet_id` (`pulumi.Input[str]`)
            * `id` (`pulumi.Input[str]`) - A unique ID that can be used to identify and reference a Kubernetes cluster.
            * `name` (`pulumi.Input[str]`) - A name for the Kubernetes cluster.
            * `status` (`pulumi.Input[str]`) - A string indicating the current status of the cluster. Potential values include running, provisioning, and errored.
            * `updated_at` (`pulumi.Input[str]`) - The date and time when the Kubernetes cluster was last updated.
              * `kube_config.0` - A representation of the Kubernetes cluster's kubeconfig with the following attributes:
              - `raw_config` - The full contents of the Kubernetes cluster's kubeconfig file.
              - `host` - The URL of the API server on the Kubernetes master node.
              - `cluster_ca_certificate` - The base64 encoded public certificate for the cluster's certificate authority.
              - `token` - The DigitalOcean API access token used by clients to access the cluster.
              - `client_key` - The base64 encoded private key used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
              - `client_certificate` - The base64 encoded public certificate used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
              - `expires_at` - The date and time when the credentials will expire and need to be regenerated.

          * `size` (`pulumi.Input[str]`)
          * `tags` (`pulumi.Input[list]`) - A list of tag names to be applied to the Kubernetes cluster.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['name'] = name
            if node_pool is None:
                raise TypeError("Missing required property 'node_pool'")
            __props__['node_pool'] = node_pool
            if region is None:
                raise TypeError("Missing required property 'region'")
            __props__['region'] = region
            __props__['tags'] = tags
            if version is None:
                raise TypeError("Missing required property 'version'")
            __props__['version'] = version
            __props__['cluster_subnet'] = None
            __props__['created_at'] = None
            __props__['endpoint'] = None
            __props__['ipv4_address'] = None
            __props__['kube_configs'] = None
            __props__['service_subnet'] = None
            __props__['status'] = None
            __props__['updated_at'] = None
        super(KubernetesCluster, __self__).__init__(
            'digitalocean:index/kubernetesCluster:KubernetesCluster',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, cluster_subnet=None, created_at=None, endpoint=None, ipv4_address=None, kube_configs=None, name=None, node_pool=None, region=None, service_subnet=None, status=None, tags=None, updated_at=None, version=None):
        """
        Get an existing KubernetesCluster resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_subnet: The range of IP addresses in the overlay network of the Kubernetes cluster.
        :param pulumi.Input[str] created_at: The date and time when the Kubernetes cluster was created.
        :param pulumi.Input[str] endpoint: The base URL of the API server on the Kubernetes master node.
        :param pulumi.Input[str] ipv4_address: The public IPv4 address of the Kubernetes master node.
        :param pulumi.Input[str] name: A name for the Kubernetes cluster.
        :param pulumi.Input[dict] node_pool: A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `.KubernetesNodePool` resource. The following arguments may be specified:
               - `name` - (Required) A name for the node pool.
               - `size` - (Required) The slug identifier for the type of Droplet to be used as workers in the node pool.
               - `node_count` - (Optional) The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
               - `auto_scale` - (Optional) Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
               - `min_nodes` - (Optional) If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
               - `max_nodes` - (Optional) If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
               - `tags` - (Optional) A list of tag names to be applied to the Kubernetes cluster.
               - `labels` - (Optional) A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
        :param pulumi.Input[str] region: The slug identifier for the region where the Kubernetes cluster will be created.
        :param pulumi.Input[str] service_subnet: The range of assignable IP addresses for services running in the Kubernetes cluster.
        :param pulumi.Input[str] status: A string indicating the current status of the cluster. Potential values include running, provisioning, and errored.
        :param pulumi.Input[list] tags: A list of tag names to be applied to the Kubernetes cluster.
        :param pulumi.Input[str] updated_at: The date and time when the Kubernetes cluster was last updated.
               * `kube_config.0` - A representation of the Kubernetes cluster's kubeconfig with the following attributes:
               - `raw_config` - The full contents of the Kubernetes cluster's kubeconfig file.
               - `host` - The URL of the API server on the Kubernetes master node.
               - `cluster_ca_certificate` - The base64 encoded public certificate for the cluster's certificate authority.
               - `token` - The DigitalOcean API access token used by clients to access the cluster.
               - `client_key` - The base64 encoded private key used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
               - `client_certificate` - The base64 encoded public certificate used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
               - `expires_at` - The date and time when the credentials will expire and need to be regenerated.
        :param pulumi.Input[str] version: The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)

        The **kube_configs** object supports the following:

          * `clientCertificate` (`pulumi.Input[str]`)
          * `clientKey` (`pulumi.Input[str]`)
          * `clusterCaCertificate` (`pulumi.Input[str]`)
          * `expiresAt` (`pulumi.Input[str]`)
          * `host` (`pulumi.Input[str]`)
          * `rawConfig` (`pulumi.Input[str]`)
          * `token` (`pulumi.Input[str]`)

        The **node_pool** object supports the following:

          * `actual_node_count` (`pulumi.Input[float]`)
          * `auto_scale` (`pulumi.Input[bool]`)
          * `id` (`pulumi.Input[str]`) - A unique ID that can be used to identify and reference a Kubernetes cluster.
          * `labels` (`pulumi.Input[dict]`)
          * `max_nodes` (`pulumi.Input[float]`)
          * `min_nodes` (`pulumi.Input[float]`)
          * `name` (`pulumi.Input[str]`) - A name for the Kubernetes cluster.
          * `node_count` (`pulumi.Input[float]`)
          * `nodes` (`pulumi.Input[list]`)
            * `created_at` (`pulumi.Input[str]`) - The date and time when the Kubernetes cluster was created.
            * `droplet_id` (`pulumi.Input[str]`)
            * `id` (`pulumi.Input[str]`) - A unique ID that can be used to identify and reference a Kubernetes cluster.
            * `name` (`pulumi.Input[str]`) - A name for the Kubernetes cluster.
            * `status` (`pulumi.Input[str]`) - A string indicating the current status of the cluster. Potential values include running, provisioning, and errored.
            * `updated_at` (`pulumi.Input[str]`) - The date and time when the Kubernetes cluster was last updated.
              * `kube_config.0` - A representation of the Kubernetes cluster's kubeconfig with the following attributes:
              - `raw_config` - The full contents of the Kubernetes cluster's kubeconfig file.
              - `host` - The URL of the API server on the Kubernetes master node.
              - `cluster_ca_certificate` - The base64 encoded public certificate for the cluster's certificate authority.
              - `token` - The DigitalOcean API access token used by clients to access the cluster.
              - `client_key` - The base64 encoded private key used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
              - `client_certificate` - The base64 encoded public certificate used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
              - `expires_at` - The date and time when the credentials will expire and need to be regenerated.

          * `size` (`pulumi.Input[str]`)
          * `tags` (`pulumi.Input[list]`) - A list of tag names to be applied to the Kubernetes cluster.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["cluster_subnet"] = cluster_subnet
        __props__["created_at"] = created_at
        __props__["endpoint"] = endpoint
        __props__["ipv4_address"] = ipv4_address
        __props__["kube_configs"] = kube_configs
        __props__["name"] = name
        __props__["node_pool"] = node_pool
        __props__["region"] = region
        __props__["service_subnet"] = service_subnet
        __props__["status"] = status
        __props__["tags"] = tags
        __props__["updated_at"] = updated_at
        __props__["version"] = version
        return KubernetesCluster(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

