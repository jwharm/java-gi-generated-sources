package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * ## Generic usage of sections with {@code GstMpegtsSection}
 * <p>
 * The {@code GstMpegtsSection} object is the representation of MPEG-TS Section (SI or
 * PSI).
 * <p>
 * Various elements can post those on the bus via {@code GstMessage} of type
 * {@link org.gstreamer.gst.MessageType#ELEMENT}. The gst_message_parse_mpegts_section() function
 * provides access to the section.
 * <p>
 * Applications (or other elements) can create them either by using one of the
 * {@code gst_mpegts_section_from_*} functions, or by providing the raw SI data via
 * gst_mpegts_section_new().
 * <p>
 * Elements outputting MPEG-TS streams can also create sections using the
 * various convenience functions and then get the packetized data (to be
 * inserted in MPEG-TS packets) using gst_mpegts_section_packetize().
 * <p>
 * For more details, refer to the ITU H.222.0 or ISO/IEC 13818-1 specifications
 * and other specifications mentioned in the documentation.
 * <p>
 * <strong>Supported base MPEG-TS sections</strong><br/>
 * These are the sections for which parsing and packetizing code exists.
 * <p>
 * <strong>Program Association Table (PAT)</strong><br/>
 * See:
 * * gst_mpegts_section_get_pat()
 * * gst_mpegts_pat_program_new()
 * * {@code GstMpegtsPatProgram}
 * <p>
 * <strong>Conditional Access Table (CAT)</strong><br/>
 * See:
 * * gst_mpegts_section_get_cat()
 * <p>
 * <strong>Program Map Table (PMT)</strong><br/>
 * See:
 * * {@code GstMpegtsPMT}
 * * gst_mpegts_section_get_pmt()
 * * gst_mpegts_pmt_new()
 * * {@code GstMpegtsPMTStream}
 * <p>
 * <strong>Transport Stream Description Table (TSDT)</strong><br/>
 * See:
 * * gst_mpegts_section_get_tsdt()
 * <strong>API</strong><br/>
 */
public class Section extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSection";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.MiniObject.getMemoryLayout().withName("parent"),
        Interop.valueLayout.C_INT.withName("section_type"),
        Interop.valueLayout.C_SHORT.withName("pid"),
        Interop.valueLayout.C_BYTE.withName("table_id"),
        MemoryLayout.paddingLayout(8),
        Interop.valueLayout.C_SHORT.withName("subtable_extension"),
        Interop.valueLayout.C_BYTE.withName("version_number"),
        MemoryLayout.paddingLayout(8),
        Interop.valueLayout.C_INT.withName("current_next_indicator"),
        Interop.valueLayout.C_BYTE.withName("section_number"),
        Interop.valueLayout.C_BYTE.withName("last_section_number"),
        MemoryLayout.paddingLayout(16),
        Interop.valueLayout.C_INT.withName("crc"),
        Interop.valueLayout.ADDRESS.withName("data"),
        Interop.valueLayout.C_INT.withName("section_length"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("cached_parsed"),
        Interop.valueLayout.ADDRESS.withName("destroy_parsed"),
        Interop.valueLayout.C_LONG.withName("offset"),
        Interop.valueLayout.C_INT.withName("short_section"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("packetizer"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link Section}
     * @return A new, uninitialized @{link Section}
     */
    public static Section allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Section newInstance = new Section(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code section_type}
     * @return The value of the field {@code section_type}
     */
    public org.gstreamer.mpegts.SectionType sectionType$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("section_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.SectionType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code section_type}
     * @param sectionType The new value of the field {@code section_type}
     */
    public void sectionType$set(org.gstreamer.mpegts.SectionType sectionType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("section_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), sectionType.getValue());
    }
    
    /**
     * Get the value of the field {@code pid}
     * @return The value of the field {@code pid}
     */
    public short pid$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pid"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code pid}
     * @param pid The new value of the field {@code pid}
     */
    public void pid$set(short pid) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pid"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), pid);
    }
    
    /**
     * Get the value of the field {@code table_id}
     * @return The value of the field {@code table_id}
     */
    public byte tableId$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("table_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code table_id}
     * @param tableId The new value of the field {@code table_id}
     */
    public void tableId$set(byte tableId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("table_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tableId);
    }
    
    /**
     * Get the value of the field {@code subtable_extension}
     * @return The value of the field {@code subtable_extension}
     */
    public short subtableExtension$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("subtable_extension"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code subtable_extension}
     * @param subtableExtension The new value of the field {@code subtable_extension}
     */
    public void subtableExtension$set(short subtableExtension) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("subtable_extension"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), subtableExtension);
    }
    
    /**
     * Get the value of the field {@code version_number}
     * @return The value of the field {@code version_number}
     */
    public byte versionNumber$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("version_number"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code version_number}
     * @param versionNumber The new value of the field {@code version_number}
     */
    public void versionNumber$set(byte versionNumber) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("version_number"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), versionNumber);
    }
    
    /**
     * Get the value of the field {@code current_next_indicator}
     * @return The value of the field {@code current_next_indicator}
     */
    public boolean currentNextIndicator$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("current_next_indicator"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code current_next_indicator}
     * @param currentNextIndicator The new value of the field {@code current_next_indicator}
     */
    public void currentNextIndicator$set(boolean currentNextIndicator) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("current_next_indicator"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), currentNextIndicator ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code section_number}
     * @return The value of the field {@code section_number}
     */
    public byte sectionNumber$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("section_number"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code section_number}
     * @param sectionNumber The new value of the field {@code section_number}
     */
    public void sectionNumber$set(byte sectionNumber) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("section_number"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), sectionNumber);
    }
    
    /**
     * Get the value of the field {@code last_section_number}
     * @return The value of the field {@code last_section_number}
     */
    public byte lastSectionNumber$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("last_section_number"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code last_section_number}
     * @param lastSectionNumber The new value of the field {@code last_section_number}
     */
    public void lastSectionNumber$set(byte lastSectionNumber) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("last_section_number"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), lastSectionNumber);
    }
    
    /**
     * Get the value of the field {@code crc}
     * @return The value of the field {@code crc}
     */
    public int crc$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("crc"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code crc}
     * @param crc The new value of the field {@code crc}
     */
    public void crc$set(int crc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("crc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), crc);
    }
    
    /**
     * Create a Section proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Section(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(short pid, @NotNull byte[] data, long dataSize) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_new.invokeExact(
                    pid,
                    Interop.allocateNativeArray(data, false),
                    dataSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Section} from the provided {@code data}.
     * <p>
     * Note: Ensuring {@code data} is big enough to contain the full section is the
     * responsibility of the caller. If it is not big enough, {@code null} will be
     * returned.
     * <p>
     * Note: it is the responsibility of the caller to ensure {@code data} does point
     * to the beginning of the section.
     * @param pid the PID to which this section belongs
     * @param data a pointer to the beginning of
     * the section (i.e. the first byte should contain the {@code table_id} field).
     * @param dataSize size of the {@code data} argument.
     */
    public Section(short pid, @NotNull byte[] data, long dataSize) {
        super(constructNew(pid, data, dataSize), Ownership.FULL);
    }
    
    /**
     * Returns the {@link AtscVCT} contained in the {@code section}
     * @return The {@link AtscVCT} contained in the section, or {@code null} if an error
     * happened.
     */
    public @NotNull org.gstreamer.mpegts.AtscVCT getAtscCvct() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_atsc_cvct.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.AtscVCT(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@link AtscEIT} contained in the {@code section}.
     * @return The {@link AtscEIT} contained in the section, or {@code null} if an error
     * happened.
     */
    public @NotNull org.gstreamer.mpegts.AtscEIT getAtscEit() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_atsc_eit.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.AtscEIT(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@link AtscETT} contained in the {@code section}.
     * @return The {@link AtscETT} contained in the section, or {@code null} if an error
     * happened.
     */
    public @NotNull org.gstreamer.mpegts.AtscETT getAtscEtt() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_atsc_ett.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.AtscETT(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@link AtscMGT} contained in the {@code section}.
     * @return The {@link AtscMGT} contained in the section, or {@code null} if an error
     * happened.
     */
    public @NotNull org.gstreamer.mpegts.AtscMGT getAtscMgt() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_atsc_mgt.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.AtscMGT(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@link AtscRRT} contained in the {@code section}.
     * @return The {@link AtscRRT} contained in the section, or {@code null} if an error
     * happened.
     */
    public @NotNull org.gstreamer.mpegts.AtscRRT getAtscRrt() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_atsc_rrt.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.AtscRRT(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@link AtscSTT} contained in the {@code section}.
     * @return The {@link AtscSTT} contained in the section, or {@code null} if an error
     * happened.
     */
    public @NotNull org.gstreamer.mpegts.AtscSTT getAtscStt() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_atsc_stt.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.AtscSTT(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@link AtscVCT} contained in the {@code section}
     * @return The {@link AtscVCT} contained in the section, or {@code null} if an error
     * happened.
     */
    public @NotNull org.gstreamer.mpegts.AtscVCT getAtscTvct() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_atsc_tvct.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.AtscVCT(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@link BAT} contained in the {@code section}.
     * @return The {@link BAT} contained in the section, or {@code null} if an error
     * happened.
     */
    public @NotNull org.gstreamer.mpegts.BAT getBat() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_bat.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.BAT(RESULT, Ownership.NONE);
    }
    
    /**
     * Parses a Conditional Access Table.
     * <p>
     * Returns the array of {@link Descriptor} contained in the Conditional
     * Access Table.
     * @return The array
     * of {@link Descriptor} contained in the section, or {@code null} if an error
     * happened. Release with {@code g_array_unref} when done.
     */
    public @NotNull PointerProxy<org.gstreamer.mpegts.Descriptor> getCat() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_cat.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerProxy<org.gstreamer.mpegts.Descriptor>(RESULT, org.gstreamer.mpegts.Descriptor.class);
    }
    
    /**
     * Gets the original unparsed section data.
     * @return The original unparsed section data.
     */
    public @NotNull org.gtk.glib.Bytes getData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the {@link EIT} contained in the {@code section}.
     * @return The {@link EIT} contained in the section, or {@code null} if an error
     * happened.
     */
    public @NotNull org.gstreamer.mpegts.EIT getEit() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_eit.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.EIT(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@link NIT} contained in the {@code section}.
     * @return The {@link NIT} contained in the section, or {@code null} if an error
     * happened.
     */
    public @NotNull org.gstreamer.mpegts.NIT getNit() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_nit.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.NIT(RESULT, Ownership.NONE);
    }
    
    /**
     * Parses a Program Association Table (ITU H.222.0, ISO/IEC 13818-1).
     * <p>
     * Returns the array of {@link PatProgram} contained in the section.
     * <p>
     * Note: The PAT {@code transport_stream_id} field corresponds to the
     * "subtable_extension" field of the provided {@code section}.
     * @return The
     * {@link PatProgram} contained in the section, or {@code null} if an error happened
     * or the {@code section} did not contain a valid PAT. Release with {@code g_ptr_array_unref}
     * when done.
     */
    public @NotNull PointerProxy<org.gstreamer.mpegts.PatProgram> getPat() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_pat.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerProxy<org.gstreamer.mpegts.PatProgram>(RESULT, org.gstreamer.mpegts.PatProgram.class);
    }
    
    /**
     * Parses the Program Map Table contained in the {@code section}.
     * @return The {@link PMT} contained in the section, or {@code null} if an error
     * happened.
     */
    public @NotNull org.gstreamer.mpegts.PMT getPmt() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_pmt.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.PMT(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@link SCTESIT} contained in the {@code section}.
     * @return The {@link SCTESIT} contained in the section, or {@code null} if an error
     * happened.
     */
    public @NotNull org.gstreamer.mpegts.SCTESIT getScteSit() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_scte_sit.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.SCTESIT(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@link SDT} contained in the {@code section}.
     * @return The {@link SDT} contained in the section, or {@code null} if an error
     * happened.
     */
    public @NotNull org.gstreamer.mpegts.SDT getSdt() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_sdt.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.SDT(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@link SIT} contained in the {@code section}.
     * @return The {@link SIT} contained in the section, or {@code null} if an error
     * happened.
     */
    public @NotNull org.gstreamer.mpegts.SIT getSit() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_sit.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.SIT(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@link org.gstreamer.gst.DateTime} of the TDT
     * @return The {@link org.gstreamer.gst.DateTime} contained in the section, or {@code null}
     * if an error happened. Release with {@code gst_date_time_unref} when done.
     */
    public @NotNull org.gstreamer.gst.DateTime getTdt() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_tdt.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.DateTime(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the {@link TOT} contained in the {@code section}.
     * @return The {@link TOT} contained in the section, or {@code null} if an error
     * happened.
     */
    public @NotNull org.gstreamer.mpegts.TOT getTot() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_tot.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.TOT(RESULT, Ownership.NONE);
    }
    
    /**
     * Parses a Transport Stream Description Table.
     * <p>
     * Returns the array of {@link Descriptor} contained in the section
     * @return The array
     * of {@link Descriptor} contained in the section, or {@code null} if an error
     * happened. Release with {@code g_array_unref} when done.
     */
    public @NotNull PointerProxy<org.gstreamer.mpegts.Descriptor> getTsdt() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_tsdt.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerProxy<org.gstreamer.mpegts.Descriptor>(RESULT, org.gstreamer.mpegts.Descriptor.class);
    }
    
    /**
     * Packetize (i.e. serialize) the {@code section}. If the data in {@code section} has already
     * been packetized, the data pointer is returned immediately. Otherwise, the
     * data field is allocated and populated.
     * @param outputSize {@code gsize} to hold the size of the data
     * @return pointer to section data, or {@code null} on failure.
     */
    public PointerByte packetize(Out<Long> outputSize) {
        java.util.Objects.requireNonNull(outputSize, "Parameter 'outputSize' must not be null");
        MemorySegment outputSizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_packetize.invokeExact(
                    handle(),
                    (Addressable) outputSizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outputSize.set(outputSizePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return new PointerByte(RESULT);
    }
    
    /**
     * Creates a custom {@link org.gstreamer.gst.Event} with a {@code GstMpegtsSection} and send it the {@code element}
     * {@link org.gstreamer.gst.Element}.
     * @param element The {@link org.gstreamer.gst.Element} to send to section event to
     * @return {@code true} if the event was sent to the element.
     */
    public boolean sendEvent(@NotNull org.gstreamer.gst.Element element) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_section_send_event.invokeExact(
                    handle(),
                    element.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static @NotNull org.gstreamer.mpegts.Section fromAtscMgt(@NotNull org.gstreamer.mpegts.AtscMGT mgt) {
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
    
    public static @NotNull org.gstreamer.mpegts.Section fromAtscRrt(@NotNull org.gstreamer.mpegts.AtscRRT rrt) {
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
    
    public static @NotNull org.gstreamer.mpegts.Section fromAtscStt(@NotNull org.gstreamer.mpegts.AtscSTT stt) {
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
    public static @NotNull org.gstreamer.mpegts.Section fromNit(@NotNull org.gstreamer.mpegts.NIT nit) {
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
    public static @NotNull org.gstreamer.mpegts.Section fromPat(@NotNull org.gstreamer.mpegts.PatProgram[] programs, short tsId) {
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
    public static @NotNull org.gstreamer.mpegts.Section fromPmt(@NotNull org.gstreamer.mpegts.PMT pmt, short pid) {
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
    public static @NotNull org.gstreamer.mpegts.Section fromScteSit(@NotNull org.gstreamer.mpegts.SCTESIT sit, short pid) {
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
    public static @NotNull org.gstreamer.mpegts.Section fromSdt(@NotNull org.gstreamer.mpegts.SDT sdt) {
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
        
        private static final MethodHandle gst_mpegts_section_new = Interop.downcallHandle(
            "gst_mpegts_section_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_atsc_cvct = Interop.downcallHandle(
            "gst_mpegts_section_get_atsc_cvct",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_atsc_eit = Interop.downcallHandle(
            "gst_mpegts_section_get_atsc_eit",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_atsc_ett = Interop.downcallHandle(
            "gst_mpegts_section_get_atsc_ett",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_atsc_mgt = Interop.downcallHandle(
            "gst_mpegts_section_get_atsc_mgt",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_atsc_rrt = Interop.downcallHandle(
            "gst_mpegts_section_get_atsc_rrt",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_atsc_stt = Interop.downcallHandle(
            "gst_mpegts_section_get_atsc_stt",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_atsc_tvct = Interop.downcallHandle(
            "gst_mpegts_section_get_atsc_tvct",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_bat = Interop.downcallHandle(
            "gst_mpegts_section_get_bat",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_cat = Interop.downcallHandle(
            "gst_mpegts_section_get_cat",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_data = Interop.downcallHandle(
            "gst_mpegts_section_get_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_eit = Interop.downcallHandle(
            "gst_mpegts_section_get_eit",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_nit = Interop.downcallHandle(
            "gst_mpegts_section_get_nit",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_pat = Interop.downcallHandle(
            "gst_mpegts_section_get_pat",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_pmt = Interop.downcallHandle(
            "gst_mpegts_section_get_pmt",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_scte_sit = Interop.downcallHandle(
            "gst_mpegts_section_get_scte_sit",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_sdt = Interop.downcallHandle(
            "gst_mpegts_section_get_sdt",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_sit = Interop.downcallHandle(
            "gst_mpegts_section_get_sit",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_tdt = Interop.downcallHandle(
            "gst_mpegts_section_get_tdt",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_tot = Interop.downcallHandle(
            "gst_mpegts_section_get_tot",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_get_tsdt = Interop.downcallHandle(
            "gst_mpegts_section_get_tsdt",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_packetize = Interop.downcallHandle(
            "gst_mpegts_section_packetize",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_section_send_event = Interop.downcallHandle(
            "gst_mpegts_section_send_event",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
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

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Section struct;
        
         /**
         * A {@link Section.Build} object constructs a {@link Section} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Section.allocate();
        }
        
         /**
         * Finish building the {@link Section} struct.
         * @return A new instance of {@code Section} with the fields 
         *         that were set in the Build object.
         */
        public Section construct() {
            return struct;
        }
        
        public Build setParent(org.gstreamer.gst.MiniObject parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        /**
         * The type of section.
         * @param sectionType The value for the {@code sectionType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSectionType(org.gstreamer.mpegts.SectionType sectionType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("section_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sectionType == null ? MemoryAddress.NULL : sectionType.getValue()));
            return this;
        }
        
        /**
         * The PID on which this section was found or belongs to.
         * @param pid The value for the {@code pid} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPid(short pid) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pid"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), pid);
            return this;
        }
        
        /**
         * The table id of this section. See {@code GstMpegtsSectionTableID} and
         *      derivates for more information.
         * @param tableId The value for the {@code tableId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTableId(byte tableId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("table_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), tableId);
            return this;
        }
        
        /**
         * This meaning differs per section. See the documentation
         *      of the parsed section type for the meaning of this field
         * @param subtableExtension The value for the {@code subtableExtension} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSubtableExtension(short subtableExtension) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("subtable_extension"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), subtableExtension);
            return this;
        }
        
        /**
         * Version of the section.
         * @param versionNumber The value for the {@code versionNumber} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVersionNumber(byte versionNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("version_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), versionNumber);
            return this;
        }
        
        /**
         * Applies to current/next stream or not
         * @param currentNextIndicator The value for the {@code currentNextIndicator} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCurrentNextIndicator(boolean currentNextIndicator) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("current_next_indicator"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), currentNextIndicator ? 1 : 0);
            return this;
        }
        
        /**
         * Number of the section (if multiple)
         * @param sectionNumber The value for the {@code sectionNumber} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSectionNumber(byte sectionNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("section_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), sectionNumber);
            return this;
        }
        
        /**
         * Number of the last expected section (if multiple)
         * @param lastSectionNumber The value for the {@code lastSectionNumber} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLastSectionNumber(byte lastSectionNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("last_section_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), lastSectionNumber);
            return this;
        }
        
        /**
         * Checksum (if applicable)
         * @param crc The value for the {@code crc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCrc(int crc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("crc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), crc);
            return this;
        }
        
        public Build setData(PointerByte data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : data.handle()));
            return this;
        }
        
        public Build setSectionLength(int sectionLength) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("section_length"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), sectionLength);
            return this;
        }
        
        public Build setCachedParsed(java.lang.foreign.MemoryAddress cachedParsed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cached_parsed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cachedParsed == null ? MemoryAddress.NULL : (Addressable) cachedParsed));
            return this;
        }
        
        public Build setDestroyParsed(java.lang.foreign.MemoryAddress destroyParsed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("destroy_parsed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (destroyParsed == null ? MemoryAddress.NULL : destroyParsed));
            return this;
        }
        
        public Build setOffset(long offset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), offset);
            return this;
        }
        
        public Build setShortSection(boolean shortSection) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("short_section"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), shortSection ? 1 : 0);
            return this;
        }
        
        public Build setPacketizer(java.lang.foreign.MemoryAddress packetizer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("packetizer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (packetizer == null ? MemoryAddress.NULL : packetizer));
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
