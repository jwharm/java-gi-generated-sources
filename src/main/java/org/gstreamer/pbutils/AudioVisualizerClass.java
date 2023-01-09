package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AudioVisualizerClass extends Struct {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioVisualizerClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("setup"),
            Interop.valueLayout.ADDRESS.withName("render"),
            Interop.valueLayout.ADDRESS.withName("decide_allocation")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AudioVisualizerClass}
     * @return A new, uninitialized @{link AudioVisualizerClass}
     */
    public static AudioVisualizerClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AudioVisualizerClass newInstance = new AudioVisualizerClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code SetupCallback} callback.
     */
    @FunctionalInterface
    public interface SetupCallback {
    
        boolean run(org.gstreamer.pbutils.AudioVisualizer scope);
        
        @ApiStatus.Internal default int upcall(MemoryAddress scope) {
            var RESULT = run((org.gstreamer.pbutils.AudioVisualizer) Interop.register(scope, org.gstreamer.pbutils.AudioVisualizer.fromAddress).marshal(scope, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetupCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code setup}
     * @param setup The new value of the field {@code setup}
     */
    public void setSetup(SetupCallback setup) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("setup"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setup == null ? MemoryAddress.NULL : setup.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RenderCallback} callback.
     */
    @FunctionalInterface
    public interface RenderCallback {
    
        boolean run(org.gstreamer.pbutils.AudioVisualizer scope, org.gstreamer.gst.Buffer audio, org.gstreamer.video.VideoFrame video);
        
        @ApiStatus.Internal default int upcall(MemoryAddress scope, MemoryAddress audio, MemoryAddress video) {
            var RESULT = run((org.gstreamer.pbutils.AudioVisualizer) Interop.register(scope, org.gstreamer.pbutils.AudioVisualizer.fromAddress).marshal(scope, null), org.gstreamer.gst.Buffer.fromAddress.marshal(audio, null), org.gstreamer.video.VideoFrame.fromAddress.marshal(video, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RenderCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code render}
     * @param render The new value of the field {@code render}
     */
    public void setRender(RenderCallback render) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("render"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (render == null ? MemoryAddress.NULL : render.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DecideAllocationCallback} callback.
     */
    @FunctionalInterface
    public interface DecideAllocationCallback {
    
        boolean run(org.gstreamer.pbutils.AudioVisualizer scope, org.gstreamer.gst.Query query);
        
        @ApiStatus.Internal default int upcall(MemoryAddress scope, MemoryAddress query) {
            var RESULT = run((org.gstreamer.pbutils.AudioVisualizer) Interop.register(scope, org.gstreamer.pbutils.AudioVisualizer.fromAddress).marshal(scope, null), org.gstreamer.gst.Query.fromAddress.marshal(query, null));
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
     * Create a AudioVisualizerClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioVisualizerClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioVisualizerClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioVisualizerClass(input);
    
    /**
     * A {@link AudioVisualizerClass.Builder} object constructs a {@link AudioVisualizerClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AudioVisualizerClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AudioVisualizerClass struct;
        
        private Builder() {
            struct = AudioVisualizerClass.allocate();
        }
        
        /**
         * Finish building the {@link AudioVisualizerClass} struct.
         * @return A new instance of {@code AudioVisualizerClass} with the fields 
         *         that were set in the Builder object.
         */
        public AudioVisualizerClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.gst.ElementClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setSetup(SetupCallback setup) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("setup"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setup == null ? MemoryAddress.NULL : setup.toCallback()));
                return this;
            }
        }
        
        public Builder setRender(RenderCallback render) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("render"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (render == null ? MemoryAddress.NULL : render.toCallback()));
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
    }
}
