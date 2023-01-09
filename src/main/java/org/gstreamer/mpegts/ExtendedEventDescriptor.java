package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extended Event Descriptor (EN 300 468 v.1.13.1)
 */
public class ExtendedEventDescriptor extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsExtendedEventDescriptor";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("descriptor_number"),
            Interop.valueLayout.C_BYTE.withName("last_descriptor_number"),
            MemoryLayout.paddingLayout(48),
            Interop.valueLayout.ADDRESS.withName("language_code"),
            Interop.valueLayout.ADDRESS.withName("items"),
            Interop.valueLayout.ADDRESS.withName("text")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ExtendedEventDescriptor}
     * @return A new, uninitialized @{link ExtendedEventDescriptor}
     */
    public static ExtendedEventDescriptor allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ExtendedEventDescriptor newInstance = new ExtendedEventDescriptor(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code descriptor_number}
     * @return The value of the field {@code descriptor_number}
     */
    public byte getDescriptorNumber() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descriptor_number"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code descriptor_number}
     * @param descriptorNumber The new value of the field {@code descriptor_number}
     */
    public void setDescriptorNumber(byte descriptorNumber) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descriptor_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), descriptorNumber);
        }
    }
    
    /**
     * Get the value of the field {@code last_descriptor_number}
     * @return The value of the field {@code last_descriptor_number}
     */
    public byte getLastDescriptorNumber() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("last_descriptor_number"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code last_descriptor_number}
     * @param lastDescriptorNumber The new value of the field {@code last_descriptor_number}
     */
    public void setLastDescriptorNumber(byte lastDescriptorNumber) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("last_descriptor_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), lastDescriptorNumber);
        }
    }
    
    /**
     * Get the value of the field {@code language_code}
     * @return The value of the field {@code language_code}
     */
    public java.lang.String getLanguageCode() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code language_code}
     * @param languageCode The new value of the field {@code language_code}
     */
    public void setLanguageCode(java.lang.String languageCode) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (languageCode == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(languageCode, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code items}
     * @return The value of the field {@code items}
     */
    public PointerProxy<org.gstreamer.mpegts.ExtendedEventItem> getItems() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("items"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gstreamer.mpegts.ExtendedEventItem>(RESULT, org.gstreamer.mpegts.ExtendedEventItem.fromAddress);
        }
    }
    
    /**
     * Change the value of the field {@code items}
     * @param items The new value of the field {@code items}
     */
    public void setItems(org.gstreamer.mpegts.ExtendedEventItem[] items) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("items"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (items == null ? MemoryAddress.NULL : Interop.allocateNativeArray(items, org.gstreamer.mpegts.ExtendedEventItem.getMemoryLayout(), false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code text}
     * @return The value of the field {@code text}
     */
    public java.lang.String getText() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("text"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code text}
     * @param text The new value of the field {@code text}
     */
    public void setText(java.lang.String text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("text"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, SCOPE)));
        }
    }
    
    /**
     * Create a ExtendedEventDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ExtendedEventDescriptor(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ExtendedEventDescriptor> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ExtendedEventDescriptor(input);
    
    public void free() {
        try {
            DowncallHandles.gst_mpegts_extended_event_descriptor_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_extended_event_descriptor_free = Interop.downcallHandle(
                "gst_mpegts_extended_event_descriptor_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link ExtendedEventDescriptor.Builder} object constructs a {@link ExtendedEventDescriptor} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ExtendedEventDescriptor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ExtendedEventDescriptor struct;
        
        private Builder() {
            struct = ExtendedEventDescriptor.allocate();
        }
        
        /**
         * Finish building the {@link ExtendedEventDescriptor} struct.
         * @return A new instance of {@code ExtendedEventDescriptor} with the fields 
         *         that were set in the Builder object.
         */
        public ExtendedEventDescriptor build() {
            return struct;
        }
        
        public Builder setDescriptorNumber(byte descriptorNumber) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("descriptor_number"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), descriptorNumber);
                return this;
            }
        }
        
        public Builder setLastDescriptorNumber(byte lastDescriptorNumber) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("last_descriptor_number"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), lastDescriptorNumber);
                return this;
            }
        }
        
        /**
         * NULL terminated language code.
         * @param languageCode The value for the {@code languageCode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLanguageCode(java.lang.String languageCode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (languageCode == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(languageCode, SCOPE)));
                return this;
            }
        }
        
        /**
         * the {@link ExtendedEventItem}
         * @param items The value for the {@code items} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setItems(org.gstreamer.mpegts.ExtendedEventItem[] items) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("items"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (items == null ? MemoryAddress.NULL : Interop.allocateNativeArray(items, org.gstreamer.mpegts.ExtendedEventItem.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
        
        public Builder setText(java.lang.String text) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("text"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, SCOPE)));
                return this;
            }
        }
    }
}
