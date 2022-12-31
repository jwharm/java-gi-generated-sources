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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioVisualizerClass newInstance = new AudioVisualizerClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface SetupCallback {
        boolean run(org.gstreamer.pbutils.AudioVisualizer scope);

        @ApiStatus.Internal default int upcall(MemoryAddress scope) {
            var RESULT = run((org.gstreamer.pbutils.AudioVisualizer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(scope)), org.gstreamer.pbutils.AudioVisualizer.fromAddress).marshal(scope, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetupCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code setup}
     * @param setup The new value of the field {@code setup}
     */
    public void setSetup(SetupCallback setup) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("setup"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setup == null ? MemoryAddress.NULL : setup.toCallback()));
    }
    
    @FunctionalInterface
    public interface RenderCallback {
        boolean run(org.gstreamer.pbutils.AudioVisualizer scope, org.gstreamer.gst.Buffer audio, org.gstreamer.video.VideoFrame video);

        @ApiStatus.Internal default int upcall(MemoryAddress scope, MemoryAddress audio, MemoryAddress video) {
            var RESULT = run((org.gstreamer.pbutils.AudioVisualizer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(scope)), org.gstreamer.pbutils.AudioVisualizer.fromAddress).marshal(scope, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(audio, Ownership.NONE), org.gstreamer.video.VideoFrame.fromAddress.marshal(video, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RenderCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code render}
     * @param render The new value of the field {@code render}
     */
    public void setRender(RenderCallback render) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("render"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (render == null ? MemoryAddress.NULL : render.toCallback()));
    }
    
    @FunctionalInterface
    public interface DecideAllocationCallback {
        boolean run(org.gstreamer.pbutils.AudioVisualizer scope, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress scope, MemoryAddress query) {
            var RESULT = run((org.gstreamer.pbutils.AudioVisualizer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(scope)), org.gstreamer.pbutils.AudioVisualizer.fromAddress).marshal(scope, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
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
    
    /**
     * Create a AudioVisualizerClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AudioVisualizerClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioVisualizerClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AudioVisualizerClass(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setSetup(SetupCallback setup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("setup"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setup == null ? MemoryAddress.NULL : setup.toCallback()));
            return this;
        }
        
        public Builder setRender(RenderCallback render) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("render"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (render == null ? MemoryAddress.NULL : render.toCallback()));
            return this;
        }
        
        public Builder setDecideAllocation(DecideAllocationCallback decideAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation.toCallback()));
            return this;
        }
    }
}
