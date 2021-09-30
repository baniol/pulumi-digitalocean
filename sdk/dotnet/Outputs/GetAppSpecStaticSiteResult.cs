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
    public sealed class GetAppSpecStaticSiteResult
    {
        /// <summary>
        /// An optional build command to run while building this component from source.
        /// </summary>
        public readonly string? BuildCommand;
        /// <summary>
        /// The name of the document to use as the fallback for any requests to documents that are not found when serving this static site.
        /// </summary>
        public readonly string? CatchallDocument;
        public readonly Outputs.GetAppSpecStaticSiteCorsResult? Cors;
        /// <summary>
        /// The path to a Dockerfile relative to the root of the repo. If set, overrides usage of buildpacks.
        /// </summary>
        public readonly string? DockerfilePath;
        /// <summary>
        /// An environment slug describing the type of this app.
        /// </summary>
        public readonly string? EnvironmentSlug;
        /// <summary>
        /// Describes an environment variable made available to an app competent.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAppSpecStaticSiteEnvResult> Envs;
        /// <summary>
        /// The name of the error document to use when serving this static site.
        /// </summary>
        public readonly string? ErrorDocument;
        /// <summary>
        /// A Git repo to use as the component's source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
        /// </summary>
        public readonly Outputs.GetAppSpecStaticSiteGitResult? Git;
        /// <summary>
        /// A GitHub repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        public readonly Outputs.GetAppSpecStaticSiteGithubResult? Github;
        /// <summary>
        /// A Gitlab repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        public readonly Outputs.GetAppSpecStaticSiteGitlabResult? Gitlab;
        /// <summary>
        /// The name of the index document to use when serving this static site.
        /// </summary>
        public readonly string? IndexDocument;
        /// <summary>
        /// The name of the component.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// An optional path to where the built assets will be located, relative to the build context. If not set, App Platform will automatically scan for these directory names: `_static`, `dist`, `public`.
        /// </summary>
        public readonly string? OutputDir;
        public readonly ImmutableArray<Outputs.GetAppSpecStaticSiteRouteResult> Routes;
        /// <summary>
        /// An optional path to the working directory to use for the build.
        /// </summary>
        public readonly string? SourceDir;

        [OutputConstructor]
        private GetAppSpecStaticSiteResult(
            string? buildCommand,

            string? catchallDocument,

            Outputs.GetAppSpecStaticSiteCorsResult? cors,

            string? dockerfilePath,

            string? environmentSlug,

            ImmutableArray<Outputs.GetAppSpecStaticSiteEnvResult> envs,

            string? errorDocument,

            Outputs.GetAppSpecStaticSiteGitResult? git,

            Outputs.GetAppSpecStaticSiteGithubResult? github,

            Outputs.GetAppSpecStaticSiteGitlabResult? gitlab,

            string? indexDocument,

            string name,

            string? outputDir,

            ImmutableArray<Outputs.GetAppSpecStaticSiteRouteResult> routes,

            string? sourceDir)
        {
            BuildCommand = buildCommand;
            CatchallDocument = catchallDocument;
            Cors = cors;
            DockerfilePath = dockerfilePath;
            EnvironmentSlug = environmentSlug;
            Envs = envs;
            ErrorDocument = errorDocument;
            Git = git;
            Github = github;
            Gitlab = gitlab;
            IndexDocument = indexDocument;
            Name = name;
            OutputDir = outputDir;
            Routes = routes;
            SourceDir = sourceDir;
        }
    }
}
