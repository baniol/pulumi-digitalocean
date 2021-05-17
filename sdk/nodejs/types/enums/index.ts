// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***


export const Algorithm = {
    RoundRobin: "round_robin",
    LeastConnections: "least_connections",
} as const;

export type Algorithm = (typeof Algorithm)[keyof typeof Algorithm];

export const CertificateType = {
    LetsEncrypt: "lets_encrypt",
    Custom: "custom",
} as const;

export type CertificateType = (typeof CertificateType)[keyof typeof CertificateType];

export const DatabaseSlug = {
    DB_1VPCU1GB: "db-s-1vcpu-1gb",
    DB_1VPCU2GB: "db-s-1vcpu-2gb",
    DB_2VPCU4GB: "db-s-2vcpu-4gb",
    DB_4VPCU8GB: "db-s-4vcpu-8gb",
    DB_6VPCU16GB: "db-s-6vcpu-16gb",
    DB_8VPCU32GB: "db-s-8vcpu-32gb",
    DB_16VPCU64GB: "db-s-16vcpu-64gb",
} as const;

export type DatabaseSlug = (typeof DatabaseSlug)[keyof typeof DatabaseSlug];

export const DropletSlug = {
    DropletS1VCPU1GB: "s-1vcpu-1gb",
    DropletS1VCPU1GB_AMD: "s-1vcpu-1gb-amd",
    DropletS1VCPU1GB_INTEL: "s-1vcpu-1gb-intel",
    DropletS1VCPU2GB: "s-1vcpu-2gb",
    DropletS1VCPU2GB_AMD: "s-1vcpu-2gb-amd",
    DropletS1VCPU2GB_INTEL: "s-1vcpu-2gb-intel",
    DropletS2VCPU2GB: "s-2vcpu-2gb",
    DropletS2VCPU2GB_AMD: "s-2vcpu-2gb-amd",
    DropletS2VCPU2GB_INTEL: "s-2vcpu-2gb-intel",
    DropletS2VCPU4GB: "s-2vcpu-4gb",
    DropletS2VCPU4GB_AMD: "s-2vcpu-4gb-amd",
    DropletS2VCPU4GB_INTEL: "s-2vcpu-4gb-intel",
    DropletS4VCPU8GB: "s-4vcpu-8gb",
    DropletS4VCPU8GB_AMD: "s-4vcpu-8gb-amd",
    DropletS4VCPU8GB_INTEL: "s-4vcpu-8gb-intel",
    DropletS8VCPU16GB_AMD: "s-8vcpu-16gb-amd",
    DropletS8VCPU16GB_INTEL: "s-8vcpu-16gb-intel",
    DropletC2: "c-2",
    DropletC22VCPU4GB: "c2-2vcpu-4gb",
    DropletC22VCPU8GB: "c2-4vcpu-8gb",
    DropletC28VCPU16GB: "c2-8vcpu-16gb",
    DropletC216VCPU32GB: "c2-16vcpu-32gb",
    DropletC232VCPU64GB: "c2-32vcpu-64gb",
    DropletC4: "c-4",
    DropletC8: "c-8",
    DropletC16: "c-16",
    DropletC32: "c-32",
    DropletG2VCPU8GB: "g-2vcpu-8gb",
    DropletG4VCPU16GB: "g-4vcpu-16gb",
    DropletG8VCPU32GB: "g-8vcpu-32gb",
    DropletG16VCPU64GB: "g-16vcpu-64gb",
    DropletG32VCPU128GB: "g-32vcpu-128gb",
    DropletG40VCPU160GB: "g-40vcpu-160gb",
    DropletGD2VCPU8GB: "gd-2vcpu-8gb",
    DropletGD4VCPU16GB: "gd-4vcpu-16gb",
    DropletGD8VCPU32GB: "gd-8vcpu-32gb",
    DropletGD16VCPU64GB: "gd-16vcpu-64gb",
    DropletGD32VCPU128GB: "gd-32vcpu-128gb",
    DropletGD40VCPU160GB: "gd-40vcpu-160gb",
    DropletS8VCPU16GB: "s-8vcpu-16gb",
    DropletM2VCPU16GB: "m-2vcpu-16gb",
    DropletM4VCPU32GB: "m-4vcpu-32gb",
    DropletM8VCPU64GB: "m-8vcpu-64gb",
    DropletM16VCPU128GB: "m-16vcpu-128gb",
    DropletM24VCPU192GB: "m-24vcpu-192gb",
    DropletM32VCPU256GB: "m-32vcpu-256gb",
    DropletM32VCPU16GB: "m3-2vcpu-16gb",
    DropletM34VCPU32GB: "m3-4vcpu-32gb",
    DropletM38VCPU64GB: "m3-8vcpu-64gb",
    DropletM316VCPU128GB: "m3-16vcpu-128gb",
    DropletM324VCPU192GB: "m3-24vcpu-192gb",
    DropletM332VCPU256GB: "m3-32vcpu-256gb",
    DropletM62VCPU16GB: "m6-2vcpu-16gb",
    DropletM64VCPU32GB: "m6-4vcpu-32gb",
    DropletM68VCPU64GB: "m6-8vcpu-64gb",
    DropletM616VCPU128GB: "m6-16vcpu-128gb",
    DropletM624VCPU192GB: "m6-24vcpu-192gb",
    DropletM632VCPU256GB: "m6-32vcpu-256gb",
    DropletSO2VCPU16GB: "so-2vcpu-16gb",
    DropletSO4VCPU32GB: "so-4vcpu-32gb",
    DropletSO8VCPU64GB: "so-8vcpu-64gb",
    DropletSO16VCPU128GB: "so-16vcpu-128gb",
    DropletSO24VCPU192GB: "so-24vcpu-192gb",
    DropletSO32VCPU256GB: "so-32vcpu-256gb",
    DropletSO152VCPU16GB: "so1_5-2vcpu-16gb",
    DropletSO154VCPU32GB: "so1_5-4vcpu-32gb",
    DropletSO158VCPU64GB: "so1_5-8vcpu-64gb",
    DropletSO1516VCPU128GB: "so1_5-16vcpu-128gb",
    DropletSO1524VCPU192GB: "so1_5-24vcpu-192gb",
    DropletSO1532VCPU256GB: "so1_5-32vcpu-256gb",
    Droplet512mb: "512mb",
    Droplet1GB: "1gb",
    Droplet2GB: "2gb",
    Droplet4GB: "4gb",
    Droplet8GB: "8gb",
    Droplet16GB: "16gb",
    Droplet32GB: "32gb",
    Droplet48GB: "48gb",
    Droplet64GB: "64gb",
    DropletS1VCPU3GB: "s-1vcpu-3gb",
    DropletS3VCPU1GB: "s-3vcpu-1gb",
    DropletS6VCPU16GB: "s-6vcpu-16gb",
    DropletS8VCPU32GB: "s-8vcpu-32gb",
    DropletS12VCPU48GB: "s-12vcpu-48gb",
    DropletS16VCPU64GB: "s-16vcpu-64gb",
    DropletS20VCPU96GB: "s-20vcpu-96gb",
    DropletS24VCPU128GB: "s-24vcpu-128gb",
    DropletS32VCPU192GB: "s-32vcpu-192gb",
} as const;

export type DropletSlug = (typeof DropletSlug)[keyof typeof DropletSlug];

export const FileSystemType = {
    EXT4: "ext4",
    XFS: "xfs",
} as const;

export type FileSystemType = (typeof FileSystemType)[keyof typeof FileSystemType];

export const Protocol = {
    TCP: "tcp",
    UDP: "udp",
    ICMP: "icmp",
    HTTP: "http",
    HTTPS: "https",
} as const;

export type Protocol = (typeof Protocol)[keyof typeof Protocol];

export const RecordType = {
    A: "A",
    AAAA: "AAAA",
    CAA: "CAA",
    CNAME: "CNAME",
    MX: "MX",
    NS: "NS",
    TXT: "TXT",
    SRV: "SRV",
} as const;

export type RecordType = (typeof RecordType)[keyof typeof RecordType];

export const Region = {
    NYC1: "nyc1",
    NYC2: "nyc2",
    NYC3: "nyc3",
    SGP1: "sgp1",
    LON1: "lon1",
    AMS2: "ams2",
    AMS3: "ams3",
    FRA1: "fra1",
    TOR1: "tor1",
    SFO1: "sfo1",
    SFO2: "sfo2",
    SFO3: "sfo3",
    BLR1: "blr1",
} as const;

export type Region = (typeof Region)[keyof typeof Region];
