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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AudioSinkClassExtension newInstance = new AudioSinkClassExtension(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code ClearAllCallback} callback.
     */
    @FunctionalInterface
    public interface ClearAllCallback {
    
        void run(org.gstreamer.audio.AudioSink sink);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sink) {
            run((org.gstreamer.audio.AudioSink) Interop.register(sink, org.gstreamer.audio.AudioSink.fromAddress).marshal(sink, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ClearAllCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code clear_all}
     * @param clearAll The new value of the field {@code clear_all}
     */
    public void setClearAll(ClearAllCallback clearAll) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("clear_all"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (clearAll == null ? MemoryAddress.NULL : clearAll.toCallback()));
        }
    }
    
    /**
     * Create a AudioSinkClassExtension proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioSinkClassExtension(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioSinkClassExtension> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioSinkClassExtension(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("clear_all"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (clearAll == null ? MemoryAddress.NULL : clearAll.toCallback()));
                return this;
            }
        }
    }
}
