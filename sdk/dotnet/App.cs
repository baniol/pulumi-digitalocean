// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    /// <summary>
    /// Provides a DigitalOcean App resource.
    /// 
    /// ## Example Usage
    /// 
    /// To create an app, provide a [DigitalOcean app spec](https://docs.digitalocean.com/products/app-platform/reference/app-spec/) specifying the app's components.
    /// ### Basic Example
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var golang_sample = new DigitalOcean.App("golang-sample", new()
    ///     {
    ///         Spec = new DigitalOcean.Inputs.AppSpecArgs
    ///         {
    ///             Name = "golang-sample",
    ///             Region = "ams",
    ///             Services = new[]
    ///             {
    ///                 new DigitalOcean.Inputs.AppSpecServiceArgs
    ///                 {
    ///                     EnvironmentSlug = "go",
    ///                     Git = new DigitalOcean.Inputs.AppSpecServiceGitArgs
    ///                     {
    ///                         Branch = "main",
    ///                         RepoCloneUrl = "https://github.com/digitalocean/sample-golang.git",
    ///                     },
    ///                     InstanceCount = 1,
    ///                     InstanceSizeSlug = "professional-xs",
    ///                     Name = "go-service",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Static Site Example
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var static_ste_example = new DigitalOcean.App("static-ste-example", new()
    ///     {
    ///         Spec = new DigitalOcean.Inputs.AppSpecArgs
    ///         {
    ///             Name = "static-ste-example",
    ///             Region = "ams",
    ///             StaticSites = new[]
    ///             {
    ///                 new DigitalOcean.Inputs.AppSpecStaticSiteArgs
    ///                 {
    ///                     BuildCommand = "bundle exec jekyll build -d ./public",
    ///                     Git = new DigitalOcean.Inputs.AppSpecStaticSiteGitArgs
    ///                     {
    ///                         Branch = "main",
    ///                         RepoCloneUrl = "https://github.com/digitalocean/sample-jekyll.git",
    ///                     },
    ///                     Name = "sample-jekyll",
    ///                     OutputDir = "/public",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// An app can be imported using its `id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import digitalocean:index/app:App myapp fb06ad00-351f-45c8-b5eb-13523c438661
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/app:App")]
    public partial class App : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID the app's currently active deployment.
        /// </summary>
        [Output("activeDeploymentId")]
        public Output<string> ActiveDeploymentId { get; private set; } = null!;

        /// <summary>
        /// The date and time of when the app was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// The default URL to access the app.
        /// </summary>
        [Output("defaultIngress")]
        public Output<string> DefaultIngress { get; private set; } = null!;

        /// <summary>
        /// The live URL of the app.
        /// </summary>
        [Output("liveUrl")]
        public Output<string> LiveUrl { get; private set; } = null!;

        /// <summary>
        /// A DigitalOcean App spec describing the app.
        /// </summary>
        [Output("spec")]
        public Output<Outputs.AppSpec?> Spec { get; private set; } = null!;

        /// <summary>
        /// The date and time of when the app was last updated.
        /// </summary>
        [Output("updatedAt")]
        public Output<string> UpdatedAt { get; private set; } = null!;

        /// <summary>
        /// The uniform resource identifier for the app.
        /// </summary>
        [Output("urn")]
        public Output<string> Urn { get; private set; } = null!;


        /// <summary>
        /// Create a App resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public App(string name, AppArgs? args = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/app:App", name, args ?? new AppArgs(), MakeResourceOptions(options, ""))
        {
        }

        private App(string name, Input<string> id, AppState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/app:App", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing App resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static App Get(string name, Input<string> id, AppState? state = null, CustomResourceOptions? options = null)
        {
            return new App(name, id, state, options);
        }
    }

    public sealed class AppArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A DigitalOcean App spec describing the app.
        /// </summary>
        [Input("spec")]
        public Input<Inputs.AppSpecArgs>? Spec { get; set; }

        public AppArgs()
        {
        }
        public static new AppArgs Empty => new AppArgs();
    }

    public sealed class AppState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID the app's currently active deployment.
        /// </summary>
        [Input("activeDeploymentId")]
        public Input<string>? ActiveDeploymentId { get; set; }

        /// <summary>
        /// The date and time of when the app was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// The default URL to access the app.
        /// </summary>
        [Input("defaultIngress")]
        public Input<string>? DefaultIngress { get; set; }

        /// <summary>
        /// The live URL of the app.
        /// </summary>
        [Input("liveUrl")]
        public Input<string>? LiveUrl { get; set; }

        /// <summary>
        /// A DigitalOcean App spec describing the app.
        /// </summary>
        [Input("spec")]
        public Input<Inputs.AppSpecGetArgs>? Spec { get; set; }

        /// <summary>
        /// The date and time of when the app was last updated.
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        /// <summary>
        /// The uniform resource identifier for the app.
        /// </summary>
        [Input("urn")]
        public Input<string>? Urn { get; set; }

        public AppState()
        {
        }
        public static new AppState Empty => new AppState();
    }
}
