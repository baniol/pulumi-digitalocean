# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from enum import Enum

__all__ = [
    'Algorithm',
    'CertificateType',
    'DatabaseSlug',
    'DropletSlug',
    'FileSystemType',
    'Protocol',
    'RecordType',
    'Region',
]


class Algorithm(str, Enum):
    ROUND_ROBIN = "round_robin"
    LEAST_CONNECTIONS = "least_connections"


class CertificateType(str, Enum):
    LETS_ENCRYPT = "lets_encrypt"
    CUSTOM = "custom"


class DatabaseSlug(str, Enum):
    D_B_1_VPCU1_GB = "db-s-1vcpu-1gb"
    D_B_1_VPCU2_GB = "db-s-1vcpu-2gb"
    D_B_2_VPCU4_GB = "db-s-2vcpu-4gb"
    D_B_4_VPCU8_GB = "db-s-4vcpu-8gb"
    D_B_6_VPCU16_GB = "db-s-6vcpu-16gb"
    D_B_8_VPCU32_GB = "db-s-8vcpu-32gb"
    D_B_16_VPCU64_GB = "db-s-16vcpu-64gb"


class DropletSlug(str, Enum):
    DROPLET_S1_VCPU1_GB = "s-1vcpu-1gb"
    DROPLET_S1_VCPU1_G_B_AMD = "s-1vcpu-1gb-amd"
    DROPLET_S1_VCPU1_G_B_INTEL = "s-1vcpu-1gb-intel"
    DROPLET_S1_VCPU2_GB = "s-1vcpu-2gb"
    DROPLET_S1_VCPU2_G_B_AMD = "s-1vcpu-2gb-amd"
    DROPLET_S1_VCPU2_G_B_INTEL = "s-1vcpu-2gb-intel"
    DROPLET_S2_VCPU2_GB = "s-2vcpu-2gb"
    DROPLET_S2_VCPU2_G_B_AMD = "s-2vcpu-2gb-amd"
    DROPLET_S2_VCPU2_G_B_INTEL = "s-2vcpu-2gb-intel"
    DROPLET_S2_VCPU4_GB = "s-2vcpu-4gb"
    DROPLET_S2_VCPU4_G_B_AMD = "s-2vcpu-4gb-amd"
    DROPLET_S2_VCPU4_G_B_INTEL = "s-2vcpu-4gb-intel"
    DROPLET_S4_VCPU8_GB = "s-4vcpu-8gb"
    DROPLET_S4_VCPU8_G_B_AMD = "s-4vcpu-8gb-amd"
    DROPLET_S4_VCPU8_G_B_INTEL = "s-4vcpu-8gb-intel"
    DROPLET_S8_VCPU16_G_B_AMD = "s-8vcpu-16gb-amd"
    DROPLET_S8_VCPU16_G_B_INTEL = "s-8vcpu-16gb-intel"
    DROPLET_C2 = "c-2"
    DROPLET_C22_VCPU4_GB = "c2-2vcpu-4gb"
    DROPLET_C22_VCPU8_GB = "c2-4vcpu-8gb"
    DROPLET_C28_VCPU16_GB = "c2-8vcpu-16gb"
    DROPLET_C216_VCPU32_GB = "c2-16vcpu-32gb"
    DROPLET_C232_VCPU64_GB = "c2-32vcpu-64gb"
    DROPLET_C4 = "c-4"
    DROPLET_C8 = "c-8"
    DROPLET_C16 = "c-16"
    DROPLET_C32 = "c-32"
    DROPLET_G2_VCPU8_GB = "g-2vcpu-8gb"
    DROPLET_G4_VCPU16_GB = "g-4vcpu-16gb"
    DROPLET_G8_VCPU32_GB = "g-8vcpu-32gb"
    DROPLET_G16_VCPU64_GB = "g-16vcpu-64gb"
    DROPLET_G32_VCPU128_GB = "g-32vcpu-128gb"
    DROPLET_G40_VCPU160_GB = "g-40vcpu-160gb"
    DROPLET_GD2_VCPU8_GB = "gd-2vcpu-8gb"
    DROPLET_GD4_VCPU16_GB = "gd-4vcpu-16gb"
    DROPLET_GD8_VCPU32_GB = "gd-8vcpu-32gb"
    DROPLET_GD16_VCPU64_GB = "gd-16vcpu-64gb"
    DROPLET_GD32_VCPU128_GB = "gd-32vcpu-128gb"
    DROPLET_GD40_VCPU160_GB = "gd-40vcpu-160gb"
    DROPLET_S8_VCPU16_GB = "s-8vcpu-16gb"
    DROPLET_M2_VCPU16_GB = "m-2vcpu-16gb"
    DROPLET_M4_VCPU32_GB = "m-4vcpu-32gb"
    DROPLET_M8_VCPU64_GB = "m-8vcpu-64gb"
    DROPLET_M16_VCPU128_GB = "m-16vcpu-128gb"
    DROPLET_M24_VCPU192_GB = "m-24vcpu-192gb"
    DROPLET_M32_VCPU256_GB = "m-32vcpu-256gb"
    DROPLET_M32_VCPU16_GB = "m3-2vcpu-16gb"
    DROPLET_M34_VCPU32_GB = "m3-4vcpu-32gb"
    DROPLET_M38_VCPU64_GB = "m3-8vcpu-64gb"
    DROPLET_M316_VCPU128_GB = "m3-16vcpu-128gb"
    DROPLET_M324_VCPU192_GB = "m3-24vcpu-192gb"
    DROPLET_M332_VCPU256_GB = "m3-32vcpu-256gb"
    DROPLET_M62_VCPU16_GB = "m6-2vcpu-16gb"
    DROPLET_M64_VCPU32_GB = "m6-4vcpu-32gb"
    DROPLET_M68_VCPU64_GB = "m6-8vcpu-64gb"
    DROPLET_M616_VCPU128_GB = "m6-16vcpu-128gb"
    DROPLET_M624_VCPU192_GB = "m6-24vcpu-192gb"
    DROPLET_M632_VCPU256_GB = "m6-32vcpu-256gb"
    DROPLET_SO2_VCPU16_GB = "so-2vcpu-16gb"
    DROPLET_SO4_VCPU32_GB = "so-4vcpu-32gb"
    DROPLET_SO8_VCPU64_GB = "so-8vcpu-64gb"
    DROPLET_SO16_VCPU128_GB = "so-16vcpu-128gb"
    DROPLET_SO24_VCPU192_GB = "so-24vcpu-192gb"
    DROPLET_SO32_VCPU256_GB = "so-32vcpu-256gb"
    DROPLET_SO152_VCPU16_GB = "so1_5-2vcpu-16gb"
    DROPLET_SO154_VCPU32_GB = "so1_5-4vcpu-32gb"
    DROPLET_SO158_VCPU64_GB = "so1_5-8vcpu-64gb"
    DROPLET_SO1516_VCPU128_GB = "so1_5-16vcpu-128gb"
    DROPLET_SO1524_VCPU192_GB = "so1_5-24vcpu-192gb"
    DROPLET_SO1532_VCPU256_GB = "so1_5-32vcpu-256gb"
    DROPLET512MB = "512mb"
    DROPLET1_GB = "1gb"
    DROPLET2_GB = "2gb"
    DROPLET4_GB = "4gb"
    DROPLET8_GB = "8gb"
    DROPLET16_GB = "16gb"
    DROPLET32_GB = "32gb"
    DROPLET48_GB = "48gb"
    DROPLET64_GB = "64gb"
    DROPLET_S1_VCPU3_GB = "s-1vcpu-3gb"
    DROPLET_S3_VCPU1_GB = "s-3vcpu-1gb"
    DROPLET_S6_VCPU16_GB = "s-6vcpu-16gb"
    DROPLET_S8_VCPU32_GB = "s-8vcpu-32gb"
    DROPLET_S12_VCPU48_GB = "s-12vcpu-48gb"
    DROPLET_S16_VCPU64_GB = "s-16vcpu-64gb"
    DROPLET_S20_VCPU96_GB = "s-20vcpu-96gb"
    DROPLET_S24_VCPU128_GB = "s-24vcpu-128gb"
    DROPLET_S32_VCPU192_GB = "s-32vcpu-192gb"


class FileSystemType(str, Enum):
    EXT4 = "ext4"
    XFS = "xfs"


class Protocol(str, Enum):
    TCP = "tcp"
    UDP = "udp"
    ICMP = "icmp"
    HTTP = "http"
    HTTPS = "https"


class RecordType(str, Enum):
    A = "A"
    AAAA = "AAAA"
    CAA = "CAA"
    CNAME = "CNAME"
    MX = "MX"
    NS = "NS"
    TXT = "TXT"
    SRV = "SRV"


class Region(str, Enum):
    NYC1 = "nyc1"
    NYC2 = "nyc2"
    NYC3 = "nyc3"
    SGP1 = "sgp1"
    LON1 = "lon1"
    AMS2 = "ams2"
    AMS3 = "ams3"
    FRA1 = "fra1"
    TOR1 = "tor1"
    SFO1 = "sfo1"
    SFO2 = "sfo2"
    SFO3 = "sfo3"
    BLR1 = "blr1"
