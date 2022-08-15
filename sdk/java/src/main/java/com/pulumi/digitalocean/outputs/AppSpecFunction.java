// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.AppSpecFunctionAlert;
import com.pulumi.digitalocean.outputs.AppSpecFunctionCors;
import com.pulumi.digitalocean.outputs.AppSpecFunctionEnv;
import com.pulumi.digitalocean.outputs.AppSpecFunctionGit;
import com.pulumi.digitalocean.outputs.AppSpecFunctionGithub;
import com.pulumi.digitalocean.outputs.AppSpecFunctionGitlab;
import com.pulumi.digitalocean.outputs.AppSpecFunctionLogDestination;
import com.pulumi.digitalocean.outputs.AppSpecFunctionRoute;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecFunction {
    /**
     * @return Describes an alert policy for the component.
     * 
     */
    private final @Nullable List<AppSpecFunctionAlert> alerts;
    /**
     * @return The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
     * 
     */
    private final @Nullable AppSpecFunctionCors cors;
    /**
     * @return Describes an environment variable made available to an app competent.
     * 
     */
    private final @Nullable List<AppSpecFunctionEnv> envs;
    /**
     * @return A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
     * 
     */
    private final @Nullable AppSpecFunctionGit git;
    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    private final @Nullable AppSpecFunctionGithub github;
    /**
     * @return A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    private final @Nullable AppSpecFunctionGitlab gitlab;
    /**
     * @return Describes a log forwarding destination.
     * 
     */
    private final @Nullable List<AppSpecFunctionLogDestination> logDestinations;
    /**
     * @return The name of the component.
     * 
     */
    private final String name;
    private final @Nullable List<AppSpecFunctionRoute> routes;
    /**
     * @return An optional path to the working directory to use for the build.
     * 
     */
    private final @Nullable String sourceDir;

    @CustomType.Constructor
    private AppSpecFunction(
        @CustomType.Parameter("alerts") @Nullable List<AppSpecFunctionAlert> alerts,
        @CustomType.Parameter("cors") @Nullable AppSpecFunctionCors cors,
        @CustomType.Parameter("envs") @Nullable List<AppSpecFunctionEnv> envs,
        @CustomType.Parameter("git") @Nullable AppSpecFunctionGit git,
        @CustomType.Parameter("github") @Nullable AppSpecFunctionGithub github,
        @CustomType.Parameter("gitlab") @Nullable AppSpecFunctionGitlab gitlab,
        @CustomType.Parameter("logDestinations") @Nullable List<AppSpecFunctionLogDestination> logDestinations,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("routes") @Nullable List<AppSpecFunctionRoute> routes,
        @CustomType.Parameter("sourceDir") @Nullable String sourceDir) {
        this.alerts = alerts;
        this.cors = cors;
        this.envs = envs;
        this.git = git;
        this.github = github;
        this.gitlab = gitlab;
        this.logDestinations = logDestinations;
        this.name = name;
        this.routes = routes;
        this.sourceDir = sourceDir;
    }

    /**
     * @return Describes an alert policy for the component.
     * 
     */
    public List<AppSpecFunctionAlert> alerts() {
        return this.alerts == null ? List.of() : this.alerts;
    }
    /**
     * @return The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
     * 
     */
    public Optional<AppSpecFunctionCors> cors() {
        return Optional.ofNullable(this.cors);
    }
    /**
     * @return Describes an environment variable made available to an app competent.
     * 
     */
    public List<AppSpecFunctionEnv> envs() {
        return this.envs == null ? List.of() : this.envs;
    }
    /**
     * @return A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
     * 
     */
    public Optional<AppSpecFunctionGit> git() {
        return Optional.ofNullable(this.git);
    }
    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<AppSpecFunctionGithub> github() {
        return Optional.ofNullable(this.github);
    }
    /**
     * @return A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<AppSpecFunctionGitlab> gitlab() {
        return Optional.ofNullable(this.gitlab);
    }
    /**
     * @return Describes a log forwarding destination.
     * 
     */
    public List<AppSpecFunctionLogDestination> logDestinations() {
        return this.logDestinations == null ? List.of() : this.logDestinations;
    }
    /**
     * @return The name of the component.
     * 
     */
    public String name() {
        return this.name;
    }
    public List<AppSpecFunctionRoute> routes() {
        return this.routes == null ? List.of() : this.routes;
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

    public static Builder builder(AppSpecFunction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AppSpecFunctionAlert> alerts;
        private @Nullable AppSpecFunctionCors cors;
        private @Nullable List<AppSpecFunctionEnv> envs;
        private @Nullable AppSpecFunctionGit git;
        private @Nullable AppSpecFunctionGithub github;
        private @Nullable AppSpecFunctionGitlab gitlab;
        private @Nullable List<AppSpecFunctionLogDestination> logDestinations;
        private String name;
        private @Nullable List<AppSpecFunctionRoute> routes;
        private @Nullable String sourceDir;

        public Builder() {
    	      // Empty
        }

        public Builder(AppSpecFunction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alerts = defaults.alerts;
    	      this.cors = defaults.cors;
    	      this.envs = defaults.envs;
    	      this.git = defaults.git;
    	      this.github = defaults.github;
    	      this.gitlab = defaults.gitlab;
    	      this.logDestinations = defaults.logDestinations;
    	      this.name = defaults.name;
    	      this.routes = defaults.routes;
    	      this.sourceDir = defaults.sourceDir;
        }

        public Builder alerts(@Nullable List<AppSpecFunctionAlert> alerts) {
            this.alerts = alerts;
            return this;
        }
        public Builder alerts(AppSpecFunctionAlert... alerts) {
            return alerts(List.of(alerts));
        }
        public Builder cors(@Nullable AppSpecFunctionCors cors) {
            this.cors = cors;
            return this;
        }
        public Builder envs(@Nullable List<AppSpecFunctionEnv> envs) {
            this.envs = envs;
            return this;
        }
        public Builder envs(AppSpecFunctionEnv... envs) {
            return envs(List.of(envs));
        }
        public Builder git(@Nullable AppSpecFunctionGit git) {
            this.git = git;
            return this;
        }
        public Builder github(@Nullable AppSpecFunctionGithub github) {
            this.github = github;
            return this;
        }
        public Builder gitlab(@Nullable AppSpecFunctionGitlab gitlab) {
            this.gitlab = gitlab;
            return this;
        }
        public Builder logDestinations(@Nullable List<AppSpecFunctionLogDestination> logDestinations) {
            this.logDestinations = logDestinations;
            return this;
        }
        public Builder logDestinations(AppSpecFunctionLogDestination... logDestinations) {
            return logDestinations(List.of(logDestinations));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder routes(@Nullable List<AppSpecFunctionRoute> routes) {
            this.routes = routes;
            return this;
        }
        public Builder routes(AppSpecFunctionRoute... routes) {
            return routes(List.of(routes));
        }
        public Builder sourceDir(@Nullable String sourceDir) {
            this.sourceDir = sourceDir;
            return this;
        }        public AppSpecFunction build() {
            return new AppSpecFunction(alerts, cors, envs, git, github, gitlab, logDestinations, name, routes, sourceDir);
        }
    }
}
