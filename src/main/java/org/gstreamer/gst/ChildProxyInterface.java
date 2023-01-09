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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ChildProxyInterface newInstance = new ChildProxyInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gtk.gobject.TypeInterface getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gtk.gobject.TypeInterface parent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetChildByNameCallback} callback.
     */
    @FunctionalInterface
    public interface GetChildByNameCallback {
    
        @Nullable org.gtk.gobject.GObject run(org.gstreamer.gst.ChildProxy parent, java.lang.String name);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress parent, MemoryAddress name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gstreamer.gst.ChildProxy) Interop.register(parent, org.gstreamer.gst.ChildProxy.fromAddress).marshal(parent, null), Marshal.addressToString.marshal(name, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetChildByNameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_child_by_name}
     * @param getChildByName The new value of the field {@code get_child_by_name}
     */
    public void setGetChildByName(GetChildByNameCallback getChildByName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_child_by_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getChildByName == null ? MemoryAddress.NULL : getChildByName.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetChildByIndexCallback} callback.
     */
    @FunctionalInterface
    public interface GetChildByIndexCallback {
    
        @Nullable org.gtk.gobject.GObject run(org.gstreamer.gst.ChildProxy parent, int index);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress parent, int index) {
            var RESULT = run((org.gstreamer.gst.ChildProxy) Interop.register(parent, org.gstreamer.gst.ChildProxy.fromAddress).marshal(parent, null), index);
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetChildByIndexCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_child_by_index}
     * @param getChildByIndex The new value of the field {@code get_child_by_index}
     */
    public void setGetChildByIndex(GetChildByIndexCallback getChildByIndex) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_child_by_index"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getChildByIndex == null ? MemoryAddress.NULL : getChildByIndex.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetChildrenCountCallback} callback.
     */
    @FunctionalInterface
    public interface GetChildrenCountCallback {
    
        int run(org.gstreamer.gst.ChildProxy parent);
        
        @ApiStatus.Internal default int upcall(MemoryAddress parent) {
            var RESULT = run((org.gstreamer.gst.ChildProxy) Interop.register(parent, org.gstreamer.gst.ChildProxy.fromAddress).marshal(parent, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetChildrenCountCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_children_count}
     * @param getChildrenCount The new value of the field {@code get_children_count}
     */
    public void setGetChildrenCount(GetChildrenCountCallback getChildrenCount) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_children_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getChildrenCount == null ? MemoryAddress.NULL : getChildrenCount.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ChildAddedCallback} callback.
     */
    @FunctionalInterface
    public interface ChildAddedCallback {
    
        void run(org.gstreamer.gst.ChildProxy parent, org.gtk.gobject.GObject child, java.lang.String name);
        
        @ApiStatus.Internal default void upcall(MemoryAddress parent, MemoryAddress child, MemoryAddress name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gstreamer.gst.ChildProxy) Interop.register(parent, org.gstreamer.gst.ChildProxy.fromAddress).marshal(parent, null), (org.gtk.gobject.GObject) Interop.register(child, org.gtk.gobject.GObject.fromAddress).marshal(child, null), Marshal.addressToString.marshal(name, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChildAddedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code child_added}
     * @param childAdded The new value of the field {@code child_added}
     */
    public void setChildAdded(ChildAddedCallback childAdded) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("child_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (childAdded == null ? MemoryAddress.NULL : childAdded.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ChildRemovedCallback} callback.
     */
    @FunctionalInterface
    public interface ChildRemovedCallback {
    
        void run(org.gstreamer.gst.ChildProxy parent, org.gtk.gobject.GObject child, java.lang.String name);
        
        @ApiStatus.Internal default void upcall(MemoryAddress parent, MemoryAddress child, MemoryAddress name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gstreamer.gst.ChildProxy) Interop.register(parent, org.gstreamer.gst.ChildProxy.fromAddress).marshal(parent, null), (org.gtk.gobject.GObject) Interop.register(child, org.gtk.gobject.GObject.fromAddress).marshal(child, null), Marshal.addressToString.marshal(name, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChildRemovedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code child_removed}
     * @param childRemoved The new value of the field {@code child_removed}
     */
    public void setChildRemoved(ChildRemovedCallback childRemoved) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("child_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (childRemoved == null ? MemoryAddress.NULL : childRemoved.toCallback()));
        }
    }
    
    /**
     * Create a ChildProxyInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ChildProxyInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ChildProxyInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ChildProxyInterface(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
                return this;
            }
        }
        
        public Builder setGetChildByName(GetChildByNameCallback getChildByName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_child_by_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getChildByName == null ? MemoryAddress.NULL : getChildByName.toCallback()));
                return this;
            }
        }
        
        public Builder setGetChildByIndex(GetChildByIndexCallback getChildByIndex) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_child_by_index"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getChildByIndex == null ? MemoryAddress.NULL : getChildByIndex.toCallback()));
                return this;
            }
        }
        
        public Builder setGetChildrenCount(GetChildrenCountCallback getChildrenCount) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_children_count"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getChildrenCount == null ? MemoryAddress.NULL : getChildrenCount.toCallback()));
                return this;
            }
        }
        
        public Builder setChildAdded(ChildAddedCallback childAdded) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("child_added"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (childAdded == null ? MemoryAddress.NULL : childAdded.toCallback()));
                return this;
            }
        }
        
        public Builder setChildRemoved(ChildRemovedCallback childRemoved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("child_removed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (childRemoved == null ? MemoryAddress.NULL : childRemoved.toCallback()));
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
