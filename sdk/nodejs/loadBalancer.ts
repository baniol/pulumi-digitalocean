// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean Load Balancer resource. This can be used to create,
 * modify, and delete Load Balancers.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const web = new digitalocean.Droplet("web", {
 *     size: "s-1vcpu-1gb",
 *     image: "ubuntu-18-04-x64",
 *     region: "nyc3",
 * });
 * const _public = new digitalocean.LoadBalancer("public", {
 *     region: "nyc3",
 *     forwardingRules: [{
 *         entryPort: 80,
 *         entryProtocol: "http",
 *         targetPort: 80,
 *         targetProtocol: "http",
 *     }],
 *     healthcheck: {
 *         port: 22,
 *         protocol: "tcp",
 *     },
 *     dropletIds: [web.id],
 * });
 * ```
 *
 * When managing certificates attached to the load balancer, make sure to add the `createBeforeDestroy`
 * lifecycle property in order to ensure the certificate is correctly updated when changed. The order of
 * operations will then be: `Create new certificate` > `Update loadbalancer with new certificate` ->
 * `Delete old certificate`. When doing so, you must also change the name of the certificate,
 * as there cannot be multiple certificates with the same name in an account.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const cert = new digitalocean.Certificate("cert", {
 *     privateKey: "file('key.pem')",
 *     leafCertificate: "file('cert.pem')",
 * });
 * const web = new digitalocean.Droplet("web", {
 *     size: "s-1vcpu-1gb",
 *     image: "ubuntu-18-04-x64",
 *     region: "nyc3",
 * });
 * const _public = new digitalocean.LoadBalancer("public", {
 *     region: "nyc3",
 *     forwardingRules: [{
 *         entryPort: 443,
 *         entryProtocol: "https",
 *         targetPort: 80,
 *         targetProtocol: "http",
 *         certificateName: cert.name,
 *     }],
 *     healthcheck: {
 *         port: 22,
 *         protocol: "tcp",
 *     },
 *     dropletIds: [web.id],
 * });
 * ```
 *
 * ## Import
 *
 * Load Balancers can be imported using the `id`, e.g.
 *
 * ```sh
 *  $ pulumi import digitalocean:index/loadBalancer:LoadBalancer myloadbalancer 4de7ac8b-495b-4884-9a69-1050c6793cd6
 * ```
 */
export class LoadBalancer extends pulumi.CustomResource {
    /**
     * Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadBalancerState, opts?: pulumi.CustomResourceOptions): LoadBalancer {
        return new LoadBalancer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/loadBalancer:LoadBalancer';

    /**
     * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadBalancer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadBalancer.__pulumiType;
    }

    /**
     * The load balancing algorithm used to determine
     * which backend Droplet will be selected by a client. It must be either `roundRobin`
     * or `leastConnections`. The default value is `roundRobin`.
     */
    public readonly algorithm!: pulumi.Output<string | undefined>;
    /**
     * A list of the IDs of each droplet to be attached to the Load Balancer.
     */
    public readonly dropletIds!: pulumi.Output<number[]>;
    /**
     * The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
     */
    public readonly dropletTag!: pulumi.Output<string | undefined>;
    /**
     * A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
     */
    public readonly enableBackendKeepalive!: pulumi.Output<boolean | undefined>;
    /**
     * A boolean value indicating whether PROXY
     * Protocol should be used to pass information from connecting client requests to
     * the backend service. Default value is `false`.
     */
    public readonly enableProxyProtocol!: pulumi.Output<boolean | undefined>;
    /**
     * A list of `forwardingRule` to be assigned to the
     * Load Balancer. The `forwardingRule` block is documented below.
     */
    public readonly forwardingRules!: pulumi.Output<outputs.LoadBalancerForwardingRule[]>;
    /**
     * A `healthcheck` block to be assigned to the
     * Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
     */
    public readonly healthcheck!: pulumi.Output<outputs.LoadBalancerHealthcheck>;
    public /*out*/ readonly ip!: pulumi.Output<string>;
    /**
     * The uniform resource name for the Load Balancer
     */
    public /*out*/ readonly loadBalancerUrn!: pulumi.Output<string>;
    /**
     * The Load Balancer name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A boolean value indicating whether
     * HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
     * Default value is `false`.
     */
    public readonly redirectHttpToHttps!: pulumi.Output<boolean | undefined>;
    /**
     * The region to start in
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`.
     */
    public readonly size!: pulumi.Output<string | undefined>;
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A `stickySessions` block to be assigned to the
     * Load Balancer. The `stickySessions` block is documented below. Only 1 stickySessions block is allowed.
     */
    public readonly stickySessions!: pulumi.Output<outputs.LoadBalancerStickySessions>;
    /**
     * The ID of the VPC where the load balancer will be located.
     */
    public readonly vpcUuid!: pulumi.Output<string>;

    /**
     * Create a LoadBalancer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadBalancerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadBalancerArgs | LoadBalancerState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadBalancerState | undefined;
            inputs["algorithm"] = state ? state.algorithm : undefined;
            inputs["dropletIds"] = state ? state.dropletIds : undefined;
            inputs["dropletTag"] = state ? state.dropletTag : undefined;
            inputs["enableBackendKeepalive"] = state ? state.enableBackendKeepalive : undefined;
            inputs["enableProxyProtocol"] = state ? state.enableProxyProtocol : undefined;
            inputs["forwardingRules"] = state ? state.forwardingRules : undefined;
            inputs["healthcheck"] = state ? state.healthcheck : undefined;
            inputs["ip"] = state ? state.ip : undefined;
            inputs["loadBalancerUrn"] = state ? state.loadBalancerUrn : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["redirectHttpToHttps"] = state ? state.redirectHttpToHttps : undefined;
            inputs["region"] = state ? state.region : undefined;
            inputs["size"] = state ? state.size : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["stickySessions"] = state ? state.stickySessions : undefined;
            inputs["vpcUuid"] = state ? state.vpcUuid : undefined;
        } else {
            const args = argsOrState as LoadBalancerArgs | undefined;
            if ((!args || args.forwardingRules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'forwardingRules'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            inputs["algorithm"] = args ? args.algorithm : undefined;
            inputs["dropletIds"] = args ? args.dropletIds : undefined;
            inputs["dropletTag"] = args ? args.dropletTag : undefined;
            inputs["enableBackendKeepalive"] = args ? args.enableBackendKeepalive : undefined;
            inputs["enableProxyProtocol"] = args ? args.enableProxyProtocol : undefined;
            inputs["forwardingRules"] = args ? args.forwardingRules : undefined;
            inputs["healthcheck"] = args ? args.healthcheck : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["redirectHttpToHttps"] = args ? args.redirectHttpToHttps : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["size"] = args ? args.size : undefined;
            inputs["stickySessions"] = args ? args.stickySessions : undefined;
            inputs["vpcUuid"] = args ? args.vpcUuid : undefined;
            inputs["ip"] = undefined /*out*/;
            inputs["loadBalancerUrn"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(LoadBalancer.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadBalancer resources.
 */
export interface LoadBalancerState {
    /**
     * The load balancing algorithm used to determine
     * which backend Droplet will be selected by a client. It must be either `roundRobin`
     * or `leastConnections`. The default value is `roundRobin`.
     */
    algorithm?: pulumi.Input<string | enums.Algorithm>;
    /**
     * A list of the IDs of each droplet to be attached to the Load Balancer.
     */
    dropletIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
     */
    dropletTag?: pulumi.Input<string>;
    /**
     * A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
     */
    enableBackendKeepalive?: pulumi.Input<boolean>;
    /**
     * A boolean value indicating whether PROXY
     * Protocol should be used to pass information from connecting client requests to
     * the backend service. Default value is `false`.
     */
    enableProxyProtocol?: pulumi.Input<boolean>;
    /**
     * A list of `forwardingRule` to be assigned to the
     * Load Balancer. The `forwardingRule` block is documented below.
     */
    forwardingRules?: pulumi.Input<pulumi.Input<inputs.LoadBalancerForwardingRule>[]>;
    /**
     * A `healthcheck` block to be assigned to the
     * Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
     */
    healthcheck?: pulumi.Input<inputs.LoadBalancerHealthcheck>;
    ip?: pulumi.Input<string>;
    /**
     * The uniform resource name for the Load Balancer
     */
    loadBalancerUrn?: pulumi.Input<string>;
    /**
     * The Load Balancer name
     */
    name?: pulumi.Input<string>;
    /**
     * A boolean value indicating whether
     * HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
     * Default value is `false`.
     */
    redirectHttpToHttps?: pulumi.Input<boolean>;
    /**
     * The region to start in
     */
    region?: pulumi.Input<string | enums.Region>;
    /**
     * The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`.
     */
    size?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
    /**
     * A `stickySessions` block to be assigned to the
     * Load Balancer. The `stickySessions` block is documented below. Only 1 stickySessions block is allowed.
     */
    stickySessions?: pulumi.Input<inputs.LoadBalancerStickySessions>;
    /**
     * The ID of the VPC where the load balancer will be located.
     */
    vpcUuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LoadBalancer resource.
 */
export interface LoadBalancerArgs {
    /**
     * The load balancing algorithm used to determine
     * which backend Droplet will be selected by a client. It must be either `roundRobin`
     * or `leastConnections`. The default value is `roundRobin`.
     */
    algorithm?: pulumi.Input<string | enums.Algorithm>;
    /**
     * A list of the IDs of each droplet to be attached to the Load Balancer.
     */
    dropletIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
     */
    dropletTag?: pulumi.Input<string>;
    /**
     * A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
     */
    enableBackendKeepalive?: pulumi.Input<boolean>;
    /**
     * A boolean value indicating whether PROXY
     * Protocol should be used to pass information from connecting client requests to
     * the backend service. Default value is `false`.
     */
    enableProxyProtocol?: pulumi.Input<boolean>;
    /**
     * A list of `forwardingRule` to be assigned to the
     * Load Balancer. The `forwardingRule` block is documented below.
     */
    forwardingRules: pulumi.Input<pulumi.Input<inputs.LoadBalancerForwardingRule>[]>;
    /**
     * A `healthcheck` block to be assigned to the
     * Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
     */
    healthcheck?: pulumi.Input<inputs.LoadBalancerHealthcheck>;
    /**
     * The Load Balancer name
     */
    name?: pulumi.Input<string>;
    /**
     * A boolean value indicating whether
     * HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
     * Default value is `false`.
     */
    redirectHttpToHttps?: pulumi.Input<boolean>;
    /**
     * The region to start in
     */
    region: pulumi.Input<string | enums.Region>;
    /**
     * The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`.
     */
    size?: pulumi.Input<string>;
    /**
     * A `stickySessions` block to be assigned to the
     * Load Balancer. The `stickySessions` block is documented below. Only 1 stickySessions block is allowed.
     */
    stickySessions?: pulumi.Input<inputs.LoadBalancerStickySessions>;
    /**
     * The ID of the VPC where the load balancer will be located.
     */
    vpcUuid?: pulumi.Input<string>;
}
