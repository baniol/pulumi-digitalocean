// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Get information on a certificate. This data source provides the name, type, state,
 * domains, expiry date, and the sha1 fingerprint as configured on your DigitalOcean account.
 * This is useful if the certificate in question is not managed by Terraform or you need to utilize
 * any of the certificates data.
 * 
 * An error is triggered if the provided certificate name does not exist.
 * 
 * ## Example Usage
 * 
 * Get the certificate:
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 * 
 * const example = pulumi.output(digitalocean.getCertificate({
 *     name: "example",
 * }));
 * ```
 */
export function getCertificate(args: GetCertificateArgs, opts?: pulumi.InvokeOptions): Promise<GetCertificateResult> {
    return pulumi.runtime.invoke("digitalocean:index/getCertificate:getCertificate", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificate.
 */
export interface GetCertificateArgs {
    /**
     * The name of certificate.
     */
    readonly name: string;
}

/**
 * A collection of values returned by getCertificate.
 */
export interface GetCertificateResult {
    readonly domains: string[];
    readonly name: string;
    readonly notAfter: string;
    readonly sha1Fingerprint: string;
    readonly state: string;
    readonly type: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
