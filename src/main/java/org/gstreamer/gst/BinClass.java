package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Subclasses can override {@link BinClass}::add_element and {@link BinClass}::remove_element
 * to update the list of children in the bin.
 * <p>
 * The {@link BinClass}::handle_message method can be overridden to implement custom
 * message handling.
 * <p>
 * {@link BinClass}::deep_element_added will be called when a new element has been
 * added to any bin inside this bin, so it will also be called if a new child
 * was added to a sub-bin of this bin. {@link Bin} implementations that override
 * this message should chain up to the parent class implementation so the
 * {@link Bin}::deep-element-added signal is emitted on all parents.
 */
public class BinClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBinClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("pool"),
            Interop.valueLayout.ADDRESS.withName("element_added"),
            Interop.valueLayout.ADDRESS.withName("element_removed"),
            Interop.valueLayout.ADDRESS.withName("add_element"),
            Interop.valueLayout.ADDRESS.withName("remove_element"),
            Interop.valueLayout.ADDRESS.withName("handle_message"),
            Interop.valueLayout.ADDRESS.withName("do_latency"),
            Interop.valueLayout.ADDRESS.withName("deep_element_added"),
            Interop.valueLayout.ADDRESS.withName("deep_element_removed"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link BinClass}
     * @return A new, uninitialized @{link BinClass}
     */
    public static BinClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        BinClass newInstance = new BinClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ElementClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ElementClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ElementClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ElementAddedCallback} callback.
     */
    @FunctionalInterface
    public interface ElementAddedCallback {
    
        void run(org.gstreamer.gst.Bin bin, org.gstreamer.gst.Element child);
        
        @ApiStatus.Internal default void upcall(MemoryAddress bin, MemoryAddress child) {
            run((org.gstreamer.gst.Bin) Interop.register(bin, org.gstreamer.gst.Bin.fromAddress).marshal(bin, null), (org.gstreamer.gst.Element) Interop.register(child, org.gstreamer.gst.Element.fromAddress).marshal(child, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ElementAddedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code element_added}
     * @param elementAdded The new value of the field {@code element_added}
     */
    public void setElementAdded(ElementAddedCallback elementAdded) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("element_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (elementAdded == null ? MemoryAddress.NULL : elementAdded.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ElementRemovedCallback} callback.
     */
    @FunctionalInterface
    public interface ElementRemovedCallback {
    
        void run(org.gstreamer.gst.Bin bin, org.gstreamer.gst.Element child);
        
        @ApiStatus.Internal default void upcall(MemoryAddress bin, MemoryAddress child) {
            run((org.gstreamer.gst.Bin) Interop.register(bin, org.gstreamer.gst.Bin.fromAddress).marshal(bin, null), (org.gstreamer.gst.Element) Interop.register(child, org.gstreamer.gst.Element.fromAddress).marshal(child, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ElementRemovedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code element_removed}
     * @param elementRemoved The new value of the field {@code element_removed}
     */
    public void setElementRemoved(ElementRemovedCallback elementRemoved) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("element_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (elementRemoved == null ? MemoryAddress.NULL : elementRemoved.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AddElementCallback} callback.
     */
    @FunctionalInterface
    public interface AddElementCallback {
    
        boolean run(org.gstreamer.gst.Bin bin, org.gstreamer.gst.Element element);
        
        @ApiStatus.Internal default int upcall(MemoryAddress bin, MemoryAddress element) {
            var RESULT = run((org.gstreamer.gst.Bin) Interop.register(bin, org.gstreamer.gst.Bin.fromAddress).marshal(bin, null), (org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AddElementCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code add_element}
     * @param addElement The new value of the field {@code add_element}
     */
    public void setAddElement(AddElementCallback addElement) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_element"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addElement == null ? MemoryAddress.NULL : addElement.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RemoveElementCallback} callback.
     */
    @FunctionalInterface
    public interface RemoveElementCallback {
    
        boolean run(org.gstreamer.gst.Bin bin, org.gstreamer.gst.Element element);
        
        @ApiStatus.Internal default int upcall(MemoryAddress bin, MemoryAddress element) {
            var RESULT = run((org.gstreamer.gst.Bin) Interop.register(bin, org.gstreamer.gst.Bin.fromAddress).marshal(bin, null), (org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RemoveElementCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code remove_element}
     * @param removeElement The new value of the field {@code remove_element}
     */
    public void setRemoveElement(RemoveElementCallback removeElement) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove_element"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (removeElement == null ? MemoryAddress.NULL : removeElement.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code HandleMessageCallback} callback.
     */
    @FunctionalInterface
    public interface HandleMessageCallback {
    
        void run(org.gstreamer.gst.Bin bin, org.gstreamer.gst.Message message);
        
        @ApiStatus.Internal default void upcall(MemoryAddress bin, MemoryAddress message) {
            run((org.gstreamer.gst.Bin) Interop.register(bin, org.gstreamer.gst.Bin.fromAddress).marshal(bin, null), org.gstreamer.gst.Message.fromAddress.marshal(message, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HandleMessageCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handle_message}
     * @param handleMessage The new value of the field {@code handle_message}
     */
    public void setHandleMessage(HandleMessageCallback handleMessage) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_message"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handleMessage == null ? MemoryAddress.NULL : handleMessage.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DoLatencyCallback} callback.
     */
    @FunctionalInterface
    public interface DoLatencyCallback {
    
        boolean run(org.gstreamer.gst.Bin bin);
        
        @ApiStatus.Internal default int upcall(MemoryAddress bin) {
            var RESULT = run((org.gstreamer.gst.Bin) Interop.register(bin, org.gstreamer.gst.Bin.fromAddress).marshal(bin, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DoLatencyCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code do_latency}
     * @param doLatency The new value of the field {@code do_latency}
     */
    public void setDoLatency(DoLatencyCallback doLatency) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("do_latency"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (doLatency == null ? MemoryAddress.NULL : doLatency.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DeepElementAddedCallback} callback.
     */
    @FunctionalInterface
    public interface DeepElementAddedCallback {
    
        void run(org.gstreamer.gst.Bin bin, org.gstreamer.gst.Bin subBin, org.gstreamer.gst.Element child);
        
        @ApiStatus.Internal default void upcall(MemoryAddress bin, MemoryAddress subBin, MemoryAddress child) {
            run((org.gstreamer.gst.Bin) Interop.register(bin, org.gstreamer.gst.Bin.fromAddress).marshal(bin, null), (org.gstreamer.gst.Bin) Interop.register(subBin, org.gstreamer.gst.Bin.fromAddress).marshal(subBin, null), (org.gstreamer.gst.Element) Interop.register(child, org.gstreamer.gst.Element.fromAddress).marshal(child, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeepElementAddedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code deep_element_added}
     * @param deepElementAdded The new value of the field {@code deep_element_added}
     */
    public void setDeepElementAdded(DeepElementAddedCallback deepElementAdded) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deep_element_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deepElementAdded == null ? MemoryAddress.NULL : deepElementAdded.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DeepElementRemovedCallback} callback.
     */
    @FunctionalInterface
    public interface DeepElementRemovedCallback {
    
        void run(org.gstreamer.gst.Bin bin, org.gstreamer.gst.Bin subBin, org.gstreamer.gst.Element child);
        
        @ApiStatus.Internal default void upcall(MemoryAddress bin, MemoryAddress subBin, MemoryAddress child) {
            run((org.gstreamer.gst.Bin) Interop.register(bin, org.gstreamer.gst.Bin.fromAddress).marshal(bin, null), (org.gstreamer.gst.Bin) Interop.register(subBin, org.gstreamer.gst.Bin.fromAddress).marshal(subBin, null), (org.gstreamer.gst.Element) Interop.register(child, org.gstreamer.gst.Element.fromAddress).marshal(child, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeepElementRemovedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code deep_element_removed}
     * @param deepElementRemoved The new value of the field {@code deep_element_removed}
     */
    public void setDeepElementRemoved(DeepElementRemovedCallback deepElementRemoved) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deep_element_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deepElementRemoved == null ? MemoryAddress.NULL : deepElementRemoved.toCallback()));
        }
    }
    
    /**
     * Create a BinClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BinClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BinClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BinClass(input);
    
    /**
     * A {@link BinClass.Builder} object constructs a {@link BinClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link BinClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final BinClass struct;
        
        private Builder() {
            struct = BinClass.allocate();
        }
        
        /**
         * Finish building the {@link BinClass} struct.
         * @return A new instance of {@code BinClass} with the fields 
         *         that were set in the Builder object.
         */
        public BinClass build() {
            return struct;
        }
        
        /**
         * bin parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.gst.ElementClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setPool(org.gtk.glib.ThreadPool pool) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pool"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pool == null ? MemoryAddress.NULL : pool.handle()));
                return this;
            }
        }
        
        public Builder setElementAdded(ElementAddedCallback elementAdded) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("element_added"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (elementAdded == null ? MemoryAddress.NULL : elementAdded.toCallback()));
                return this;
            }
        }
        
        public Builder setElementRemoved(ElementRemovedCallback elementRemoved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("element_removed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (elementRemoved == null ? MemoryAddress.NULL : elementRemoved.toCallback()));
                return this;
            }
        }
        
        public Builder setAddElement(AddElementCallback addElement) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("add_element"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addElement == null ? MemoryAddress.NULL : addElement.toCallback()));
                return this;
            }
        }
        
        public Builder setRemoveElement(RemoveElementCallback removeElement) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("remove_element"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (removeElement == null ? MemoryAddress.NULL : removeElement.toCallback()));
                return this;
            }
        }
        
        public Builder setHandleMessage(HandleMessageCallback handleMessage) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("handle_message"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handleMessage == null ? MemoryAddress.NULL : handleMessage.toCallback()));
                return this;
            }
        }
        
        public Builder setDoLatency(DoLatencyCallback doLatency) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("do_latency"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (doLatency == null ? MemoryAddress.NULL : doLatency.toCallback()));
                return this;
            }
        }
        
        public Builder setDeepElementAdded(DeepElementAddedCallback deepElementAdded) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("deep_element_added"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deepElementAdded == null ? MemoryAddress.NULL : deepElementAdded.toCallback()));
                return this;
            }
        }
        
        public Builder setDeepElementRemoved(DeepElementRemovedCallback deepElementRemoved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("deep_element_removed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deepElementRemoved == null ? MemoryAddress.NULL : deepElementRemoved.toCallback()));
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
