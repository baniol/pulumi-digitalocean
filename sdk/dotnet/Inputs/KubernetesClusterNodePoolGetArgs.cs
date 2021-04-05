// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class KubernetesClusterNodePoolGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A computed field representing the actual number of nodes in the node pool, which is especially useful when auto-scaling is enabled.
        /// </summary>
        [Input("actualNodeCount")]
        public Input<int>? ActualNodeCount { get; set; }

        /// <summary>
        /// Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
        /// </summary>
        [Input("autoScale")]
        public Input<bool>? AutoScale { get; set; }

        /// <summary>
        /// A unique ID that can be used to identify and reference the node.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
        /// </summary>
        [Input("maxNodes")]
        public Input<int>? MaxNodes { get; set; }

        /// <summary>
        /// If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
        /// </summary>
        [Input("minNodes")]
        public Input<int>? MinNodes { get; set; }

        /// <summary>
        /// A name for the node pool.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
        /// </summary>
        [Input("nodeCount")]
        public Input<int>? NodeCount { get; set; }

        [Input("nodes")]
        private InputList<Inputs.KubernetesClusterNodePoolNodeGetArgs>? _nodes;

        /// <summary>
        /// A list of nodes in the pool. Each node exports the following attributes:
        /// </summary>
        public InputList<Inputs.KubernetesClusterNodePoolNodeGetArgs> Nodes
        {
            get => _nodes ?? (_nodes = new InputList<Inputs.KubernetesClusterNodePoolNodeGetArgs>());
            set => _nodes = value;
        }

        /// <summary>
        /// The slug identifier for the type of Droplet to be used as workers in the node pool.
        /// </summary>
        [Input("size", required: true)]
        public Input<string> Size { get; set; } = null!;

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tag names to be applied to the Kubernetes cluster.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        [Input("taints")]
        private InputList<Inputs.KubernetesClusterNodePoolTaintGetArgs>? _taints;

        /// <summary>
        /// A block representing a taint applied to all nodes in the pool. Each taint exports the following attributes (taints must be unique by key and effect pair):
        /// </summary>
        public InputList<Inputs.KubernetesClusterNodePoolTaintGetArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.KubernetesClusterNodePoolTaintGetArgs>());
            set => _taints = value;
        }

        public KubernetesClusterNodePoolGetArgs()
        {
        }
    }
}
