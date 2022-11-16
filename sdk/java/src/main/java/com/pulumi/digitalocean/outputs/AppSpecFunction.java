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
    private @Nullable List<AppSpecFunctionAlert> alerts;
    /**
     * @return The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
     * 
     */
    private @Nullable AppSpecFunctionCors cors;
    /**
     * @return Describes an environment variable made available to an app competent.
     * 
     */
    private @Nullable List<AppSpecFunctionEnv> envs;
    /**
     * @return A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
     * 
     */
    private @Nullable AppSpecFunctionGit git;
    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    private @Nullable AppSpecFunctionGithub github;
    /**
     * @return A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    private @Nullable AppSpecFunctionGitlab gitlab;
    /**
     * @return Describes a log forwarding destination.
     * 
     */
    private @Nullable List<AppSpecFunctionLogDestination> logDestinations;
    /**
     * @return The name of the component.
     * 
     */
    private String name;
    private @Nullable List<AppSpecFunctionRoute> routes;
    /**
     * @return An optional path to the working directory to use for the build.
     * 
     */
    private @Nullable String sourceDir;

    private AppSpecFunction() {}
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
    @CustomType.Builder
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
        public Builder() {}
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

        @CustomType.Setter
        public Builder alerts(@Nullable List<AppSpecFunctionAlert> alerts) {
            this.alerts = alerts;
            return this;
        }
        public Builder alerts(AppSpecFunctionAlert... alerts) {
            return alerts(List.of(alerts));
        }
        @CustomType.Setter
        public Builder cors(@Nullable AppSpecFunctionCors cors) {
            this.cors = cors;
            return this;
        }
        @CustomType.Setter
        public Builder envs(@Nullable List<AppSpecFunctionEnv> envs) {
            this.envs = envs;
            return this;
        }
        public Builder envs(AppSpecFunctionEnv... envs) {
            return envs(List.of(envs));
        }
        @CustomType.Setter
        public Builder git(@Nullable AppSpecFunctionGit git) {
            this.git = git;
            return this;
        }
        @CustomType.Setter
        public Builder github(@Nullable AppSpecFunctionGithub github) {
            this.github = github;
            return this;
        }
        @CustomType.Setter
        public Builder gitlab(@Nullable AppSpecFunctionGitlab gitlab) {
            this.gitlab = gitlab;
            return this;
        }
        @CustomType.Setter
        public Builder logDestinations(@Nullable List<AppSpecFunctionLogDestination> logDestinations) {
            this.logDestinations = logDestinations;
            return this;
        }
        public Builder logDestinations(AppSpecFunctionLogDestination... logDestinations) {
            return logDestinations(List.of(logDestinations));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder routes(@Nullable List<AppSpecFunctionRoute> routes) {
            this.routes = routes;
            return this;
        }
        public Builder routes(AppSpecFunctionRoute... routes) {
            return routes(List.of(routes));
        }
        @CustomType.Setter
        public Builder sourceDir(@Nullable String sourceDir) {
            this.sourceDir = sourceDir;
            return this;
        }
        public AppSpecFunction build() {
            final var o = new AppSpecFunction();
            o.alerts = alerts;
            o.cors = cors;
            o.envs = envs;
            o.git = git;
            o.github = github;
            o.gitlab = gitlab;
            o.logDestinations = logDestinations;
            o.name = name;
            o.routes = routes;
            o.sourceDir = sourceDir;
            return o;
        }
    }
}