// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.GetSshKeysFilter;
import com.pulumi.digitalocean.inputs.GetSshKeysSort;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSshKeysPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSshKeysPlainArgs Empty = new GetSshKeysPlainArgs();

    /**
     * Filter the results.
     * The `filter` block is documented below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetSshKeysFilter> filters;

    /**
     * @return Filter the results.
     * The `filter` block is documented below.
     * 
     */
    public Optional<List<GetSshKeysFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Sort the results.
     * The `sort` block is documented below.
     * 
     */
    @Import(name="sorts")
    private @Nullable List<GetSshKeysSort> sorts;

    /**
     * @return Sort the results.
     * The `sort` block is documented below.
     * 
     */
    public Optional<List<GetSshKeysSort>> sorts() {
        return Optional.ofNullable(this.sorts);
    }

    private GetSshKeysPlainArgs() {}

    private GetSshKeysPlainArgs(GetSshKeysPlainArgs $) {
        this.filters = $.filters;
        this.sorts = $.sorts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSshKeysPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSshKeysPlainArgs $;

        public Builder() {
            $ = new GetSshKeysPlainArgs();
        }

        public Builder(GetSshKeysPlainArgs defaults) {
            $ = new GetSshKeysPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Filter the results.
         * The `filter` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetSshKeysFilter> filters) {
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
        public Builder filters(GetSshKeysFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param sorts Sort the results.
         * The `sort` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sorts(@Nullable List<GetSshKeysSort> sorts) {
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
        public Builder sorts(GetSshKeysSort... sorts) {
            return sorts(List.of(sorts));
        }

        public GetSshKeysPlainArgs build() {
            return $;
        }
    }

}
