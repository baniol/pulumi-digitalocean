// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.enums.FileSystemType;
import com.pulumi.digitalocean.enums.Region;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeState extends com.pulumi.resources.ResourceArgs {

    public static final VolumeState Empty = new VolumeState();

    /**
     * A free-form text field up to a limit of 1024 bytes to describe a block storage volume.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A free-form text field up to a limit of 1024 bytes to describe a block storage volume.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A list of associated droplet ids.
     * 
     */
    @Import(name="dropletIds")
    private @Nullable Output<List<Integer>> dropletIds;

    /**
     * @return A list of associated droplet ids.
     * 
     */
    public Optional<Output<List<Integer>>> dropletIds() {
        return Optional.ofNullable(this.dropletIds);
    }

    /**
     * Filesystem label for the block storage volume.
     * 
     */
    @Import(name="filesystemLabel")
    private @Nullable Output<String> filesystemLabel;

    /**
     * @return Filesystem label for the block storage volume.
     * 
     */
    public Optional<Output<String>> filesystemLabel() {
        return Optional.ofNullable(this.filesystemLabel);
    }

    /**
     * Filesystem type (`xfs` or `ext4`) for the block storage volume.
     * 
     * @deprecated
     * This fields functionality has been replaced by `initial_filesystem_type`. The property will still remain as a computed attribute representing the current volumes filesystem type.
     * 
     */
    @Deprecated /* This fields functionality has been replaced by `initial_filesystem_type`. The property will still remain as a computed attribute representing the current volumes filesystem type. */
    @Import(name="filesystemType")
    private @Nullable Output<String> filesystemType;

    /**
     * @return Filesystem type (`xfs` or `ext4`) for the block storage volume.
     * 
     * @deprecated
     * This fields functionality has been replaced by `initial_filesystem_type`. The property will still remain as a computed attribute representing the current volumes filesystem type.
     * 
     */
    @Deprecated /* This fields functionality has been replaced by `initial_filesystem_type`. The property will still remain as a computed attribute representing the current volumes filesystem type. */
    public Optional<Output<String>> filesystemType() {
        return Optional.ofNullable(this.filesystemType);
    }

    /**
     * Initial filesystem label for the block storage volume.
     * 
     */
    @Import(name="initialFilesystemLabel")
    private @Nullable Output<String> initialFilesystemLabel;

    /**
     * @return Initial filesystem label for the block storage volume.
     * 
     */
    public Optional<Output<String>> initialFilesystemLabel() {
        return Optional.ofNullable(this.initialFilesystemLabel);
    }

    /**
     * Initial filesystem type (`xfs` or `ext4`) for the block storage volume.
     * 
     */
    @Import(name="initialFilesystemType")
    private @Nullable Output<Either<String,FileSystemType>> initialFilesystemType;

    /**
     * @return Initial filesystem type (`xfs` or `ext4`) for the block storage volume.
     * 
     */
    public Optional<Output<Either<String,FileSystemType>>> initialFilesystemType() {
        return Optional.ofNullable(this.initialFilesystemType);
    }

    /**
     * A name for the block storage volume. Must be lowercase and be composed only of numbers, letters and &#34;-&#34;, up to a limit of 64 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A name for the block storage volume. Must be lowercase and be composed only of numbers, letters and &#34;-&#34;, up to a limit of 64 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The region that the block storage volume will be created in.
     * 
     */
    @Import(name="region")
    private @Nullable Output<Either<String,Region>> region;

    /**
     * @return The region that the block storage volume will be created in.
     * 
     */
    public Optional<Output<Either<String,Region>>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The size of the block storage volume in GiB. If updated, can only be expanded.
     * 
     */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @return The size of the block storage volume in GiB. If updated, can only be expanded.
     * 
     */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The ID of an existing volume snapshot from which the new volume will be created. If supplied, the region and size will be limitied on creation to that of the referenced snapshot
     * 
     */
    @Import(name="snapshotId")
    private @Nullable Output<String> snapshotId;

    /**
     * @return The ID of an existing volume snapshot from which the new volume will be created. If supplied, the region and size will be limitied on creation to that of the referenced snapshot
     * 
     */
    public Optional<Output<String>> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    /**
     * A list of the tags to be applied to this Volume.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of the tags to be applied to this Volume.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The uniform resource name for the volume.
     * 
     */
    @Import(name="volumeUrn")
    private @Nullable Output<String> volumeUrn;

    /**
     * @return The uniform resource name for the volume.
     * 
     */
    public Optional<Output<String>> volumeUrn() {
        return Optional.ofNullable(this.volumeUrn);
    }

    private VolumeState() {}

    private VolumeState(VolumeState $) {
        this.description = $.description;
        this.dropletIds = $.dropletIds;
        this.filesystemLabel = $.filesystemLabel;
        this.filesystemType = $.filesystemType;
        this.initialFilesystemLabel = $.initialFilesystemLabel;
        this.initialFilesystemType = $.initialFilesystemType;
        this.name = $.name;
        this.region = $.region;
        this.size = $.size;
        this.snapshotId = $.snapshotId;
        this.tags = $.tags;
        this.volumeUrn = $.volumeUrn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeState $;

        public Builder() {
            $ = new VolumeState();
        }

        public Builder(VolumeState defaults) {
            $ = new VolumeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A free-form text field up to a limit of 1024 bytes to describe a block storage volume.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A free-form text field up to a limit of 1024 bytes to describe a block storage volume.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param dropletIds A list of associated droplet ids.
         * 
         * @return builder
         * 
         */
        public Builder dropletIds(@Nullable Output<List<Integer>> dropletIds) {
            $.dropletIds = dropletIds;
            return this;
        }

        /**
         * @param dropletIds A list of associated droplet ids.
         * 
         * @return builder
         * 
         */
        public Builder dropletIds(List<Integer> dropletIds) {
            return dropletIds(Output.of(dropletIds));
        }

        /**
         * @param dropletIds A list of associated droplet ids.
         * 
         * @return builder
         * 
         */
        public Builder dropletIds(Integer... dropletIds) {
            return dropletIds(List.of(dropletIds));
        }

        /**
         * @param filesystemLabel Filesystem label for the block storage volume.
         * 
         * @return builder
         * 
         */
        public Builder filesystemLabel(@Nullable Output<String> filesystemLabel) {
            $.filesystemLabel = filesystemLabel;
            return this;
        }

        /**
         * @param filesystemLabel Filesystem label for the block storage volume.
         * 
         * @return builder
         * 
         */
        public Builder filesystemLabel(String filesystemLabel) {
            return filesystemLabel(Output.of(filesystemLabel));
        }

        /**
         * @param filesystemType Filesystem type (`xfs` or `ext4`) for the block storage volume.
         * 
         * @return builder
         * 
         * @deprecated
         * This fields functionality has been replaced by `initial_filesystem_type`. The property will still remain as a computed attribute representing the current volumes filesystem type.
         * 
         */
        @Deprecated /* This fields functionality has been replaced by `initial_filesystem_type`. The property will still remain as a computed attribute representing the current volumes filesystem type. */
        public Builder filesystemType(@Nullable Output<String> filesystemType) {
            $.filesystemType = filesystemType;
            return this;
        }

        /**
         * @param filesystemType Filesystem type (`xfs` or `ext4`) for the block storage volume.
         * 
         * @return builder
         * 
         * @deprecated
         * This fields functionality has been replaced by `initial_filesystem_type`. The property will still remain as a computed attribute representing the current volumes filesystem type.
         * 
         */
        @Deprecated /* This fields functionality has been replaced by `initial_filesystem_type`. The property will still remain as a computed attribute representing the current volumes filesystem type. */
        public Builder filesystemType(String filesystemType) {
            return filesystemType(Output.of(filesystemType));
        }

        /**
         * @param initialFilesystemLabel Initial filesystem label for the block storage volume.
         * 
         * @return builder
         * 
         */
        public Builder initialFilesystemLabel(@Nullable Output<String> initialFilesystemLabel) {
            $.initialFilesystemLabel = initialFilesystemLabel;
            return this;
        }

        /**
         * @param initialFilesystemLabel Initial filesystem label for the block storage volume.
         * 
         * @return builder
         * 
         */
        public Builder initialFilesystemLabel(String initialFilesystemLabel) {
            return initialFilesystemLabel(Output.of(initialFilesystemLabel));
        }

        /**
         * @param initialFilesystemType Initial filesystem type (`xfs` or `ext4`) for the block storage volume.
         * 
         * @return builder
         * 
         */
        public Builder initialFilesystemType(@Nullable Output<Either<String,FileSystemType>> initialFilesystemType) {
            $.initialFilesystemType = initialFilesystemType;
            return this;
        }

        /**
         * @param initialFilesystemType Initial filesystem type (`xfs` or `ext4`) for the block storage volume.
         * 
         * @return builder
         * 
         */
        public Builder initialFilesystemType(Either<String,FileSystemType> initialFilesystemType) {
            return initialFilesystemType(Output.of(initialFilesystemType));
        }

        /**
         * @param initialFilesystemType Initial filesystem type (`xfs` or `ext4`) for the block storage volume.
         * 
         * @return builder
         * 
         */
        public Builder initialFilesystemType(String initialFilesystemType) {
            return initialFilesystemType(Either.ofLeft(initialFilesystemType));
        }

        /**
         * @param initialFilesystemType Initial filesystem type (`xfs` or `ext4`) for the block storage volume.
         * 
         * @return builder
         * 
         */
        public Builder initialFilesystemType(FileSystemType initialFilesystemType) {
            return initialFilesystemType(Either.ofRight(initialFilesystemType));
        }

        /**
         * @param name A name for the block storage volume. Must be lowercase and be composed only of numbers, letters and &#34;-&#34;, up to a limit of 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name for the block storage volume. Must be lowercase and be composed only of numbers, letters and &#34;-&#34;, up to a limit of 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param region The region that the block storage volume will be created in.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<Either<String,Region>> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region that the block storage volume will be created in.
         * 
         * @return builder
         * 
         */
        public Builder region(Either<String,Region> region) {
            return region(Output.of(region));
        }

        /**
         * @param region The region that the block storage volume will be created in.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Either.ofLeft(region));
        }

        /**
         * @param region The region that the block storage volume will be created in.
         * 
         * @return builder
         * 
         */
        public Builder region(Region region) {
            return region(Either.ofRight(region));
        }

        /**
         * @param size The size of the block storage volume in GiB. If updated, can only be expanded.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the block storage volume in GiB. If updated, can only be expanded.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param snapshotId The ID of an existing volume snapshot from which the new volume will be created. If supplied, the region and size will be limitied on creation to that of the referenced snapshot
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param snapshotId The ID of an existing volume snapshot from which the new volume will be created. If supplied, the region and size will be limitied on creation to that of the referenced snapshot
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        /**
         * @param tags A list of the tags to be applied to this Volume.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of the tags to be applied to this Volume.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of the tags to be applied to this Volume.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param volumeUrn The uniform resource name for the volume.
         * 
         * @return builder
         * 
         */
        public Builder volumeUrn(@Nullable Output<String> volumeUrn) {
            $.volumeUrn = volumeUrn;
            return this;
        }

        /**
         * @param volumeUrn The uniform resource name for the volume.
         * 
         * @return builder
         * 
         */
        public Builder volumeUrn(String volumeUrn) {
            return volumeUrn(Output.of(volumeUrn));
        }

        public VolumeState build() {
            return $;
        }
    }

}
