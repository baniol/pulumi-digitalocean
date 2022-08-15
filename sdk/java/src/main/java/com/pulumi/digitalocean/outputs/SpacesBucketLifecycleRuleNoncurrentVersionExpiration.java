// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpacesBucketLifecycleRuleNoncurrentVersionExpiration {
    /**
     * @return Specifies the number of days after which an object&#39;s non-current versions expire.
     * 
     */
    private final @Nullable Integer days;

    @CustomType.Constructor
    private SpacesBucketLifecycleRuleNoncurrentVersionExpiration(@CustomType.Parameter("days") @Nullable Integer days) {
        this.days = days;
    }

    /**
     * @return Specifies the number of days after which an object&#39;s non-current versions expire.
     * 
     */
    public Optional<Integer> days() {
        return Optional.ofNullable(this.days);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpacesBucketLifecycleRuleNoncurrentVersionExpiration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer days;

        public Builder() {
    	      // Empty
        }

        public Builder(SpacesBucketLifecycleRuleNoncurrentVersionExpiration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
        }

        public Builder days(@Nullable Integer days) {
            this.days = days;
            return this;
        }        public SpacesBucketLifecycleRuleNoncurrentVersionExpiration build() {
            return new SpacesBucketLifecycleRuleNoncurrentVersionExpiration(days);
        }
    }
}
