// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecJobLogDestinationPapertrailGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Datadog HTTP log intake endpoint.
        /// </summary>
        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        public AppSpecJobLogDestinationPapertrailGetArgs()
        {
        }
        public static new AppSpecJobLogDestinationPapertrailGetArgs Empty => new AppSpecJobLogDestinationPapertrailGetArgs();
    }
}
