// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Pulumi.DigitalOcean
{
    public static class Config
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly Pulumi.Config __config = new Pulumi.Config("digitalocean");

        private static readonly __Value<string?> _apiEndpoint = new __Value<string?>(() => __config.Get("apiEndpoint") ?? Utilities.GetEnv("DIGITALOCEAN_API_URL") ?? "https://api.digitalocean.com");
        /// <summary>
        /// The URL to use for the DigitalOcean API.
        /// </summary>
        public static string? ApiEndpoint
        {
            get => _apiEndpoint.Get();
            set => _apiEndpoint.Set(value);
        }

        private static readonly __Value<string?> _spacesAccessId = new __Value<string?>(() => __config.Get("spacesAccessId"));
        /// <summary>
        /// The access key ID for Spaces API operations.
        /// </summary>
        public static string? SpacesAccessId
        {
            get => _spacesAccessId.Get();
            set => _spacesAccessId.Set(value);
        }

        private static readonly __Value<string?> _spacesEndpoint = new __Value<string?>(() => __config.Get("spacesEndpoint") ?? Utilities.GetEnv("SPACES_ENDPOINT_URL"));
        /// <summary>
        /// The URL to use for the DigitalOcean Spaces API.
        /// </summary>
        public static string? SpacesEndpoint
        {
            get => _spacesEndpoint.Get();
            set => _spacesEndpoint.Set(value);
        }

        private static readonly __Value<string?> _spacesSecretKey = new __Value<string?>(() => __config.Get("spacesSecretKey"));
        /// <summary>
        /// The secret access key for Spaces API operations.
        /// </summary>
        public static string? SpacesSecretKey
        {
            get => _spacesSecretKey.Get();
            set => _spacesSecretKey.Set(value);
        }

        private static readonly __Value<string?> _token = new __Value<string?>(() => __config.Get("token"));
        /// <summary>
        /// The token key for API operations.
        /// </summary>
        public static string? Token
        {
            get => _token.Get();
            set => _token.Set(value);
        }

    }
}
