// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DatabaseClusterMaintenanceWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseClusterMaintenanceWindowArgs Empty = new DatabaseClusterMaintenanceWindowArgs();

    /**
     * The day of the week on which to apply maintenance updates.
     * 
     */
    @Import(name="day", required=true)
    private Output<String> day;

    /**
     * @return The day of the week on which to apply maintenance updates.
     * 
     */
    public Output<String> day() {
        return this.day;
    }

    /**
     * The hour in UTC at which maintenance updates will be applied in 24 hour format.
     * 
     */
    @Import(name="hour", required=true)
    private Output<String> hour;

    /**
     * @return The hour in UTC at which maintenance updates will be applied in 24 hour format.
     * 
     */
    public Output<String> hour() {
        return this.hour;
    }

    private DatabaseClusterMaintenanceWindowArgs() {}

    private DatabaseClusterMaintenanceWindowArgs(DatabaseClusterMaintenanceWindowArgs $) {
        this.day = $.day;
        this.hour = $.hour;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseClusterMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseClusterMaintenanceWindowArgs $;

        public Builder() {
            $ = new DatabaseClusterMaintenanceWindowArgs();
        }

        public Builder(DatabaseClusterMaintenanceWindowArgs defaults) {
            $ = new DatabaseClusterMaintenanceWindowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param day The day of the week on which to apply maintenance updates.
         * 
         * @return builder
         * 
         */
        public Builder day(Output<String> day) {
            $.day = day;
            return this;
        }

        /**
         * @param day The day of the week on which to apply maintenance updates.
         * 
         * @return builder
         * 
         */
        public Builder day(String day) {
            return day(Output.of(day));
        }

        /**
         * @param hour The hour in UTC at which maintenance updates will be applied in 24 hour format.
         * 
         * @return builder
         * 
         */
        public Builder hour(Output<String> hour) {
            $.hour = hour;
            return this;
        }

        /**
         * @param hour The hour in UTC at which maintenance updates will be applied in 24 hour format.
         * 
         * @return builder
         * 
         */
        public Builder hour(String hour) {
            return hour(Output.of(hour));
        }

        public DatabaseClusterMaintenanceWindowArgs build() {
            $.day = Objects.requireNonNull($.day, "expected parameter 'day' to be non-null");
            $.hour = Objects.requireNonNull($.hour, "expected parameter 'hour' to be non-null");
            return $;
        }
    }

}