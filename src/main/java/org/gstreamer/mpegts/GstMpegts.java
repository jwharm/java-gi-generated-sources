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
    
    private static boolean javagi$initialized = false;
    
    @ApiStatus.Internal
    public static void javagi$ensureInitialized() {
        if (!javagi$initialized) {
            javagi$initialized = true;
            JavaGITypeRegister.register();
        }
    }
    
    /**
     * Creates a {@link Descriptor} with custom {@code tag} and {@code data}
     * @param tag descriptor tag
     * @param data descriptor data (after tag and length field)
     * @param length length of {@code data}
     * @return {@link Descriptor}
     */
    public static org.gstreamer.mpegts.Descriptor descriptorFromCustom(byte tag, byte[] data, long length) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_custom.invokeExact(
                    tag,
                    Interop.allocateNativeArray(data, false),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.Descriptor.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a {@link Descriptor} with custom {@code tag}, {@code tag_extension} and {@code data}
     * @param tag descriptor tag
     * @param tagExtension descriptor tag extension
     * @param data descriptor data (after tag and length field)
     * @param length length of {@code data}
     * @return {@link Descriptor}
     */
    public static org.gstreamer.mpegts.Descriptor descriptorFromCustomWithExtension(byte tag, byte tagExtension, byte[] data, long length) {
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
        return org.gstreamer.mpegts.Descriptor.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a {@link Descriptor} to be a {@link DVBDescriptorType#NETWORK_NAME},
     * with the network name {@code name}. The data field of the {@link Descriptor}
     * will be allocated, and transferred to the caller.
     * @param name the network name to set
     * @return the {@link Descriptor} or {@code null} on fail
     */
    public static org.gstreamer.mpegts.Descriptor descriptorFromDvbNetworkName(java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_dvb_network_name.invokeExact(
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.Descriptor.fromAddress.marshal(RESULT, Ownership.FULL);
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
    public static org.gstreamer.mpegts.Descriptor descriptorFromDvbService(org.gstreamer.mpegts.DVBServiceType serviceType, @Nullable java.lang.String serviceName, @Nullable java.lang.String serviceProvider) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_dvb_service.invokeExact(
                    serviceType.getValue(),
                    (Addressable) (serviceName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(serviceName, null)),
                    (Addressable) (serviceProvider == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(serviceProvider, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.Descriptor.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    public static org.gstreamer.mpegts.Descriptor descriptorFromDvbSubtitling(java.lang.String lang, byte type, short composition, short ancillary) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_dvb_subtitling.invokeExact(
                    Marshal.stringToAddress.marshal(lang, null),
                    type,
                    composition,
                    ancillary);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.Descriptor.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a {@link DescriptorType#ISO_639_LANGUAGE} {@link Descriptor} with
     * a single language
     * @param language ISO-639-2 language 3-char code
     * @return {@link Descriptor}, {@code null} on failure
     */
    public static org.gstreamer.mpegts.Descriptor descriptorFromIso639Language(java.lang.String language) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_iso_639_language.invokeExact(
                    Marshal.stringToAddress.marshal(language, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.Descriptor.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a {@link DescriptorType#REGISTRATION} {@link Descriptor}
     * @param formatIdentifier a 4 character format identifier string
     * @param additionalInfo pointer to optional additional info
     * @param additionalInfoLength length of the optional {@code additional_info}
     * @return {@link Descriptor}, {@code null} on failure
     */
    public static org.gstreamer.mpegts.Descriptor descriptorFromRegistration(java.lang.String formatIdentifier, byte[] additionalInfo, long additionalInfoLength) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_registration.invokeExact(
                    Marshal.stringToAddress.marshal(formatIdentifier, null),
                    (Addressable) (additionalInfo == null ? MemoryAddress.NULL : Interop.allocateNativeArray(additionalInfo, false)),
                    additionalInfoLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.Descriptor.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    public static void descriptorParseAudioPreselectionDump(org.gstreamer.mpegts.AudioPreselectionDescriptor source) {
        try {
            DowncallHandles.gst_mpegts_descriptor_parse_audio_preselection_dump.invokeExact(
                    source.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void descriptorParseAudioPreselectionFree(org.gstreamer.mpegts.AudioPreselectionDescriptor source) {
        try {
            DowncallHandles.gst_mpegts_descriptor_parse_audio_preselection_free.invokeExact(
                    source.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void dvbComponentDescriptorFree(org.gstreamer.mpegts.ComponentDescriptor source) {
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
    public static org.gstreamer.gst.Event eventNewMpegtsSection(org.gstreamer.mpegts.Section section) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_mpegts_section.invokeExact(
                    section.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Extracts the {@link Section} contained in the {@code event} {@link org.gstreamer.gst.Event}
     * @param event {@link org.gstreamer.gst.Event} containing a {@link Section}
     * @return The extracted {@link Section} , or {@code null} if the
     * event did not contain a valid {@link Section}.
     */
    public static org.gstreamer.mpegts.Section eventParseMpegtsSection(org.gstreamer.gst.Event event) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_parse_mpegts_section.invokeExact(
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, Ownership.FULL);
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
    public static org.gstreamer.mpegts.Descriptor findDescriptor(org.gstreamer.mpegts.Descriptor[] descriptors, byte tag) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_find_descriptor.invokeExact(
                    Interop.allocateNativeArray(descriptors, org.gstreamer.mpegts.Descriptor.getMemoryLayout(), false),
                    tag);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.Descriptor.fromAddress.marshal(RESULT, Ownership.NONE);
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
    public static org.gstreamer.mpegts.Descriptor findDescriptorWithExtension(org.gstreamer.mpegts.Descriptor[] descriptors, byte tag, byte tagExtension) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_find_descriptor_with_extension.invokeExact(
                    Interop.allocateNativeArray(descriptors, org.gstreamer.mpegts.Descriptor.getMemoryLayout(), false),
                    tag,
                    tagExtension);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.Descriptor.fromAddress.marshal(RESULT, Ownership.NONE);
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
    public static org.gstreamer.gst.Message messageNewMpegtsSection(org.gstreamer.gst.GstObject parent, org.gstreamer.mpegts.Section section) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_mpegts_section.invokeExact(
                    parent.handle(),
                    section.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Message.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the {@link Section} contained in a message.
     * @param message a {@link org.gstreamer.gst.Message}
     * @return the contained {@link Section}, or {@code null}.
     */
    public static org.gstreamer.mpegts.Section messageParseMpegtsSection(org.gstreamer.gst.Message message) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_parse_mpegts_section.invokeExact(
                    message.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, Ownership.FULL);
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
    public static PointerProxy<org.gstreamer.mpegts.Descriptor> parseDescriptors(PointerByte buffer, long bufLen) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_parse_descriptors.invokeExact(
                    buffer.handle(),
                    bufLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerProxy<org.gstreamer.mpegts.Descriptor>(RESULT, org.gstreamer.mpegts.Descriptor.fromAddress);
    }
    
    /**
     * Allocates a new {@link org.gtk.glib.PtrArray} for {@link PatProgram}. The array can be filled
     * and then converted to a PAT section with gst_mpegts_section_from_pat().
     * @return A newly allocated {@link org.gtk.glib.PtrArray}
     */
    public static PointerProxy<org.gstreamer.mpegts.PatProgram> patNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_pat_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerProxy<org.gstreamer.mpegts.PatProgram>(RESULT, org.gstreamer.mpegts.PatProgram.fromAddress);
    }
    
    /**
     * Allocates and initializes a new INSERT command {@link SCTESIT}
     * setup to cancel the specified {@code event_id}.
     * @param eventId The event ID to cancel.
     * @return A newly allocated {@link SCTESIT}
     */
    public static org.gstreamer.mpegts.SCTESIT scteCancelNew(int eventId) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_scte_cancel_new.invokeExact(
                    eventId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.SCTESIT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Allocates and initializes a NULL command {@link SCTESIT}.
     * @return A newly allocated {@link SCTESIT}
     */
    public static org.gstreamer.mpegts.SCTESIT scteNullNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_scte_null_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.SCTESIT.fromAddress.marshal(RESULT, Ownership.FULL);
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
    public static org.gstreamer.mpegts.SCTESIT scteSpliceInNew(int eventId, org.gstreamer.gst.ClockTime spliceTime) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_scte_splice_in_new.invokeExact(
                    eventId,
                    spliceTime.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.SCTESIT.fromAddress.marshal(RESULT, Ownership.FULL);
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
    public static org.gstreamer.mpegts.SCTESIT scteSpliceOutNew(int eventId, org.gstreamer.gst.ClockTime spliceTime, org.gstreamer.gst.ClockTime duration) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_scte_splice_out_new.invokeExact(
                    eventId,
                    spliceTime.getValue().longValue(),
                    duration.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.SCTESIT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    public static org.gstreamer.mpegts.Section sectionFromAtscMgt(org.gstreamer.mpegts.AtscMGT mgt) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_atsc_mgt.invokeExact(
                    mgt.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        mgt.yieldOwnership();
        return org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    public static org.gstreamer.mpegts.Section sectionFromAtscRrt(org.gstreamer.mpegts.AtscRRT rrt) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_atsc_rrt.invokeExact(
                    rrt.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    public static org.gstreamer.mpegts.Section sectionFromAtscStt(org.gstreamer.mpegts.AtscSTT stt) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_atsc_stt.invokeExact(
                    stt.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Ownership of {@code nit} is taken. The data in {@code nit} is managed by the {@link Section}
     * @param nit a {@link NIT} to create the {@link Section} from
     * @return the {@link Section}
     */
    public static org.gstreamer.mpegts.Section sectionFromNit(org.gstreamer.mpegts.NIT nit) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_nit.invokeExact(
                    nit.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nit.yieldOwnership();
        return org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a PAT {@link Section} from the {@code programs} array of {@code GstMpegtsPatPrograms}
     * @param programs an array of {@link PatProgram}
     * @param tsId Transport stream ID of the PAT
     * @return a {@link Section}
     */
    public static org.gstreamer.mpegts.Section sectionFromPat(org.gstreamer.mpegts.PatProgram[] programs, short tsId) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_pat.invokeExact(
                    Interop.allocateNativeArray(programs, org.gstreamer.mpegts.PatProgram.getMemoryLayout(), false),
                    tsId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a {@link Section} from {@code pmt} that is bound to {@code pid}
     * @param pmt a {@link PMT} to create a {@link Section} from
     * @param pid The PID that the {@link PMT} belongs to
     * @return {@link Section}
     */
    public static org.gstreamer.mpegts.Section sectionFromPmt(org.gstreamer.mpegts.PMT pmt, short pid) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_pmt.invokeExact(
                    pmt.handle(),
                    pid);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        pmt.yieldOwnership();
        return org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Ownership of {@code sit} is taken. The data in {@code sit} is managed by the {@link Section}
     * @param sit a {@link SCTESIT} to create the {@link Section} from
     * @return the {@link Section}
     */
    public static org.gstreamer.mpegts.Section sectionFromScteSit(org.gstreamer.mpegts.SCTESIT sit, short pid) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_scte_sit.invokeExact(
                    sit.handle(),
                    pid);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sit.yieldOwnership();
        return org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Ownership of {@code sdt} is taken. The data in {@code sdt} is managed by the {@link Section}
     * @param sdt a {@link SDT} to create the {@link Section} from
     * @return the {@link Section}
     */
    public static org.gstreamer.mpegts.Section sectionFromSdt(org.gstreamer.mpegts.SDT sdt) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_sdt.invokeExact(
                    sdt.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sdt.yieldOwnership();
        return org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, Ownership.FULL);
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
