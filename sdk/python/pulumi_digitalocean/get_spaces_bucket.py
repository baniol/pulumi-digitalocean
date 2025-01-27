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
    'GetSpacesBucketResult',
    'AwaitableGetSpacesBucketResult',
    'get_spaces_bucket',
    'get_spaces_bucket_output',
]

@pulumi.output_type
class GetSpacesBucketResult:
    """
    A collection of values returned by getSpacesBucket.
    """
    def __init__(__self__, bucket_domain_name=None, id=None, name=None, region=None, urn=None):
        if bucket_domain_name and not isinstance(bucket_domain_name, str):
            raise TypeError("Expected argument 'bucket_domain_name' to be a str")
        pulumi.set(__self__, "bucket_domain_name", bucket_domain_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if urn and not isinstance(urn, str):
            raise TypeError("Expected argument 'urn' to be a str")
        pulumi.set(__self__, "urn", urn)

    @property
    @pulumi.getter(name="bucketDomainName")
    def bucket_domain_name(self) -> str:
        """
        The FQDN of the bucket (e.g. bucket-name.nyc3.digitaloceanspaces.com)
        """
        return pulumi.get(self, "bucket_domain_name")

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
        The name of the Spaces bucket
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        The slug of the region where the bucket is stored.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def urn(self) -> str:
        """
        The uniform resource name of the bucket
        """
        return pulumi.get(self, "urn")


class AwaitableGetSpacesBucketResult(GetSpacesBucketResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSpacesBucketResult(
            bucket_domain_name=self.bucket_domain_name,
            id=self.id,
            name=self.name,
            region=self.region,
            urn=self.urn)


def get_spaces_bucket(name: Optional[str] = None,
                      region: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSpacesBucketResult:
    """
    Get information on a Spaces bucket for use in other resources. This is useful if the Spaces bucket in question
    is not managed by the provider or you need to utilize any of the bucket's data.

    ## Example Usage

    Get the bucket by name:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_spaces_bucket(name="my-spaces-bucket",
        region="nyc3")
    pulumi.export("bucketDomainName", example.bucket_domain_name)
    ```


    :param str name: The name of the Spaces bucket.
    :param str region: The slug of the region where the bucket is stored.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getSpacesBucket:getSpacesBucket', __args__, opts=opts, typ=GetSpacesBucketResult).value

    return AwaitableGetSpacesBucketResult(
        bucket_domain_name=__ret__.bucket_domain_name,
        id=__ret__.id,
        name=__ret__.name,
        region=__ret__.region,
        urn=__ret__.urn)


@_utilities.lift_output_func(get_spaces_bucket)
def get_spaces_bucket_output(name: Optional[pulumi.Input[str]] = None,
                             region: Optional[pulumi.Input[str]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSpacesBucketResult]:
    """
    Get information on a Spaces bucket for use in other resources. This is useful if the Spaces bucket in question
    is not managed by the provider or you need to utilize any of the bucket's data.

    ## Example Usage

    Get the bucket by name:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_spaces_bucket(name="my-spaces-bucket",
        region="nyc3")
    pulumi.export("bucketDomainName", example.bucket_domain_name)
    ```


    :param str name: The name of the Spaces bucket.
    :param str region: The slug of the region where the bucket is stored.
    """
    ...
