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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_BYTE.withName("descriptor_number"),
        Interop.valueLayout.C_BYTE.withName("last_descriptor_number"),
        MemoryLayout.paddingLayout(48),
        Interop.valueLayout.ADDRESS.withName("language_code"),
        Interop.valueLayout.ADDRESS.withName("items"),
        Interop.valueLayout.ADDRESS.withName("text")
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
     * Allocate a new {@link ExtendedEventDescriptor}
     * @return A new, uninitialized @{link ExtendedEventDescriptor}
     */
    public static ExtendedEventDescriptor allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ExtendedEventDescriptor newInstance = new ExtendedEventDescriptor(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code descriptor_number}
     * @return The value of the field {@code descriptor_number}
     */
    public byte descriptorNumber$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("descriptor_number"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code descriptor_number}
     * @param descriptorNumber The new value of the field {@code descriptor_number}
     */
    public void descriptorNumber$set(byte descriptorNumber) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("descriptor_number"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), descriptorNumber);
    }
    
    /**
     * Get the value of the field {@code last_descriptor_number}
     * @return The value of the field {@code last_descriptor_number}
     */
    public byte lastDescriptorNumber$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("last_descriptor_number"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code last_descriptor_number}
     * @param lastDescriptorNumber The new value of the field {@code last_descriptor_number}
     */
    public void lastDescriptorNumber$set(byte lastDescriptorNumber) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("last_descriptor_number"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), lastDescriptorNumber);
    }
    
    /**
     * Get the value of the field {@code language_code}
     * @return The value of the field {@code language_code}
     */
    public java.lang.String languageCode$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code language_code}
     * @param languageCode The new value of the field {@code language_code}
     */
    public void languageCode$set(java.lang.String languageCode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(languageCode));
    }
    
    /**
     * Get the value of the field {@code text}
     * @return The value of the field {@code text}
     */
    public java.lang.String text$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("text"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code text}
     * @param text The new value of the field {@code text}
     */
    public void text$set(java.lang.String text) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("text"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(text));
    }
    
    /**
     * Create a ExtendedEventDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ExtendedEventDescriptor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    public void free() {
        try {
            DowncallHandles.gst_mpegts_extended_event_descriptor_free.invokeExact(
                    handle());
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ExtendedEventDescriptor struct;
        
         /**
         * A {@link ExtendedEventDescriptor.Build} object constructs a {@link ExtendedEventDescriptor} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ExtendedEventDescriptor.allocate();
        }
        
         /**
         * Finish building the {@link ExtendedEventDescriptor} struct.
         * @return A new instance of {@code ExtendedEventDescriptor} with the fields 
         *         that were set in the Build object.
         */
        public ExtendedEventDescriptor construct() {
            return struct;
        }
        
        public Build setDescriptorNumber(byte descriptorNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descriptor_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), descriptorNumber);
            return this;
        }
        
        public Build setLastDescriptorNumber(byte lastDescriptorNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("last_descriptor_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), lastDescriptorNumber);
            return this;
        }
        
        /**
         * NULL terminated language code.
         * @param languageCode The value for the {@code languageCode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLanguageCode(java.lang.String languageCode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (languageCode == null ? MemoryAddress.NULL : Interop.allocateNativeString(languageCode)));
            return this;
        }
        
        /**
         * the {@link ExtendedEventItem}
         * @param items The value for the {@code items} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setItems(org.gstreamer.mpegts.ExtendedEventItem[] items) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("items"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (items == null ? MemoryAddress.NULL : Interop.allocateNativeArray(items, org.gstreamer.mpegts.ExtendedEventItem.getMemoryLayout(), false)));
            return this;
        }
        
        public Build setText(java.lang.String text) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (text == null ? MemoryAddress.NULL : Interop.allocateNativeString(text)));
            return this;
        }
    }
}
