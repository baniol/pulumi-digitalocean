// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecWorkerGitlab {
    /**
     * @return The name of the branch to use.
     * 
     */
    private final @Nullable String branch;
    /**
     * @return Whether to automatically deploy new commits made to the repo.
     * 
     */
    private final @Nullable Boolean deployOnPush;
    /**
     * @return The name of the repo in the format `owner/repo`.
     * 
     */
    private final @Nullable String repo;

    @CustomType.Constructor
    private AppSpecWorkerGitlab(
        @CustomType.Parameter("branch") @Nullable String branch,
        @CustomType.Parameter("deployOnPush") @Nullable Boolean deployOnPush,
        @CustomType.Parameter("repo") @Nullable String repo) {
        this.branch = branch;
        this.deployOnPush = deployOnPush;
        this.repo = repo;
    }

    /**
     * @return The name of the branch to use.
     * 
     */
    public Optional<String> branch() {
        return Optional.ofNullable(this.branch);
    }
    /**
     * @return Whether to automatically deploy new commits made to the repo.
     * 
     */
    public Optional<Boolean> deployOnPush() {
        return Optional.ofNullable(this.deployOnPush);
    }
    /**
     * @return The name of the repo in the format `owner/repo`.
     * 
     */
    public Optional<String> repo() {
        return Optional.ofNullable(this.repo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecWorkerGitlab defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String branch;
        private @Nullable Boolean deployOnPush;
        private @Nullable String repo;

        public Builder() {
    	      // Empty
        }

        public Builder(AppSpecWorkerGitlab defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.deployOnPush = defaults.deployOnPush;
    	      this.repo = defaults.repo;
        }

        public Builder branch(@Nullable String branch) {
            this.branch = branch;
            return this;
        }
        public Builder deployOnPush(@Nullable Boolean deployOnPush) {
            this.deployOnPush = deployOnPush;
            return this;
        }
        public Builder repo(@Nullable String repo) {
            this.repo = repo;
            return this;
        }        public AppSpecWorkerGitlab build() {
            return new AppSpecWorkerGitlab(branch, deployOnPush, repo);
        }
    }
}
