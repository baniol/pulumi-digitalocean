// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.SshKeyArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.SshKeyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean SSH key resource to allow you to manage SSH
 * keys for Droplet access. Keys created with this resource
 * can be referenced in your Droplet configuration via their ID or
 * fingerprint.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.SshKey;
 * import com.pulumi.digitalocean.SshKeyArgs;
 * import com.pulumi.digitalocean.Droplet;
 * import com.pulumi.digitalocean.DropletArgs;
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
 *         var default_ = new SshKey(&#34;default&#34;, SshKeyArgs.builder()        
 *             .publicKey(Files.readString(Paths.get(&#34;/Users/myuser/.ssh/id_rsa.pub&#34;)))
 *             .build());
 * 
 *         var web = new Droplet(&#34;web&#34;, DropletArgs.builder()        
 *             .image(&#34;ubuntu-18-04-x64&#34;)
 *             .region(&#34;nyc3&#34;)
 *             .size(&#34;s-1vcpu-1gb&#34;)
 *             .sshKeys(default_.fingerprint())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * SSH Keys can be imported using the `ssh key id`, e.g.
 * 
 * ```sh
 *  $ pulumi import digitalocean:index/sshKey:SshKey mykey 263654
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/sshKey:SshKey")
public class SshKey extends com.pulumi.resources.CustomResource {
    /**
     * The fingerprint of the SSH key
     * 
     */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return The fingerprint of the SSH key
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * The name of the SSH key for identification
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the SSH key for identification
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The public key. If this is a file, it
     * can be read using the file interpolation function
     * 
     */
    @Export(name="publicKey", type=String.class, parameters={})
    private Output<String> publicKey;

    /**
     * @return The public key. If this is a file, it
     * can be read using the file interpolation function
     * 
     */
    public Output<String> publicKey() {
        return this.publicKey;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SshKey(String name) {
        this(name, SshKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SshKey(String name, SshKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SshKey(String name, SshKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/sshKey:SshKey", name, args == null ? SshKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SshKey(String name, Output<String> id, @Nullable SshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/sshKey:SshKey", name, state, makeResourceOptions(options, id));
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
    public static SshKey get(String name, Output<String> id, @Nullable SshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SshKey(name, id, state, options);
    }
}
