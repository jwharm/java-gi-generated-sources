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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Element.getMemoryLayout().withName("parent"),
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
    
    /**
     * Create a RTPHeaderExtension proxy instance for the provided memory address.
     * <p>
     * Because RTPHeaderExtension is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RTPHeaderExtension(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to RTPHeaderExtension if its GType is a (or inherits from) "GstRTPHeaderExtension".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code RTPHeaderExtension} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstRTPHeaderExtension", a ClassCastException will be thrown.
     */
    public static RTPHeaderExtension castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), RTPHeaderExtension.getType())) {
            return new RTPHeaderExtension(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstRTPHeaderExtension");
        }
    }
    
    /**
     * Retrieve the direction
     * @return The direction
     */
    public @NotNull org.gstreamer.rtp.RTPHeaderExtensionDirection getDirection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_get_direction.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.rtp.RTPHeaderExtensionDirection(RESULT);
    }
    
    public int getId() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_get_id.invokeExact(
                    handle());
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
    public long getMaxSize(@NotNull org.gstreamer.gst.Buffer inputMeta) {
        java.util.Objects.requireNonNull(inputMeta, "Parameter 'inputMeta' must not be null");
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
    
    public @NotNull java.lang.String getSdpCapsFieldName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_header_extension_get_sdp_caps_field_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public @NotNull org.gstreamer.rtp.RTPHeaderExtensionFlags getSupportedFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_get_supported_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.rtp.RTPHeaderExtensionFlags(RESULT);
    }
    
    public @NotNull java.lang.String getUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_header_extension_get_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
    public boolean read(@NotNull org.gstreamer.rtp.RTPHeaderExtensionFlags readFlags, @NotNull byte[] data, long size, @NotNull org.gstreamer.gst.Buffer buffer) {
        java.util.Objects.requireNonNull(readFlags, "Parameter 'readFlags' must not be null");
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_read.invokeExact(
                    handle(),
                    readFlags.getValue(),
                    Interop.allocateNativeArray(data, false),
                    size,
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public boolean setAttributesFromCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_set_attributes_from_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public boolean setCapsFromAttributes(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_set_caps_from_attributes.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public boolean setCapsFromAttributesHelper(@NotNull org.gstreamer.gst.Caps caps, @NotNull java.lang.String attributes) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        java.util.Objects.requireNonNull(attributes, "Parameter 'attributes' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_set_caps_from_attributes_helper.invokeExact(
                    handle(),
                    caps.handle(),
                    Interop.allocateNativeString(attributes));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set the direction that this header extension should be used in.
     * If {@code GST_RTP_HEADER_EXTENSION_DIRECTION_INHERITED} is included, the
     * direction will not be included in the caps (as it shouldn't be in the
     * extmap line in the SDP).
     * @param direction The direction
     */
    public void setDirection(@NotNull org.gstreamer.rtp.RTPHeaderExtensionDirection direction) {
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
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
    public boolean setNonRtpSinkCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_set_non_rtp_sink_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
                    state ? 1 : 0);
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
    public boolean updateNonRtpSrcCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_update_non_rtp_src_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
            RESULT = (int) DowncallHandles.gst_rtp_header_extension_wants_update_non_rtp_src_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public long write(@NotNull org.gstreamer.gst.Buffer inputMeta, @NotNull org.gstreamer.rtp.RTPHeaderExtensionFlags writeFlags, @NotNull org.gstreamer.gst.Buffer output, @NotNull byte[] data, long size) {
        java.util.Objects.requireNonNull(inputMeta, "Parameter 'inputMeta' must not be null");
        java.util.Objects.requireNonNull(writeFlags, "Parameter 'writeFlags' must not be null");
        java.util.Objects.requireNonNull(output, "Parameter 'output' must not be null");
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_rtp_header_extension_write.invokeExact(
                    handle(),
                    inputMeta.handle(),
                    writeFlags.getValue(),
                    output.handle(),
                    Interop.allocateNativeArray(data, false),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_rtp_header_extension_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static @Nullable org.gstreamer.rtp.RTPHeaderExtension createFromUri(@NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_header_extension_create_from_uri.invokeExact(
                    Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.rtp.RTPHeaderExtension(RESULT, Ownership.FULL);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Element.Build {
        
         /**
         * A {@link RTPHeaderExtension.Build} object constructs a {@link RTPHeaderExtension} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link RTPHeaderExtension} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link RTPHeaderExtension} using {@link RTPHeaderExtension#castFrom}.
         * @return A new instance of {@code RTPHeaderExtension} with the properties 
         *         that were set in the Build object.
         */
        public RTPHeaderExtension construct() {
            return RTPHeaderExtension.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    RTPHeaderExtension.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
