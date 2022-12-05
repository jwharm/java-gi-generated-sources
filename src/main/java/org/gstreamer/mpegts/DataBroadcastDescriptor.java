package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DataBroadcastDescriptor extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDataBroadcastDescriptor";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_SHORT.withName("data_broadcast_id"),
        Interop.valueLayout.C_BYTE.withName("component_tag"),
        Interop.valueLayout.C_BYTE.withName("length"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("selector_bytes"),
        Interop.valueLayout.ADDRESS.withName("language_code"),
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
     * Allocate a new {@link DataBroadcastDescriptor}
     * @return A new, uninitialized @{link DataBroadcastDescriptor}
     */
    public static DataBroadcastDescriptor allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DataBroadcastDescriptor newInstance = new DataBroadcastDescriptor(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code data_broadcast_id}
     * @return The value of the field {@code data_broadcast_id}
     */
    public short dataBroadcastId$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data_broadcast_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code data_broadcast_id}
     * @param dataBroadcastId The new value of the field {@code data_broadcast_id}
     */
    public void dataBroadcastId$set(short dataBroadcastId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data_broadcast_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), dataBroadcastId);
    }
    
    /**
     * Get the value of the field {@code component_tag}
     * @return The value of the field {@code component_tag}
     */
    public byte componentTag$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("component_tag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code component_tag}
     * @param componentTag The new value of the field {@code component_tag}
     */
    public void componentTag$set(byte componentTag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("component_tag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), componentTag);
    }
    
    /**
     * Get the value of the field {@code length}
     * @return The value of the field {@code length}
     */
    public byte length$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("length"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code length}
     * @param length The new value of the field {@code length}
     */
    public void length$set(byte length) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("length"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), length);
    }
    
    /**
     * Get the value of the field {@code selector_bytes}
     * @return The value of the field {@code selector_bytes}
     */
    public PointerByte selectorBytes$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("selector_bytes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerByte(RESULT);
    }
    
    /**
     * Change the value of the field {@code selector_bytes}
     * @param selectorBytes The new value of the field {@code selector_bytes}
     */
    public void selectorBytes$set(PointerByte selectorBytes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("selector_bytes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), selectorBytes.handle());
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
     * Create a DataBroadcastDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DataBroadcastDescriptor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    public void free() {
        try {
            DowncallHandles.gst_mpegts_dvb_data_broadcast_descriptor_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_dvb_data_broadcast_descriptor_free = Interop.downcallHandle(
            "gst_mpegts_dvb_data_broadcast_descriptor_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DataBroadcastDescriptor struct;
        
         /**
         * A {@link DataBroadcastDescriptor.Build} object constructs a {@link DataBroadcastDescriptor} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DataBroadcastDescriptor.allocate();
        }
        
         /**
         * Finish building the {@link DataBroadcastDescriptor} struct.
         * @return A new instance of {@code DataBroadcastDescriptor} with the fields 
         *         that were set in the Build object.
         */
        public DataBroadcastDescriptor construct() {
            return struct;
        }
        
        /**
         * the data broadcast id
         * @param dataBroadcastId The value for the {@code dataBroadcastId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDataBroadcastId(short dataBroadcastId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data_broadcast_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dataBroadcastId);
            return this;
        }
        
        /**
         * the component tag
         * @param componentTag The value for the {@code componentTag} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setComponentTag(byte componentTag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("component_tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), componentTag);
            return this;
        }
        
        public Build setLength(byte length) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("length"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), length);
            return this;
        }
        
        /**
         * the selector byte field
         * @param selectorBytes The value for the {@code selectorBytes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSelectorBytes(PointerByte selectorBytes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("selector_bytes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (selectorBytes == null ? MemoryAddress.NULL : selectorBytes.handle()));
            return this;
        }
        
        /**
         * language of {@code text}
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
         * description of data broadcast
         * @param text The value for the {@code text} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setText(java.lang.String text) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (text == null ? MemoryAddress.NULL : Interop.allocateNativeString(text)));
            return this;
        }
    }
}
