package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An implementation of GstPad that can be used with {@link VideoAggregator}.
 * <p>
 * See {@link VideoAggregator} for more details.
 * @version 1.16
 */
public class VideoAggregatorConvertPad extends org.gstreamer.video.VideoAggregatorPad {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAggregatorConvertPad";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.video.VideoAggregatorPad.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("priv"),
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
     * Create a VideoAggregatorConvertPad proxy instance for the provided memory address.
     * <p>
     * Because VideoAggregatorConvertPad is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoAggregatorConvertPad(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to VideoAggregatorConvertPad if its GType is a (or inherits from) "GstVideoAggregatorConvertPad".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VideoAggregatorConvertPad} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVideoAggregatorConvertPad", a ClassCastException will be thrown.
     */
    public static VideoAggregatorConvertPad castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VideoAggregatorConvertPad.getType())) {
            return new VideoAggregatorConvertPad(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVideoAggregatorConvertPad");
        }
    }
    
    /**
     * Requests the pad to check and update the converter before the next usage to
     * update for any changes that have happened.
     */
    public void updateConversionInfo() {
        try {
            DowncallHandles.gst_video_aggregator_convert_pad_update_conversion_info.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_video_aggregator_convert_pad_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.video.VideoAggregatorPad.Build {
        
         /**
         * A {@link VideoAggregatorConvertPad.Build} object constructs a {@link VideoAggregatorConvertPad} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VideoAggregatorConvertPad} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VideoAggregatorConvertPad} using {@link VideoAggregatorConvertPad#castFrom}.
         * @return A new instance of {@code VideoAggregatorConvertPad} with the properties 
         *         that were set in the Build object.
         */
        public VideoAggregatorConvertPad construct() {
            return VideoAggregatorConvertPad.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VideoAggregatorConvertPad.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setConverterConfig(org.gstreamer.gst.Structure converterConfig) {
            names.add("converter-config");
            values.add(org.gtk.gobject.Value.create(converterConfig));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_aggregator_convert_pad_update_conversion_info = Interop.downcallHandle(
            "gst_video_aggregator_convert_pad_update_conversion_info",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_aggregator_convert_pad_get_type = Interop.downcallHandle(
            "gst_video_aggregator_convert_pad_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
