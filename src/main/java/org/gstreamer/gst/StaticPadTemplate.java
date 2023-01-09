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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("name_template"),
            Interop.valueLayout.C_INT.withName("direction"),
            Interop.valueLayout.C_INT.withName("presence"),
            org.gstreamer.gst.StaticCaps.getMemoryLayout().withName("static_caps")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link StaticPadTemplate}
     * @return A new, uninitialized @{link StaticPadTemplate}
     */
    public static StaticPadTemplate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        StaticPadTemplate newInstance = new StaticPadTemplate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code name_template}
     * @return The value of the field {@code name_template}
     */
    public java.lang.String getNameTemplate() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name_template"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code name_template}
     * @param nameTemplate The new value of the field {@code name_template}
     */
    public void setNameTemplate(java.lang.String nameTemplate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name_template"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (nameTemplate == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(nameTemplate, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code direction}
     * @return The value of the field {@code direction}
     */
    public org.gstreamer.gst.PadDirection getDirection() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("direction"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.gst.PadDirection.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code direction}
     * @param direction The new value of the field {@code direction}
     */
    public void setDirection(org.gstreamer.gst.PadDirection direction) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("direction"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (direction == null ? MemoryAddress.NULL : direction.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code presence}
     * @return The value of the field {@code presence}
     */
    public org.gstreamer.gst.PadPresence getPresence() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("presence"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.gst.PadPresence.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code presence}
     * @param presence The new value of the field {@code presence}
     */
    public void setPresence(org.gstreamer.gst.PadPresence presence) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("presence"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (presence == null ? MemoryAddress.NULL : presence.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code static_caps}
     * @return The value of the field {@code static_caps}
     */
    public org.gstreamer.gst.StaticCaps getStaticCaps() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("static_caps"));
        return org.gstreamer.gst.StaticCaps.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code static_caps}
     * @param staticCaps The new value of the field {@code static_caps}
     */
    public void setStaticCaps(org.gstreamer.gst.StaticCaps staticCaps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("static_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (staticCaps == null ? MemoryAddress.NULL : staticCaps.handle()));
        }
    }
    
    /**
     * Create a StaticPadTemplate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected StaticPadTemplate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, StaticPadTemplate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new StaticPadTemplate(input);
    
    /**
     * Converts a {@link StaticPadTemplate} into a {@link PadTemplate}.
     * @return a new {@link PadTemplate}.
     */
    public @Nullable org.gstreamer.gst.PadTemplate get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_static_pad_template_get.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.PadTemplate) Interop.register(RESULT, org.gstreamer.gst.PadTemplate.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the capabilities of the static pad template.
     * @return the {@link Caps} of the static pad template.
     * Unref after usage. Since the core holds an additional
     * ref to the returned caps, use gst_caps_make_writable()
     * on the returned caps to modify it.
     */
    public org.gstreamer.gst.Caps getCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_static_pad_template_get_caps.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
     * A {@link StaticPadTemplate.Builder} object constructs a {@link StaticPadTemplate} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link StaticPadTemplate.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final StaticPadTemplate struct;
        
        private Builder() {
            struct = StaticPadTemplate.allocate();
        }
        
        /**
         * Finish building the {@link StaticPadTemplate} struct.
         * @return A new instance of {@code StaticPadTemplate} with the fields 
         *         that were set in the Builder object.
         */
        public StaticPadTemplate build() {
            return struct;
        }
        
        /**
         * the name of the template
         * @param nameTemplate The value for the {@code nameTemplate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNameTemplate(java.lang.String nameTemplate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("name_template"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (nameTemplate == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(nameTemplate, SCOPE)));
                return this;
            }
        }
        
        /**
         * the direction of the template
         * @param direction The value for the {@code direction} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDirection(org.gstreamer.gst.PadDirection direction) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("direction"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (direction == null ? MemoryAddress.NULL : direction.getValue()));
                return this;
            }
        }
        
        /**
         * the presence of the template
         * @param presence The value for the {@code presence} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPresence(org.gstreamer.gst.PadPresence presence) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("presence"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (presence == null ? MemoryAddress.NULL : presence.getValue()));
                return this;
            }
        }
        
        /**
         * the caps of the template.
         * @param staticCaps The value for the {@code staticCaps} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStaticCaps(org.gstreamer.gst.StaticCaps staticCaps) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("static_caps"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (staticCaps == null ? MemoryAddress.NULL : staticCaps.handle()));
                return this;
            }
        }
    }
}
