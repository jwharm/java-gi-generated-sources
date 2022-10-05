package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkMediaStream} is the integration point for media playback inside GTK.
 * <p>
 * GTK provides an implementation of the {@code GtkMediaStream} interface that
 * is called {@link MediaFile}.
 * <p>
 * Apart from application-facing API for stream playback, {@code GtkMediaStream}
 * has a number of APIs that are only useful for implementations and should
 * not be used in applications:
 * {@link MediaStream#prepared},
 * {@link MediaStream#unprepared},
 * {@link MediaStream#update},
 * {@link MediaStream#ended},
 * {@link MediaStream#seekSuccess},
 * {@link MediaStream#seekFailed},
 * {@link MediaStream#gerror},
 * {@link MediaStream#error},
 * {@link MediaStream#errorValist}.
 */
public class MediaStream extends org.gtk.gobject.Object implements org.gtk.gdk.Paintable {

    public MediaStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MediaStream */
    public static MediaStream castFrom(org.gtk.gobject.Object gobject) {
        return new MediaStream(gobject.refcounted());
    }
    
    static final MethodHandle gtk_media_stream_error_valist = Interop.downcallHandle(
        "gtk_media_stream_error_valist",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code self} into an error state using a printf()-style format string.
     * <p>
     * This is a utility function that calls {@link MediaStream#gerror}.
     * See that function for details.
     */
    public void errorValist(org.gtk.glib.Quark domain, int code, java.lang.String format, VaList args) {
        try {
            gtk_media_stream_error_valist.invokeExact(handle(), domain.getValue(), code, Interop.allocateNativeString(format).handle(), args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_gerror = Interop.downcallHandle(
        "gtk_media_stream_gerror",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code self} into an error state.
     * <p>
     * This will pause the stream (you can check for an error
     * via {@link MediaStream#getError} in your
     * GtkMediaStream.pause() implementation), abort pending
     * seeks and mark the stream as prepared.
     * <p>
     * if the stream is already in an error state, this call
     * will be ignored and the existing error will be retained.
     * <p>
     * To unset an error, the stream must be reset via a call to
     * {@link MediaStream#unprepared}.
     */
    public void gerror(org.gtk.glib.Error error) {
        try {
            gtk_media_stream_gerror.invokeExact(handle(), error.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_get_duration = Interop.downcallHandle(
        "gtk_media_stream_get_duration",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the duration of the stream.
     * <p>
     * If the duration is not known, 0 will be returned.
     */
    public long getDuration() {
        try {
            var RESULT = (long) gtk_media_stream_get_duration.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_get_ended = Interop.downcallHandle(
        "gtk_media_stream_get_ended",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the streams playback is finished.
     */
    public boolean getEnded() {
        try {
            var RESULT = (int) gtk_media_stream_get_ended.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_get_error = Interop.downcallHandle(
        "gtk_media_stream_get_error",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * If the stream is in an error state, returns the {@code GError}
     * explaining that state.
     * <p>
     * Any type of error can be reported here depending on the
     * implementation of the media stream.
     * <p>
     * A media stream in an error cannot be operated on, calls
     * like {@link MediaStream#play} or
     * {@link MediaStream#seek} will not have any effect.
     * <p>
     * {@code GtkMediaStream} itself does not provide a way to unset
     * an error, but implementations may provide options. For example,
     * a {@link MediaFile} will unset errors when a new source is
     * set, e.g. with {@link MediaFile#setFile}.
     */
    public org.gtk.glib.Error getError() {
        try {
            var RESULT = (MemoryAddress) gtk_media_stream_get_error.invokeExact(handle());
            return new org.gtk.glib.Error(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_get_loop = Interop.downcallHandle(
        "gtk_media_stream_get_loop",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the stream is set to loop.
     * <p>
     * See {@link MediaStream#setLoop} for details.
     */
    public boolean getLoop() {
        try {
            var RESULT = (int) gtk_media_stream_get_loop.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_get_muted = Interop.downcallHandle(
        "gtk_media_stream_get_muted",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the audio for the stream is muted.
     * <p>
     * See {@link MediaStream#setMuted} for details.
     */
    public boolean getMuted() {
        try {
            var RESULT = (int) gtk_media_stream_get_muted.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_get_playing = Interop.downcallHandle(
        "gtk_media_stream_get_playing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Return whether the stream is currently playing.
     */
    public boolean getPlaying() {
        try {
            var RESULT = (int) gtk_media_stream_get_playing.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_get_timestamp = Interop.downcallHandle(
        "gtk_media_stream_get_timestamp",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current presentation timestamp in microseconds.
     */
    public long getTimestamp() {
        try {
            var RESULT = (long) gtk_media_stream_get_timestamp.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_get_volume = Interop.downcallHandle(
        "gtk_media_stream_get_volume",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the volume of the audio for the stream.
     * <p>
     * See {@link MediaStream#setVolume} for details.
     */
    public double getVolume() {
        try {
            var RESULT = (double) gtk_media_stream_get_volume.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_has_audio = Interop.downcallHandle(
        "gtk_media_stream_has_audio",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the stream has audio.
     */
    public boolean hasAudio() {
        try {
            var RESULT = (int) gtk_media_stream_has_audio.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_has_video = Interop.downcallHandle(
        "gtk_media_stream_has_video",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the stream has video.
     */
    public boolean hasVideo() {
        try {
            var RESULT = (int) gtk_media_stream_has_video.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_is_prepared = Interop.downcallHandle(
        "gtk_media_stream_is_prepared",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the stream has finished initializing.
     * <p>
     * At this point the existence of audio and video is known.
     */
    public boolean isPrepared() {
        try {
            var RESULT = (int) gtk_media_stream_is_prepared.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_is_seekable = Interop.downcallHandle(
        "gtk_media_stream_is_seekable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a stream may be seekable.
     * <p>
     * This is meant to be a hint. Streams may not allow seeking even if
     * this function returns {@code true}. However, if this function returns
     * {@code false}, streams are guaranteed to not be seekable and user interfaces
     * may hide controls that allow seeking.
     * <p>
     * It is allowed to call {@link MediaStream#seek} on a non-seekable
     * stream, though it will not do anything.
     */
    public boolean isSeekable() {
        try {
            var RESULT = (int) gtk_media_stream_is_seekable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_is_seeking = Interop.downcallHandle(
        "gtk_media_stream_is_seeking",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if there is currently a seek operation going on.
     */
    public boolean isSeeking() {
        try {
            var RESULT = (int) gtk_media_stream_is_seeking.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_pause = Interop.downcallHandle(
        "gtk_media_stream_pause",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Pauses playback of the stream.
     * <p>
     * If the stream is not playing, do nothing.
     */
    public void pause() {
        try {
            gtk_media_stream_pause.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_play = Interop.downcallHandle(
        "gtk_media_stream_play",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Starts playing the stream.
     * <p>
     * If the stream is in error or already playing, do nothing.
     */
    public void play() {
        try {
            gtk_media_stream_play.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_realize = Interop.downcallHandle(
        "gtk_media_stream_realize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Called by users to attach the media stream to a {@code GdkSurface} they manage.
     * <p>
     * The stream can then access the resources of {@code surface} for its
     * rendering purposes. In particular, media streams might want to
     * create a {@code GdkGLContext} or sync to the {@code GdkFrameClock}.
     * <p>
     * Whoever calls this function is responsible for calling
     * {@link MediaStream#unrealize} before either the stream
     * or {@code surface} get destroyed.
     * <p>
     * Multiple calls to this function may happen from different
     * users of the video, even with the same {@code surface}. Each of these
     * calls must be followed by its own call to
     * {@link MediaStream#unrealize}.
     * <p>
     * It is not required to call this function to make a media stream work.
     */
    public void realize(org.gtk.gdk.Surface surface) {
        try {
            gtk_media_stream_realize.invokeExact(handle(), surface.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_seek = Interop.downcallHandle(
        "gtk_media_stream_seek",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Start a seek operation on {@code self} to {@code timestamp}.
     * <p>
     * If {@code timestamp} is out of range, it will be clamped.
     * <p>
     * Seek operations may not finish instantly. While a
     * seek operation is in process, the {@code Gtk.MediaStream:seeking}
     * property will be set.
     * <p>
     * When calling gtk_media_stream_seek() during an
     * ongoing seek operation, the new seek will override
     * any pending seek.
     */
    public void seek(long timestamp) {
        try {
            gtk_media_stream_seek.invokeExact(handle(), timestamp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_seek_failed = Interop.downcallHandle(
        "gtk_media_stream_seek_failed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Ends a seek operation started via GtkMediaStream.seek() as a failure.
     * <p>
     * This will not cause an error on the stream and will assume that
     * playback continues as if no seek had happened.
     * <p>
     * See {@link MediaStream#seekSuccess} for the other way of
     * ending a seek.
     */
    public void seekFailed() {
        try {
            gtk_media_stream_seek_failed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_seek_success = Interop.downcallHandle(
        "gtk_media_stream_seek_success",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Ends a seek operation started via GtkMediaStream.seek() successfully.
     * <p>
     * This function will unset the GtkMediaStream:ended property
     * if it was set.
     * <p>
     * See {@link MediaStream#seekFailed} for the other way of
     * ending a seek.
     */
    public void seekSuccess() {
        try {
            gtk_media_stream_seek_success.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_set_loop = Interop.downcallHandle(
        "gtk_media_stream_set_loop",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the stream should loop.
     * <p>
     * In this case, it will attempt to restart playback
     * from the beginning instead of stopping at the end.
     * <p>
     * Not all streams may support looping, in particular
     * non-seekable streams. Those streams will ignore the
     * loop setting and just end.
     */
    public void setLoop(boolean loop) {
        try {
            gtk_media_stream_set_loop.invokeExact(handle(), loop ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_set_muted = Interop.downcallHandle(
        "gtk_media_stream_set_muted",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the audio stream should be muted.
     * <p>
     * Muting a stream will cause no audio to be played, but it
     * does not modify the volume. This means that muting and
     * then unmuting the stream will restore the volume settings.
     * <p>
     * If the stream has no audio, calling this function will
     * still work but it will not have an audible effect.
     */
    public void setMuted(boolean muted) {
        try {
            gtk_media_stream_set_muted.invokeExact(handle(), muted ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_set_playing = Interop.downcallHandle(
        "gtk_media_stream_set_playing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Starts or pauses playback of the stream.
     */
    public void setPlaying(boolean playing) {
        try {
            gtk_media_stream_set_playing.invokeExact(handle(), playing ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_set_volume = Interop.downcallHandle(
        "gtk_media_stream_set_volume",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the volume of the audio stream.
     * <p>
     * This function call will work even if the stream is muted.
     * <p>
     * The given {@code volume} should range from 0.0 for silence to 1.0
     * for as loud as possible. Values outside of this range will
     * be clamped to the nearest value.
     * <p>
     * If the stream has no audio or is muted, calling this function
     * will still work but it will not have an immediate audible effect.
     * When the stream is unmuted, the new volume setting will take effect.
     */
    public void setVolume(double volume) {
        try {
            gtk_media_stream_set_volume.invokeExact(handle(), volume);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_stream_ended = Interop.downcallHandle(
        "gtk_media_stream_stream_ended",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Pauses the media stream and marks it as ended.
     * <p>
     * This is a hint only, calls to {@link MediaStream#play}
     * may still happen.
     * <p>
     * The media stream must be prepared when this function is called.
     */
    public void streamEnded() {
        try {
            gtk_media_stream_stream_ended.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_stream_prepared = Interop.downcallHandle(
        "gtk_media_stream_stream_prepared",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Called by {@code GtkMediaStream} implementations to advertise the stream
     * being ready to play and providing details about the stream.
     * <p>
     * Note that the arguments are hints. If the stream implementation
     * cannot determine the correct values, it is better to err on the
     * side of caution and return {@code true}. User interfaces will use those
     * values to determine what controls to show.
     * <p>
     * This function may not be called again until the stream has been
     * reset via {@link MediaStream#streamUnprepared}.
     */
    public void streamPrepared(boolean hasAudio, boolean hasVideo, boolean seekable, long duration) {
        try {
            gtk_media_stream_stream_prepared.invokeExact(handle(), hasAudio ? 1 : 0, hasVideo ? 1 : 0, seekable ? 1 : 0, duration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_stream_unprepared = Interop.downcallHandle(
        "gtk_media_stream_stream_unprepared",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Resets a given media stream implementation.
     * <p>
     * {@link MediaStream#streamPrepared} can then be called again.
     * <p>
     * This function will also reset any error state the stream was in.
     */
    public void streamUnprepared() {
        try {
            gtk_media_stream_stream_unprepared.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_unrealize = Interop.downcallHandle(
        "gtk_media_stream_unrealize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Undoes a previous call to gtk_media_stream_realize().
     * <p>
     * This causes the stream to release all resources it had
     * allocated from {@code surface}.
     */
    public void unrealize(org.gtk.gdk.Surface surface) {
        try {
            gtk_media_stream_unrealize.invokeExact(handle(), surface.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_stream_update = Interop.downcallHandle(
        "gtk_media_stream_update",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Media stream implementations should regularly call this
     * function to update the timestamp reported by the stream.
     * <p>
     * It is up to implementations to call this at the frequency
     * they deem appropriate.
     * <p>
     * The media stream must be prepared when this function is called.
     */
    public void update(long timestamp) {
        try {
            gtk_media_stream_update.invokeExact(handle(), timestamp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}