// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetSizesFilter;
import com.pulumi.digitalocean.outputs.GetSizesSize;
import com.pulumi.digitalocean.outputs.GetSizesSort;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetSizesResult {
    private final @Nullable List<GetSizesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<GetSizesSize> sizes;
    private final @Nullable List<GetSizesSort> sorts;

    @CustomType.Constructor
    private GetSizesResult(
        @CustomType.Parameter("filters") @Nullable List<GetSizesFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("sizes") List<GetSizesSize> sizes,
        @CustomType.Parameter("sorts") @Nullable List<GetSizesSort> sorts) {
        this.filters = filters;
        this.id = id;
        this.sizes = sizes;
        this.sorts = sorts;
    }

    public List<GetSizesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetSizesSize> sizes() {
        return this.sizes;
    }
    public List<GetSizesSort> sorts() {
        return this.sorts == null ? List.of() : this.sorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSizesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetSizesFilter> filters;
        private String id;
        private List<GetSizesSize> sizes;
        private @Nullable List<GetSizesSort> sorts;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSizesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.sizes = defaults.sizes;
    	      this.sorts = defaults.sorts;
        }

        public Builder filters(@Nullable List<GetSizesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSizesFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder sizes(List<GetSizesSize> sizes) {
            this.sizes = Objects.requireNonNull(sizes);
            return this;
        }
        public Builder sizes(GetSizesSize... sizes) {
            return sizes(List.of(sizes));
        }
        public Builder sorts(@Nullable List<GetSizesSort> sorts) {
            this.sorts = sorts;
            return this;
        }
        public Builder sorts(GetSizesSort... sorts) {
            return sorts(List.of(sorts));
        }        public GetSizesResult build() {
            return new GetSizesResult(filters, id, sizes, sorts);
        }
    }
}
