package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The interface allows unified access to control flipping and rotation
 * operations of video-sources or operators.
 * @version 1.10
 */
public interface VideoDirection extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to VideoDirection if its GType is a (or inherits from) "GstVideoDirection".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VideoDirection} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVideoDirection", a ClassCastException will be thrown.
     */
    public static VideoDirection castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VideoDirection.getType())) {
            return new VideoDirectionImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVideoDirection");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_video_direction_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gst_video_direction_get_type = Interop.downcallHandle(
            "gst_video_direction_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class VideoDirectionImpl extends org.gtk.gobject.Object implements VideoDirection {
        
        static {
            GstVideo.javagi$ensureInitialized();
        }
        
        public VideoDirectionImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
