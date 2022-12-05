package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link PlayerVisualization} descriptor.
 */
public class PlayerVisualization extends Struct {
    
    static {
        GstPlayer.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayerVisualization";
    
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
     * Allocate a new {@link PlayerVisualization}
     * @return A new, uninitialized @{link PlayerVisualization}
     */
    public static PlayerVisualization allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PlayerVisualization newInstance = new PlayerVisualization(segment.address(), Ownership.NONE);
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
     * Create a PlayerVisualization proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PlayerVisualization(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Makes a copy of the {@link PlayerVisualization}. The result must be
     * freed using gst_player_visualization_free().
     * @return an allocated copy of {@code vis}.
     */
    public @NotNull org.gstreamer.player.PlayerVisualization copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_visualization_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.player.PlayerVisualization(RESULT, Ownership.FULL);
    }
    
    /**
     * Frees a {@link PlayerVisualization}.
     */
    public void free() {
        try {
            DowncallHandles.gst_player_visualization_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_player_visualization_copy = Interop.downcallHandle(
            "gst_player_visualization_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_visualization_free = Interop.downcallHandle(
            "gst_player_visualization_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PlayerVisualization struct;
        
         /**
         * A {@link PlayerVisualization.Build} object constructs a {@link PlayerVisualization} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PlayerVisualization.allocate();
        }
        
         /**
         * Finish building the {@link PlayerVisualization} struct.
         * @return A new instance of {@code PlayerVisualization} with the fields 
         *         that were set in the Build object.
         */
        public PlayerVisualization construct() {
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
