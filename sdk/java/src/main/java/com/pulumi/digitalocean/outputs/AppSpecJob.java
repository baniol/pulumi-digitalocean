// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.AppSpecJobAlert;
import com.pulumi.digitalocean.outputs.AppSpecJobEnv;
import com.pulumi.digitalocean.outputs.AppSpecJobGit;
import com.pulumi.digitalocean.outputs.AppSpecJobGithub;
import com.pulumi.digitalocean.outputs.AppSpecJobGitlab;
import com.pulumi.digitalocean.outputs.AppSpecJobImage;
import com.pulumi.digitalocean.outputs.AppSpecJobLogDestination;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecJob {
    /**
     * @return Describes an alert policy for the component.
     * 
     */
    private final @Nullable List<AppSpecJobAlert> alerts;
    /**
     * @return An optional build command to run while building this component from source.
     * 
     */
    private final @Nullable String buildCommand;
    /**
     * @return The path to a Dockerfile relative to the root of the repo. If set, overrides usage of buildpacks.
     * 
     */
    private final @Nullable String dockerfilePath;
    /**
     * @return An environment slug describing the type of this app.
     * 
     */
    private final @Nullable String environmentSlug;
    /**
     * @return Describes an environment variable made available to an app competent.
     * 
     */
    private final @Nullable List<AppSpecJobEnv> envs;
    /**
     * @return A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
     * 
     */
    private final @Nullable AppSpecJobGit git;
    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    private final @Nullable AppSpecJobGithub github;
    /**
     * @return A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    private final @Nullable AppSpecJobGitlab gitlab;
    /**
     * @return An image to use as the component&#39;s source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    private final @Nullable AppSpecJobImage image;
    /**
     * @return The amount of instances that this component should be scaled to.
     * 
     */
    private final @Nullable Integer instanceCount;
    /**
     * @return The instance size to use for this component. This determines the plan (basic or professional) and the available CPU and memory. The list of available instance sizes can be [found with the API](https://docs.digitalocean.com/reference/api/api-reference/#operation/list_instance_sizes) or using the [doctl CLI](https://docs.digitalocean.com/reference/doctl/) (`doctl apps tier instance-size list`). Default: `basic-xxs`
     * 
     */
    private final @Nullable String instanceSizeSlug;
    /**
     * @return The type of job and when it will be run during the deployment process. It may be one of:
     * - `UNSPECIFIED`: Default job type, will auto-complete to POST_DEPLOY kind.
     * - `PRE_DEPLOY`: Indicates a job that runs before an app deployment.
     * - `POST_DEPLOY`: Indicates a job that runs after an app deployment.
     * - `FAILED_DEPLOY`: Indicates a job that runs after a component fails to deploy.
     * 
     */
    private final @Nullable String kind;
    /**
     * @return Describes a log forwarding destination.
     * 
     */
    private final @Nullable List<AppSpecJobLogDestination> logDestinations;
    /**
     * @return The name of the component.
     * 
     */
    private final String name;
    /**
     * @return An optional run command to override the component&#39;s default.
     * 
     */
    private final @Nullable String runCommand;
    /**
     * @return An optional path to the working directory to use for the build.
     * 
     */
    private final @Nullable String sourceDir;

    @CustomType.Constructor
    private AppSpecJob(
        @CustomType.Parameter("alerts") @Nullable List<AppSpecJobAlert> alerts,
        @CustomType.Parameter("buildCommand") @Nullable String buildCommand,
        @CustomType.Parameter("dockerfilePath") @Nullable String dockerfilePath,
        @CustomType.Parameter("environmentSlug") @Nullable String environmentSlug,
        @CustomType.Parameter("envs") @Nullable List<AppSpecJobEnv> envs,
        @CustomType.Parameter("git") @Nullable AppSpecJobGit git,
        @CustomType.Parameter("github") @Nullable AppSpecJobGithub github,
        @CustomType.Parameter("gitlab") @Nullable AppSpecJobGitlab gitlab,
        @CustomType.Parameter("image") @Nullable AppSpecJobImage image,
        @CustomType.Parameter("instanceCount") @Nullable Integer instanceCount,
        @CustomType.Parameter("instanceSizeSlug") @Nullable String instanceSizeSlug,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("logDestinations") @Nullable List<AppSpecJobLogDestination> logDestinations,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("runCommand") @Nullable String runCommand,
        @CustomType.Parameter("sourceDir") @Nullable String sourceDir) {
        this.alerts = alerts;
        this.buildCommand = buildCommand;
        this.dockerfilePath = dockerfilePath;
        this.environmentSlug = environmentSlug;
        this.envs = envs;
        this.git = git;
        this.github = github;
        this.gitlab = gitlab;
        this.image = image;
        this.instanceCount = instanceCount;
        this.instanceSizeSlug = instanceSizeSlug;
        this.kind = kind;
        this.logDestinations = logDestinations;
        this.name = name;
        this.runCommand = runCommand;
        this.sourceDir = sourceDir;
    }

    /**
     * @return Describes an alert policy for the component.
     * 
     */
    public List<AppSpecJobAlert> alerts() {
        return this.alerts == null ? List.of() : this.alerts;
    }
    /**
     * @return An optional build command to run while building this component from source.
     * 
     */
    public Optional<String> buildCommand() {
        return Optional.ofNullable(this.buildCommand);
    }
    /**
     * @return The path to a Dockerfile relative to the root of the repo. If set, overrides usage of buildpacks.
     * 
     */
    public Optional<String> dockerfilePath() {
        return Optional.ofNullable(this.dockerfilePath);
    }
    /**
     * @return An environment slug describing the type of this app.
     * 
     */
    public Optional<String> environmentSlug() {
        return Optional.ofNullable(this.environmentSlug);
    }
    /**
     * @return Describes an environment variable made available to an app competent.
     * 
     */
    public List<AppSpecJobEnv> envs() {
        return this.envs == null ? List.of() : this.envs;
    }
    /**
     * @return A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
     * 
     */
    public Optional<AppSpecJobGit> git() {
        return Optional.ofNullable(this.git);
    }
    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<AppSpecJobGithub> github() {
        return Optional.ofNullable(this.github);
    }
    /**
     * @return A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<AppSpecJobGitlab> gitlab() {
        return Optional.ofNullable(this.gitlab);
    }
    /**
     * @return An image to use as the component&#39;s source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<AppSpecJobImage> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return The amount of instances that this component should be scaled to.
     * 
     */
    public Optional<Integer> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }
    /**
     * @return The instance size to use for this component. This determines the plan (basic or professional) and the available CPU and memory. The list of available instance sizes can be [found with the API](https://docs.digitalocean.com/reference/api/api-reference/#operation/list_instance_sizes) or using the [doctl CLI](https://docs.digitalocean.com/reference/doctl/) (`doctl apps tier instance-size list`). Default: `basic-xxs`
     * 
     */
    public Optional<String> instanceSizeSlug() {
        return Optional.ofNullable(this.instanceSizeSlug);
    }
    /**
     * @return The type of job and when it will be run during the deployment process. It may be one of:
     * - `UNSPECIFIED`: Default job type, will auto-complete to POST_DEPLOY kind.
     * - `PRE_DEPLOY`: Indicates a job that runs before an app deployment.
     * - `POST_DEPLOY`: Indicates a job that runs after an app deployment.
     * - `FAILED_DEPLOY`: Indicates a job that runs after a component fails to deploy.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Describes a log forwarding destination.
     * 
     */
    public List<AppSpecJobLogDestination> logDestinations() {
        return this.logDestinations == null ? List.of() : this.logDestinations;
    }
    /**
     * @return The name of the component.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return An optional run command to override the component&#39;s default.
     * 
     */
    public Optional<String> runCommand() {
        return Optional.ofNullable(this.runCommand);
    }
    /**
     * @return An optional path to the working directory to use for the build.
     * 
     */
    public Optional<String> sourceDir() {
        return Optional.ofNullable(this.sourceDir);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecJob defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AppSpecJobAlert> alerts;
        private @Nullable String buildCommand;
        private @Nullable String dockerfilePath;
        private @Nullable String environmentSlug;
        private @Nullable List<AppSpecJobEnv> envs;
        private @Nullable AppSpecJobGit git;
        private @Nullable AppSpecJobGithub github;
        private @Nullable AppSpecJobGitlab gitlab;
        private @Nullable AppSpecJobImage image;
        private @Nullable Integer instanceCount;
        private @Nullable String instanceSizeSlug;
        private @Nullable String kind;
        private @Nullable List<AppSpecJobLogDestination> logDestinations;
        private String name;
        private @Nullable String runCommand;
        private @Nullable String sourceDir;

        public Builder() {
    	      // Empty
        }

        public Builder(AppSpecJob defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alerts = defaults.alerts;
    	      this.buildCommand = defaults.buildCommand;
    	      this.dockerfilePath = defaults.dockerfilePath;
    	      this.environmentSlug = defaults.environmentSlug;
    	      this.envs = defaults.envs;
    	      this.git = defaults.git;
    	      this.github = defaults.github;
    	      this.gitlab = defaults.gitlab;
    	      this.image = defaults.image;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceSizeSlug = defaults.instanceSizeSlug;
    	      this.kind = defaults.kind;
    	      this.logDestinations = defaults.logDestinations;
    	      this.name = defaults.name;
    	      this.runCommand = defaults.runCommand;
    	      this.sourceDir = defaults.sourceDir;
        }

        public Builder alerts(@Nullable List<AppSpecJobAlert> alerts) {
            this.alerts = alerts;
            return this;
        }
        public Builder alerts(AppSpecJobAlert... alerts) {
            return alerts(List.of(alerts));
        }
        public Builder buildCommand(@Nullable String buildCommand) {
            this.buildCommand = buildCommand;
            return this;
        }
        public Builder dockerfilePath(@Nullable String dockerfilePath) {
            this.dockerfilePath = dockerfilePath;
            return this;
        }
        public Builder environmentSlug(@Nullable String environmentSlug) {
            this.environmentSlug = environmentSlug;
            return this;
        }
        public Builder envs(@Nullable List<AppSpecJobEnv> envs) {
            this.envs = envs;
            return this;
        }
        public Builder envs(AppSpecJobEnv... envs) {
            return envs(List.of(envs));
        }
        public Builder git(@Nullable AppSpecJobGit git) {
            this.git = git;
            return this;
        }
        public Builder github(@Nullable AppSpecJobGithub github) {
            this.github = github;
            return this;
        }
        public Builder gitlab(@Nullable AppSpecJobGitlab gitlab) {
            this.gitlab = gitlab;
            return this;
        }
        public Builder image(@Nullable AppSpecJobImage image) {
            this.image = image;
            return this;
        }
        public Builder instanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Builder instanceSizeSlug(@Nullable String instanceSizeSlug) {
            this.instanceSizeSlug = instanceSizeSlug;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder logDestinations(@Nullable List<AppSpecJobLogDestination> logDestinations) {
            this.logDestinations = logDestinations;
            return this;
        }
        public Builder logDestinations(AppSpecJobLogDestination... logDestinations) {
            return logDestinations(List.of(logDestinations));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder runCommand(@Nullable String runCommand) {
            this.runCommand = runCommand;
            return this;
        }
        public Builder sourceDir(@Nullable String sourceDir) {
            this.sourceDir = sourceDir;
            return this;
        }        public AppSpecJob build() {
            return new AppSpecJob(alerts, buildCommand, dockerfilePath, environmentSlug, envs, git, github, gitlab, image, instanceCount, instanceSizeSlug, kind, logDestinations, name, runCommand, sourceDir);
        }
    }
}
