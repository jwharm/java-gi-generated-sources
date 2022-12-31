package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AudioSinkClassExtension extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioSinkClassExtension";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("clear_all")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AudioSinkClassExtension}
     * @return A new, uninitialized @{link AudioSinkClassExtension}
     */
    public static AudioSinkClassExtension allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioSinkClassExtension newInstance = new AudioSinkClassExtension(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface ClearAllCallback {
        void run(org.gstreamer.audio.AudioSink sink);

        @ApiStatus.Internal default void upcall(MemoryAddress sink) {
            run((org.gstreamer.audio.AudioSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.audio.AudioSink.fromAddress).marshal(sink, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ClearAllCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code clear_all}
     * @param clearAll The new value of the field {@code clear_all}
     */
    public void setClearAll(ClearAllCallback clearAll) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("clear_all"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clearAll == null ? MemoryAddress.NULL : clearAll.toCallback()));
    }
    
    /**
     * Create a AudioSinkClassExtension proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AudioSinkClassExtension(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioSinkClassExtension> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AudioSinkClassExtension(input, ownership);
    
    /**
     * A {@link AudioSinkClassExtension.Builder} object constructs a {@link AudioSinkClassExtension} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AudioSinkClassExtension.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AudioSinkClassExtension struct;
        
        private Builder() {
            struct = AudioSinkClassExtension.allocate();
        }
        
         /**
         * Finish building the {@link AudioSinkClassExtension} struct.
         * @return A new instance of {@code AudioSinkClassExtension} with the fields 
         *         that were set in the Builder object.
         */
        public AudioSinkClassExtension build() {
            return struct;
        }
        
        public Builder setClearAll(ClearAllCallback clearAll) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("clear_all"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clearAll == null ? MemoryAddress.NULL : clearAll.toCallback()));
            return this;
        }
    }
}
