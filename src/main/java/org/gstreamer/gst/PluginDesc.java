package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A plugin should export a variable of this type called plugin_desc. The plugin
 * loader will use the data provided there to initialize the plugin.
 * <p>
 * The {@code licence} parameter must be one of: LGPL, GPL, QPL, GPL/QPL, MPL,
 * BSD, MIT/X11, Proprietary, unknown.
 */
public class PluginDesc extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPluginDesc";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("major_version"),
            Interop.valueLayout.C_INT.withName("minor_version"),
            Interop.valueLayout.ADDRESS.withName("name"),
            Interop.valueLayout.ADDRESS.withName("description"),
            Interop.valueLayout.ADDRESS.withName("plugin_init"),
            Interop.valueLayout.ADDRESS.withName("version"),
            Interop.valueLayout.ADDRESS.withName("license"),
            Interop.valueLayout.ADDRESS.withName("source"),
            Interop.valueLayout.ADDRESS.withName("package"),
            Interop.valueLayout.ADDRESS.withName("origin"),
            Interop.valueLayout.ADDRESS.withName("release_datetime"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PluginDesc}
     * @return A new, uninitialized @{link PluginDesc}
     */
    public static PluginDesc allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PluginDesc newInstance = new PluginDesc(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code major_version}
     * @return The value of the field {@code major_version}
     */
    public int getMajorVersion() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("major_version"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code major_version}
     * @param majorVersion The new value of the field {@code major_version}
     */
    public void setMajorVersion(int majorVersion) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("major_version"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), majorVersion);
        }
    }
    
    /**
     * Get the value of the field {@code minor_version}
     * @return The value of the field {@code minor_version}
     */
    public int getMinorVersion() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("minor_version"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code minor_version}
     * @param minorVersion The new value of the field {@code minor_version}
     */
    public void setMinorVersion(int minorVersion) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("minor_version"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), minorVersion);
        }
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String getName() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void setName(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code description}
     * @return The value of the field {@code description}
     */
    public java.lang.String getDescription() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("description"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code description}
     * @param description The new value of the field {@code description}
     */
    public void setDescription(java.lang.String description) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("description"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (description == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(description, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code plugin_init}
     * @return The value of the field {@code plugin_init}
     */
    public org.gstreamer.gst.PluginInitFunc getPluginInit() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("plugin_init"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code plugin_init}
     * @param pluginInit The new value of the field {@code plugin_init}
     */
    public void setPluginInit(org.gstreamer.gst.PluginInitFunc pluginInit) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("plugin_init"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pluginInit == null ? MemoryAddress.NULL : (Addressable) pluginInit.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code version}
     * @return The value of the field {@code version}
     */
    public java.lang.String getVersion() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("version"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code version}
     * @param version The new value of the field {@code version}
     */
    public void setVersion(java.lang.String version) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("version"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (version == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(version, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code license}
     * @return The value of the field {@code license}
     */
    public java.lang.String getLicense() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("license"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code license}
     * @param license The new value of the field {@code license}
     */
    public void setLicense(java.lang.String license) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("license"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (license == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(license, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code source}
     * @return The value of the field {@code source}
     */
    public java.lang.String getSource() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("source"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code source}
     * @param source The new value of the field {@code source}
     */
    public void setSource(java.lang.String source) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("source"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (source == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(source, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code package}
     * @return The value of the field {@code package}
     */
    public java.lang.String getPackage() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("package"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code package}
     * @param package_ The new value of the field {@code package}
     */
    public void setPackage(java.lang.String package_) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("package"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (package_ == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(package_, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code origin}
     * @return The value of the field {@code origin}
     */
    public java.lang.String getOrigin() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("origin"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code origin}
     * @param origin The new value of the field {@code origin}
     */
    public void setOrigin(java.lang.String origin) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("origin"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (origin == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(origin, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code release_datetime}
     * @return The value of the field {@code release_datetime}
     */
    public java.lang.String getReleaseDatetime() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("release_datetime"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code release_datetime}
     * @param releaseDatetime The new value of the field {@code release_datetime}
     */
    public void setReleaseDatetime(java.lang.String releaseDatetime) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("release_datetime"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (releaseDatetime == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(releaseDatetime, SCOPE)));
        }
    }
    
    /**
     * Create a PluginDesc proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PluginDesc(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PluginDesc> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PluginDesc(input);
    
    /**
     * A {@link PluginDesc.Builder} object constructs a {@link PluginDesc} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PluginDesc.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PluginDesc struct;
        
        private Builder() {
            struct = PluginDesc.allocate();
        }
        
        /**
         * Finish building the {@link PluginDesc} struct.
         * @return A new instance of {@code PluginDesc} with the fields 
         *         that were set in the Builder object.
         */
        public PluginDesc build() {
            return struct;
        }
        
        /**
         * the major version number of core that plugin was compiled for
         * @param majorVersion The value for the {@code majorVersion} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMajorVersion(int majorVersion) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("major_version"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), majorVersion);
                return this;
            }
        }
        
        /**
         * the minor version number of core that plugin was compiled for
         * @param minorVersion The value for the {@code minorVersion} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinorVersion(int minorVersion) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("minor_version"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), minorVersion);
                return this;
            }
        }
        
        /**
         * a unique name of the plugin
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
                return this;
            }
        }
        
        /**
         * description of plugin
         * @param description The value for the {@code description} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDescription(java.lang.String description) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("description"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (description == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(description, SCOPE)));
                return this;
            }
        }
        
        /**
         * pointer to the init function of this plugin.
         * @param pluginInit The value for the {@code pluginInit} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPluginInit(org.gstreamer.gst.PluginInitFunc pluginInit) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("plugin_init"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pluginInit == null ? MemoryAddress.NULL : (Addressable) pluginInit.toCallback()));
                return this;
            }
        }
        
        /**
         * version of the plugin
         * @param version The value for the {@code version} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVersion(java.lang.String version) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("version"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (version == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(version, SCOPE)));
                return this;
            }
        }
        
        /**
         * effective license of plugin
         * @param license The value for the {@code license} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLicense(java.lang.String license) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("license"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (license == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(license, SCOPE)));
                return this;
            }
        }
        
        /**
         * source module plugin belongs to
         * @param source The value for the {@code source} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSource(java.lang.String source) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("source"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (source == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(source, SCOPE)));
                return this;
            }
        }
        
        /**
         * shipped package plugin belongs to
         * @param package_ The value for the {@code package_} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPackage(java.lang.String package_) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("package"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (package_ == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(package_, SCOPE)));
                return this;
            }
        }
        
        /**
         * URL to provider of plugin
         * @param origin The value for the {@code origin} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOrigin(java.lang.String origin) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("origin"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (origin == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(origin, SCOPE)));
                return this;
            }
        }
        
        /**
         * date time string in ISO 8601
         *     format (or rather, a subset thereof), or {@code null}. Allowed are the
         *     following formats: "YYYY-MM-DD" and "YYY-MM-DDTHH:MMZ" (with
         *     'T' a separator and 'Z' indicating UTC/Zulu time). This field
         *     should be set via the GST_PACKAGE_RELEASE_DATETIME
         *     preprocessor macro.
         * @param releaseDatetime The value for the {@code releaseDatetime} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setReleaseDatetime(java.lang.String releaseDatetime) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("release_datetime"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (releaseDatetime == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(releaseDatetime, SCOPE)));
                return this;
            }
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
                return this;
            }
        }
    }
}
