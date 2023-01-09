package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the struct that describes the categories. Once initialized with
 * {@code GST_DEBUG_CATEGORY_INIT}, its values can't be changed anymore.
 */
public class DebugCategory extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDebugCategory";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("threshold"),
            Interop.valueLayout.C_INT.withName("color"),
            Interop.valueLayout.ADDRESS.withName("name"),
            Interop.valueLayout.ADDRESS.withName("description")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DebugCategory}
     * @return A new, uninitialized @{link DebugCategory}
     */
    public static DebugCategory allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DebugCategory newInstance = new DebugCategory(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DebugCategory proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DebugCategory(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DebugCategory> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DebugCategory(input);
    
    /**
     * Removes and frees the category and all associated resources.
     * @deprecated This function can easily cause memory corruption, don't use it.
     */
    @Deprecated
    public void free() {
        try {
            DowncallHandles.gst_debug_category_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the color of a debug category used when printing output in this
     * category.
     * @return the color of the category.
     */
    public int getColor() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_debug_category_get_color.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the description of a debug category.
     * @return the description of the category.
     */
    public java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_debug_category_get_description.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the name of a debug category.
     * @return the name of the category.
     */
    public java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_debug_category_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the threshold of a {@link DebugCategory}.
     * @return the {@link DebugLevel} that is used as threshold.
     */
    public org.gstreamer.gst.DebugLevel getThreshold() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_debug_category_get_threshold.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.DebugLevel.of(RESULT);
    }
    
    /**
     * Resets the threshold of the category to the default level. Debug information
     * will only be output if the threshold is lower or equal to the level of the
     * debugging message.
     * Use this function to set the threshold back to where it was after using
     * gst_debug_category_set_threshold().
     */
    public void resetThreshold() {
        try {
            DowncallHandles.gst_debug_category_reset_threshold.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the threshold of the category to the given level. Debug information will
     * only be output if the threshold is lower or equal to the level of the
     * debugging message.
     * <blockquote>
     *  Do not use this function in production code, because other functions may
     *  change the threshold of categories as side effect. It is however a nice
     *  function to use when debugging (even from gdb).
     * </blockquote>
     * @param level the {@link DebugLevel} threshold to set.
     */
    public void setThreshold(org.gstreamer.gst.DebugLevel level) {
        try {
            DowncallHandles.gst_debug_category_set_threshold.invokeExact(
                    handle(),
                    level.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_debug_category_free = Interop.downcallHandle(
                "gst_debug_category_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_debug_category_get_color = Interop.downcallHandle(
                "gst_debug_category_get_color",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_debug_category_get_description = Interop.downcallHandle(
                "gst_debug_category_get_description",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_debug_category_get_name = Interop.downcallHandle(
                "gst_debug_category_get_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_debug_category_get_threshold = Interop.downcallHandle(
                "gst_debug_category_get_threshold",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_debug_category_reset_threshold = Interop.downcallHandle(
                "gst_debug_category_reset_threshold",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_debug_category_set_threshold = Interop.downcallHandle(
                "gst_debug_category_set_threshold",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
    }
    
    /**
     * A {@link DebugCategory.Builder} object constructs a {@link DebugCategory} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DebugCategory.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DebugCategory struct;
        
        private Builder() {
            struct = DebugCategory.allocate();
        }
        
        /**
         * Finish building the {@link DebugCategory} struct.
         * @return A new instance of {@code DebugCategory} with the fields 
         *         that were set in the Builder object.
         */
        public DebugCategory build() {
            return struct;
        }
        
        public Builder setThreshold(int threshold) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("threshold"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), threshold);
                return this;
            }
        }
        
        public Builder setColor(int color) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("color"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), color);
                return this;
            }
        }
        
        public Builder setName(java.lang.String name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
                return this;
            }
        }
        
        public Builder setDescription(java.lang.String description) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("description"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (description == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(description, SCOPE)));
                return this;
            }
        }
    }
}
