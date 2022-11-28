package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure describing the {@link StaticPadTemplate}.
 */
public class StaticPadTemplate extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstStaticPadTemplate";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("name_template"),
        Interop.valueLayout.C_INT.withName("direction"),
        Interop.valueLayout.C_INT.withName("presence"),
        org.gstreamer.gst.StaticCaps.getMemoryLayout().withName("static_caps")
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
     * Allocate a new {@link StaticPadTemplate}
     * @return A new, uninitialized @{link StaticPadTemplate}
     */
    public static StaticPadTemplate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        StaticPadTemplate newInstance = new StaticPadTemplate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code name_template}
     * @return The value of the field {@code name_template}
     */
    public java.lang.String nameTemplate$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name_template"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code name_template}
     * @param nameTemplate The new value of the field {@code name_template}
     */
    public void nameTemplate$set(java.lang.String nameTemplate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name_template"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(nameTemplate));
    }
    
    /**
     * Get the value of the field {@code direction}
     * @return The value of the field {@code direction}
     */
    public org.gstreamer.gst.PadDirection direction$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("direction"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.PadDirection(RESULT);
    }
    
    /**
     * Change the value of the field {@code direction}
     * @param direction The new value of the field {@code direction}
     */
    public void direction$set(org.gstreamer.gst.PadDirection direction) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("direction"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), direction.getValue());
    }
    
    /**
     * Get the value of the field {@code presence}
     * @return The value of the field {@code presence}
     */
    public org.gstreamer.gst.PadPresence presence$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("presence"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.PadPresence(RESULT);
    }
    
    /**
     * Change the value of the field {@code presence}
     * @param presence The new value of the field {@code presence}
     */
    public void presence$set(org.gstreamer.gst.PadPresence presence) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("presence"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), presence.getValue());
    }
    
    /**
     * Get the value of the field {@code static_caps}
     * @return The value of the field {@code static_caps}
     */
    public org.gstreamer.gst.StaticCaps staticCaps$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("static_caps"));
        return new org.gstreamer.gst.StaticCaps(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a StaticPadTemplate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public StaticPadTemplate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Converts a {@link StaticPadTemplate} into a {@link PadTemplate}.
     * @return a new {@link PadTemplate}.
     */
    public @Nullable org.gstreamer.gst.PadTemplate get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_static_pad_template_get.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.PadTemplate(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the capabilities of the static pad template.
     * @return the {@link Caps} of the static pad template.
     * Unref after usage. Since the core holds an additional
     * ref to the returned caps, use gst_caps_make_writable()
     * on the returned caps to modify it.
     */
    public @NotNull org.gstreamer.gst.Caps getCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_static_pad_template_get_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_static_pad_template_get = Interop.downcallHandle(
            "gst_static_pad_template_get",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_static_pad_template_get_caps = Interop.downcallHandle(
            "gst_static_pad_template_get_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private StaticPadTemplate struct;
        
         /**
         * A {@link StaticPadTemplate.Build} object constructs a {@link StaticPadTemplate} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = StaticPadTemplate.allocate();
        }
        
         /**
         * Finish building the {@link StaticPadTemplate} struct.
         * @return A new instance of {@code StaticPadTemplate} with the fields 
         *         that were set in the Build object.
         */
        public StaticPadTemplate construct() {
            return struct;
        }
        
        /**
         * the name of the template
         * @param nameTemplate The value for the {@code nameTemplate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNameTemplate(java.lang.String nameTemplate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name_template"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nameTemplate == null ? MemoryAddress.NULL : Interop.allocateNativeString(nameTemplate)));
            return this;
        }
        
        /**
         * the direction of the template
         * @param direction The value for the {@code direction} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDirection(org.gstreamer.gst.PadDirection direction) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("direction"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (direction == null ? MemoryAddress.NULL : direction.getValue()));
            return this;
        }
        
        /**
         * the presence of the template
         * @param presence The value for the {@code presence} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPresence(org.gstreamer.gst.PadPresence presence) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("presence"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (presence == null ? MemoryAddress.NULL : presence.getValue()));
            return this;
        }
        
        /**
         * the caps of the template.
         * @param staticCaps The value for the {@code staticCaps} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStaticCaps(org.gstreamer.gst.StaticCaps staticCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("static_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (staticCaps == null ? MemoryAddress.NULL : staticCaps.handle()));
            return this;
        }
    }
}
