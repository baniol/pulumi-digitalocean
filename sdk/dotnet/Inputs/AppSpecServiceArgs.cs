// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecServiceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// An optional build command to run while building this component from source.
        /// </summary>
        [Input("buildCommand")]
        public Input<string>? BuildCommand { get; set; }

        /// <summary>
        /// The path to a Dockerfile relative to the root of the repo. If set, overrides usage of buildpacks.
        /// </summary>
        [Input("dockerfilePath")]
        public Input<string>? DockerfilePath { get; set; }

        /// <summary>
        /// An environment slug describing the type of this app.
        /// </summary>
        [Input("environmentSlug")]
        public Input<string>? EnvironmentSlug { get; set; }

        [Input("envs")]
        private InputList<Inputs.AppSpecServiceEnvArgs>? _envs;

        /// <summary>
        /// Describes an environment variable made available to an app competent.
        /// </summary>
        public InputList<Inputs.AppSpecServiceEnvArgs> Envs
        {
            get => _envs ?? (_envs = new InputList<Inputs.AppSpecServiceEnvArgs>());
            set => _envs = value;
        }

        /// <summary>
        /// A Git repo to use as the component's source. The repository must be able to be cloned without authentication. Only one of `git` and `github` may be set.
        /// </summary>
        [Input("git")]
        public Input<Inputs.AppSpecServiceGitArgs>? Git { get; set; }

        /// <summary>
        /// A GitHub repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git` and `github` may be set.
        /// </summary>
        [Input("github")]
        public Input<Inputs.AppSpecServiceGithubArgs>? Github { get; set; }

        [Input("gitlab")]
        public Input<Inputs.AppSpecServiceGitlabArgs>? Gitlab { get; set; }

        /// <summary>
        /// A health check to determine the availability of this component.
        /// </summary>
        [Input("healthCheck")]
        public Input<Inputs.AppSpecServiceHealthCheckArgs>? HealthCheck { get; set; }

        /// <summary>
        /// The internal port on which this service's run command will listen.
        /// </summary>
        [Input("httpPort")]
        public Input<int>? HttpPort { get; set; }

        /// <summary>
        /// The amount of instances that this component should be scaled to.
        /// </summary>
        [Input("instanceCount")]
        public Input<int>? InstanceCount { get; set; }

        /// <summary>
        /// The instance size to use for this component.
        /// </summary>
        [Input("instanceSizeSlug")]
        public Input<string>? InstanceSizeSlug { get; set; }

        /// <summary>
        /// The name of the component.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("routes")]
        public Input<Inputs.AppSpecServiceRoutesArgs>? Routes { get; set; }

        /// <summary>
        /// An optional run command to override the component's default.
        /// </summary>
        [Input("runCommand")]
        public Input<string>? RunCommand { get; set; }

        /// <summary>
        /// An optional path to the working directory to use for the build.
        /// </summary>
        [Input("sourceDir")]
        public Input<string>? SourceDir { get; set; }

        public AppSpecServiceArgs()
        {
        }
    }
}
