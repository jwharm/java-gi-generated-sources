package org.gstreamer.app;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A set of callbacks that can be installed on the appsink with
 * gst_app_sink_set_callbacks().
 */
public class AppSinkCallbacks extends Struct {
    
    static {
        GstApp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAppSinkCallbacks";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("eos"),
            Interop.valueLayout.ADDRESS.withName("new_preroll"),
            Interop.valueLayout.ADDRESS.withName("new_sample"),
            Interop.valueLayout.ADDRESS.withName("new_event"),
            MemoryLayout.sequenceLayout(3, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AppSinkCallbacks}
     * @return A new, uninitialized @{link AppSinkCallbacks}
     */
    public static AppSinkCallbacks allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AppSinkCallbacks newInstance = new AppSinkCallbacks(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code EosCallback} callback.
     */
    @FunctionalInterface
    public interface EosCallback {
    
        void run(org.gstreamer.app.AppSink appsink);
        
        @ApiStatus.Internal default void upcall(MemoryAddress appsink, MemoryAddress userData) {
            run((org.gstreamer.app.AppSink) Interop.register(appsink, org.gstreamer.app.AppSink.fromAddress).marshal(appsink, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EosCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eos}
     * @param eos The new value of the field {@code eos}
     */
    public void setEos(EosCallback eos) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eos"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (eos == null ? MemoryAddress.NULL : eos.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code NewPrerollCallback} callback.
     */
    @FunctionalInterface
    public interface NewPrerollCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.app.AppSink appsink);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appsink, MemoryAddress userData) {
            var RESULT = run((org.gstreamer.app.AppSink) Interop.register(appsink, org.gstreamer.app.AppSink.fromAddress).marshal(appsink, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NewPrerollCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code new_preroll}
     * @param newPreroll The new value of the field {@code new_preroll}
     */
    public void setNewPreroll(NewPrerollCallback newPreroll) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("new_preroll"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (newPreroll == null ? MemoryAddress.NULL : newPreroll.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code NewSampleCallback} callback.
     */
    @FunctionalInterface
    public interface NewSampleCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.app.AppSink appsink);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appsink, MemoryAddress userData) {
            var RESULT = run((org.gstreamer.app.AppSink) Interop.register(appsink, org.gstreamer.app.AppSink.fromAddress).marshal(appsink, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NewSampleCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code new_sample}
     * @param newSample The new value of the field {@code new_sample}
     */
    public void setNewSample(NewSampleCallback newSample) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("new_sample"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (newSample == null ? MemoryAddress.NULL : newSample.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code NewEventCallback} callback.
     */
    @FunctionalInterface
    public interface NewEventCallback {
    
        boolean run(org.gstreamer.app.AppSink appsink);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appsink, MemoryAddress userData) {
            var RESULT = run((org.gstreamer.app.AppSink) Interop.register(appsink, org.gstreamer.app.AppSink.fromAddress).marshal(appsink, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NewEventCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code new_event}
     * @param newEvent The new value of the field {@code new_event}
     */
    public void setNewEvent(NewEventCallback newEvent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("new_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (newEvent == null ? MemoryAddress.NULL : newEvent.toCallback()));
        }
    }
    
    /**
     * Create a AppSinkCallbacks proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AppSinkCallbacks(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AppSinkCallbacks> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AppSinkCallbacks(input);
    
    /**
     * A {@link AppSinkCallbacks.Builder} object constructs a {@link AppSinkCallbacks} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AppSinkCallbacks.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AppSinkCallbacks struct;
        
        private Builder() {
            struct = AppSinkCallbacks.allocate();
        }
        
        /**
         * Finish building the {@link AppSinkCallbacks} struct.
         * @return A new instance of {@code AppSinkCallbacks} with the fields 
         *         that were set in the Builder object.
         */
        public AppSinkCallbacks build() {
            return struct;
        }
        
        public Builder setEos(EosCallback eos) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("eos"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (eos == null ? MemoryAddress.NULL : eos.toCallback()));
                return this;
            }
        }
        
        public Builder setNewPreroll(NewPrerollCallback newPreroll) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("new_preroll"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (newPreroll == null ? MemoryAddress.NULL : newPreroll.toCallback()));
                return this;
            }
        }
        
        public Builder setNewSample(NewSampleCallback newSample) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("new_sample"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (newSample == null ? MemoryAddress.NULL : newSample.toCallback()));
                return this;
            }
        }
        
        public Builder setNewEvent(NewEventCallback newEvent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("new_event"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (newEvent == null ? MemoryAddress.NULL : newEvent.toCallback()));
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
