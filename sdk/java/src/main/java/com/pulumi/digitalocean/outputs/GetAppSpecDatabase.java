// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecDatabase {
    /**
     * @return The name of the underlying DigitalOcean DBaaS cluster. This is required for production databases. For dev databases, if `cluster_name` is not set, a new cluster will be provisioned.
     * 
     */
    private final @Nullable String clusterName;
    /**
     * @return The name of the MySQL or PostgreSQL database to configure.
     * 
     */
    private final @Nullable String dbName;
    /**
     * @return The name of the MySQL or PostgreSQL user to configure.
     * 
     */
    private final @Nullable String dbUser;
    /**
     * @return The database engine to use (`MYSQL`, `PG`, `REDIS`, or `MONGODB`).
     * 
     */
    private final @Nullable String engine;
    /**
     * @return The name of the component.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Whether this is a production or dev database.
     * 
     */
    private final @Nullable Boolean production;
    /**
     * @return The version of the database engine.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private GetAppSpecDatabase(
        @CustomType.Parameter("clusterName") @Nullable String clusterName,
        @CustomType.Parameter("dbName") @Nullable String dbName,
        @CustomType.Parameter("dbUser") @Nullable String dbUser,
        @CustomType.Parameter("engine") @Nullable String engine,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("production") @Nullable Boolean production,
        @CustomType.Parameter("version") @Nullable String version) {
        this.clusterName = clusterName;
        this.dbName = dbName;
        this.dbUser = dbUser;
        this.engine = engine;
        this.name = name;
        this.production = production;
        this.version = version;
    }

    /**
     * @return The name of the underlying DigitalOcean DBaaS cluster. This is required for production databases. For dev databases, if `cluster_name` is not set, a new cluster will be provisioned.
     * 
     */
    public Optional<String> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }
    /**
     * @return The name of the MySQL or PostgreSQL database to configure.
     * 
     */
    public Optional<String> dbName() {
        return Optional.ofNullable(this.dbName);
    }
    /**
     * @return The name of the MySQL or PostgreSQL user to configure.
     * 
     */
    public Optional<String> dbUser() {
        return Optional.ofNullable(this.dbUser);
    }
    /**
     * @return The database engine to use (`MYSQL`, `PG`, `REDIS`, or `MONGODB`).
     * 
     */
    public Optional<String> engine() {
        return Optional.ofNullable(this.engine);
    }
    /**
     * @return The name of the component.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Whether this is a production or dev database.
     * 
     */
    public Optional<Boolean> production() {
        return Optional.ofNullable(this.production);
    }
    /**
     * @return The version of the database engine.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecDatabase defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterName;
        private @Nullable String dbName;
        private @Nullable String dbUser;
        private @Nullable String engine;
        private @Nullable String name;
        private @Nullable Boolean production;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppSpecDatabase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.dbName = defaults.dbName;
    	      this.dbUser = defaults.dbUser;
    	      this.engine = defaults.engine;
    	      this.name = defaults.name;
    	      this.production = defaults.production;
    	      this.version = defaults.version;
        }

        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public Builder dbName(@Nullable String dbName) {
            this.dbName = dbName;
            return this;
        }
        public Builder dbUser(@Nullable String dbUser) {
            this.dbUser = dbUser;
            return this;
        }
        public Builder engine(@Nullable String engine) {
            this.engine = engine;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder production(@Nullable Boolean production) {
            this.production = production;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public GetAppSpecDatabase build() {
            return new GetAppSpecDatabase(clusterName, dbName, dbUser, engine, name, production, version);
        }
    }
}
