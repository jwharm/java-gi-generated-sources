package org.gstreamer.app;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A set of callbacks that can be installed on the appsrc with
 * gst_app_src_set_callbacks().
 */
public class AppSrcCallbacks extends Struct {
    
    static {
        GstApp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAppSrcCallbacks";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("need_data"),
            Interop.valueLayout.ADDRESS.withName("enough_data"),
            Interop.valueLayout.ADDRESS.withName("seek_data"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AppSrcCallbacks}
     * @return A new, uninitialized @{link AppSrcCallbacks}
     */
    public static AppSrcCallbacks allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AppSrcCallbacks newInstance = new AppSrcCallbacks(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code NeedDataCallback} callback.
     */
    @FunctionalInterface
    public interface NeedDataCallback {
    
        void run(org.gstreamer.app.AppSrc src, int length);
        
        @ApiStatus.Internal default void upcall(MemoryAddress src, int length, MemoryAddress userData) {
            run((org.gstreamer.app.AppSrc) Interop.register(src, org.gstreamer.app.AppSrc.fromAddress).marshal(src, null), length);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NeedDataCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code need_data}
     * @param needData The new value of the field {@code need_data}
     */
    public void setNeedData(NeedDataCallback needData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("need_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (needData == null ? MemoryAddress.NULL : needData.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EnoughDataCallback} callback.
     */
    @FunctionalInterface
    public interface EnoughDataCallback {
    
        void run(org.gstreamer.app.AppSrc src);
        
        @ApiStatus.Internal default void upcall(MemoryAddress src, MemoryAddress userData) {
            run((org.gstreamer.app.AppSrc) Interop.register(src, org.gstreamer.app.AppSrc.fromAddress).marshal(src, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EnoughDataCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code enough_data}
     * @param enoughData The new value of the field {@code enough_data}
     */
    public void setEnoughData(EnoughDataCallback enoughData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enough_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enoughData == null ? MemoryAddress.NULL : enoughData.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SeekDataCallback} callback.
     */
    @FunctionalInterface
    public interface SeekDataCallback {
    
        boolean run(org.gstreamer.app.AppSrc src, long offset);
        
        @ApiStatus.Internal default int upcall(MemoryAddress src, long offset, MemoryAddress userData) {
            var RESULT = run((org.gstreamer.app.AppSrc) Interop.register(src, org.gstreamer.app.AppSrc.fromAddress).marshal(src, null), offset);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SeekDataCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code seek_data}
     * @param seekData The new value of the field {@code seek_data}
     */
    public void setSeekData(SeekDataCallback seekData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seek_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (seekData == null ? MemoryAddress.NULL : seekData.toCallback()));
        }
    }
    
    /**
     * Create a AppSrcCallbacks proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AppSrcCallbacks(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AppSrcCallbacks> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AppSrcCallbacks(input);
    
    /**
     * A {@link AppSrcCallbacks.Builder} object constructs a {@link AppSrcCallbacks} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AppSrcCallbacks.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AppSrcCallbacks struct;
        
        private Builder() {
            struct = AppSrcCallbacks.allocate();
        }
        
        /**
         * Finish building the {@link AppSrcCallbacks} struct.
         * @return A new instance of {@code AppSrcCallbacks} with the fields 
         *         that were set in the Builder object.
         */
        public AppSrcCallbacks build() {
            return struct;
        }
        
        public Builder setNeedData(NeedDataCallback needData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("need_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (needData == null ? MemoryAddress.NULL : needData.toCallback()));
                return this;
            }
        }
        
        public Builder setEnoughData(EnoughDataCallback enoughData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("enough_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enoughData == null ? MemoryAddress.NULL : enoughData.toCallback()));
                return this;
            }
        }
        
        public Builder setSeekData(SeekDataCallback seekData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("seek_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (seekData == null ? MemoryAddress.NULL : seekData.toCallback()));
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
