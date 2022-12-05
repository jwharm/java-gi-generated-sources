package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Starting from GStreamer 1.20, application developers are strongly advised to migrate to {@link org.gstreamer.play.Play}.
 * {@link Player} will be deprecated in 1.20 and most likely removed by 1.24.
 */
public class Player extends org.gstreamer.gst.Object {
    
    static {
        GstPlayer.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayer";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Player proxy instance for the provided memory address.
     * <p>
     * Because Player is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Player(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to Player if its GType is a (or inherits from) "GstPlayer".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Player} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstPlayer", a ClassCastException will be thrown.
     */
    public static Player castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Player.getType())) {
            return new Player(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstPlayer");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gstreamer.player.PlayerVideoRenderer videoRenderer, @Nullable org.gstreamer.player.PlayerSignalDispatcher signalDispatcher) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_new.invokeExact(
                    (Addressable) (videoRenderer == null ? MemoryAddress.NULL : videoRenderer.handle()),
                    (Addressable) (signalDispatcher == null ? MemoryAddress.NULL : signalDispatcher.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        videoRenderer.yieldOwnership();
        signalDispatcher.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new {@link Player} instance that uses {@code signal_dispatcher} to dispatch
     * signals to some event loop system, or emits signals directly if NULL is
     * passed. See gst_player_g_main_context_signal_dispatcher_new().
     * <p>
     * Video is going to be rendered by {@code video_renderer}, or if {@code null} is provided
     * no special video set up will be done and some default handling will be
     * performed.
     * @param videoRenderer GstPlayerVideoRenderer to use
     * @param signalDispatcher GstPlayerSignalDispatcher to use
     */
    public Player(@Nullable org.gstreamer.player.PlayerVideoRenderer videoRenderer, @Nullable org.gstreamer.player.PlayerSignalDispatcher signalDispatcher) {
        super(constructNew(videoRenderer, signalDispatcher), Ownership.FULL);
    }
    
    /**
     * Retrieve the current value of audio-video-offset property
     * @return The current value of audio-video-offset in nanoseconds
     */
    public long getAudioVideoOffset() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_player_get_audio_video_offset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieve the current value of the indicated {@code type}.
     * @param type {@link PlayerColorBalanceType}
     * @return The current value of {@code type}, between [0,1]. In case of
     *   error -1 is returned.
     */
    public double getColorBalance(@NotNull org.gstreamer.player.PlayerColorBalanceType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gst_player_get_color_balance.invokeExact(
                    handle(),
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get a copy of the current configuration of the player. This configuration
     * can either be modified and used for the gst_player_set_config() call
     * or it must be freed after usage.
     * @return a copy of the current configuration of {@code player}. Use
     * gst_structure_free() after usage or gst_player_set_config().
     */
    public @NotNull org.gstreamer.gst.Structure getConfig() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_get_config.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Structure(RESULT, Ownership.FULL);
    }
    
    /**
     * A Function to get current audio {@link PlayerAudioInfo} instance.
     * @return current audio track.
     * <p>
     * The caller should free it with g_object_unref()
     */
    public @Nullable org.gstreamer.player.PlayerAudioInfo getCurrentAudioTrack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_get_current_audio_track.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.player.PlayerAudioInfo(RESULT, Ownership.FULL);
    }
    
    /**
     * A Function to get current subtitle {@link PlayerSubtitleInfo} instance.
     * @return current subtitle track.
     * <p>
     * The caller should free it with g_object_unref()
     */
    public @Nullable org.gstreamer.player.PlayerSubtitleInfo getCurrentSubtitleTrack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_get_current_subtitle_track.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.player.PlayerSubtitleInfo(RESULT, Ownership.FULL);
    }
    
    /**
     * A Function to get current video {@link PlayerVideoInfo} instance.
     * @return current video track.
     * <p>
     * The caller should free it with g_object_unref()
     */
    public @Nullable org.gstreamer.player.PlayerVideoInfo getCurrentVideoTrack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_get_current_video_track.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.player.PlayerVideoInfo(RESULT, Ownership.FULL);
    }
    
    public @Nullable java.lang.String getCurrentVisualization() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_get_current_visualization.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves the duration of the media stream that self represents.
     * @return the duration of the currently-playing media stream, in
     * nanoseconds.
     */
    public @NotNull org.gstreamer.gst.ClockTime getDuration() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_player_get_duration.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * A Function to get the current media info {@link PlayerMediaInfo} instance.
     * @return media info instance.
     * <p>
     * The caller should free it with g_object_unref()
     */
    public @Nullable org.gstreamer.player.PlayerMediaInfo getMediaInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_get_media_info.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.player.PlayerMediaInfo(RESULT, Ownership.FULL);
    }
    
    /**
     * Retrieve the current value of the indicated {@code type}.
     * @return The current value of {@code type}, Default: 0x00000000 "none
     */
    public @NotNull org.gstreamer.video.VideoMultiviewFlags getMultiviewFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_get_multiview_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoMultiviewFlags(RESULT);
    }
    
    /**
     * Retrieve the current value of the indicated {@code type}.
     * @return The current value of {@code type}, Default: -1 "none"
     */
    public @NotNull org.gstreamer.video.VideoMultiviewFramePacking getMultiviewMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_get_multiview_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoMultiviewFramePacking.of(RESULT);
    }
    
    public boolean getMute() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_get_mute.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public @NotNull org.gstreamer.gst.Element getPipeline() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_get_pipeline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Element(RESULT, Ownership.FULL);
    }
    
    public @NotNull org.gstreamer.gst.ClockTime getPosition() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_player_get_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    public double getRate() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gst_player_get_rate.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gst_player_get_subtitle_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieve the current value of subtitle-video-offset property
     * @return The current value of subtitle-video-offset in nanoseconds
     */
    public long getSubtitleVideoOffset() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_player_get_subtitle_video_offset.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gst_player_get_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get a snapshot of the currently selected video stream, if any. The format can be
     * selected with {@code format} and optional configuration is possible with {@code config}
     * Currently supported settings are:
     * <ul>
     * <li>width, height of type G_TYPE_INT
     * <li>pixel-aspect-ratio of type GST_TYPE_FRACTION
     *  Except for GST_PLAYER_THUMBNAIL_RAW_NATIVE format, if no config is set, pixel-aspect-ratio would be 1/1
     * </ul>
     * @param format output format of the video snapshot
     * @param config Additional configuration
     * @return Current video snapshot sample or {@code null} on failure
     */
    public @Nullable org.gstreamer.gst.Sample getVideoSnapshot(@NotNull org.gstreamer.player.PlayerSnapshotFormat format, @Nullable org.gstreamer.gst.Structure config) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_get_video_snapshot.invokeExact(
                    handle(),
                    format.getValue(),
                    (Addressable) (config == null ? MemoryAddress.NULL : config.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Sample(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the current volume level, as a percentage between 0 and 1.
     * @return the volume as percentage between 0 and 1.
     */
    public double getVolume() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gst_player_get_volume.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the {@code player} has color balance support available.
     * @return {@code true} if {@code player} has color balance support. Otherwise,
     *   {@code false}.
     */
    public boolean hasColorBalance() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_has_color_balance.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Pauses the current stream.
     */
    public void pause() {
        try {
            DowncallHandles.gst_player_pause.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Request to play the loaded stream.
     */
    public void play() {
        try {
            DowncallHandles.gst_player_play.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Seeks the currently-playing stream to the absolute {@code position} time
     * in nanoseconds.
     * @param position position to seek in nanoseconds
     */
    public void seek(@NotNull org.gstreamer.gst.ClockTime position) {
        java.util.Objects.requireNonNull(position, "Parameter 'position' must not be null");
        try {
            DowncallHandles.gst_player_seek.invokeExact(
                    handle(),
                    position.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean setAudioTrack(int streamIndex) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_set_audio_track.invokeExact(
                    handle(),
                    streamIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Enable or disable the current audio track.
     * @param enabled TRUE or FALSE
     */
    public void setAudioTrackEnabled(boolean enabled) {
        try {
            DowncallHandles.gst_player_set_audio_track_enabled.invokeExact(
                    handle(),
                    enabled ? 1 : 0);
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
            DowncallHandles.gst_player_set_audio_video_offset.invokeExact(
                    handle(),
                    offset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the current value of the indicated channel {@code type} to the passed
     * value.
     * @param type {@link PlayerColorBalanceType}
     * @param value The new value for the {@code type}, ranged [0,1]
     */
    public void setColorBalance(@NotNull org.gstreamer.player.PlayerColorBalanceType type, double value) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        try {
            DowncallHandles.gst_player_set_color_balance.invokeExact(
                    handle(),
                    type.getValue(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the configuration of the player. If the player is already configured, and
     * the configuration haven't change, this function will return {@code true}. If the
     * player is not in the GST_PLAYER_STATE_STOPPED, this method will return {@code false}
     * and active configuration will remain.
     * <p>
     * {@code config} is a {@link org.gstreamer.gst.Structure} that contains the configuration parameters for
     * the player.
     * <p>
     * This function takes ownership of {@code config}.
     * @param config a {@link org.gstreamer.gst.Structure}
     * @return {@code true} when the configuration could be set.
     */
    public boolean setConfig(@NotNull org.gstreamer.gst.Structure config) {
        java.util.Objects.requireNonNull(config, "Parameter 'config' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_set_config.invokeExact(
                    handle(),
                    config.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        config.yieldOwnership();
        return RESULT != 0;
    }
    
    /**
     * Sets the current value of the indicated mode {@code type} to the passed
     * value.
     * @param flags The new value for the {@code type}
     */
    public void setMultiviewFlags(@NotNull org.gstreamer.video.VideoMultiviewFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.gst_player_set_multiview_flags.invokeExact(
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
    public void setMultiviewMode(@NotNull org.gstreamer.video.VideoMultiviewFramePacking mode) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        try {
            DowncallHandles.gst_player_set_multiview_mode.invokeExact(
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
            DowncallHandles.gst_player_set_mute.invokeExact(
                    handle(),
                    val ? 1 : 0);
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
            DowncallHandles.gst_player_set_rate.invokeExact(
                    handle(),
                    rate);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean setSubtitleTrack(int streamIndex) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_set_subtitle_track.invokeExact(
                    handle(),
                    streamIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Enable or disable the current subtitle track.
     * @param enabled TRUE or FALSE
     */
    public void setSubtitleTrackEnabled(boolean enabled) {
        try {
            DowncallHandles.gst_player_set_subtitle_track_enabled.invokeExact(
                    handle(),
                    enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the external subtitle URI. This should be combined with a call to
     * gst_player_set_subtitle_track_enabled({@code player}, TRUE) so the subtitles are actually
     * rendered.
     * @param uri subtitle URI
     */
    public void setSubtitleUri(@Nullable java.lang.String uri) {
        try {
            DowncallHandles.gst_player_set_subtitle_uri.invokeExact(
                    handle(),
                    (Addressable) (uri == null ? MemoryAddress.NULL : Interop.allocateNativeString(uri)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets subtitle-video-offset property by value of {@code offset}
     * @param offset {@code gint64} in nanoseconds
     */
    public void setSubtitleVideoOffset(long offset) {
        try {
            DowncallHandles.gst_player_set_subtitle_video_offset.invokeExact(
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
        try {
            DowncallHandles.gst_player_set_uri.invokeExact(
                    handle(),
                    (Addressable) (uri == null ? MemoryAddress.NULL : Interop.allocateNativeString(uri)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean setVideoTrack(int streamIndex) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_set_video_track.invokeExact(
                    handle(),
                    streamIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Enable or disable the current video track.
     * @param enabled TRUE or FALSE
     */
    public void setVideoTrackEnabled(boolean enabled) {
        try {
            DowncallHandles.gst_player_set_video_track_enabled.invokeExact(
                    handle(),
                    enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean setVisualization(@Nullable java.lang.String name) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_set_visualization.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Enable or disable the visualization.
     * @param enabled TRUE or FALSE
     */
    public void setVisualizationEnabled(boolean enabled) {
        try {
            DowncallHandles.gst_player_set_visualization_enabled.invokeExact(
                    handle(),
                    enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the volume level of the stream as a percentage between 0 and 1.
     * <p>
     * This volume is a linear factor. For showing the volume in a GUI it
     * might make sense to first convert from a different format. Volume sliders
     * should usually use a cubic volume. See gst_stream_volume_convert_volume().
     * @param val the new volume level, as a percentage between 0 and 1
     */
    public void setVolume(double val) {
        try {
            DowncallHandles.gst_player_set_volume.invokeExact(
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
            DowncallHandles.gst_player_stop.invokeExact(
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
            RESULT = (long) DowncallHandles.gst_player_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static int configGetPositionUpdateInterval(@NotNull org.gstreamer.gst.Structure config) {
        java.util.Objects.requireNonNull(config, "Parameter 'config' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_config_get_position_update_interval.invokeExact(
                    config.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static boolean configGetSeekAccurate(@NotNull org.gstreamer.gst.Structure config) {
        java.util.Objects.requireNonNull(config, "Parameter 'config' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_config_get_seek_accurate.invokeExact(
                    config.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Return the user agent which has been configured using
     * gst_player_config_set_user_agent() if any.
     * @param config a {@link Player} configuration
     * @return the configured agent, or {@code null}
     */
    public static @Nullable java.lang.String configGetUserAgent(@NotNull org.gstreamer.gst.Structure config) {
        java.util.Objects.requireNonNull(config, "Parameter 'config' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_config_get_user_agent.invokeExact(
                    config.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * set interval in milliseconds between two position-updated signals.
     * pass 0 to stop updating the position.
     * @param config a {@link Player} configuration
     * @param interval interval in ms
     */
    public static void configSetPositionUpdateInterval(@NotNull org.gstreamer.gst.Structure config, int interval) {
        java.util.Objects.requireNonNull(config, "Parameter 'config' must not be null");
        try {
            DowncallHandles.gst_player_config_set_position_update_interval.invokeExact(
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
     * @param config a {@link Player} configuration
     * @param accurate accurate seek or not
     */
    public static void configSetSeekAccurate(@NotNull org.gstreamer.gst.Structure config, boolean accurate) {
        java.util.Objects.requireNonNull(config, "Parameter 'config' must not be null");
        try {
            DowncallHandles.gst_player_config_set_seek_accurate.invokeExact(
                    config.handle(),
                    accurate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the user agent to pass to the server if {@code player} needs to connect
     * to a server during playback. This is typically used when playing HTTP
     * or RTSP streams.
     * @param config a {@link Player} configuration
     * @param agent the string to use as user agent
     */
    public static void configSetUserAgent(@NotNull org.gstreamer.gst.Structure config, @Nullable java.lang.String agent) {
        java.util.Objects.requireNonNull(config, "Parameter 'config' must not be null");
        try {
            DowncallHandles.gst_player_config_set_user_agent.invokeExact(
                    config.handle(),
                    (Addressable) (agent == null ? MemoryAddress.NULL : Interop.allocateNativeString(agent)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static @NotNull org.gtk.glib.List getAudioStreams(@NotNull org.gstreamer.player.PlayerMediaInfo info) {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_get_audio_streams.invokeExact(
                    info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
    }
    
    public static @NotNull org.gtk.glib.List getSubtitleStreams(@NotNull org.gstreamer.player.PlayerMediaInfo info) {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_get_subtitle_streams.invokeExact(
                    info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
    }
    
    public static @NotNull org.gtk.glib.List getVideoStreams(@NotNull org.gstreamer.player.PlayerMediaInfo info) {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_get_video_streams.invokeExact(
                    info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
    }
    
    /**
     * Frees a {@code null} terminated array of {@link PlayerVisualization}.
     * @param viss a {@code null} terminated array of {@link PlayerVisualization} to free
     */
    public static void visualizationsFree(@NotNull PointerProxy<org.gstreamer.player.PlayerVisualization> viss) {
        java.util.Objects.requireNonNull(viss, "Parameter 'viss' must not be null");
        try {
            DowncallHandles.gst_player_visualizations_free.invokeExact(
                    viss.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static @NotNull PointerProxy<org.gstreamer.player.PlayerVisualization> visualizationsGet() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_visualizations_get.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerProxy<org.gstreamer.player.PlayerVisualization>(RESULT, org.gstreamer.player.PlayerVisualization.class);
    }
    
    @FunctionalInterface
    public interface Buffering {
        void signalReceived(Player sourcePlayer, int object);
    }
    
    public Signal<Player.Buffering> onBuffering(Player.Buffering handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("buffering"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Player.Callbacks.class, "signalPlayerBuffering",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Player.Buffering>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DurationChanged {
        void signalReceived(Player sourcePlayer, long object);
    }
    
    public Signal<Player.DurationChanged> onDurationChanged(Player.DurationChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("duration-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Player.Callbacks.class, "signalPlayerDurationChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Player.DurationChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EndOfStream {
        void signalReceived(Player sourcePlayer);
    }
    
    public Signal<Player.EndOfStream> onEndOfStream(Player.EndOfStream handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("end-of-stream"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Player.Callbacks.class, "signalPlayerEndOfStream",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Player.EndOfStream>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Error {
        void signalReceived(Player sourcePlayer, @NotNull org.gtk.glib.Error object);
    }
    
    public Signal<Player.Error> onError(Player.Error handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("error"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Player.Callbacks.class, "signalPlayerError",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Player.Error>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MediaInfoUpdated {
        void signalReceived(Player sourcePlayer, @NotNull org.gstreamer.player.PlayerMediaInfo object);
    }
    
    public Signal<Player.MediaInfoUpdated> onMediaInfoUpdated(Player.MediaInfoUpdated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("media-info-updated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Player.Callbacks.class, "signalPlayerMediaInfoUpdated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Player.MediaInfoUpdated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MuteChanged {
        void signalReceived(Player sourcePlayer);
    }
    
    public Signal<Player.MuteChanged> onMuteChanged(Player.MuteChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("mute-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Player.Callbacks.class, "signalPlayerMuteChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Player.MuteChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PositionUpdated {
        void signalReceived(Player sourcePlayer, long object);
    }
    
    public Signal<Player.PositionUpdated> onPositionUpdated(Player.PositionUpdated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("position-updated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Player.Callbacks.class, "signalPlayerPositionUpdated",
                        MethodType.methodType(void.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Player.PositionUpdated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SeekDone {
        void signalReceived(Player sourcePlayer, long object);
    }
    
    public Signal<Player.SeekDone> onSeekDone(Player.SeekDone handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("seek-done"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Player.Callbacks.class, "signalPlayerSeekDone",
                        MethodType.methodType(void.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Player.SeekDone>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface StateChanged {
        void signalReceived(Player sourcePlayer, @NotNull org.gstreamer.player.PlayerState object);
    }
    
    public Signal<Player.StateChanged> onStateChanged(Player.StateChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("state-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Player.Callbacks.class, "signalPlayerStateChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Player.StateChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface UriLoaded {
        void signalReceived(Player sourcePlayer, @NotNull java.lang.String object);
    }
    
    public Signal<Player.UriLoaded> onUriLoaded(Player.UriLoaded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("uri-loaded"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Player.Callbacks.class, "signalPlayerUriLoaded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Player.UriLoaded>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface VideoDimensionsChanged {
        void signalReceived(Player sourcePlayer, int object, int p0);
    }
    
    public Signal<Player.VideoDimensionsChanged> onVideoDimensionsChanged(Player.VideoDimensionsChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("video-dimensions-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Player.Callbacks.class, "signalPlayerVideoDimensionsChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Player.VideoDimensionsChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface VolumeChanged {
        void signalReceived(Player sourcePlayer);
    }
    
    public Signal<Player.VolumeChanged> onVolumeChanged(Player.VolumeChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("volume-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Player.Callbacks.class, "signalPlayerVolumeChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Player.VolumeChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Warning {
        void signalReceived(Player sourcePlayer, @NotNull org.gtk.glib.Error object);
    }
    
    public Signal<Player.Warning> onWarning(Player.Warning handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("warning"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Player.Callbacks.class, "signalPlayerWarning",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Player.Warning>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link Player.Build} object constructs a {@link Player} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Player} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Player} using {@link Player#castFrom}.
         * @return A new instance of {@code Player} with the properties 
         *         that were set in the Build object.
         */
        public Player construct() {
            return Player.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Player.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setAudioVideoOffset(long audioVideoOffset) {
            names.add("audio-video-offset");
            values.add(org.gtk.gobject.Value.create(audioVideoOffset));
            return this;
        }
        
        public Build setCurrentAudioTrack(org.gstreamer.player.PlayerAudioInfo currentAudioTrack) {
            names.add("current-audio-track");
            values.add(org.gtk.gobject.Value.create(currentAudioTrack));
            return this;
        }
        
        public Build setCurrentSubtitleTrack(org.gstreamer.player.PlayerSubtitleInfo currentSubtitleTrack) {
            names.add("current-subtitle-track");
            values.add(org.gtk.gobject.Value.create(currentSubtitleTrack));
            return this;
        }
        
        public Build setCurrentVideoTrack(org.gstreamer.player.PlayerVideoInfo currentVideoTrack) {
            names.add("current-video-track");
            values.add(org.gtk.gobject.Value.create(currentVideoTrack));
            return this;
        }
        
        public Build setDuration(long duration) {
            names.add("duration");
            values.add(org.gtk.gobject.Value.create(duration));
            return this;
        }
        
        public Build setMediaInfo(org.gstreamer.player.PlayerMediaInfo mediaInfo) {
            names.add("media-info");
            values.add(org.gtk.gobject.Value.create(mediaInfo));
            return this;
        }
        
        public Build setMute(boolean mute) {
            names.add("mute");
            values.add(org.gtk.gobject.Value.create(mute));
            return this;
        }
        
        public Build setPipeline(org.gstreamer.gst.Element pipeline) {
            names.add("pipeline");
            values.add(org.gtk.gobject.Value.create(pipeline));
            return this;
        }
        
        public Build setPosition(long position) {
            names.add("position");
            values.add(org.gtk.gobject.Value.create(position));
            return this;
        }
        
        public Build setRate(double rate) {
            names.add("rate");
            values.add(org.gtk.gobject.Value.create(rate));
            return this;
        }
        
        public Build setSignalDispatcher(org.gstreamer.player.PlayerSignalDispatcher signalDispatcher) {
            names.add("signal-dispatcher");
            values.add(org.gtk.gobject.Value.create(signalDispatcher));
            return this;
        }
        
        public Build setSubtitleVideoOffset(long subtitleVideoOffset) {
            names.add("subtitle-video-offset");
            values.add(org.gtk.gobject.Value.create(subtitleVideoOffset));
            return this;
        }
        
        public Build setSuburi(java.lang.String suburi) {
            names.add("suburi");
            values.add(org.gtk.gobject.Value.create(suburi));
            return this;
        }
        
        public Build setUri(java.lang.String uri) {
            names.add("uri");
            values.add(org.gtk.gobject.Value.create(uri));
            return this;
        }
        
        public Build setVideoMultiviewFlags(org.gstreamer.video.VideoMultiviewFlags videoMultiviewFlags) {
            names.add("video-multiview-flags");
            values.add(org.gtk.gobject.Value.create(videoMultiviewFlags));
            return this;
        }
        
        public Build setVideoMultiviewMode(org.gstreamer.video.VideoMultiviewFramePacking videoMultiviewMode) {
            names.add("video-multiview-mode");
            values.add(org.gtk.gobject.Value.create(videoMultiviewMode));
            return this;
        }
        
        public Build setVideoRenderer(org.gstreamer.player.PlayerVideoRenderer videoRenderer) {
            names.add("video-renderer");
            values.add(org.gtk.gobject.Value.create(videoRenderer));
            return this;
        }
        
        public Build setVolume(double volume) {
            names.add("volume");
            values.add(org.gtk.gobject.Value.create(volume));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_player_new = Interop.downcallHandle(
            "gst_player_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_audio_video_offset = Interop.downcallHandle(
            "gst_player_get_audio_video_offset",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_color_balance = Interop.downcallHandle(
            "gst_player_get_color_balance",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_player_get_config = Interop.downcallHandle(
            "gst_player_get_config",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_current_audio_track = Interop.downcallHandle(
            "gst_player_get_current_audio_track",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_current_subtitle_track = Interop.downcallHandle(
            "gst_player_get_current_subtitle_track",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_current_video_track = Interop.downcallHandle(
            "gst_player_get_current_video_track",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_current_visualization = Interop.downcallHandle(
            "gst_player_get_current_visualization",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_duration = Interop.downcallHandle(
            "gst_player_get_duration",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_media_info = Interop.downcallHandle(
            "gst_player_get_media_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_multiview_flags = Interop.downcallHandle(
            "gst_player_get_multiview_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_multiview_mode = Interop.downcallHandle(
            "gst_player_get_multiview_mode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_mute = Interop.downcallHandle(
            "gst_player_get_mute",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_pipeline = Interop.downcallHandle(
            "gst_player_get_pipeline",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_position = Interop.downcallHandle(
            "gst_player_get_position",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_rate = Interop.downcallHandle(
            "gst_player_get_rate",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_subtitle_uri = Interop.downcallHandle(
            "gst_player_get_subtitle_uri",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_subtitle_video_offset = Interop.downcallHandle(
            "gst_player_get_subtitle_video_offset",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_uri = Interop.downcallHandle(
            "gst_player_get_uri",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_video_snapshot = Interop.downcallHandle(
            "gst_player_get_video_snapshot",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_volume = Interop.downcallHandle(
            "gst_player_get_volume",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_has_color_balance = Interop.downcallHandle(
            "gst_player_has_color_balance",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_pause = Interop.downcallHandle(
            "gst_player_pause",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_play = Interop.downcallHandle(
            "gst_player_play",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_seek = Interop.downcallHandle(
            "gst_player_seek",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_player_set_audio_track = Interop.downcallHandle(
            "gst_player_set_audio_track",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_player_set_audio_track_enabled = Interop.downcallHandle(
            "gst_player_set_audio_track_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_player_set_audio_video_offset = Interop.downcallHandle(
            "gst_player_set_audio_video_offset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_player_set_color_balance = Interop.downcallHandle(
            "gst_player_set_color_balance",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gst_player_set_config = Interop.downcallHandle(
            "gst_player_set_config",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_set_multiview_flags = Interop.downcallHandle(
            "gst_player_set_multiview_flags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_player_set_multiview_mode = Interop.downcallHandle(
            "gst_player_set_multiview_mode",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_player_set_mute = Interop.downcallHandle(
            "gst_player_set_mute",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_player_set_rate = Interop.downcallHandle(
            "gst_player_set_rate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gst_player_set_subtitle_track = Interop.downcallHandle(
            "gst_player_set_subtitle_track",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_player_set_subtitle_track_enabled = Interop.downcallHandle(
            "gst_player_set_subtitle_track_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_player_set_subtitle_uri = Interop.downcallHandle(
            "gst_player_set_subtitle_uri",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_set_subtitle_video_offset = Interop.downcallHandle(
            "gst_player_set_subtitle_video_offset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_player_set_uri = Interop.downcallHandle(
            "gst_player_set_uri",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_set_video_track = Interop.downcallHandle(
            "gst_player_set_video_track",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_player_set_video_track_enabled = Interop.downcallHandle(
            "gst_player_set_video_track_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_player_set_visualization = Interop.downcallHandle(
            "gst_player_set_visualization",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_set_visualization_enabled = Interop.downcallHandle(
            "gst_player_set_visualization_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_player_set_volume = Interop.downcallHandle(
            "gst_player_set_volume",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gst_player_stop = Interop.downcallHandle(
            "gst_player_stop",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_type = Interop.downcallHandle(
            "gst_player_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_player_config_get_position_update_interval = Interop.downcallHandle(
            "gst_player_config_get_position_update_interval",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_config_get_seek_accurate = Interop.downcallHandle(
            "gst_player_config_get_seek_accurate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_config_get_user_agent = Interop.downcallHandle(
            "gst_player_config_get_user_agent",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_config_set_position_update_interval = Interop.downcallHandle(
            "gst_player_config_set_position_update_interval",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_player_config_set_seek_accurate = Interop.downcallHandle(
            "gst_player_config_set_seek_accurate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_player_config_set_user_agent = Interop.downcallHandle(
            "gst_player_config_set_user_agent",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_audio_streams = Interop.downcallHandle(
            "gst_player_get_audio_streams",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_subtitle_streams = Interop.downcallHandle(
            "gst_player_get_subtitle_streams",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_get_video_streams = Interop.downcallHandle(
            "gst_player_get_video_streams",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_visualizations_free = Interop.downcallHandle(
            "gst_player_visualizations_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_visualizations_get = Interop.downcallHandle(
            "gst_player_visualizations_get",
            FunctionDescriptor.ofVoid(),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalPlayerBuffering(MemoryAddress sourcePlayer, int object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Player.Buffering) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Player(sourcePlayer, Ownership.NONE), object);
        }
        
        public static void signalPlayerDurationChanged(MemoryAddress sourcePlayer, long object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Player.DurationChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Player(sourcePlayer, Ownership.NONE), object);
        }
        
        public static void signalPlayerEndOfStream(MemoryAddress sourcePlayer, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Player.EndOfStream) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Player(sourcePlayer, Ownership.NONE));
        }
        
        public static void signalPlayerError(MemoryAddress sourcePlayer, MemoryAddress object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Player.Error) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Player(sourcePlayer, Ownership.NONE), new org.gtk.glib.Error(object, Ownership.NONE));
        }
        
        public static void signalPlayerMediaInfoUpdated(MemoryAddress sourcePlayer, MemoryAddress object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Player.MediaInfoUpdated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Player(sourcePlayer, Ownership.NONE), new org.gstreamer.player.PlayerMediaInfo(object, Ownership.NONE));
        }
        
        public static void signalPlayerMuteChanged(MemoryAddress sourcePlayer, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Player.MuteChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Player(sourcePlayer, Ownership.NONE));
        }
        
        public static void signalPlayerPositionUpdated(MemoryAddress sourcePlayer, long object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Player.PositionUpdated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Player(sourcePlayer, Ownership.NONE), object);
        }
        
        public static void signalPlayerSeekDone(MemoryAddress sourcePlayer, long object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Player.SeekDone) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Player(sourcePlayer, Ownership.NONE), object);
        }
        
        public static void signalPlayerStateChanged(MemoryAddress sourcePlayer, int object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Player.StateChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Player(sourcePlayer, Ownership.NONE), org.gstreamer.player.PlayerState.of(object));
        }
        
        public static void signalPlayerUriLoaded(MemoryAddress sourcePlayer, MemoryAddress object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Player.UriLoaded) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Player(sourcePlayer, Ownership.NONE), Interop.getStringFrom(object));
        }
        
        public static void signalPlayerVideoDimensionsChanged(MemoryAddress sourcePlayer, int object, int p0, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Player.VideoDimensionsChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Player(sourcePlayer, Ownership.NONE), object, p0);
        }
        
        public static void signalPlayerVolumeChanged(MemoryAddress sourcePlayer, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Player.VolumeChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Player(sourcePlayer, Ownership.NONE));
        }
        
        public static void signalPlayerWarning(MemoryAddress sourcePlayer, MemoryAddress object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Player.Warning) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Player(sourcePlayer, Ownership.NONE), new org.gtk.glib.Error(object, Ownership.NONE));
        }
    }
}
