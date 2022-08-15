// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImageArgs Empty = new GetImageArgs();

    /**
     * The id of the image
     * 
     */
    @Import(name="id")
    private @Nullable Output<Integer> id;

    /**
     * @return The id of the image
     * 
     */
    public Optional<Output<Integer>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the image.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the image.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The slug of the official image.
     * 
     */
    @Import(name="slug")
    private @Nullable Output<String> slug;

    /**
     * @return The slug of the official image.
     * 
     */
    public Optional<Output<String>> slug() {
        return Optional.ofNullable(this.slug);
    }

    /**
     * Restrict the search to one of the following categories of images:
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return Restrict the search to one of the following categories of images:
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    private GetImageArgs() {}

    private GetImageArgs(GetImageArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.slug = $.slug;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImageArgs $;

        public Builder() {
            $ = new GetImageArgs();
        }

        public Builder(GetImageArgs defaults) {
            $ = new GetImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The id of the image
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the image
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the image.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the image.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param slug The slug of the official image.
         * 
         * @return builder
         * 
         */
        public Builder slug(@Nullable Output<String> slug) {
            $.slug = slug;
            return this;
        }

        /**
         * @param slug The slug of the official image.
         * 
         * @return builder
         * 
         */
        public Builder slug(String slug) {
            return slug(Output.of(slug));
        }

        /**
         * @param source Restrict the search to one of the following categories of images:
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Restrict the search to one of the following categories of images:
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public GetImageArgs build() {
            return $;
        }
    }

}
