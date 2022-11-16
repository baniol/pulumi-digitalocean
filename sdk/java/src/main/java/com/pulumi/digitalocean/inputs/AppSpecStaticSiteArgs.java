// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.AppSpecStaticSiteCorsArgs;
import com.pulumi.digitalocean.inputs.AppSpecStaticSiteEnvArgs;
import com.pulumi.digitalocean.inputs.AppSpecStaticSiteGitArgs;
import com.pulumi.digitalocean.inputs.AppSpecStaticSiteGithubArgs;
import com.pulumi.digitalocean.inputs.AppSpecStaticSiteGitlabArgs;
import com.pulumi.digitalocean.inputs.AppSpecStaticSiteRouteArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecStaticSiteArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecStaticSiteArgs Empty = new AppSpecStaticSiteArgs();

    /**
     * An optional build command to run while building this component from source.
     * 
     */
    @Import(name="buildCommand")
    private @Nullable Output<String> buildCommand;

    /**
     * @return An optional build command to run while building this component from source.
     * 
     */
    public Optional<Output<String>> buildCommand() {
        return Optional.ofNullable(this.buildCommand);
    }

    /**
     * The name of the document to use as the fallback for any requests to documents that are not found when serving this static site.
     * 
     */
    @Import(name="catchallDocument")
    private @Nullable Output<String> catchallDocument;

    /**
     * @return The name of the document to use as the fallback for any requests to documents that are not found when serving this static site.
     * 
     */
    public Optional<Output<String>> catchallDocument() {
        return Optional.ofNullable(this.catchallDocument);
    }

    /**
     * The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
     * 
     */
    @Import(name="cors")
    private @Nullable Output<AppSpecStaticSiteCorsArgs> cors;

    /**
     * @return The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
     * 
     */
    public Optional<Output<AppSpecStaticSiteCorsArgs>> cors() {
        return Optional.ofNullable(this.cors);
    }

    /**
     * The path to a Dockerfile relative to the root of the repo. If set, overrides usage of buildpacks.
     * 
     */
    @Import(name="dockerfilePath")
    private @Nullable Output<String> dockerfilePath;

    /**
     * @return The path to a Dockerfile relative to the root of the repo. If set, overrides usage of buildpacks.
     * 
     */
    public Optional<Output<String>> dockerfilePath() {
        return Optional.ofNullable(this.dockerfilePath);
    }

    /**
     * An environment slug describing the type of this app.
     * 
     */
    @Import(name="environmentSlug")
    private @Nullable Output<String> environmentSlug;

    /**
     * @return An environment slug describing the type of this app.
     * 
     */
    public Optional<Output<String>> environmentSlug() {
        return Optional.ofNullable(this.environmentSlug);
    }

    /**
     * Describes an environment variable made available to an app competent.
     * 
     */
    @Import(name="envs")
    private @Nullable Output<List<AppSpecStaticSiteEnvArgs>> envs;

    /**
     * @return Describes an environment variable made available to an app competent.
     * 
     */
    public Optional<Output<List<AppSpecStaticSiteEnvArgs>>> envs() {
        return Optional.ofNullable(this.envs);
    }

    /**
     * The name of the error document to use when serving this static site.
     * 
     */
    @Import(name="errorDocument")
    private @Nullable Output<String> errorDocument;

    /**
     * @return The name of the error document to use when serving this static site.
     * 
     */
    public Optional<Output<String>> errorDocument() {
        return Optional.ofNullable(this.errorDocument);
    }

    /**
     * A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
     * 
     */
    @Import(name="git")
    private @Nullable Output<AppSpecStaticSiteGitArgs> git;

    /**
     * @return A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
     * 
     */
    public Optional<Output<AppSpecStaticSiteGitArgs>> git() {
        return Optional.ofNullable(this.git);
    }

    /**
     * A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    @Import(name="github")
    private @Nullable Output<AppSpecStaticSiteGithubArgs> github;

    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<Output<AppSpecStaticSiteGithubArgs>> github() {
        return Optional.ofNullable(this.github);
    }

    /**
     * A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    @Import(name="gitlab")
    private @Nullable Output<AppSpecStaticSiteGitlabArgs> gitlab;

    /**
     * @return A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<Output<AppSpecStaticSiteGitlabArgs>> gitlab() {
        return Optional.ofNullable(this.gitlab);
    }

    /**
     * The name of the index document to use when serving this static site.
     * 
     */
    @Import(name="indexDocument")
    private @Nullable Output<String> indexDocument;

    /**
     * @return The name of the index document to use when serving this static site.
     * 
     */
    public Optional<Output<String>> indexDocument() {
        return Optional.ofNullable(this.indexDocument);
    }

    /**
     * The name of the component.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the component.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * An optional path to where the built assets will be located, relative to the build context. If not set, App Platform will automatically scan for these directory names: `_static`, `dist`, `public`.
     * 
     */
    @Import(name="outputDir")
    private @Nullable Output<String> outputDir;

    /**
     * @return An optional path to where the built assets will be located, relative to the build context. If not set, App Platform will automatically scan for these directory names: `_static`, `dist`, `public`.
     * 
     */
    public Optional<Output<String>> outputDir() {
        return Optional.ofNullable(this.outputDir);
    }

    @Import(name="routes")
    private @Nullable Output<List<AppSpecStaticSiteRouteArgs>> routes;

    public Optional<Output<List<AppSpecStaticSiteRouteArgs>>> routes() {
        return Optional.ofNullable(this.routes);
    }

    /**
     * An optional path to the working directory to use for the build.
     * 
     */
    @Import(name="sourceDir")
    private @Nullable Output<String> sourceDir;

    /**
     * @return An optional path to the working directory to use for the build.
     * 
     */
    public Optional<Output<String>> sourceDir() {
        return Optional.ofNullable(this.sourceDir);
    }

    private AppSpecStaticSiteArgs() {}

    private AppSpecStaticSiteArgs(AppSpecStaticSiteArgs $) {
        this.buildCommand = $.buildCommand;
        this.catchallDocument = $.catchallDocument;
        this.cors = $.cors;
        this.dockerfilePath = $.dockerfilePath;
        this.environmentSlug = $.environmentSlug;
        this.envs = $.envs;
        this.errorDocument = $.errorDocument;
        this.git = $.git;
        this.github = $.github;
        this.gitlab = $.gitlab;
        this.indexDocument = $.indexDocument;
        this.name = $.name;
        this.outputDir = $.outputDir;
        this.routes = $.routes;
        this.sourceDir = $.sourceDir;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecStaticSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecStaticSiteArgs $;

        public Builder() {
            $ = new AppSpecStaticSiteArgs();
        }

        public Builder(AppSpecStaticSiteArgs defaults) {
            $ = new AppSpecStaticSiteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buildCommand An optional build command to run while building this component from source.
         * 
         * @return builder
         * 
         */
        public Builder buildCommand(@Nullable Output<String> buildCommand) {
            $.buildCommand = buildCommand;
            return this;
        }

        /**
         * @param buildCommand An optional build command to run while building this component from source.
         * 
         * @return builder
         * 
         */
        public Builder buildCommand(String buildCommand) {
            return buildCommand(Output.of(buildCommand));
        }

        /**
         * @param catchallDocument The name of the document to use as the fallback for any requests to documents that are not found when serving this static site.
         * 
         * @return builder
         * 
         */
        public Builder catchallDocument(@Nullable Output<String> catchallDocument) {
            $.catchallDocument = catchallDocument;
            return this;
        }

        /**
         * @param catchallDocument The name of the document to use as the fallback for any requests to documents that are not found when serving this static site.
         * 
         * @return builder
         * 
         */
        public Builder catchallDocument(String catchallDocument) {
            return catchallDocument(Output.of(catchallDocument));
        }

        /**
         * @param cors The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
         * 
         * @return builder
         * 
         */
        public Builder cors(@Nullable Output<AppSpecStaticSiteCorsArgs> cors) {
            $.cors = cors;
            return this;
        }

        /**
         * @param cors The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
         * 
         * @return builder
         * 
         */
        public Builder cors(AppSpecStaticSiteCorsArgs cors) {
            return cors(Output.of(cors));
        }

        /**
         * @param dockerfilePath The path to a Dockerfile relative to the root of the repo. If set, overrides usage of buildpacks.
         * 
         * @return builder
         * 
         */
        public Builder dockerfilePath(@Nullable Output<String> dockerfilePath) {
            $.dockerfilePath = dockerfilePath;
            return this;
        }

        /**
         * @param dockerfilePath The path to a Dockerfile relative to the root of the repo. If set, overrides usage of buildpacks.
         * 
         * @return builder
         * 
         */
        public Builder dockerfilePath(String dockerfilePath) {
            return dockerfilePath(Output.of(dockerfilePath));
        }

        /**
         * @param environmentSlug An environment slug describing the type of this app.
         * 
         * @return builder
         * 
         */
        public Builder environmentSlug(@Nullable Output<String> environmentSlug) {
            $.environmentSlug = environmentSlug;
            return this;
        }

        /**
         * @param environmentSlug An environment slug describing the type of this app.
         * 
         * @return builder
         * 
         */
        public Builder environmentSlug(String environmentSlug) {
            return environmentSlug(Output.of(environmentSlug));
        }

        /**
         * @param envs Describes an environment variable made available to an app competent.
         * 
         * @return builder
         * 
         */
        public Builder envs(@Nullable Output<List<AppSpecStaticSiteEnvArgs>> envs) {
            $.envs = envs;
            return this;
        }

        /**
         * @param envs Describes an environment variable made available to an app competent.
         * 
         * @return builder
         * 
         */
        public Builder envs(List<AppSpecStaticSiteEnvArgs> envs) {
            return envs(Output.of(envs));
        }

        /**
         * @param envs Describes an environment variable made available to an app competent.
         * 
         * @return builder
         * 
         */
        public Builder envs(AppSpecStaticSiteEnvArgs... envs) {
            return envs(List.of(envs));
        }

        /**
         * @param errorDocument The name of the error document to use when serving this static site.
         * 
         * @return builder
         * 
         */
        public Builder errorDocument(@Nullable Output<String> errorDocument) {
            $.errorDocument = errorDocument;
            return this;
        }

        /**
         * @param errorDocument The name of the error document to use when serving this static site.
         * 
         * @return builder
         * 
         */
        public Builder errorDocument(String errorDocument) {
            return errorDocument(Output.of(errorDocument));
        }

        /**
         * @param git A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
         * 
         * @return builder
         * 
         */
        public Builder git(@Nullable Output<AppSpecStaticSiteGitArgs> git) {
            $.git = git;
            return this;
        }

        /**
         * @param git A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
         * 
         * @return builder
         * 
         */
        public Builder git(AppSpecStaticSiteGitArgs git) {
            return git(Output.of(git));
        }

        /**
         * @param github A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder github(@Nullable Output<AppSpecStaticSiteGithubArgs> github) {
            $.github = github;
            return this;
        }

        /**
         * @param github A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder github(AppSpecStaticSiteGithubArgs github) {
            return github(Output.of(github));
        }

        /**
         * @param gitlab A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder gitlab(@Nullable Output<AppSpecStaticSiteGitlabArgs> gitlab) {
            $.gitlab = gitlab;
            return this;
        }

        /**
         * @param gitlab A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder gitlab(AppSpecStaticSiteGitlabArgs gitlab) {
            return gitlab(Output.of(gitlab));
        }

        /**
         * @param indexDocument The name of the index document to use when serving this static site.
         * 
         * @return builder
         * 
         */
        public Builder indexDocument(@Nullable Output<String> indexDocument) {
            $.indexDocument = indexDocument;
            return this;
        }

        /**
         * @param indexDocument The name of the index document to use when serving this static site.
         * 
         * @return builder
         * 
         */
        public Builder indexDocument(String indexDocument) {
            return indexDocument(Output.of(indexDocument));
        }

        /**
         * @param name The name of the component.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the component.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outputDir An optional path to where the built assets will be located, relative to the build context. If not set, App Platform will automatically scan for these directory names: `_static`, `dist`, `public`.
         * 
         * @return builder
         * 
         */
        public Builder outputDir(@Nullable Output<String> outputDir) {
            $.outputDir = outputDir;
            return this;
        }

        /**
         * @param outputDir An optional path to where the built assets will be located, relative to the build context. If not set, App Platform will automatically scan for these directory names: `_static`, `dist`, `public`.
         * 
         * @return builder
         * 
         */
        public Builder outputDir(String outputDir) {
            return outputDir(Output.of(outputDir));
        }

        public Builder routes(@Nullable Output<List<AppSpecStaticSiteRouteArgs>> routes) {
            $.routes = routes;
            return this;
        }

        public Builder routes(List<AppSpecStaticSiteRouteArgs> routes) {
            return routes(Output.of(routes));
        }

        public Builder routes(AppSpecStaticSiteRouteArgs... routes) {
            return routes(List.of(routes));
        }

        /**
         * @param sourceDir An optional path to the working directory to use for the build.
         * 
         * @return builder
         * 
         */
        public Builder sourceDir(@Nullable Output<String> sourceDir) {
            $.sourceDir = sourceDir;
            return this;
        }

        /**
         * @param sourceDir An optional path to the working directory to use for the build.
         * 
         * @return builder
         * 
         */
        public Builder sourceDir(String sourceDir) {
            return sourceDir(Output.of(sourceDir));
        }

        public AppSpecStaticSiteArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}