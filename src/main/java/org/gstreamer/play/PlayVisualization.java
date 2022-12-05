package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link PlayVisualization} descriptor.
 * @version 1.20
 */
public class PlayVisualization extends Struct {
    
    static {
        GstPlay.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayVisualization";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("name"),
        Interop.valueLayout.ADDRESS.withName("description")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PlayVisualization}
     * @return A new, uninitialized @{link PlayVisualization}
     */
    public static PlayVisualization allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PlayVisualization newInstance = new PlayVisualization(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void name$set(java.lang.String name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(name));
    }
    
    /**
     * Get the value of the field {@code description}
     * @return The value of the field {@code description}
     */
    public java.lang.String description$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code description}
     * @param description The new value of the field {@code description}
     */
    public void description$set(java.lang.String description) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(description));
    }
    
    /**
     * Create a PlayVisualization proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PlayVisualization(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Makes a copy of the {@link PlayVisualization}. The result must be
     * freed using gst_play_visualization_free().
     * @return an allocated copy of {@code vis}.
     */
    public @NotNull org.gstreamer.play.PlayVisualization copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_visualization_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.play.PlayVisualization(RESULT, Ownership.FULL);
    }
    
    /**
     * Frees a {@link PlayVisualization}.
     */
    public void free() {
        try {
            DowncallHandles.gst_play_visualization_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_play_visualization_copy = Interop.downcallHandle(
            "gst_play_visualization_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_visualization_free = Interop.downcallHandle(
            "gst_play_visualization_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PlayVisualization struct;
        
         /**
         * A {@link PlayVisualization.Build} object constructs a {@link PlayVisualization} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PlayVisualization.allocate();
        }
        
         /**
         * Finish building the {@link PlayVisualization} struct.
         * @return A new instance of {@code PlayVisualization} with the fields 
         *         that were set in the Build object.
         */
        public PlayVisualization construct() {
            return struct;
        }
        
        /**
         * name of the visualization.
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
            return this;
        }
        
        /**
         * description of the visualization.
         * @param description The value for the {@code description} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDescription(java.lang.String description) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("description"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (description == null ? MemoryAddress.NULL : Interop.allocateNativeString(description)));
            return this;
        }
    }
}
