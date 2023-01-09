package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Table 110: Audio Preselection Descriptor (ETSI EN 300 468 v1.16.1)
 * @version 1.20
 */
public class AudioPreselectionDescriptor extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAudioPreselectionDescriptor";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("preselection_id"),
            Interop.valueLayout.C_BYTE.withName("audio_rendering_indication"),
            MemoryLayout.paddingLayout(16),
            Interop.valueLayout.C_INT.withName("audio_description"),
            Interop.valueLayout.C_INT.withName("spoken_subtitles"),
            Interop.valueLayout.C_INT.withName("dialogue_enhancement"),
            Interop.valueLayout.C_INT.withName("interactivity_enabled"),
            Interop.valueLayout.C_INT.withName("language_code_present"),
            Interop.valueLayout.C_INT.withName("text_label_present"),
            Interop.valueLayout.C_INT.withName("multi_stream_info_present"),
            Interop.valueLayout.C_INT.withName("future_extension"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("language_code"),
            Interop.valueLayout.C_BYTE.withName("message_id")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AudioPreselectionDescriptor}
     * @return A new, uninitialized @{link AudioPreselectionDescriptor}
     */
    public static AudioPreselectionDescriptor allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AudioPreselectionDescriptor newInstance = new AudioPreselectionDescriptor(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code preselection_id}
     * @return The value of the field {@code preselection_id}
     */
    public byte getPreselectionId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("preselection_id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code preselection_id}
     * @param preselectionId The new value of the field {@code preselection_id}
     */
    public void setPreselectionId(byte preselectionId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("preselection_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), preselectionId);
        }
    }
    
    /**
     * Get the value of the field {@code audio_rendering_indication}
     * @return The value of the field {@code audio_rendering_indication}
     */
    public byte getAudioRenderingIndication() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("audio_rendering_indication"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code audio_rendering_indication}
     * @param audioRenderingIndication The new value of the field {@code audio_rendering_indication}
     */
    public void setAudioRenderingIndication(byte audioRenderingIndication) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("audio_rendering_indication"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), audioRenderingIndication);
        }
    }
    
    /**
     * Get the value of the field {@code audio_description}
     * @return The value of the field {@code audio_description}
     */
    public boolean getAudioDescription() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("audio_description"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code audio_description}
     * @param audioDescription The new value of the field {@code audio_description}
     */
    public void setAudioDescription(boolean audioDescription) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("audio_description"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(audioDescription, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code spoken_subtitles}
     * @return The value of the field {@code spoken_subtitles}
     */
    public boolean getSpokenSubtitles() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("spoken_subtitles"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code spoken_subtitles}
     * @param spokenSubtitles The new value of the field {@code spoken_subtitles}
     */
    public void setSpokenSubtitles(boolean spokenSubtitles) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("spoken_subtitles"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(spokenSubtitles, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code dialogue_enhancement}
     * @return The value of the field {@code dialogue_enhancement}
     */
    public boolean getDialogueEnhancement() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dialogue_enhancement"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code dialogue_enhancement}
     * @param dialogueEnhancement The new value of the field {@code dialogue_enhancement}
     */
    public void setDialogueEnhancement(boolean dialogueEnhancement) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dialogue_enhancement"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(dialogueEnhancement, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code interactivity_enabled}
     * @return The value of the field {@code interactivity_enabled}
     */
    public boolean getInteractivityEnabled() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interactivity_enabled"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code interactivity_enabled}
     * @param interactivityEnabled The new value of the field {@code interactivity_enabled}
     */
    public void setInteractivityEnabled(boolean interactivityEnabled) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interactivity_enabled"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(interactivityEnabled, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code language_code_present}
     * @return The value of the field {@code language_code_present}
     */
    public boolean getLanguageCodePresent() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language_code_present"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code language_code_present}
     * @param languageCodePresent The new value of the field {@code language_code_present}
     */
    public void setLanguageCodePresent(boolean languageCodePresent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language_code_present"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(languageCodePresent, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code text_label_present}
     * @return The value of the field {@code text_label_present}
     */
    public boolean getTextLabelPresent() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("text_label_present"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code text_label_present}
     * @param textLabelPresent The new value of the field {@code text_label_present}
     */
    public void setTextLabelPresent(boolean textLabelPresent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("text_label_present"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(textLabelPresent, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code multi_stream_info_present}
     * @return The value of the field {@code multi_stream_info_present}
     */
    public boolean getMultiStreamInfoPresent() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("multi_stream_info_present"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code multi_stream_info_present}
     * @param multiStreamInfoPresent The new value of the field {@code multi_stream_info_present}
     */
    public void setMultiStreamInfoPresent(boolean multiStreamInfoPresent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("multi_stream_info_present"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(multiStreamInfoPresent, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code future_extension}
     * @return The value of the field {@code future_extension}
     */
    public boolean getFutureExtension() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("future_extension"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code future_extension}
     * @param futureExtension The new value of the field {@code future_extension}
     */
    public void setFutureExtension(boolean futureExtension) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("future_extension"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(futureExtension, null).intValue());
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
     * Get the value of the field {@code message_id}
     * @return The value of the field {@code message_id}
     */
    public byte getMessageId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("message_id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code message_id}
     * @param messageId The new value of the field {@code message_id}
     */
    public void setMessageId(byte messageId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("message_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), messageId);
        }
    }
    
    /**
     * Create a AudioPreselectionDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioPreselectionDescriptor(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioPreselectionDescriptor> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioPreselectionDescriptor(input);
    
    /**
     * A {@link AudioPreselectionDescriptor.Builder} object constructs a {@link AudioPreselectionDescriptor} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AudioPreselectionDescriptor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AudioPreselectionDescriptor struct;
        
        private Builder() {
            struct = AudioPreselectionDescriptor.allocate();
        }
        
        /**
         * Finish building the {@link AudioPreselectionDescriptor} struct.
         * @return A new instance of {@code AudioPreselectionDescriptor} with the fields 
         *         that were set in the Builder object.
         */
        public AudioPreselectionDescriptor build() {
            return struct;
        }
        
        /**
         * 5-bit
         * @param preselectionId The value for the {@code preselectionId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPreselectionId(byte preselectionId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("preselection_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), preselectionId);
                return this;
            }
        }
        
        /**
         * 3-bit field
         * @param audioRenderingIndication The value for the {@code audioRenderingIndication} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAudioRenderingIndication(byte audioRenderingIndication) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("audio_rendering_indication"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), audioRenderingIndication);
                return this;
            }
        }
        
        /**
         * visually impaired
         * @param audioDescription The value for the {@code audioDescription} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAudioDescription(boolean audioDescription) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("audio_description"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(audioDescription, null).intValue());
                return this;
            }
        }
        
        public Builder setSpokenSubtitles(boolean spokenSubtitles) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("spoken_subtitles"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(spokenSubtitles, null).intValue());
                return this;
            }
        }
        
        public Builder setDialogueEnhancement(boolean dialogueEnhancement) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dialogue_enhancement"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(dialogueEnhancement, null).intValue());
                return this;
            }
        }
        
        public Builder setInteractivityEnabled(boolean interactivityEnabled) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("interactivity_enabled"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(interactivityEnabled, null).intValue());
                return this;
            }
        }
        
        public Builder setLanguageCodePresent(boolean languageCodePresent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("language_code_present"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(languageCodePresent, null).intValue());
                return this;
            }
        }
        
        public Builder setTextLabelPresent(boolean textLabelPresent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("text_label_present"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(textLabelPresent, null).intValue());
                return this;
            }
        }
        
        /**
         * indicates if this PID conveys a complete audio programme
         * @param multiStreamInfoPresent The value for the {@code multiStreamInfoPresent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMultiStreamInfoPresent(boolean multiStreamInfoPresent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("multi_stream_info_present"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(multiStreamInfoPresent, null).intValue());
                return this;
            }
        }
        
        public Builder setFutureExtension(boolean futureExtension) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("future_extension"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(futureExtension, null).intValue());
                return this;
            }
        }
        
        /**
         * NULL terminated ISO 639 language code.
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
        
        public Builder setMessageId(byte messageId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("message_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), messageId);
                return this;
            }
        }
    }
}
