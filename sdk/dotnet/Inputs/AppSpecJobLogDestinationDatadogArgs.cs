// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecJobLogDestinationDatadogArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Datadog API key.
        /// </summary>
        [Input("apiKey", required: true)]
        public Input<string> ApiKey { get; set; } = null!;

        /// <summary>
        /// Datadog HTTP log intake endpoint.
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        public AppSpecJobLogDestinationDatadogArgs()
        {
        }
        public static new AppSpecJobLogDestinationDatadogArgs Empty => new AppSpecJobLogDestinationDatadogArgs();
    }
}
