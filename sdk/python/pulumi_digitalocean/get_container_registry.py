# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetContainerRegistryResult',
    'AwaitableGetContainerRegistryResult',
    'get_container_registry',
    'get_container_registry_output',
]

@pulumi.output_type
class GetContainerRegistryResult:
    """
    A collection of values returned by getContainerRegistry.
    """
    def __init__(__self__, created_at=None, endpoint=None, id=None, name=None, region=None, server_url=None, storage_usage_bytes=None, subscription_tier_slug=None):
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if endpoint and not isinstance(endpoint, str):
            raise TypeError("Expected argument 'endpoint' to be a str")
        pulumi.set(__self__, "endpoint", endpoint)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if server_url and not isinstance(server_url, str):
            raise TypeError("Expected argument 'server_url' to be a str")
        pulumi.set(__self__, "server_url", server_url)
        if storage_usage_bytes and not isinstance(storage_usage_bytes, int):
            raise TypeError("Expected argument 'storage_usage_bytes' to be a int")
        pulumi.set(__self__, "storage_usage_bytes", storage_usage_bytes)
        if subscription_tier_slug and not isinstance(subscription_tier_slug, str):
            raise TypeError("Expected argument 'subscription_tier_slug' to be a str")
        pulumi.set(__self__, "subscription_tier_slug", subscription_tier_slug)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> str:
        """
        The date and time when the registry was created
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def endpoint(self) -> str:
        """
        The URL endpoint of the container registry. Ex: `registry.digitalocean.com/my_registry`
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the container registry
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        The slug identifier for the  region
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="serverUrl")
    def server_url(self) -> str:
        """
        The domain of the container registry. Ex: `registry.digitalocean.com`
        """
        return pulumi.get(self, "server_url")

    @property
    @pulumi.getter(name="storageUsageBytes")
    def storage_usage_bytes(self) -> int:
        """
        The amount of storage used in the registry in bytes.
        """
        return pulumi.get(self, "storage_usage_bytes")

    @property
    @pulumi.getter(name="subscriptionTierSlug")
    def subscription_tier_slug(self) -> str:
        """
        The slug identifier for the subscription tier
        """
        return pulumi.get(self, "subscription_tier_slug")


class AwaitableGetContainerRegistryResult(GetContainerRegistryResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetContainerRegistryResult(
            created_at=self.created_at,
            endpoint=self.endpoint,
            id=self.id,
            name=self.name,
            region=self.region,
            server_url=self.server_url,
            storage_usage_bytes=self.storage_usage_bytes,
            subscription_tier_slug=self.subscription_tier_slug)


def get_container_registry(name: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetContainerRegistryResult:
    """
    Get information on a container registry. This data source provides the name as
    configured on your DigitalOcean account. This is useful if the container
    registry name in question is not managed by this provider or you need validate if
    the container registry exists in the account.

    An error is triggered if the provided container registry name does not exist.

    ## Example Usage
    ### Basic Example

    Get the container registry:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_container_registry(name="example")
    ```


    :param str name: The name of the container registry.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getContainerRegistry:getContainerRegistry', __args__, opts=opts, typ=GetContainerRegistryResult).value

    return AwaitableGetContainerRegistryResult(
        created_at=__ret__.created_at,
        endpoint=__ret__.endpoint,
        id=__ret__.id,
        name=__ret__.name,
        region=__ret__.region,
        server_url=__ret__.server_url,
        storage_usage_bytes=__ret__.storage_usage_bytes,
        subscription_tier_slug=__ret__.subscription_tier_slug)


@_utilities.lift_output_func(get_container_registry)
def get_container_registry_output(name: Optional[pulumi.Input[str]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetContainerRegistryResult]:
    """
    Get information on a container registry. This data source provides the name as
    configured on your DigitalOcean account. This is useful if the container
    registry name in question is not managed by this provider or you need validate if
    the container registry exists in the account.

    An error is triggered if the provided container registry name does not exist.

    ## Example Usage
    ### Basic Example

    Get the container registry:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_container_registry(name="example")
    ```


    :param str name: The name of the container registry.
    """
    ...
