// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean Certificate resource that allows you to manage
 * certificates for configuring TLS termination in Load Balancers.
 * Certificates created with this resource can be referenced in your
 * Load Balancer configuration via their ID. The certificate can either
 * be a custom one provided by you or automatically generated one with
 * Let's Encrypt.
 *
 * ## Example Usage
 * ### Custom Certificate
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 * import * from "fs";
 *
 * const cert = new digitalocean.Certificate("cert", {
 *     type: "custom",
 *     privateKey: fs.readFileSync("/Users/myuser/certs/privkey.pem"),
 *     leafCertificate: fs.readFileSync("/Users/myuser/certs/cert.pem"),
 *     certificateChain: fs.readFileSync("/Users/myuser/certs/fullchain.pem"),
 * });
 * ```
 * ### Let's Encrypt Certificate
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const cert = new digitalocean.Certificate("cert", {
 *     domains: ["example.com"],
 *     type: "lets_encrypt",
 * });
 * ```
 * ### Use with Other Resources
 *
 * Both custom and Let's Encrypt certificates can be used with other resources
 * including the `digitalocean.LoadBalancer` and `digitalocean.Cdn` resources.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const cert = new digitalocean.Certificate("cert", {
 *     type: "lets_encrypt",
 *     domains: ["example.com"],
 * });
 * // Create a new Load Balancer with TLS termination
 * const _public = new digitalocean.LoadBalancer("public", {
 *     region: "nyc3",
 *     dropletTag: "backend",
 *     forwardingRules: [{
 *         entryPort: 443,
 *         entryProtocol: "https",
 *         targetPort: 80,
 *         targetProtocol: "http",
 *         certificateName: cert.name,
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Certificates can be imported using the certificate `name`, e.g.
 *
 * ```sh
 *  $ pulumi import digitalocean:index/certificate:Certificate mycertificate cert-01
 * ```
 */
export class Certificate extends pulumi.CustomResource {
    /**
     * Get an existing Certificate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CertificateState, opts?: pulumi.CustomResourceOptions): Certificate {
        return new Certificate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/certificate:Certificate';

    /**
     * Returns true if the given object is an instance of Certificate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Certificate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Certificate.__pulumiType;
    }

    /**
     * The full PEM-formatted trust chain
     * between the certificate authority's certificate and your domain's TLS
     * certificate. Only valid when type is `custom`.
     */
    public readonly certificateChain!: pulumi.Output<string | undefined>;
    /**
     * List of fully qualified domain names (FQDNs) for
     * which the certificate will be issued. The domains must be managed using
     * DigitalOcean's DNS. Only valid when type is `letsEncrypt`.
     */
    public readonly domains!: pulumi.Output<string[] | undefined>;
    /**
     * The contents of a PEM-formatted public
     * TLS certificate. Only valid when type is `custom`.
     */
    public readonly leafCertificate!: pulumi.Output<string | undefined>;
    /**
     * The name of the certificate for identification.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The expiration date of the certificate
     */
    public /*out*/ readonly notAfter!: pulumi.Output<string>;
    /**
     * The contents of a PEM-formatted private-key
     * corresponding to the SSL certificate. Only valid when type is `custom`.
     */
    public readonly privateKey!: pulumi.Output<string | undefined>;
    /**
     * The SHA-1 fingerprint of the certificate
     */
    public /*out*/ readonly sha1Fingerprint!: pulumi.Output<string>;
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The type of certificate to provision. Can be either
     * `custom` or `letsEncrypt`. Defaults to `custom`.
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * The UUID of the certificate
     */
    public /*out*/ readonly uuid!: pulumi.Output<string>;

    /**
     * Create a Certificate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: CertificateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CertificateArgs | CertificateState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CertificateState | undefined;
            inputs["certificateChain"] = state ? state.certificateChain : undefined;
            inputs["domains"] = state ? state.domains : undefined;
            inputs["leafCertificate"] = state ? state.leafCertificate : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["notAfter"] = state ? state.notAfter : undefined;
            inputs["privateKey"] = state ? state.privateKey : undefined;
            inputs["sha1Fingerprint"] = state ? state.sha1Fingerprint : undefined;
            inputs["state"] = state ? state.state : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["uuid"] = state ? state.uuid : undefined;
        } else {
            const args = argsOrState as CertificateArgs | undefined;
            inputs["certificateChain"] = args ? args.certificateChain : undefined;
            inputs["domains"] = args ? args.domains : undefined;
            inputs["leafCertificate"] = args ? args.leafCertificate : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["privateKey"] = args ? args.privateKey : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["notAfter"] = undefined /*out*/;
            inputs["sha1Fingerprint"] = undefined /*out*/;
            inputs["state"] = undefined /*out*/;
            inputs["uuid"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Certificate.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Certificate resources.
 */
export interface CertificateState {
    /**
     * The full PEM-formatted trust chain
     * between the certificate authority's certificate and your domain's TLS
     * certificate. Only valid when type is `custom`.
     */
    readonly certificateChain?: pulumi.Input<string>;
    /**
     * List of fully qualified domain names (FQDNs) for
     * which the certificate will be issued. The domains must be managed using
     * DigitalOcean's DNS. Only valid when type is `letsEncrypt`.
     */
    readonly domains?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The contents of a PEM-formatted public
     * TLS certificate. Only valid when type is `custom`.
     */
    readonly leafCertificate?: pulumi.Input<string>;
    /**
     * The name of the certificate for identification.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The expiration date of the certificate
     */
    readonly notAfter?: pulumi.Input<string>;
    /**
     * The contents of a PEM-formatted private-key
     * corresponding to the SSL certificate. Only valid when type is `custom`.
     */
    readonly privateKey?: pulumi.Input<string>;
    /**
     * The SHA-1 fingerprint of the certificate
     */
    readonly sha1Fingerprint?: pulumi.Input<string>;
    readonly state?: pulumi.Input<string>;
    /**
     * The type of certificate to provision. Can be either
     * `custom` or `letsEncrypt`. Defaults to `custom`.
     */
    readonly type?: pulumi.Input<string | enums.CertificateType>;
    /**
     * The UUID of the certificate
     */
    readonly uuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Certificate resource.
 */
export interface CertificateArgs {
    /**
     * The full PEM-formatted trust chain
     * between the certificate authority's certificate and your domain's TLS
     * certificate. Only valid when type is `custom`.
     */
    readonly certificateChain?: pulumi.Input<string>;
    /**
     * List of fully qualified domain names (FQDNs) for
     * which the certificate will be issued. The domains must be managed using
     * DigitalOcean's DNS. Only valid when type is `letsEncrypt`.
     */
    readonly domains?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The contents of a PEM-formatted public
     * TLS certificate. Only valid when type is `custom`.
     */
    readonly leafCertificate?: pulumi.Input<string>;
    /**
     * The name of the certificate for identification.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The contents of a PEM-formatted private-key
     * corresponding to the SSL certificate. Only valid when type is `custom`.
     */
    readonly privateKey?: pulumi.Input<string>;
    /**
     * The type of certificate to provision. Can be either
     * `custom` or `letsEncrypt`. Defaults to `custom`.
     */
    readonly type?: pulumi.Input<string | enums.CertificateType>;
}
