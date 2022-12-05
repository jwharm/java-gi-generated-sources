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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_BYTE.withName("stream_content"),
        Interop.valueLayout.C_BYTE.withName("component_type"),
        Interop.valueLayout.C_BYTE.withName("component_tag"),
        MemoryLayout.paddingLayout(40),
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
    public byte streamContent$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stream_content"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code stream_content}
     * @param streamContent The new value of the field {@code stream_content}
     */
    public void streamContent$set(byte streamContent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stream_content"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), streamContent);
    }
    
    /**
     * Get the value of the field {@code component_type}
     * @return The value of the field {@code component_type}
     */
    public byte componentType$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("component_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code component_type}
     * @param componentType The new value of the field {@code component_type}
     */
    public void componentType$set(byte componentType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("component_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), componentType);
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
     * Create a ComponentDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ComponentDescriptor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ComponentDescriptor struct;
        
         /**
         * A {@link ComponentDescriptor.Build} object constructs a {@link ComponentDescriptor} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ComponentDescriptor.allocate();
        }
        
         /**
         * Finish building the {@link ComponentDescriptor} struct.
         * @return A new instance of {@code ComponentDescriptor} with the fields 
         *         that were set in the Build object.
         */
        public ComponentDescriptor construct() {
            return struct;
        }
        
        public Build setStreamContent(byte streamContent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stream_content"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), streamContent);
            return this;
        }
        
        public Build setComponentType(byte componentType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("component_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), componentType);
            return this;
        }
        
        public Build setComponentTag(byte componentTag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("component_tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), componentTag);
            return this;
        }
        
        public Build setLanguageCode(java.lang.String languageCode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (languageCode == null ? MemoryAddress.NULL : Interop.allocateNativeString(languageCode)));
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
