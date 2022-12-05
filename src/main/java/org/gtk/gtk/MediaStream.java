package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkMediaStream";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
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
     * Create a MediaStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MediaStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to MediaStream if its GType is a (or inherits from) "GtkMediaStream".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code MediaStream} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkMediaStream", a ClassCastException will be thrown.
     */
    public static MediaStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), MediaStream.getType())) {
            return new MediaStream(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkMediaStream");
        }
    }
    
    /**
     * Pauses the media stream and marks it as ended.
     * <p>
     * This is a hint only, calls to {@link MediaStream#play}
     * may still happen.
     * <p>
     * The media stream must be prepared when this function is called.
     * @deprecated Use {@link MediaStream#streamEnded} instead
     */
    @Deprecated
    public void ended() {
        try {
            DowncallHandles.gtk_media_stream_ended.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code self} into an error state using a printf()-style format string.
     * <p>
     * This is a utility function that calls {@link MediaStream#gerror}.
     * See that function for details.
     * @param domain error domain
     * @param code error code
     * @param format printf()-style format for error message
     * @param varargs parameters for message format
     */
    public void error(@NotNull org.gtk.glib.Quark domain, int code, @NotNull java.lang.String format, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.gtk_media_stream_error.invokeExact(
                    handle(),
                    domain.getValue().intValue(),
                    code,
                    Interop.allocateNativeString(format),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code self} into an error state using a printf()-style format string.
     * <p>
     * This is a utility function that calls {@link MediaStream#gerror}.
     * See that function for details.
     * @param domain error domain
     * @param code error code
     * @param format printf()-style format for error message
     * @param args {@code va_list} of parameters for the message format
     */
    public void errorValist(@NotNull org.gtk.glib.Quark domain, int code, @NotNull java.lang.String format, @NotNull VaList args) {
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        try {
            DowncallHandles.gtk_media_stream_error_valist.invokeExact(
                    handle(),
                    domain.getValue().intValue(),
                    code,
                    Interop.allocateNativeString(format),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param error the {@code GError} to set
     */
    public void gerror(@NotNull org.gtk.glib.Error error) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        try {
            DowncallHandles.gtk_media_stream_gerror.invokeExact(
                    handle(),
                    error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        error.yieldOwnership();
    }
    
    /**
     * Gets the duration of the stream.
     * <p>
     * If the duration is not known, 0 will be returned.
     * @return the duration of the stream or 0 if not known.
     */
    public long getDuration() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_media_stream_get_duration.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether the streams playback is finished.
     * @return {@code true} if playback is finished
     */
    public boolean getEnded() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_media_stream_get_ended.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
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
     * @return {@code null} if not in an
     *   error state or the {@code GError} of the stream
     */
    public @Nullable org.gtk.glib.Error getError() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_media_stream_get_error.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Error(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the stream is set to loop.
     * <p>
     * See {@link MediaStream#setLoop} for details.
     * @return {@code true} if the stream should loop
     */
    public boolean getLoop() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_media_stream_get_loop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the audio for the stream is muted.
     * <p>
     * See {@link MediaStream#setMuted} for details.
     * @return {@code true} if the stream is muted
     */
    public boolean getMuted() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_media_stream_get_muted.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Return whether the stream is currently playing.
     * @return {@code true} if the stream is playing
     */
    public boolean getPlaying() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_media_stream_get_playing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the current presentation timestamp in microseconds.
     * @return the timestamp in microseconds
     */
    public long getTimestamp() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_media_stream_get_timestamp.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the volume of the audio for the stream.
     * <p>
     * See {@link MediaStream#setVolume} for details.
     * @return volume of the stream from 0.0 to 1.0
     */
    public double getVolume() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_media_stream_get_volume.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether the stream has audio.
     * @return {@code true} if the stream has audio
     */
    public boolean hasAudio() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_media_stream_has_audio.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the stream has video.
     * @return {@code true} if the stream has video
     */
    public boolean hasVideo() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_media_stream_has_video.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the stream has finished initializing.
     * <p>
     * At this point the existence of audio and video is known.
     * @return {@code true} if the stream is prepared
     */
    public boolean isPrepared() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_media_stream_is_prepared.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
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
     * @return {@code true} if the stream may support seeking
     */
    public boolean isSeekable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_media_stream_is_seekable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if there is currently a seek operation going on.
     * @return {@code true} if a seek operation is ongoing.
     */
    public boolean isSeeking() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_media_stream_is_seeking.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Pauses playback of the stream.
     * <p>
     * If the stream is not playing, do nothing.
     */
    public void pause() {
        try {
            DowncallHandles.gtk_media_stream_pause.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Starts playing the stream.
     * <p>
     * If the stream is in error or already playing, do nothing.
     */
    public void play() {
        try {
            DowncallHandles.gtk_media_stream_play.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Same as gtk_media_stream_stream_prepared().
     * @param hasAudio {@code true} if the stream should advertise audio support
     * @param hasVideo {@code true} if the stream should advertise video support
     * @param seekable {@code true} if the stream should advertise seekability
     * @param duration The duration of the stream or 0 if unknown
     * @deprecated Use {@link MediaStream#streamPrepared} instead.
     */
    @Deprecated
    public void prepared(boolean hasAudio, boolean hasVideo, boolean seekable, long duration) {
        try {
            DowncallHandles.gtk_media_stream_prepared.invokeExact(
                    handle(),
                    hasAudio ? 1 : 0,
                    hasVideo ? 1 : 0,
                    seekable ? 1 : 0,
                    duration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param surface a {@code GdkSurface}
     */
    public void realize(@NotNull org.gtk.gdk.Surface surface) {
        java.util.Objects.requireNonNull(surface, "Parameter 'surface' must not be null");
        try {
            DowncallHandles.gtk_media_stream_realize.invokeExact(
                    handle(),
                    surface.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param timestamp timestamp to seek to.
     */
    public void seek(long timestamp) {
        try {
            DowncallHandles.gtk_media_stream_seek.invokeExact(
                    handle(),
                    timestamp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
            DowncallHandles.gtk_media_stream_seek_failed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
            DowncallHandles.gtk_media_stream_seek_success.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the stream should loop.
     * <p>
     * In this case, it will attempt to restart playback
     * from the beginning instead of stopping at the end.
     * <p>
     * Not all streams may support looping, in particular
     * non-seekable streams. Those streams will ignore the
     * loop setting and just end.
     * @param loop {@code true} if the stream should loop
     */
    public void setLoop(boolean loop) {
        try {
            DowncallHandles.gtk_media_stream_set_loop.invokeExact(
                    handle(),
                    loop ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the audio stream should be muted.
     * <p>
     * Muting a stream will cause no audio to be played, but it
     * does not modify the volume. This means that muting and
     * then unmuting the stream will restore the volume settings.
     * <p>
     * If the stream has no audio, calling this function will
     * still work but it will not have an audible effect.
     * @param muted {@code true} if the stream should be muted
     */
    public void setMuted(boolean muted) {
        try {
            DowncallHandles.gtk_media_stream_set_muted.invokeExact(
                    handle(),
                    muted ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Starts or pauses playback of the stream.
     * @param playing whether to start or pause playback
     */
    public void setPlaying(boolean playing) {
        try {
            DowncallHandles.gtk_media_stream_set_playing.invokeExact(
                    handle(),
                    playing ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param volume New volume of the stream from 0.0 to 1.0
     */
    public void setVolume(double volume) {
        try {
            DowncallHandles.gtk_media_stream_set_volume.invokeExact(
                    handle(),
                    volume);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
            DowncallHandles.gtk_media_stream_stream_ended.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param hasAudio {@code true} if the stream should advertise audio support
     * @param hasVideo {@code true} if the stream should advertise video support
     * @param seekable {@code true} if the stream should advertise seekability
     * @param duration The duration of the stream or 0 if unknown
     */
    public void streamPrepared(boolean hasAudio, boolean hasVideo, boolean seekable, long duration) {
        try {
            DowncallHandles.gtk_media_stream_stream_prepared.invokeExact(
                    handle(),
                    hasAudio ? 1 : 0,
                    hasVideo ? 1 : 0,
                    seekable ? 1 : 0,
                    duration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Resets a given media stream implementation.
     * <p>
     * {@link MediaStream#streamPrepared} can then be called again.
     * <p>
     * This function will also reset any error state the stream was in.
     */
    public void streamUnprepared() {
        try {
            DowncallHandles.gtk_media_stream_stream_unprepared.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Same as gtk_media_stream_stream_unprepared().
     * @deprecated Use {@link MediaStream#streamUnprepared} instead.
     */
    @Deprecated
    public void unprepared() {
        try {
            DowncallHandles.gtk_media_stream_unprepared.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Undoes a previous call to gtk_media_stream_realize().
     * <p>
     * This causes the stream to release all resources it had
     * allocated from {@code surface}.
     * @param surface the {@code GdkSurface} the stream was realized with
     */
    public void unrealize(@NotNull org.gtk.gdk.Surface surface) {
        java.util.Objects.requireNonNull(surface, "Parameter 'surface' must not be null");
        try {
            DowncallHandles.gtk_media_stream_unrealize.invokeExact(
                    handle(),
                    surface.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Media stream implementations should regularly call this
     * function to update the timestamp reported by the stream.
     * <p>
     * It is up to implementations to call this at the frequency
     * they deem appropriate.
     * <p>
     * The media stream must be prepared when this function is called.
     * @param timestamp the new timestamp
     */
    public void update(long timestamp) {
        try {
            DowncallHandles.gtk_media_stream_update.invokeExact(
                    handle(),
                    timestamp);
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
            RESULT = (long) DowncallHandles.gtk_media_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link MediaStream.Build} object constructs a {@link MediaStream} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link MediaStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MediaStream} using {@link MediaStream#castFrom}.
         * @return A new instance of {@code MediaStream} with the properties 
         *         that were set in the Build object.
         */
        public MediaStream construct() {
            return MediaStream.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    MediaStream.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The stream's duration in microseconds or 0 if unknown.
         * @param duration The value for the {@code duration} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDuration(long duration) {
            names.add("duration");
            values.add(org.gtk.gobject.Value.create(duration));
            return this;
        }
        
        /**
         * Set when playback has finished.
         * @param ended The value for the {@code ended} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEnded(boolean ended) {
            names.add("ended");
            values.add(org.gtk.gobject.Value.create(ended));
            return this;
        }
        
        /**
         * {@code null} for a properly working stream or the {@code GError}
         * that the stream is in.
         * @param error The value for the {@code error} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setError(org.gtk.glib.Error error) {
            names.add("error");
            values.add(org.gtk.gobject.Value.create(error));
            return this;
        }
        
        /**
         * Whether the stream contains audio.
         * @param hasAudio The value for the {@code has-audio} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHasAudio(boolean hasAudio) {
            names.add("has-audio");
            values.add(org.gtk.gobject.Value.create(hasAudio));
            return this;
        }
        
        /**
         * Whether the stream contains video.
         * @param hasVideo The value for the {@code has-video} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHasVideo(boolean hasVideo) {
            names.add("has-video");
            values.add(org.gtk.gobject.Value.create(hasVideo));
            return this;
        }
        
        /**
         * Try to restart the media from the beginning once it ended.
         * @param loop The value for the {@code loop} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLoop(boolean loop) {
            names.add("loop");
            values.add(org.gtk.gobject.Value.create(loop));
            return this;
        }
        
        /**
         * Whether the audio stream should be muted.
         * @param muted The value for the {@code muted} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMuted(boolean muted) {
            names.add("muted");
            values.add(org.gtk.gobject.Value.create(muted));
            return this;
        }
        
        /**
         * Whether the stream is currently playing.
         * @param playing The value for the {@code playing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPlaying(boolean playing) {
            names.add("playing");
            values.add(org.gtk.gobject.Value.create(playing));
            return this;
        }
        
        /**
         * Whether the stream has finished initializing and existence of
         * audio and video is known.
         * @param prepared The value for the {@code prepared} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPrepared(boolean prepared) {
            names.add("prepared");
            values.add(org.gtk.gobject.Value.create(prepared));
            return this;
        }
        
        /**
         * Set unless the stream is known to not support seeking.
         * @param seekable The value for the {@code seekable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSeekable(boolean seekable) {
            names.add("seekable");
            values.add(org.gtk.gobject.Value.create(seekable));
            return this;
        }
        
        /**
         * Set while a seek is in progress.
         * @param seeking The value for the {@code seeking} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSeeking(boolean seeking) {
            names.add("seeking");
            values.add(org.gtk.gobject.Value.create(seeking));
            return this;
        }
        
        /**
         * The current presentation timestamp in microseconds.
         * @param timestamp The value for the {@code timestamp} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTimestamp(long timestamp) {
            names.add("timestamp");
            values.add(org.gtk.gobject.Value.create(timestamp));
            return this;
        }
        
        /**
         * Volume of the audio stream.
         * @param volume The value for the {@code volume} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVolume(double volume) {
            names.add("volume");
            values.add(org.gtk.gobject.Value.create(volume));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_media_stream_ended = Interop.downcallHandle(
            "gtk_media_stream_ended",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_error = Interop.downcallHandle(
            "gtk_media_stream_error",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_media_stream_error_valist = Interop.downcallHandle(
            "gtk_media_stream_error_valist",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_gerror = Interop.downcallHandle(
            "gtk_media_stream_gerror",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_get_duration = Interop.downcallHandle(
            "gtk_media_stream_get_duration",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_get_ended = Interop.downcallHandle(
            "gtk_media_stream_get_ended",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_get_error = Interop.downcallHandle(
            "gtk_media_stream_get_error",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_get_loop = Interop.downcallHandle(
            "gtk_media_stream_get_loop",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_get_muted = Interop.downcallHandle(
            "gtk_media_stream_get_muted",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_get_playing = Interop.downcallHandle(
            "gtk_media_stream_get_playing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_get_timestamp = Interop.downcallHandle(
            "gtk_media_stream_get_timestamp",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_get_volume = Interop.downcallHandle(
            "gtk_media_stream_get_volume",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_has_audio = Interop.downcallHandle(
            "gtk_media_stream_has_audio",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_has_video = Interop.downcallHandle(
            "gtk_media_stream_has_video",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_is_prepared = Interop.downcallHandle(
            "gtk_media_stream_is_prepared",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_is_seekable = Interop.downcallHandle(
            "gtk_media_stream_is_seekable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_is_seeking = Interop.downcallHandle(
            "gtk_media_stream_is_seeking",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_pause = Interop.downcallHandle(
            "gtk_media_stream_pause",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_play = Interop.downcallHandle(
            "gtk_media_stream_play",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_prepared = Interop.downcallHandle(
            "gtk_media_stream_prepared",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gtk_media_stream_realize = Interop.downcallHandle(
            "gtk_media_stream_realize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_seek = Interop.downcallHandle(
            "gtk_media_stream_seek",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gtk_media_stream_seek_failed = Interop.downcallHandle(
            "gtk_media_stream_seek_failed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_seek_success = Interop.downcallHandle(
            "gtk_media_stream_seek_success",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_set_loop = Interop.downcallHandle(
            "gtk_media_stream_set_loop",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_media_stream_set_muted = Interop.downcallHandle(
            "gtk_media_stream_set_muted",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_media_stream_set_playing = Interop.downcallHandle(
            "gtk_media_stream_set_playing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_media_stream_set_volume = Interop.downcallHandle(
            "gtk_media_stream_set_volume",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_media_stream_stream_ended = Interop.downcallHandle(
            "gtk_media_stream_stream_ended",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_stream_prepared = Interop.downcallHandle(
            "gtk_media_stream_stream_prepared",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gtk_media_stream_stream_unprepared = Interop.downcallHandle(
            "gtk_media_stream_stream_unprepared",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_unprepared = Interop.downcallHandle(
            "gtk_media_stream_unprepared",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_unrealize = Interop.downcallHandle(
            "gtk_media_stream_unrealize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_stream_update = Interop.downcallHandle(
            "gtk_media_stream_update",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gtk_media_stream_get_type = Interop.downcallHandle(
            "gtk_media_stream_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
