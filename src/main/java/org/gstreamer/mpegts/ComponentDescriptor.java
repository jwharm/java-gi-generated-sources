package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ComponentDescriptor extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsComponentDescriptor";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("stream_content"),
            Interop.valueLayout.C_BYTE.withName("component_type"),
            Interop.valueLayout.C_BYTE.withName("component_tag"),
            MemoryLayout.paddingLayout(40),
            Interop.valueLayout.ADDRESS.withName("language_code"),
            Interop.valueLayout.ADDRESS.withName("text")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ComponentDescriptor}
     * @return A new, uninitialized @{link ComponentDescriptor}
     */
    public static ComponentDescriptor allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ComponentDescriptor newInstance = new ComponentDescriptor(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code stream_content}
     * @return The value of the field {@code stream_content}
     */
    public byte getStreamContent() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stream_content"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code stream_content}
     * @param streamContent The new value of the field {@code stream_content}
     */
    public void setStreamContent(byte streamContent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stream_content"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), streamContent);
    }
    
    /**
     * Get the value of the field {@code component_type}
     * @return The value of the field {@code component_type}
     */
    public byte getComponentType() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("component_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code component_type}
     * @param componentType The new value of the field {@code component_type}
     */
    public void setComponentType(byte componentType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("component_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), componentType);
    }
    
    /**
     * Get the value of the field {@code component_tag}
     * @return The value of the field {@code component_tag}
     */
    public byte getComponentTag() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("component_tag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code component_tag}
     * @param componentTag The new value of the field {@code component_tag}
     */
    public void setComponentTag(byte componentTag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("component_tag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), componentTag);
    }
    
    /**
     * Get the value of the field {@code language_code}
     * @return The value of the field {@code language_code}
     */
    public java.lang.String getLanguageCode() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code language_code}
     * @param languageCode The new value of the field {@code language_code}
     */
    public void setLanguageCode(java.lang.String languageCode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (languageCode == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(languageCode, null)));
    }
    
    /**
     * Get the value of the field {@code text}
     * @return The value of the field {@code text}
     */
    public java.lang.String getText() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("text"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code text}
     * @param text The new value of the field {@code text}
     */
    public void setText(java.lang.String text) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("text"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, null)));
    }
    
    /**
     * Create a ComponentDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ComponentDescriptor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ComponentDescriptor> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ComponentDescriptor(input, ownership);
    
    /**
     * A {@link ComponentDescriptor.Builder} object constructs a {@link ComponentDescriptor} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ComponentDescriptor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ComponentDescriptor struct;
        
        private Builder() {
            struct = ComponentDescriptor.allocate();
        }
        
         /**
         * Finish building the {@link ComponentDescriptor} struct.
         * @return A new instance of {@code ComponentDescriptor} with the fields 
         *         that were set in the Builder object.
         */
        public ComponentDescriptor build() {
            return struct;
        }
        
        public Builder setStreamContent(byte streamContent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stream_content"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), streamContent);
            return this;
        }
        
        public Builder setComponentType(byte componentType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("component_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), componentType);
            return this;
        }
        
        public Builder setComponentTag(byte componentTag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("component_tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), componentTag);
            return this;
        }
        
        public Builder setLanguageCode(java.lang.String languageCode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (languageCode == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(languageCode, null)));
            return this;
        }
        
        public Builder setText(java.lang.String text) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, null)));
            return this;
        }
    }
}
