// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetContainerRegistry
    {
        /// <summary>
        /// Get information on a container registry. This data source provides the name as
        /// configured on your DigitalOcean account. This is useful if the container
        /// registry name in question is not managed by this provider or you need validate if
        /// the container registry exists in the account.
        /// 
        /// An error is triggered if the provided container registry name does not exist.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Basic Example
        /// 
        /// Get the container registry:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetContainerRegistry.Invoke(new()
        ///     {
        ///         Name = "example",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetContainerRegistryResult> InvokeAsync(GetContainerRegistryArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetContainerRegistryResult>("digitalocean:index/getContainerRegistry:getContainerRegistry", args ?? new GetContainerRegistryArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on a container registry. This data source provides the name as
        /// configured on your DigitalOcean account. This is useful if the container
        /// registry name in question is not managed by this provider or you need validate if
        /// the container registry exists in the account.
        /// 
        /// An error is triggered if the provided container registry name does not exist.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Basic Example
        /// 
        /// Get the container registry:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetContainerRegistry.Invoke(new()
        ///     {
        ///         Name = "example",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetContainerRegistryResult> Invoke(GetContainerRegistryInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetContainerRegistryResult>("digitalocean:index/getContainerRegistry:getContainerRegistry", args ?? new GetContainerRegistryInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetContainerRegistryArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the container registry.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetContainerRegistryArgs()
        {
        }
        public static new GetContainerRegistryArgs Empty => new GetContainerRegistryArgs();
    }

    public sealed class GetContainerRegistryInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the container registry.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetContainerRegistryInvokeArgs()
        {
        }
        public static new GetContainerRegistryInvokeArgs Empty => new GetContainerRegistryInvokeArgs();
    }


    [OutputType]
    public sealed class GetContainerRegistryResult
    {
        /// <summary>
        /// The date and time when the registry was created
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The URL endpoint of the container registry. Ex: `registry.digitalocean.com/my_registry`
        /// </summary>
        public readonly string Endpoint;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the container registry
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The slug identifier for the  region
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// The domain of the container registry. Ex: `registry.digitalocean.com`
        /// </summary>
        public readonly string ServerUrl;
        /// <summary>
        /// The amount of storage used in the registry in bytes.
        /// </summary>
        public readonly int StorageUsageBytes;
        /// <summary>
        /// The slug identifier for the subscription tier
        /// </summary>
        public readonly string SubscriptionTierSlug;

        [OutputConstructor]
        private GetContainerRegistryResult(
            string createdAt,

            string endpoint,

            string id,

            string name,

            string region,

            string serverUrl,

            int storageUsageBytes,

            string subscriptionTierSlug)
        {
            CreatedAt = createdAt;
            Endpoint = endpoint;
            Id = id;
            Name = name;
            Region = region;
            ServerUrl = serverUrl;
            StorageUsageBytes = storageUsageBytes;
            SubscriptionTierSlug = subscriptionTierSlug;
        }
    }
}
