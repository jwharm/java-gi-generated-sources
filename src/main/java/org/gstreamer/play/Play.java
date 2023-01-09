package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Play extends org.gstreamer.gst.GstObject {
    
    static {
        GstPlay.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlay";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Play proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Play(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Play> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Play(input);
    
    private static MemoryAddress constructNew(@Nullable org.gstreamer.play.PlayVideoRenderer videoRenderer) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_new.invokeExact((Addressable) (videoRenderer == null ? MemoryAddress.NULL : videoRenderer.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        videoRenderer.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new {@link Play} instance.
     * <p>
     * Video is going to be rendered by {@code video_renderer}, or if {@code null} is provided
     * no special video set up will be done and some default handling will be
     * performed.
     * @param videoRenderer GstPlayVideoRenderer to use
     */
    public Play(@Nullable org.gstreamer.play.PlayVideoRenderer videoRenderer) {
        super(constructNew(videoRenderer));
        this.takeOwnership();
    }
    
    /**
     * Retrieve the current value of audio-video-offset property
     * @return The current value of audio-video-offset in nanoseconds
     */
    public long getAudioVideoOffset() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_play_get_audio_video_offset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieve the current value of the indicated {@code type}.
     * @param type {@link PlayColorBalanceType}
     * @return The current value of {@code type}, between [0,1]. In case of
     *   error -1 is returned.
     */
    public double getColorBalance(org.gstreamer.play.PlayColorBalanceType type) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gst_play_get_color_balance.invokeExact(
                    handle(),
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get a copy of the current configuration of the play. This configuration
     * can either be modified and used for the gst_play_set_config() call
     * or it must be freed after usage.
     * @return a copy of the current configuration of {@code play}. Use
     * gst_structure_free() after usage or gst_play_set_config().
     */
    public org.gstreamer.gst.Structure getConfig() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_get_config.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * A Function to get current audio {@link PlayAudioInfo} instance.
     * @return current audio track.
     * <p>
     * The caller should free it with g_object_unref()
     */
    public @Nullable org.gstreamer.play.PlayAudioInfo getCurrentAudioTrack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_get_current_audio_track.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.play.PlayAudioInfo) Interop.register(RESULT, org.gstreamer.play.PlayAudioInfo.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * A Function to get current subtitle {@link PlaySubtitleInfo} instance.
     * @return current subtitle track.
     * <p>
     * The caller should free it with g_object_unref()
     */
    public @Nullable org.gstreamer.play.PlaySubtitleInfo getCurrentSubtitleTrack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_get_current_subtitle_track.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.play.PlaySubtitleInfo) Interop.register(RESULT, org.gstreamer.play.PlaySubtitleInfo.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * A Function to get current video {@link PlayVideoInfo} instance.
     * @return current video track.
     * <p>
     * The caller should free it with g_object_unref()
     */
    public @Nullable org.gstreamer.play.PlayVideoInfo getCurrentVideoTrack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_get_current_video_track.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.play.PlayVideoInfo) Interop.register(RESULT, org.gstreamer.play.PlayVideoInfo.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public @Nullable java.lang.String getCurrentVisualization() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_get_current_visualization.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the duration of the media stream that self represents.
     * @return the duration of the currently-playing media stream, in
     * nanoseconds.
     */
    public org.gstreamer.gst.ClockTime getDuration() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_play_get_duration.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * A Function to get the current media info {@link PlayMediaInfo} instance.
     * @return media info instance.
     * <p>
     * The caller should free it with g_object_unref()
     */
    public @Nullable org.gstreamer.play.PlayMediaInfo getMediaInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_get_media_info.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.play.PlayMediaInfo) Interop.register(RESULT, org.gstreamer.play.PlayMediaInfo.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * GstPlay API exposes a {@link org.gstreamer.gst.Bus} instance which purpose is to provide data
     * structures representing play-internal events in form of {@link org.gstreamer.gst.Message}&lt;!-- --&gt;s of
     * type GST_MESSAGE_APPLICATION.
     * <p>
     * Each message carries a "play-message" field of type {@link PlayMessage}.
     * Further fields of the message data are specific to each possible value of
     * that enumeration.
     * <p>
     * Applications can consume the messages asynchronously within their own
     * event-loop / UI-thread etc. Note that in case the application does not
     * consume the messages, the bus will accumulate these internally and eventually
     * fill memory. To avoid that, the bus has to be set "flushing".
     * @return The play message bus instance
     */
    public org.gstreamer.gst.Bus getMessageBus() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_get_message_bus.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.Bus) Interop.register(RESULT, org.gstreamer.gst.Bus.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Retrieve the current value of the indicated {@code type}.
     * @return The current value of {@code type}, Default: 0x00000000 "none
     */
    public org.gstreamer.video.VideoMultiviewFlags getMultiviewFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_get_multiview_flags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoMultiviewFlags(RESULT);
    }
    
    /**
     * Retrieve the current value of the indicated {@code type}.
     * @return The current value of {@code type}, Default: -1 "none"
     */
    public org.gstreamer.video.VideoMultiviewFramePacking getMultiviewMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_get_multiview_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoMultiviewFramePacking.of(RESULT);
    }
    
    public boolean getMute() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_get_mute.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public org.gstreamer.gst.Element getPipeline() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_get_pipeline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.Element) Interop.register(RESULT, org.gstreamer.gst.Element.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public org.gstreamer.gst.ClockTime getPosition() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_play_get_position.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    public double getRate() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gst_play_get_rate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * current subtitle URI
     * @return URI of the current external subtitle.
     *   g_free() after usage.
     */
    public @Nullable java.lang.String getSubtitleUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_get_subtitle_uri.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Retrieve the current value of subtitle-video-offset property
     * @return The current value of subtitle-video-offset in nanoseconds
     */
    public long getSubtitleVideoOffset() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_play_get_subtitle_video_offset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the URI of the currently-playing stream.
     * @return a string containing the URI of the
     * currently-playing stream. g_free() after usage.
     */
    public @Nullable java.lang.String getUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_get_uri.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get a snapshot of the currently selected video stream, if any. The format can be
     * selected with {@code format} and optional configuration is possible with {@code config}
     * Currently supported settings are:
     * <ul>
     * <li>width, height of type G_TYPE_INT
     * <li>pixel-aspect-ratio of type GST_TYPE_FRACTION
     *  Except for GST_PLAY_THUMBNAIL_RAW_NATIVE format, if no config is set, pixel-aspect-ratio would be 1/1
     * </ul>
     * @param format output format of the video snapshot
     * @param config Additional configuration
     * @return Current video snapshot sample or {@code null} on failure
     */
    public @Nullable org.gstreamer.gst.Sample getVideoSnapshot(org.gstreamer.play.PlaySnapshotFormat format, @Nullable org.gstreamer.gst.Structure config) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_get_video_snapshot.invokeExact(
                    handle(),
                    format.getValue(),
                    (Addressable) (config == null ? MemoryAddress.NULL : config.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Sample.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns the current volume level, as a percentage between 0 and 1.
     * @return the volume as percentage between 0 and 1.
     */
    public double getVolume() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gst_play_get_volume.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the {@code play} has color balance support available.
     * @return {@code true} if {@code play} has color balance support. Otherwise,
     *   {@code false}.
     */
    public boolean hasColorBalance() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_has_color_balance.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Pauses the current stream.
     */
    public void pause() {
        try {
            DowncallHandles.gst_play_pause.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Request to play the loaded stream.
     */
    public void play() {
        try {
            DowncallHandles.gst_play_play.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Seeks the currently-playing stream to the absolute {@code position} time
     * in nanoseconds.
     * @param position position to seek in nanoseconds
     */
    public void seek(org.gstreamer.gst.ClockTime position) {
        try {
            DowncallHandles.gst_play_seek.invokeExact(
                    handle(),
                    position.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean setAudioTrack(int streamIndex) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_set_audio_track.invokeExact(
                    handle(),
                    streamIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Enable or disable the current audio track.
     * @param enabled TRUE or FALSE
     */
    public void setAudioTrackEnabled(boolean enabled) {
        try {
            DowncallHandles.gst_play_set_audio_track_enabled.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets audio-video-offset property by value of {@code offset}
     * @param offset {@code gint64} in nanoseconds
     */
    public void setAudioVideoOffset(long offset) {
        try {
            DowncallHandles.gst_play_set_audio_video_offset.invokeExact(
                    handle(),
                    offset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the current value of the indicated channel {@code type} to the passed
     * value.
     * @param type {@link PlayColorBalanceType}
     * @param value The new value for the {@code type}, ranged [0,1]
     */
    public void setColorBalance(org.gstreamer.play.PlayColorBalanceType type, double value) {
        try {
            DowncallHandles.gst_play_set_color_balance.invokeExact(
                    handle(),
                    type.getValue(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the configuration of the play. If the play is already configured, and
     * the configuration haven't change, this function will return {@code true}. If the
     * play is not in the GST_PLAY_STATE_STOPPED, this method will return {@code false}
     * and active configuration will remain.
     * <p>
     * {@code config} is a {@link org.gstreamer.gst.Structure} that contains the configuration parameters for
     * the play.
     * <p>
     * This function takes ownership of {@code config}.
     * @param config a {@link org.gstreamer.gst.Structure}
     * @return {@code true} when the configuration could be set.
     */
    public boolean setConfig(org.gstreamer.gst.Structure config) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_set_config.invokeExact(
                    handle(),
                    config.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        config.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the current value of the indicated mode {@code type} to the passed
     * value.
     * @param flags The new value for the {@code type}
     */
    public void setMultiviewFlags(org.gstreamer.video.VideoMultiviewFlags flags) {
        try {
            DowncallHandles.gst_play_set_multiview_flags.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the current value of the indicated mode {@code type} to the passed
     * value.
     * @param mode The new value for the {@code type}
     */
    public void setMultiviewMode(org.gstreamer.video.VideoMultiviewFramePacking mode) {
        try {
            DowncallHandles.gst_play_set_multiview_mode.invokeExact(
                    handle(),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * {@code true} if the currently-playing stream should be muted.
     * @param val Mute state the should be set
     */
    public void setMute(boolean val) {
        try {
            DowncallHandles.gst_play_set_mute.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(val, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Playback at specified rate
     * @param rate playback rate
     */
    public void setRate(double rate) {
        try {
            DowncallHandles.gst_play_set_rate.invokeExact(
                    handle(),
                    rate);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean setSubtitleTrack(int streamIndex) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_set_subtitle_track.invokeExact(
                    handle(),
                    streamIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Enable or disable the current subtitle track.
     * @param enabled TRUE or FALSE
     */
    public void setSubtitleTrackEnabled(boolean enabled) {
        try {
            DowncallHandles.gst_play_set_subtitle_track_enabled.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the external subtitle URI. This should be combined with a call to
     * gst_play_set_subtitle_track_enabled({@code play}, TRUE) so the subtitles are actually
     * rendered.
     * @param uri subtitle URI
     */
    public void setSubtitleUri(@Nullable java.lang.String uri) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_play_set_subtitle_uri.invokeExact(
                        handle(),
                        (Addressable) (uri == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(uri, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets subtitle-video-offset property by value of {@code offset}
     * @param offset {@code gint64} in nanoseconds
     */
    public void setSubtitleVideoOffset(long offset) {
        try {
            DowncallHandles.gst_play_set_subtitle_video_offset.invokeExact(
                    handle(),
                    offset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the next URI to play.
     * @param uri next URI to play.
     */
    public void setUri(@Nullable java.lang.String uri) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_play_set_uri.invokeExact(
                        handle(),
                        (Addressable) (uri == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(uri, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    public boolean setVideoTrack(int streamIndex) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_set_video_track.invokeExact(
                    handle(),
                    streamIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Enable or disable the current video track.
     * @param enabled TRUE or FALSE
     */
    public void setVideoTrackEnabled(boolean enabled) {
        try {
            DowncallHandles.gst_play_set_video_track_enabled.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean setVisualization(@Nullable java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_play_set_visualization.invokeExact(
                        handle(),
                        (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Enable or disable the visualization.
     * @param enabled TRUE or FALSE
     */
    public void setVisualizationEnabled(boolean enabled) {
        try {
            DowncallHandles.gst_play_set_visualization_enabled.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the volume level of the stream as a percentage between 0 and 1.
     * @param val the new volume level, as a percentage between 0 and 1
     */
    public void setVolume(double val) {
        try {
            DowncallHandles.gst_play_set_volume.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stops playing the current stream and resets to the first position
     * in the stream.
     */
    public void stop() {
        try {
            DowncallHandles.gst_play_stop.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.gst_play_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static int configGetPositionUpdateInterval(org.gstreamer.gst.Structure config) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_config_get_position_update_interval.invokeExact(config.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static boolean configGetSeekAccurate(org.gstreamer.gst.Structure config) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_config_get_seek_accurate.invokeExact(config.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Return the user agent which has been configured using
     * gst_play_config_set_user_agent() if any.
     * @param config a {@link Play} configuration
     * @return the configured agent, or {@code null}
     */
    public static @Nullable java.lang.String configGetUserAgent(org.gstreamer.gst.Structure config) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_config_get_user_agent.invokeExact(config.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * set desired interval in milliseconds between two position-updated messages.
     * pass 0 to stop updating the position.
     * @param config a {@link Play} configuration
     * @param interval interval in ms
     */
    public static void configSetPositionUpdateInterval(org.gstreamer.gst.Structure config, int interval) {
        try {
            DowncallHandles.gst_play_config_set_position_update_interval.invokeExact(
                    config.handle(),
                    interval);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Enable or disable accurate seeking. When enabled, elements will try harder
     * to seek as accurately as possible to the requested seek position. Generally
     * it will be slower especially for formats that don't have any indexes or
     * timestamp markers in the stream.
     * <p>
     * If accurate seeking is disabled, elements will seek as close as the request
     * position without slowing down seeking too much.
     * <p>
     * Accurate seeking is disabled by default.
     * @param config a {@link Play} configuration
     * @param accurate accurate seek or not
     */
    public static void configSetSeekAccurate(org.gstreamer.gst.Structure config, boolean accurate) {
        try {
            DowncallHandles.gst_play_config_set_seek_accurate.invokeExact(
                    config.handle(),
                    Marshal.booleanToInteger.marshal(accurate, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the user agent to pass to the server if {@code play} needs to connect
     * to a server during playback. This is typically used when playing HTTP
     * or RTSP streams.
     * @param config a {@link Play} configuration
     * @param agent the string to use as user agent
     */
    public static void configSetUserAgent(org.gstreamer.gst.Structure config, @Nullable java.lang.String agent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_play_config_set_user_agent.invokeExact(
                        config.handle(),
                        (Addressable) (agent == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(agent, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    public static org.gtk.glib.List getAudioStreams(org.gstreamer.play.PlayMediaInfo info) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_get_audio_streams.invokeExact(info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    }
    
    public static org.gtk.glib.List getSubtitleStreams(org.gstreamer.play.PlayMediaInfo info) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_get_subtitle_streams.invokeExact(info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    }
    
    public static org.gtk.glib.List getVideoStreams(org.gstreamer.play.PlayMediaInfo info) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_get_video_streams.invokeExact(info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    }
    
    public static boolean isPlayMessage(org.gstreamer.gst.Message msg) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_is_play_message.invokeExact(msg.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Frees a {@code null} terminated array of {@link PlayVisualization}.
     * @param viss a {@code null} terminated array of {@link PlayVisualization} to free
     */
    public static void visualizationsFree(PointerProxy<org.gstreamer.play.PlayVisualization> viss) {
        try {
            DowncallHandles.gst_play_visualizations_free.invokeExact(viss.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static PointerProxy<org.gstreamer.play.PlayVisualization> visualizationsGet() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_play_visualizations_get.invokeExact();
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerProxy<org.gstreamer.play.PlayVisualization>(RESULT, org.gstreamer.play.PlayVisualization.fromAddress);
        }
    }
    
    /**
     * A {@link Play.Builder} object constructs a {@link Play} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Play.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Play} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Play}.
         * @return A new instance of {@code Play} with the properties 
         *         that were set in the Builder object.
         */
        public Play build() {
            return (Play) org.gtk.gobject.GObject.newWithProperties(
                Play.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setAudioVideoOffset(long audioVideoOffset) {
            names.add("audio-video-offset");
            values.add(org.gtk.gobject.Value.create(audioVideoOffset));
            return this;
        }
        
        public Builder setCurrentAudioTrack(org.gstreamer.play.PlayAudioInfo currentAudioTrack) {
            names.add("current-audio-track");
            values.add(org.gtk.gobject.Value.create(currentAudioTrack));
            return this;
        }
        
        public Builder setCurrentSubtitleTrack(org.gstreamer.play.PlaySubtitleInfo currentSubtitleTrack) {
            names.add("current-subtitle-track");
            values.add(org.gtk.gobject.Value.create(currentSubtitleTrack));
            return this;
        }
        
        public Builder setCurrentVideoTrack(org.gstreamer.play.PlayVideoInfo currentVideoTrack) {
            names.add("current-video-track");
            values.add(org.gtk.gobject.Value.create(currentVideoTrack));
            return this;
        }
        
        public Builder setDuration(long duration) {
            names.add("duration");
            values.add(org.gtk.gobject.Value.create(duration));
            return this;
        }
        
        public Builder setMediaInfo(org.gstreamer.play.PlayMediaInfo mediaInfo) {
            names.add("media-info");
            values.add(org.gtk.gobject.Value.create(mediaInfo));
            return this;
        }
        
        public Builder setMute(boolean mute) {
            names.add("mute");
            values.add(org.gtk.gobject.Value.create(mute));
            return this;
        }
        
        public Builder setPipeline(org.gstreamer.gst.Element pipeline) {
            names.add("pipeline");
            values.add(org.gtk.gobject.Value.create(pipeline));
            return this;
        }
        
        public Builder setPosition(long position) {
            names.add("position");
            values.add(org.gtk.gobject.Value.create(position));
            return this;
        }
        
        public Builder setRate(double rate) {
            names.add("rate");
            values.add(org.gtk.gobject.Value.create(rate));
            return this;
        }
        
        public Builder setSubtitleVideoOffset(long subtitleVideoOffset) {
            names.add("subtitle-video-offset");
            values.add(org.gtk.gobject.Value.create(subtitleVideoOffset));
            return this;
        }
        
        public Builder setSuburi(java.lang.String suburi) {
            names.add("suburi");
            values.add(org.gtk.gobject.Value.create(suburi));
            return this;
        }
        
        public Builder setUri(java.lang.String uri) {
            names.add("uri");
            values.add(org.gtk.gobject.Value.create(uri));
            return this;
        }
        
        public Builder setVideoMultiviewFlags(org.gstreamer.video.VideoMultiviewFlags videoMultiviewFlags) {
            names.add("video-multiview-flags");
            values.add(org.gtk.gobject.Value.create(videoMultiviewFlags));
            return this;
        }
        
        public Builder setVideoMultiviewMode(org.gstreamer.video.VideoMultiviewFramePacking videoMultiviewMode) {
            names.add("video-multiview-mode");
            values.add(org.gtk.gobject.Value.create(videoMultiviewMode));
            return this;
        }
        
        public Builder setVideoRenderer(org.gstreamer.play.PlayVideoRenderer videoRenderer) {
            names.add("video-renderer");
            values.add(org.gtk.gobject.Value.create(videoRenderer));
            return this;
        }
        
        public Builder setVolume(double volume) {
            names.add("volume");
            values.add(org.gtk.gobject.Value.create(volume));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_play_new = Interop.downcallHandle(
                "gst_play_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_audio_video_offset = Interop.downcallHandle(
                "gst_play_get_audio_video_offset",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_color_balance = Interop.downcallHandle(
                "gst_play_get_color_balance",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_play_get_config = Interop.downcallHandle(
                "gst_play_get_config",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_current_audio_track = Interop.downcallHandle(
                "gst_play_get_current_audio_track",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_current_subtitle_track = Interop.downcallHandle(
                "gst_play_get_current_subtitle_track",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_current_video_track = Interop.downcallHandle(
                "gst_play_get_current_video_track",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_current_visualization = Interop.downcallHandle(
                "gst_play_get_current_visualization",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_duration = Interop.downcallHandle(
                "gst_play_get_duration",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_media_info = Interop.downcallHandle(
                "gst_play_get_media_info",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_message_bus = Interop.downcallHandle(
                "gst_play_get_message_bus",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_multiview_flags = Interop.downcallHandle(
                "gst_play_get_multiview_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_multiview_mode = Interop.downcallHandle(
                "gst_play_get_multiview_mode",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_mute = Interop.downcallHandle(
                "gst_play_get_mute",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_pipeline = Interop.downcallHandle(
                "gst_play_get_pipeline",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_position = Interop.downcallHandle(
                "gst_play_get_position",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_rate = Interop.downcallHandle(
                "gst_play_get_rate",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_subtitle_uri = Interop.downcallHandle(
                "gst_play_get_subtitle_uri",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_subtitle_video_offset = Interop.downcallHandle(
                "gst_play_get_subtitle_video_offset",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_uri = Interop.downcallHandle(
                "gst_play_get_uri",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_video_snapshot = Interop.downcallHandle(
                "gst_play_get_video_snapshot",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_volume = Interop.downcallHandle(
                "gst_play_get_volume",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_has_color_balance = Interop.downcallHandle(
                "gst_play_has_color_balance",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_pause = Interop.downcallHandle(
                "gst_play_pause",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_play = Interop.downcallHandle(
                "gst_play_play",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_seek = Interop.downcallHandle(
                "gst_play_seek",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_play_set_audio_track = Interop.downcallHandle(
                "gst_play_set_audio_track",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_play_set_audio_track_enabled = Interop.downcallHandle(
                "gst_play_set_audio_track_enabled",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_play_set_audio_video_offset = Interop.downcallHandle(
                "gst_play_set_audio_video_offset",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_play_set_color_balance = Interop.downcallHandle(
                "gst_play_set_color_balance",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gst_play_set_config = Interop.downcallHandle(
                "gst_play_set_config",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_set_multiview_flags = Interop.downcallHandle(
                "gst_play_set_multiview_flags",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_play_set_multiview_mode = Interop.downcallHandle(
                "gst_play_set_multiview_mode",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_play_set_mute = Interop.downcallHandle(
                "gst_play_set_mute",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_play_set_rate = Interop.downcallHandle(
                "gst_play_set_rate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gst_play_set_subtitle_track = Interop.downcallHandle(
                "gst_play_set_subtitle_track",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_play_set_subtitle_track_enabled = Interop.downcallHandle(
                "gst_play_set_subtitle_track_enabled",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_play_set_subtitle_uri = Interop.downcallHandle(
                "gst_play_set_subtitle_uri",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_set_subtitle_video_offset = Interop.downcallHandle(
                "gst_play_set_subtitle_video_offset",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_play_set_uri = Interop.downcallHandle(
                "gst_play_set_uri",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_set_video_track = Interop.downcallHandle(
                "gst_play_set_video_track",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_play_set_video_track_enabled = Interop.downcallHandle(
                "gst_play_set_video_track_enabled",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_play_set_visualization = Interop.downcallHandle(
                "gst_play_set_visualization",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_set_visualization_enabled = Interop.downcallHandle(
                "gst_play_set_visualization_enabled",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_play_set_volume = Interop.downcallHandle(
                "gst_play_set_volume",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gst_play_stop = Interop.downcallHandle(
                "gst_play_stop",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_type = Interop.downcallHandle(
                "gst_play_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_play_config_get_position_update_interval = Interop.downcallHandle(
                "gst_play_config_get_position_update_interval",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_config_get_seek_accurate = Interop.downcallHandle(
                "gst_play_config_get_seek_accurate",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_config_get_user_agent = Interop.downcallHandle(
                "gst_play_config_get_user_agent",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_config_set_position_update_interval = Interop.downcallHandle(
                "gst_play_config_set_position_update_interval",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_play_config_set_seek_accurate = Interop.downcallHandle(
                "gst_play_config_set_seek_accurate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_play_config_set_user_agent = Interop.downcallHandle(
                "gst_play_config_set_user_agent",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_audio_streams = Interop.downcallHandle(
                "gst_play_get_audio_streams",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_subtitle_streams = Interop.downcallHandle(
                "gst_play_get_subtitle_streams",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_get_video_streams = Interop.downcallHandle(
                "gst_play_get_video_streams",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_is_play_message = Interop.downcallHandle(
                "gst_play_is_play_message",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_visualizations_free = Interop.downcallHandle(
                "gst_play_visualizations_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_visualizations_get = Interop.downcallHandle(
                "gst_play_visualizations_get",
                FunctionDescriptor.ofVoid(),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_play_get_type != null;
    }
}
