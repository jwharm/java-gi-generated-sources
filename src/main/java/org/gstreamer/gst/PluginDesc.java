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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PluginDesc}
     * @return A new, uninitialized @{link PluginDesc}
     */
    public static PluginDesc allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PluginDesc newInstance = new PluginDesc(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code major_version}
     * @return The value of the field {@code major_version}
     */
    public int majorVersion$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("major_version"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code major_version}
     * @param majorVersion The new value of the field {@code major_version}
     */
    public void majorVersion$set(int majorVersion) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("major_version"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), majorVersion);
    }
    
    /**
     * Get the value of the field {@code minor_version}
     * @return The value of the field {@code minor_version}
     */
    public int minorVersion$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("minor_version"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code minor_version}
     * @param minorVersion The new value of the field {@code minor_version}
     */
    public void minorVersion$set(int minorVersion) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("minor_version"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), minorVersion);
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void name$set(java.lang.String name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(name));
    }
    
    /**
     * Get the value of the field {@code description}
     * @return The value of the field {@code description}
     */
    public java.lang.String description$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code description}
     * @param description The new value of the field {@code description}
     */
    public void description$set(java.lang.String description) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(description));
    }
    
    /**
     * Get the value of the field {@code plugin_init}
     * @return The value of the field {@code plugin_init}
     */
    public org.gstreamer.gst.PluginInitFunc pluginInit$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("plugin_init"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code version}
     * @return The value of the field {@code version}
     */
    public java.lang.String version$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("version"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code version}
     * @param version The new value of the field {@code version}
     */
    public void version$set(java.lang.String version) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("version"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(version));
    }
    
    /**
     * Get the value of the field {@code license}
     * @return The value of the field {@code license}
     */
    public java.lang.String license$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("license"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code license}
     * @param license The new value of the field {@code license}
     */
    public void license$set(java.lang.String license) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("license"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(license));
    }
    
    /**
     * Get the value of the field {@code source}
     * @return The value of the field {@code source}
     */
    public java.lang.String source$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("source"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code source}
     * @param source The new value of the field {@code source}
     */
    public void source$set(java.lang.String source) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("source"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(source));
    }
    
    /**
     * Get the value of the field {@code package}
     * @return The value of the field {@code package}
     */
    public java.lang.String package_$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("package"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code package}
     * @param package_ The new value of the field {@code package}
     */
    public void package_$set(java.lang.String package_) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("package"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(package_));
    }
    
    /**
     * Get the value of the field {@code origin}
     * @return The value of the field {@code origin}
     */
    public java.lang.String origin$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("origin"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code origin}
     * @param origin The new value of the field {@code origin}
     */
    public void origin$set(java.lang.String origin) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("origin"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(origin));
    }
    
    /**
     * Get the value of the field {@code release_datetime}
     * @return The value of the field {@code release_datetime}
     */
    public java.lang.String releaseDatetime$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("release_datetime"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code release_datetime}
     * @param releaseDatetime The new value of the field {@code release_datetime}
     */
    public void releaseDatetime$set(java.lang.String releaseDatetime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("release_datetime"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(releaseDatetime));
    }
    
    /**
     * Create a PluginDesc proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PluginDesc(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PluginDesc struct;
        
         /**
         * A {@link PluginDesc.Build} object constructs a {@link PluginDesc} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PluginDesc.allocate();
        }
        
         /**
         * Finish building the {@link PluginDesc} struct.
         * @return A new instance of {@code PluginDesc} with the fields 
         *         that were set in the Build object.
         */
        public PluginDesc construct() {
            return struct;
        }
        
        /**
         * the major version number of core that plugin was compiled for
         * @param majorVersion The value for the {@code majorVersion} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMajorVersion(int majorVersion) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("major_version"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), majorVersion);
            return this;
        }
        
        /**
         * the minor version number of core that plugin was compiled for
         * @param minorVersion The value for the {@code minorVersion} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMinorVersion(int minorVersion) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("minor_version"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), minorVersion);
            return this;
        }
        
        /**
         * a unique name of the plugin
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
            return this;
        }
        
        /**
         * description of plugin
         * @param description The value for the {@code description} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDescription(java.lang.String description) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("description"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (description == null ? MemoryAddress.NULL : Interop.allocateNativeString(description)));
            return this;
        }
        
        /**
         * pointer to the init function of this plugin.
         * @param pluginInit The value for the {@code pluginInit} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPluginInit(java.lang.foreign.MemoryAddress pluginInit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("plugin_init"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pluginInit == null ? MemoryAddress.NULL : pluginInit));
            return this;
        }
        
        /**
         * version of the plugin
         * @param version The value for the {@code version} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVersion(java.lang.String version) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("version"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (version == null ? MemoryAddress.NULL : Interop.allocateNativeString(version)));
            return this;
        }
        
        /**
         * effective license of plugin
         * @param license The value for the {@code license} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLicense(java.lang.String license) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("license"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (license == null ? MemoryAddress.NULL : Interop.allocateNativeString(license)));
            return this;
        }
        
        /**
         * source module plugin belongs to
         * @param source The value for the {@code source} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSource(java.lang.String source) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("source"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (source == null ? MemoryAddress.NULL : Interop.allocateNativeString(source)));
            return this;
        }
        
        /**
         * shipped package plugin belongs to
         * @param package_ The value for the {@code package_} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPackage(java.lang.String package_) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("package"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (package_ == null ? MemoryAddress.NULL : Interop.allocateNativeString(package_)));
            return this;
        }
        
        /**
         * URL to provider of plugin
         * @param origin The value for the {@code origin} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOrigin(java.lang.String origin) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("origin"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (origin == null ? MemoryAddress.NULL : Interop.allocateNativeString(origin)));
            return this;
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
        public Build setReleaseDatetime(java.lang.String releaseDatetime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("release_datetime"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (releaseDatetime == null ? MemoryAddress.NULL : Interop.allocateNativeString(releaseDatetime)));
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
