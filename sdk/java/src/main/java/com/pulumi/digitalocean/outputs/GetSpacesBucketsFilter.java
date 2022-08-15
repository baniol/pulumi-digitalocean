// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSpacesBucketsFilter {
    /**
     * @return Set to `true` to require that a field match all of the `values` instead of just one or more of
     * them. This is useful when matching against multi-valued fields such as lists or sets where you want to ensure
     * that all of the `values` are present in the list or set.
     * 
     */
    private final @Nullable Boolean all;
    /**
     * @return Filter the images by this key. This may be one of `bucket_domain_name`, `name`, `region`, or `urn`.
     * 
     */
    private final String key;
    /**
     * @return One of `exact` (default), `re`, or `substring`. For string-typed fields, specify `re` to
     * match by using the `values` as regular expressions, or specify `substring` to match by treating the `values` as
     * substrings to find within the string field.
     * 
     */
    private final @Nullable String matchBy;
    /**
     * @return A list of values to match against the `key` field. Only retrieves Spaces buckets
     * where the `key` field takes on one or more of the values provided here.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private GetSpacesBucketsFilter(
        @CustomType.Parameter("all") @Nullable Boolean all,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("matchBy") @Nullable String matchBy,
        @CustomType.Parameter("values") List<String> values) {
        this.all = all;
        this.key = key;
        this.matchBy = matchBy;
        this.values = values;
    }

    /**
     * @return Set to `true` to require that a field match all of the `values` instead of just one or more of
     * them. This is useful when matching against multi-valued fields such as lists or sets where you want to ensure
     * that all of the `values` are present in the list or set.
     * 
     */
    public Optional<Boolean> all() {
        return Optional.ofNullable(this.all);
    }
    /**
     * @return Filter the images by this key. This may be one of `bucket_domain_name`, `name`, `region`, or `urn`.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return One of `exact` (default), `re`, or `substring`. For string-typed fields, specify `re` to
     * match by using the `values` as regular expressions, or specify `substring` to match by treating the `values` as
     * substrings to find within the string field.
     * 
     */
    public Optional<String> matchBy() {
        return Optional.ofNullable(this.matchBy);
    }
    /**
     * @return A list of values to match against the `key` field. Only retrieves Spaces buckets
     * where the `key` field takes on one or more of the values provided here.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpacesBucketsFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean all;
        private String key;
        private @Nullable String matchBy;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSpacesBucketsFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.key = defaults.key;
    	      this.matchBy = defaults.matchBy;
    	      this.values = defaults.values;
        }

        public Builder all(@Nullable Boolean all) {
            this.all = all;
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder matchBy(@Nullable String matchBy) {
            this.matchBy = matchBy;
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetSpacesBucketsFilter build() {
            return new GetSpacesBucketsFilter(all, key, matchBy, values);
        }
    }
}
