package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * These are the base descriptor types and methods.
 * <p>
 * For more details, refer to the ITU H.222.0 or ISO/IEC 13818-1 specifications
 * and other specifications mentioned in the documentation.
 */
public class Descriptor extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDescriptor";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("tag"),
            Interop.valueLayout.C_BYTE.withName("tag_extension"),
            Interop.valueLayout.C_BYTE.withName("length"),
            MemoryLayout.paddingLayout(40),
            Interop.valueLayout.ADDRESS.withName("data"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Descriptor}
     * @return A new, uninitialized @{link Descriptor}
     */
    public static Descriptor allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Descriptor newInstance = new Descriptor(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code tag}
     * @return The value of the field {@code tag}
     */
    public byte getTag() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tag"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code tag}
     * @param tag The new value of the field {@code tag}
     */
    public void setTag(byte tag) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), tag);
        }
    }
    
    /**
     * Get the value of the field {@code tag_extension}
     * @return The value of the field {@code tag_extension}
     */
    public byte getTagExtension() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tag_extension"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code tag_extension}
     * @param tagExtension The new value of the field {@code tag_extension}
     */
    public void setTagExtension(byte tagExtension) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tag_extension"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), tagExtension);
        }
    }
    
    /**
     * Get the value of the field {@code length}
     * @return The value of the field {@code length}
     */
    public byte getLength() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("length"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code length}
     * @param length The new value of the field {@code length}
     */
    public void setLength(byte length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("length"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), length);
        }
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public PointerByte getData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(PointerByte data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : data.handle()));
        }
    }
    
    /**
     * Create a Descriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Descriptor(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Descriptor> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Descriptor(input);
    
    /**
     * Frees {@code desc}
     */
    public void free() {
        try {
            DowncallHandles.gst_mpegts_descriptor_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Parses out a list of audio preselection from the {@code descriptor}.
     * @param list the list of audio preselection
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseAudioPreselectionList(org.gstreamer.mpegts.AudioPreselectionDescriptor[] list) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_audio_preselection_list.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(list, org.gstreamer.mpegts.AudioPreselectionDescriptor.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Extracts the Conditional Access information from {@code descriptor}.
     * @param caSystemId the type of CA system used
     * @param caPid The PID containing ECM or EMM data
     * @param privateData The private data
     * @param privateDataSize The size of {@code private_data} in bytes
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseCa(Out<Short> caSystemId, Out<Short> caPid, Out<byte[]> privateData, Out<Long> privateDataSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment caSystemIdPOINTER = SCOPE.allocate(Interop.valueLayout.C_SHORT);
            MemorySegment caPidPOINTER = SCOPE.allocate(Interop.valueLayout.C_SHORT);
            MemorySegment privateDataPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment privateDataSizePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_ca.invokeExact(
                        handle(),
                        (Addressable) caSystemIdPOINTER.address(),
                        (Addressable) caPidPOINTER.address(),
                        (Addressable) (privateData == null ? MemoryAddress.NULL : (Addressable) privateDataPOINTER.address()),
                        (Addressable) (privateDataSize == null ? MemoryAddress.NULL : (Addressable) privateDataSizePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    caSystemId.set(caSystemIdPOINTER.get(Interop.valueLayout.C_SHORT, 0));
                    caPid.set(caPidPOINTER.get(Interop.valueLayout.C_SHORT, 0));
                    if (privateDataSize != null) privateDataSize.set(privateDataSizePOINTER.get(Interop.valueLayout.C_LONG, 0));
            privateData.set(MemorySegment.ofAddress(privateDataPOINTER.get(Interop.valueLayout.ADDRESS, 0), privateDataSize.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Extracts the cable delivery system information from {@code descriptor}.
     * @param res the {@link CableDeliverySystemDescriptor} to fill
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseCableDeliverySystem(org.gstreamer.mpegts.CableDeliverySystemDescriptor res) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_cable_delivery_system.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Extracts the bouquet name from {@code descriptor}.
     * @param bouquetName the bouquet name
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseDvbBouquetName(@Nullable Out<java.lang.String> bouquetName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment bouquetNamePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_bouquet_name.invokeExact(
                        handle(),
                        (Addressable) (bouquetName == null ? MemoryAddress.NULL : (Addressable) bouquetNamePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (bouquetName != null) bouquetName.set(Marshal.addressToString.marshal(bouquetNamePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Extracts ca id's from {@code descriptor}.
     * @param list a list of ca identifier.
     * Edge entry identifies the CA system. Allocations of the value of this field
     * are found in http://www.dvbservices.com
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbCaIdentifier(short[] list) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_ca_identifier.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(list, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Extracts the DVB component information from {@code descriptor}.
     * @param res the {@link ComponentDescriptor} to fill
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseDvbComponent(Out<org.gstreamer.mpegts.ComponentDescriptor> res) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment resPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_component.invokeExact(
                        handle(),
                        (Addressable) resPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    res.set(org.gstreamer.mpegts.ComponentDescriptor.fromAddress.marshal(resPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Extracts the DVB content information from {@code descriptor}.
     * @param content {@link Content}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbContent(org.gstreamer.mpegts.Content[] content) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_content.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(content, org.gstreamer.mpegts.Content.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parses out the data broadcast from the {@code descriptor}.
     * @param res {@link DataBroadcastDescriptor}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbDataBroadcast(Out<org.gstreamer.mpegts.DataBroadcastDescriptor> res) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment resPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_data_broadcast.invokeExact(
                        handle(),
                        (Addressable) resPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    res.set(org.gstreamer.mpegts.DataBroadcastDescriptor.fromAddress.marshal(resPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parses out the data broadcast id from the {@code descriptor}.
     * @param dataBroadcastId the data broadcast id
     * @param idSelectorBytes the selector bytes, if present
     * @param len the length of {@code id_selector_bytes}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbDataBroadcastId(Out<Short> dataBroadcastId, Out<byte[]> idSelectorBytes, Out<Byte> len) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment dataBroadcastIdPOINTER = SCOPE.allocate(Interop.valueLayout.C_SHORT);
            MemorySegment idSelectorBytesPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment lenPOINTER = SCOPE.allocate(Interop.valueLayout.C_BYTE);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_data_broadcast_id.invokeExact(
                        handle(),
                        (Addressable) dataBroadcastIdPOINTER.address(),
                        (Addressable) idSelectorBytesPOINTER.address(),
                        (Addressable) lenPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    dataBroadcastId.set(dataBroadcastIdPOINTER.get(Interop.valueLayout.C_SHORT, 0));
                    len.set(lenPOINTER.get(Interop.valueLayout.C_BYTE, 0));
            idSelectorBytes.set(MemorySegment.ofAddress(idSelectorBytesPOINTER.get(Interop.valueLayout.ADDRESS, 0), len.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Extracts the DVB extended event information from {@code descriptor}.
     * @param res the {@link ExtendedEventDescriptor} to fill
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseDvbExtendedEvent(Out<org.gstreamer.mpegts.ExtendedEventDescriptor> res) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment resPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_extended_event.invokeExact(
                        handle(),
                        (Addressable) resPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    res.set(org.gstreamer.mpegts.ExtendedEventDescriptor.fromAddress.marshal(resPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parses out a list of frequencies from the {@code descriptor}.
     * @param offset {@code false} in Hz, {@code true} in kHz
     * @param list a list of all frequencies in Hz/kHz
     * depending on {@code offset}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbFrequencyList(Out<Boolean> offset, int[] list) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment offsetPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_frequency_list.invokeExact(
                        handle(),
                        (Addressable) offsetPOINTER.address(),
                        Interop.allocateNativeArray(list, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    offset.set(offsetPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Extracts the DVB linkage information from {@code descriptor}.
     * @param res the {@link DVBLinkageDescriptor} to fill
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseDvbLinkage(Out<org.gstreamer.mpegts.DVBLinkageDescriptor> res) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment resPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_linkage.invokeExact(
                        handle(),
                        (Addressable) resPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    res.set(org.gstreamer.mpegts.DVBLinkageDescriptor.fromAddress.marshal(resPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parses out the multilingual bouquet name from the {@code descriptor}.
     * @param bouquetNameItems a {@link DvbMultilingualBouquetNameItem}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbMultilingualBouquetName(org.gstreamer.mpegts.DvbMultilingualBouquetNameItem[] bouquetNameItems) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_multilingual_bouquet_name.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(bouquetNameItems, org.gstreamer.mpegts.DvbMultilingualBouquetNameItem.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parses out the multilingual component from the {@code descriptor}.
     * @param componentTag the component tag
     * @param componentDescriptionItems a {@link DvbMultilingualComponentItem}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbMultilingualComponent(Out<Byte> componentTag, org.gstreamer.mpegts.DvbMultilingualComponentItem[] componentDescriptionItems) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment componentTagPOINTER = SCOPE.allocate(Interop.valueLayout.C_BYTE);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_multilingual_component.invokeExact(
                        handle(),
                        (Addressable) componentTagPOINTER.address(),
                        Interop.allocateNativeArray(componentDescriptionItems, org.gstreamer.mpegts.DvbMultilingualComponentItem.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    componentTag.set(componentTagPOINTER.get(Interop.valueLayout.C_BYTE, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parses out the multilingual network name from the {@code descriptor}.
     * @param networkNameItems a {@link DvbMultilingualNetworkNameItem}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbMultilingualNetworkName(org.gstreamer.mpegts.DvbMultilingualNetworkNameItem[] networkNameItems) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_multilingual_network_name.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(networkNameItems, org.gstreamer.mpegts.DvbMultilingualNetworkNameItem.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parses out the multilingual service name from the {@code descriptor}.
     * @param serviceNameItems a {@link DvbMultilingualServiceNameItem}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbMultilingualServiceName(org.gstreamer.mpegts.DvbMultilingualServiceNameItem[] serviceNameItems) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_multilingual_service_name.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(serviceNameItems, org.gstreamer.mpegts.DvbMultilingualServiceNameItem.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parses out the dvb network name from the {@code descriptor}:
     * @param name the extracted name
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbNetworkName(Out<java.lang.String> name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment namePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_network_name.invokeExact(
                        handle(),
                        (Addressable) namePOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    name.set(Marshal.addressToString.marshal(namePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Extracts the DVB parental rating information from {@code descriptor}.
     * @param rating {@link DVBParentalRatingItem}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbParentalRating(org.gstreamer.mpegts.DVBParentalRatingItem[] rating) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_parental_rating.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(rating, org.gstreamer.mpegts.DVBParentalRatingItem.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parses out the private data specifier from the {@code descriptor}.
     * @param privateDataSpecifier the private data specifier id
     * registered by http://www.dvbservices.com/
     * @param privateData additional data or NULL
     * @param length length of {@code private_data}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbPrivateDataSpecifier(Out<Integer> privateDataSpecifier, Out<byte[]> privateData, Out<Byte> length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment privateDataSpecifierPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment privateDataPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_BYTE);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_private_data_specifier.invokeExact(
                        handle(),
                        (Addressable) privateDataSpecifierPOINTER.address(),
                        (Addressable) (privateData == null ? MemoryAddress.NULL : (Addressable) privateDataPOINTER.address()),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    privateDataSpecifier.set(privateDataSpecifierPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_BYTE, 0));
            privateData.set(MemorySegment.ofAddress(privateDataPOINTER.get(Interop.valueLayout.ADDRESS, 0), length.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parses out the scrambling mode from the {@code descriptor}.
     * @param scramblingMode This 8-bit field identifies the selected
     * mode of the scrambling algorithm ({@link DVBScramblingModeType}).
     * The technical details of the scrambling algorithm are available only
     * to bona-fide users upon signature of a Non Disclosure Agreement (NDA)
     * administered by the DVB Common Scrambling Algorithm Custodian.
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbScrambling(Out<org.gstreamer.mpegts.DVBScramblingModeType> scramblingMode) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment scramblingModePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_scrambling.invokeExact(
                        handle(),
                        (Addressable) scramblingModePOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    scramblingMode.set(org.gstreamer.mpegts.DVBScramblingModeType.of(scramblingModePOINTER.get(Interop.valueLayout.C_INT, 0)));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Extracts the dvb service information from {@code descriptor}.
     * @param serviceType the service type
     * @param serviceName the service name
     * @param providerName the provider name
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseDvbService(@Nullable Out<org.gstreamer.mpegts.DVBServiceType> serviceType, @Nullable Out<java.lang.String> serviceName, @Nullable Out<java.lang.String> providerName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment serviceTypePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment serviceNamePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment providerNamePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_service.invokeExact(
                        handle(),
                        (Addressable) (serviceType == null ? MemoryAddress.NULL : (Addressable) serviceTypePOINTER.address()),
                        (Addressable) (serviceName == null ? MemoryAddress.NULL : (Addressable) serviceNamePOINTER.address()),
                        (Addressable) (providerName == null ? MemoryAddress.NULL : (Addressable) providerNamePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (serviceType != null) serviceType.set(org.gstreamer.mpegts.DVBServiceType.of(serviceTypePOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (serviceName != null) serviceName.set(Marshal.addressToString.marshal(serviceNamePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (providerName != null) providerName.set(Marshal.addressToString.marshal(providerNamePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parses out a list of services from the {@code descriptor}:
     * @param list the list of services
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbServiceList(org.gstreamer.mpegts.DVBServiceListItem[] list) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_service_list.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(list, org.gstreamer.mpegts.DVBServiceListItem.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Extracts the DVB short event information from {@code descriptor}.
     * @param languageCode the language code
     * @param eventName the event name
     * @param text the event text
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseDvbShortEvent(@Nullable Out<java.lang.String> languageCode, @Nullable Out<java.lang.String> eventName, @Nullable Out<java.lang.String> text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment languageCodePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment eventNamePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment textPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_short_event.invokeExact(
                        handle(),
                        (Addressable) (languageCode == null ? MemoryAddress.NULL : (Addressable) languageCodePOINTER.address()),
                        (Addressable) (eventName == null ? MemoryAddress.NULL : (Addressable) eventNamePOINTER.address()),
                        (Addressable) (text == null ? MemoryAddress.NULL : (Addressable) textPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (languageCode != null) languageCode.set(Marshal.addressToString.marshal(languageCodePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (eventName != null) eventName.set(Marshal.addressToString.marshal(eventNamePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (text != null) text.set(Marshal.addressToString.marshal(textPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Extracts the component tag from {@code descriptor}.
     * @param componentTag the component tag
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbStreamIdentifier(Out<Byte> componentTag) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment componentTagPOINTER = SCOPE.allocate(Interop.valueLayout.C_BYTE);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_stream_identifier.invokeExact(
                        handle(),
                        (Addressable) componentTagPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    componentTag.set(componentTagPOINTER.get(Interop.valueLayout.C_BYTE, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parses out the stuffing bytes from the {@code descriptor}.
     * @param stuffingBytes the stuffing bytes
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbStuffing(Out<Byte> stuffingBytes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment stuffingBytesPOINTER = SCOPE.allocate(Interop.valueLayout.C_BYTE);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_stuffing.invokeExact(
                        handle(),
                        (Addressable) stuffingBytesPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    stuffingBytes.set(stuffingBytesPOINTER.get(Interop.valueLayout.C_BYTE, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Extracts the DVB subtitling informatio from specific table id in {@code descriptor}.
     * <p>
     * Note: Use {@code gst_tag_get_language_code} if you want to get the the
     * ISO 639-1 language code from the returned ISO 639-2 one.
     * @param idx Table id of the entry to parse
     * @param lang the language code
     * @param type the type of subtitling
     * @param compositionPageId the composition page id
     * @param ancillaryPageId the ancillary page id
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseDvbSubtitlingIdx(int idx, Out<java.lang.String> lang, Out<Byte> type, Out<Short> compositionPageId, Out<Short> ancillaryPageId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment langPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment typePOINTER = SCOPE.allocate(Interop.valueLayout.C_BYTE);
            MemorySegment compositionPageIdPOINTER = SCOPE.allocate(Interop.valueLayout.C_SHORT);
            MemorySegment ancillaryPageIdPOINTER = SCOPE.allocate(Interop.valueLayout.C_SHORT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_subtitling_idx.invokeExact(
                        handle(),
                        idx,
                        (Addressable) langPOINTER.address(),
                        (Addressable) (type == null ? MemoryAddress.NULL : (Addressable) typePOINTER.address()),
                        (Addressable) (compositionPageId == null ? MemoryAddress.NULL : (Addressable) compositionPageIdPOINTER.address()),
                        (Addressable) (ancillaryPageId == null ? MemoryAddress.NULL : (Addressable) ancillaryPageIdPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    lang.set(Marshal.addressToString.marshal(langPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (type != null) type.set(typePOINTER.get(Interop.valueLayout.C_BYTE, 0));
                    if (compositionPageId != null) compositionPageId.set(compositionPageIdPOINTER.get(Interop.valueLayout.C_SHORT, 0));
                    if (ancillaryPageId != null) ancillaryPageId.set(ancillaryPageIdPOINTER.get(Interop.valueLayout.C_SHORT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    public int parseDvbSubtitlingNb() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_subtitling_nb.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Parses out the DVB-T2 delivery system from the {@code descriptor}.
     * @param res {@link T2DeliverySystemDescriptor}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbT2DeliverySystem(Out<org.gstreamer.mpegts.T2DeliverySystemDescriptor> res) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment resPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_t2_delivery_system.invokeExact(
                        handle(),
                        (Addressable) resPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    res.set(org.gstreamer.mpegts.T2DeliverySystemDescriptor.fromAddress.marshal(resPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parses teletext number {@code idx} in the {@code descriptor}. The language is in ISO639 format.
     * @param idx The id of the teletext to get
     * @param languageCode a null-terminated string
     * @param teletextType {@link DVBTeletextType}
     * @return FALSE on out-of-bounds and errors
     */
    public boolean parseDvbTeletextIdx(int idx, @Nullable Out<java.lang.String> languageCode, @Nullable Out<org.gstreamer.mpegts.DVBTeletextType> teletextType, Out<Byte> magazineNumber, Out<Byte> pageNumber) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment languageCodePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment teletextTypePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment magazineNumberPOINTER = SCOPE.allocate(Interop.valueLayout.C_BYTE);
            MemorySegment pageNumberPOINTER = SCOPE.allocate(Interop.valueLayout.C_BYTE);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_teletext_idx.invokeExact(
                        handle(),
                        idx,
                        (Addressable) (languageCode == null ? MemoryAddress.NULL : (Addressable) languageCodePOINTER.address()),
                        (Addressable) (teletextType == null ? MemoryAddress.NULL : (Addressable) teletextTypePOINTER.address()),
                        (Addressable) (magazineNumber == null ? MemoryAddress.NULL : (Addressable) magazineNumberPOINTER.address()),
                        (Addressable) (pageNumber == null ? MemoryAddress.NULL : (Addressable) pageNumberPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (languageCode != null) languageCode.set(Marshal.addressToString.marshal(languageCodePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (teletextType != null) teletextType.set(org.gstreamer.mpegts.DVBTeletextType.of(teletextTypePOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (magazineNumber != null) magazineNumber.set(magazineNumberPOINTER.get(Interop.valueLayout.C_BYTE, 0));
                    if (pageNumber != null) pageNumber.set(pageNumberPOINTER.get(Interop.valueLayout.C_BYTE, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Find the number of teletext entries in {@code descriptor}
     * @return Number of teletext entries
     */
    public int parseDvbTeletextNb() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_teletext_nb.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Extracts the iso 639-2 language information from {@code descriptor}.
     * <p>
     * Note: Use {@code gst_tag_get_language_code} if you want to get the the
     * ISO 639-1 language code from the returned ISO 639-2 one.
     * @param res the {@link ISO639LanguageDescriptor} to fill
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseIso639Language(Out<org.gstreamer.mpegts.ISO639LanguageDescriptor> res) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment resPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_iso_639_language.invokeExact(
                        handle(),
                        (Addressable) resPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    res.set(org.gstreamer.mpegts.ISO639LanguageDescriptor.fromAddress.marshal(resPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Extracts the iso 639-2 language information from specific table id in {@code descriptor}.
     * <p>
     * Note: Use {@code gst_tag_get_language_code} if you want to get the the
     * ISO 639-1 language code from the returned ISO 639-2 one.
     * @param idx Table id of the language to parse
     * @param lang 4-byte gchar array to hold the language code
     * @param audioType the {@link Iso639AudioType} to set
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseIso639LanguageIdx(int idx, Out<java.lang.String> lang, @Nullable Out<org.gstreamer.mpegts.Iso639AudioType> audioType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment langPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment audioTypePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_iso_639_language_idx.invokeExact(
                        handle(),
                        idx,
                        (Addressable) langPOINTER.address(),
                        (Addressable) (audioType == null ? MemoryAddress.NULL : (Addressable) audioTypePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    lang.set(Marshal.addressToString.marshal(langPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (audioType != null) audioType.set(org.gstreamer.mpegts.Iso639AudioType.of(audioTypePOINTER.get(Interop.valueLayout.C_INT, 0)));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    public int parseIso639LanguageNb() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_iso_639_language_nb.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Extracts the logical channels from {@code descriptor}.
     * @param res the {@link LogicalChannelDescriptor} to fill
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseLogicalChannel(org.gstreamer.mpegts.LogicalChannelDescriptor res) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_logical_channel.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Extracts the Registration information from {@code descriptor}.
     * @param registrationId The registration ID (in host endiannes)
     * @param additionalInfo The additional information
     * @param additionalInfoLength The size of {@code additional_info} in bytes.
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseRegistration(Out<Integer> registrationId, Out<byte[]> additionalInfo, Out<Long> additionalInfoLength) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment registrationIdPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment additionalInfoPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment additionalInfoLengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_registration.invokeExact(
                        handle(),
                        (Addressable) registrationIdPOINTER.address(),
                        (Addressable) (additionalInfo == null ? MemoryAddress.NULL : (Addressable) additionalInfoPOINTER.address()),
                        (Addressable) (additionalInfoLength == null ? MemoryAddress.NULL : (Addressable) additionalInfoLengthPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    registrationId.set(registrationIdPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (additionalInfoLength != null) additionalInfoLength.set(additionalInfoLengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            additionalInfo.set(MemorySegment.ofAddress(additionalInfoPOINTER.get(Interop.valueLayout.ADDRESS, 0), additionalInfoLength.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Extracts the satellite delivery system information from {@code descriptor}.
     * @param res the {@link SatelliteDeliverySystemDescriptor} to fill
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseSatelliteDeliverySystem(org.gstreamer.mpegts.SatelliteDeliverySystemDescriptor res) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_satellite_delivery_system.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Parses out the terrestrial delivery system from the {@code descriptor}.
     * @param res {@link TerrestrialDeliverySystemDescriptor}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseTerrestrialDeliverySystem(org.gstreamer.mpegts.TerrestrialDeliverySystemDescriptor res) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_terrestrial_delivery_system.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Creates a {@link Descriptor} with custom {@code tag} and {@code data}
     * @param tag descriptor tag
     * @param data descriptor data (after tag and length field)
     * @param length length of {@code data}
     * @return {@link Descriptor}
     */
    public static org.gstreamer.mpegts.Descriptor fromCustom(byte tag, byte[] data, long length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_custom.invokeExact(
                        tag,
                        Interop.allocateNativeArray(data, false, SCOPE),
                        length);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gstreamer.mpegts.Descriptor.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Creates a {@link Descriptor} with custom {@code tag}, {@code tag_extension} and {@code data}
     * @param tag descriptor tag
     * @param tagExtension descriptor tag extension
     * @param data descriptor data (after tag and length field)
     * @param length length of {@code data}
     * @return {@link Descriptor}
     */
    public static org.gstreamer.mpegts.Descriptor fromCustomWithExtension(byte tag, byte tagExtension, byte[] data, long length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_custom_with_extension.invokeExact(
                        tag,
                        tagExtension,
                        Interop.allocateNativeArray(data, false, SCOPE),
                        length);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gstreamer.mpegts.Descriptor.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Creates a {@link Descriptor} to be a {@link DVBDescriptorType#NETWORK_NAME},
     * with the network name {@code name}. The data field of the {@link Descriptor}
     * will be allocated, and transferred to the caller.
     * @param name the network name to set
     * @return the {@link Descriptor} or {@code null} on fail
     */
    public static org.gstreamer.mpegts.Descriptor fromDvbNetworkName(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_dvb_network_name.invokeExact(Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gstreamer.mpegts.Descriptor.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
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
    public static org.gstreamer.mpegts.Descriptor fromDvbService(org.gstreamer.mpegts.DVBServiceType serviceType, @Nullable java.lang.String serviceName, @Nullable java.lang.String serviceProvider) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_dvb_service.invokeExact(
                        serviceType.getValue(),
                        (Addressable) (serviceName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(serviceName, SCOPE)),
                        (Addressable) (serviceProvider == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(serviceProvider, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gstreamer.mpegts.Descriptor.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    public static org.gstreamer.mpegts.Descriptor fromDvbSubtitling(java.lang.String lang, byte type, short composition, short ancillary) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_dvb_subtitling.invokeExact(
                        Marshal.stringToAddress.marshal(lang, SCOPE),
                        type,
                        composition,
                        ancillary);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gstreamer.mpegts.Descriptor.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Creates a {@link DescriptorType#ISO_639_LANGUAGE} {@link Descriptor} with
     * a single language
     * @param language ISO-639-2 language 3-char code
     * @return {@link Descriptor}, {@code null} on failure
     */
    public static org.gstreamer.mpegts.Descriptor fromIso639Language(java.lang.String language) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_iso_639_language.invokeExact(Marshal.stringToAddress.marshal(language, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gstreamer.mpegts.Descriptor.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Creates a {@link DescriptorType#REGISTRATION} {@link Descriptor}
     * @param formatIdentifier a 4 character format identifier string
     * @param additionalInfo pointer to optional additional info
     * @param additionalInfoLength length of the optional {@code additional_info}
     * @return {@link Descriptor}, {@code null} on failure
     */
    public static org.gstreamer.mpegts.Descriptor fromRegistration(java.lang.String formatIdentifier, byte[] additionalInfo, long additionalInfoLength) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_descriptor_from_registration.invokeExact(
                        Marshal.stringToAddress.marshal(formatIdentifier, SCOPE),
                        (Addressable) (additionalInfo == null ? MemoryAddress.NULL : Interop.allocateNativeArray(additionalInfo, false, SCOPE)),
                        additionalInfoLength);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gstreamer.mpegts.Descriptor.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    public static void parseAudioPreselectionDump(org.gstreamer.mpegts.AudioPreselectionDescriptor source) {
        try {
            DowncallHandles.gst_mpegts_descriptor_parse_audio_preselection_dump.invokeExact(source.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void parseAudioPreselectionFree(org.gstreamer.mpegts.AudioPreselectionDescriptor source) {
        try {
            DowncallHandles.gst_mpegts_descriptor_parse_audio_preselection_free.invokeExact(source.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_descriptor_free = Interop.downcallHandle(
                "gst_mpegts_descriptor_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_audio_preselection_list = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_audio_preselection_list",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_ca = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_ca",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_cable_delivery_system = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_cable_delivery_system",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_bouquet_name = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_bouquet_name",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_ca_identifier = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_ca_identifier",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_component = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_component",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_content = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_content",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_data_broadcast = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_data_broadcast",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_data_broadcast_id = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_data_broadcast_id",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_extended_event = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_extended_event",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_frequency_list = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_frequency_list",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_linkage = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_linkage",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_multilingual_bouquet_name = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_multilingual_bouquet_name",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_multilingual_component = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_multilingual_component",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_multilingual_network_name = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_multilingual_network_name",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_multilingual_service_name = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_multilingual_service_name",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_network_name = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_network_name",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_parental_rating = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_parental_rating",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_private_data_specifier = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_private_data_specifier",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_scrambling = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_scrambling",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_service = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_service",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_service_list = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_service_list",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_short_event = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_short_event",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_stream_identifier = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_stream_identifier",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_stuffing = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_stuffing",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_subtitling_idx = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_subtitling_idx",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_subtitling_nb = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_subtitling_nb",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_t2_delivery_system = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_t2_delivery_system",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_teletext_idx = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_teletext_idx",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_dvb_teletext_nb = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_dvb_teletext_nb",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_iso_639_language = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_iso_639_language",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_iso_639_language_idx = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_iso_639_language_idx",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_iso_639_language_nb = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_iso_639_language_nb",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_logical_channel = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_logical_channel",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_registration = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_registration",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_satellite_delivery_system = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_satellite_delivery_system",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_descriptor_parse_terrestrial_delivery_system = Interop.downcallHandle(
                "gst_mpegts_descriptor_parse_terrestrial_delivery_system",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
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
    }
    
    /**
     * A {@link Descriptor.Builder} object constructs a {@link Descriptor} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Descriptor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Descriptor struct;
        
        private Builder() {
            struct = Descriptor.allocate();
        }
        
        /**
         * Finish building the {@link Descriptor} struct.
         * @return A new instance of {@code Descriptor} with the fields 
         *         that were set in the Builder object.
         */
        public Descriptor build() {
            return struct;
        }
        
        /**
         * the type of descriptor
         * @param tag The value for the {@code tag} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTag(byte tag) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tag"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), tag);
                return this;
            }
        }
        
        /**
         * the extended type (if {@code descriptor_tag} is 0x7f)
         * @param tagExtension The value for the {@code tagExtension} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTagExtension(byte tagExtension) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tag_extension"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), tagExtension);
                return this;
            }
        }
        
        /**
         * the length of the descriptor content (excluding tag/length field)
         * @param length The value for the {@code length} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLength(byte length) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("length"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), length);
                return this;
            }
        }
        
        /**
         * the full descriptor data (including tag, extension, length). The first
         * two bytes are the {@code tag} and {@code length}.
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setData(PointerByte data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : data.handle()));
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
