package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkMediaStream</code> is the integration point for media playback inside GTK.
 * <p>
 * GTK provides an implementation of the <code>GtkMediaStream</code> interface that
 * is called {@link org.gtk.gtk.MediaFile}.
 * <p>
 * Apart from application-facing API for stream playback, <code>GtkMediaStream</code>
 * has a number of APIs that are only useful for implementations and should
 * not be used in applications:
 * {@link org.gtk.gtk.MediaStream<code>#prepared</code> ,
 * {@link org.gtk.gtk.MediaStream<code>#unprepared</code> ,
 * {@link org.gtk.gtk.MediaStream<code>#update</code> ,
 * {@link org.gtk.gtk.MediaStream<code>#ended</code> ,
 * {@link org.gtk.gtk.MediaStream<code>#seekSuccess</code> ,
 * {@link org.gtk.gtk.MediaStream<code>#seekFailed</code> ,
 * {@link org.gtk.gtk.MediaStream<code>#gerror</code> ,
 * {@link org.gtk.gtk.MediaStream<code>#error</code> ,
 * {@link org.gtk.gtk.MediaStream<code>#errorValist</code> .
 */
public class MediaStream extends org.gtk.gobject.Object implements org.gtk.gdk.Paintable {

    public MediaStream(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MediaStream */
    public static MediaStream castFrom(org.gtk.gobject.Object gobject) {
        return new MediaStream(gobject.getReference());
    }
    
    /**
     * Sets @self into an error state using a printf()-style format string.
     * 
     * This is a utility function that calls {@link org.gtk.gtk.MediaStream<code>#gerror</code> .
     * See that function for details.
     */
    public void errorValist(org.gtk.glib.Quark domain, int code, java.lang.String format, VaList args) {
        gtk_h.gtk_media_stream_error_valist(handle(), domain.getValue(), code, Interop.allocateNativeString(format).handle(), args);
    }
    
    /**
     * Sets @self into an error state.
     * 
     * This will pause the stream (you can check for an error
     * via {@link org.gtk.gtk.MediaStream<code>#getError</code>  in your
     * GtkMediaStream.pause() implementation), abort pending
     * seeks and mark the stream as prepared.
     * 
     * if the stream is already in an error state, this call
     * will be ignored and the existing error will be retained.
     * 
     * To unset an error, the stream must be reset via a call to
     * {@link org.gtk.gtk.MediaStream<code>#unprepared</code> .
     */
    public void gerror(org.gtk.glib.Error error) {
        gtk_h.gtk_media_stream_gerror(handle(), error.handle());
    }
    
    /**
     * Gets the duration of the stream.
     * 
     * If the duration is not known, 0 will be returned.
     */
    public long getDuration() {
        var RESULT = gtk_h.gtk_media_stream_get_duration(handle());
        return RESULT;
    }
    
    /**
     * Returns whether the streams playback is finished.
     */
    public boolean getEnded() {
        var RESULT = gtk_h.gtk_media_stream_get_ended(handle());
        return (RESULT != 0);
    }
    
    /**
     * If the stream is in an error state, returns the <code>GError</code>
     * explaining that state.
     * <p>
     * Any type of error can be reported here depending on the
     * implementation of the media stream.
     * <p>
     * A media stream in an error cannot be operated on, calls
     * like {@link org.gtk.gtk.MediaStream<code>#play</code>  or
     * {@link org.gtk.gtk.MediaStream<code>#seek</code>  will not have any effect.
     * <p><code>GtkMediaStream</code> itself does not provide a way to unset
     * an error, but implementations may provide options. For example,
     * a {@link org.gtk.gtk.MediaFile} will unset errors when a new source is
     * set, e.g. with {@link org.gtk.gtk.MediaFile<code>#setFile</code> .
     */
    public org.gtk.glib.Error getError() {
        var RESULT = gtk_h.gtk_media_stream_get_error(handle());
        return new org.gtk.glib.Error(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the stream is set to loop.
     * 
     * See {@link org.gtk.gtk.MediaStream<code>#setLoop</code>  for details.
     */
    public boolean getLoop() {
        var RESULT = gtk_h.gtk_media_stream_get_loop(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the audio for the stream is muted.
     * 
     * See {@link org.gtk.gtk.MediaStream<code>#setMuted</code>  for details.
     */
    public boolean getMuted() {
        var RESULT = gtk_h.gtk_media_stream_get_muted(handle());
        return (RESULT != 0);
    }
    
    /**
     * Return whether the stream is currently playing.
     */
    public boolean getPlaying() {
        var RESULT = gtk_h.gtk_media_stream_get_playing(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the current presentation timestamp in microseconds.
     */
    public long getTimestamp() {
        var RESULT = gtk_h.gtk_media_stream_get_timestamp(handle());
        return RESULT;
    }
    
    /**
     * Returns the volume of the audio for the stream.
     * 
     * See {@link org.gtk.gtk.MediaStream<code>#setVolume</code>  for details.
     */
    public double getVolume() {
        var RESULT = gtk_h.gtk_media_stream_get_volume(handle());
        return RESULT;
    }
    
    /**
     * Returns whether the stream has audio.
     */
    public boolean hasAudio() {
        var RESULT = gtk_h.gtk_media_stream_has_audio(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the stream has video.
     */
    public boolean hasVideo() {
        var RESULT = gtk_h.gtk_media_stream_has_video(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the stream has finished initializing.
     * 
     * At this point the existence of audio and video is known.
     */
    public boolean isPrepared() {
        var RESULT = gtk_h.gtk_media_stream_is_prepared(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a stream may be seekable.
     * 
     * This is meant to be a hint. Streams may not allow seeking even if
     * this function returns <code>true</code>  However, if this function returns
     * <code>false</code>  streams are guaranteed to not be seekable and user interfaces
     * may hide controls that allow seeking.
     * 
     * It is allowed to call {@link org.gtk.gtk.MediaStream<code>#seek</code>  on a non-seekable
     * stream, though it will not do anything.
     */
    public boolean isSeekable() {
        var RESULT = gtk_h.gtk_media_stream_is_seekable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if there is currently a seek operation going on.
     */
    public boolean isSeeking() {
        var RESULT = gtk_h.gtk_media_stream_is_seeking(handle());
        return (RESULT != 0);
    }
    
    /**
     * Pauses playback of the stream.
     * 
     * If the stream is not playing, do nothing.
     */
    public void pause() {
        gtk_h.gtk_media_stream_pause(handle());
    }
    
    /**
     * Starts playing the stream.
     * 
     * If the stream is in error or already playing, do nothing.
     */
    public void play() {
        gtk_h.gtk_media_stream_play(handle());
    }
    
    /**
     * Called by users to attach the media stream to a <code>GdkSurface</code> they manage.
     * <p>
     * The stream can then access the resources of @surface for its
     * rendering purposes. In particular, media streams might want to
     * create a <code>GdkGLContext</code> or sync to the <code>GdkFrameClock</code>.
     * 
     * Whoever calls this function is responsible for calling
     * {@link org.gtk.gtk.MediaStream<code>#unrealize</code>  before either the stream
     * or @surface get destroyed.
     * 
     * Multiple calls to this function may happen from different
     * users of the video, even with the same @surface. Each of these
     * calls must be followed by its own call to
     * {@link org.gtk.gtk.MediaStream<code>#unrealize</code> .
     * 
     * It is not required to call this function to make a media stream work.
     */
    public void realize(org.gtk.gdk.Surface surface) {
        gtk_h.gtk_media_stream_realize(handle(), surface.handle());
    }
    
    /**
     * Start a seek operation on @self to @timestamp.
     * 
     * If @timestamp is out of range, it will be clamped.
     * 
     * Seek operations may not finish instantly. While a
     * seek operation is in process, the {@link [property@Gtk.MediaStream:seeking] (ref=property)}
     * property will be set.
     * 
     * When calling gtk_media_stream_seek() during an
     * ongoing seek operation, the new seek will override
     * any pending seek.
     */
    public void seek(long timestamp) {
        gtk_h.gtk_media_stream_seek(handle(), timestamp);
    }
    
    /**
     * Ends a seek operation started via GtkMediaStream.seek() as a failure.
     * 
     * This will not cause an error on the stream and will assume that
     * playback continues as if no seek had happened.
     * 
     * See {@link org.gtk.gtk.MediaStream<code>#seekSuccess</code>  for the other way of
     * ending a seek.
     */
    public void seekFailed() {
        gtk_h.gtk_media_stream_seek_failed(handle());
    }
    
    /**
     * Ends a seek operation started via GtkMediaStream.seek() successfully.
     * 
     * This function will unset the GtkMediaStream:ended property
     * if it was set.
     * 
     * See {@link org.gtk.gtk.MediaStream<code>#seekFailed</code>  for the other way of
     * ending a seek.
     */
    public void seekSuccess() {
        gtk_h.gtk_media_stream_seek_success(handle());
    }
    
    /**
     * Sets whether the stream should loop.
     * 
     * In this case, it will attempt to restart playback
     * from the beginning instead of stopping at the end.
     * 
     * Not all streams may support looping, in particular
     * non-seekable streams. Those streams will ignore the
     * loop setting and just end.
     */
    public void setLoop(boolean loop) {
        gtk_h.gtk_media_stream_set_loop(handle(), loop ? 1 : 0);
    }
    
    /**
     * Sets whether the audio stream should be muted.
     * 
     * Muting a stream will cause no audio to be played, but it
     * does not modify the volume. This means that muting and
     * then unmuting the stream will restore the volume settings.
     * 
     * If the stream has no audio, calling this function will
     * still work but it will not have an audible effect.
     */
    public void setMuted(boolean muted) {
        gtk_h.gtk_media_stream_set_muted(handle(), muted ? 1 : 0);
    }
    
    /**
     * Starts or pauses playback of the stream.
     */
    public void setPlaying(boolean playing) {
        gtk_h.gtk_media_stream_set_playing(handle(), playing ? 1 : 0);
    }
    
    /**
     * Sets the volume of the audio stream.
     * 
     * This function call will work even if the stream is muted.
     * 
     * The given @volume should range from 0.0 for silence to 1.0
     * for as loud as possible. Values outside of this range will
     * be clamped to the nearest value.
     * 
     * If the stream has no audio or is muted, calling this function
     * will still work but it will not have an immediate audible effect.
     * When the stream is unmuted, the new volume setting will take effect.
     */
    public void setVolume(double volume) {
        gtk_h.gtk_media_stream_set_volume(handle(), volume);
    }
    
    /**
     * Pauses the media stream and marks it as ended.
     * 
     * This is a hint only, calls to {@link org.gtk.gtk.MediaStream<code>#play</code> 
     * may still happen.
     * 
     * The media stream must be prepared when this function is called.
     */
    public void streamEnded() {
        gtk_h.gtk_media_stream_stream_ended(handle());
    }
    
    /**
     * Called by <code>GtkMediaStream</code> implementations to advertise the stream
     * being ready to play and providing details about the stream.
     * 
     * Note that the arguments are hints. If the stream implementation
     * cannot determine the correct values, it is better to err on the
     * side of caution and return <code>true</code>  User interfaces will use those
     * values to determine what controls to show.
     * 
     * This function may not be called again until the stream has been
     * reset via {@link org.gtk.gtk.MediaStream<code>#streamUnprepared</code> .
     */
    public void streamPrepared(boolean hasAudio, boolean hasVideo, boolean seekable, long duration) {
        gtk_h.gtk_media_stream_stream_prepared(handle(), hasAudio ? 1 : 0, hasVideo ? 1 : 0, seekable ? 1 : 0, duration);
    }
    
    /**
     * Resets a given media stream implementation.
     * 
     * {@link org.gtk.gtk.MediaStream<code>#streamPrepared</code>  can then be called again.
     * 
     * This function will also reset any error state the stream was in.
     */
    public void streamUnprepared() {
        gtk_h.gtk_media_stream_stream_unprepared(handle());
    }
    
    /**
     * Undoes a previous call to gtk_media_stream_realize().
     * 
     * This causes the stream to release all resources it had
     * allocated from @surface.
     */
    public void unrealize(org.gtk.gdk.Surface surface) {
        gtk_h.gtk_media_stream_unrealize(handle(), surface.handle());
    }
    
    /**
     * Media stream implementations should regularly call this
     * function to update the timestamp reported by the stream.
     * 
     * It is up to implementations to call this at the frequency
     * they deem appropriate.
     * 
     * The media stream must be prepared when this function is called.
     */
    public void update(long timestamp) {
        gtk_h.gtk_media_stream_update(handle(), timestamp);
    }
    
}
