// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecFunctionAlertGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines whether or not the alert is disabled (default: `false`).
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The operator to use. This is either of `GREATER_THAN` or `LESS_THAN`.
        /// </summary>
        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        /// <summary>
        /// The type of the alert to configure. Component app alert policies can be: `CPU_UTILIZATION`, `MEM_UTILIZATION`, or `RESTART_COUNT`.
        /// </summary>
        [Input("rule", required: true)]
        public Input<string> Rule { get; set; } = null!;

        /// <summary>
        /// The threshold for the type of the warning.
        /// </summary>
        [Input("value", required: true)]
        public Input<double> Value { get; set; } = null!;

        /// <summary>
        /// The time before alerts should be triggered. This is may be one of: `FIVE_MINUTES`, `TEN_MINUTES`, `THIRTY_MINUTES`, `ONE_HOUR`.
        /// </summary>
        [Input("window", required: true)]
        public Input<string> Window { get; set; } = null!;

        public AppSpecFunctionAlertGetArgs()
        {
        }
        public static new AppSpecFunctionAlertGetArgs Empty => new AppSpecFunctionAlertGetArgs();
    }
}
