// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Outputs
{

    [OutputType]
    public sealed class GetAppSpecWorkerAlertResult
    {
        /// <summary>
        /// Determines whether or not the alert is disabled (default: `false`).
        /// </summary>
        public readonly bool? Disabled;
        /// <summary>
        /// The operator to use. This is either of `GREATER_THAN` or `LESS_THAN`.
        /// </summary>
        public readonly string Operator;
        /// <summary>
        /// The type of the alert to configure. Component app alert policies can be: `CPU_UTILIZATION`, `MEM_UTILIZATION`, or `RESTART_COUNT`.
        /// </summary>
        public readonly string Rule;
        /// <summary>
        /// The threshold for the type of the warning.
        /// </summary>
        public readonly double Value;
        /// <summary>
        /// The time before alerts should be triggered. This is may be one of: `FIVE_MINUTES`, `TEN_MINUTES`, `THIRTY_MINUTES`, `ONE_HOUR`.
        /// </summary>
        public readonly string Window;

        [OutputConstructor]
        private GetAppSpecWorkerAlertResult(
            bool? disabled,

            string @operator,

            string rule,

            double value,

            string window)
        {
            Disabled = disabled;
            Operator = @operator;
            Rule = rule;
            Value = value;
            Window = window;
        }
    }
}
