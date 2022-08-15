// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KubernetesNodePoolTaint {
    /**
     * @return How the node reacts to pods that it won&#39;t tolerate. Available effect values are: &#34;NoSchedule&#34;, &#34;PreferNoSchedule&#34;, &#34;NoExecute&#34;.
     * 
     */
    private final String effect;
    /**
     * @return An arbitrary string. The &#34;key&#34; and &#34;value&#34; fields of the &#34;taint&#34; object form a key-value pair.
     * 
     */
    private final String key;
    /**
     * @return An arbitrary string. The &#34;key&#34; and &#34;value&#34; fields of the &#34;taint&#34; object form a key-value pair.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private KubernetesNodePoolTaint(
        @CustomType.Parameter("effect") String effect,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.effect = effect;
        this.key = key;
        this.value = value;
    }

    /**
     * @return How the node reacts to pods that it won&#39;t tolerate. Available effect values are: &#34;NoSchedule&#34;, &#34;PreferNoSchedule&#34;, &#34;NoExecute&#34;.
     * 
     */
    public String effect() {
        return this.effect;
    }
    /**
     * @return An arbitrary string. The &#34;key&#34; and &#34;value&#34; fields of the &#34;taint&#34; object form a key-value pair.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return An arbitrary string. The &#34;key&#34; and &#34;value&#34; fields of the &#34;taint&#34; object form a key-value pair.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesNodePoolTaint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String effect;
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesNodePoolTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder effect(String effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public KubernetesNodePoolTaint build() {
            return new KubernetesNodePoolTaint(effect, key, value);
        }
    }
}
