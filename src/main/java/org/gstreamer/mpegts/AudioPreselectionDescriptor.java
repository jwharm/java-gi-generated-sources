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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * Allocate a new {@link AudioPreselectionDescriptor}
     * @return A new, uninitialized @{link AudioPreselectionDescriptor}
     */
    public static AudioPreselectionDescriptor allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioPreselectionDescriptor newInstance = new AudioPreselectionDescriptor(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code preselection_id}
     * @return The value of the field {@code preselection_id}
     */
    public byte preselectionId$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("preselection_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code preselection_id}
     * @param preselectionId The new value of the field {@code preselection_id}
     */
    public void preselectionId$set(byte preselectionId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("preselection_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), preselectionId);
    }
    
    /**
     * Get the value of the field {@code audio_rendering_indication}
     * @return The value of the field {@code audio_rendering_indication}
     */
    public byte audioRenderingIndication$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("audio_rendering_indication"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code audio_rendering_indication}
     * @param audioRenderingIndication The new value of the field {@code audio_rendering_indication}
     */
    public void audioRenderingIndication$set(byte audioRenderingIndication) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("audio_rendering_indication"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), audioRenderingIndication);
    }
    
    /**
     * Get the value of the field {@code audio_description}
     * @return The value of the field {@code audio_description}
     */
    public boolean audioDescription$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("audio_description"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code audio_description}
     * @param audioDescription The new value of the field {@code audio_description}
     */
    public void audioDescription$set(boolean audioDescription) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("audio_description"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), audioDescription ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code spoken_subtitles}
     * @return The value of the field {@code spoken_subtitles}
     */
    public boolean spokenSubtitles$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("spoken_subtitles"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code spoken_subtitles}
     * @param spokenSubtitles The new value of the field {@code spoken_subtitles}
     */
    public void spokenSubtitles$set(boolean spokenSubtitles) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("spoken_subtitles"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), spokenSubtitles ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code dialogue_enhancement}
     * @return The value of the field {@code dialogue_enhancement}
     */
    public boolean dialogueEnhancement$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dialogue_enhancement"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code dialogue_enhancement}
     * @param dialogueEnhancement The new value of the field {@code dialogue_enhancement}
     */
    public void dialogueEnhancement$set(boolean dialogueEnhancement) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dialogue_enhancement"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), dialogueEnhancement ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code interactivity_enabled}
     * @return The value of the field {@code interactivity_enabled}
     */
    public boolean interactivityEnabled$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("interactivity_enabled"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code interactivity_enabled}
     * @param interactivityEnabled The new value of the field {@code interactivity_enabled}
     */
    public void interactivityEnabled$set(boolean interactivityEnabled) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("interactivity_enabled"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), interactivityEnabled ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code language_code_present}
     * @return The value of the field {@code language_code_present}
     */
    public boolean languageCodePresent$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("language_code_present"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code language_code_present}
     * @param languageCodePresent The new value of the field {@code language_code_present}
     */
    public void languageCodePresent$set(boolean languageCodePresent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("language_code_present"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), languageCodePresent ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code text_label_present}
     * @return The value of the field {@code text_label_present}
     */
    public boolean textLabelPresent$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("text_label_present"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code text_label_present}
     * @param textLabelPresent The new value of the field {@code text_label_present}
     */
    public void textLabelPresent$set(boolean textLabelPresent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("text_label_present"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), textLabelPresent ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code multi_stream_info_present}
     * @return The value of the field {@code multi_stream_info_present}
     */
    public boolean multiStreamInfoPresent$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("multi_stream_info_present"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code multi_stream_info_present}
     * @param multiStreamInfoPresent The new value of the field {@code multi_stream_info_present}
     */
    public void multiStreamInfoPresent$set(boolean multiStreamInfoPresent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("multi_stream_info_present"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), multiStreamInfoPresent ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code future_extension}
     * @return The value of the field {@code future_extension}
     */
    public boolean futureExtension$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("future_extension"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code future_extension}
     * @param futureExtension The new value of the field {@code future_extension}
     */
    public void futureExtension$set(boolean futureExtension) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("future_extension"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), futureExtension ? 1 : 0);
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
     * Get the value of the field {@code message_id}
     * @return The value of the field {@code message_id}
     */
    public byte messageId$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("message_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code message_id}
     * @param messageId The new value of the field {@code message_id}
     */
    public void messageId$set(byte messageId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("message_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), messageId);
    }
    
    /**
     * Create a AudioPreselectionDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioPreselectionDescriptor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AudioPreselectionDescriptor struct;
        
         /**
         * A {@link AudioPreselectionDescriptor.Build} object constructs a {@link AudioPreselectionDescriptor} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AudioPreselectionDescriptor.allocate();
        }
        
         /**
         * Finish building the {@link AudioPreselectionDescriptor} struct.
         * @return A new instance of {@code AudioPreselectionDescriptor} with the fields 
         *         that were set in the Build object.
         */
        public AudioPreselectionDescriptor construct() {
            return struct;
        }
        
        /**
         * 5-bit
         * @param preselectionId The value for the {@code preselectionId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPreselectionId(byte preselectionId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("preselection_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), preselectionId);
            return this;
        }
        
        /**
         * 3-bit field
         * @param audioRenderingIndication The value for the {@code audioRenderingIndication} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAudioRenderingIndication(byte audioRenderingIndication) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("audio_rendering_indication"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), audioRenderingIndication);
            return this;
        }
        
        /**
         * visually impaired
         * @param audioDescription The value for the {@code audioDescription} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAudioDescription(boolean audioDescription) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("audio_description"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), audioDescription ? 1 : 0);
            return this;
        }
        
        public Build setSpokenSubtitles(boolean spokenSubtitles) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("spoken_subtitles"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), spokenSubtitles ? 1 : 0);
            return this;
        }
        
        public Build setDialogueEnhancement(boolean dialogueEnhancement) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dialogue_enhancement"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dialogueEnhancement ? 1 : 0);
            return this;
        }
        
        public Build setInteractivityEnabled(boolean interactivityEnabled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interactivity_enabled"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), interactivityEnabled ? 1 : 0);
            return this;
        }
        
        public Build setLanguageCodePresent(boolean languageCodePresent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language_code_present"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), languageCodePresent ? 1 : 0);
            return this;
        }
        
        public Build setTextLabelPresent(boolean textLabelPresent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("text_label_present"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), textLabelPresent ? 1 : 0);
            return this;
        }
        
        /**
         * indicates if this PID conveys a complete audio programme
         * @param multiStreamInfoPresent The value for the {@code multiStreamInfoPresent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMultiStreamInfoPresent(boolean multiStreamInfoPresent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("multi_stream_info_present"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), multiStreamInfoPresent ? 1 : 0);
            return this;
        }
        
        public Build setFutureExtension(boolean futureExtension) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("future_extension"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), futureExtension ? 1 : 0);
            return this;
        }
        
        /**
         * NULL terminated ISO 639 language code.
         * @param languageCode The value for the {@code languageCode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLanguageCode(java.lang.String languageCode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (languageCode == null ? MemoryAddress.NULL : Interop.allocateNativeString(languageCode)));
            return this;
        }
        
        public Build setMessageId(byte messageId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("message_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), messageId);
            return this;
        }
    }
}
