// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.KubernetesNodePoolArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.KubernetesNodePoolState;
import com.pulumi.digitalocean.outputs.KubernetesNodePoolNode;
import com.pulumi.digitalocean.outputs.KubernetesNodePoolTaint;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean Kubernetes node pool resource. While the default node pool must be defined in the `digitalocean.KubernetesCluster` resource, this resource can be used to add additional ones to a cluster.
 * 
 * ## Example Usage
 * ### Basic Example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.KubernetesCluster;
 * import com.pulumi.digitalocean.KubernetesClusterArgs;
 * import com.pulumi.digitalocean.inputs.KubernetesClusterNodePoolArgs;
 * import com.pulumi.digitalocean.KubernetesNodePool;
 * import com.pulumi.digitalocean.KubernetesNodePoolArgs;
 * import com.pulumi.digitalocean.inputs.KubernetesNodePoolTaintArgs;
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
 *         var foo = new KubernetesCluster(&#34;foo&#34;, KubernetesClusterArgs.builder()        
 *             .region(&#34;nyc1&#34;)
 *             .version(&#34;1.22.8-do.1&#34;)
 *             .nodePool(KubernetesClusterNodePoolArgs.builder()
 *                 .name(&#34;front-end-pool&#34;)
 *                 .size(&#34;s-2vcpu-2gb&#34;)
 *                 .nodeCount(3)
 *                 .build())
 *             .build());
 * 
 *         var bar = new KubernetesNodePool(&#34;bar&#34;, KubernetesNodePoolArgs.builder()        
 *             .clusterId(foo.id())
 *             .size(&#34;c-2&#34;)
 *             .nodeCount(2)
 *             .tags(&#34;backend&#34;)
 *             .labels(Map.ofEntries(
 *                 Map.entry(&#34;service&#34;, &#34;backend&#34;),
 *                 Map.entry(&#34;priority&#34;, &#34;high&#34;)
 *             ))
 *             .taints(KubernetesNodePoolTaintArgs.builder()
 *                 .key(&#34;workloadKind&#34;)
 *                 .value(&#34;database&#34;)
 *                 .effect(&#34;NoSchedule&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Autoscaling Example
 * 
 * Node pools may also be configured to [autoscale](https://www.digitalocean.com/docs/kubernetes/how-to/autoscale/).
 * For example:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.KubernetesNodePool;
 * import com.pulumi.digitalocean.KubernetesNodePoolArgs;
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
 *         var autoscale_pool_01 = new KubernetesNodePool(&#34;autoscale-pool-01&#34;, KubernetesNodePoolArgs.builder()        
 *             .clusterId(digitalocean_kubernetes_cluster.foo().id())
 *             .size(&#34;s-1vcpu-2gb&#34;)
 *             .autoScale(true)
 *             .minNodes(1)
 *             .maxNodes(5)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * If you are importing an existing Kubernetes cluster, just import the cluster. Importing a cluster also imports all of its associated node pools. If you still need to import a single node pool, then import it by using its `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import digitalocean:index/kubernetesNodePool:KubernetesNodePool mynodepool 9d76f410-9284-4436-9633-4066852442c8
 * ```
 * 
 *  NoteIf the node pool has the `terraform:default-node-pool` tag, then it is a default node pool for an existing cluster. The provider will refuse to import the node pool in that case because the node pool is managed by the `digitalocean_kubernetes_cluster` resource and not by this `digitalocean_kubernetes_node_pool` resource.
 * 
 */
@ResourceType(type="digitalocean:index/kubernetesNodePool:KubernetesNodePool")
public class KubernetesNodePool extends com.pulumi.resources.CustomResource {
    /**
     * A computed field representing the actual number of nodes in the node pool, which is especially useful when auto-scaling is enabled.
     * 
     */
    @Export(name="actualNodeCount", type=Integer.class, parameters={})
    private Output<Integer> actualNodeCount;

    /**
     * @return A computed field representing the actual number of nodes in the node pool, which is especially useful when auto-scaling is enabled.
     * 
     */
    public Output<Integer> actualNodeCount() {
        return this.actualNodeCount;
    }
    /**
     * Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
     * 
     */
    @Export(name="autoScale", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoScale;

    /**
     * @return Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
     * 
     */
    public Output<Optional<Boolean>> autoScale() {
        return Codegen.optional(this.autoScale);
    }
    /**
     * The ID of the Kubernetes cluster to which the node pool is associated.
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The ID of the Kubernetes cluster to which the node pool is associated.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
     * 
     */
    @Export(name="maxNodes", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxNodes;

    /**
     * @return If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
     * 
     */
    public Output<Optional<Integer>> maxNodes() {
        return Codegen.optional(this.maxNodes);
    }
    /**
     * If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
     * 
     */
    @Export(name="minNodes", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minNodes;

    /**
     * @return If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
     * 
     */
    public Output<Optional<Integer>> minNodes() {
        return Codegen.optional(this.minNodes);
    }
    /**
     * A name for the node pool.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name for the node pool.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
     * 
     */
    @Export(name="nodeCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> nodeCount;

    /**
     * @return The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
     * 
     */
    public Output<Optional<Integer>> nodeCount() {
        return Codegen.optional(this.nodeCount);
    }
    /**
     * A list of nodes in the pool. Each node exports the following attributes:
     * 
     */
    @Export(name="nodes", type=List.class, parameters={KubernetesNodePoolNode.class})
    private Output<List<KubernetesNodePoolNode>> nodes;

    /**
     * @return A list of nodes in the pool. Each node exports the following attributes:
     * 
     */
    public Output<List<KubernetesNodePoolNode>> nodes() {
        return this.nodes;
    }
    /**
     * The slug identifier for the type of Droplet to be used as workers in the node pool.
     * 
     */
    @Export(name="size", type=String.class, parameters={})
    private Output<String> size;

    /**
     * @return The slug identifier for the type of Droplet to be used as workers in the node pool.
     * 
     */
    public Output<String> size() {
        return this.size;
    }
    /**
     * A list of tag names to be applied to the Kubernetes cluster.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of tag names to be applied to the Kubernetes cluster.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A list of taints applied to all nodes in the pool.
     * 
     */
    @Export(name="taints", type=List.class, parameters={KubernetesNodePoolTaint.class})
    private Output</* @Nullable */ List<KubernetesNodePoolTaint>> taints;

    /**
     * @return A list of taints applied to all nodes in the pool.
     * 
     */
    public Output<Optional<List<KubernetesNodePoolTaint>>> taints() {
        return Codegen.optional(this.taints);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KubernetesNodePool(String name) {
        this(name, KubernetesNodePoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KubernetesNodePool(String name, KubernetesNodePoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KubernetesNodePool(String name, KubernetesNodePoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/kubernetesNodePool:KubernetesNodePool", name, args == null ? KubernetesNodePoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KubernetesNodePool(String name, Output<String> id, @Nullable KubernetesNodePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/kubernetesNodePool:KubernetesNodePool", name, state, makeResourceOptions(options, id));
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
    public static KubernetesNodePool get(String name, Output<String> id, @Nullable KubernetesNodePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KubernetesNodePool(name, id, state, options);
    }
}