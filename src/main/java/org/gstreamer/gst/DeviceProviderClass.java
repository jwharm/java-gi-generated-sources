package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The structure of the base {@link DeviceProviderClass}
 * @version 1.4
 */
public class DeviceProviderClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDeviceProviderClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("factory"),
        Interop.valueLayout.ADDRESS.withName("probe"),
        Interop.valueLayout.ADDRESS.withName("start"),
        Interop.valueLayout.ADDRESS.withName("stop"),
        Interop.valueLayout.ADDRESS.withName("metadata"),
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
     * Allocate a new {@link DeviceProviderClass}
     * @return A new, uninitialized @{link DeviceProviderClass}
     */
    public static DeviceProviderClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DeviceProviderClass newInstance = new DeviceProviderClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gst.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code factory}
     * @return The value of the field {@code factory}
     */
    public org.gstreamer.gst.DeviceProviderFactory factory$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("factory"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.DeviceProviderFactory(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code factory}
     * @param factory The new value of the field {@code factory}
     */
    public void factory$set(org.gstreamer.gst.DeviceProviderFactory factory) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("factory"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), factory.handle());
    }
    
    /**
     * Create a DeviceProviderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DeviceProviderClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Set {@code key} with {@code value} as metadata in {@code klass}.
     * @param key the key to set
     * @param value the value to set
     */
    public void addMetadata(@NotNull java.lang.String key, @NotNull java.lang.String value) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_device_provider_class_add_metadata.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    Interop.allocateNativeString(value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set {@code key} with {@code value} as metadata in {@code klass}.
     * <p>
     * Same as gst_device_provider_class_add_metadata(), but {@code value} must be a static string
     * or an inlined string, as it will not be copied. (GStreamer plugins will
     * be made resident once loaded, so this function can be used even from
     * dynamically loaded plugins.)
     * @param key the key to set
     * @param value the value to set
     */
    public void addStaticMetadata(@NotNull java.lang.String key, @NotNull java.lang.String value) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_device_provider_class_add_static_metadata.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    Interop.allocateNativeString(value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get metadata with {@code key} in {@code klass}.
     * @param key the key to get
     * @return the metadata for {@code key}.
     */
    public @Nullable java.lang.String getMetadata(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_provider_class_get_metadata.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Sets the detailed information for a {@link DeviceProviderClass}.
     * <p>
     * <blockquote>
     *  This function is for use in _class_init functions only.
     * </blockquote>
     * @param longname The long English name of the device provider. E.g. "File Sink"
     * @param classification String describing the type of device provider, as an
     *  unordered list separated with slashes ('/'). See draft-klass.txt of the
     *  design docs
     * for more details and common types. E.g: "Sink/File"
     * @param description Sentence describing the purpose of the device provider.
     * E.g: "Write stream to a file"
     * @param author Name and contact details of the author(s). Use \\n to separate
     * multiple author metadata. E.g: "Joe Bloggs &amp;lt;joe.blogs at foo.com&amp;gt;"
     */
    public void setMetadata(@NotNull java.lang.String longname, @NotNull java.lang.String classification, @NotNull java.lang.String description, @NotNull java.lang.String author) {
        java.util.Objects.requireNonNull(longname, "Parameter 'longname' must not be null");
        java.util.Objects.requireNonNull(classification, "Parameter 'classification' must not be null");
        java.util.Objects.requireNonNull(description, "Parameter 'description' must not be null");
        java.util.Objects.requireNonNull(author, "Parameter 'author' must not be null");
        try {
            DowncallHandles.gst_device_provider_class_set_metadata.invokeExact(
                    handle(),
                    Interop.allocateNativeString(longname),
                    Interop.allocateNativeString(classification),
                    Interop.allocateNativeString(description),
                    Interop.allocateNativeString(author));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the detailed information for a {@link DeviceProviderClass}.
     * <p>
     * <blockquote>
     *  This function is for use in _class_init functions only.
     * </blockquote><p>
     * Same as gst_device_provider_class_set_metadata(), but {@code longname}, {@code classification},
     * {@code description}, and {@code author} must be static strings or inlined strings, as
     * they will not be copied. (GStreamer plugins will be made resident once
     * loaded, so this function can be used even from dynamically loaded plugins.)
     * @param longname The long English name of the element. E.g. "File Sink"
     * @param classification String describing the type of element, as
     * an unordered list separated with slashes ('/'). See draft-klass.txt of the
     * design docs for more details and common types. E.g: "Sink/File"
     * @param description Sentence describing the purpose of the
     * element.  E.g: "Write stream to a file"
     * @param author Name and contact details of the author(s). Use \\n
     * to separate multiple author metadata. E.g: "Joe Bloggs &amp;lt;joe.blogs at
     * foo.com&amp;gt;"
     */
    public void setStaticMetadata(@NotNull java.lang.String longname, @NotNull java.lang.String classification, @NotNull java.lang.String description, @NotNull java.lang.String author) {
        java.util.Objects.requireNonNull(longname, "Parameter 'longname' must not be null");
        java.util.Objects.requireNonNull(classification, "Parameter 'classification' must not be null");
        java.util.Objects.requireNonNull(description, "Parameter 'description' must not be null");
        java.util.Objects.requireNonNull(author, "Parameter 'author' must not be null");
        try {
            DowncallHandles.gst_device_provider_class_set_static_metadata.invokeExact(
                    handle(),
                    Interop.allocateNativeString(longname),
                    Interop.allocateNativeString(classification),
                    Interop.allocateNativeString(description),
                    Interop.allocateNativeString(author));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_device_provider_class_add_metadata = Interop.downcallHandle(
            "gst_device_provider_class_add_metadata",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_class_add_static_metadata = Interop.downcallHandle(
            "gst_device_provider_class_add_static_metadata",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_class_get_metadata = Interop.downcallHandle(
            "gst_device_provider_class_get_metadata",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_class_set_metadata = Interop.downcallHandle(
            "gst_device_provider_class_set_metadata",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_class_set_static_metadata = Interop.downcallHandle(
            "gst_device_provider_class_set_static_metadata",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DeviceProviderClass struct;
        
         /**
         * A {@link DeviceProviderClass.Build} object constructs a {@link DeviceProviderClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DeviceProviderClass.allocate();
        }
        
         /**
         * Finish building the {@link DeviceProviderClass} struct.
         * @return A new instance of {@code DeviceProviderClass} with the fields 
         *         that were set in the Build object.
         */
        public DeviceProviderClass construct() {
            return struct;
        }
        
        /**
         * the parent {@link ObjectClass} structure
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        /**
         * a pointer to the {@link DeviceProviderFactory} that creates this
         *  provider
         * @param factory The value for the {@code factory} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFactory(org.gstreamer.gst.DeviceProviderFactory factory) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("factory"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (factory == null ? MemoryAddress.NULL : factory.handle()));
            return this;
        }
        
        public Build setProbe(java.lang.foreign.MemoryAddress probe) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("probe"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (probe == null ? MemoryAddress.NULL : probe));
            return this;
        }
        
        public Build setStart(java.lang.foreign.MemoryAddress start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start));
            return this;
        }
        
        public Build setStop(java.lang.foreign.MemoryAddress stop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop));
            return this;
        }
        
        public Build setMetadata(java.lang.foreign.MemoryAddress metadata) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("metadata"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (metadata == null ? MemoryAddress.NULL : (Addressable) metadata));
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
