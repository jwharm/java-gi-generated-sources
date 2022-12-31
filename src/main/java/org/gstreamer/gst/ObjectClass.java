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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ObjectClass newInstance = new ObjectClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.InitiallyUnownedClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.InitiallyUnownedClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.InitiallyUnownedClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    /**
     * Get the value of the field {@code path_string_separator}
     * @return The value of the field {@code path_string_separator}
     */
    public java.lang.String getPathStringSeparator() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path_string_separator"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code path_string_separator}
     * @param pathStringSeparator The new value of the field {@code path_string_separator}
     */
    public void setPathStringSeparator(java.lang.String pathStringSeparator) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path_string_separator"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pathStringSeparator == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(pathStringSeparator, null)));
    }
    
    @FunctionalInterface
    public interface DeepNotifyCallback {
        void run(org.gstreamer.gst.GstObject object, org.gstreamer.gst.GstObject orig, org.gtk.gobject.ParamSpec pspec);

        @ApiStatus.Internal default void upcall(MemoryAddress object, MemoryAddress orig, MemoryAddress pspec) {
            run((org.gstreamer.gst.GstObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gstreamer.gst.GstObject.fromAddress).marshal(object, Ownership.NONE), (org.gstreamer.gst.GstObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(orig)), org.gstreamer.gst.GstObject.fromAddress).marshal(orig, Ownership.NONE), (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pspec)), org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DeepNotifyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code deep_notify}
     * @param deepNotify The new value of the field {@code deep_notify}
     */
    public void setDeepNotify(DeepNotifyCallback deepNotify) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("deep_notify"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deepNotify == null ? MemoryAddress.NULL : deepNotify.toCallback()));
    }
    
    /**
     * Create a ObjectClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ObjectClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ObjectClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ObjectClass(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        /**
         * separator used by gst_object_get_path_string()
         * @param pathStringSeparator The value for the {@code pathStringSeparator} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPathStringSeparator(java.lang.String pathStringSeparator) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path_string_separator"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pathStringSeparator == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(pathStringSeparator, null)));
            return this;
        }
        
        public Builder setDeepNotify(DeepNotifyCallback deepNotify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deep_notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deepNotify == null ? MemoryAddress.NULL : deepNotify.toCallback()));
            return this;
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
