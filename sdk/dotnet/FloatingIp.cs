// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    /// <summary>
    /// Provides a DigitalOcean Floating IP to represent a publicly-accessible static IP addresses that can be mapped to one of your Droplets.
    /// 
    /// &gt; **NOTE:** Floating IPs can be assigned to a Droplet either directly on the `digitalocean..FloatingIp` resource by setting a `droplet_id` or using the `digitalocean..FloatingIpAssignment` resource, but the two cannot be used together.
    /// </summary>
    public partial class FloatingIp : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of Droplet that the Floating IP will be assigned to.
        /// </summary>
        [Output("dropletId")]
        public Output<int?> DropletId { get; private set; } = null!;

        /// <summary>
        /// The IP Address of the resource
        /// </summary>
        [Output("ipAddress")]
        public Output<string> IpAddress { get; private set; } = null!;

        /// <summary>
        /// The region that the Floating IP is reserved to.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The uniform resource name of the floating ip
        /// </summary>
        [Output("urn")]
        public Output<string> Urn { get; private set; } = null!;


        /// <summary>
        /// Create a FloatingIp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FloatingIp(string name, FloatingIpArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/floatingIp:FloatingIp", name, args ?? new FloatingIpArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FloatingIp(string name, Input<string> id, FloatingIpState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/floatingIp:FloatingIp", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing FloatingIp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FloatingIp Get(string name, Input<string> id, FloatingIpState? state = null, CustomResourceOptions? options = null)
        {
            return new FloatingIp(name, id, state, options);
        }
    }

    public sealed class FloatingIpArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of Droplet that the Floating IP will be assigned to.
        /// </summary>
        [Input("dropletId")]
        public Input<int>? DropletId { get; set; }

        /// <summary>
        /// The IP Address of the resource
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// The region that the Floating IP is reserved to.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public FloatingIpArgs()
        {
        }
    }

    public sealed class FloatingIpState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of Droplet that the Floating IP will be assigned to.
        /// </summary>
        [Input("dropletId")]
        public Input<int>? DropletId { get; set; }

        /// <summary>
        /// The IP Address of the resource
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// The region that the Floating IP is reserved to.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The uniform resource name of the floating ip
        /// </summary>
        [Input("urn")]
        public Input<string>? Urn { get; set; }

        public FloatingIpState()
        {
        }
    }
}