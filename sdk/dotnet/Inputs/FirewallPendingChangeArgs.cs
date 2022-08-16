// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class FirewallPendingChangeArgs : global::Pulumi.ResourceArgs
    {
        [Input("dropletId")]
        public Input<int>? DropletId { get; set; }

        [Input("removing")]
        public Input<bool>? Removing { get; set; }

        /// <summary>
        /// A status string indicating the current state of the Firewall.
        /// This can be "waiting", "succeeded", or "failed".
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public FirewallPendingChangeArgs()
        {
        }
        public static new FirewallPendingChangeArgs Empty => new FirewallPendingChangeArgs();
    }
}
