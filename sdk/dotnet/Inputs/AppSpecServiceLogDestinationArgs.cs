// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecServiceLogDestinationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Datadog configuration.
        /// </summary>
        [Input("datadog")]
        public Input<Inputs.AppSpecServiceLogDestinationDatadogArgs>? Datadog { get; set; }

        /// <summary>
        /// Logtail configuration.
        /// </summary>
        [Input("logtail")]
        public Input<Inputs.AppSpecServiceLogDestinationLogtailArgs>? Logtail { get; set; }

        /// <summary>
        /// The name of the component.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Papertrail configuration.
        /// </summary>
        [Input("papertrail")]
        public Input<Inputs.AppSpecServiceLogDestinationPapertrailArgs>? Papertrail { get; set; }

        public AppSpecServiceLogDestinationArgs()
        {
        }
        public static new AppSpecServiceLogDestinationArgs Empty => new AppSpecServiceLogDestinationArgs();
    }
}
