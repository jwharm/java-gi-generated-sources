package org.gstreamer.app;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AppSrcClass extends Struct {
    
    static {
        GstApp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAppSrcClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.BaseSrcClass.getMemoryLayout().withName("basesrc_class"),
            Interop.valueLayout.ADDRESS.withName("need_data"),
            Interop.valueLayout.ADDRESS.withName("enough_data"),
            Interop.valueLayout.ADDRESS.withName("seek_data"),
            Interop.valueLayout.ADDRESS.withName("push_buffer"),
            Interop.valueLayout.ADDRESS.withName("end_of_stream"),
            Interop.valueLayout.ADDRESS.withName("push_sample"),
            Interop.valueLayout.ADDRESS.withName("push_buffer_list"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AppSrcClass}
     * @return A new, uninitialized @{link AppSrcClass}
     */
    public static AppSrcClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AppSrcClass newInstance = new AppSrcClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code basesrc_class}
     * @return The value of the field {@code basesrc_class}
     */
    public org.gstreamer.base.BaseSrcClass getBasesrcClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("basesrc_class"));
        return org.gstreamer.base.BaseSrcClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code basesrc_class}
     * @param basesrcClass The new value of the field {@code basesrc_class}
     */
    public void setBasesrcClass(org.gstreamer.base.BaseSrcClass basesrcClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("basesrc_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (basesrcClass == null ? MemoryAddress.NULL : basesrcClass.handle()));
    }
    
    @FunctionalInterface
    public interface NeedDataCallback {
        void run(org.gstreamer.app.AppSrc appsrc, int length);

        @ApiStatus.Internal default void upcall(MemoryAddress appsrc, int length) {
            run((org.gstreamer.app.AppSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appsrc)), org.gstreamer.app.AppSrc.fromAddress).marshal(appsrc, Ownership.NONE), length);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NeedDataCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code need_data}
     * @param needData The new value of the field {@code need_data}
     */
    public void setNeedData(NeedDataCallback needData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("need_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (needData == null ? MemoryAddress.NULL : needData.toCallback()));
    }
    
    @FunctionalInterface
    public interface EnoughDataCallback {
        void run(org.gstreamer.app.AppSrc appsrc);

        @ApiStatus.Internal default void upcall(MemoryAddress appsrc) {
            run((org.gstreamer.app.AppSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appsrc)), org.gstreamer.app.AppSrc.fromAddress).marshal(appsrc, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EnoughDataCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code enough_data}
     * @param enoughData The new value of the field {@code enough_data}
     */
    public void setEnoughData(EnoughDataCallback enoughData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("enough_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enoughData == null ? MemoryAddress.NULL : enoughData.toCallback()));
    }
    
    @FunctionalInterface
    public interface SeekDataCallback {
        boolean run(org.gstreamer.app.AppSrc appsrc, long offset);

        @ApiStatus.Internal default int upcall(MemoryAddress appsrc, long offset) {
            var RESULT = run((org.gstreamer.app.AppSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appsrc)), org.gstreamer.app.AppSrc.fromAddress).marshal(appsrc, Ownership.NONE), offset);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SeekDataCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code seek_data}
     * @param seekData The new value of the field {@code seek_data}
     */
    public void setSeekData(SeekDataCallback seekData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("seek_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (seekData == null ? MemoryAddress.NULL : seekData.toCallback()));
    }
    
    @FunctionalInterface
    public interface PushBufferCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.app.AppSrc appsrc, org.gstreamer.gst.Buffer buffer);

        @ApiStatus.Internal default int upcall(MemoryAddress appsrc, MemoryAddress buffer) {
            var RESULT = run((org.gstreamer.app.AppSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appsrc)), org.gstreamer.app.AppSrc.fromAddress).marshal(appsrc, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.FULL));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PushBufferCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code push_buffer}
     * @param pushBuffer The new value of the field {@code push_buffer}
     */
    public void setPushBuffer(PushBufferCallback pushBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("push_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pushBuffer == null ? MemoryAddress.NULL : pushBuffer.toCallback()));
    }
    
    @FunctionalInterface
    public interface EndOfStreamCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.app.AppSrc appsrc);

        @ApiStatus.Internal default int upcall(MemoryAddress appsrc) {
            var RESULT = run((org.gstreamer.app.AppSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appsrc)), org.gstreamer.app.AppSrc.fromAddress).marshal(appsrc, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EndOfStreamCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code end_of_stream}
     * @param endOfStream The new value of the field {@code end_of_stream}
     */
    public void setEndOfStream(EndOfStreamCallback endOfStream) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_of_stream"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (endOfStream == null ? MemoryAddress.NULL : endOfStream.toCallback()));
    }
    
    @FunctionalInterface
    public interface PushSampleCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.app.AppSrc appsrc, org.gstreamer.gst.Sample sample);

        @ApiStatus.Internal default int upcall(MemoryAddress appsrc, MemoryAddress sample) {
            var RESULT = run((org.gstreamer.app.AppSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appsrc)), org.gstreamer.app.AppSrc.fromAddress).marshal(appsrc, Ownership.NONE), org.gstreamer.gst.Sample.fromAddress.marshal(sample, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PushSampleCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code push_sample}
     * @param pushSample The new value of the field {@code push_sample}
     */
    public void setPushSample(PushSampleCallback pushSample) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("push_sample"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pushSample == null ? MemoryAddress.NULL : pushSample.toCallback()));
    }
    
    @FunctionalInterface
    public interface PushBufferListCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.app.AppSrc appsrc, org.gstreamer.gst.BufferList bufferList);

        @ApiStatus.Internal default int upcall(MemoryAddress appsrc, MemoryAddress bufferList) {
            var RESULT = run((org.gstreamer.app.AppSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appsrc)), org.gstreamer.app.AppSrc.fromAddress).marshal(appsrc, Ownership.NONE), org.gstreamer.gst.BufferList.fromAddress.marshal(bufferList, Ownership.FULL));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PushBufferListCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code push_buffer_list}
     * @param pushBufferList The new value of the field {@code push_buffer_list}
     */
    public void setPushBufferList(PushBufferListCallback pushBufferList) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("push_buffer_list"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pushBufferList == null ? MemoryAddress.NULL : pushBufferList.toCallback()));
    }
    
    /**
     * Create a AppSrcClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AppSrcClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AppSrcClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AppSrcClass(input, ownership);
    
    /**
     * A {@link AppSrcClass.Builder} object constructs a {@link AppSrcClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AppSrcClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AppSrcClass struct;
        
        private Builder() {
            struct = AppSrcClass.allocate();
        }
        
         /**
         * Finish building the {@link AppSrcClass} struct.
         * @return A new instance of {@code AppSrcClass} with the fields 
         *         that were set in the Builder object.
         */
        public AppSrcClass build() {
            return struct;
        }
        
        public Builder setBasesrcClass(org.gstreamer.base.BaseSrcClass basesrcClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("basesrc_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (basesrcClass == null ? MemoryAddress.NULL : basesrcClass.handle()));
            return this;
        }
        
        public Builder setNeedData(NeedDataCallback needData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("need_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (needData == null ? MemoryAddress.NULL : needData.toCallback()));
            return this;
        }
        
        public Builder setEnoughData(EnoughDataCallback enoughData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enough_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enoughData == null ? MemoryAddress.NULL : enoughData.toCallback()));
            return this;
        }
        
        public Builder setSeekData(SeekDataCallback seekData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seek_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (seekData == null ? MemoryAddress.NULL : seekData.toCallback()));
            return this;
        }
        
        public Builder setPushBuffer(PushBufferCallback pushBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("push_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pushBuffer == null ? MemoryAddress.NULL : pushBuffer.toCallback()));
            return this;
        }
        
        public Builder setEndOfStream(EndOfStreamCallback endOfStream) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_of_stream"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (endOfStream == null ? MemoryAddress.NULL : endOfStream.toCallback()));
            return this;
        }
        
        public Builder setPushSample(PushSampleCallback pushSample) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("push_sample"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pushSample == null ? MemoryAddress.NULL : pushSample.toCallback()));
            return this;
        }
        
        public Builder setPushBufferList(PushBufferListCallback pushBufferList) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("push_buffer_list"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pushBufferList == null ? MemoryAddress.NULL : pushBufferList.toCallback()));
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
