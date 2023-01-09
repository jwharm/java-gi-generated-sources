package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Subclasses can override any of the available virtual methods or not, as
 * needed. At minimum either {@code transform} or {@code transform_ip} need to be overridden.
 * If the element can overwrite the input data with the results (data is of the
 * same type and quantity) it should provide {@code transform_ip}.
 */
public class BaseTransformClass extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBaseTransformClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.C_INT.withName("passthrough_on_same_caps"),
            Interop.valueLayout.C_INT.withName("transform_ip_on_passthrough"),
            Interop.valueLayout.ADDRESS.withName("transform_caps"),
            Interop.valueLayout.ADDRESS.withName("fixate_caps"),
            Interop.valueLayout.ADDRESS.withName("accept_caps"),
            Interop.valueLayout.ADDRESS.withName("set_caps"),
            Interop.valueLayout.ADDRESS.withName("query"),
            Interop.valueLayout.ADDRESS.withName("decide_allocation"),
            Interop.valueLayout.ADDRESS.withName("filter_meta"),
            Interop.valueLayout.ADDRESS.withName("propose_allocation"),
            Interop.valueLayout.ADDRESS.withName("transform_size"),
            Interop.valueLayout.ADDRESS.withName("get_unit_size"),
            Interop.valueLayout.ADDRESS.withName("start"),
            Interop.valueLayout.ADDRESS.withName("stop"),
            Interop.valueLayout.ADDRESS.withName("sink_event"),
            Interop.valueLayout.ADDRESS.withName("src_event"),
            Interop.valueLayout.ADDRESS.withName("prepare_output_buffer"),
            Interop.valueLayout.ADDRESS.withName("copy_metadata"),
            Interop.valueLayout.ADDRESS.withName("transform_meta"),
            Interop.valueLayout.ADDRESS.withName("before_transform"),
            Interop.valueLayout.ADDRESS.withName("transform"),
            Interop.valueLayout.ADDRESS.withName("transform_ip"),
            Interop.valueLayout.ADDRESS.withName("submit_input_buffer"),
            Interop.valueLayout.ADDRESS.withName("generate_output"),
            MemoryLayout.sequenceLayout(18, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link BaseTransformClass}
     * @return A new, uninitialized @{link BaseTransformClass}
     */
    public static BaseTransformClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        BaseTransformClass newInstance = new BaseTransformClass(segment.address());
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
     * Get the value of the field {@code passthrough_on_same_caps}
     * @return The value of the field {@code passthrough_on_same_caps}
     */
    public boolean getPassthroughOnSameCaps() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("passthrough_on_same_caps"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code passthrough_on_same_caps}
     * @param passthroughOnSameCaps The new value of the field {@code passthrough_on_same_caps}
     */
    public void setPassthroughOnSameCaps(boolean passthroughOnSameCaps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("passthrough_on_same_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(passthroughOnSameCaps, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code transform_ip_on_passthrough}
     * @return The value of the field {@code transform_ip_on_passthrough}
     */
    public boolean getTransformIpOnPassthrough() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_ip_on_passthrough"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code transform_ip_on_passthrough}
     * @param transformIpOnPassthrough The new value of the field {@code transform_ip_on_passthrough}
     */
    public void setTransformIpOnPassthrough(boolean transformIpOnPassthrough) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_ip_on_passthrough"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(transformIpOnPassthrough, null).intValue());
        }
    }
    
    /**
     * Functional interface declaration of the {@code TransformCapsCallback} callback.
     */
    @FunctionalInterface
    public interface TransformCapsCallback {
    
        org.gstreamer.gst.Caps run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.Caps caps, org.gstreamer.gst.Caps filter);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress trans, int direction, MemoryAddress caps, MemoryAddress filter) {
            var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.PadDirection.of(direction), org.gstreamer.gst.Caps.fromAddress.marshal(caps, null), org.gstreamer.gst.Caps.fromAddress.marshal(filter, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TransformCapsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code transform_caps}
     * @param transformCaps The new value of the field {@code transform_caps}
     */
    public void setTransformCaps(TransformCapsCallback transformCaps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transformCaps == null ? MemoryAddress.NULL : transformCaps.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FixateCapsCallback} callback.
     */
    @FunctionalInterface
    public interface FixateCapsCallback {
    
        org.gstreamer.gst.Caps run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.Caps caps, org.gstreamer.gst.Caps othercaps);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress trans, int direction, MemoryAddress caps, MemoryAddress othercaps) {
            var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.PadDirection.of(direction), org.gstreamer.gst.Caps.fromAddress.marshal(caps, null), org.gstreamer.gst.Caps.fromAddress.marshal(othercaps, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FixateCapsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code fixate_caps}
     * @param fixateCaps The new value of the field {@code fixate_caps}
     */
    public void setFixateCaps(FixateCapsCallback fixateCaps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fixate_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (fixateCaps == null ? MemoryAddress.NULL : fixateCaps.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AcceptCapsCallback} callback.
     */
    @FunctionalInterface
    public interface AcceptCapsCallback {
    
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.Caps caps);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans, int direction, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.PadDirection.of(direction), org.gstreamer.gst.Caps.fromAddress.marshal(caps, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AcceptCapsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code accept_caps}
     * @param acceptCaps The new value of the field {@code accept_caps}
     */
    public void setAcceptCaps(AcceptCapsCallback acceptCaps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("accept_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (acceptCaps == null ? MemoryAddress.NULL : acceptCaps.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetCapsCallback} callback.
     */
    @FunctionalInterface
    public interface SetCapsCallback {
    
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Caps incaps, org.gstreamer.gst.Caps outcaps);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress incaps, MemoryAddress outcaps) {
            var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.Caps.fromAddress.marshal(incaps, null), org.gstreamer.gst.Caps.fromAddress.marshal(outcaps, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetCapsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_caps}
     * @param setCaps The new value of the field {@code set_caps}
     */
    public void setSetCaps(SetCapsCallback setCaps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueryCallback} callback.
     */
    @FunctionalInterface
    public interface QueryCallback {
    
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.Query query);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans, int direction, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.PadDirection.of(direction), org.gstreamer.gst.Query.fromAddress.marshal(query, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query}
     * @param query The new value of the field {@code query}
     */
    public void setQuery(QueryCallback query) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (query == null ? MemoryAddress.NULL : query.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DecideAllocationCallback} callback.
     */
    @FunctionalInterface
    public interface DecideAllocationCallback {
    
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Query query);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.Query.fromAddress.marshal(query, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DecideAllocationCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code decide_allocation}
     * @param decideAllocation The new value of the field {@code decide_allocation}
     */
    public void setDecideAllocation(DecideAllocationCallback decideAllocation) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FilterMetaCallback} callback.
     */
    @FunctionalInterface
    public interface FilterMetaCallback {
    
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Query query, org.gtk.glib.Type api, org.gstreamer.gst.Structure params);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress query, long api, MemoryAddress params) {
            var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.Query.fromAddress.marshal(query, null), new org.gtk.glib.Type(api), org.gstreamer.gst.Structure.fromAddress.marshal(params, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FilterMetaCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code filter_meta}
     * @param filterMeta The new value of the field {@code filter_meta}
     */
    public void setFilterMeta(FilterMetaCallback filterMeta) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("filter_meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (filterMeta == null ? MemoryAddress.NULL : filterMeta.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ProposeAllocationCallback} callback.
     */
    @FunctionalInterface
    public interface ProposeAllocationCallback {
    
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Query decideQuery, org.gstreamer.gst.Query query);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress decideQuery, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.Query.fromAddress.marshal(decideQuery, null), org.gstreamer.gst.Query.fromAddress.marshal(query, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ProposeAllocationCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code propose_allocation}
     * @param proposeAllocation The new value of the field {@code propose_allocation}
     */
    public void setProposeAllocation(ProposeAllocationCallback proposeAllocation) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TransformSizeCallback} callback.
     */
    @FunctionalInterface
    public interface TransformSizeCallback {
    
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.Caps caps, long size, org.gstreamer.gst.Caps othercaps, Out<Long> othersize);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans, int direction, MemoryAddress caps, long size, MemoryAddress othercaps, MemoryAddress othersize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Long> othersizeOUT = new Out<>(othersize.get(Interop.valueLayout.C_LONG, 0));
                var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.PadDirection.of(direction), org.gstreamer.gst.Caps.fromAddress.marshal(caps, null), size, org.gstreamer.gst.Caps.fromAddress.marshal(othercaps, null), othersizeOUT);
                othersize.set(Interop.valueLayout.C_LONG, 0, othersizeOUT.get());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TransformSizeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code transform_size}
     * @param transformSize The new value of the field {@code transform_size}
     */
    public void setTransformSize(TransformSizeCallback transformSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transformSize == null ? MemoryAddress.NULL : transformSize.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetUnitSizeCallback} callback.
     */
    @FunctionalInterface
    public interface GetUnitSizeCallback {
    
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Caps caps, Out<Long> size);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress caps, MemoryAddress size) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Long> sizeOUT = new Out<>(size.get(Interop.valueLayout.C_LONG, 0));
                var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.Caps.fromAddress.marshal(caps, null), sizeOUT);
                size.set(Interop.valueLayout.C_LONG, 0, sizeOUT.get());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetUnitSizeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_unit_size}
     * @param getUnitSize The new value of the field {@code get_unit_size}
     */
    public void setGetUnitSize(GetUnitSizeCallback getUnitSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_unit_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getUnitSize == null ? MemoryAddress.NULL : getUnitSize.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StartCallback} callback.
     */
    @FunctionalInterface
    public interface StartCallback {
    
        boolean run(org.gstreamer.base.BaseTransform trans);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans) {
            var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null));
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
    
        boolean run(org.gstreamer.base.BaseTransform trans);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans) {
            var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
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
     * Functional interface declaration of the {@code SinkEventCallback} callback.
     */
    @FunctionalInterface
    public interface SinkEventCallback {
    
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Event event);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress event) {
            var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.Event.fromAddress.marshal(event, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SinkEventCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code sink_event}
     * @param sinkEvent The new value of the field {@code sink_event}
     */
    public void setSinkEvent(SinkEventCallback sinkEvent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sinkEvent == null ? MemoryAddress.NULL : sinkEvent.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SrcEventCallback} callback.
     */
    @FunctionalInterface
    public interface SrcEventCallback {
    
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Event event);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress event) {
            var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.Event.fromAddress.marshal(event, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SrcEventCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code src_event}
     * @param srcEvent The new value of the field {@code src_event}
     */
    public void setSrcEvent(SrcEventCallback srcEvent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (srcEvent == null ? MemoryAddress.NULL : srcEvent.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PrepareOutputBufferCallback} callback.
     */
    @FunctionalInterface
    public interface PrepareOutputBufferCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Buffer input, Out<org.gstreamer.gst.Buffer> outbuf);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress input, MemoryAddress outbuf) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<org.gstreamer.gst.Buffer> outbufOUT = new Out<>(org.gstreamer.gst.Buffer.fromAddress.marshal(outbuf, null));
                var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.Buffer.fromAddress.marshal(input, null), outbufOUT);
                outbuf.set(Interop.valueLayout.ADDRESS, 0, outbufOUT.get().handle());
                return RESULT.getValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PrepareOutputBufferCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare_output_buffer}
     * @param prepareOutputBuffer The new value of the field {@code prepare_output_buffer}
     */
    public void setPrepareOutputBuffer(PrepareOutputBufferCallback prepareOutputBuffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_output_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepareOutputBuffer == null ? MemoryAddress.NULL : prepareOutputBuffer.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CopyMetadataCallback} callback.
     */
    @FunctionalInterface
    public interface CopyMetadataCallback {
    
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Buffer input, org.gstreamer.gst.Buffer outbuf);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress input, MemoryAddress outbuf) {
            var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.Buffer.fromAddress.marshal(input, null), org.gstreamer.gst.Buffer.fromAddress.marshal(outbuf, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CopyMetadataCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code copy_metadata}
     * @param copyMetadata The new value of the field {@code copy_metadata}
     */
    public void setCopyMetadata(CopyMetadataCallback copyMetadata) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_metadata"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copyMetadata == null ? MemoryAddress.NULL : copyMetadata.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TransformMetaCallback} callback.
     */
    @FunctionalInterface
    public interface TransformMetaCallback {
    
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Buffer outbuf, org.gstreamer.gst.Meta meta, org.gstreamer.gst.Buffer inbuf);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress outbuf, MemoryAddress meta, MemoryAddress inbuf) {
            var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.Buffer.fromAddress.marshal(outbuf, null), org.gstreamer.gst.Meta.fromAddress.marshal(meta, null), org.gstreamer.gst.Buffer.fromAddress.marshal(inbuf, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TransformMetaCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code transform_meta}
     * @param transformMeta The new value of the field {@code transform_meta}
     */
    public void setTransformMeta(TransformMetaCallback transformMeta) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transformMeta == null ? MemoryAddress.NULL : transformMeta.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code BeforeTransformCallback} callback.
     */
    @FunctionalInterface
    public interface BeforeTransformCallback {
    
        void run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Buffer buffer);
        
        @ApiStatus.Internal default void upcall(MemoryAddress trans, MemoryAddress buffer) {
            run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BeforeTransformCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code before_transform}
     * @param beforeTransform The new value of the field {@code before_transform}
     */
    public void setBeforeTransform(BeforeTransformCallback beforeTransform) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("before_transform"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (beforeTransform == null ? MemoryAddress.NULL : beforeTransform.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TransformCallback} callback.
     */
    @FunctionalInterface
    public interface TransformCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Buffer inbuf, org.gstreamer.gst.Buffer outbuf);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress inbuf, MemoryAddress outbuf) {
            var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.Buffer.fromAddress.marshal(inbuf, null), org.gstreamer.gst.Buffer.fromAddress.marshal(outbuf, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TransformCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code transform}
     * @param transform The new value of the field {@code transform}
     */
    public void setTransform(TransformCallback transform) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transform == null ? MemoryAddress.NULL : transform.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TransformIpCallback} callback.
     */
    @FunctionalInterface
    public interface TransformIpCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Buffer buf);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress buf) {
            var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), org.gstreamer.gst.Buffer.fromAddress.marshal(buf, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TransformIpCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code transform_ip}
     * @param transformIp The new value of the field {@code transform_ip}
     */
    public void setTransformIp(TransformIpCallback transformIp) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_ip"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transformIp == null ? MemoryAddress.NULL : transformIp.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SubmitInputBufferCallback} callback.
     */
    @FunctionalInterface
    public interface SubmitInputBufferCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseTransform trans, boolean isDiscont, org.gstreamer.gst.Buffer input);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans, int isDiscont, MemoryAddress input) {
            var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), Marshal.integerToBoolean.marshal(isDiscont, null).booleanValue(), org.gstreamer.gst.Buffer.fromAddress.marshal(input, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SubmitInputBufferCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code submit_input_buffer}
     * @param submitInputBuffer The new value of the field {@code submit_input_buffer}
     */
    public void setSubmitInputBuffer(SubmitInputBufferCallback submitInputBuffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("submit_input_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (submitInputBuffer == null ? MemoryAddress.NULL : submitInputBuffer.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GenerateOutputCallback} callback.
     */
    @FunctionalInterface
    public interface GenerateOutputCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseTransform trans, Out<org.gstreamer.gst.Buffer> outbuf);
        
        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress outbuf) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<org.gstreamer.gst.Buffer> outbufOUT = new Out<>(org.gstreamer.gst.Buffer.fromAddress.marshal(outbuf, null));
                var RESULT = run((org.gstreamer.base.BaseTransform) Interop.register(trans, org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, null), outbufOUT);
                outbuf.set(Interop.valueLayout.ADDRESS, 0, outbufOUT.get().handle());
                return RESULT.getValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GenerateOutputCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code generate_output}
     * @param generateOutput The new value of the field {@code generate_output}
     */
    public void setGenerateOutput(GenerateOutputCallback generateOutput) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("generate_output"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (generateOutput == null ? MemoryAddress.NULL : generateOutput.toCallback()));
        }
    }
    
    /**
     * Create a BaseTransformClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BaseTransformClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BaseTransformClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BaseTransformClass(input);
    
    /**
     * A {@link BaseTransformClass.Builder} object constructs a {@link BaseTransformClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link BaseTransformClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final BaseTransformClass struct;
        
        private Builder() {
            struct = BaseTransformClass.allocate();
        }
        
        /**
         * Finish building the {@link BaseTransformClass} struct.
         * @return A new instance of {@code BaseTransformClass} with the fields 
         *         that were set in the Builder object.
         */
        public BaseTransformClass build() {
            return struct;
        }
        
        /**
         * Element parent class
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
        
        /**
         * If set to {@code true}, passthrough mode will be
         *                            automatically enabled if the caps are the same.
         *                            Set to {@code false} by default.
         * @param passthroughOnSameCaps The value for the {@code passthroughOnSameCaps} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPassthroughOnSameCaps(boolean passthroughOnSameCaps) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("passthrough_on_same_caps"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(passthroughOnSameCaps, null).intValue());
                return this;
            }
        }
        
        /**
         * If set to {@code true}, {@code transform_ip} will be called in
         *                           passthrough mode. The passed buffer might not be
         *                           writable. When {@code false}, neither {@code transform} nor
         *                           {@code transform_ip} will be called in passthrough mode.
         *                           Set to {@code true} by default.
         * @param transformIpOnPassthrough The value for the {@code transformIpOnPassthrough} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTransformIpOnPassthrough(boolean transformIpOnPassthrough) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("transform_ip_on_passthrough"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(transformIpOnPassthrough, null).intValue());
                return this;
            }
        }
        
        public Builder setTransformCaps(TransformCapsCallback transformCaps) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("transform_caps"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transformCaps == null ? MemoryAddress.NULL : transformCaps.toCallback()));
                return this;
            }
        }
        
        public Builder setFixateCaps(FixateCapsCallback fixateCaps) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("fixate_caps"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (fixateCaps == null ? MemoryAddress.NULL : fixateCaps.toCallback()));
                return this;
            }
        }
        
        public Builder setAcceptCaps(AcceptCapsCallback acceptCaps) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("accept_caps"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (acceptCaps == null ? MemoryAddress.NULL : acceptCaps.toCallback()));
                return this;
            }
        }
        
        public Builder setSetCaps(SetCapsCallback setCaps) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps.toCallback()));
                return this;
            }
        }
        
        public Builder setQuery(QueryCallback query) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (query == null ? MemoryAddress.NULL : query.toCallback()));
                return this;
            }
        }
        
        public Builder setDecideAllocation(DecideAllocationCallback decideAllocation) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation.toCallback()));
                return this;
            }
        }
        
        public Builder setFilterMeta(FilterMetaCallback filterMeta) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("filter_meta"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (filterMeta == null ? MemoryAddress.NULL : filterMeta.toCallback()));
                return this;
            }
        }
        
        public Builder setProposeAllocation(ProposeAllocationCallback proposeAllocation) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation.toCallback()));
                return this;
            }
        }
        
        public Builder setTransformSize(TransformSizeCallback transformSize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("transform_size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transformSize == null ? MemoryAddress.NULL : transformSize.toCallback()));
                return this;
            }
        }
        
        public Builder setGetUnitSize(GetUnitSizeCallback getUnitSize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_unit_size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getUnitSize == null ? MemoryAddress.NULL : getUnitSize.toCallback()));
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
        
        public Builder setSinkEvent(SinkEventCallback sinkEvent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("sink_event"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sinkEvent == null ? MemoryAddress.NULL : sinkEvent.toCallback()));
                return this;
            }
        }
        
        public Builder setSrcEvent(SrcEventCallback srcEvent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("src_event"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (srcEvent == null ? MemoryAddress.NULL : srcEvent.toCallback()));
                return this;
            }
        }
        
        public Builder setPrepareOutputBuffer(PrepareOutputBufferCallback prepareOutputBuffer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("prepare_output_buffer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepareOutputBuffer == null ? MemoryAddress.NULL : prepareOutputBuffer.toCallback()));
                return this;
            }
        }
        
        public Builder setCopyMetadata(CopyMetadataCallback copyMetadata) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("copy_metadata"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copyMetadata == null ? MemoryAddress.NULL : copyMetadata.toCallback()));
                return this;
            }
        }
        
        public Builder setTransformMeta(TransformMetaCallback transformMeta) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("transform_meta"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transformMeta == null ? MemoryAddress.NULL : transformMeta.toCallback()));
                return this;
            }
        }
        
        public Builder setBeforeTransform(BeforeTransformCallback beforeTransform) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("before_transform"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (beforeTransform == null ? MemoryAddress.NULL : beforeTransform.toCallback()));
                return this;
            }
        }
        
        public Builder setTransform(TransformCallback transform) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("transform"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transform == null ? MemoryAddress.NULL : transform.toCallback()));
                return this;
            }
        }
        
        public Builder setTransformIp(TransformIpCallback transformIp) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("transform_ip"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transformIp == null ? MemoryAddress.NULL : transformIp.toCallback()));
                return this;
            }
        }
        
        public Builder setSubmitInputBuffer(SubmitInputBufferCallback submitInputBuffer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("submit_input_buffer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (submitInputBuffer == null ? MemoryAddress.NULL : submitInputBuffer.toCallback()));
                return this;
            }
        }
        
        public Builder setGenerateOutput(GenerateOutputCallback generateOutput) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("generate_output"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (generateOutput == null ? MemoryAddress.NULL : generateOutput.toCallback()));
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
