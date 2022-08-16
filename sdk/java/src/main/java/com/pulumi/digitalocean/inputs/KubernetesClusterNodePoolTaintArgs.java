// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class KubernetesClusterNodePoolTaintArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterNodePoolTaintArgs Empty = new KubernetesClusterNodePoolTaintArgs();

    /**
     * How the node reacts to pods that it won&#39;t tolerate. Available effect values are: &#34;NoSchedule&#34;, &#34;PreferNoSchedule&#34;, &#34;NoExecute&#34;.
     * 
     */
    @Import(name="effect", required=true)
    private Output<String> effect;

    /**
     * @return How the node reacts to pods that it won&#39;t tolerate. Available effect values are: &#34;NoSchedule&#34;, &#34;PreferNoSchedule&#34;, &#34;NoExecute&#34;.
     * 
     */
    public Output<String> effect() {
        return this.effect;
    }

    /**
     * An arbitrary string. The &#34;key&#34; and &#34;value&#34; fields of the &#34;taint&#34; object form a key-value pair.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return An arbitrary string. The &#34;key&#34; and &#34;value&#34; fields of the &#34;taint&#34; object form a key-value pair.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * An arbitrary string. The &#34;key&#34; and &#34;value&#34; fields of the &#34;taint&#34; object form a key-value pair.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return An arbitrary string. The &#34;key&#34; and &#34;value&#34; fields of the &#34;taint&#34; object form a key-value pair.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private KubernetesClusterNodePoolTaintArgs() {}

    private KubernetesClusterNodePoolTaintArgs(KubernetesClusterNodePoolTaintArgs $) {
        this.effect = $.effect;
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterNodePoolTaintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterNodePoolTaintArgs $;

        public Builder() {
            $ = new KubernetesClusterNodePoolTaintArgs();
        }

        public Builder(KubernetesClusterNodePoolTaintArgs defaults) {
            $ = new KubernetesClusterNodePoolTaintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param effect How the node reacts to pods that it won&#39;t tolerate. Available effect values are: &#34;NoSchedule&#34;, &#34;PreferNoSchedule&#34;, &#34;NoExecute&#34;.
         * 
         * @return builder
         * 
         */
        public Builder effect(Output<String> effect) {
            $.effect = effect;
            return this;
        }

        /**
         * @param effect How the node reacts to pods that it won&#39;t tolerate. Available effect values are: &#34;NoSchedule&#34;, &#34;PreferNoSchedule&#34;, &#34;NoExecute&#34;.
         * 
         * @return builder
         * 
         */
        public Builder effect(String effect) {
            return effect(Output.of(effect));
        }

        /**
         * @param key An arbitrary string. The &#34;key&#34; and &#34;value&#34; fields of the &#34;taint&#34; object form a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key An arbitrary string. The &#34;key&#34; and &#34;value&#34; fields of the &#34;taint&#34; object form a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value An arbitrary string. The &#34;key&#34; and &#34;value&#34; fields of the &#34;taint&#34; object form a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value An arbitrary string. The &#34;key&#34; and &#34;value&#34; fields of the &#34;taint&#34; object form a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public KubernetesClusterNodePoolTaintArgs build() {
            $.effect = Objects.requireNonNull($.effect, "expected parameter 'effect' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
