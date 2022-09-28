// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDropletsDroplet {
    /**
     * @return Whether backups are enabled.
     * 
     */
    private Boolean backups;
    private String createdAt;
    /**
     * @return The size of the Droplet&#39;s disk in GB.
     * 
     */
    private Integer disk;
    /**
     * @return The ID of the Droplet.
     * 
     */
    private Integer id;
    /**
     * @return The Droplet image ID or slug.
     * 
     */
    private String image;
    /**
     * @return The Droplet&#39;s public IPv4 address
     * 
     */
    private String ipv4Address;
    /**
     * @return The Droplet&#39;s private IPv4 address
     * 
     */
    private String ipv4AddressPrivate;
    /**
     * @return Whether IPv6 is enabled.
     * 
     */
    private Boolean ipv6;
    /**
     * @return The Droplet&#39;s public IPv6 address
     * 
     */
    private String ipv6Address;
    /**
     * @return The Droplet&#39;s private IPv6 address
     * 
     */
    private String ipv6AddressPrivate;
    /**
     * @return Whether the Droplet is locked.
     * 
     */
    private Boolean locked;
    /**
     * @return The amount of the Droplet&#39;s memory in MB.
     * 
     */
    private Integer memory;
    /**
     * @return Whether monitoring agent is installed.
     * 
     */
    private Boolean monitoring;
    private String name;
    /**
     * @return Droplet hourly price.
     * 
     */
    private Double priceHourly;
    /**
     * @return Droplet monthly price.
     * 
     */
    private Double priceMonthly;
    /**
     * @return Whether private networks are enabled.
     * 
     */
    private Boolean privateNetworking;
    /**
     * @return The region the Droplet is running in.
     * 
     */
    private String region;
    /**
     * @return The unique slug that identifies the type of Droplet.
     * 
     */
    private String size;
    /**
     * @return The status of the Droplet.
     * 
     */
    private String status;
    /**
     * @return A list of the tags associated to the Droplet.
     * 
     */
    private List<String> tags;
    /**
     * @return The uniform resource name of the Droplet
     * 
     */
    private String urn;
    /**
     * @return The number of the Droplet&#39;s virtual CPUs.
     * 
     */
    private Integer vcpus;
    /**
     * @return List of the IDs of each volumes attached to the Droplet.
     * 
     */
    private List<String> volumeIds;
    /**
     * @return The ID of the VPC where the Droplet is located.
     * 
     */
    private String vpcUuid;

    private GetDropletsDroplet() {}
    /**
     * @return Whether backups are enabled.
     * 
     */
    public Boolean backups() {
        return this.backups;
    }
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return The size of the Droplet&#39;s disk in GB.
     * 
     */
    public Integer disk() {
        return this.disk;
    }
    /**
     * @return The ID of the Droplet.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return The Droplet image ID or slug.
     * 
     */
    public String image() {
        return this.image;
    }
    /**
     * @return The Droplet&#39;s public IPv4 address
     * 
     */
    public String ipv4Address() {
        return this.ipv4Address;
    }
    /**
     * @return The Droplet&#39;s private IPv4 address
     * 
     */
    public String ipv4AddressPrivate() {
        return this.ipv4AddressPrivate;
    }
    /**
     * @return Whether IPv6 is enabled.
     * 
     */
    public Boolean ipv6() {
        return this.ipv6;
    }
    /**
     * @return The Droplet&#39;s public IPv6 address
     * 
     */
    public String ipv6Address() {
        return this.ipv6Address;
    }
    /**
     * @return The Droplet&#39;s private IPv6 address
     * 
     */
    public String ipv6AddressPrivate() {
        return this.ipv6AddressPrivate;
    }
    /**
     * @return Whether the Droplet is locked.
     * 
     */
    public Boolean locked() {
        return this.locked;
    }
    /**
     * @return The amount of the Droplet&#39;s memory in MB.
     * 
     */
    public Integer memory() {
        return this.memory;
    }
    /**
     * @return Whether monitoring agent is installed.
     * 
     */
    public Boolean monitoring() {
        return this.monitoring;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Droplet hourly price.
     * 
     */
    public Double priceHourly() {
        return this.priceHourly;
    }
    /**
     * @return Droplet monthly price.
     * 
     */
    public Double priceMonthly() {
        return this.priceMonthly;
    }
    /**
     * @return Whether private networks are enabled.
     * 
     */
    public Boolean privateNetworking() {
        return this.privateNetworking;
    }
    /**
     * @return The region the Droplet is running in.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The unique slug that identifies the type of Droplet.
     * 
     */
    public String size() {
        return this.size;
    }
    /**
     * @return The status of the Droplet.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return A list of the tags associated to the Droplet.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return The uniform resource name of the Droplet
     * 
     */
    public String urn() {
        return this.urn;
    }
    /**
     * @return The number of the Droplet&#39;s virtual CPUs.
     * 
     */
    public Integer vcpus() {
        return this.vcpus;
    }
    /**
     * @return List of the IDs of each volumes attached to the Droplet.
     * 
     */
    public List<String> volumeIds() {
        return this.volumeIds;
    }
    /**
     * @return The ID of the VPC where the Droplet is located.
     * 
     */
    public String vpcUuid() {
        return this.vpcUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDropletsDroplet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean backups;
        private String createdAt;
        private Integer disk;
        private Integer id;
        private String image;
        private String ipv4Address;
        private String ipv4AddressPrivate;
        private Boolean ipv6;
        private String ipv6Address;
        private String ipv6AddressPrivate;
        private Boolean locked;
        private Integer memory;
        private Boolean monitoring;
        private String name;
        private Double priceHourly;
        private Double priceMonthly;
        private Boolean privateNetworking;
        private String region;
        private String size;
        private String status;
        private List<String> tags;
        private String urn;
        private Integer vcpus;
        private List<String> volumeIds;
        private String vpcUuid;
        public Builder() {}
        public Builder(GetDropletsDroplet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backups = defaults.backups;
    	      this.createdAt = defaults.createdAt;
    	      this.disk = defaults.disk;
    	      this.id = defaults.id;
    	      this.image = defaults.image;
    	      this.ipv4Address = defaults.ipv4Address;
    	      this.ipv4AddressPrivate = defaults.ipv4AddressPrivate;
    	      this.ipv6 = defaults.ipv6;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.ipv6AddressPrivate = defaults.ipv6AddressPrivate;
    	      this.locked = defaults.locked;
    	      this.memory = defaults.memory;
    	      this.monitoring = defaults.monitoring;
    	      this.name = defaults.name;
    	      this.priceHourly = defaults.priceHourly;
    	      this.priceMonthly = defaults.priceMonthly;
    	      this.privateNetworking = defaults.privateNetworking;
    	      this.region = defaults.region;
    	      this.size = defaults.size;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.urn = defaults.urn;
    	      this.vcpus = defaults.vcpus;
    	      this.volumeIds = defaults.volumeIds;
    	      this.vpcUuid = defaults.vpcUuid;
        }

        @CustomType.Setter
        public Builder backups(Boolean backups) {
            this.backups = Objects.requireNonNull(backups);
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder disk(Integer disk) {
            this.disk = Objects.requireNonNull(disk);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Address(String ipv4Address) {
            this.ipv4Address = Objects.requireNonNull(ipv4Address);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4AddressPrivate(String ipv4AddressPrivate) {
            this.ipv4AddressPrivate = Objects.requireNonNull(ipv4AddressPrivate);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6(Boolean ipv6) {
            this.ipv6 = Objects.requireNonNull(ipv6);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = Objects.requireNonNull(ipv6Address);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6AddressPrivate(String ipv6AddressPrivate) {
            this.ipv6AddressPrivate = Objects.requireNonNull(ipv6AddressPrivate);
            return this;
        }
        @CustomType.Setter
        public Builder locked(Boolean locked) {
            this.locked = Objects.requireNonNull(locked);
            return this;
        }
        @CustomType.Setter
        public Builder memory(Integer memory) {
            this.memory = Objects.requireNonNull(memory);
            return this;
        }
        @CustomType.Setter
        public Builder monitoring(Boolean monitoring) {
            this.monitoring = Objects.requireNonNull(monitoring);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder priceHourly(Double priceHourly) {
            this.priceHourly = Objects.requireNonNull(priceHourly);
            return this;
        }
        @CustomType.Setter
        public Builder priceMonthly(Double priceMonthly) {
            this.priceMonthly = Objects.requireNonNull(priceMonthly);
            return this;
        }
        @CustomType.Setter
        public Builder privateNetworking(Boolean privateNetworking) {
            this.privateNetworking = Objects.requireNonNull(privateNetworking);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder size(String size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder urn(String urn) {
            this.urn = Objects.requireNonNull(urn);
            return this;
        }
        @CustomType.Setter
        public Builder vcpus(Integer vcpus) {
            this.vcpus = Objects.requireNonNull(vcpus);
            return this;
        }
        @CustomType.Setter
        public Builder volumeIds(List<String> volumeIds) {
            this.volumeIds = Objects.requireNonNull(volumeIds);
            return this;
        }
        public Builder volumeIds(String... volumeIds) {
            return volumeIds(List.of(volumeIds));
        }
        @CustomType.Setter
        public Builder vpcUuid(String vpcUuid) {
            this.vpcUuid = Objects.requireNonNull(vpcUuid);
            return this;
        }
        public GetDropletsDroplet build() {
            final var o = new GetDropletsDroplet();
            o.backups = backups;
            o.createdAt = createdAt;
            o.disk = disk;
            o.id = id;
            o.image = image;
            o.ipv4Address = ipv4Address;
            o.ipv4AddressPrivate = ipv4AddressPrivate;
            o.ipv6 = ipv6;
            o.ipv6Address = ipv6Address;
            o.ipv6AddressPrivate = ipv6AddressPrivate;
            o.locked = locked;
            o.memory = memory;
            o.monitoring = monitoring;
            o.name = name;
            o.priceHourly = priceHourly;
            o.priceMonthly = priceMonthly;
            o.privateNetworking = privateNetworking;
            o.region = region;
            o.size = size;
            o.status = status;
            o.tags = tags;
            o.urn = urn;
            o.vcpus = vcpus;
            o.volumeIds = volumeIds;
            o.vpcUuid = vpcUuid;
            return o;
        }
    }
}
