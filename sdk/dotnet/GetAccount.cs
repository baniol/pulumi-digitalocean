// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetAccount
    {
        /// <summary>
        /// Get information on your DigitalOcean account.
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAccountResult> InvokeAsync(InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAccountResult>("digitalocean:index/getAccount:getAccount", InvokeArgs.Empty, options.WithVersion());
    }


    [OutputType]
    public sealed class GetAccountResult
    {
        public readonly int DropletLimit;
        public readonly string Email;
        public readonly bool EmailVerified;
        public readonly int FloatingIpLimit;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Status;
        public readonly string StatusMessage;
        public readonly string Uuid;

        [OutputConstructor]
        private GetAccountResult(
            int dropletLimit,

            string email,

            bool emailVerified,

            int floatingIpLimit,

            string id,

            string status,

            string statusMessage,

            string uuid)
        {
            DropletLimit = dropletLimit;
            Email = email;
            EmailVerified = emailVerified;
            FloatingIpLimit = floatingIpLimit;
            Id = id;
            Status = status;
            StatusMessage = statusMessage;
            Uuid = uuid;
        }
    }
}
