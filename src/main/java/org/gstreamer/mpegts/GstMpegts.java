package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstMpegts namespace.
 */
public final class GstMpegts {
    
    static {
        System.loadLibrary("gstmpegts-1.0");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
    /**
     * Creates a {@link Descriptor} with custom {@code tag} and {@code data}
     * @param tag descriptor tag
     * @param data descriptor data (after tag and length field)
     * @param length length of {@code data}
     * @return {@link Descriptor}
     */
    public static @NotNull org.gstreamer.mpegts.Descriptor descriptorFromCustom(byte tag, @NotNull byte[] data, long length) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_custom.invokeExact(
                    tag,
                    Interop.allocateNativeArray(data, false),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.Descriptor(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a {@link Descriptor} with custom {@code tag}, {@code tag_extension} and {@code data}
     * @param tag descriptor tag
     * @param tagExtension descriptor tag extension
     * @param data descriptor data (after tag and length field)
     * @param length length of {@code data}
     * @return {@link Descriptor}
     */
    public static @NotNull org.gstreamer.mpegts.Descriptor descriptorFromCustomWithExtension(byte tag, byte tagExtension, @NotNull byte[] data, long length) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_custom_with_extension.invokeExact(
                    tag,
                    tagExtension,
                    Interop.allocateNativeArray(data, false),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.Descriptor(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a {@link Descriptor} to be a {@link DVBDescriptorType#NETWORK_NAME},
     * with the network name {@code name}. The data field of the {@link Descriptor}
     * will be allocated, and transferred to the caller.
     * @param name the network name to set
     * @return the {@link Descriptor} or {@code null} on fail
     */
    public static @NotNull org.gstreamer.mpegts.Descriptor descriptorFromDvbNetworkName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_dvb_network_name.invokeExact(
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.Descriptor(RESULT, Ownership.FULL);
    }
    
    /**
     * Fills a {@link Descriptor} to be a {@link DVBDescriptorType#SERVICE}.
     * The data field of the {@link Descriptor} will be allocated,
     * and transferred to the caller.
     * @param serviceType Service type defined as a {@link DVBServiceType}
     * @param serviceName Name of the service
     * @param serviceProvider Name of the service provider
     * @return the {@link Descriptor} or {@code null} on fail
     */
    public static @NotNull org.gstreamer.mpegts.Descriptor descriptorFromDvbService(@NotNull org.gstreamer.mpegts.DVBServiceType serviceType, @Nullable java.lang.String serviceName, @Nullable java.lang.String serviceProvider) {
        java.util.Objects.requireNonNull(serviceType, "Parameter 'serviceType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_dvb_service.invokeExact(
                    serviceType.getValue(),
                    (Addressable) (serviceName == null ? MemoryAddress.NULL : Interop.allocateNativeString(serviceName)),
                    (Addressable) (serviceProvider == null ? MemoryAddress.NULL : Interop.allocateNativeString(serviceProvider)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.Descriptor(RESULT, Ownership.FULL);
    }
    
    public static @NotNull org.gstreamer.mpegts.Descriptor descriptorFromDvbSubtitling(@NotNull java.lang.String lang, byte type, short composition, short ancillary) {
        java.util.Objects.requireNonNull(lang, "Parameter 'lang' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_dvb_subtitling.invokeExact(
                    Interop.allocateNativeString(lang),
                    type,
                    composition,
                    ancillary);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.Descriptor(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a {@link DescriptorType#ISO_639_LANGUAGE} {@link Descriptor} with
     * a single language
     * @param language ISO-639-2 language 3-char code
     * @return {@link Descriptor}, {@code null} on failure
     */
    public static @NotNull org.gstreamer.mpegts.Descriptor descriptorFromIso639Language(@NotNull java.lang.String language) {
        java.util.Objects.requireNonNull(language, "Parameter 'language' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_iso_639_language.invokeExact(
                    Interop.allocateNativeString(language));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.Descriptor(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a {@link DescriptorType#REGISTRATION} {@link Descriptor}
     * @param formatIdentifier a 4 character format identifier string
     * @param additionalInfo pointer to optional additional info
     * @param additionalInfoLength length of the optional {@code additional_info}
     * @return {@link Descriptor}, {@code null} on failure
     */
    public static @NotNull org.gstreamer.mpegts.Descriptor descriptorFromRegistration(@NotNull java.lang.String formatIdentifier, @Nullable byte[] additionalInfo, long additionalInfoLength) {
        java.util.Objects.requireNonNull(formatIdentifier, "Parameter 'formatIdentifier' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_registration.invokeExact(
                    Interop.allocateNativeString(formatIdentifier),
                    (Addressable) (additionalInfo == null ? MemoryAddress.NULL : Interop.allocateNativeArray(additionalInfo, false)),
                    additionalInfoLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.Descriptor(RESULT, Ownership.FULL);
    }
    
    public static void descriptorParseAudioPreselectionDump(@NotNull org.gstreamer.mpegts.AudioPreselectionDescriptor source) {
        java.util.Objects.requireNonNull(source, "Parameter 'source' must not be null");
        try {
            DowncallHandles.gst_mpegts_descriptor_parse_audio_preselection_dump.invokeExact(
                    source.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void descriptorParseAudioPreselectionFree(@NotNull org.gstreamer.mpegts.AudioPreselectionDescriptor source) {
        java.util.Objects.requireNonNull(source, "Parameter 'source' must not be null");
        try {
            DowncallHandles.gst_mpegts_descriptor_parse_audio_preselection_free.invokeExact(
                    source.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void dvbComponentDescriptorFree(@NotNull org.gstreamer.mpegts.ComponentDescriptor source) {
        java.util.Objects.requireNonNull(source, "Parameter 'source' must not be null");
        try {
            DowncallHandles.gst_mpegts_dvb_component_descriptor_free.invokeExact(
                    source.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link org.gstreamer.gst.Event} for a {@link Section}.
     * @param section The {@link Section} to put in a message
     * @return The new custom {@link org.gstreamer.gst.Event}.
     */
    public static @NotNull org.gstreamer.gst.Event eventNewMpegtsSection(@NotNull org.gstreamer.mpegts.Section section) {
        java.util.Objects.requireNonNull(section, "Parameter 'section' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_mpegts_section.invokeExact(
                    section.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Event(RESULT, Ownership.FULL);
    }
    
    /**
     * Extracts the {@link Section} contained in the {@code event} {@link org.gstreamer.gst.Event}
     * @param event {@link org.gstreamer.gst.Event} containing a {@link Section}
     * @return The extracted {@link Section} , or {@code null} if the
     * event did not contain a valid {@link Section}.
     */
    public static @NotNull org.gstreamer.mpegts.Section eventParseMpegtsSection(@NotNull org.gstreamer.gst.Event event) {
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_parse_mpegts_section.invokeExact(
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.Section(RESULT, Ownership.FULL);
    }
    
    /**
     * Finds the first descriptor of type {@code tag} in the array.
     * <p>
     * Note: To look for descriptors that can be present more than once in an
     * array of descriptors, iterate the {@link org.gtk.glib.Array} manually.
     * @param descriptors an array
     * of {@link Descriptor}
     * @param tag the tag to look for
     * @return the first descriptor matching {@code tag}, else {@code null}.
     */
    public static @NotNull org.gstreamer.mpegts.Descriptor findDescriptor(@NotNull org.gstreamer.mpegts.Descriptor[] descriptors, byte tag) {
        java.util.Objects.requireNonNull(descriptors, "Parameter 'descriptors' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_find_descriptor.invokeExact(
                    Interop.allocateNativeArray(descriptors, org.gstreamer.mpegts.Descriptor.getMemoryLayout(), false),
                    tag);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.Descriptor(RESULT, Ownership.NONE);
    }
    
    /**
     * Finds the first descriptor of type {@code tag} with {@code tag_extension} in the array.
     * <p>
     * Note: To look for descriptors that can be present more than once in an
     * array of descriptors, iterate the {@link org.gtk.glib.Array} manually.
     * @param descriptors an array
     * of {@link Descriptor}
     * @param tag the tag to look for
     * @return the first descriptor matchin {@code tag} with {@code tag_extension}, else {@code null}.
     */
    public static @NotNull org.gstreamer.mpegts.Descriptor findDescriptorWithExtension(@NotNull org.gstreamer.mpegts.Descriptor[] descriptors, byte tag, byte tagExtension) {
        java.util.Objects.requireNonNull(descriptors, "Parameter 'descriptors' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_find_descriptor_with_extension.invokeExact(
                    Interop.allocateNativeArray(descriptors, org.gstreamer.mpegts.Descriptor.getMemoryLayout(), false),
                    tag,
                    tagExtension);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.Descriptor(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes the MPEG-TS helper library. Must be called before any
     * usage.
     */
    public static void initialize() {
        try {
            DowncallHandles.gst_mpegts_initialize.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link org.gstreamer.gst.Message} for a {@code GstMpegtsSection}.
     * @param parent The creator of the message
     * @param section The {@link Section} to put in a message
     * @return The new {@link org.gstreamer.gst.Message} to be posted, or {@code null} if the
     * section is not valid.
     */
    public static @NotNull org.gstreamer.gst.Message messageNewMpegtsSection(@NotNull org.gstreamer.gst.Object parent, @NotNull org.gstreamer.mpegts.Section section) {
        java.util.Objects.requireNonNull(parent, "Parameter 'parent' must not be null");
        java.util.Objects.requireNonNull(section, "Parameter 'section' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_mpegts_section.invokeExact(
                    parent.handle(),
                    section.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Message(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the {@link Section} contained in a message.
     * @param message a {@link org.gstreamer.gst.Message}
     * @return the contained {@link Section}, or {@code null}.
     */
    public static @NotNull org.gstreamer.mpegts.Section messageParseMpegtsSection(@NotNull org.gstreamer.gst.Message message) {
        java.util.Objects.requireNonNull(message, "Parameter 'message' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_parse_mpegts_section.invokeExact(
                    message.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.Section(RESULT, Ownership.FULL);
    }
    
    /**
     * Parses the descriptors present in {@code buffer} and returns them as an
     * array.
     * <p>
     * Note: The data provided in {@code buffer} will not be copied.
     * @param buffer descriptors to parse
     * @param bufLen Size of {@code buffer}
     * @return an
     * array of the parsed descriptors or {@code null} if there was an error.
     * Release with {@code g_array_unref} when done with it.
     */
    public static @NotNull PointerProxy<org.gstreamer.mpegts.Descriptor> parseDescriptors(PointerByte buffer, long bufLen) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_parse_descriptors.invokeExact(
                    buffer.handle(),
                    bufLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerProxy<org.gstreamer.mpegts.Descriptor>(RESULT, org.gstreamer.mpegts.Descriptor.class);
    }
    
    /**
     * Allocates a new {@link org.gtk.glib.PtrArray} for {@link PatProgram}. The array can be filled
     * and then converted to a PAT section with gst_mpegts_section_from_pat().
     * @return A newly allocated {@link org.gtk.glib.PtrArray}
     */
    public static @NotNull PointerProxy<org.gstreamer.mpegts.PatProgram> patNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_pat_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerProxy<org.gstreamer.mpegts.PatProgram>(RESULT, org.gstreamer.mpegts.PatProgram.class);
    }
    
    /**
     * Allocates and initializes a new INSERT command {@link SCTESIT}
     * setup to cancel the specified {@code event_id}.
     * @param eventId The event ID to cancel.
     * @return A newly allocated {@link SCTESIT}
     */
    public static @NotNull org.gstreamer.mpegts.SCTESIT scteCancelNew(int eventId) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_scte_cancel_new.invokeExact(
                    eventId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.SCTESIT(RESULT, Ownership.FULL);
    }
    
    /**
     * Allocates and initializes a NULL command {@link SCTESIT}.
     * @return A newly allocated {@link SCTESIT}
     */
    public static @NotNull org.gstreamer.mpegts.SCTESIT scteNullNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_scte_null_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.SCTESIT(RESULT, Ownership.FULL);
    }
    
    /**
     * Allocates and initializes a new "Splice In" INSERT command
     * {@link SCTESIT} for the given {@code event_id} and {@code splice_time}.
     * <p>
     * If the {@code splice_time} is {@code G_MAXUINT64} then the event will be
     * immediate as opposed to for the target {@code splice_time}.
     * @param eventId The event ID.
     * @param spliceTime The running time for the splice event
     * @return A newly allocated {@link SCTESIT}
     */
    public static @NotNull org.gstreamer.mpegts.SCTESIT scteSpliceInNew(int eventId, @NotNull org.gstreamer.gst.ClockTime spliceTime) {
        java.util.Objects.requireNonNull(spliceTime, "Parameter 'spliceTime' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_scte_splice_in_new.invokeExact(
                    eventId,
                    spliceTime.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.SCTESIT(RESULT, Ownership.FULL);
    }
    
    /**
     * Allocates and initializes a new "Splice Out" INSERT command
     * {@link SCTESIT} for the given {@code event_id}, {@code splice_time} and
     * {@code duration}.
     * <p>
     * If the {@code splice_time} is {@code G_MAXUINT64} then the event will be
     * immediate as opposed to for the target {@code splice_time}.
     * <p>
     * If the {@code duration} is 0 it won't be specified in the event.
     * @param eventId The event ID.
     * @param spliceTime The running time for the splice event
     * @param duration The optional duration.
     * @return A newly allocated {@link SCTESIT}
     */
    public static @NotNull org.gstreamer.mpegts.SCTESIT scteSpliceOutNew(int eventId, @NotNull org.gstreamer.gst.ClockTime spliceTime, @NotNull org.gstreamer.gst.ClockTime duration) {
        java.util.Objects.requireNonNull(spliceTime, "Parameter 'spliceTime' must not be null");
        java.util.Objects.requireNonNull(duration, "Parameter 'duration' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_scte_splice_out_new.invokeExact(
                    eventId,
                    spliceTime.getValue().longValue(),
                    duration.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.SCTESIT(RESULT, Ownership.FULL);
    }
    
    public static @NotNull org.gstreamer.mpegts.Section sectionFromAtscMgt(@NotNull org.gstreamer.mpegts.AtscMGT mgt) {
        java.util.Objects.requireNonNull(mgt, "Parameter 'mgt' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_atsc_mgt.invokeExact(
                    mgt.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        mgt.yieldOwnership();
        return new org.gstreamer.mpegts.Section(RESULT, Ownership.FULL);
    }
    
    public static @NotNull org.gstreamer.mpegts.Section sectionFromAtscRrt(@NotNull org.gstreamer.mpegts.AtscRRT rrt) {
        java.util.Objects.requireNonNull(rrt, "Parameter 'rrt' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_atsc_rrt.invokeExact(
                    rrt.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.Section(RESULT, Ownership.FULL);
    }
    
    public static @NotNull org.gstreamer.mpegts.Section sectionFromAtscStt(@NotNull org.gstreamer.mpegts.AtscSTT stt) {
        java.util.Objects.requireNonNull(stt, "Parameter 'stt' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_atsc_stt.invokeExact(
                    stt.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.Section(RESULT, Ownership.FULL);
    }
    
    /**
     * Ownership of {@code nit} is taken. The data in {@code nit} is managed by the {@link Section}
     * @param nit a {@link NIT} to create the {@link Section} from
     * @return the {@link Section}
     */
    public static @NotNull org.gstreamer.mpegts.Section sectionFromNit(@NotNull org.gstreamer.mpegts.NIT nit) {
        java.util.Objects.requireNonNull(nit, "Parameter 'nit' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_nit.invokeExact(
                    nit.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nit.yieldOwnership();
        return new org.gstreamer.mpegts.Section(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a PAT {@link Section} from the {@code programs} array of {@code GstMpegtsPatPrograms}
     * @param programs an array of {@link PatProgram}
     * @param tsId Transport stream ID of the PAT
     * @return a {@link Section}
     */
    public static @NotNull org.gstreamer.mpegts.Section sectionFromPat(@NotNull org.gstreamer.mpegts.PatProgram[] programs, short tsId) {
        java.util.Objects.requireNonNull(programs, "Parameter 'programs' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_pat.invokeExact(
                    Interop.allocateNativeArray(programs, org.gstreamer.mpegts.PatProgram.getMemoryLayout(), false),
                    tsId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.Section(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a {@link Section} from {@code pmt} that is bound to {@code pid}
     * @param pmt a {@link PMT} to create a {@link Section} from
     * @param pid The PID that the {@link PMT} belongs to
     * @return {@link Section}
     */
    public static @NotNull org.gstreamer.mpegts.Section sectionFromPmt(@NotNull org.gstreamer.mpegts.PMT pmt, short pid) {
        java.util.Objects.requireNonNull(pmt, "Parameter 'pmt' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_pmt.invokeExact(
                    pmt.handle(),
                    pid);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        pmt.yieldOwnership();
        return new org.gstreamer.mpegts.Section(RESULT, Ownership.FULL);
    }
    
    /**
     * Ownership of {@code sit} is taken. The data in {@code sit} is managed by the {@link Section}
     * @param sit a {@link SCTESIT} to create the {@link Section} from
     * @return the {@link Section}
     */
    public static @NotNull org.gstreamer.mpegts.Section sectionFromScteSit(@NotNull org.gstreamer.mpegts.SCTESIT sit, short pid) {
        java.util.Objects.requireNonNull(sit, "Parameter 'sit' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_scte_sit.invokeExact(
                    sit.handle(),
                    pid);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sit.yieldOwnership();
        return new org.gstreamer.mpegts.Section(RESULT, Ownership.FULL);
    }
    
    /**
     * Ownership of {@code sdt} is taken. The data in {@code sdt} is managed by the {@link Section}
     * @param sdt a {@link SDT} to create the {@link Section} from
     * @return the {@link Section}
     */
    public static @NotNull org.gstreamer.mpegts.Section sectionFromSdt(@NotNull org.gstreamer.mpegts.SDT sdt) {
        java.util.Objects.requireNonNull(sdt, "Parameter 'sdt' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_sdt.invokeExact(
                    sdt.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sdt.yieldOwnership();
        return new org.gstreamer.mpegts.Section(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_descriptor_from_custom = Interop.downcallHandle(
            "gst_mpegts_descriptor_from_custom",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_from_custom_with_extension = Interop.downcallHandle(
            "gst_mpegts_descriptor_from_custom_with_extension",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_from_dvb_network_name = Interop.downcallHandle(
            "gst_mpegts_descriptor_from_dvb_network_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_from_dvb_service = Interop.downcallHandle(
            "gst_mpegts_descriptor_from_dvb_service",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_from_dvb_subtitling = Interop.downcallHandle(
            "gst_mpegts_descriptor_from_dvb_subtitling",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_from_iso_639_language = Interop.downcallHandle(
            "gst_mpegts_descriptor_from_iso_639_language",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_from_registration = Interop.downcallHandle(
            "gst_mpegts_descriptor_from_registration",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_audio_preselection_dump = Interop.downcallHandle(
            "gst_mpegts_descriptor_parse_audio_preselection_dump",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_audio_preselection_free = Interop.downcallHandle(
            "gst_mpegts_descriptor_parse_audio_preselection_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_dvb_component_descriptor_free = Interop.downcallHandle(
            "gst_mpegts_dvb_component_descriptor_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_new_mpegts_section = Interop.downcallHandle(
            "gst_event_new_mpegts_section",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_mpegts_section = Interop.downcallHandle(
            "gst_event_parse_mpegts_section",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_find_descriptor = Interop.downcallHandle(
            "gst_mpegts_find_descriptor",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_mpegts_find_descriptor_with_extension = Interop.downcallHandle(
            "gst_mpegts_find_descriptor_with_extension",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_mpegts_initialize = Interop.downcallHandle(
            "gst_mpegts_initialize",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gst_message_new_mpegts_section = Interop.downcallHandle(
            "gst_message_new_mpegts_section",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_mpegts_section = Interop.downcallHandle(
            "gst_message_parse_mpegts_section",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_parse_descriptors = Interop.downcallHandle(
            "gst_mpegts_parse_descriptors",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_mpegts_pat_new = Interop.downcallHandle(
            "gst_mpegts_pat_new",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gst_mpegts_scte_cancel_new = Interop.downcallHandle(
            "gst_mpegts_scte_cancel_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_mpegts_scte_null_new = Interop.downcallHandle(
            "gst_mpegts_scte_null_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_scte_splice_in_new = Interop.downcallHandle(
            "gst_mpegts_scte_splice_in_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_mpegts_scte_splice_out_new = Interop.downcallHandle(
            "gst_mpegts_scte_splice_out_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_from_atsc_mgt = Interop.downcallHandle(
            "gst_mpegts_section_from_atsc_mgt",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_from_atsc_rrt = Interop.downcallHandle(
            "gst_mpegts_section_from_atsc_rrt",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_from_atsc_stt = Interop.downcallHandle(
            "gst_mpegts_section_from_atsc_stt",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_from_nit = Interop.downcallHandle(
            "gst_mpegts_section_from_nit",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_from_pat = Interop.downcallHandle(
            "gst_mpegts_section_from_pat",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_from_pmt = Interop.downcallHandle(
            "gst_mpegts_section_from_pmt",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_from_scte_sit = Interop.downcallHandle(
            "gst_mpegts_section_from_scte_sit",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_from_sdt = Interop.downcallHandle(
            "gst_mpegts_section_from_sdt",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
}
