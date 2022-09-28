// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecFunctionGit {
    /**
     * @return The name of the branch to use.
     * 
     */
    private @Nullable String branch;
    /**
     * @return The clone URL of the repo.
     * 
     */
    private @Nullable String repoCloneUrl;

    private AppSpecFunctionGit() {}
    /**
     * @return The name of the branch to use.
     * 
     */
    public Optional<String> branch() {
        return Optional.ofNullable(this.branch);
    }
    /**
     * @return The clone URL of the repo.
     * 
     */
    public Optional<String> repoCloneUrl() {
        return Optional.ofNullable(this.repoCloneUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecFunctionGit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String branch;
        private @Nullable String repoCloneUrl;
        public Builder() {}
        public Builder(AppSpecFunctionGit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.repoCloneUrl = defaults.repoCloneUrl;
        }

        @CustomType.Setter
        public Builder branch(@Nullable String branch) {
            this.branch = branch;
            return this;
        }
        @CustomType.Setter
        public Builder repoCloneUrl(@Nullable String repoCloneUrl) {
            this.repoCloneUrl = repoCloneUrl;
            return this;
        }
        public AppSpecFunctionGit build() {
            final var o = new AppSpecFunctionGit();
            o.branch = branch;
            o.repoCloneUrl = repoCloneUrl;
            return o;
        }
    }
}
