// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSpacesBucketObjectsResult {
    private final String bucket;
    /**
     * @return List of any keys between `prefix` and the next occurrence of `delimiter` (i.e., similar to subdirectories of the `prefix` &#34;directory&#34;); the list is only returned when you specify `delimiter`
     * 
     */
    private final List<String> commonPrefixes;
    private final @Nullable String delimiter;
    private final @Nullable String encodingType;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return List of strings representing object keys
     * 
     */
    private final List<String> keys;
    private final @Nullable Integer maxKeys;
    /**
     * @return List of strings representing object owner IDs
     * 
     */
    private final List<String> owners;
    private final @Nullable String prefix;
    private final String region;

    @CustomType.Constructor
    private GetSpacesBucketObjectsResult(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("commonPrefixes") List<String> commonPrefixes,
        @CustomType.Parameter("delimiter") @Nullable String delimiter,
        @CustomType.Parameter("encodingType") @Nullable String encodingType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("keys") List<String> keys,
        @CustomType.Parameter("maxKeys") @Nullable Integer maxKeys,
        @CustomType.Parameter("owners") List<String> owners,
        @CustomType.Parameter("prefix") @Nullable String prefix,
        @CustomType.Parameter("region") String region) {
        this.bucket = bucket;
        this.commonPrefixes = commonPrefixes;
        this.delimiter = delimiter;
        this.encodingType = encodingType;
        this.id = id;
        this.keys = keys;
        this.maxKeys = maxKeys;
        this.owners = owners;
        this.prefix = prefix;
        this.region = region;
    }

    public String bucket() {
        return this.bucket;
    }
    /**
     * @return List of any keys between `prefix` and the next occurrence of `delimiter` (i.e., similar to subdirectories of the `prefix` &#34;directory&#34;); the list is only returned when you specify `delimiter`
     * 
     */
    public List<String> commonPrefixes() {
        return this.commonPrefixes;
    }
    public Optional<String> delimiter() {
        return Optional.ofNullable(this.delimiter);
    }
    public Optional<String> encodingType() {
        return Optional.ofNullable(this.encodingType);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of strings representing object keys
     * 
     */
    public List<String> keys() {
        return this.keys;
    }
    public Optional<Integer> maxKeys() {
        return Optional.ofNullable(this.maxKeys);
    }
    /**
     * @return List of strings representing object owner IDs
     * 
     */
    public List<String> owners() {
        return this.owners;
    }
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpacesBucketObjectsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private List<String> commonPrefixes;
        private @Nullable String delimiter;
        private @Nullable String encodingType;
        private String id;
        private List<String> keys;
        private @Nullable Integer maxKeys;
        private List<String> owners;
        private @Nullable String prefix;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSpacesBucketObjectsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.commonPrefixes = defaults.commonPrefixes;
    	      this.delimiter = defaults.delimiter;
    	      this.encodingType = defaults.encodingType;
    	      this.id = defaults.id;
    	      this.keys = defaults.keys;
    	      this.maxKeys = defaults.maxKeys;
    	      this.owners = defaults.owners;
    	      this.prefix = defaults.prefix;
    	      this.region = defaults.region;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder commonPrefixes(List<String> commonPrefixes) {
            this.commonPrefixes = Objects.requireNonNull(commonPrefixes);
            return this;
        }
        public Builder commonPrefixes(String... commonPrefixes) {
            return commonPrefixes(List.of(commonPrefixes));
        }
        public Builder delimiter(@Nullable String delimiter) {
            this.delimiter = delimiter;
            return this;
        }
        public Builder encodingType(@Nullable String encodingType) {
            this.encodingType = encodingType;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder keys(List<String> keys) {
            this.keys = Objects.requireNonNull(keys);
            return this;
        }
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }
        public Builder maxKeys(@Nullable Integer maxKeys) {
            this.maxKeys = maxKeys;
            return this;
        }
        public Builder owners(List<String> owners) {
            this.owners = Objects.requireNonNull(owners);
            return this;
        }
        public Builder owners(String... owners) {
            return owners(List.of(owners));
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }        public GetSpacesBucketObjectsResult build() {
            return new GetSpacesBucketObjectsResult(bucket, commonPrefixes, delimiter, encodingType, id, keys, maxKeys, owners, prefix, region);
        }
    }
}
