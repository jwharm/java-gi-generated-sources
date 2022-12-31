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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BinClass newInstance = new BinClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ElementClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ElementClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ElementClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface ElementAddedCallback {
        void run(org.gstreamer.gst.Bin bin, org.gstreamer.gst.Element child);

        @ApiStatus.Internal default void upcall(MemoryAddress bin, MemoryAddress child) {
            run((org.gstreamer.gst.Bin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(bin)), org.gstreamer.gst.Bin.fromAddress).marshal(bin, Ownership.NONE), (org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(child)), org.gstreamer.gst.Element.fromAddress).marshal(child, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ElementAddedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code element_added}
     * @param elementAdded The new value of the field {@code element_added}
     */
    public void setElementAdded(ElementAddedCallback elementAdded) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("element_added"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (elementAdded == null ? MemoryAddress.NULL : elementAdded.toCallback()));
    }
    
    @FunctionalInterface
    public interface ElementRemovedCallback {
        void run(org.gstreamer.gst.Bin bin, org.gstreamer.gst.Element child);

        @ApiStatus.Internal default void upcall(MemoryAddress bin, MemoryAddress child) {
            run((org.gstreamer.gst.Bin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(bin)), org.gstreamer.gst.Bin.fromAddress).marshal(bin, Ownership.NONE), (org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(child)), org.gstreamer.gst.Element.fromAddress).marshal(child, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ElementRemovedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code element_removed}
     * @param elementRemoved The new value of the field {@code element_removed}
     */
    public void setElementRemoved(ElementRemovedCallback elementRemoved) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("element_removed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (elementRemoved == null ? MemoryAddress.NULL : elementRemoved.toCallback()));
    }
    
    @FunctionalInterface
    public interface AddElementCallback {
        boolean run(org.gstreamer.gst.Bin bin, org.gstreamer.gst.Element element);

        @ApiStatus.Internal default int upcall(MemoryAddress bin, MemoryAddress element) {
            var RESULT = run((org.gstreamer.gst.Bin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(bin)), org.gstreamer.gst.Bin.fromAddress).marshal(bin, Ownership.NONE), (org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(element)), org.gstreamer.gst.Element.fromAddress).marshal(element, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AddElementCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code add_element}
     * @param addElement The new value of the field {@code add_element}
     */
    public void setAddElement(AddElementCallback addElement) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("add_element"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addElement == null ? MemoryAddress.NULL : addElement.toCallback()));
    }
    
    @FunctionalInterface
    public interface RemoveElementCallback {
        boolean run(org.gstreamer.gst.Bin bin, org.gstreamer.gst.Element element);

        @ApiStatus.Internal default int upcall(MemoryAddress bin, MemoryAddress element) {
            var RESULT = run((org.gstreamer.gst.Bin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(bin)), org.gstreamer.gst.Bin.fromAddress).marshal(bin, Ownership.NONE), (org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(element)), org.gstreamer.gst.Element.fromAddress).marshal(element, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RemoveElementCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code remove_element}
     * @param removeElement The new value of the field {@code remove_element}
     */
    public void setRemoveElement(RemoveElementCallback removeElement) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("remove_element"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (removeElement == null ? MemoryAddress.NULL : removeElement.toCallback()));
    }
    
    @FunctionalInterface
    public interface HandleMessageCallback {
        void run(org.gstreamer.gst.Bin bin, org.gstreamer.gst.Message message);

        @ApiStatus.Internal default void upcall(MemoryAddress bin, MemoryAddress message) {
            run((org.gstreamer.gst.Bin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(bin)), org.gstreamer.gst.Bin.fromAddress).marshal(bin, Ownership.NONE), org.gstreamer.gst.Message.fromAddress.marshal(message, Ownership.FULL));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HandleMessageCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handle_message}
     * @param handleMessage The new value of the field {@code handle_message}
     */
    public void setHandleMessage(HandleMessageCallback handleMessage) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("handle_message"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleMessage == null ? MemoryAddress.NULL : handleMessage.toCallback()));
    }
    
    @FunctionalInterface
    public interface DoLatencyCallback {
        boolean run(org.gstreamer.gst.Bin bin);

        @ApiStatus.Internal default int upcall(MemoryAddress bin) {
            var RESULT = run((org.gstreamer.gst.Bin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(bin)), org.gstreamer.gst.Bin.fromAddress).marshal(bin, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DoLatencyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code do_latency}
     * @param doLatency The new value of the field {@code do_latency}
     */
    public void setDoLatency(DoLatencyCallback doLatency) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("do_latency"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (doLatency == null ? MemoryAddress.NULL : doLatency.toCallback()));
    }
    
    @FunctionalInterface
    public interface DeepElementAddedCallback {
        void run(org.gstreamer.gst.Bin bin, org.gstreamer.gst.Bin subBin, org.gstreamer.gst.Element child);

        @ApiStatus.Internal default void upcall(MemoryAddress bin, MemoryAddress subBin, MemoryAddress child) {
            run((org.gstreamer.gst.Bin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(bin)), org.gstreamer.gst.Bin.fromAddress).marshal(bin, Ownership.NONE), (org.gstreamer.gst.Bin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(subBin)), org.gstreamer.gst.Bin.fromAddress).marshal(subBin, Ownership.NONE), (org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(child)), org.gstreamer.gst.Element.fromAddress).marshal(child, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DeepElementAddedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code deep_element_added}
     * @param deepElementAdded The new value of the field {@code deep_element_added}
     */
    public void setDeepElementAdded(DeepElementAddedCallback deepElementAdded) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("deep_element_added"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deepElementAdded == null ? MemoryAddress.NULL : deepElementAdded.toCallback()));
    }
    
    @FunctionalInterface
    public interface DeepElementRemovedCallback {
        void run(org.gstreamer.gst.Bin bin, org.gstreamer.gst.Bin subBin, org.gstreamer.gst.Element child);

        @ApiStatus.Internal default void upcall(MemoryAddress bin, MemoryAddress subBin, MemoryAddress child) {
            run((org.gstreamer.gst.Bin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(bin)), org.gstreamer.gst.Bin.fromAddress).marshal(bin, Ownership.NONE), (org.gstreamer.gst.Bin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(subBin)), org.gstreamer.gst.Bin.fromAddress).marshal(subBin, Ownership.NONE), (org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(child)), org.gstreamer.gst.Element.fromAddress).marshal(child, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DeepElementRemovedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code deep_element_removed}
     * @param deepElementRemoved The new value of the field {@code deep_element_removed}
     */
    public void setDeepElementRemoved(DeepElementRemovedCallback deepElementRemoved) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("deep_element_removed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deepElementRemoved == null ? MemoryAddress.NULL : deepElementRemoved.toCallback()));
    }
    
    /**
     * Create a BinClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BinClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BinClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BinClass(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setPool(org.gtk.glib.ThreadPool pool) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pool"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pool == null ? MemoryAddress.NULL : pool.handle()));
            return this;
        }
        
        public Builder setElementAdded(ElementAddedCallback elementAdded) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("element_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (elementAdded == null ? MemoryAddress.NULL : elementAdded.toCallback()));
            return this;
        }
        
        public Builder setElementRemoved(ElementRemovedCallback elementRemoved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("element_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (elementRemoved == null ? MemoryAddress.NULL : elementRemoved.toCallback()));
            return this;
        }
        
        public Builder setAddElement(AddElementCallback addElement) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_element"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addElement == null ? MemoryAddress.NULL : addElement.toCallback()));
            return this;
        }
        
        public Builder setRemoveElement(RemoveElementCallback removeElement) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove_element"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (removeElement == null ? MemoryAddress.NULL : removeElement.toCallback()));
            return this;
        }
        
        public Builder setHandleMessage(HandleMessageCallback handleMessage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_message"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleMessage == null ? MemoryAddress.NULL : handleMessage.toCallback()));
            return this;
        }
        
        public Builder setDoLatency(DoLatencyCallback doLatency) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("do_latency"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (doLatency == null ? MemoryAddress.NULL : doLatency.toCallback()));
            return this;
        }
        
        public Builder setDeepElementAdded(DeepElementAddedCallback deepElementAdded) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deep_element_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deepElementAdded == null ? MemoryAddress.NULL : deepElementAdded.toCallback()));
            return this;
        }
        
        public Builder setDeepElementRemoved(DeepElementRemovedCallback deepElementRemoved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deep_element_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deepElementRemoved == null ? MemoryAddress.NULL : deepElementRemoved.toCallback()));
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
