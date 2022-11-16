// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.DropletArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.DropletState;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean Droplet resource. This can be used to create,
 * modify, and delete Droplets.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.Droplet;
 * import com.pulumi.digitalocean.DropletArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var web = new Droplet(&#34;web&#34;, DropletArgs.builder()        
 *             .image(&#34;ubuntu-18-04-x64&#34;)
 *             .region(&#34;nyc2&#34;)
 *             .size(&#34;s-1vcpu-1gb&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Droplets can be imported using the Droplet `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import digitalocean:index/droplet:Droplet mydroplet 100823
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/droplet:Droplet")
public class Droplet extends com.pulumi.resources.CustomResource {
    /**
     * Boolean controlling if backups are made. Defaults to
     * false.
     * 
     */
    @Export(name="backups", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> backups;

    /**
     * @return Boolean controlling if backups are made. Defaults to
     * false.
     * 
     */
    public Output<Optional<Boolean>> backups() {
        return Codegen.optional(this.backups);
    }
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The size of the instance&#39;s disk in GB
     * 
     */
    @Export(name="disk", type=Integer.class, parameters={})
    private Output<Integer> disk;

    /**
     * @return The size of the instance&#39;s disk in GB
     * 
     */
    public Output<Integer> disk() {
        return this.disk;
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
    @Export(name="dropletAgent", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> dropletAgent;

    /**
     * @return A boolean indicating whether to install the
     * DigitalOcean agent used for providing access to the Droplet web console in
     * the control panel. By default, the agent is installed on new Droplets but
     * installation errors (i.e. OS not supported) are ignored. To prevent it from
     * being installed, set to `false`. To make installation errors fatal, explicitly
     * set it to `true`.
     * 
     */
    public Output<Optional<Boolean>> dropletAgent() {
        return Codegen.optional(this.dropletAgent);
    }
    /**
     * The uniform resource name of the Droplet
     * * `name`- The name of the Droplet
     * 
     */
    @Export(name="dropletUrn", type=String.class, parameters={})
    private Output<String> dropletUrn;

    /**
     * @return The uniform resource name of the Droplet
     * * `name`- The name of the Droplet
     * 
     */
    public Output<String> dropletUrn() {
        return this.dropletUrn;
    }
    /**
     * A boolean indicating whether the droplet
     * should be gracefully shut down before it is deleted.
     * 
     */
    @Export(name="gracefulShutdown", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> gracefulShutdown;

    /**
     * @return A boolean indicating whether the droplet
     * should be gracefully shut down before it is deleted.
     * 
     */
    public Output<Optional<Boolean>> gracefulShutdown() {
        return Codegen.optional(this.gracefulShutdown);
    }
    /**
     * The Droplet image ID or slug. This could be either image ID or droplet snapshot ID.
     * 
     */
    @Export(name="image", type=String.class, parameters={})
    private Output<String> image;

    /**
     * @return The Droplet image ID or slug. This could be either image ID or droplet snapshot ID.
     * 
     */
    public Output<String> image() {
        return this.image;
    }
    /**
     * The IPv4 address
     * 
     */
    @Export(name="ipv4Address", type=String.class, parameters={})
    private Output<String> ipv4Address;

    /**
     * @return The IPv4 address
     * 
     */
    public Output<String> ipv4Address() {
        return this.ipv4Address;
    }
    /**
     * The private networking IPv4 address
     * 
     */
    @Export(name="ipv4AddressPrivate", type=String.class, parameters={})
    private Output<String> ipv4AddressPrivate;

    /**
     * @return The private networking IPv4 address
     * 
     */
    public Output<String> ipv4AddressPrivate() {
        return this.ipv4AddressPrivate;
    }
    /**
     * Boolean controlling if IPv6 is enabled. Defaults to false.
     * 
     */
    @Export(name="ipv6", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ipv6;

    /**
     * @return Boolean controlling if IPv6 is enabled. Defaults to false.
     * 
     */
    public Output<Optional<Boolean>> ipv6() {
        return Codegen.optional(this.ipv6);
    }
    /**
     * The IPv6 address
     * 
     */
    @Export(name="ipv6Address", type=String.class, parameters={})
    private Output<String> ipv6Address;

    /**
     * @return The IPv6 address
     * 
     */
    public Output<String> ipv6Address() {
        return this.ipv6Address;
    }
    /**
     * Is the Droplet locked
     * 
     */
    @Export(name="locked", type=Boolean.class, parameters={})
    private Output<Boolean> locked;

    /**
     * @return Is the Droplet locked
     * 
     */
    public Output<Boolean> locked() {
        return this.locked;
    }
    @Export(name="memory", type=Integer.class, parameters={})
    private Output<Integer> memory;

    public Output<Integer> memory() {
        return this.memory;
    }
    /**
     * Boolean controlling whether monitoring agent is installed.
     * Defaults to false. If set to `true`, you can configure monitor alert policies
     * [monitor alert resource](https://www.terraform.io/providers/digitalocean/digitalocean/latest/docs/resources/monitor_alert)
     * 
     */
    @Export(name="monitoring", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> monitoring;

    /**
     * @return Boolean controlling whether monitoring agent is installed.
     * Defaults to false. If set to `true`, you can configure monitor alert policies
     * [monitor alert resource](https://www.terraform.io/providers/digitalocean/digitalocean/latest/docs/resources/monitor_alert)
     * 
     */
    public Output<Optional<Boolean>> monitoring() {
        return Codegen.optional(this.monitoring);
    }
    /**
     * The Droplet name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The Droplet name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Droplet hourly price
     * 
     */
    @Export(name="priceHourly", type=Double.class, parameters={})
    private Output<Double> priceHourly;

    /**
     * @return Droplet hourly price
     * 
     */
    public Output<Double> priceHourly() {
        return this.priceHourly;
    }
    /**
     * Droplet monthly price
     * 
     */
    @Export(name="priceMonthly", type=Double.class, parameters={})
    private Output<Double> priceMonthly;

    /**
     * @return Droplet monthly price
     * 
     */
    public Output<Double> priceMonthly() {
        return this.priceMonthly;
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
    @Export(name="privateNetworking", type=Boolean.class, parameters={})
    private Output<Boolean> privateNetworking;

    /**
     * @return **Deprecated** Boolean controlling if private networking
     * is enabled. This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account&#39;s default VPC for the region.
     * 
     */
    public Output<Boolean> privateNetworking() {
        return this.privateNetworking;
    }
    /**
     * The region where the Droplet will be created.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region where the Droplet will be created.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Boolean controlling whether to increase the disk
     * size when resizing a Droplet. It defaults to `true`. When set to `false`,
     * only the Droplet&#39;s RAM and CPU will be resized. **Increasing a Droplet&#39;s disk
     * size is a permanent change**. Increasing only RAM and CPU is reversible.
     * 
     */
    @Export(name="resizeDisk", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> resizeDisk;

    /**
     * @return Boolean controlling whether to increase the disk
     * size when resizing a Droplet. It defaults to `true`. When set to `false`,
     * only the Droplet&#39;s RAM and CPU will be resized. **Increasing a Droplet&#39;s disk
     * size is a permanent change**. Increasing only RAM and CPU is reversible.
     * 
     */
    public Output<Optional<Boolean>> resizeDisk() {
        return Codegen.optional(this.resizeDisk);
    }
    /**
     * The unique slug that indentifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://docs.digitalocean.com/reference/api/api-reference/#tag/Sizes).
     * 
     */
    @Export(name="size", type=String.class, parameters={})
    private Output<String> size;

    /**
     * @return The unique slug that indentifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://docs.digitalocean.com/reference/api/api-reference/#tag/Sizes).
     * 
     */
    public Output<String> size() {
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
    @Export(name="sshKeys", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> sshKeys;

    /**
     * @return A list of SSH key IDs or fingerprints to enable in
     * the format `[12345, 123456]`. To retrieve this info, use the
     * [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
     * or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
     * be added or removed via this provider. Modifying this field will prompt you
     * to destroy and recreate the Droplet.
     * 
     */
    public Output<Optional<List<String>>> sshKeys() {
        return Codegen.optional(this.sshKeys);
    }
    /**
     * The status of the Droplet
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the Droplet
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A list of the tags to be applied to this Droplet.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of the tags to be applied to this Droplet.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A string of the desired User Data for the Droplet.
     * 
     */
    @Export(name="userData", type=String.class, parameters={})
    private Output</* @Nullable */ String> userData;

    /**
     * @return A string of the desired User Data for the Droplet.
     * 
     */
    public Output<Optional<String>> userData() {
        return Codegen.optional(this.userData);
    }
    /**
     * The number of the instance&#39;s virtual CPUs
     * 
     */
    @Export(name="vcpus", type=Integer.class, parameters={})
    private Output<Integer> vcpus;

    /**
     * @return The number of the instance&#39;s virtual CPUs
     * 
     */
    public Output<Integer> vcpus() {
        return this.vcpus;
    }
    /**
     * A list of the IDs of each block storage volume to be attached to the Droplet.
     * 
     */
    @Export(name="volumeIds", type=List.class, parameters={String.class})
    private Output<List<String>> volumeIds;

    /**
     * @return A list of the IDs of each block storage volume to be attached to the Droplet.
     * 
     */
    public Output<List<String>> volumeIds() {
        return this.volumeIds;
    }
    /**
     * The ID of the VPC where the Droplet will be located.
     * 
     */
    @Export(name="vpcUuid", type=String.class, parameters={})
    private Output<String> vpcUuid;

    /**
     * @return The ID of the VPC where the Droplet will be located.
     * 
     */
    public Output<String> vpcUuid() {
        return this.vpcUuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Droplet(String name) {
        this(name, DropletArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Droplet(String name, DropletArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Droplet(String name, DropletArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/droplet:Droplet", name, args == null ? DropletArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Droplet(String name, Output<String> id, @Nullable DropletState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/droplet:Droplet", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Droplet get(String name, Output<String> id, @Nullable DropletState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Droplet(name, id, state, options);
    }
}