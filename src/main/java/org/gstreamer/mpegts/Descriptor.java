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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_BYTE.withName("tag"),
        Interop.valueLayout.C_BYTE.withName("tag_extension"),
        Interop.valueLayout.C_BYTE.withName("length"),
        MemoryLayout.paddingLayout(40),
        Interop.valueLayout.ADDRESS.withName("data"),
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
     * Allocate a new {@link Descriptor}
     * @return A new, uninitialized @{link Descriptor}
     */
    public static Descriptor allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Descriptor newInstance = new Descriptor(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code tag}
     * @return The value of the field {@code tag}
     */
    public byte tag$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tag}
     * @param tag The new value of the field {@code tag}
     */
    public void tag$set(byte tag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tag);
    }
    
    /**
     * Get the value of the field {@code tag_extension}
     * @return The value of the field {@code tag_extension}
     */
    public byte tagExtension$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tag_extension"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tag_extension}
     * @param tagExtension The new value of the field {@code tag_extension}
     */
    public void tagExtension$set(byte tagExtension) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tag_extension"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tagExtension);
    }
    
    /**
     * Get the value of the field {@code length}
     * @return The value of the field {@code length}
     */
    public byte length$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("length"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code length}
     * @param length The new value of the field {@code length}
     */
    public void length$set(byte length) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("length"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), length);
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public PointerByte data$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerByte(RESULT);
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void data$set(PointerByte data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), data.handle());
    }
    
    /**
     * Create a Descriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Descriptor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Frees {@code desc}
     */
    public void free() {
        try {
            DowncallHandles.gst_mpegts_descriptor_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Parses out a list of audio preselection from the {@code descriptor}.
     * @param list the list of audio preselection
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseAudioPreselectionList(@NotNull Out<org.gstreamer.mpegts.AudioPreselectionDescriptor[]> list) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Extracts the Conditional Access information from {@code descriptor}.
     * @param caSystemId the type of CA system used
     * @param caPid The PID containing ECM or EMM data
     * @param privateData The private data
     * @param privateDataSize The size of {@code private_data} in bytes
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseCa(Out<Short> caSystemId, Out<Short> caPid, @NotNull Out<byte[]> privateData, Out<Long> privateDataSize) {
        java.util.Objects.requireNonNull(caSystemId, "Parameter 'caSystemId' must not be null");
        MemorySegment caSystemIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        java.util.Objects.requireNonNull(caPid, "Parameter 'caPid' must not be null");
        MemorySegment caPidPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        java.util.Objects.requireNonNull(privateData, "Parameter 'privateData' must not be null");
        MemorySegment privateDataPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(privateDataSize, "Parameter 'privateDataSize' must not be null");
        MemorySegment privateDataSizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_ca.invokeExact(
                    handle(),
                    (Addressable) caSystemIdPOINTER.address(),
                    (Addressable) caPidPOINTER.address(),
                    (Addressable) privateDataPOINTER.address(),
                    (Addressable) privateDataSizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        caSystemId.set(caSystemIdPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        caPid.set(caPidPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        privateDataSize.set(privateDataSizePOINTER.get(Interop.valueLayout.C_LONG, 0));
        privateData.set(MemorySegment.ofAddress(privateDataPOINTER.get(Interop.valueLayout.ADDRESS, 0), privateDataSize.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return RESULT != 0;
    }
    
    /**
     * Extracts the cable delivery system information from {@code descriptor}.
     * @param res the {@link CableDeliverySystemDescriptor} to fill
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseCableDeliverySystem(@NotNull org.gstreamer.mpegts.CableDeliverySystemDescriptor res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_cable_delivery_system.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Extracts the bouquet name from {@code descriptor}.
     * @param bouquetName the bouquet name
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseDvbBouquetName(@NotNull Out<java.lang.String> bouquetName) {
        java.util.Objects.requireNonNull(bouquetName, "Parameter 'bouquetName' must not be null");
        MemorySegment bouquetNamePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_bouquet_name.invokeExact(
                    handle(),
                    (Addressable) bouquetNamePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bouquetName.set(Interop.getStringFrom(bouquetNamePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return RESULT != 0;
    }
    
    /**
     * Extracts ca id's from {@code descriptor}.
     * @param list a list of ca identifier.
     * Edge entry identifies the CA system. Allocations of the value of this field
     * are found in http://www.dvbservices.com
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbCaIdentifier(@NotNull Out<short[]> list) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Extracts the DVB component information from {@code descriptor}.
     * @param res the {@link ComponentDescriptor} to fill
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseDvbComponent(@NotNull Out<org.gstreamer.mpegts.ComponentDescriptor> res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment resPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_component.invokeExact(
                    handle(),
                    (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new org.gstreamer.mpegts.ComponentDescriptor(resPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    /**
     * Extracts the DVB content information from {@code descriptor}.
     * @param content {@link Content}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbContent(@NotNull Out<org.gstreamer.mpegts.Content[]> content) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Parses out the data broadcast from the {@code descriptor}.
     * @param res {@link DataBroadcastDescriptor}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbDataBroadcast(@NotNull Out<org.gstreamer.mpegts.DataBroadcastDescriptor> res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment resPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_data_broadcast.invokeExact(
                    handle(),
                    (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new org.gstreamer.mpegts.DataBroadcastDescriptor(resPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    /**
     * Parses out the data broadcast id from the {@code descriptor}.
     * @param dataBroadcastId the data broadcast id
     * @param idSelectorBytes the selector bytes, if present
     * @param len the length of {@code id_selector_bytes}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbDataBroadcastId(Out<Short> dataBroadcastId, @NotNull Out<byte[]> idSelectorBytes, Out<Byte> len) {
        java.util.Objects.requireNonNull(dataBroadcastId, "Parameter 'dataBroadcastId' must not be null");
        MemorySegment dataBroadcastIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        java.util.Objects.requireNonNull(idSelectorBytes, "Parameter 'idSelectorBytes' must not be null");
        MemorySegment idSelectorBytesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(len, "Parameter 'len' must not be null");
        MemorySegment lenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
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
        idSelectorBytes.set(MemorySegment.ofAddress(idSelectorBytesPOINTER.get(Interop.valueLayout.ADDRESS, 0), len.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return RESULT != 0;
    }
    
    /**
     * Extracts the DVB extended event information from {@code descriptor}.
     * @param res the {@link ExtendedEventDescriptor} to fill
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseDvbExtendedEvent(@NotNull Out<org.gstreamer.mpegts.ExtendedEventDescriptor> res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment resPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_extended_event.invokeExact(
                    handle(),
                    (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new org.gstreamer.mpegts.ExtendedEventDescriptor(resPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    /**
     * Parses out a list of frequencies from the {@code descriptor}.
     * @param offset {@code false} in Hz, {@code true} in kHz
     * @param list a list of all frequencies in Hz/kHz
     * depending on {@code offset}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbFrequencyList(Out<Boolean> offset, @NotNull Out<int[]> list) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Extracts the DVB linkage information from {@code descriptor}.
     * @param res the {@link DVBLinkageDescriptor} to fill
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseDvbLinkage(@NotNull Out<org.gstreamer.mpegts.DVBLinkageDescriptor> res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment resPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_linkage.invokeExact(
                    handle(),
                    (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new org.gstreamer.mpegts.DVBLinkageDescriptor(resPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    /**
     * Parses out the multilingual bouquet name from the {@code descriptor}.
     * @param bouquetNameItems a {@link DvbMultilingualBouquetNameItem}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbMultilingualBouquetName(@NotNull Out<org.gstreamer.mpegts.DvbMultilingualBouquetNameItem[]> bouquetNameItems) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Parses out the multilingual component from the {@code descriptor}.
     * @param componentTag the component tag
     * @param componentDescriptionItems a {@link DvbMultilingualComponentItem}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbMultilingualComponent(Out<Byte> componentTag, @NotNull Out<org.gstreamer.mpegts.DvbMultilingualComponentItem[]> componentDescriptionItems) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Parses out the multilingual network name from the {@code descriptor}.
     * @param networkNameItems a {@link DvbMultilingualNetworkNameItem}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbMultilingualNetworkName(@NotNull Out<org.gstreamer.mpegts.DvbMultilingualNetworkNameItem[]> networkNameItems) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Parses out the multilingual service name from the {@code descriptor}.
     * @param serviceNameItems a {@link DvbMultilingualServiceNameItem}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbMultilingualServiceName(@NotNull Out<org.gstreamer.mpegts.DvbMultilingualServiceNameItem[]> serviceNameItems) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Parses out the dvb network name from the {@code descriptor}:
     * @param name the extracted name
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbNetworkName(@NotNull Out<java.lang.String> name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemorySegment namePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_network_name.invokeExact(
                    handle(),
                    (Addressable) namePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        name.set(Interop.getStringFrom(namePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return RESULT != 0;
    }
    
    /**
     * Extracts the DVB parental rating information from {@code descriptor}.
     * @param rating {@link DVBParentalRatingItem}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbParentalRating(@NotNull Out<org.gstreamer.mpegts.DVBParentalRatingItem[]> rating) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Parses out the private data specifier from the {@code descriptor}.
     * @param privateDataSpecifier the private data specifier id
     * registered by http://www.dvbservices.com/
     * @param privateData additional data or NULL
     * @param length length of {@code private_data}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbPrivateDataSpecifier(Out<Integer> privateDataSpecifier, @NotNull Out<byte[]> privateData, Out<Byte> length) {
        java.util.Objects.requireNonNull(privateDataSpecifier, "Parameter 'privateDataSpecifier' must not be null");
        MemorySegment privateDataSpecifierPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(privateData, "Parameter 'privateData' must not be null");
        MemorySegment privateDataPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(length, "Parameter 'length' must not be null");
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_private_data_specifier.invokeExact(
                    handle(),
                    (Addressable) privateDataSpecifierPOINTER.address(),
                    (Addressable) privateDataPOINTER.address(),
                    (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        privateDataSpecifier.set(privateDataSpecifierPOINTER.get(Interop.valueLayout.C_INT, 0));
        length.set(lengthPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        privateData.set(MemorySegment.ofAddress(privateDataPOINTER.get(Interop.valueLayout.ADDRESS, 0), length.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return RESULT != 0;
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
    public boolean parseDvbScrambling(@NotNull Out<org.gstreamer.mpegts.DVBScramblingModeType> scramblingMode) {
        java.util.Objects.requireNonNull(scramblingMode, "Parameter 'scramblingMode' must not be null");
        MemorySegment scramblingModePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_scrambling.invokeExact(
                    handle(),
                    (Addressable) scramblingModePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        scramblingMode.set(org.gstreamer.mpegts.DVBScramblingModeType.of(scramblingModePOINTER.get(Interop.valueLayout.C_INT, 0)));
        return RESULT != 0;
    }
    
    /**
     * Extracts the dvb service information from {@code descriptor}.
     * @param serviceType the service type
     * @param serviceName the service name
     * @param providerName the provider name
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseDvbService(@NotNull Out<org.gstreamer.mpegts.DVBServiceType> serviceType, @NotNull Out<java.lang.String> serviceName, @NotNull Out<java.lang.String> providerName) {
        java.util.Objects.requireNonNull(serviceType, "Parameter 'serviceType' must not be null");
        MemorySegment serviceTypePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(serviceName, "Parameter 'serviceName' must not be null");
        MemorySegment serviceNamePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(providerName, "Parameter 'providerName' must not be null");
        MemorySegment providerNamePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_service.invokeExact(
                    handle(),
                    (Addressable) serviceTypePOINTER.address(),
                    (Addressable) serviceNamePOINTER.address(),
                    (Addressable) providerNamePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        serviceType.set(org.gstreamer.mpegts.DVBServiceType.of(serviceTypePOINTER.get(Interop.valueLayout.C_INT, 0)));
        serviceName.set(Interop.getStringFrom(serviceNamePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        providerName.set(Interop.getStringFrom(providerNamePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return RESULT != 0;
    }
    
    /**
     * Parses out a list of services from the {@code descriptor}:
     * @param list the list of services
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbServiceList(@NotNull Out<org.gstreamer.mpegts.DVBServiceListItem[]> list) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Extracts the DVB short event information from {@code descriptor}.
     * @param languageCode the language code
     * @param eventName the event name
     * @param text the event text
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseDvbShortEvent(@NotNull Out<java.lang.String> languageCode, @NotNull Out<java.lang.String> eventName, @NotNull Out<java.lang.String> text) {
        java.util.Objects.requireNonNull(languageCode, "Parameter 'languageCode' must not be null");
        MemorySegment languageCodePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(eventName, "Parameter 'eventName' must not be null");
        MemorySegment eventNamePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        MemorySegment textPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_short_event.invokeExact(
                    handle(),
                    (Addressable) languageCodePOINTER.address(),
                    (Addressable) eventNamePOINTER.address(),
                    (Addressable) textPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        languageCode.set(Interop.getStringFrom(languageCodePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        eventName.set(Interop.getStringFrom(eventNamePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        text.set(Interop.getStringFrom(textPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return RESULT != 0;
    }
    
    /**
     * Extracts the component tag from {@code descriptor}.
     * @param componentTag the component tag
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbStreamIdentifier(Out<Byte> componentTag) {
        java.util.Objects.requireNonNull(componentTag, "Parameter 'componentTag' must not be null");
        MemorySegment componentTagPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_stream_identifier.invokeExact(
                    handle(),
                    (Addressable) componentTagPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        componentTag.set(componentTagPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        return RESULT != 0;
    }
    
    /**
     * Parses out the stuffing bytes from the {@code descriptor}.
     * @param stuffingBytes the stuffing bytes
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseDvbStuffing(Out<Byte> stuffingBytes) {
        java.util.Objects.requireNonNull(stuffingBytes, "Parameter 'stuffingBytes' must not be null");
        MemorySegment stuffingBytesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_stuffing.invokeExact(
                    handle(),
                    (Addressable) stuffingBytesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        stuffingBytes.set(stuffingBytesPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        return RESULT != 0;
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
    public boolean parseDvbSubtitlingIdx(int idx, @NotNull Out<java.lang.String> lang, Out<Byte> type, Out<Short> compositionPageId, Out<Short> ancillaryPageId) {
        java.util.Objects.requireNonNull(lang, "Parameter 'lang' must not be null");
        MemorySegment langPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemorySegment typePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        java.util.Objects.requireNonNull(compositionPageId, "Parameter 'compositionPageId' must not be null");
        MemorySegment compositionPageIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        java.util.Objects.requireNonNull(ancillaryPageId, "Parameter 'ancillaryPageId' must not be null");
        MemorySegment ancillaryPageIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_subtitling_idx.invokeExact(
                    handle(),
                    idx,
                    (Addressable) langPOINTER.address(),
                    (Addressable) typePOINTER.address(),
                    (Addressable) compositionPageIdPOINTER.address(),
                    (Addressable) ancillaryPageIdPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        lang.set(Interop.getStringFrom(langPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        type.set(typePOINTER.get(Interop.valueLayout.C_BYTE, 0));
        compositionPageId.set(compositionPageIdPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        ancillaryPageId.set(ancillaryPageIdPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        return RESULT != 0;
    }
    
    public int parseDvbSubtitlingNb() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_subtitling_nb.invokeExact(
                    handle());
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
    public boolean parseDvbT2DeliverySystem(@NotNull Out<org.gstreamer.mpegts.T2DeliverySystemDescriptor> res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment resPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_t2_delivery_system.invokeExact(
                    handle(),
                    (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new org.gstreamer.mpegts.T2DeliverySystemDescriptor(resPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    /**
     * Parses teletext number {@code idx} in the {@code descriptor}. The language is in ISO639 format.
     * @param idx The id of the teletext to get
     * @param languageCode a null-terminated string
     * @param teletextType {@link DVBTeletextType}
     * @return FALSE on out-of-bounds and errors
     */
    public boolean parseDvbTeletextIdx(int idx, @NotNull Out<java.lang.String> languageCode, @NotNull Out<org.gstreamer.mpegts.DVBTeletextType> teletextType, Out<Byte> magazineNumber, Out<Byte> pageNumber) {
        java.util.Objects.requireNonNull(languageCode, "Parameter 'languageCode' must not be null");
        MemorySegment languageCodePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(teletextType, "Parameter 'teletextType' must not be null");
        MemorySegment teletextTypePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(magazineNumber, "Parameter 'magazineNumber' must not be null");
        MemorySegment magazineNumberPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        java.util.Objects.requireNonNull(pageNumber, "Parameter 'pageNumber' must not be null");
        MemorySegment pageNumberPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_teletext_idx.invokeExact(
                    handle(),
                    idx,
                    (Addressable) languageCodePOINTER.address(),
                    (Addressable) teletextTypePOINTER.address(),
                    (Addressable) magazineNumberPOINTER.address(),
                    (Addressable) pageNumberPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        languageCode.set(Interop.getStringFrom(languageCodePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        teletextType.set(org.gstreamer.mpegts.DVBTeletextType.of(teletextTypePOINTER.get(Interop.valueLayout.C_INT, 0)));
        magazineNumber.set(magazineNumberPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        pageNumber.set(pageNumberPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        return RESULT != 0;
    }
    
    /**
     * Find the number of teletext entries in {@code descriptor}
     * @return Number of teletext entries
     */
    public int parseDvbTeletextNb() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_dvb_teletext_nb.invokeExact(
                    handle());
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
    public boolean parseIso639Language(@NotNull Out<org.gstreamer.mpegts.ISO639LanguageDescriptor> res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment resPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_iso_639_language.invokeExact(
                    handle(),
                    (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new org.gstreamer.mpegts.ISO639LanguageDescriptor(resPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
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
    public boolean parseIso639LanguageIdx(int idx, @NotNull Out<java.lang.String> lang, @NotNull Out<org.gstreamer.mpegts.Iso639AudioType> audioType) {
        java.util.Objects.requireNonNull(lang, "Parameter 'lang' must not be null");
        MemorySegment langPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(audioType, "Parameter 'audioType' must not be null");
        MemorySegment audioTypePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_iso_639_language_idx.invokeExact(
                    handle(),
                    idx,
                    (Addressable) langPOINTER.address(),
                    (Addressable) audioTypePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        lang.set(Interop.getStringFrom(langPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        audioType.set(org.gstreamer.mpegts.Iso639AudioType.of(audioTypePOINTER.get(Interop.valueLayout.C_INT, 0)));
        return RESULT != 0;
    }
    
    public int parseIso639LanguageNb() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_iso_639_language_nb.invokeExact(
                    handle());
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
    public boolean parseLogicalChannel(@NotNull org.gstreamer.mpegts.LogicalChannelDescriptor res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_logical_channel.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Extracts the Registration information from {@code descriptor}.
     * @param registrationId The registration ID (in host endiannes)
     * @param additionalInfo The additional information
     * @param additionalInfoLength The size of {@code additional_info} in bytes.
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseRegistration(Out<Integer> registrationId, @NotNull Out<byte[]> additionalInfo, Out<Long> additionalInfoLength) {
        java.util.Objects.requireNonNull(registrationId, "Parameter 'registrationId' must not be null");
        MemorySegment registrationIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(additionalInfo, "Parameter 'additionalInfo' must not be null");
        MemorySegment additionalInfoPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(additionalInfoLength, "Parameter 'additionalInfoLength' must not be null");
        MemorySegment additionalInfoLengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_registration.invokeExact(
                    handle(),
                    (Addressable) registrationIdPOINTER.address(),
                    (Addressable) additionalInfoPOINTER.address(),
                    (Addressable) additionalInfoLengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        registrationId.set(registrationIdPOINTER.get(Interop.valueLayout.C_INT, 0));
        additionalInfoLength.set(additionalInfoLengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
        additionalInfo.set(MemorySegment.ofAddress(additionalInfoPOINTER.get(Interop.valueLayout.ADDRESS, 0), additionalInfoLength.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return RESULT != 0;
    }
    
    /**
     * Extracts the satellite delivery system information from {@code descriptor}.
     * @param res the {@link SatelliteDeliverySystemDescriptor} to fill
     * @return {@code true} if parsing succeeded, else {@code false}.
     */
    public boolean parseSatelliteDeliverySystem(@NotNull org.gstreamer.mpegts.SatelliteDeliverySystemDescriptor res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_satellite_delivery_system.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Parses out the terrestrial delivery system from the {@code descriptor}.
     * @param res {@link TerrestrialDeliverySystemDescriptor}
     * @return {@code true} if the parsing happened correctly, else {@code false}.
     */
    public boolean parseTerrestrialDeliverySystem(@NotNull org.gstreamer.mpegts.TerrestrialDeliverySystemDescriptor res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_descriptor_parse_terrestrial_delivery_system.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Creates a {@link Descriptor} with custom {@code tag} and {@code data}
     * @param tag descriptor tag
     * @param data descriptor data (after tag and length field)
     * @param length length of {@code data}
     * @return {@link Descriptor}
     */
    public static @NotNull org.gstreamer.mpegts.Descriptor fromCustom(byte tag, @NotNull byte[] data, long length) {
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
    public static @NotNull org.gstreamer.mpegts.Descriptor fromCustomWithExtension(byte tag, byte tagExtension, @NotNull byte[] data, long length) {
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
    public static @NotNull org.gstreamer.mpegts.Descriptor fromDvbNetworkName(@NotNull java.lang.String name) {
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
    public static @NotNull org.gstreamer.mpegts.Descriptor fromDvbService(@NotNull org.gstreamer.mpegts.DVBServiceType serviceType, @Nullable java.lang.String serviceName, @Nullable java.lang.String serviceProvider) {
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
    
    public static @NotNull org.gstreamer.mpegts.Descriptor fromDvbSubtitling(@NotNull java.lang.String lang, byte type, short composition, short ancillary) {
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
    public static @NotNull org.gstreamer.mpegts.Descriptor fromIso639Language(@NotNull java.lang.String language) {
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
    public static @NotNull org.gstreamer.mpegts.Descriptor fromRegistration(@NotNull java.lang.String formatIdentifier, @Nullable byte[] additionalInfo, long additionalInfoLength) {
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
    
    public static void parseAudioPreselectionDump(@NotNull org.gstreamer.mpegts.AudioPreselectionDescriptor source) {
        java.util.Objects.requireNonNull(source, "Parameter 'source' must not be null");
        try {
            DowncallHandles.gst_mpegts_descriptor_parse_audio_preselection_dump.invokeExact(
                    source.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void parseAudioPreselectionFree(@NotNull org.gstreamer.mpegts.AudioPreselectionDescriptor source) {
        java.util.Objects.requireNonNull(source, "Parameter 'source' must not be null");
        try {
            DowncallHandles.gst_mpegts_descriptor_parse_audio_preselection_free.invokeExact(
                    source.handle());
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Descriptor struct;
        
         /**
         * A {@link Descriptor.Build} object constructs a {@link Descriptor} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Descriptor.allocate();
        }
        
         /**
         * Finish building the {@link Descriptor} struct.
         * @return A new instance of {@code Descriptor} with the fields 
         *         that were set in the Build object.
         */
        public Descriptor construct() {
            return struct;
        }
        
        /**
         * the type of descriptor
         * @param tag The value for the {@code tag} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTag(byte tag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), tag);
            return this;
        }
        
        /**
         * the extended type (if {@code descriptor_tag} is 0x7f)
         * @param tagExtension The value for the {@code tagExtension} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTagExtension(byte tagExtension) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tag_extension"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), tagExtension);
            return this;
        }
        
        /**
         * the length of the descriptor content (excluding tag/length field)
         * @param length The value for the {@code length} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLength(byte length) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("length"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), length);
            return this;
        }
        
        /**
         * the full descriptor data (including tag, extension, length). The first
         * two bytes are the {@code tag} and {@code length}.
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setData(PointerByte data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : data.handle()));
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
