// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.enums.DropletSlug;
import com.pulumi.digitalocean.enums.Region;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DropletArgs extends com.pulumi.resources.ResourceArgs {

    public static final DropletArgs Empty = new DropletArgs();

    /**
     * Boolean controlling if backups are made. Defaults to
     * false.
     * 
     */
    @Import(name="backups")
    private @Nullable Output<Boolean> backups;

    /**
     * @return Boolean controlling if backups are made. Defaults to
     * false.
     * 
     */
    public Optional<Output<Boolean>> backups() {
        return Optional.ofNullable(this.backups);
    }

    /**
     * A boolean indicating whether to install the
     * DigitalOcean agent used for providing access to the Droplet web console in
     * the control panel. By default, the agent is installed on new Droplets but
     * installation errors (i.e. OS not supported) are ignored. To prevent it from
     * being installed, set to `false`. To make installation errors fatal, explicitly
     * set it to `true`.
     * 
     */
    @Import(name="dropletAgent")
    private @Nullable Output<Boolean> dropletAgent;

    /**
     * @return A boolean indicating whether to install the
     * DigitalOcean agent used for providing access to the Droplet web console in
     * the control panel. By default, the agent is installed on new Droplets but
     * installation errors (i.e. OS not supported) are ignored. To prevent it from
     * being installed, set to `false`. To make installation errors fatal, explicitly
     * set it to `true`.
     * 
     */
    public Optional<Output<Boolean>> dropletAgent() {
        return Optional.ofNullable(this.dropletAgent);
    }

    /**
     * A boolean indicating whether the droplet
     * should be gracefully shut down before it is deleted.
     * 
     */
    @Import(name="gracefulShutdown")
    private @Nullable Output<Boolean> gracefulShutdown;

    /**
     * @return A boolean indicating whether the droplet
     * should be gracefully shut down before it is deleted.
     * 
     */
    public Optional<Output<Boolean>> gracefulShutdown() {
        return Optional.ofNullable(this.gracefulShutdown);
    }

    /**
     * The Droplet image ID or slug. This could be either image ID or droplet snapshot ID.
     * 
     */
    @Import(name="image", required=true)
    private Output<String> image;

    /**
     * @return The Droplet image ID or slug. This could be either image ID or droplet snapshot ID.
     * 
     */
    public Output<String> image() {
        return this.image;
    }

    /**
     * Boolean controlling if IPv6 is enabled. Defaults to false.
     * 
     */
    @Import(name="ipv6")
    private @Nullable Output<Boolean> ipv6;

    /**
     * @return Boolean controlling if IPv6 is enabled. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> ipv6() {
        return Optional.ofNullable(this.ipv6);
    }

    /**
     * Boolean controlling whether monitoring agent is installed.
     * Defaults to false. If set to `true`, you can configure monitor alert policies
     * [monitor alert resource](https://www.terraform.io/providers/digitalocean/digitalocean/latest/docs/resources/monitor_alert)
     * 
     */
    @Import(name="monitoring")
    private @Nullable Output<Boolean> monitoring;

    /**
     * @return Boolean controlling whether monitoring agent is installed.
     * Defaults to false. If set to `true`, you can configure monitor alert policies
     * [monitor alert resource](https://www.terraform.io/providers/digitalocean/digitalocean/latest/docs/resources/monitor_alert)
     * 
     */
    public Optional<Output<Boolean>> monitoring() {
        return Optional.ofNullable(this.monitoring);
    }

    /**
     * The Droplet name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Droplet name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * **Deprecated** Boolean controlling if private networking
     * is enabled. This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account&#39;s default VPC for the region.
     * 
     * @deprecated
     * This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account&#39;s default VPC for the region.
     * 
     */
    @Deprecated /* This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account's default VPC for the region. */
    @Import(name="privateNetworking")
    private @Nullable Output<Boolean> privateNetworking;

    /**
     * @return **Deprecated** Boolean controlling if private networking
     * is enabled. This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account&#39;s default VPC for the region.
     * 
     * @deprecated
     * This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account&#39;s default VPC for the region.
     * 
     */
    @Deprecated /* This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account's default VPC for the region. */
    public Optional<Output<Boolean>> privateNetworking() {
        return Optional.ofNullable(this.privateNetworking);
    }

    /**
     * The region to start in.
     * 
     */
    @Import(name="region", required=true)
    private Output<Either<String,Region>> region;

    /**
     * @return The region to start in.
     * 
     */
    public Output<Either<String,Region>> region() {
        return this.region;
    }

    /**
     * Boolean controlling whether to increase the disk
     * size when resizing a Droplet. It defaults to `true`. When set to `false`,
     * only the Droplet&#39;s RAM and CPU will be resized. **Increasing a Droplet&#39;s disk
     * size is a permanent change**. Increasing only RAM and CPU is reversible.
     * 
     */
    @Import(name="resizeDisk")
    private @Nullable Output<Boolean> resizeDisk;

    /**
     * @return Boolean controlling whether to increase the disk
     * size when resizing a Droplet. It defaults to `true`. When set to `false`,
     * only the Droplet&#39;s RAM and CPU will be resized. **Increasing a Droplet&#39;s disk
     * size is a permanent change**. Increasing only RAM and CPU is reversible.
     * 
     */
    public Optional<Output<Boolean>> resizeDisk() {
        return Optional.ofNullable(this.resizeDisk);
    }

    /**
     * The unique slug that indentifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://docs.digitalocean.com/reference/api/api-reference/#tag/Sizes).
     * 
     */
    @Import(name="size", required=true)
    private Output<Either<String,DropletSlug>> size;

    /**
     * @return The unique slug that indentifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://docs.digitalocean.com/reference/api/api-reference/#tag/Sizes).
     * 
     */
    public Output<Either<String,DropletSlug>> size() {
        return this.size;
    }

    /**
     * A list of SSH key IDs or fingerprints to enable in
     * the format `[12345, 123456]`. To retrieve this info, use the
     * [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
     * or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
     * be added or removed via this provider. Modifying this field will prompt you
     * to destroy and recreate the Droplet.
     * 
     */
    @Import(name="sshKeys")
    private @Nullable Output<List<String>> sshKeys;

    /**
     * @return A list of SSH key IDs or fingerprints to enable in
     * the format `[12345, 123456]`. To retrieve this info, use the
     * [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
     * or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
     * be added or removed via this provider. Modifying this field will prompt you
     * to destroy and recreate the Droplet.
     * 
     */
    public Optional<Output<List<String>>> sshKeys() {
        return Optional.ofNullable(this.sshKeys);
    }

    /**
     * A list of the tags to be applied to this Droplet.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of the tags to be applied to this Droplet.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A string of the desired User Data for the Droplet.
     * 
     */
    @Import(name="userData")
    private @Nullable Output<String> userData;

    /**
     * @return A string of the desired User Data for the Droplet.
     * 
     */
    public Optional<Output<String>> userData() {
        return Optional.ofNullable(this.userData);
    }

    /**
     * A list of the IDs of each block storage volume to be attached to the Droplet.
     * 
     */
    @Import(name="volumeIds")
    private @Nullable Output<List<String>> volumeIds;

    /**
     * @return A list of the IDs of each block storage volume to be attached to the Droplet.
     * 
     */
    public Optional<Output<List<String>>> volumeIds() {
        return Optional.ofNullable(this.volumeIds);
    }

    /**
     * The ID of the VPC where the Droplet will be located.
     * 
     */
    @Import(name="vpcUuid")
    private @Nullable Output<String> vpcUuid;

    /**
     * @return The ID of the VPC where the Droplet will be located.
     * 
     */
    public Optional<Output<String>> vpcUuid() {
        return Optional.ofNullable(this.vpcUuid);
    }

    private DropletArgs() {}

    private DropletArgs(DropletArgs $) {
        this.backups = $.backups;
        this.dropletAgent = $.dropletAgent;
        this.gracefulShutdown = $.gracefulShutdown;
        this.image = $.image;
        this.ipv6 = $.ipv6;
        this.monitoring = $.monitoring;
        this.name = $.name;
        this.privateNetworking = $.privateNetworking;
        this.region = $.region;
        this.resizeDisk = $.resizeDisk;
        this.size = $.size;
        this.sshKeys = $.sshKeys;
        this.tags = $.tags;
        this.userData = $.userData;
        this.volumeIds = $.volumeIds;
        this.vpcUuid = $.vpcUuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DropletArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DropletArgs $;

        public Builder() {
            $ = new DropletArgs();
        }

        public Builder(DropletArgs defaults) {
            $ = new DropletArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backups Boolean controlling if backups are made. Defaults to
         * false.
         * 
         * @return builder
         * 
         */
        public Builder backups(@Nullable Output<Boolean> backups) {
            $.backups = backups;
            return this;
        }

        /**
         * @param backups Boolean controlling if backups are made. Defaults to
         * false.
         * 
         * @return builder
         * 
         */
        public Builder backups(Boolean backups) {
            return backups(Output.of(backups));
        }

        /**
         * @param dropletAgent A boolean indicating whether to install the
         * DigitalOcean agent used for providing access to the Droplet web console in
         * the control panel. By default, the agent is installed on new Droplets but
         * installation errors (i.e. OS not supported) are ignored. To prevent it from
         * being installed, set to `false`. To make installation errors fatal, explicitly
         * set it to `true`.
         * 
         * @return builder
         * 
         */
        public Builder dropletAgent(@Nullable Output<Boolean> dropletAgent) {
            $.dropletAgent = dropletAgent;
            return this;
        }

        /**
         * @param dropletAgent A boolean indicating whether to install the
         * DigitalOcean agent used for providing access to the Droplet web console in
         * the control panel. By default, the agent is installed on new Droplets but
         * installation errors (i.e. OS not supported) are ignored. To prevent it from
         * being installed, set to `false`. To make installation errors fatal, explicitly
         * set it to `true`.
         * 
         * @return builder
         * 
         */
        public Builder dropletAgent(Boolean dropletAgent) {
            return dropletAgent(Output.of(dropletAgent));
        }

        /**
         * @param gracefulShutdown A boolean indicating whether the droplet
         * should be gracefully shut down before it is deleted.
         * 
         * @return builder
         * 
         */
        public Builder gracefulShutdown(@Nullable Output<Boolean> gracefulShutdown) {
            $.gracefulShutdown = gracefulShutdown;
            return this;
        }

        /**
         * @param gracefulShutdown A boolean indicating whether the droplet
         * should be gracefully shut down before it is deleted.
         * 
         * @return builder
         * 
         */
        public Builder gracefulShutdown(Boolean gracefulShutdown) {
            return gracefulShutdown(Output.of(gracefulShutdown));
        }

        /**
         * @param image The Droplet image ID or slug. This could be either image ID or droplet snapshot ID.
         * 
         * @return builder
         * 
         */
        public Builder image(Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image The Droplet image ID or slug. This could be either image ID or droplet snapshot ID.
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param ipv6 Boolean controlling if IPv6 is enabled. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder ipv6(@Nullable Output<Boolean> ipv6) {
            $.ipv6 = ipv6;
            return this;
        }

        /**
         * @param ipv6 Boolean controlling if IPv6 is enabled. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder ipv6(Boolean ipv6) {
            return ipv6(Output.of(ipv6));
        }

        /**
         * @param monitoring Boolean controlling whether monitoring agent is installed.
         * Defaults to false. If set to `true`, you can configure monitor alert policies
         * [monitor alert resource](https://www.terraform.io/providers/digitalocean/digitalocean/latest/docs/resources/monitor_alert)
         * 
         * @return builder
         * 
         */
        public Builder monitoring(@Nullable Output<Boolean> monitoring) {
            $.monitoring = monitoring;
            return this;
        }

        /**
         * @param monitoring Boolean controlling whether monitoring agent is installed.
         * Defaults to false. If set to `true`, you can configure monitor alert policies
         * [monitor alert resource](https://www.terraform.io/providers/digitalocean/digitalocean/latest/docs/resources/monitor_alert)
         * 
         * @return builder
         * 
         */
        public Builder monitoring(Boolean monitoring) {
            return monitoring(Output.of(monitoring));
        }

        /**
         * @param name The Droplet name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Droplet name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateNetworking **Deprecated** Boolean controlling if private networking
         * is enabled. This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account&#39;s default VPC for the region.
         * 
         * @return builder
         * 
         * @deprecated
         * This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account&#39;s default VPC for the region.
         * 
         */
        @Deprecated /* This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account's default VPC for the region. */
        public Builder privateNetworking(@Nullable Output<Boolean> privateNetworking) {
            $.privateNetworking = privateNetworking;
            return this;
        }

        /**
         * @param privateNetworking **Deprecated** Boolean controlling if private networking
         * is enabled. This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account&#39;s default VPC for the region.
         * 
         * @return builder
         * 
         * @deprecated
         * This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account&#39;s default VPC for the region.
         * 
         */
        @Deprecated /* This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account's default VPC for the region. */
        public Builder privateNetworking(Boolean privateNetworking) {
            return privateNetworking(Output.of(privateNetworking));
        }

        /**
         * @param region The region to start in.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<Either<String,Region>> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region to start in.
         * 
         * @return builder
         * 
         */
        public Builder region(Either<String,Region> region) {
            return region(Output.of(region));
        }

        /**
         * @param region The region to start in.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Either.ofLeft(region));
        }

        /**
         * @param region The region to start in.
         * 
         * @return builder
         * 
         */
        public Builder region(Region region) {
            return region(Either.ofRight(region));
        }

        /**
         * @param resizeDisk Boolean controlling whether to increase the disk
         * size when resizing a Droplet. It defaults to `true`. When set to `false`,
         * only the Droplet&#39;s RAM and CPU will be resized. **Increasing a Droplet&#39;s disk
         * size is a permanent change**. Increasing only RAM and CPU is reversible.
         * 
         * @return builder
         * 
         */
        public Builder resizeDisk(@Nullable Output<Boolean> resizeDisk) {
            $.resizeDisk = resizeDisk;
            return this;
        }

        /**
         * @param resizeDisk Boolean controlling whether to increase the disk
         * size when resizing a Droplet. It defaults to `true`. When set to `false`,
         * only the Droplet&#39;s RAM and CPU will be resized. **Increasing a Droplet&#39;s disk
         * size is a permanent change**. Increasing only RAM and CPU is reversible.
         * 
         * @return builder
         * 
         */
        public Builder resizeDisk(Boolean resizeDisk) {
            return resizeDisk(Output.of(resizeDisk));
        }

        /**
         * @param size The unique slug that indentifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://docs.digitalocean.com/reference/api/api-reference/#tag/Sizes).
         * 
         * @return builder
         * 
         */
        public Builder size(Output<Either<String,DropletSlug>> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The unique slug that indentifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://docs.digitalocean.com/reference/api/api-reference/#tag/Sizes).
         * 
         * @return builder
         * 
         */
        public Builder size(Either<String,DropletSlug> size) {
            return size(Output.of(size));
        }

        /**
         * @param size The unique slug that indentifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://docs.digitalocean.com/reference/api/api-reference/#tag/Sizes).
         * 
         * @return builder
         * 
         */
        public Builder size(String size) {
            return size(Either.ofLeft(size));
        }

        /**
         * @param size The unique slug that indentifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://docs.digitalocean.com/reference/api/api-reference/#tag/Sizes).
         * 
         * @return builder
         * 
         */
        public Builder size(DropletSlug size) {
            return size(Either.ofRight(size));
        }

        /**
         * @param sshKeys A list of SSH key IDs or fingerprints to enable in
         * the format `[12345, 123456]`. To retrieve this info, use the
         * [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
         * or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
         * be added or removed via this provider. Modifying this field will prompt you
         * to destroy and recreate the Droplet.
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(@Nullable Output<List<String>> sshKeys) {
            $.sshKeys = sshKeys;
            return this;
        }

        /**
         * @param sshKeys A list of SSH key IDs or fingerprints to enable in
         * the format `[12345, 123456]`. To retrieve this info, use the
         * [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
         * or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
         * be added or removed via this provider. Modifying this field will prompt you
         * to destroy and recreate the Droplet.
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(List<String> sshKeys) {
            return sshKeys(Output.of(sshKeys));
        }

        /**
         * @param sshKeys A list of SSH key IDs or fingerprints to enable in
         * the format `[12345, 123456]`. To retrieve this info, use the
         * [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
         * or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
         * be added or removed via this provider. Modifying this field will prompt you
         * to destroy and recreate the Droplet.
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(String... sshKeys) {
            return sshKeys(List.of(sshKeys));
        }

        /**
         * @param tags A list of the tags to be applied to this Droplet.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of the tags to be applied to this Droplet.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of the tags to be applied to this Droplet.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param userData A string of the desired User Data for the Droplet.
         * 
         * @return builder
         * 
         */
        public Builder userData(@Nullable Output<String> userData) {
            $.userData = userData;
            return this;
        }

        /**
         * @param userData A string of the desired User Data for the Droplet.
         * 
         * @return builder
         * 
         */
        public Builder userData(String userData) {
            return userData(Output.of(userData));
        }

        /**
         * @param volumeIds A list of the IDs of each block storage volume to be attached to the Droplet.
         * 
         * @return builder
         * 
         */
        public Builder volumeIds(@Nullable Output<List<String>> volumeIds) {
            $.volumeIds = volumeIds;
            return this;
        }

        /**
         * @param volumeIds A list of the IDs of each block storage volume to be attached to the Droplet.
         * 
         * @return builder
         * 
         */
        public Builder volumeIds(List<String> volumeIds) {
            return volumeIds(Output.of(volumeIds));
        }

        /**
         * @param volumeIds A list of the IDs of each block storage volume to be attached to the Droplet.
         * 
         * @return builder
         * 
         */
        public Builder volumeIds(String... volumeIds) {
            return volumeIds(List.of(volumeIds));
        }

        /**
         * @param vpcUuid The ID of the VPC where the Droplet will be located.
         * 
         * @return builder
         * 
         */
        public Builder vpcUuid(@Nullable Output<String> vpcUuid) {
            $.vpcUuid = vpcUuid;
            return this;
        }

        /**
         * @param vpcUuid The ID of the VPC where the Droplet will be located.
         * 
         * @return builder
         * 
         */
        public Builder vpcUuid(String vpcUuid) {
            return vpcUuid(Output.of(vpcUuid));
        }

        public DropletArgs build() {
            $.image = Objects.requireNonNull($.image, "expected parameter 'image' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.size = Objects.requireNonNull($.size, "expected parameter 'size' to be non-null");
            return $;
        }
    }

}
