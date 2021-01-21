// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecEnvArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the environment variable.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The visibility scope of the environment variable. One of `RUN_TIME`, `BUILD_TIME`, or `RUN_AND_BUILD_TIME` (default).
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        /// <summary>
        /// The type of the environment variable, `GENERAL` or `SECRET`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The value of the environment variable.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public AppSpecEnvArgs()
        {
        }
    }
}
