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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BaseTransformClass newInstance = new BaseTransformClass(segment.address(), Ownership.NONE);
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
    
    /**
     * Get the value of the field {@code passthrough_on_same_caps}
     * @return The value of the field {@code passthrough_on_same_caps}
     */
    public boolean getPassthroughOnSameCaps() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("passthrough_on_same_caps"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code passthrough_on_same_caps}
     * @param passthroughOnSameCaps The new value of the field {@code passthrough_on_same_caps}
     */
    public void setPassthroughOnSameCaps(boolean passthroughOnSameCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("passthrough_on_same_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(passthroughOnSameCaps, null).intValue());
    }
    
    /**
     * Get the value of the field {@code transform_ip_on_passthrough}
     * @return The value of the field {@code transform_ip_on_passthrough}
     */
    public boolean getTransformIpOnPassthrough() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transform_ip_on_passthrough"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code transform_ip_on_passthrough}
     * @param transformIpOnPassthrough The new value of the field {@code transform_ip_on_passthrough}
     */
    public void setTransformIpOnPassthrough(boolean transformIpOnPassthrough) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transform_ip_on_passthrough"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(transformIpOnPassthrough, null).intValue());
    }
    
    @FunctionalInterface
    public interface TransformCapsCallback {
        org.gstreamer.gst.Caps run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.Caps caps, org.gstreamer.gst.Caps filter);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress trans, int direction, MemoryAddress caps, MemoryAddress filter) {
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.PadDirection.of(direction), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(filter, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TransformCapsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code transform_caps}
     * @param transformCaps The new value of the field {@code transform_caps}
     */
    public void setTransformCaps(TransformCapsCallback transformCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transform_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformCaps == null ? MemoryAddress.NULL : transformCaps.toCallback()));
    }
    
    @FunctionalInterface
    public interface FixateCapsCallback {
        org.gstreamer.gst.Caps run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.Caps caps, org.gstreamer.gst.Caps othercaps);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress trans, int direction, MemoryAddress caps, MemoryAddress othercaps) {
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.PadDirection.of(direction), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(othercaps, Ownership.FULL));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FixateCapsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code fixate_caps}
     * @param fixateCaps The new value of the field {@code fixate_caps}
     */
    public void setFixateCaps(FixateCapsCallback fixateCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fixate_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fixateCaps == null ? MemoryAddress.NULL : fixateCaps.toCallback()));
    }
    
    @FunctionalInterface
    public interface AcceptCapsCallback {
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.Caps caps);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, int direction, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.PadDirection.of(direction), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AcceptCapsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code accept_caps}
     * @param acceptCaps The new value of the field {@code accept_caps}
     */
    public void setAcceptCaps(AcceptCapsCallback acceptCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("accept_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acceptCaps == null ? MemoryAddress.NULL : acceptCaps.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetCapsCallback {
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Caps incaps, org.gstreamer.gst.Caps outcaps);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress incaps, MemoryAddress outcaps) {
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(incaps, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(outcaps, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetCapsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_caps}
     * @param setCaps The new value of the field {@code set_caps}
     */
    public void setSetCaps(SetCapsCallback setCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps.toCallback()));
    }
    
    @FunctionalInterface
    public interface QueryCallback {
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, int direction, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.PadDirection.of(direction), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QueryCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query}
     * @param query The new value of the field {@code query}
     */
    public void setQuery(QueryCallback query) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("query"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query == null ? MemoryAddress.NULL : query.toCallback()));
    }
    
    @FunctionalInterface
    public interface DecideAllocationCallback {
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DecideAllocationCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code decide_allocation}
     * @param decideAllocation The new value of the field {@code decide_allocation}
     */
    public void setDecideAllocation(DecideAllocationCallback decideAllocation) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation.toCallback()));
    }
    
    @FunctionalInterface
    public interface FilterMetaCallback {
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Query query, org.gtk.glib.Type api, org.gstreamer.gst.Structure params);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress query, long api, MemoryAddress params) {
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE), new org.gtk.glib.Type(api), org.gstreamer.gst.Structure.fromAddress.marshal(params, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FilterMetaCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code filter_meta}
     * @param filterMeta The new value of the field {@code filter_meta}
     */
    public void setFilterMeta(FilterMetaCallback filterMeta) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("filter_meta"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (filterMeta == null ? MemoryAddress.NULL : filterMeta.toCallback()));
    }
    
    @FunctionalInterface
    public interface ProposeAllocationCallback {
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Query decideQuery, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress decideQuery, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(decideQuery, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ProposeAllocationCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code propose_allocation}
     * @param proposeAllocation The new value of the field {@code propose_allocation}
     */
    public void setProposeAllocation(ProposeAllocationCallback proposeAllocation) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation.toCallback()));
    }
    
    @FunctionalInterface
    public interface TransformSizeCallback {
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.Caps caps, long size, org.gstreamer.gst.Caps othercaps, Out<Long> othersize);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, int direction, MemoryAddress caps, long size, MemoryAddress othercaps, MemoryAddress othersize) {
            Out<Long> othersizeOUT = new Out<>(othersize.get(Interop.valueLayout.C_LONG, 0));
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.PadDirection.of(direction), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE), size, org.gstreamer.gst.Caps.fromAddress.marshal(othercaps, Ownership.NONE), othersizeOUT);
            othersize.set(Interop.valueLayout.C_LONG, 0, othersizeOUT.get());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TransformSizeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code transform_size}
     * @param transformSize The new value of the field {@code transform_size}
     */
    public void setTransformSize(TransformSizeCallback transformSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transform_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformSize == null ? MemoryAddress.NULL : transformSize.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetUnitSizeCallback {
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Caps caps, Out<Long> size);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress caps, MemoryAddress size) {
            Out<Long> sizeOUT = new Out<>(size.get(Interop.valueLayout.C_LONG, 0));
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE), sizeOUT);
            size.set(Interop.valueLayout.C_LONG, 0, sizeOUT.get());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetUnitSizeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_unit_size}
     * @param getUnitSize The new value of the field {@code get_unit_size}
     */
    public void setGetUnitSize(GetUnitSizeCallback getUnitSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_unit_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUnitSize == null ? MemoryAddress.NULL : getUnitSize.toCallback()));
    }
    
    @FunctionalInterface
    public interface StartCallback {
        boolean run(org.gstreamer.base.BaseTransform trans);

        @ApiStatus.Internal default int upcall(MemoryAddress trans) {
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StartCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start}
     * @param start The new value of the field {@code start}
     */
    public void setStart(StartCallback start) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
    }
    
    @FunctionalInterface
    public interface StopCallback {
        boolean run(org.gstreamer.base.BaseTransform trans);

        @ApiStatus.Internal default int upcall(MemoryAddress trans) {
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StopCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stop}
     * @param stop The new value of the field {@code stop}
     */
    public void setStop(StopCallback stop) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stop"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
    }
    
    @FunctionalInterface
    public interface SinkEventCallback {
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Event event);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress event) {
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.FULL));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SinkEventCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code sink_event}
     * @param sinkEvent The new value of the field {@code sink_event}
     */
    public void setSinkEvent(SinkEventCallback sinkEvent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sink_event"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkEvent == null ? MemoryAddress.NULL : sinkEvent.toCallback()));
    }
    
    @FunctionalInterface
    public interface SrcEventCallback {
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Event event);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress event) {
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.FULL));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SrcEventCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code src_event}
     * @param srcEvent The new value of the field {@code src_event}
     */
    public void setSrcEvent(SrcEventCallback srcEvent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("src_event"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcEvent == null ? MemoryAddress.NULL : srcEvent.toCallback()));
    }
    
    @FunctionalInterface
    public interface PrepareOutputBufferCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Buffer input, Out<org.gstreamer.gst.Buffer> outbuf);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress input, MemoryAddress outbuf) {
            Out<org.gstreamer.gst.Buffer> outbufOUT = new Out<>(org.gstreamer.gst.Buffer.fromAddress.marshal(outbuf, Ownership.FULL));
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(input, Ownership.NONE), outbufOUT);
            outbuf.set(Interop.valueLayout.ADDRESS, 0, outbufOUT.get().handle());
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PrepareOutputBufferCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare_output_buffer}
     * @param prepareOutputBuffer The new value of the field {@code prepare_output_buffer}
     */
    public void setPrepareOutputBuffer(PrepareOutputBufferCallback prepareOutputBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prepare_output_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareOutputBuffer == null ? MemoryAddress.NULL : prepareOutputBuffer.toCallback()));
    }
    
    @FunctionalInterface
    public interface CopyMetadataCallback {
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Buffer input, org.gstreamer.gst.Buffer outbuf);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress input, MemoryAddress outbuf) {
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(input, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(outbuf, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CopyMetadataCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code copy_metadata}
     * @param copyMetadata The new value of the field {@code copy_metadata}
     */
    public void setCopyMetadata(CopyMetadataCallback copyMetadata) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("copy_metadata"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copyMetadata == null ? MemoryAddress.NULL : copyMetadata.toCallback()));
    }
    
    @FunctionalInterface
    public interface TransformMetaCallback {
        boolean run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Buffer outbuf, org.gstreamer.gst.Meta meta, org.gstreamer.gst.Buffer inbuf);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress outbuf, MemoryAddress meta, MemoryAddress inbuf) {
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(outbuf, Ownership.NONE), org.gstreamer.gst.Meta.fromAddress.marshal(meta, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(inbuf, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TransformMetaCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code transform_meta}
     * @param transformMeta The new value of the field {@code transform_meta}
     */
    public void setTransformMeta(TransformMetaCallback transformMeta) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transform_meta"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformMeta == null ? MemoryAddress.NULL : transformMeta.toCallback()));
    }
    
    @FunctionalInterface
    public interface BeforeTransformCallback {
        void run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Buffer buffer);

        @ApiStatus.Internal default void upcall(MemoryAddress trans, MemoryAddress buffer) {
            run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(BeforeTransformCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code before_transform}
     * @param beforeTransform The new value of the field {@code before_transform}
     */
    public void setBeforeTransform(BeforeTransformCallback beforeTransform) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("before_transform"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (beforeTransform == null ? MemoryAddress.NULL : beforeTransform.toCallback()));
    }
    
    @FunctionalInterface
    public interface TransformCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Buffer inbuf, org.gstreamer.gst.Buffer outbuf);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress inbuf, MemoryAddress outbuf) {
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(inbuf, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(outbuf, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TransformCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code transform}
     * @param transform The new value of the field {@code transform}
     */
    public void setTransform(TransformCallback transform) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transform"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transform == null ? MemoryAddress.NULL : transform.toCallback()));
    }
    
    @FunctionalInterface
    public interface TransformIpCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseTransform trans, org.gstreamer.gst.Buffer buf);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress buf) {
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buf, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TransformIpCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code transform_ip}
     * @param transformIp The new value of the field {@code transform_ip}
     */
    public void setTransformIp(TransformIpCallback transformIp) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transform_ip"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformIp == null ? MemoryAddress.NULL : transformIp.toCallback()));
    }
    
    @FunctionalInterface
    public interface SubmitInputBufferCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseTransform trans, boolean isDiscont, org.gstreamer.gst.Buffer input);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, int isDiscont, MemoryAddress input) {
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), Marshal.integerToBoolean.marshal(isDiscont, null).booleanValue(), org.gstreamer.gst.Buffer.fromAddress.marshal(input, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SubmitInputBufferCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code submit_input_buffer}
     * @param submitInputBuffer The new value of the field {@code submit_input_buffer}
     */
    public void setSubmitInputBuffer(SubmitInputBufferCallback submitInputBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("submit_input_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (submitInputBuffer == null ? MemoryAddress.NULL : submitInputBuffer.toCallback()));
    }
    
    @FunctionalInterface
    public interface GenerateOutputCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseTransform trans, Out<org.gstreamer.gst.Buffer> outbuf);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress outbuf) {
            Out<org.gstreamer.gst.Buffer> outbufOUT = new Out<>(org.gstreamer.gst.Buffer.fromAddress.marshal(outbuf, Ownership.FULL));
            var RESULT = run((org.gstreamer.base.BaseTransform) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.base.BaseTransform.fromAddress).marshal(trans, Ownership.NONE), outbufOUT);
            outbuf.set(Interop.valueLayout.ADDRESS, 0, outbufOUT.get().handle());
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GenerateOutputCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code generate_output}
     * @param generateOutput The new value of the field {@code generate_output}
     */
    public void setGenerateOutput(GenerateOutputCallback generateOutput) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("generate_output"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (generateOutput == null ? MemoryAddress.NULL : generateOutput.toCallback()));
    }
    
    /**
     * Create a BaseTransformClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BaseTransformClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BaseTransformClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BaseTransformClass(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        /**
         * If set to {@code true}, passthrough mode will be
         *                            automatically enabled if the caps are the same.
         *                            Set to {@code false} by default.
         * @param passthroughOnSameCaps The value for the {@code passthroughOnSameCaps} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPassthroughOnSameCaps(boolean passthroughOnSameCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("passthrough_on_same_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(passthroughOnSameCaps, null).intValue());
            return this;
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_ip_on_passthrough"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(transformIpOnPassthrough, null).intValue());
            return this;
        }
        
        public Builder setTransformCaps(TransformCapsCallback transformCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformCaps == null ? MemoryAddress.NULL : transformCaps.toCallback()));
            return this;
        }
        
        public Builder setFixateCaps(FixateCapsCallback fixateCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fixate_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fixateCaps == null ? MemoryAddress.NULL : fixateCaps.toCallback()));
            return this;
        }
        
        public Builder setAcceptCaps(AcceptCapsCallback acceptCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("accept_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acceptCaps == null ? MemoryAddress.NULL : acceptCaps.toCallback()));
            return this;
        }
        
        public Builder setSetCaps(SetCapsCallback setCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps.toCallback()));
            return this;
        }
        
        public Builder setQuery(QueryCallback query) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query == null ? MemoryAddress.NULL : query.toCallback()));
            return this;
        }
        
        public Builder setDecideAllocation(DecideAllocationCallback decideAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation.toCallback()));
            return this;
        }
        
        public Builder setFilterMeta(FilterMetaCallback filterMeta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("filter_meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (filterMeta == null ? MemoryAddress.NULL : filterMeta.toCallback()));
            return this;
        }
        
        public Builder setProposeAllocation(ProposeAllocationCallback proposeAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation.toCallback()));
            return this;
        }
        
        public Builder setTransformSize(TransformSizeCallback transformSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformSize == null ? MemoryAddress.NULL : transformSize.toCallback()));
            return this;
        }
        
        public Builder setGetUnitSize(GetUnitSizeCallback getUnitSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_unit_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUnitSize == null ? MemoryAddress.NULL : getUnitSize.toCallback()));
            return this;
        }
        
        public Builder setStart(StartCallback start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
            return this;
        }
        
        public Builder setStop(StopCallback stop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
            return this;
        }
        
        public Builder setSinkEvent(SinkEventCallback sinkEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkEvent == null ? MemoryAddress.NULL : sinkEvent.toCallback()));
            return this;
        }
        
        public Builder setSrcEvent(SrcEventCallback srcEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcEvent == null ? MemoryAddress.NULL : srcEvent.toCallback()));
            return this;
        }
        
        public Builder setPrepareOutputBuffer(PrepareOutputBufferCallback prepareOutputBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_output_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareOutputBuffer == null ? MemoryAddress.NULL : prepareOutputBuffer.toCallback()));
            return this;
        }
        
        public Builder setCopyMetadata(CopyMetadataCallback copyMetadata) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_metadata"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copyMetadata == null ? MemoryAddress.NULL : copyMetadata.toCallback()));
            return this;
        }
        
        public Builder setTransformMeta(TransformMetaCallback transformMeta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformMeta == null ? MemoryAddress.NULL : transformMeta.toCallback()));
            return this;
        }
        
        public Builder setBeforeTransform(BeforeTransformCallback beforeTransform) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("before_transform"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (beforeTransform == null ? MemoryAddress.NULL : beforeTransform.toCallback()));
            return this;
        }
        
        public Builder setTransform(TransformCallback transform) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transform == null ? MemoryAddress.NULL : transform.toCallback()));
            return this;
        }
        
        public Builder setTransformIp(TransformIpCallback transformIp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_ip"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformIp == null ? MemoryAddress.NULL : transformIp.toCallback()));
            return this;
        }
        
        public Builder setSubmitInputBuffer(SubmitInputBufferCallback submitInputBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("submit_input_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (submitInputBuffer == null ? MemoryAddress.NULL : submitInputBuffer.toCallback()));
            return this;
        }
        
        public Builder setGenerateOutput(GenerateOutputCallback generateOutput) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("generate_output"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (generateOutput == null ? MemoryAddress.NULL : generateOutput.toCallback()));
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
