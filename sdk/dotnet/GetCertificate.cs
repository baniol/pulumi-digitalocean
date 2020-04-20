// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetCertificate
    {
        public static Task<GetCertificateResult> InvokeAsync(GetCertificateArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetCertificateResult>("digitalocean:index/getCertificate:getCertificate", args ?? new GetCertificateArgs(), options.WithVersion());
    }


    public sealed class GetCertificateArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of certificate.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetCertificateArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetCertificateResult
    {
        public readonly ImmutableArray<string> Domains;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string NotAfter;
        public readonly string Sha1Fingerprint;
        public readonly string State;
        public readonly string Type;

        [OutputConstructor]
        private GetCertificateResult(
            ImmutableArray<string> domains,

            string id,

            string name,

            string notAfter,

            string sha1Fingerprint,

            string state,

            string type)
        {
            Domains = domains;
            Id = id;
            Name = name;
            NotAfter = notAfter;
            Sha1Fingerprint = sha1Fingerprint;
            State = state;
            Type = type;
        }
    }
}