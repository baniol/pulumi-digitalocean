// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getVpc(args?: GetVpcArgs, opts?: pulumi.InvokeOptions): Promise<GetVpcResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("digitalocean:index/getVpc:getVpc", {
        "id": args.id,
        "name": args.name,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpc.
 */
export interface GetVpcArgs {
    /**
     * The unique identifier of an existing VPC.
     */
    readonly id?: string;
    /**
     * The name of an existing VPC.
     */
    readonly name?: string;
    /**
     * The DigitalOcean region slug for the VPC's location.
     */
    readonly region?: string;
}

/**
 * A collection of values returned by getVpc.
 */
export interface GetVpcResult {
    /**
     * The date and time of when the VPC was created.
     */
    readonly createdAt: string;
    /**
     * A boolean indicating whether or not the VPC is the default one for the region.
     */
    readonly default: boolean;
    /**
     * A free-form text field describing the VPC.
     */
    readonly description: string;
    /**
     * The unique identifier for the VPC.
     */
    readonly id: string;
    /**
     * The range of IP addresses for the VPC in CIDR notation.
     */
    readonly ipRange: string;
    /**
     * The name of the VPC.
     */
    readonly name: string;
    /**
     * The DigitalOcean region slug for the VPC's location.
     */
    readonly region: string;
    /**
     * The uniform resource name (URN) for the VPC.
     */
    readonly urn: string;
}
