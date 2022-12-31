package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The opaque base class object for all encoding profiles. This contains generic
 * information like name, description, format and preset.
 */
public class EncodingProfile extends org.gtk.gobject.GObject {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstEncodingProfile";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a EncodingProfile proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected EncodingProfile(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, EncodingProfile> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new EncodingProfile(input, ownership);
    
    /**
     * Makes a deep copy of {@code self}
     * @return The copy of {@code self}
     */
    public org.gstreamer.pbutils.EncodingProfile copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_profile_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.pbutils.EncodingProfile) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.pbutils.EncodingProfile.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get whether the format that has been negotiated in at some point can be renegotiated
     * later during the encoding.
     */
    public boolean getAllowDynamicOutput() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_encoding_profile_get_allow_dynamic_output.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_profile_get_description.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public @Nullable org.gstreamer.gst.Structure getElementProperties() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_profile_get_element_properties.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    public java.lang.String getFileExtension() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_profile_get_file_extension.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public org.gstreamer.gst.Caps getFormat() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_profile_get_format.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Computes the full output caps that this {@code profile} will be able to consume.
     * @return The full caps the given {@code profile} can consume. Call
     * gst_caps_unref() when you are done with the caps.
     */
    public org.gstreamer.gst.Caps getInputCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_profile_get_input_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    public java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_profile_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public int getPresence() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_encoding_profile_get_presence.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public java.lang.String getPreset() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_profile_get_preset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public java.lang.String getPresetName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_profile_get_preset_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public org.gstreamer.gst.Caps getRestriction() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_profile_get_restriction.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    public boolean getSingleSegment() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_encoding_profile_get_single_segment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public java.lang.String getTypeNick() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_profile_get_type_nick.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public boolean isEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_encoding_profile_is_enabled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks whether the two {@link EncodingProfile} are equal
     * @param b a {@link EncodingProfile}
     * @return {@code true} if {@code a} and {@code b} are equal, else {@code false}.
     */
    public boolean isEqual(org.gstreamer.pbutils.EncodingProfile b) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_encoding_profile_is_equal.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets whether the format that has been negotiated in at some point can be renegotiated
     * later during the encoding.
     * @param allowDynamicOutput Whether the format that has been negotiated first can be renegotiated
     * during the encoding
     */
    public void setAllowDynamicOutput(boolean allowDynamicOutput) {
        try {
            DowncallHandles.gst_encoding_profile_set_allow_dynamic_output.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(allowDynamicOutput, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set {@code description} as the given description for the {@code profile}. A copy of
     * {@code description} will be made internally.
     * @param description the description to set on the profile
     */
    public void setDescription(@Nullable java.lang.String description) {
        try {
            DowncallHandles.gst_encoding_profile_set_description.invokeExact(
                    handle(),
                    (Addressable) (description == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(description, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This allows setting the muxing/encoding element properties.
     * <p>
     * <strong>Set properties generically</strong>
     * <pre>{@code  properties
     *  [element-properties, boolean-prop=true, string-prop="hi"]
     * }</pre>
     * <p>
     * <strong>Mapping properties with well known element factories</strong>
     * <pre>{@code  properties
     * element-properties-map, map = {
     *      [openh264enc, gop-size=32, ],
     *      [x264enc, key-int-max=32, tune=zerolatency],
     *  }
     * }</pre>
     * @param elementProperties A {@link org.gstreamer.gst.Structure} defining the properties
     * to be set to the element the profile represents.
     */
    public void setElementProperties(org.gstreamer.gst.Structure elementProperties) {
        try {
            DowncallHandles.gst_encoding_profile_set_element_properties.invokeExact(
                    handle(),
                    elementProperties.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        elementProperties.yieldOwnership();
    }
    
    /**
     * Set whether the profile should be used or not.
     * @param enabled {@code false} to disable {@code profile}, {@code true} to enable it
     */
    public void setEnabled(boolean enabled) {
        try {
            DowncallHandles.gst_encoding_profile_set_enabled.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the media format used in the profile.
     * @param format the media format to use in the profile.
     */
    public void setFormat(org.gstreamer.gst.Caps format) {
        try {
            DowncallHandles.gst_encoding_profile_set_format.invokeExact(
                    handle(),
                    format.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set {@code name} as the given name for the {@code profile}. A copy of {@code name} will be made
     * internally.
     * @param name the name to set on the profile
     */
    public void setName(@Nullable java.lang.String name) {
        try {
            DowncallHandles.gst_encoding_profile_set_name.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the number of time the profile is used in its parent
     * container profile. If 0, it is not a mandatory stream
     * @param presence the number of time the profile can be used
     */
    public void setPresence(int presence) {
        try {
            DowncallHandles.gst_encoding_profile_set_presence.invokeExact(
                    handle(),
                    presence);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the name of the {@link org.gstreamer.gst.Element} that implements the {@link org.gstreamer.gst.Preset} interface
     * to use for the profile.
     * This is the name that has been set when saving the preset.
     * @param preset the element preset to use
     */
    public void setPreset(@Nullable java.lang.String preset) {
        try {
            DowncallHandles.gst_encoding_profile_set_preset.invokeExact(
                    handle(),
                    (Addressable) (preset == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(preset, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the name of the {@link org.gstreamer.gst.Preset}'s factory to be used in the profile.
     * @param presetName The name of the preset to use in this {@code profile}.
     */
    public void setPresetName(@Nullable java.lang.String presetName) {
        try {
            DowncallHandles.gst_encoding_profile_set_preset_name.invokeExact(
                    handle(),
                    (Addressable) (presetName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(presetName, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the restriction {@link org.gstreamer.gst.Caps} to apply before the encoder
     * that will be used in the profile. See gst_encoding_profile_get_restriction()
     * for more about restrictions. Does not apply to {@link EncodingContainerProfile}.
     * @param restriction the restriction to apply
     */
    public void setRestriction(@Nullable org.gstreamer.gst.Caps restriction) {
        try {
            DowncallHandles.gst_encoding_profile_set_restriction.invokeExact(
                    handle(),
                    (Addressable) (restriction == null ? MemoryAddress.NULL : restriction.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        restriction.yieldOwnership();
    }
    
    /**
     * If using a single segment, buffers will be retimestamped and segments will be
     * eat so as to appear as one segment.
     * <p>
     * <blockquote>
     *  <em>NOTE</em>: Single segment is not property supported when using
     *  {@code encodebin}:avoid-reencoding
     * </blockquote>
     * @param singleSegment {@code TRUE} if the stream represented by {@code profile} should use a
     * single segment before the encoder, {@code FALSE} otherwise.
     */
    public void setSingleSegment(boolean singleSegment) {
        try {
            DowncallHandles.gst_encoding_profile_set_single_segment.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(singleSegment, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_encoding_profile_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Find the {@link EncodingProfile} with the specified name and category.
     * @param targetname The name of the target
     * @param profilename The name of the profile, if {@code null}
     * provided, it will default to the encoding profile called {@code default}.
     * @param category The target category. Can be {@code null}
     * @return The matching {@link EncodingProfile} or {@code null}.
     */
    public static org.gstreamer.pbutils.EncodingProfile find(java.lang.String targetname, @Nullable java.lang.String profilename, @Nullable java.lang.String category) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_profile_find.invokeExact(
                    Marshal.stringToAddress.marshal(targetname, null),
                    (Addressable) (profilename == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(profilename, null)),
                    (Addressable) (category == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(category, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.pbutils.EncodingProfile) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.pbutils.EncodingProfile.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a {@link EncodingProfile} matching the formats from the given
     * {@link DiscovererInfo}. Streams other than audio or video (eg,
     * subtitles), are currently ignored.
     * @param info The {@link DiscovererInfo} to read from
     * @return The new {@link EncodingProfile} or {@code null}.
     */
    public static org.gstreamer.pbutils.EncodingProfile fromDiscoverer(org.gstreamer.pbutils.DiscovererInfo info) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_profile_from_discoverer.invokeExact(
                    info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.pbutils.EncodingProfile) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.pbutils.EncodingProfile.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * A {@link EncodingProfile.Builder} object constructs a {@link EncodingProfile} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link EncodingProfile.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link EncodingProfile} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EncodingProfile}.
         * @return A new instance of {@code EncodingProfile} with the properties 
         *         that were set in the Builder object.
         */
        public EncodingProfile build() {
            return (EncodingProfile) org.gtk.gobject.GObject.newWithProperties(
                EncodingProfile.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * A {@link org.gstreamer.gst.Structure} defining the properties to be set to the element
         * the profile represents.
         * <p>
         * For example for {@code av1enc}:
         * <pre>{@code 
         * element-properties,row-mt=true, end-usage=vbr
         * }</pre>
         * @param elementProperties The value for the {@code element-properties} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setElementProperties(org.gstreamer.gst.Structure elementProperties) {
            names.add("element-properties");
            values.add(org.gtk.gobject.Value.create(elementProperties));
            return this;
        }
        
        public Builder setRestrictionCaps(org.gstreamer.gst.Caps restrictionCaps) {
            names.add("restriction-caps");
            values.add(org.gtk.gobject.Value.create(restrictionCaps));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_encoding_profile_copy = Interop.downcallHandle(
            "gst_encoding_profile_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_get_allow_dynamic_output = Interop.downcallHandle(
            "gst_encoding_profile_get_allow_dynamic_output",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_get_description = Interop.downcallHandle(
            "gst_encoding_profile_get_description",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_get_element_properties = Interop.downcallHandle(
            "gst_encoding_profile_get_element_properties",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_get_file_extension = Interop.downcallHandle(
            "gst_encoding_profile_get_file_extension",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_get_format = Interop.downcallHandle(
            "gst_encoding_profile_get_format",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_get_input_caps = Interop.downcallHandle(
            "gst_encoding_profile_get_input_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_get_name = Interop.downcallHandle(
            "gst_encoding_profile_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_get_presence = Interop.downcallHandle(
            "gst_encoding_profile_get_presence",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_get_preset = Interop.downcallHandle(
            "gst_encoding_profile_get_preset",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_get_preset_name = Interop.downcallHandle(
            "gst_encoding_profile_get_preset_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_get_restriction = Interop.downcallHandle(
            "gst_encoding_profile_get_restriction",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_get_single_segment = Interop.downcallHandle(
            "gst_encoding_profile_get_single_segment",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_get_type_nick = Interop.downcallHandle(
            "gst_encoding_profile_get_type_nick",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_is_enabled = Interop.downcallHandle(
            "gst_encoding_profile_is_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_is_equal = Interop.downcallHandle(
            "gst_encoding_profile_is_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_set_allow_dynamic_output = Interop.downcallHandle(
            "gst_encoding_profile_set_allow_dynamic_output",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_set_description = Interop.downcallHandle(
            "gst_encoding_profile_set_description",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_set_element_properties = Interop.downcallHandle(
            "gst_encoding_profile_set_element_properties",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_set_enabled = Interop.downcallHandle(
            "gst_encoding_profile_set_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_set_format = Interop.downcallHandle(
            "gst_encoding_profile_set_format",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_set_name = Interop.downcallHandle(
            "gst_encoding_profile_set_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_set_presence = Interop.downcallHandle(
            "gst_encoding_profile_set_presence",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_set_preset = Interop.downcallHandle(
            "gst_encoding_profile_set_preset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_set_preset_name = Interop.downcallHandle(
            "gst_encoding_profile_set_preset_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_set_restriction = Interop.downcallHandle(
            "gst_encoding_profile_set_restriction",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_set_single_segment = Interop.downcallHandle(
            "gst_encoding_profile_set_single_segment",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_get_type = Interop.downcallHandle(
            "gst_encoding_profile_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_find = Interop.downcallHandle(
            "gst_encoding_profile_find",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_profile_from_discoverer = Interop.downcallHandle(
            "gst_encoding_profile_from_discoverer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
