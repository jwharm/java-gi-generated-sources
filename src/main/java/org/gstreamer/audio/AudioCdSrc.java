package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides a base class for CD digital audio (CDDA) sources, which handles
 * things like seeking, querying, discid calculation, tags, and buffer
 * timestamping.
 * <p>
 * <strong>Using GstAudioCdSrc-based elements in applications</strong><br/>
 * GstAudioCdSrc registers two {@link org.gstreamer.gst.Format}&lt;!-- --&gt;s of its own, namely
 * the "track" format and the "sector" format. Applications will usually
 * only find the "track" format interesting. You can retrieve that {@link org.gstreamer.gst.Format}
 * for use in seek events or queries with gst_format_get_by_nick("track").
 * <p>
 * In order to query the number of tracks, for example, an application would
 * set the CDDA source element to READY or PAUSED state and then query the
 * the number of tracks via gst_element_query_duration() using the track
 * format acquired above. Applications can query the currently playing track
 * in the same way.
 * <p>
 * Alternatively, applications may retrieve the currently playing track and
 * the total number of tracks from the taglist that will posted on the bus
 * whenever the CD is opened or the currently playing track changes. The
 * taglist will contain GST_TAG_TRACK_NUMBER and GST_TAG_TRACK_COUNT tags.
 * <p>
 * Applications playing back CD audio using playbin and cdda://n URIs should
 * issue a seek command in track format to change between tracks, rather than
 * setting a new cdda://n+1 URI on playbin (as setting a new URI on playbin
 * involves closing and re-opening the CD device, which is much much slower).
 * <p>
 * <strong>Tags and meta-information</strong><br/>
 * CDDA sources will automatically emit a number of tags, details about which
 * can be found in the libgsttag documentation. Those tags are:
 * {@code GST_TAG_CDDA_CDDB_DISCID}, {@code GST_TAG_CDDA_CDDB_DISCID_FULL},
 * {@code GST_TAG_CDDA_MUSICBRAINZ_DISCID}, {@code GST_TAG_CDDA_MUSICBRAINZ_DISCID_FULL},
 * among others.
 * <p>
 * <strong>Tracks and Table of Contents (TOC)</strong><br/>
 * Applications will be informed of the available tracks via a TOC message
 * on the pipeline's {@link org.gstreamer.gst.Bus}. The {@link org.gstreamer.gst.Toc} will contain a {@link org.gstreamer.gst.TocEntry} for
 * each track, with information about each track. The duration for each
 * track can be retrieved via the {@code GST_TAG_DURATION} tag from each entry's
 * tag list, or calculated via gst_toc_entry_get_start_stop_times().
 * The track entries in the TOC will be sorted by track number.
 */
public class AudioCdSrc extends org.gstreamer.base.PushSrc implements org.gstreamer.gst.URIHandler {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioCdSrc";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.PushSrc.getMemoryLayout().withName("pushsrc"),
        Interop.valueLayout.ADDRESS.withName("tags"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_INT).withName("_gst_reserved1"),
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("_gst_reserved2")
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
     * Create a AudioCdSrc proxy instance for the provided memory address.
     * <p>
     * Because AudioCdSrc is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioCdSrc(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to AudioCdSrc if its GType is a (or inherits from) "GstAudioCdSrc".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AudioCdSrc} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstAudioCdSrc", a ClassCastException will be thrown.
     */
    public static AudioCdSrc castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), AudioCdSrc.getType())) {
            return new AudioCdSrc(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstAudioCdSrc");
        }
    }
    
    /**
     * CDDA sources use this function from their start vfunc to announce the
     * available data and audio tracks to the base source class. The caller
     * should allocate {@code track} on the stack, the base source will do a shallow
     * copy of the structure (and take ownership of the taglist if there is one).
     * @param track address of {@link AudioCdSrcTrack} to add
     * @return FALSE on error, otherwise TRUE.
     */
    public boolean addTrack(@NotNull org.gstreamer.audio.AudioCdSrcTrack track) {
        java.util.Objects.requireNonNull(track, "Parameter 'track' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_cd_src_add_track.invokeExact(
                    handle(),
                    track.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_cd_src_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.base.PushSrc.Build {
        
         /**
         * A {@link AudioCdSrc.Build} object constructs a {@link AudioCdSrc} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link AudioCdSrc} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioCdSrc} using {@link AudioCdSrc#castFrom}.
         * @return A new instance of {@code AudioCdSrc} with the properties 
         *         that were set in the Build object.
         */
        public AudioCdSrc construct() {
            return AudioCdSrc.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    AudioCdSrc.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setDevice(java.lang.String device) {
            names.add("device");
            values.add(org.gtk.gobject.Value.create(device));
            return this;
        }
        
        public Build setMode(org.gstreamer.audio.AudioCdSrcMode mode) {
            names.add("mode");
            values.add(org.gtk.gobject.Value.create(mode));
            return this;
        }
        
        public Build setTrack(int track) {
            names.add("track");
            values.add(org.gtk.gobject.Value.create(track));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_cd_src_add_track = Interop.downcallHandle(
            "gst_audio_cd_src_add_track",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_cd_src_get_type = Interop.downcallHandle(
            "gst_audio_cd_src_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
