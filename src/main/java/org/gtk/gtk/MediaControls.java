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
public class MediaControls extends Widget implements Accessible, Buildable, ConstraintTarget {

    public MediaControls(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MediaControls */
    public static MediaControls castFrom(org.gtk.gobject.Object gobject) {
        return new MediaControls(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_media_controls_new = Interop.downcallHandle(
        "gtk_media_controls_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable MediaStream stream) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_media_controls_new.invokeExact(stream.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkMediaControls} managing the {@code stream} passed to it.
     */
    public MediaControls(@Nullable MediaStream stream) {
        super(constructNew(stream));
    }
    
    private static final MethodHandle gtk_media_controls_get_media_stream = Interop.downcallHandle(
        "gtk_media_controls_get_media_stream",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the media stream managed by {@code controls} or {@code null} if none.
     */
    public @Nullable MediaStream getMediaStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_media_controls_get_media_stream.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new MediaStream(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_media_controls_set_media_stream = Interop.downcallHandle(
        "gtk_media_controls_set_media_stream",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the stream that is controlled by {@code controls}.
     */
    public @NotNull void setMediaStream(@Nullable MediaStream stream) {
        try {
            gtk_media_controls_set_media_stream.invokeExact(handle(), stream.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
