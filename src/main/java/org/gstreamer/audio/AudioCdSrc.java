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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.PushSrc.getMemoryLayout().withName("pushsrc"),
            Interop.valueLayout.ADDRESS.withName("tags"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_INT).withName("_gst_reserved1"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("_gst_reserved2")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a AudioCdSrc proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioCdSrc(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioCdSrc> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioCdSrc(input);
    
    /**
     * CDDA sources use this function from their start vfunc to announce the
     * available data and audio tracks to the base source class. The caller
     * should allocate {@code track} on the stack, the base source will do a shallow
     * copy of the structure (and take ownership of the taglist if there is one).
     * @param track address of {@link AudioCdSrcTrack} to add
     * @return FALSE on error, otherwise TRUE.
     */
    public boolean addTrack(org.gstreamer.audio.AudioCdSrcTrack track) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_cd_src_add_track.invokeExact(
                    handle(),
                    track.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_cd_src_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link AudioCdSrc.Builder} object constructs a {@link AudioCdSrc} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AudioCdSrc.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.base.PushSrc.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AudioCdSrc} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioCdSrc}.
         * @return A new instance of {@code AudioCdSrc} with the properties 
         *         that were set in the Builder object.
         */
        public AudioCdSrc build() {
            return (AudioCdSrc) org.gtk.gobject.GObject.newWithProperties(
                AudioCdSrc.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setDevice(java.lang.String device) {
            names.add("device");
            values.add(org.gtk.gobject.Value.create(device));
            return this;
        }
        
        public Builder setMode(org.gstreamer.audio.AudioCdSrcMode mode) {
            names.add("mode");
            values.add(org.gtk.gobject.Value.create(mode));
            return this;
        }
        
        public Builder setTrack(int track) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_audio_cd_src_get_type != null;
    }
}
