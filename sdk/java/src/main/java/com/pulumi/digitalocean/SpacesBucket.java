// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.SpacesBucketArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.SpacesBucketState;
import com.pulumi.digitalocean.outputs.SpacesBucketCorsRule;
import com.pulumi.digitalocean.outputs.SpacesBucketLifecycleRule;
import com.pulumi.digitalocean.outputs.SpacesBucketVersioning;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a bucket resource for Spaces, DigitalOcean&#39;s object storage product.
 * 
 * The [Spaces API](https://docs.digitalocean.com/reference/api/spaces-api/) was
 * designed to be interoperable with Amazon&#39;s AWS S3 API. This allows users to
 * interact with the service while using the tools they already know. Spaces
 * mirrors S3&#39;s authentication framework and requests to Spaces require a key pair
 * similar to Amazon&#39;s Access ID and Secret Key.
 * 
 * The authentication requirement can be met by either setting the
 * `SPACES_ACCESS_KEY_ID` and `SPACES_SECRET_ACCESS_KEY` environment variables or
 * the provider&#39;s `spaces_access_id` and `spaces_secret_key` arguments to the
 * access ID and secret you generate via the DigitalOcean control panel. For
 * example:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.SpacesBucket;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var static_assets = new SpacesBucket(&#34;static-assets&#34;);
 * 
 *     }
 * }
 * ```
 * 
 * For more information, See [An Introduction to DigitalOcean Spaces](https://www.digitalocean.com/community/tutorials/an-introduction-to-digitalocean-spaces)
 * 
 * ## Example Usage
 * ### Create a New Bucket
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.SpacesBucket;
 * import com.pulumi.digitalocean.SpacesBucketArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foobar = new SpacesBucket(&#34;foobar&#34;, SpacesBucketArgs.builder()        
 *             .region(&#34;nyc3&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Create a New Bucket With CORS Rules
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.SpacesBucket;
 * import com.pulumi.digitalocean.SpacesBucketArgs;
 * import com.pulumi.digitalocean.inputs.SpacesBucketCorsRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foobar = new SpacesBucket(&#34;foobar&#34;, SpacesBucketArgs.builder()        
 *             .corsRules(            
 *                 SpacesBucketCorsRuleArgs.builder()
 *                     .allowedHeaders(&#34;*&#34;)
 *                     .allowedMethods(&#34;GET&#34;)
 *                     .allowedOrigins(&#34;*&#34;)
 *                     .maxAgeSeconds(3000)
 *                     .build(),
 *                 SpacesBucketCorsRuleArgs.builder()
 *                     .allowedHeaders(&#34;*&#34;)
 *                     .allowedMethods(                    
 *                         &#34;PUT&#34;,
 *                         &#34;POST&#34;,
 *                         &#34;DELETE&#34;)
 *                     .allowedOrigins(&#34;https://www.example.com&#34;)
 *                     .maxAgeSeconds(3000)
 *                     .build())
 *             .region(&#34;nyc3&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Buckets can be imported using the `region` and `name` attributes (delimited by a comma)
 * 
 * ```sh
 *  $ pulumi import digitalocean:index/spacesBucket:SpacesBucket foobar `region`,`name`
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/spacesBucket:SpacesBucket")
public class SpacesBucket extends com.pulumi.resources.CustomResource {
    /**
     * Canned ACL applied on bucket creation (`private` or `public-read`)
     * 
     */
    @Export(name="acl", type=String.class, parameters={})
    private Output</* @Nullable */ String> acl;

    /**
     * @return Canned ACL applied on bucket creation (`private` or `public-read`)
     * 
     */
    public Output<Optional<String>> acl() {
        return Codegen.optional(this.acl);
    }
    /**
     * The FQDN of the bucket (e.g. bucket-name.nyc3.digitaloceanspaces.com)
     * 
     */
    @Export(name="bucketDomainName", type=String.class, parameters={})
    private Output<String> bucketDomainName;

    /**
     * @return The FQDN of the bucket (e.g. bucket-name.nyc3.digitaloceanspaces.com)
     * 
     */
    public Output<String> bucketDomainName() {
        return this.bucketDomainName;
    }
    /**
     * The uniform resource name for the bucket
     * 
     */
    @Export(name="bucketUrn", type=String.class, parameters={})
    private Output<String> bucketUrn;

    /**
     * @return The uniform resource name for the bucket
     * 
     */
    public Output<String> bucketUrn() {
        return this.bucketUrn;
    }
    /**
     * A rule of Cross-Origin Resource Sharing (documented below).
     * 
     */
    @Export(name="corsRules", type=List.class, parameters={SpacesBucketCorsRule.class})
    private Output</* @Nullable */ List<SpacesBucketCorsRule>> corsRules;

    /**
     * @return A rule of Cross-Origin Resource Sharing (documented below).
     * 
     */
    public Output<Optional<List<SpacesBucketCorsRule>>> corsRules() {
        return Codegen.optional(this.corsRules);
    }
    /**
     * Unless `true`, the bucket will only be destroyed if empty (Defaults to `false`)
     * 
     */
    @Export(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Unless `true`, the bucket will only be destroyed if empty (Defaults to `false`)
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * A configuration of object lifecycle management (documented below).
     * 
     */
    @Export(name="lifecycleRules", type=List.class, parameters={SpacesBucketLifecycleRule.class})
    private Output</* @Nullable */ List<SpacesBucketLifecycleRule>> lifecycleRules;

    /**
     * @return A configuration of object lifecycle management (documented below).
     * 
     */
    public Output<Optional<List<SpacesBucketLifecycleRule>>> lifecycleRules() {
        return Codegen.optional(this.lifecycleRules);
    }
    /**
     * The name of the bucket
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the bucket
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The region where the bucket resides (Defaults to `nyc3`)
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    /**
     * @return The region where the bucket resides (Defaults to `nyc3`)
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    /**
     * A state of versioning (documented below)
     * 
     */
    @Export(name="versioning", type=SpacesBucketVersioning.class, parameters={})
    private Output</* @Nullable */ SpacesBucketVersioning> versioning;

    /**
     * @return A state of versioning (documented below)
     * 
     */
    public Output<Optional<SpacesBucketVersioning>> versioning() {
        return Codegen.optional(this.versioning);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpacesBucket(String name) {
        this(name, SpacesBucketArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpacesBucket(String name, @Nullable SpacesBucketArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpacesBucket(String name, @Nullable SpacesBucketArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/spacesBucket:SpacesBucket", name, args == null ? SpacesBucketArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SpacesBucket(String name, Output<String> id, @Nullable SpacesBucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/spacesBucket:SpacesBucket", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SpacesBucket get(String name, Output<String> id, @Nullable SpacesBucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SpacesBucket(name, id, state, options);
    }
}
