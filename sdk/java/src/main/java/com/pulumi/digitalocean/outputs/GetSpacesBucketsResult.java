// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetSpacesBucketsBucket;
import com.pulumi.digitalocean.outputs.GetSpacesBucketsFilter;
import com.pulumi.digitalocean.outputs.GetSpacesBucketsSort;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetSpacesBucketsResult {
    /**
     * @return A list of Spaces buckets satisfying any `filter` and `sort` criteria. Each bucket has the following attributes:
     * 
     */
    private final List<GetSpacesBucketsBucket> buckets;
    private final @Nullable List<GetSpacesBucketsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable List<GetSpacesBucketsSort> sorts;

    @CustomType.Constructor
    private GetSpacesBucketsResult(
        @CustomType.Parameter("buckets") List<GetSpacesBucketsBucket> buckets,
        @CustomType.Parameter("filters") @Nullable List<GetSpacesBucketsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("sorts") @Nullable List<GetSpacesBucketsSort> sorts) {
        this.buckets = buckets;
        this.filters = filters;
        this.id = id;
        this.sorts = sorts;
    }

    /**
     * @return A list of Spaces buckets satisfying any `filter` and `sort` criteria. Each bucket has the following attributes:
     * 
     */
    public List<GetSpacesBucketsBucket> buckets() {
        return this.buckets;
    }
    public List<GetSpacesBucketsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetSpacesBucketsSort> sorts() {
        return this.sorts == null ? List.of() : this.sorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpacesBucketsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetSpacesBucketsBucket> buckets;
        private @Nullable List<GetSpacesBucketsFilter> filters;
        private String id;
        private @Nullable List<GetSpacesBucketsSort> sorts;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSpacesBucketsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buckets = defaults.buckets;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.sorts = defaults.sorts;
        }

        public Builder buckets(List<GetSpacesBucketsBucket> buckets) {
            this.buckets = Objects.requireNonNull(buckets);
            return this;
        }
        public Builder buckets(GetSpacesBucketsBucket... buckets) {
            return buckets(List.of(buckets));
        }
        public Builder filters(@Nullable List<GetSpacesBucketsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSpacesBucketsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder sorts(@Nullable List<GetSpacesBucketsSort> sorts) {
            this.sorts = sorts;
            return this;
        }
        public Builder sorts(GetSpacesBucketsSort... sorts) {
            return sorts(List.of(sorts));
        }        public GetSpacesBucketsResult build() {
            return new GetSpacesBucketsResult(buckets, filters, id, sorts);
        }
    }
}
