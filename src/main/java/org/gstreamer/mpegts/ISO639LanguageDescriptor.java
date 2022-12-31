package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ISO639LanguageDescriptor extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsISO639LanguageDescriptor";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("nb_language"),
            MemoryLayout.paddingLayout(4064),
            MemoryLayout.sequenceLayout(64, Interop.valueLayout.ADDRESS).withName("language"),
            MemoryLayout.sequenceLayout(64, Interop.valueLayout.C_INT).withName("audio_type")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ISO639LanguageDescriptor}
     * @return A new, uninitialized @{link ISO639LanguageDescriptor}
     */
    public static ISO639LanguageDescriptor allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ISO639LanguageDescriptor newInstance = new ISO639LanguageDescriptor(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code nb_language}
     * @return The value of the field {@code nb_language}
     */
    public int getNbLanguage() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nb_language"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code nb_language}
     * @param nbLanguage The new value of the field {@code nb_language}
     */
    public void setNbLanguage(int nbLanguage) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nb_language"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nbLanguage);
    }
    
    /**
     * Get the value of the field {@code language}
     * @return The value of the field {@code language}
     */
    public java.lang.String[] getLanguage() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("language"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringArrayFrom(RESULT, 64);
    }
    
    /**
     * Change the value of the field {@code language}
     * @param language The new value of the field {@code language}
     */
    public void setLanguage(java.lang.String[] language) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("language"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (language == null ? MemoryAddress.NULL : Interop.allocateNativeArray(language, false)));
    }
    
    /**
     * Get the value of the field {@code audio_type}
     * @return The value of the field {@code audio_type}
     */
    public org.gstreamer.mpegts.Iso639AudioType[] getAudioType() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("audio_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerEnumeration<org.gstreamer.mpegts.Iso639AudioType>(RESULT, org.gstreamer.mpegts.Iso639AudioType::of).toArray((int) 64, org.gstreamer.mpegts.Iso639AudioType.class);
    }
    
    /**
     * Change the value of the field {@code audio_type}
     * @param audioType The new value of the field {@code audio_type}
     */
    public void setAudioType(org.gstreamer.mpegts.Iso639AudioType[] audioType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("audio_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (audioType == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Enumeration.getValues(audioType), false)));
    }
    
    /**
     * Create a ISO639LanguageDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ISO639LanguageDescriptor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ISO639LanguageDescriptor> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ISO639LanguageDescriptor(input, ownership);
    
    public void descriptorFree() {
        try {
            DowncallHandles.gst_mpegts_iso_639_language_descriptor_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_iso_639_language_descriptor_free = Interop.downcallHandle(
            "gst_mpegts_iso_639_language_descriptor_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link ISO639LanguageDescriptor.Builder} object constructs a {@link ISO639LanguageDescriptor} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ISO639LanguageDescriptor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ISO639LanguageDescriptor struct;
        
        private Builder() {
            struct = ISO639LanguageDescriptor.allocate();
        }
        
         /**
         * Finish building the {@link ISO639LanguageDescriptor} struct.
         * @return A new instance of {@code ISO639LanguageDescriptor} with the fields 
         *         that were set in the Builder object.
         */
        public ISO639LanguageDescriptor build() {
            return struct;
        }
        
        public Builder setNbLanguage(int nbLanguage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nb_language"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nbLanguage);
            return this;
        }
        
        public Builder setLanguage(java.lang.String[] language) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (language == null ? MemoryAddress.NULL : Interop.allocateNativeArray(language, false)));
            return this;
        }
        
        public Builder setAudioType(org.gstreamer.mpegts.Iso639AudioType[] audioType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("audio_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (audioType == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Enumeration.getValues(audioType), false)));
            return this;
        }
    }
}
