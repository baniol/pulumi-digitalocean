// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.DatabaseUserArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.DatabaseUserState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean database user resource. When creating a new database cluster, a default admin user with name `doadmin` will be created. Then, this resource can be used to provide additional normal users inside the cluster.
 * 
 * &gt; **NOTE:** Any new users created will always have `normal` role, only the default user that comes with database cluster creation has `primary` role. Additional permissions must be managed manually.
 * 
 * ## Example Usage
 * ### Create a new PostgreSQL database user
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.DatabaseCluster;
 * import com.pulumi.digitalocean.DatabaseClusterArgs;
 * import com.pulumi.digitalocean.DatabaseUser;
 * import com.pulumi.digitalocean.DatabaseUserArgs;
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
 *         var postgres_example = new DatabaseCluster(&#34;postgres-example&#34;, DatabaseClusterArgs.builder()        
 *             .engine(&#34;pg&#34;)
 *             .version(&#34;11&#34;)
 *             .size(&#34;db-s-1vcpu-1gb&#34;)
 *             .region(&#34;nyc1&#34;)
 *             .nodeCount(1)
 *             .build());
 * 
 *         var user_example = new DatabaseUser(&#34;user-example&#34;, DatabaseUserArgs.builder()        
 *             .clusterId(postgres_example.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Database user can be imported using the `id` of the source database cluster and the `name` of the user joined with a comma. For example
 * 
 * ```sh
 *  $ pulumi import digitalocean:index/databaseUser:DatabaseUser user-example 245bcfd0-7f31-4ce6-a2bc-475a116cca97,foobar
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/databaseUser:DatabaseUser")
public class DatabaseUser extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the original source database cluster.
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The ID of the original source database cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
     * 
     */
    @Export(name="mysqlAuthPlugin", type=String.class, parameters={})
    private Output</* @Nullable */ String> mysqlAuthPlugin;

    /**
     * @return The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
     * 
     */
    public Output<Optional<String>> mysqlAuthPlugin() {
        return Codegen.optional(this.mysqlAuthPlugin);
    }
    /**
     * The name for the database user.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for the database user.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Password for the database user.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output<String> password;

    /**
     * @return Password for the database user.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * Role for the database user. The value will be either &#34;primary&#34; or &#34;normal&#34;.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return Role for the database user. The value will be either &#34;primary&#34; or &#34;normal&#34;.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseUser(String name) {
        this(name, DatabaseUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseUser(String name, DatabaseUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseUser(String name, DatabaseUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseUser:DatabaseUser", name, args == null ? DatabaseUserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabaseUser(String name, Output<String> id, @Nullable DatabaseUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseUser:DatabaseUser", name, state, makeResourceOptions(options, id));
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
    public static DatabaseUser get(String name, Output<String> id, @Nullable DatabaseUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseUser(name, id, state, options);
    }
}
