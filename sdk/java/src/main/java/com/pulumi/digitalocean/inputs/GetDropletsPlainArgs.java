// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.GetDropletsFilter;
import com.pulumi.digitalocean.inputs.GetDropletsSort;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDropletsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDropletsPlainArgs Empty = new GetDropletsPlainArgs();

    /**
     * Filter the results.
     * The `filter` block is documented below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetDropletsFilter> filters;

    /**
     * @return Filter the results.
     * The `filter` block is documented below.
     * 
     */
    public Optional<List<GetDropletsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Sort the results.
     * The `sort` block is documented below.
     * 
     */
    @Import(name="sorts")
    private @Nullable List<GetDropletsSort> sorts;

    /**
     * @return Sort the results.
     * The `sort` block is documented below.
     * 
     */
    public Optional<List<GetDropletsSort>> sorts() {
        return Optional.ofNullable(this.sorts);
    }

    private GetDropletsPlainArgs() {}

    private GetDropletsPlainArgs(GetDropletsPlainArgs $) {
        this.filters = $.filters;
        this.sorts = $.sorts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDropletsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDropletsPlainArgs $;

        public Builder() {
            $ = new GetDropletsPlainArgs();
        }

        public Builder(GetDropletsPlainArgs defaults) {
            $ = new GetDropletsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Filter the results.
         * The `filter` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetDropletsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Filter the results.
         * The `filter` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetDropletsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param sorts Sort the results.
         * The `sort` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sorts(@Nullable List<GetDropletsSort> sorts) {
            $.sorts = sorts;
            return this;
        }

        /**
         * @param sorts Sort the results.
         * The `sort` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sorts(GetDropletsSort... sorts) {
            return sorts(List.of(sorts));
        }

        public GetDropletsPlainArgs build() {
            return $;
        }
    }

}
