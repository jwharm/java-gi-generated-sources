package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Instance struct for a RTP Audio/Video header extension.
 * @version 1.20
 */
public class RTPHeaderExtension extends org.gstreamer.gst.Element {
    
    static {
        GstRtp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPHeaderExtension";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Element.getMemoryLayout().withName("parent"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a RTPHeaderExtension proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RTPHeaderExtension(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTPHeaderExtension> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RTPHeaderExtension(input);
    
    /**
     * Retrieve the direction
     * @return The direction
     */
    public org.gstreamer.rtp.RTPHeaderExtensionDirection getDirection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_get_direction.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.rtp.RTPHeaderExtensionDirection(RESULT);
    }
    
    public int getId() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_get_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This is used to know how much data a certain header extension will need for
     * both allocating the resulting data, and deciding how much payload data can
     * be generated.
     * <p>
     * Implementations should return as accurate a value as is possible using the
     * information given in the input {@code buffer}.
     * @param inputMeta a {@link org.gstreamer.gst.Buffer}
     * @return the maximum size of the data written by this extension
     */
    public long getMaxSize(org.gstreamer.gst.Buffer inputMeta) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_rtp_header_extension_get_max_size.invokeExact(
                    handle(),
                    inputMeta.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public java.lang.String getSdpCapsFieldName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_header_extension_get_sdp_caps_field_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public org.gstreamer.rtp.RTPHeaderExtensionFlags getSupportedFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_get_supported_flags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.rtp.RTPHeaderExtensionFlags(RESULT);
    }
    
    public java.lang.String getUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_header_extension_get_uri.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Read the RTP header extension from {@code data}.
     * @param readFlags {@link RTPHeaderExtensionFlags} for how the extension should
     *               be written
     * @param data location to read the rtp header extension from
     * @param size size of {@code data}
     * @param buffer a {@link org.gstreamer.gst.Buffer} to modify if necessary
     * @return whether the extension could be read from {@code data}
     */
    public boolean read(org.gstreamer.rtp.RTPHeaderExtensionFlags readFlags, byte[] data, long size, org.gstreamer.gst.Buffer buffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_rtp_header_extension_read.invokeExact(
                        handle(),
                        readFlags.getValue(),
                        Interop.allocateNativeArray(data, false, SCOPE),
                        size,
                        buffer.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * gst_rtp_header_extension_set_id() must have been called with a valid
     * extension id that is contained in these caps.
     * <p>
     * The only current known caps format is based on the SDP standard as produced
     * by gst_sdp_media_attributes_to_caps().
     * @param caps the {@link org.gstreamer.gst.Caps} to configure this extension with
     * @return whether the {@code caps} could be successfully set on {@code ext}.
     */
    public boolean setAttributesFromCaps(org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_set_attributes_from_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * gst_rtp_header_extension_set_id() must have been called with a valid
     * extension id that is contained in these caps.
     * <p>
     * The only current known caps format is based on the SDP standard as produced
     * by gst_sdp_media_attributes_to_caps().
     * @param caps writable {@link org.gstreamer.gst.Caps} to modify
     * @return whether the configured attributes on {@code ext} can successfully be set on
     * 	{@code caps}
     */
    public boolean setCapsFromAttributes(org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_set_caps_from_attributes.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Helper implementation for GstRTPExtensionClass::set_caps_from_attributes
     * that sets the {@code ext} uri on caps with the specified extension id as required
     * for sdp {@link org.gstreamer.gst.Caps}.
     * <p>
     * Requires that the extension does not have any attributes or direction
     * advertised in {@code caps}.
     * @param caps {@link org.gstreamer.gst.Caps} to write fields into
     * @return whether the {@code ext} attributes could be set on {@code caps}.
     */
    public boolean setCapsFromAttributesHelper(org.gstreamer.gst.Caps caps, java.lang.String attributes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_rtp_header_extension_set_caps_from_attributes_helper.invokeExact(
                        handle(),
                        caps.handle(),
                        Marshal.stringToAddress.marshal(attributes, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Set the direction that this header extension should be used in.
     * If {@code GST_RTP_HEADER_EXTENSION_DIRECTION_INHERITED} is included, the
     * direction will not be included in the caps (as it shouldn't be in the
     * extmap line in the SDP).
     * @param direction The direction
     */
    public void setDirection(org.gstreamer.rtp.RTPHeaderExtensionDirection direction) {
        try {
            DowncallHandles.gst_rtp_header_extension_set_direction.invokeExact(
                    handle(),
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * sets the RTP extension id on {@code ext}
     * @param extId The id of this extension
     */
    public void setId(int extId) {
        try {
            DowncallHandles.gst_rtp_header_extension_set_id.invokeExact(
                    handle(),
                    extId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Passes RTP payloader's sink (i.e. not payloaded) {@code caps} to the header
     * extension.
     * @param caps sink {@link org.gstreamer.gst.Caps}
     * @return Whether {@code caps} could be read successfully
     */
    public boolean setNonRtpSinkCaps(org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_set_non_rtp_sink_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Call this function in a subclass from {@link RTPHeaderExtensionClass}::read to
     * tell the depayloader whether the data just parsed from RTP packet require
     * updating its src (non-RTP) caps. If {@code state} is TRUE, {@link RTPBaseDepayload} will
     * eventually invoke gst_rtp_header_extension_update_non_rtp_src_caps() to
     * have the caps update applied. Applying the update also flips the internal
     * "wants update" flag back to FALSE.
     * @param state TRUE if caps update is needed
     */
    public void setWantsUpdateNonRtpSrcCaps(boolean state) {
        try {
            DowncallHandles.gst_rtp_header_extension_set_wants_update_non_rtp_src_caps.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(state, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Updates depayloader src caps based on the information received in RTP header.
     * {@code caps} must be writable as this function may modify them.
     * @param caps src {@link org.gstreamer.gst.Caps} to modify
     * @return whether {@code caps} were modified successfully
     */
    public boolean updateNonRtpSrcCaps(org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_update_non_rtp_src_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Call this function after gst_rtp_header_extension_read() to check if
     * the depayloader's src caps need updating with data received in the last RTP
     * packet.
     * @return Whether {@code ext} wants to update depayloader's src caps.
     */
    public boolean wantsUpdateNonRtpSrcCaps() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_wants_update_non_rtp_src_caps.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes the RTP header extension to {@code data} using information available from
     * the {@code input_meta}.  {@code data} will be sized to be at least the value returned
     * from gst_rtp_header_extension_get_max_size().
     * @param inputMeta the input {@link org.gstreamer.gst.Buffer} to read information from if necessary
     * @param writeFlags {@link RTPHeaderExtensionFlags} for how the extension should
     *               be written
     * @param output output RTP {@link org.gstreamer.gst.Buffer}
     * @param data location to write the rtp header extension into
     * @param size size of {@code data}
     * @return the size of the data written, &lt; 0 on failure
     */
    public long write(org.gstreamer.gst.Buffer inputMeta, org.gstreamer.rtp.RTPHeaderExtensionFlags writeFlags, org.gstreamer.gst.Buffer output, byte[] data, long size) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.gst_rtp_header_extension_write.invokeExact(
                        handle(),
                        inputMeta.handle(),
                        writeFlags.getValue(),
                        output.handle(),
                        Interop.allocateNativeArray(data, false, SCOPE),
                        size);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_rtp_header_extension_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static @Nullable org.gstreamer.rtp.RTPHeaderExtension createFromUri(java.lang.String uri) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_rtp_header_extension_create_from_uri.invokeExact(Marshal.stringToAddress.marshal(uri, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gstreamer.rtp.RTPHeaderExtension) Interop.register(RESULT, org.gstreamer.rtp.RTPHeaderExtension.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * A {@link RTPHeaderExtension.Builder} object constructs a {@link RTPHeaderExtension} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link RTPHeaderExtension.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.Element.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link RTPHeaderExtension} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link RTPHeaderExtension}.
         * @return A new instance of {@code RTPHeaderExtension} with the properties 
         *         that were set in the Builder object.
         */
        public RTPHeaderExtension build() {
            return (RTPHeaderExtension) org.gtk.gobject.GObject.newWithProperties(
                RTPHeaderExtension.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtp_header_extension_get_direction = Interop.downcallHandle(
                "gst_rtp_header_extension_get_direction",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_get_id = Interop.downcallHandle(
                "gst_rtp_header_extension_get_id",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_get_max_size = Interop.downcallHandle(
                "gst_rtp_header_extension_get_max_size",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_get_sdp_caps_field_name = Interop.downcallHandle(
                "gst_rtp_header_extension_get_sdp_caps_field_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_get_supported_flags = Interop.downcallHandle(
                "gst_rtp_header_extension_get_supported_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_get_uri = Interop.downcallHandle(
                "gst_rtp_header_extension_get_uri",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_read = Interop.downcallHandle(
                "gst_rtp_header_extension_read",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_set_attributes_from_caps = Interop.downcallHandle(
                "gst_rtp_header_extension_set_attributes_from_caps",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_set_caps_from_attributes = Interop.downcallHandle(
                "gst_rtp_header_extension_set_caps_from_attributes",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_set_caps_from_attributes_helper = Interop.downcallHandle(
                "gst_rtp_header_extension_set_caps_from_attributes_helper",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_set_direction = Interop.downcallHandle(
                "gst_rtp_header_extension_set_direction",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_set_id = Interop.downcallHandle(
                "gst_rtp_header_extension_set_id",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_set_non_rtp_sink_caps = Interop.downcallHandle(
                "gst_rtp_header_extension_set_non_rtp_sink_caps",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_set_wants_update_non_rtp_src_caps = Interop.downcallHandle(
                "gst_rtp_header_extension_set_wants_update_non_rtp_src_caps",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_update_non_rtp_src_caps = Interop.downcallHandle(
                "gst_rtp_header_extension_update_non_rtp_src_caps",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_wants_update_non_rtp_src_caps = Interop.downcallHandle(
                "gst_rtp_header_extension_wants_update_non_rtp_src_caps",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_write = Interop.downcallHandle(
                "gst_rtp_header_extension_write",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_get_type = Interop.downcallHandle(
                "gst_rtp_header_extension_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_rtp_header_extension_create_from_uri = Interop.downcallHandle(
                "gst_rtp_header_extension_create_from_uri",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_rtp_header_extension_get_type != null;
    }
}
