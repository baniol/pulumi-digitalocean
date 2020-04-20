// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetTag
    {
        public static Task<GetTagResult> InvokeAsync(GetTagArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetTagResult>("digitalocean:index/getTag:getTag", args ?? new GetTagArgs(), options.WithVersion());
    }


    public sealed class GetTagArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the tag.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetTagArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetTagResult
    {
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetTagResult(
            string id,

            string name)
        {
            Id = id;
            Name = name;
        }
    }
}