package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GStreamer base object class.
 */
public class ObjectClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstObjectClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.InitiallyUnownedClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("path_string_separator"),
            Interop.valueLayout.ADDRESS.withName("deep_notify"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ObjectClass}
     * @return A new, uninitialized @{link ObjectClass}
     */
    public static ObjectClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ObjectClass newInstance = new ObjectClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.InitiallyUnownedClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.InitiallyUnownedClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.InitiallyUnownedClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code path_string_separator}
     * @return The value of the field {@code path_string_separator}
     */
    public java.lang.String getPathStringSeparator() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path_string_separator"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code path_string_separator}
     * @param pathStringSeparator The new value of the field {@code path_string_separator}
     */
    public void setPathStringSeparator(java.lang.String pathStringSeparator) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path_string_separator"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pathStringSeparator == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(pathStringSeparator, SCOPE)));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DeepNotifyCallback} callback.
     */
    @FunctionalInterface
    public interface DeepNotifyCallback {
    
        void run(org.gstreamer.gst.GstObject object, org.gstreamer.gst.GstObject orig, org.gtk.gobject.ParamSpec pspec);
        
        @ApiStatus.Internal default void upcall(MemoryAddress object, MemoryAddress orig, MemoryAddress pspec) {
            run((org.gstreamer.gst.GstObject) Interop.register(object, org.gstreamer.gst.GstObject.fromAddress).marshal(object, null), (org.gstreamer.gst.GstObject) Interop.register(orig, org.gstreamer.gst.GstObject.fromAddress).marshal(orig, null), (org.gtk.gobject.ParamSpec) Interop.register(pspec, org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeepNotifyCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code deep_notify}
     * @param deepNotify The new value of the field {@code deep_notify}
     */
    public void setDeepNotify(DeepNotifyCallback deepNotify) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deep_notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deepNotify == null ? MemoryAddress.NULL : deepNotify.toCallback()));
        }
    }
    
    /**
     * Create a ObjectClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ObjectClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ObjectClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ObjectClass(input);
    
    /**
     * A {@link ObjectClass.Builder} object constructs a {@link ObjectClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ObjectClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ObjectClass struct;
        
        private Builder() {
            struct = ObjectClass.allocate();
        }
        
        /**
         * Finish building the {@link ObjectClass} struct.
         * @return A new instance of {@code ObjectClass} with the fields 
         *         that were set in the Builder object.
         */
        public ObjectClass build() {
            return struct;
        }
        
        /**
         * parent
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gtk.gobject.InitiallyUnownedClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        /**
         * separator used by gst_object_get_path_string()
         * @param pathStringSeparator The value for the {@code pathStringSeparator} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPathStringSeparator(java.lang.String pathStringSeparator) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("path_string_separator"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pathStringSeparator == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(pathStringSeparator, SCOPE)));
                return this;
            }
        }
        
        public Builder setDeepNotify(DeepNotifyCallback deepNotify) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("deep_notify"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deepNotify == null ? MemoryAddress.NULL : deepNotify.toCallback()));
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
