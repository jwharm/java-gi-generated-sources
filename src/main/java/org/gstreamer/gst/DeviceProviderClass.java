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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("factory"),
            Interop.valueLayout.ADDRESS.withName("probe"),
            Interop.valueLayout.ADDRESS.withName("start"),
            Interop.valueLayout.ADDRESS.withName("stop"),
            Interop.valueLayout.ADDRESS.withName("metadata"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DeviceProviderClass}
     * @return A new, uninitialized @{link DeviceProviderClass}
     */
    public static DeviceProviderClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DeviceProviderClass newInstance = new DeviceProviderClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code factory}
     * @return The value of the field {@code factory}
     */
    public org.gstreamer.gst.DeviceProviderFactory getFactory() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("factory"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return (org.gstreamer.gst.DeviceProviderFactory) Interop.register(RESULT, org.gstreamer.gst.DeviceProviderFactory.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code factory}
     * @param factory The new value of the field {@code factory}
     */
    public void setFactory(org.gstreamer.gst.DeviceProviderFactory factory) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("factory"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (factory == null ? MemoryAddress.NULL : factory.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ProbeCallback} callback.
     */
    @FunctionalInterface
    public interface ProbeCallback {
    
        org.gtk.glib.List run(org.gstreamer.gst.DeviceProvider provider);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress provider) {
            var RESULT = run((org.gstreamer.gst.DeviceProvider) Interop.register(provider, org.gstreamer.gst.DeviceProvider.fromAddress).marshal(provider, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ProbeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code probe}
     * @param probe The new value of the field {@code probe}
     */
    public void setProbe(ProbeCallback probe) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("probe"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (probe == null ? MemoryAddress.NULL : probe.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StartCallback} callback.
     */
    @FunctionalInterface
    public interface StartCallback {
    
        boolean run(org.gstreamer.gst.DeviceProvider provider);
        
        @ApiStatus.Internal default int upcall(MemoryAddress provider) {
            var RESULT = run((org.gstreamer.gst.DeviceProvider) Interop.register(provider, org.gstreamer.gst.DeviceProvider.fromAddress).marshal(provider, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StartCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start}
     * @param start The new value of the field {@code start}
     */
    public void setStart(StartCallback start) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StopCallback} callback.
     */
    @FunctionalInterface
    public interface StopCallback {
    
        void run(org.gstreamer.gst.DeviceProvider provider);
        
        @ApiStatus.Internal default void upcall(MemoryAddress provider) {
            run((org.gstreamer.gst.DeviceProvider) Interop.register(provider, org.gstreamer.gst.DeviceProvider.fromAddress).marshal(provider, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StopCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stop}
     * @param stop The new value of the field {@code stop}
     */
    public void setStop(StopCallback stop) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
        }
    }
    
    /**
     * Create a DeviceProviderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DeviceProviderClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DeviceProviderClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DeviceProviderClass(input);
    
    /**
     * Set {@code key} with {@code value} as metadata in {@code klass}.
     * @param key the key to set
     * @param value the value to set
     */
    public void addMetadata(java.lang.String key, java.lang.String value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_device_provider_class_add_metadata.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        Marshal.stringToAddress.marshal(value, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public void addStaticMetadata(java.lang.String key, java.lang.String value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_device_provider_class_add_static_metadata.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        Marshal.stringToAddress.marshal(value, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Get metadata with {@code key} in {@code klass}.
     * @param key the key to get
     * @return the metadata for {@code key}.
     */
    public @Nullable java.lang.String getMetadata(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_device_provider_class_get_metadata.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
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
    public void setMetadata(java.lang.String longname, java.lang.String classification, java.lang.String description, java.lang.String author) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_device_provider_class_set_metadata.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(longname, SCOPE),
                        Marshal.stringToAddress.marshal(classification, SCOPE),
                        Marshal.stringToAddress.marshal(description, SCOPE),
                        Marshal.stringToAddress.marshal(author, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public void setStaticMetadata(java.lang.String longname, java.lang.String classification, java.lang.String description, java.lang.String author) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_device_provider_class_set_static_metadata.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(longname, SCOPE),
                        Marshal.stringToAddress.marshal(classification, SCOPE),
                        Marshal.stringToAddress.marshal(description, SCOPE),
                        Marshal.stringToAddress.marshal(author, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     * A {@link DeviceProviderClass.Builder} object constructs a {@link DeviceProviderClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DeviceProviderClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DeviceProviderClass struct;
        
        private Builder() {
            struct = DeviceProviderClass.allocate();
        }
        
        /**
         * Finish building the {@link DeviceProviderClass} struct.
         * @return A new instance of {@code DeviceProviderClass} with the fields 
         *         that were set in the Builder object.
         */
        public DeviceProviderClass build() {
            return struct;
        }
        
        /**
         * the parent {@link ObjectClass} structure
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        /**
         * a pointer to the {@link DeviceProviderFactory} that creates this
         *  provider
         * @param factory The value for the {@code factory} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFactory(org.gstreamer.gst.DeviceProviderFactory factory) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("factory"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (factory == null ? MemoryAddress.NULL : factory.handle()));
                return this;
            }
        }
        
        public Builder setProbe(ProbeCallback probe) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("probe"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (probe == null ? MemoryAddress.NULL : probe.toCallback()));
                return this;
            }
        }
        
        public Builder setStart(StartCallback start) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
                return this;
            }
        }
        
        public Builder setStop(StopCallback stop) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
                return this;
            }
        }
        
        public Builder setMetadata(java.lang.foreign.MemoryAddress metadata) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("metadata"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (metadata == null ? MemoryAddress.NULL : (Addressable) metadata));
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
