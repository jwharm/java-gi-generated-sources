package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ChildProxy} interface.
 */
public class ChildProxyInterface extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstChildProxyInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("get_child_by_name"),
            Interop.valueLayout.ADDRESS.withName("get_child_by_index"),
            Interop.valueLayout.ADDRESS.withName("get_children_count"),
            Interop.valueLayout.ADDRESS.withName("child_added"),
            Interop.valueLayout.ADDRESS.withName("child_removed"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ChildProxyInterface}
     * @return A new, uninitialized @{link ChildProxyInterface}
     */
    public static ChildProxyInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ChildProxyInterface newInstance = new ChildProxyInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gtk.gobject.TypeInterface getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gtk.gobject.TypeInterface parent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
    }
    
    @FunctionalInterface
    public interface GetChildByNameCallback {
        @Nullable org.gtk.gobject.GObject run(org.gstreamer.gst.ChildProxy parent, java.lang.String name);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress parent, MemoryAddress name) {
            var RESULT = run((org.gstreamer.gst.ChildProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parent)), org.gstreamer.gst.ChildProxy.fromAddress).marshal(parent, Ownership.NONE), Marshal.addressToString.marshal(name, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetChildByNameCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_child_by_name}
     * @param getChildByName The new value of the field {@code get_child_by_name}
     */
    public void setGetChildByName(GetChildByNameCallback getChildByName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_child_by_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getChildByName == null ? MemoryAddress.NULL : getChildByName.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetChildByIndexCallback {
        @Nullable org.gtk.gobject.GObject run(org.gstreamer.gst.ChildProxy parent, int index);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress parent, int index) {
            var RESULT = run((org.gstreamer.gst.ChildProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parent)), org.gstreamer.gst.ChildProxy.fromAddress).marshal(parent, Ownership.NONE), index);
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetChildByIndexCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_child_by_index}
     * @param getChildByIndex The new value of the field {@code get_child_by_index}
     */
    public void setGetChildByIndex(GetChildByIndexCallback getChildByIndex) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_child_by_index"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getChildByIndex == null ? MemoryAddress.NULL : getChildByIndex.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetChildrenCountCallback {
        int run(org.gstreamer.gst.ChildProxy parent);

        @ApiStatus.Internal default int upcall(MemoryAddress parent) {
            var RESULT = run((org.gstreamer.gst.ChildProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parent)), org.gstreamer.gst.ChildProxy.fromAddress).marshal(parent, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetChildrenCountCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_children_count}
     * @param getChildrenCount The new value of the field {@code get_children_count}
     */
    public void setGetChildrenCount(GetChildrenCountCallback getChildrenCount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_children_count"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getChildrenCount == null ? MemoryAddress.NULL : getChildrenCount.toCallback()));
    }
    
    @FunctionalInterface
    public interface ChildAddedCallback {
        void run(org.gstreamer.gst.ChildProxy parent, org.gtk.gobject.GObject child, java.lang.String name);

        @ApiStatus.Internal default void upcall(MemoryAddress parent, MemoryAddress child, MemoryAddress name) {
            run((org.gstreamer.gst.ChildProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parent)), org.gstreamer.gst.ChildProxy.fromAddress).marshal(parent, Ownership.NONE), (org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(child)), org.gtk.gobject.GObject.fromAddress).marshal(child, Ownership.NONE), Marshal.addressToString.marshal(name, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ChildAddedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code child_added}
     * @param childAdded The new value of the field {@code child_added}
     */
    public void setChildAdded(ChildAddedCallback childAdded) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("child_added"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (childAdded == null ? MemoryAddress.NULL : childAdded.toCallback()));
    }
    
    @FunctionalInterface
    public interface ChildRemovedCallback {
        void run(org.gstreamer.gst.ChildProxy parent, org.gtk.gobject.GObject child, java.lang.String name);

        @ApiStatus.Internal default void upcall(MemoryAddress parent, MemoryAddress child, MemoryAddress name) {
            run((org.gstreamer.gst.ChildProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parent)), org.gstreamer.gst.ChildProxy.fromAddress).marshal(parent, Ownership.NONE), (org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(child)), org.gtk.gobject.GObject.fromAddress).marshal(child, Ownership.NONE), Marshal.addressToString.marshal(name, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ChildRemovedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code child_removed}
     * @param childRemoved The new value of the field {@code child_removed}
     */
    public void setChildRemoved(ChildRemovedCallback childRemoved) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("child_removed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (childRemoved == null ? MemoryAddress.NULL : childRemoved.toCallback()));
    }
    
    /**
     * Create a ChildProxyInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ChildProxyInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ChildProxyInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ChildProxyInterface(input, ownership);
    
    /**
     * A {@link ChildProxyInterface.Builder} object constructs a {@link ChildProxyInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ChildProxyInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ChildProxyInterface struct;
        
        private Builder() {
            struct = ChildProxyInterface.allocate();
        }
        
         /**
         * Finish building the {@link ChildProxyInterface} struct.
         * @return A new instance of {@code ChildProxyInterface} with the fields 
         *         that were set in the Builder object.
         */
        public ChildProxyInterface build() {
            return struct;
        }
        
        /**
         * parent interface type.
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gtk.gobject.TypeInterface parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        public Builder setGetChildByName(GetChildByNameCallback getChildByName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_child_by_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getChildByName == null ? MemoryAddress.NULL : getChildByName.toCallback()));
            return this;
        }
        
        public Builder setGetChildByIndex(GetChildByIndexCallback getChildByIndex) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_child_by_index"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getChildByIndex == null ? MemoryAddress.NULL : getChildByIndex.toCallback()));
            return this;
        }
        
        public Builder setGetChildrenCount(GetChildrenCountCallback getChildrenCount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_children_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getChildrenCount == null ? MemoryAddress.NULL : getChildrenCount.toCallback()));
            return this;
        }
        
        public Builder setChildAdded(ChildAddedCallback childAdded) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("child_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (childAdded == null ? MemoryAddress.NULL : childAdded.toCallback()));
            return this;
        }
        
        public Builder setChildRemoved(ChildRemovedCallback childRemoved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("child_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (childRemoved == null ? MemoryAddress.NULL : childRemoved.toCallback()));
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
