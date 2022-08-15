// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecStaticSiteCorsAllowOriginsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The `Access-Control-Allow-Origin` header will be set to the client's origin only if the client's origin exactly matches the value you provide.
        /// </summary>
        [Input("exact")]
        public Input<string>? Exact { get; set; }

        /// <summary>
        /// The `Access-Control-Allow-Origin` header will be set to the client's origin if the beginning of the client's origin matches the value you provide.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// The `Access-Control-Allow-Origin` header will be set to the client's origin if the client’s origin matches the regex you provide, in [RE2 style syntax](https://github.com/google/re2/wiki/Syntax).
        /// </summary>
        [Input("regex")]
        public Input<string>? Regex { get; set; }

        public AppSpecStaticSiteCorsAllowOriginsGetArgs()
        {
        }
        public static new AppSpecStaticSiteCorsAllowOriginsGetArgs Empty => new AppSpecStaticSiteCorsAllowOriginsGetArgs();
    }
}
