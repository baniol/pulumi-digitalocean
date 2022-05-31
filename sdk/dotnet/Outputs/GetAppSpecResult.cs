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
    public sealed class GetAppSpecResult
    {
        /// <summary>
        /// Describes an alert policy for the component.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAppSpecAlertResult> Alerts;
        public readonly ImmutableArray<Outputs.GetAppSpecDatabaseResult> Databases;
        public readonly ImmutableArray<string> Domains;
        /// <summary>
        /// Describes an environment variable made available to an app competent.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAppSpecEnvResult> Envs;
        public readonly ImmutableArray<Outputs.GetAppSpecFunctionResult> Functions;
        public readonly ImmutableArray<Outputs.GetAppSpecJobResult> Jobs;
        /// <summary>
        /// The name of the component.
        /// </summary>
        public readonly string Name;
        public readonly string? Region;
        public readonly ImmutableArray<Outputs.GetAppSpecServiceResult> Services;
        public readonly ImmutableArray<Outputs.GetAppSpecStaticSiteResult> StaticSites;
        public readonly ImmutableArray<Outputs.GetAppSpecWorkerResult> Workers;

        [OutputConstructor]
        private GetAppSpecResult(
            ImmutableArray<Outputs.GetAppSpecAlertResult> alerts,

            ImmutableArray<Outputs.GetAppSpecDatabaseResult> databases,

            ImmutableArray<string> domains,

            ImmutableArray<Outputs.GetAppSpecEnvResult> envs,

            ImmutableArray<Outputs.GetAppSpecFunctionResult> functions,

            ImmutableArray<Outputs.GetAppSpecJobResult> jobs,

            string name,

            string? region,

            ImmutableArray<Outputs.GetAppSpecServiceResult> services,

            ImmutableArray<Outputs.GetAppSpecStaticSiteResult> staticSites,

            ImmutableArray<Outputs.GetAppSpecWorkerResult> workers)
        {
            Alerts = alerts;
            Databases = databases;
            Domains = domains;
            Envs = envs;
            Functions = functions;
            Jobs = jobs;
            Name = name;
            Region = region;
            Services = services;
            StaticSites = staticSites;
            Workers = workers;
        }
    }
}
