package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An implementation of GstPad that can be used with {@link VideoAggregator}.
 * <p>
 * See {@link VideoAggregator} for more details.
 * @version 1.20
 */
public class VideoAggregatorParallelConvertPad extends org.gstreamer.video.VideoAggregatorConvertPad {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAggregatorParallelConvertPad";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.video.VideoAggregatorConvertPad.getMemoryLayout().withName("parent_instance")
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
     * Create a VideoAggregatorParallelConvertPad proxy instance for the provided memory address.
     * <p>
     * Because VideoAggregatorParallelConvertPad is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoAggregatorParallelConvertPad(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to VideoAggregatorParallelConvertPad if its GType is a (or inherits from) "GstVideoAggregatorParallelConvertPad".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VideoAggregatorParallelConvertPad} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVideoAggregatorParallelConvertPad", a ClassCastException will be thrown.
     */
    public static VideoAggregatorParallelConvertPad castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VideoAggregatorParallelConvertPad.getType())) {
            return new VideoAggregatorParallelConvertPad(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVideoAggregatorParallelConvertPad");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_video_aggregator_parallel_convert_pad_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.video.VideoAggregatorConvertPad.Build {
        
         /**
         * A {@link VideoAggregatorParallelConvertPad.Build} object constructs a {@link VideoAggregatorParallelConvertPad} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VideoAggregatorParallelConvertPad} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VideoAggregatorParallelConvertPad} using {@link VideoAggregatorParallelConvertPad#castFrom}.
         * @return A new instance of {@code VideoAggregatorParallelConvertPad} with the properties 
         *         that were set in the Build object.
         */
        public VideoAggregatorParallelConvertPad construct() {
            return VideoAggregatorParallelConvertPad.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VideoAggregatorParallelConvertPad.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_aggregator_parallel_convert_pad_get_type = Interop.downcallHandle(
            "gst_video_aggregator_parallel_convert_pad_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
