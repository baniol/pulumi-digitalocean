# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['SpacesBucketObject']


class SpacesBucketObject(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acl: Optional[pulumi.Input[str]] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 cache_control: Optional[pulumi.Input[str]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 content_base64: Optional[pulumi.Input[str]] = None,
                 content_disposition: Optional[pulumi.Input[str]] = None,
                 content_encoding: Optional[pulumi.Input[str]] = None,
                 content_language: Optional[pulumi.Input[str]] = None,
                 content_type: Optional[pulumi.Input[str]] = None,
                 etag: Optional[pulumi.Input[str]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 website_redirect: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a bucket object resource for Spaces, DigitalOcean's object storage product.
        The `SpacesBucketObject` resource allows this provider to upload content
        to Spaces.

        The [Spaces API](https://developers.digitalocean.com/documentation/spaces/) was
        designed to be interoperable with Amazon's AWS S3 API. This allows users to
        interact with the service while using the tools they already know. Spaces
        mirrors S3's authentication framework and requests to Spaces require a key pair
        similar to Amazon's Access ID and Secret Key.

        The authentication requirement can be met by either setting the
        `SPACES_ACCESS_KEY_ID` and `SPACES_SECRET_ACCESS_KEY` environment variables or
        the provider's `spaces_access_id` and `spaces_secret_key` arguments to the
        access ID and secret you generate via the DigitalOcean control panel. For
        example:

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        static_assets = digitalocean.SpacesBucket("static-assets")
        # ...
        ```

        For more information, See [An Introduction to DigitalOcean Spaces](https://www.digitalocean.com/community/tutorials/an-introduction-to-digitalocean-spaces)

        ## Example Usage
        ### Create a Key in a Spaces Bucket

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar = digitalocean.SpacesBucket("foobar", region="nyc3")
        index = digitalocean.SpacesBucketObject("index",
            region=foobar.region,
            bucket=foobar.name,
            key="index.html",
            content="<html><body><p>This page is empty.</p></body></html>",
            content_type="text/html")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] acl: The canned ACL to apply. DigitalOcean supports "private" and "public-read". (Defaults to "private".)
        :param pulumi.Input[str] bucket: The name of the bucket to put the file in.
        :param pulumi.Input[str] cache_control: Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
        :param pulumi.Input[str] content: Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
        :param pulumi.Input[str] content_base64: Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
        :param pulumi.Input[str] content_disposition: Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
        :param pulumi.Input[str] content_encoding: Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
        :param pulumi.Input[str] content_language: The language the content is in e.g. en-US or en-GB.
        :param pulumi.Input[str] content_type: A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
        :param pulumi.Input[str] etag: Used to trigger updates. The only meaningful value is `${filemd5("path/to/file")}`.
        :param pulumi.Input[bool] force_destroy: Allow the object to be deleted by removing any legal hold on any object version.
               Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
        :param pulumi.Input[str] key: The name of the object once it is in the bucket.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] metadata: A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
        :param pulumi.Input[str] region: The region where the bucket resides (Defaults to `nyc3`)
        :param pulumi.Input[str] source: The path to a file that will be read and uploaded as raw bytes for the object content.
        :param pulumi.Input[str] website_redirect: Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
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
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['acl'] = acl
            if bucket is None:
                raise TypeError("Missing required property 'bucket'")
            __props__['bucket'] = bucket
            __props__['cache_control'] = cache_control
            __props__['content'] = content
            __props__['content_base64'] = content_base64
            __props__['content_disposition'] = content_disposition
            __props__['content_encoding'] = content_encoding
            __props__['content_language'] = content_language
            __props__['content_type'] = content_type
            __props__['etag'] = etag
            __props__['force_destroy'] = force_destroy
            if key is None:
                raise TypeError("Missing required property 'key'")
            __props__['key'] = key
            __props__['metadata'] = metadata
            if region is None:
                raise TypeError("Missing required property 'region'")
            __props__['region'] = region
            __props__['source'] = source
            __props__['website_redirect'] = website_redirect
            __props__['version_id'] = None
        super(SpacesBucketObject, __self__).__init__(
            'digitalocean:index/spacesBucketObject:SpacesBucketObject',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            acl: Optional[pulumi.Input[str]] = None,
            bucket: Optional[pulumi.Input[str]] = None,
            cache_control: Optional[pulumi.Input[str]] = None,
            content: Optional[pulumi.Input[str]] = None,
            content_base64: Optional[pulumi.Input[str]] = None,
            content_disposition: Optional[pulumi.Input[str]] = None,
            content_encoding: Optional[pulumi.Input[str]] = None,
            content_language: Optional[pulumi.Input[str]] = None,
            content_type: Optional[pulumi.Input[str]] = None,
            etag: Optional[pulumi.Input[str]] = None,
            force_destroy: Optional[pulumi.Input[bool]] = None,
            key: Optional[pulumi.Input[str]] = None,
            metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            region: Optional[pulumi.Input[str]] = None,
            source: Optional[pulumi.Input[str]] = None,
            version_id: Optional[pulumi.Input[str]] = None,
            website_redirect: Optional[pulumi.Input[str]] = None) -> 'SpacesBucketObject':
        """
        Get an existing SpacesBucketObject resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] acl: The canned ACL to apply. DigitalOcean supports "private" and "public-read". (Defaults to "private".)
        :param pulumi.Input[str] bucket: The name of the bucket to put the file in.
        :param pulumi.Input[str] cache_control: Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
        :param pulumi.Input[str] content: Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
        :param pulumi.Input[str] content_base64: Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
        :param pulumi.Input[str] content_disposition: Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
        :param pulumi.Input[str] content_encoding: Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
        :param pulumi.Input[str] content_language: The language the content is in e.g. en-US or en-GB.
        :param pulumi.Input[str] content_type: A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
        :param pulumi.Input[str] etag: Used to trigger updates. The only meaningful value is `${filemd5("path/to/file")}`.
        :param pulumi.Input[bool] force_destroy: Allow the object to be deleted by removing any legal hold on any object version.
               Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
        :param pulumi.Input[str] key: The name of the object once it is in the bucket.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] metadata: A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
        :param pulumi.Input[str] region: The region where the bucket resides (Defaults to `nyc3`)
        :param pulumi.Input[str] source: The path to a file that will be read and uploaded as raw bytes for the object content.
        :param pulumi.Input[str] version_id: A unique version ID value for the object, if bucket versioning is enabled.
        :param pulumi.Input[str] website_redirect: Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["acl"] = acl
        __props__["bucket"] = bucket
        __props__["cache_control"] = cache_control
        __props__["content"] = content
        __props__["content_base64"] = content_base64
        __props__["content_disposition"] = content_disposition
        __props__["content_encoding"] = content_encoding
        __props__["content_language"] = content_language
        __props__["content_type"] = content_type
        __props__["etag"] = etag
        __props__["force_destroy"] = force_destroy
        __props__["key"] = key
        __props__["metadata"] = metadata
        __props__["region"] = region
        __props__["source"] = source
        __props__["version_id"] = version_id
        __props__["website_redirect"] = website_redirect
        return SpacesBucketObject(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def acl(self) -> pulumi.Output[Optional[str]]:
        """
        The canned ACL to apply. DigitalOcean supports "private" and "public-read". (Defaults to "private".)
        """
        return pulumi.get(self, "acl")

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Output[str]:
        """
        The name of the bucket to put the file in.
        """
        return pulumi.get(self, "bucket")

    @property
    @pulumi.getter(name="cacheControl")
    def cache_control(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
        """
        return pulumi.get(self, "cache_control")

    @property
    @pulumi.getter
    def content(self) -> pulumi.Output[Optional[str]]:
        """
        Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter(name="contentBase64")
    def content_base64(self) -> pulumi.Output[Optional[str]]:
        """
        Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
        """
        return pulumi.get(self, "content_base64")

    @property
    @pulumi.getter(name="contentDisposition")
    def content_disposition(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
        """
        return pulumi.get(self, "content_disposition")

    @property
    @pulumi.getter(name="contentEncoding")
    def content_encoding(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
        """
        return pulumi.get(self, "content_encoding")

    @property
    @pulumi.getter(name="contentLanguage")
    def content_language(self) -> pulumi.Output[Optional[str]]:
        """
        The language the content is in e.g. en-US or en-GB.
        """
        return pulumi.get(self, "content_language")

    @property
    @pulumi.getter(name="contentType")
    def content_type(self) -> pulumi.Output[str]:
        """
        A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
        """
        return pulumi.get(self, "content_type")

    @property
    @pulumi.getter
    def etag(self) -> pulumi.Output[str]:
        """
        Used to trigger updates. The only meaningful value is `${filemd5("path/to/file")}`.
        """
        return pulumi.get(self, "etag")

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> pulumi.Output[Optional[bool]]:
        """
        Allow the object to be deleted by removing any legal hold on any object version.
        Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
        """
        return pulumi.get(self, "force_destroy")

    @property
    @pulumi.getter
    def key(self) -> pulumi.Output[str]:
        """
        The name of the object once it is in the bucket.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def metadata(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The region where the bucket resides (Defaults to `nyc3`)
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def source(self) -> pulumi.Output[Optional[str]]:
        """
        The path to a file that will be read and uploaded as raw bytes for the object content.
        """
        return pulumi.get(self, "source")

    @property
    @pulumi.getter(name="versionId")
    def version_id(self) -> pulumi.Output[str]:
        """
        A unique version ID value for the object, if bucket versioning is enabled.
        """
        return pulumi.get(self, "version_id")

    @property
    @pulumi.getter(name="websiteRedirect")
    def website_redirect(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
        """
        return pulumi.get(self, "website_redirect")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

