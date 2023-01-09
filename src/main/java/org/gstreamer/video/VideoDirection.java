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
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoDirectionImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoDirectionImpl(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
    
    /**
     * The VideoDirectionImpl type represents a native instance of the VideoDirection interface.
     */
    class VideoDirectionImpl extends org.gtk.gobject.GObject implements VideoDirection {
        
        static {
            GstVideo.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of VideoDirection for the provided memory address.
         * @param address the memory address of the instance
         */
        public VideoDirectionImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_video_direction_get_type != null;
    }
}
