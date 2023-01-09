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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Section}
     * @return A new, uninitialized @{link Section}
     */
    public static Section allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Section newInstance = new Section(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code section_type}
     * @return The value of the field {@code section_type}
     */
    public org.gstreamer.mpegts.SectionType getSectionType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("section_type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.mpegts.SectionType.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code section_type}
     * @param sectionType The new value of the field {@code section_type}
     */
    public void setSectionType(org.gstreamer.mpegts.SectionType sectionType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("section_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sectionType == null ? MemoryAddress.NULL : sectionType.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code pid}
     * @return The value of the field {@code pid}
     */
    public short getPid() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pid"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code pid}
     * @param pid The new value of the field {@code pid}
     */
    public void setPid(short pid) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pid"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), pid);
        }
    }
    
    /**
     * Get the value of the field {@code table_id}
     * @return The value of the field {@code table_id}
     */
    public byte getTableId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("table_id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code table_id}
     * @param tableId The new value of the field {@code table_id}
     */
    public void setTableId(byte tableId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("table_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), tableId);
        }
    }
    
    /**
     * Get the value of the field {@code subtable_extension}
     * @return The value of the field {@code subtable_extension}
     */
    public short getSubtableExtension() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("subtable_extension"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code subtable_extension}
     * @param subtableExtension The new value of the field {@code subtable_extension}
     */
    public void setSubtableExtension(short subtableExtension) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("subtable_extension"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), subtableExtension);
        }
    }
    
    /**
     * Get the value of the field {@code version_number}
     * @return The value of the field {@code version_number}
     */
    public byte getVersionNumber() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("version_number"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code version_number}
     * @param versionNumber The new value of the field {@code version_number}
     */
    public void setVersionNumber(byte versionNumber) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("version_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), versionNumber);
        }
    }
    
    /**
     * Get the value of the field {@code current_next_indicator}
     * @return The value of the field {@code current_next_indicator}
     */
    public boolean getCurrentNextIndicator() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("current_next_indicator"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code current_next_indicator}
     * @param currentNextIndicator The new value of the field {@code current_next_indicator}
     */
    public void setCurrentNextIndicator(boolean currentNextIndicator) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("current_next_indicator"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(currentNextIndicator, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code section_number}
     * @return The value of the field {@code section_number}
     */
    public byte getSectionNumber() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("section_number"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code section_number}
     * @param sectionNumber The new value of the field {@code section_number}
     */
    public void setSectionNumber(byte sectionNumber) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("section_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), sectionNumber);
        }
    }
    
    /**
     * Get the value of the field {@code last_section_number}
     * @return The value of the field {@code last_section_number}
     */
    public byte getLastSectionNumber() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("last_section_number"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code last_section_number}
     * @param lastSectionNumber The new value of the field {@code last_section_number}
     */
    public void setLastSectionNumber(byte lastSectionNumber) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("last_section_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), lastSectionNumber);
        }
    }
    
    /**
     * Get the value of the field {@code crc}
     * @return The value of the field {@code crc}
     */
    public int getCrc() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("crc"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code crc}
     * @param crc The new value of the field {@code crc}
     */
    public void setCrc(int crc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("crc"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), crc);
        }
    }
    
    /**
     * Create a Section proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Section(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Section> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Section(input);
    
    private static MemoryAddress constructNew(short pid, byte[] data, long dataSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_new.invokeExact(
                        pid,
                        Interop.allocateNativeArray(data, false, SCOPE),
                        dataSize);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
    public Section(short pid, byte[] data, long dataSize) {
        super(constructNew(pid, data, dataSize));
        this.takeOwnership();
    }
    
    /**
     * Returns the {@link AtscVCT} contained in the {@code section}
     * @return The {@link AtscVCT} contained in the section, or {@code null} if an error
     * happened.
     */
    public org.gstreamer.mpegts.AtscVCT getAtscCvct() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_atsc_cvct.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.AtscVCT.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the {@link AtscEIT} contained in the {@code section}.
     * @return The {@link AtscEIT} contained in the section, or {@code null} if an error
     * happened.
     */
    public org.gstreamer.mpegts.AtscEIT getAtscEit() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_atsc_eit.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.AtscEIT.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the {@link AtscETT} contained in the {@code section}.
     * @return The {@link AtscETT} contained in the section, or {@code null} if an error
     * happened.
     */
    public org.gstreamer.mpegts.AtscETT getAtscEtt() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_atsc_ett.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.AtscETT.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the {@link AtscMGT} contained in the {@code section}.
     * @return The {@link AtscMGT} contained in the section, or {@code null} if an error
     * happened.
     */
    public org.gstreamer.mpegts.AtscMGT getAtscMgt() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_atsc_mgt.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.AtscMGT.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the {@link AtscRRT} contained in the {@code section}.
     * @return The {@link AtscRRT} contained in the section, or {@code null} if an error
     * happened.
     */
    public org.gstreamer.mpegts.AtscRRT getAtscRrt() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_atsc_rrt.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.AtscRRT.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the {@link AtscSTT} contained in the {@code section}.
     * @return The {@link AtscSTT} contained in the section, or {@code null} if an error
     * happened.
     */
    public org.gstreamer.mpegts.AtscSTT getAtscStt() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_atsc_stt.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.AtscSTT.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the {@link AtscVCT} contained in the {@code section}
     * @return The {@link AtscVCT} contained in the section, or {@code null} if an error
     * happened.
     */
    public org.gstreamer.mpegts.AtscVCT getAtscTvct() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_atsc_tvct.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.AtscVCT.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the {@link BAT} contained in the {@code section}.
     * @return The {@link BAT} contained in the section, or {@code null} if an error
     * happened.
     */
    public org.gstreamer.mpegts.BAT getBat() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_bat.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.BAT.fromAddress.marshal(RESULT, null);
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
    public PointerProxy<org.gstreamer.mpegts.Descriptor> getCat() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_cat.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerProxy<org.gstreamer.mpegts.Descriptor>(RESULT, org.gstreamer.mpegts.Descriptor.fromAddress);
        }
    }
    
    /**
     * Gets the original unparsed section data.
     * @return The original unparsed section data.
     */
    public org.gtk.glib.Bytes getData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_data.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Bytes.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns the {@link EIT} contained in the {@code section}.
     * @return The {@link EIT} contained in the section, or {@code null} if an error
     * happened.
     */
    public org.gstreamer.mpegts.EIT getEit() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_eit.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.EIT.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the {@link NIT} contained in the {@code section}.
     * @return The {@link NIT} contained in the section, or {@code null} if an error
     * happened.
     */
    public org.gstreamer.mpegts.NIT getNit() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_nit.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.NIT.fromAddress.marshal(RESULT, null);
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
    public PointerProxy<org.gstreamer.mpegts.PatProgram> getPat() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_pat.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerProxy<org.gstreamer.mpegts.PatProgram>(RESULT, org.gstreamer.mpegts.PatProgram.fromAddress);
        }
    }
    
    /**
     * Parses the Program Map Table contained in the {@code section}.
     * @return The {@link PMT} contained in the section, or {@code null} if an error
     * happened.
     */
    public org.gstreamer.mpegts.PMT getPmt() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_pmt.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.PMT.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the {@link SCTESIT} contained in the {@code section}.
     * @return The {@link SCTESIT} contained in the section, or {@code null} if an error
     * happened.
     */
    public org.gstreamer.mpegts.SCTESIT getScteSit() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_scte_sit.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.SCTESIT.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the {@link SDT} contained in the {@code section}.
     * @return The {@link SDT} contained in the section, or {@code null} if an error
     * happened.
     */
    public org.gstreamer.mpegts.SDT getSdt() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_sdt.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.SDT.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the {@link SIT} contained in the {@code section}.
     * @return The {@link SIT} contained in the section, or {@code null} if an error
     * happened.
     */
    public org.gstreamer.mpegts.SIT getSit() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_sit.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.SIT.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the {@link org.gstreamer.gst.DateTime} of the TDT
     * @return The {@link org.gstreamer.gst.DateTime} contained in the section, or {@code null}
     * if an error happened. Release with {@code gst_date_time_unref} when done.
     */
    public org.gstreamer.gst.DateTime getTdt() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_tdt.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.DateTime.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns the {@link TOT} contained in the {@code section}.
     * @return The {@link TOT} contained in the section, or {@code null} if an error
     * happened.
     */
    public org.gstreamer.mpegts.TOT getTot() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_tot.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.TOT.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Parses a Transport Stream Description Table.
     * <p>
     * Returns the array of {@link Descriptor} contained in the section
     * @return The array
     * of {@link Descriptor} contained in the section, or {@code null} if an error
     * happened. Release with {@code g_array_unref} when done.
     */
    public PointerProxy<org.gstreamer.mpegts.Descriptor> getTsdt() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_get_tsdt.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerProxy<org.gstreamer.mpegts.Descriptor>(RESULT, org.gstreamer.mpegts.Descriptor.fromAddress);
        }
    }
    
    /**
     * Packetize (i.e. serialize) the {@code section}. If the data in {@code section} has already
     * been packetized, the data pointer is returned immediately. Otherwise, the
     * data field is allocated and populated.
     * @param outputSize {@code gsize} to hold the size of the data
     * @return pointer to section data, or {@code null} on failure.
     */
    public PointerByte packetize(Out<Long> outputSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment outputSizePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
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
    }
    
    /**
     * Creates a custom {@link org.gstreamer.gst.Event} with a {@code GstMpegtsSection} and send it the {@code element}
     * {@link org.gstreamer.gst.Element}.
     * @param element The {@link org.gstreamer.gst.Element} to send to section event to
     * @return {@code true} if the event was sent to the element.
     */
    public boolean sendEvent(org.gstreamer.gst.Element element) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_section_send_event.invokeExact(
                    handle(),
                    element.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public static org.gstreamer.mpegts.Section fromAtscMgt(org.gstreamer.mpegts.AtscMGT mgt) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_atsc_mgt.invokeExact(mgt.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        mgt.yieldOwnership();
        var OBJECT = org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public static org.gstreamer.mpegts.Section fromAtscRrt(org.gstreamer.mpegts.AtscRRT rrt) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_atsc_rrt.invokeExact(rrt.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public static org.gstreamer.mpegts.Section fromAtscStt(org.gstreamer.mpegts.AtscSTT stt) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_atsc_stt.invokeExact(stt.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Ownership of {@code nit} is taken. The data in {@code nit} is managed by the {@link Section}
     * @param nit a {@link NIT} to create the {@link Section} from
     * @return the {@link Section}
     */
    public static org.gstreamer.mpegts.Section fromNit(org.gstreamer.mpegts.NIT nit) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_nit.invokeExact(nit.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nit.yieldOwnership();
        var OBJECT = org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Creates a PAT {@link Section} from the {@code programs} array of {@code GstMpegtsPatPrograms}
     * @param programs an array of {@link PatProgram}
     * @param tsId Transport stream ID of the PAT
     * @return a {@link Section}
     */
    public static org.gstreamer.mpegts.Section fromPat(org.gstreamer.mpegts.PatProgram[] programs, short tsId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_pat.invokeExact(
                        Interop.allocateNativeArray(programs, org.gstreamer.mpegts.PatProgram.getMemoryLayout(), false, SCOPE),
                        tsId);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Creates a {@link Section} from {@code pmt} that is bound to {@code pid}
     * @param pmt a {@link PMT} to create a {@link Section} from
     * @param pid The PID that the {@link PMT} belongs to
     * @return {@link Section}
     */
    public static org.gstreamer.mpegts.Section fromPmt(org.gstreamer.mpegts.PMT pmt, short pid) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_pmt.invokeExact(
                    pmt.handle(),
                    pid);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        pmt.yieldOwnership();
        var OBJECT = org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Ownership of {@code sit} is taken. The data in {@code sit} is managed by the {@link Section}
     * @param sit a {@link SCTESIT} to create the {@link Section} from
     * @return the {@link Section}
     */
    public static org.gstreamer.mpegts.Section fromScteSit(org.gstreamer.mpegts.SCTESIT sit, short pid) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_scte_sit.invokeExact(
                    sit.handle(),
                    pid);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sit.yieldOwnership();
        var OBJECT = org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Ownership of {@code sdt} is taken. The data in {@code sdt} is managed by the {@link Section}
     * @param sdt a {@link SDT} to create the {@link Section} from
     * @return the {@link Section}
     */
    public static org.gstreamer.mpegts.Section fromSdt(org.gstreamer.mpegts.SDT sdt) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_section_from_sdt.invokeExact(sdt.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sdt.yieldOwnership();
        var OBJECT = org.gstreamer.mpegts.Section.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
     * A {@link Section.Builder} object constructs a {@link Section} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Section.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Section struct;
        
        private Builder() {
            struct = Section.allocate();
        }
        
        /**
         * Finish building the {@link Section} struct.
         * @return A new instance of {@code Section} with the fields 
         *         that were set in the Builder object.
         */
        public Section build() {
            return struct;
        }
        
        public Builder setParent(org.gstreamer.gst.MiniObject parent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
                return this;
            }
        }
        
        /**
         * The type of section.
         * @param sectionType The value for the {@code sectionType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSectionType(org.gstreamer.mpegts.SectionType sectionType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("section_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sectionType == null ? MemoryAddress.NULL : sectionType.getValue()));
                return this;
            }
        }
        
        /**
         * The PID on which this section was found or belongs to.
         * @param pid The value for the {@code pid} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPid(short pid) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pid"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), pid);
                return this;
            }
        }
        
        /**
         * The table id of this section. See {@code GstMpegtsSectionTableID} and
         *      derivates for more information.
         * @param tableId The value for the {@code tableId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTableId(byte tableId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("table_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), tableId);
                return this;
            }
        }
        
        /**
         * This meaning differs per section. See the documentation
         *      of the parsed section type for the meaning of this field
         * @param subtableExtension The value for the {@code subtableExtension} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSubtableExtension(short subtableExtension) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("subtable_extension"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), subtableExtension);
                return this;
            }
        }
        
        /**
         * Version of the section.
         * @param versionNumber The value for the {@code versionNumber} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVersionNumber(byte versionNumber) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("version_number"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), versionNumber);
                return this;
            }
        }
        
        /**
         * Applies to current/next stream or not
         * @param currentNextIndicator The value for the {@code currentNextIndicator} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCurrentNextIndicator(boolean currentNextIndicator) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("current_next_indicator"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(currentNextIndicator, null).intValue());
                return this;
            }
        }
        
        /**
         * Number of the section (if multiple)
         * @param sectionNumber The value for the {@code sectionNumber} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSectionNumber(byte sectionNumber) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("section_number"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), sectionNumber);
                return this;
            }
        }
        
        /**
         * Number of the last expected section (if multiple)
         * @param lastSectionNumber The value for the {@code lastSectionNumber} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLastSectionNumber(byte lastSectionNumber) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("last_section_number"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), lastSectionNumber);
                return this;
            }
        }
        
        /**
         * Checksum (if applicable)
         * @param crc The value for the {@code crc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCrc(int crc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("crc"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), crc);
                return this;
            }
        }
        
        public Builder setData(PointerByte data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : data.handle()));
                return this;
            }
        }
        
        public Builder setSectionLength(int sectionLength) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("section_length"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), sectionLength);
                return this;
            }
        }
        
        public Builder setCachedParsed(java.lang.foreign.MemoryAddress cachedParsed) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("cached_parsed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (cachedParsed == null ? MemoryAddress.NULL : (Addressable) cachedParsed));
                return this;
            }
        }
        
        public Builder setDestroyParsed(org.gtk.glib.DestroyNotify destroyParsed) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("destroy_parsed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (destroyParsed == null ? MemoryAddress.NULL : (Addressable) destroyParsed.toCallback()));
                return this;
            }
        }
        
        public Builder setOffset(long offset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), offset);
                return this;
            }
        }
        
        public Builder setShortSection(boolean shortSection) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("short_section"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(shortSection, null).intValue());
                return this;
            }
        }
        
        public Builder setPacketizer(org.gstreamer.mpegts.PacketizeFunc packetizer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("packetizer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (packetizer == null ? MemoryAddress.NULL : (Addressable) packetizer.toCallback()));
                return this;
            }
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
                return this;
            }
        }
    }
}
