// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecJobGithubArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecJobGithubArgs Empty = new AppSpecJobGithubArgs();

    /**
     * The name of the branch to use.
     * 
     */
    @Import(name="branch")
    private @Nullable Output<String> branch;

    /**
     * @return The name of the branch to use.
     * 
     */
    public Optional<Output<String>> branch() {
        return Optional.ofNullable(this.branch);
    }

    /**
     * Whether to automatically deploy new commits made to the repo.
     * 
     */
    @Import(name="deployOnPush")
    private @Nullable Output<Boolean> deployOnPush;

    /**
     * @return Whether to automatically deploy new commits made to the repo.
     * 
     */
    public Optional<Output<Boolean>> deployOnPush() {
        return Optional.ofNullable(this.deployOnPush);
    }

    /**
     * The name of the repo in the format `owner/repo`.
     * 
     */
    @Import(name="repo")
    private @Nullable Output<String> repo;

    /**
     * @return The name of the repo in the format `owner/repo`.
     * 
     */
    public Optional<Output<String>> repo() {
        return Optional.ofNullable(this.repo);
    }

    private AppSpecJobGithubArgs() {}

    private AppSpecJobGithubArgs(AppSpecJobGithubArgs $) {
        this.branch = $.branch;
        this.deployOnPush = $.deployOnPush;
        this.repo = $.repo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecJobGithubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecJobGithubArgs $;

        public Builder() {
            $ = new AppSpecJobGithubArgs();
        }

        public Builder(AppSpecJobGithubArgs defaults) {
            $ = new AppSpecJobGithubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param branch The name of the branch to use.
         * 
         * @return builder
         * 
         */
        public Builder branch(@Nullable Output<String> branch) {
            $.branch = branch;
            return this;
        }

        /**
         * @param branch The name of the branch to use.
         * 
         * @return builder
         * 
         */
        public Builder branch(String branch) {
            return branch(Output.of(branch));
        }

        /**
         * @param deployOnPush Whether to automatically deploy new commits made to the repo.
         * 
         * @return builder
         * 
         */
        public Builder deployOnPush(@Nullable Output<Boolean> deployOnPush) {
            $.deployOnPush = deployOnPush;
            return this;
        }

        /**
         * @param deployOnPush Whether to automatically deploy new commits made to the repo.
         * 
         * @return builder
         * 
         */
        public Builder deployOnPush(Boolean deployOnPush) {
            return deployOnPush(Output.of(deployOnPush));
        }

        /**
         * @param repo The name of the repo in the format `owner/repo`.
         * 
         * @return builder
         * 
         */
        public Builder repo(@Nullable Output<String> repo) {
            $.repo = repo;
            return this;
        }

        /**
         * @param repo The name of the repo in the format `owner/repo`.
         * 
         * @return builder
         * 
         */
        public Builder repo(String repo) {
            return repo(Output.of(repo));
        }

        public AppSpecJobGithubArgs build() {
            return $;
        }
    }

}
