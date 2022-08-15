// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.GetTagsFilter;
import com.pulumi.digitalocean.inputs.GetTagsSort;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTagsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagsPlainArgs Empty = new GetTagsPlainArgs();

    /**
     * Filter the results.
     * The `filter` block is documented below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetTagsFilter> filters;

    /**
     * @return Filter the results.
     * The `filter` block is documented below.
     * 
     */
    public Optional<List<GetTagsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Sort the results.
     * The `sort` block is documented below.
     * 
     */
    @Import(name="sorts")
    private @Nullable List<GetTagsSort> sorts;

    /**
     * @return Sort the results.
     * The `sort` block is documented below.
     * 
     */
    public Optional<List<GetTagsSort>> sorts() {
        return Optional.ofNullable(this.sorts);
    }

    private GetTagsPlainArgs() {}

    private GetTagsPlainArgs(GetTagsPlainArgs $) {
        this.filters = $.filters;
        this.sorts = $.sorts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagsPlainArgs $;

        public Builder() {
            $ = new GetTagsPlainArgs();
        }

        public Builder(GetTagsPlainArgs defaults) {
            $ = new GetTagsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Filter the results.
         * The `filter` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetTagsFilter> filters) {
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
        public Builder filters(GetTagsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param sorts Sort the results.
         * The `sort` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sorts(@Nullable List<GetTagsSort> sorts) {
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
        public Builder sorts(GetTagsSort... sorts) {
            return sorts(List.of(sorts));
        }

        public GetTagsPlainArgs build() {
            return $;
        }
    }

}
