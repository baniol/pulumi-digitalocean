// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecStaticSiteGitArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecStaticSiteGitArgs Empty = new AppSpecStaticSiteGitArgs();

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
     * The clone URL of the repo.
     * 
     */
    @Import(name="repoCloneUrl")
    private @Nullable Output<String> repoCloneUrl;

    /**
     * @return The clone URL of the repo.
     * 
     */
    public Optional<Output<String>> repoCloneUrl() {
        return Optional.ofNullable(this.repoCloneUrl);
    }

    private AppSpecStaticSiteGitArgs() {}

    private AppSpecStaticSiteGitArgs(AppSpecStaticSiteGitArgs $) {
        this.branch = $.branch;
        this.repoCloneUrl = $.repoCloneUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecStaticSiteGitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecStaticSiteGitArgs $;

        public Builder() {
            $ = new AppSpecStaticSiteGitArgs();
        }

        public Builder(AppSpecStaticSiteGitArgs defaults) {
            $ = new AppSpecStaticSiteGitArgs(Objects.requireNonNull(defaults));
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
         * @param repoCloneUrl The clone URL of the repo.
         * 
         * @return builder
         * 
         */
        public Builder repoCloneUrl(@Nullable Output<String> repoCloneUrl) {
            $.repoCloneUrl = repoCloneUrl;
            return this;
        }

        /**
         * @param repoCloneUrl The clone URL of the repo.
         * 
         * @return builder
         * 
         */
        public Builder repoCloneUrl(String repoCloneUrl) {
            return repoCloneUrl(Output.of(repoCloneUrl));
        }

        public AppSpecStaticSiteGitArgs build() {
            return $;
        }
    }

}
