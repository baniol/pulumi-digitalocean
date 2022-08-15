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
    'GetDropletSnapshotResult',
    'AwaitableGetDropletSnapshotResult',
    'get_droplet_snapshot',
    'get_droplet_snapshot_output',
]

@pulumi.output_type
class GetDropletSnapshotResult:
    """
    A collection of values returned by getDropletSnapshot.
    """
    def __init__(__self__, created_at=None, droplet_id=None, id=None, min_disk_size=None, most_recent=None, name=None, name_regex=None, region=None, regions=None, size=None):
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if droplet_id and not isinstance(droplet_id, str):
            raise TypeError("Expected argument 'droplet_id' to be a str")
        pulumi.set(__self__, "droplet_id", droplet_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if min_disk_size and not isinstance(min_disk_size, int):
            raise TypeError("Expected argument 'min_disk_size' to be a int")
        pulumi.set(__self__, "min_disk_size", min_disk_size)
        if most_recent and not isinstance(most_recent, bool):
            raise TypeError("Expected argument 'most_recent' to be a bool")
        pulumi.set(__self__, "most_recent", most_recent)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if regions and not isinstance(regions, list):
            raise TypeError("Expected argument 'regions' to be a list")
        pulumi.set(__self__, "regions", regions)
        if size and not isinstance(size, float):
            raise TypeError("Expected argument 'size' to be a float")
        pulumi.set(__self__, "size", size)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> str:
        """
        The date and time the Droplet snapshot was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="dropletId")
    def droplet_id(self) -> str:
        """
        The ID of the Droplet from which the Droplet snapshot originated.
        """
        return pulumi.get(self, "droplet_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="minDiskSize")
    def min_disk_size(self) -> int:
        """
        The minimum size in gigabytes required for a Droplet to be created based on this Droplet snapshot.
        """
        return pulumi.get(self, "min_disk_size")

    @property
    @pulumi.getter(name="mostRecent")
    def most_recent(self) -> Optional[bool]:
        return pulumi.get(self, "most_recent")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def region(self) -> Optional[str]:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def regions(self) -> Sequence[str]:
        """
        A list of DigitalOcean region "slugs" indicating where the Droplet snapshot is available.
        """
        return pulumi.get(self, "regions")

    @property
    @pulumi.getter
    def size(self) -> float:
        """
        The billable size of the Droplet snapshot in gigabytes.
        """
        return pulumi.get(self, "size")


class AwaitableGetDropletSnapshotResult(GetDropletSnapshotResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDropletSnapshotResult(
            created_at=self.created_at,
            droplet_id=self.droplet_id,
            id=self.id,
            min_disk_size=self.min_disk_size,
            most_recent=self.most_recent,
            name=self.name,
            name_regex=self.name_regex,
            region=self.region,
            regions=self.regions,
            size=self.size)


def get_droplet_snapshot(most_recent: Optional[bool] = None,
                         name: Optional[str] = None,
                         name_regex: Optional[str] = None,
                         region: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDropletSnapshotResult:
    """
    Droplet snapshots are saved instances of a Droplet. Use this data
    source to retrieve the ID of a DigitalOcean Droplet snapshot for use in other
    resources.

    ## Example Usage

    Get the Droplet snapshot:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    web_snapshot = digitalocean.get_droplet_snapshot(most_recent=True,
        name_regex="^web",
        region="nyc3")
    ```

    Create image from snapshot:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    web_snapshot = digitalocean.get_droplet_snapshot(name_regex="^web",
        region="nyc3",
        most_recent=True)
    from_snapshot = digitalocean.Droplet("from-snapshot",
        image=web_snapshot.id,
        region="nyc3",
        size="s-2vcpu-4gb")
    ```


    :param bool most_recent: If more than one result is returned, use the most recent Droplet snapshot.
    :param str name: The name of the Droplet snapshot.
    :param str name_regex: A regex string to apply to the Droplet snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
    :param str region: A "slug" representing a DigitalOcean region (e.g. `nyc1`). If set, only Droplet snapshots available in the region will be returned.
    """
    __args__ = dict()
    __args__['mostRecent'] = most_recent
    __args__['name'] = name
    __args__['nameRegex'] = name_regex
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getDropletSnapshot:getDropletSnapshot', __args__, opts=opts, typ=GetDropletSnapshotResult).value

    return AwaitableGetDropletSnapshotResult(
        created_at=__ret__.created_at,
        droplet_id=__ret__.droplet_id,
        id=__ret__.id,
        min_disk_size=__ret__.min_disk_size,
        most_recent=__ret__.most_recent,
        name=__ret__.name,
        name_regex=__ret__.name_regex,
        region=__ret__.region,
        regions=__ret__.regions,
        size=__ret__.size)


@_utilities.lift_output_func(get_droplet_snapshot)
def get_droplet_snapshot_output(most_recent: Optional[pulumi.Input[Optional[bool]]] = None,
                                name: Optional[pulumi.Input[Optional[str]]] = None,
                                name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                region: Optional[pulumi.Input[Optional[str]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDropletSnapshotResult]:
    """
    Droplet snapshots are saved instances of a Droplet. Use this data
    source to retrieve the ID of a DigitalOcean Droplet snapshot for use in other
    resources.

    ## Example Usage

    Get the Droplet snapshot:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    web_snapshot = digitalocean.get_droplet_snapshot(most_recent=True,
        name_regex="^web",
        region="nyc3")
    ```

    Create image from snapshot:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    web_snapshot = digitalocean.get_droplet_snapshot(name_regex="^web",
        region="nyc3",
        most_recent=True)
    from_snapshot = digitalocean.Droplet("from-snapshot",
        image=web_snapshot.id,
        region="nyc3",
        size="s-2vcpu-4gb")
    ```


    :param bool most_recent: If more than one result is returned, use the most recent Droplet snapshot.
    :param str name: The name of the Droplet snapshot.
    :param str name_regex: A regex string to apply to the Droplet snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
    :param str region: A "slug" representing a DigitalOcean region (e.g. `nyc1`). If set, only Droplet snapshots available in the region will be returned.
    """
    ...
