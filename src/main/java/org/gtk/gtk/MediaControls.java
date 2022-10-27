package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkMediaControls} is a widget to show controls for a video.
 * <p>
 * <img src="./doc-files/media-controls.png" alt="An example GtkMediaControls">
 * <p>
 * Usually, {@code GtkMediaControls} is used as part of {@link Video}.
 */
public class MediaControls extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public MediaControls(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MediaControls */
    public static MediaControls castFrom(org.gtk.gobject.Object gobject) {
        return new MediaControls(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gtk.MediaStream stream) {
        java.util.Objects.requireNonNullElse(stream, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_media_controls_new.invokeExact(stream.handle()), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkMediaControls} managing the {@code stream} passed to it.
     * @param stream a {@code GtkMediaStream} to manage
     */
    public MediaControls(@Nullable org.gtk.gtk.MediaStream stream) {
        super(constructNew(stream));
    }
    
    /**
     * Gets the media stream managed by {@code controls} or {@code null} if none.
     * @return The media stream managed by {@code controls}
     */
    public @Nullable org.gtk.gtk.MediaStream getMediaStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_media_controls_get_media_stream.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.MediaStream(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the stream that is controlled by {@code controls}.
     * @param stream a {@code GtkMediaStream}
     */
    public void setMediaStream(@Nullable org.gtk.gtk.MediaStream stream) {
        java.util.Objects.requireNonNullElse(stream, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_media_controls_set_media_stream.invokeExact(handle(), stream.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_media_controls_new = Interop.downcallHandle(
            "gtk_media_controls_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_media_controls_get_media_stream = Interop.downcallHandle(
            "gtk_media_controls_get_media_stream",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_media_controls_set_media_stream = Interop.downcallHandle(
            "gtk_media_controls_set_media_stream",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
