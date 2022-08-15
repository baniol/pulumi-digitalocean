// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class GetSizesFilterInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set to `true` to require that a field match all of the `values` instead of just one or more of
        /// them. This is useful when matching against multi-valued fields such as lists or sets where you want to ensure
        /// that all of the `values` are present in the list or set.
        /// </summary>
        [Input("all")]
        public Input<bool>? All { get; set; }

        /// <summary>
        /// Filter the sizes by this key. This may be one of `slug`,
        /// `regions`, `memory`, `vcpus`, `disk`, `transfer`, `price_monthly`,
        /// `price_hourly`, or `available`.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// One of `exact` (default), `re`, or `substring`. For string-typed fields, specify `re` to
        /// match by using the `values` as regular expressions, or specify `substring` to match by treating the `values` as
        /// substrings to find within the string field.
        /// </summary>
        [Input("matchBy")]
        public Input<string>? MatchBy { get; set; }

        [Input("values", required: true)]
        private InputList<string>? _values;

        /// <summary>
        /// Only retrieves sizes which keys has value that matches
        /// one of the values provided here.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public GetSizesFilterInputArgs()
        {
        }
        public static new GetSizesFilterInputArgs Empty => new GetSizesFilterInputArgs();
    }
}
