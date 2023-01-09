package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global Gst namespace.
 */
public final class Gst {
    
    static {
        LibLoad.loadLibrary("gstreamer-1.0");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
/**
 * The allocator name for the default system memory allocator
 */
public static final java.lang.String ALLOCATOR_SYSMEM = "SystemMemory";
    
/**
 * Combination of all possible fields that can be copied with
 * gst_buffer_copy_into().
 */
public static final org.gstreamer.gst.BufferCopyFlags BUFFER_COPY_ALL = new org.gstreamer.gst.BufferCopyFlags(15);
    
/**
 * Combination of all possible metadata fields that can be copied with
 * gst_buffer_copy_into().
 */
public static final org.gstreamer.gst.BufferCopyFlags BUFFER_COPY_METADATA = new org.gstreamer.gst.BufferCopyFlags(7);
    
/**
 * Constant for no-offset return results.
 */
public static final long BUFFER_OFFSET_NONE = -1L;
    
public static final int CAN_INLINE = 1;
    
public static final java.lang.String CAPS_FEATURE_MEMORY_SYSTEM_MEMORY = "memory:SystemMemory";
    
/**
 * Constant to define an undefined clock time.
 */
public static final org.gstreamer.gst.ClockTime CLOCK_TIME_NONE = new org.gstreamer.gst.ClockTime(-1L);
    
public static final int DEBUG_BG_MASK = 240;
    
public static final int DEBUG_FG_MASK = 15;
    
public static final int DEBUG_FORMAT_MASK = 65280;
    
public static final java.lang.String ELEMENT_FACTORY_KLASS_DECODER = "Decoder";
    
public static final java.lang.String ELEMENT_FACTORY_KLASS_DECRYPTOR = "Decryptor";
    
public static final java.lang.String ELEMENT_FACTORY_KLASS_DEMUXER = "Demuxer";
    
public static final java.lang.String ELEMENT_FACTORY_KLASS_DEPAYLOADER = "Depayloader";
    
public static final java.lang.String ELEMENT_FACTORY_KLASS_ENCODER = "Encoder";
    
public static final java.lang.String ELEMENT_FACTORY_KLASS_ENCRYPTOR = "Encryptor";
    
public static final java.lang.String ELEMENT_FACTORY_KLASS_FORMATTER = "Formatter";
    
/**
 * Elements interacting with hardware devices should specify this classifier in
 * their metadata. You may need to put the element in "READY" state to test if
 * the hardware is present in the system.
 */
public static final java.lang.String ELEMENT_FACTORY_KLASS_HARDWARE = "Hardware";
    
public static final java.lang.String ELEMENT_FACTORY_KLASS_MEDIA_AUDIO = "Audio";
    
public static final java.lang.String ELEMENT_FACTORY_KLASS_MEDIA_IMAGE = "Image";
    
public static final java.lang.String ELEMENT_FACTORY_KLASS_MEDIA_METADATA = "Metadata";
    
public static final java.lang.String ELEMENT_FACTORY_KLASS_MEDIA_SUBTITLE = "Subtitle";
    
public static final java.lang.String ELEMENT_FACTORY_KLASS_MEDIA_VIDEO = "Video";
    
public static final java.lang.String ELEMENT_FACTORY_KLASS_MUXER = "Muxer";
    
public static final java.lang.String ELEMENT_FACTORY_KLASS_PARSER = "Parser";
    
public static final java.lang.String ELEMENT_FACTORY_KLASS_PAYLOADER = "Payloader";
    
public static final java.lang.String ELEMENT_FACTORY_KLASS_SINK = "Sink";
    
public static final java.lang.String ELEMENT_FACTORY_KLASS_SRC = "Source";
    
/**
 * Elements of any of the defined GST_ELEMENT_FACTORY_LIST types
 */
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_ANY = new org.gstreamer.gst.ElementFactoryListType(562949953421311L);
    
/**
 * All sinks handling audio, video or image media types
 */
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_AUDIOVIDEO_SINKS = new org.gstreamer.gst.ElementFactoryListType(3940649673949188L);
    
/**
 * All encoders handling audio media types
 */
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_AUDIO_ENCODER = new org.gstreamer.gst.ElementFactoryListType(1125899906842626L);
    
/**
 * All elements used to 'decode' streams (decoders, demuxers, parsers, depayloaders)
 */
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_DECODABLE = new org.gstreamer.gst.ElementFactoryListType(1377L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_DECODER = new org.gstreamer.gst.ElementFactoryListType(1L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_DECRYPTOR = new org.gstreamer.gst.ElementFactoryListType(1024L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_DEMUXER = new org.gstreamer.gst.ElementFactoryListType(32L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_DEPAYLOADER = new org.gstreamer.gst.ElementFactoryListType(256L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_ENCODER = new org.gstreamer.gst.ElementFactoryListType(2L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_ENCRYPTOR = new org.gstreamer.gst.ElementFactoryListType(2048L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_FORMATTER = new org.gstreamer.gst.ElementFactoryListType(512L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_HARDWARE = new org.gstreamer.gst.ElementFactoryListType(4096L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_MAX_ELEMENTS = new org.gstreamer.gst.ElementFactoryListType(281474976710656L);
    
/**
 * Elements matching any of the defined GST_ELEMENT_FACTORY_TYPE_MEDIA types
 * <p>
 * Note: Do not use this if you wish to not filter against any of the defined
 * media types. If you wish to do this, simply don't specify any
 * GST_ELEMENT_FACTORY_TYPE_MEDIA flag.
 */
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_MEDIA_ANY = new org.gstreamer.gst.ElementFactoryListType(-281474976710656L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_MEDIA_AUDIO = new org.gstreamer.gst.ElementFactoryListType(1125899906842624L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_MEDIA_IMAGE = new org.gstreamer.gst.ElementFactoryListType(2251799813685248L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_MEDIA_METADATA = new org.gstreamer.gst.ElementFactoryListType(9007199254740992L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_MEDIA_SUBTITLE = new org.gstreamer.gst.ElementFactoryListType(4503599627370496L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_MEDIA_VIDEO = new org.gstreamer.gst.ElementFactoryListType(562949953421312L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_MUXER = new org.gstreamer.gst.ElementFactoryListType(16L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_PARSER = new org.gstreamer.gst.ElementFactoryListType(64L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_PAYLOADER = new org.gstreamer.gst.ElementFactoryListType(128L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_SINK = new org.gstreamer.gst.ElementFactoryListType(4L);
    
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_SRC = new org.gstreamer.gst.ElementFactoryListType(8L);
    
/**
 * All encoders handling video or image media types
 */
public static final org.gstreamer.gst.ElementFactoryListType ELEMENT_FACTORY_TYPE_VIDEO_ENCODER = new org.gstreamer.gst.ElementFactoryListType(2814749767106562L);
    
/**
 * Name and contact details of the author(s). Use \\n to separate
 * multiple author details.
 * E.g: "Joe Bloggs &amp;lt;joe.blogs at foo.com&amp;gt;"
 */
public static final java.lang.String ELEMENT_METADATA_AUTHOR = "author";
    
/**
 * Sentence describing the purpose of the element.
 * E.g: "Write stream to a file"
 */
public static final java.lang.String ELEMENT_METADATA_DESCRIPTION = "description";
    
/**
 * Set uri pointing to user documentation. Applications can use this to show
 * help for e.g. effects to users.
 */
public static final java.lang.String ELEMENT_METADATA_DOC_URI = "doc-uri";
    
/**
 * Elements that bridge to certain other products can include an icon of that
 * used product. Application can show the icon in menus/selectors to help
 * identifying specific elements.
 */
public static final java.lang.String ELEMENT_METADATA_ICON_NAME = "icon-name";
    
/**
 * String describing the type of element, as an unordered list
 * separated with slashes ('/'). See draft-klass.txt of the design docs
 * for more details and common types. E.g: "Sink/File"
 */
public static final java.lang.String ELEMENT_METADATA_KLASS = "klass";
    
/**
 * The long English name of the element. E.g. "File Sink"
 */
public static final java.lang.String ELEMENT_METADATA_LONGNAME = "long-name";
    
/**
 * Builds a string using errno describing the previously failed system
 * call.  To be used as the debug argument in {@code GST_ELEMENT_ERROR}.
 */
public static final java.lang.String ERROR_SYSTEM = "system error: %s";
    
public static final int EVENT_NUM_SHIFT = 8;
    
/**
 * The same thing as {@code GST_EVENT_TYPE_UPSTREAM} | {@code GST_EVENT_TYPE_DOWNSTREAM}.
 */
public static final org.gstreamer.gst.EventTypeFlags EVENT_TYPE_BOTH = new org.gstreamer.gst.EventTypeFlags(3);
    
/**
 * A mask value with all bits set, for use as a
 * GstFlagSet mask where all flag bits must match
 * exactly
 */
public static final int FLAG_SET_MASK_EXACT = -1;
    
/**
 * The PERCENT format is between 0 and this value
 */
public static final long FORMAT_PERCENT_MAX = 1000000L;
    
/**
 * The value used to scale down the reported PERCENT format value to
 * its real value.
 */
public static final long FORMAT_PERCENT_SCALE = 10000L;
    
/**
 * Can be used together with {@code GST_FOURCC_ARGS} to properly output a
 * {@code guint32} fourcc value in a printf\\()-style text message.
 * <pre>{@code 
 * printf ("fourcc: %" GST_FOURCC_FORMAT "\\n", GST_FOURCC_ARGS (fcc));
 * }</pre>
 */
public static final java.lang.String FOURCC_FORMAT = "c%c%c%c";
    
/**
 * A value which is guaranteed to never be returned by
 * gst_util_group_id_next().
 * <p>
 * Can be used as a default value in variables used to store group_id.
 */
public static final int GROUP_ID_INVALID = 0;
    
/**
 * To be used in GST_PLUGIN_DEFINE if unsure about the licence.
 */
public static final java.lang.String LICENSE_UNKNOWN = "unknown";
    
/**
 * GstLockFlags value alias for GST_LOCK_FLAG_READ | GST_LOCK_FLAG_WRITE
 */
public static final org.gstreamer.gst.LockFlags LOCK_FLAG_READWRITE = new org.gstreamer.gst.LockFlags(3);
    
/**
 * GstMapFlags value alias for GST_MAP_READ | GST_MAP_WRITE
 */
public static final org.gstreamer.gst.MapFlags MAP_READWRITE = new org.gstreamer.gst.MapFlags(3);
    
/**
 * This metadata stays relevant until a deep copy is made.
 */
public static final java.lang.String META_TAG_MEMORY_REFERENCE_STR = "memory-reference";
    
/**
 * This metadata stays relevant as long as memory layout is unchanged.
 * In hindsight, this tag should have been called "memory-layout".
 */
public static final java.lang.String META_TAG_MEMORY_STR = "memory";
    
/**
 * Constant that defines one GStreamer millisecond.
 */
public static final org.gstreamer.gst.ClockTimeDiff MSECOND = new org.gstreamer.gst.ClockTimeDiff(1000000L);
    
/**
 * Constant that defines one GStreamer nanosecond
 */
public static final org.gstreamer.gst.ClockTimeDiff NSECOND = new org.gstreamer.gst.ClockTimeDiff(1L);
    
/**
 * Use this flag on GObject properties of GstObject to indicate that
 * they might not be available depending on environment such as OS, device, etc,
 * so such properties will be installed conditionally only if the GstObject is
 * able to support it.
 */
public static final int PARAM_CONDITIONALLY_AVAILABLE = 16384;
    
/**
 * Use this flag on GObject properties to signal they can make sense to be.
 * controlled over time. This hint is used by the GstController.
 */
public static final int PARAM_CONTROLLABLE = 512;
    
/**
 * Use this flag on GObject properties of GstObject to indicate that
 * during {@code gst-inspect} and friends, the default value should be used
 * as default instead of the current value.
 */
public static final int PARAM_DOC_SHOW_DEFAULT = 8192;
    
/**
 * Use this flag on GObject properties of GstElements to indicate that
 * they can be changed when the element is in the PAUSED or lower state.
 * This flag implies GST_PARAM_MUTABLE_READY.
 */
public static final int PARAM_MUTABLE_PAUSED = 2048;
    
/**
 * Use this flag on GObject properties of GstElements to indicate that
 * they can be changed when the element is in the PLAYING or lower state.
 * This flag implies GST_PARAM_MUTABLE_PAUSED.
 */
public static final int PARAM_MUTABLE_PLAYING = 4096;
    
/**
 * Use this flag on GObject properties of GstElements to indicate that
 * they can be changed when the element is in the READY or lower state.
 */
public static final int PARAM_MUTABLE_READY = 1024;
    
/**
 * Bits based on GST_PARAM_USER_SHIFT can be used by 3rd party applications.
 */
public static final int PARAM_USER_SHIFT = 65536;
    
/**
 * The field name in a GstCaps that is used to signal the UUID of the protection
 * system.
 */
public static final java.lang.String PROTECTION_SYSTEM_ID_CAPS_FIELD = "protection-system";
    
/**
 * The protection system value of the unspecified UUID.
 * In some cases the system protection ID is not present in the contents or in their
 * metadata, as encrypted WebM.
 * This define is used to set the value of the "system_id" field in GstProtectionEvent,
 * with this value, the application will use an external information to choose which
 * protection system to use.
 * <p>
 * Example: The matroskademux uses this value in the case of encrypted WebM,
 * the application will choose the appropriate protection system based on the information
 * received through EME API.
 */
public static final java.lang.String PROTECTION_UNSPECIFIED_SYSTEM_ID = "unspecified-system-id";
    
/**
 * printf format type used to debug GStreamer types. You can use this in
 * combination with GStreamer's debug logging system as well as the functions
 * gst_info_vasprintf(), gst_info_strdup_vprintf() and gst_info_strdup_printf()
 * to pretty-print the following types: {@link Caps}, {@link Structure},
 * {@link CapsFeatures}, {@link TagList}, {@link DateTime}, {@link Buffer}, {@link BufferList},
 * {@link Message}, {@link Event}, {@link Query}, {@link Context}, {@link Pad}, {@link GstObject}. All
 * {@link org.gtk.gobject.GObject} types will be printed as typename plus pointer, and everything
 * else will simply be printed as pointer address.
 * <p>
 * This can only be used on types whose size is &gt;= sizeof(gpointer).
 */
public static final java.lang.String PTR_FORMAT = "paA";
    
public static final int QUERY_NUM_SHIFT = 8;
    
/**
 * The same thing as {@code GST_QUERY_TYPE_UPSTREAM} | {@code GST_QUERY_TYPE_DOWNSTREAM}.
 */
public static final org.gstreamer.gst.QueryTypeFlags QUERY_TYPE_BOTH = new org.gstreamer.gst.QueryTypeFlags(3);
    
/**
 * Constant that defines one GStreamer second.
 */
public static final org.gstreamer.gst.ClockTimeDiff SECOND = new org.gstreamer.gst.ClockTimeDiff(1000000000L);
    
/**
 * printf format type used to debug GStreamer segments. You can use this in
 * combination with GStreamer's debug logging system as well as the functions
 * gst_info_vasprintf(), gst_info_strdup_vprintf() and gst_info_strdup_printf()
 * to pretty-print {@link Segment} structures.
 * This can only be used on pointers to GstSegment structures.
 */
public static final java.lang.String SEGMENT_FORMAT = "paB";
    
public static final int SEGMENT_INSTANT_FLAGS = 912;
    
/**
 * A value which is guaranteed to never be returned by
 * gst_util_seqnum_next().
 * <p>
 * Can be used as a default value in variables used to store seqnum.
 */
public static final int SEQNUM_INVALID = 0;
    
/**
 * printf format type used to debug GStreamer signed time value pointers. You
 * can use this in combination with GStreamer's debug logging system as well as
 * the functions gst_info_vasprintf(), gst_info_strdup_vprintf() and
 * gst_info_strdup_printf() to pretty-print signed time (pointers to
 * {@link ClockTimeDiff} or {@code gint64}).
 */
public static final java.lang.String STIMEP_FORMAT = "paS";
    
/**
 * A string that can be used in printf-like format strings to display a signed
 * {@link ClockTimeDiff} or {@code gint64} value in {@code h:m:s} format.  Use GST_TIME_ARGS() to
 * construct the matching arguments.
 * <p>
 * Example:
 * <pre>{@code  C
 * printf("%" GST_STIME_FORMAT "\\n", GST_STIME_ARGS(ts));
 * }</pre>
 */
public static final java.lang.String STIME_FORMAT = "c%";
    
/**
 * album containing this data (string)
 * <p>
 * The album name as it should be displayed, e.g. 'The Jazz Guitar'
 */
public static final java.lang.String TAG_ALBUM = "album";
    
/**
 * The artist of the entire album, as it should be displayed.
 */
public static final java.lang.String TAG_ALBUM_ARTIST = "album-artist";
    
/**
 * The artist of the entire album, as it should be sorted.
 */
public static final java.lang.String TAG_ALBUM_ARTIST_SORTNAME = "album-artist-sortname";
    
/**
 * album gain in db (double)
 */
public static final java.lang.String TAG_ALBUM_GAIN = "replaygain-album-gain";
    
/**
 * peak of the album (double)
 */
public static final java.lang.String TAG_ALBUM_PEAK = "replaygain-album-peak";
    
/**
 * album containing this data, as used for sorting (string)
 * <p>
 * The album name as it should be sorted, e.g. 'Jazz Guitar, The'
 */
public static final java.lang.String TAG_ALBUM_SORTNAME = "album-sortname";
    
/**
 * count of discs inside collection this disc belongs to (unsigned integer)
 */
public static final java.lang.String TAG_ALBUM_VOLUME_COUNT = "album-disc-count";
    
/**
 * disc number inside a collection (unsigned integer)
 */
public static final java.lang.String TAG_ALBUM_VOLUME_NUMBER = "album-disc-number";
    
/**
 * Arbitrary application data (sample)
 * <p>
 * Some formats allow applications to add their own arbitrary data
 * into files. This data is application dependent.
 */
public static final java.lang.String TAG_APPLICATION_DATA = "application-data";
    
/**
 * Name of the application used to create the media (string)
 */
public static final java.lang.String TAG_APPLICATION_NAME = "application-name";
    
/**
 * person(s) responsible for the recording (string)
 * <p>
 * The artist name as it should be displayed, e.g. 'Jimi Hendrix' or
 * 'The Guitar Heroes'
 */
public static final java.lang.String TAG_ARTIST = "artist";
    
/**
 * person(s) responsible for the recording, as used for sorting (string)
 * <p>
 * The artist name as it should be sorted, e.g. 'Hendrix, Jimi' or
 * 'Guitar Heroes, The'
 */
public static final java.lang.String TAG_ARTIST_SORTNAME = "artist-sortname";
    
/**
 * generic file attachment (sample) (sample taglist should specify the content
 * type and if possible set "filename" to the file name of the
 * attachment)
 */
public static final java.lang.String TAG_ATTACHMENT = "attachment";
    
/**
 * codec the audio data is stored in (string)
 */
public static final java.lang.String TAG_AUDIO_CODEC = "audio-codec";
    
/**
 * number of beats per minute in audio (double)
 */
public static final java.lang.String TAG_BEATS_PER_MINUTE = "beats-per-minute";
    
/**
 * exact or average bitrate in bits/s (unsigned integer)
 */
public static final java.lang.String TAG_BITRATE = "bitrate";
    
/**
 * codec the data is stored in (string)
 */
public static final java.lang.String TAG_CODEC = "codec";
    
/**
 * free text commenting the data (string)
 */
public static final java.lang.String TAG_COMMENT = "comment";
    
/**
 * person(s) who composed the recording (string)
 */
public static final java.lang.String TAG_COMPOSER = "composer";
    
/**
 * The composer's name, used for sorting (string)
 */
public static final java.lang.String TAG_COMPOSER_SORTNAME = "composer-sortname";
    
/**
 * conductor/performer refinement (string)
 */
public static final java.lang.String TAG_CONDUCTOR = "conductor";
    
/**
 * contact information (string)
 */
public static final java.lang.String TAG_CONTACT = "contact";
    
/**
 * container format the data is stored in (string)
 */
public static final java.lang.String TAG_CONTAINER_FORMAT = "container-format";
    
/**
 * copyright notice of the data (string)
 */
public static final java.lang.String TAG_COPYRIGHT = "copyright";
    
/**
 * URI to location where copyright details can be found (string)
 */
public static final java.lang.String TAG_COPYRIGHT_URI = "copyright-uri";
    
/**
 * date the data was created ({@link org.gtk.glib.Date} structure)
 */
public static final java.lang.String TAG_DATE = "date";
    
/**
 * date and time the data was created ({@link DateTime} structure)
 */
public static final java.lang.String TAG_DATE_TIME = "datetime";
    
/**
 * short text describing the content of the data (string)
 */
public static final java.lang.String TAG_DESCRIPTION = "description";
    
/**
 * Manufacturer of the device used to create the media (string)
 */
public static final java.lang.String TAG_DEVICE_MANUFACTURER = "device-manufacturer";
    
/**
 * Model of the device used to create the media (string)
 */
public static final java.lang.String TAG_DEVICE_MODEL = "device-model";
    
/**
 * length in GStreamer time units (nanoseconds) (unsigned 64-bit integer)
 */
public static final java.lang.String TAG_DURATION = "duration";
    
/**
 * name of the person or organisation that encoded the file. May contain a
 * copyright message if the person or organisation also holds the copyright
 * (string)
 * <p>
 * Note: do not use this field to describe the encoding application. Use
 * {@code GST_TAG_APPLICATION_NAME} or {@code GST_TAG_COMMENT} for that.
 */
public static final java.lang.String TAG_ENCODED_BY = "encoded-by";
    
/**
 * encoder used to encode this stream (string)
 */
public static final java.lang.String TAG_ENCODER = "encoder";
    
/**
 * version of the encoder used to encode this stream (unsigned integer)
 */
public static final java.lang.String TAG_ENCODER_VERSION = "encoder-version";
    
/**
 * key/value text commenting the data (string)
 * <p>
 * Must be in the form of 'key=comment' or
 * 'key[lc]=comment' where 'lc' is an ISO-639
 * language code.
 * <p>
 * This tag is used for unknown Vorbis comment tags,
 * unknown APE tags and certain ID3v2 comment fields.
 */
public static final java.lang.String TAG_EXTENDED_COMMENT = "extended-comment";
    
/**
 * genre this data belongs to (string)
 */
public static final java.lang.String TAG_GENRE = "genre";
    
/**
 * Indicates the direction the device is pointing to when capturing
 * a media. It is represented as degrees in floating point representation,
 * 0 means the geographic north, and increases clockwise (double from 0 to 360)
 * <p>
 * See also {@code GST_TAG_GEO_LOCATION_MOVEMENT_DIRECTION}
 */
public static final java.lang.String TAG_GEO_LOCATION_CAPTURE_DIRECTION = "geo-location-capture-direction";
    
/**
 * The city (english name) where the media has been produced (string).
 */
public static final java.lang.String TAG_GEO_LOCATION_CITY = "geo-location-city";
    
/**
 * The country (english name) where the media has been produced (string).
 */
public static final java.lang.String TAG_GEO_LOCATION_COUNTRY = "geo-location-country";
    
/**
 * geo elevation of where the media has been recorded or produced in meters
 * according to WGS84 (zero is average sea level) (double).
 */
public static final java.lang.String TAG_GEO_LOCATION_ELEVATION = "geo-location-elevation";
    
/**
 * Represents the expected error on the horizontal positioning in
 * meters (double).
 */
public static final java.lang.String TAG_GEO_LOCATION_HORIZONTAL_ERROR = "geo-location-horizontal-error";
    
/**
 * geo latitude location of where the media has been recorded or produced in
 * degrees according to WGS84 (zero at the equator, negative values for southern
 * latitudes) (double).
 */
public static final java.lang.String TAG_GEO_LOCATION_LATITUDE = "geo-location-latitude";
    
/**
 * geo longitude location of where the media has been recorded or produced in
 * degrees according to WGS84 (zero at the prime meridian in Greenwich/UK,
 * negative values for western longitudes). (double).
 */
public static final java.lang.String TAG_GEO_LOCATION_LONGITUDE = "geo-location-longitude";
    
/**
 * Indicates the movement direction of the device performing the capture
 * of a media. It is represented as degrees in floating point representation,
 * 0 means the geographic north, and increases clockwise (double from 0 to 360)
 * <p>
 * See also {@code GST_TAG_GEO_LOCATION_CAPTURE_DIRECTION}
 */
public static final java.lang.String TAG_GEO_LOCATION_MOVEMENT_DIRECTION = "geo-location-movement-direction";
    
/**
 * Speed of the capturing device when performing the capture.
 * Represented in m/s. (double)
 * <p>
 * See also {@code GST_TAG_GEO_LOCATION_MOVEMENT_DIRECTION}
 */
public static final java.lang.String TAG_GEO_LOCATION_MOVEMENT_SPEED = "geo-location-movement-speed";
    
/**
 * human readable descriptive location of where the media has been recorded or
 * produced. (string).
 */
public static final java.lang.String TAG_GEO_LOCATION_NAME = "geo-location-name";
    
/**
 * A location 'smaller' than GST_TAG_GEO_LOCATION_CITY that specifies better
 * where the media has been produced. (e.g. the neighborhood) (string).
 * <p>
 * This tag has been added as this is how it is handled/named in XMP's
 * Iptc4xmpcore schema.
 */
public static final java.lang.String TAG_GEO_LOCATION_SUBLOCATION = "geo-location-sublocation";
    
/**
 * Groups together media that are related and spans multiple tracks. An
 * example are multiple pieces of a concerto. (string)
 */
public static final java.lang.String TAG_GROUPING = "grouping";
    
/**
 * Homepage for this media (i.e. artist or movie homepage) (string)
 */
public static final java.lang.String TAG_HOMEPAGE = "homepage";
    
/**
 * image (sample) (sample taglist should specify the content type and preferably
 * also set "image-type" field as {@code GstTagImageType})
 */
public static final java.lang.String TAG_IMAGE = "image";
    
/**
 * Represents the 'Orientation' tag from EXIF. Defines how the image
 * should be rotated and mirrored for display. (string)
 * <p>
 * This tag has a predefined set of allowed values:
 *   "rotate-0"
 *   "rotate-90"
 *   "rotate-180"
 *   "rotate-270"
 *   "flip-rotate-0"
 *   "flip-rotate-90"
 *   "flip-rotate-180"
 *   "flip-rotate-270"
 * <p>
 * The naming is adopted according to a possible transformation to perform
 * on the image to fix its orientation, obviously equivalent operations will
 * yield the same result.
 * <p>
 * Rotations indicated by the values are in clockwise direction and
 * 'flip' means an horizontal mirroring.
 */
public static final java.lang.String TAG_IMAGE_ORIENTATION = "image-orientation";
    
/**
 * Information about the people behind a remix and similar
 * interpretations of another existing piece (string)
 */
public static final java.lang.String TAG_INTERPRETED_BY = "interpreted-by";
    
/**
 * International Standard Recording Code - see http://www.ifpi.org/isrc/ (string)
 */
public static final java.lang.String TAG_ISRC = "isrc";
    
/**
 * comma separated keywords describing the content (string).
 */
public static final java.lang.String TAG_KEYWORDS = "keywords";
    
/**
 * ISO-639-2 or ISO-639-1 code for the language the content is in (string)
 * <p>
 * There is utility API in libgsttag in gst-plugins-base to obtain a translated
 * language name from the language code: {@code gst_tag_get_language_name()}
 */
public static final java.lang.String TAG_LANGUAGE_CODE = "language-code";
    
/**
 * Name of the language the content is in (string)
 * <p>
 * Free-form name of the language the content is in, if a language code
 * is not available. This tag should not be set in addition to a language
 * code. It is undefined what language or locale the language name is in.
 */
public static final java.lang.String TAG_LANGUAGE_NAME = "language-name";
    
/**
 * license of data (string)
 */
public static final java.lang.String TAG_LICENSE = "license";
    
/**
 * URI to location where license details can be found (string)
 */
public static final java.lang.String TAG_LICENSE_URI = "license-uri";
    
/**
 * Origin of media as a URI (location, where the original of the file or stream
 * is hosted) (string)
 */
public static final java.lang.String TAG_LOCATION = "location";
    
/**
 * The lyrics of the media (string)
 */
public static final java.lang.String TAG_LYRICS = "lyrics";
    
/**
 * maximum bitrate in bits/s (unsigned integer)
 */
public static final java.lang.String TAG_MAXIMUM_BITRATE = "maximum-bitrate";
    
/**
 * <a href="http://en.wikipedia.org/wiki/Note#Note_designation_in_accordance_with_octave_name">Midi note number</a>
 * of the audio track. This is useful for sample instruments and in particular
 * for multi-samples.
 */
public static final java.lang.String TAG_MIDI_BASE_NOTE = "midi-base-note";
    
/**
 * minimum bitrate in bits/s (unsigned integer)
 */
public static final java.lang.String TAG_MINIMUM_BITRATE = "minimum-bitrate";
    
/**
 * nominal bitrate in bits/s (unsigned integer). The actual bitrate might be
 * different from this target bitrate.
 */
public static final java.lang.String TAG_NOMINAL_BITRATE = "nominal-bitrate";
    
/**
 * organization (string)
 */
public static final java.lang.String TAG_ORGANIZATION = "organization";
    
/**
 * person(s) performing (string)
 */
public static final java.lang.String TAG_PERFORMER = "performer";
    
/**
 * image that is meant for preview purposes, e.g. small icon-sized version
 * (sample) (sample taglist should specify the content type)
 */
public static final java.lang.String TAG_PREVIEW_IMAGE = "preview-image";
    
/**
 * Any private data that may be contained in tags (sample).
 * <p>
 * It is represented by {@link Sample} in which {@link Buffer} contains the
 * binary data and the sample's info {@link Structure} may contain any
 * extra information that identifies the origin or meaning of the data.
 * <p>
 * Private frames in ID3v2 tags ('PRIV' frames) will be represented
 * using this tag, in which case the GstStructure will be named
 * "ID3PrivateFrame" and contain a field named "owner" of type string
 * which contains the owner-identification string from the tag.
 */
public static final java.lang.String TAG_PRIVATE_DATA = "private-data";
    
/**
 * Name of the label or publisher (string)
 */
public static final java.lang.String TAG_PUBLISHER = "publisher";
    
/**
 * reference level of track and album gain values (double)
 */
public static final java.lang.String TAG_REFERENCE_LEVEL = "replaygain-reference-level";
    
/**
 * serial number of track (unsigned integer)
 */
public static final java.lang.String TAG_SERIAL = "serial";
    
/**
 * Number of the episode within a season/show (unsigned integer)
 */
public static final java.lang.String TAG_SHOW_EPISODE_NUMBER = "show-episode-number";
    
/**
 * Name of the show, used for displaying (string)
 */
public static final java.lang.String TAG_SHOW_NAME = "show-name";
    
/**
 * Number of the season of a show/series (unsigned integer)
 */
public static final java.lang.String TAG_SHOW_SEASON_NUMBER = "show-season-number";
    
/**
 * Name of the show, used for sorting (string)
 */
public static final java.lang.String TAG_SHOW_SORTNAME = "show-sortname";
    
/**
 * codec/format the subtitle data is stored in (string)
 */
public static final java.lang.String TAG_SUBTITLE_CODEC = "subtitle-codec";
    
/**
 * commonly used title (string)
 * <p>
 * The title as it should be displayed, e.g. 'The Doll House'
 */
public static final java.lang.String TAG_TITLE = "title";
    
/**
 * commonly used title, as used for sorting (string)
 * <p>
 * The title as it should be sorted, e.g. 'Doll House, The'
 */
public static final java.lang.String TAG_TITLE_SORTNAME = "title-sortname";
    
/**
 * count of tracks inside collection this track belongs to (unsigned integer)
 */
public static final java.lang.String TAG_TRACK_COUNT = "track-count";
    
/**
 * track gain in db (double)
 */
public static final java.lang.String TAG_TRACK_GAIN = "replaygain-track-gain";
    
/**
 * track number inside a collection (unsigned integer)
 */
public static final java.lang.String TAG_TRACK_NUMBER = "track-number";
    
/**
 * peak of the track (double)
 */
public static final java.lang.String TAG_TRACK_PEAK = "replaygain-track-peak";
    
/**
 * Rating attributed by a person (likely the application user).
 * The higher the value, the more the user likes this media
 * (unsigned int from 0 to 100)
 */
public static final java.lang.String TAG_USER_RATING = "user-rating";
    
/**
 * version of this data (string)
 */
public static final java.lang.String TAG_VERSION = "version";
    
/**
 * codec the video data is stored in (string)
 */
public static final java.lang.String TAG_VIDEO_CODEC = "video-codec";
    
/**
 * printf format type used to debug GStreamer ClockTime pointers. You can use
 * this in combination with GStreamer's debug logging system as well as the
 * functions gst_info_vasprintf(), gst_info_strdup_vprintf() and
 * gst_info_strdup_printf() to pretty-print {@link ClockTime} pointers. This can
 * only be used on pointers to GstClockTime values.
 */
public static final java.lang.String TIMEP_FORMAT = "paT";
    
/**
 * A string that can be used in printf-like format strings to display a
 * {@link ClockTime} value in {@code h:m:s} format.  Use GST_TIME_ARGS() to construct
 * the matching arguments.
 * <p>
 * Example:
 * <pre>{@code  C
 * printf("%" GST_TIME_FORMAT "\\n", GST_TIME_ARGS(ts));
 * }</pre>
 */
public static final java.lang.String TIME_FORMAT = "u:%02u:%02u.%09u";
    
/**
 * Special value for the repeat_count set in gst_toc_entry_set_loop() or
 * returned by gst_toc_entry_set_loop() to indicate infinite looping.
 */
public static final int TOC_REPEAT_COUNT_INFINITE = -1;
    
/**
 * Value for {@link Uri}&lt;!-- --&gt;.port to indicate no port number.
 */
public static final int URI_NO_PORT = 0;
    
/**
 * Constant that defines one GStreamer microsecond.
 */
public static final org.gstreamer.gst.ClockTimeDiff USECOND = new org.gstreamer.gst.ClockTimeDiff(1000L);
    
/**
 * Indicates that the first value provided to a comparison function
 * (gst_value_compare()) is equal to the second one.
 */
public static final int VALUE_EQUAL = 0;
    
/**
 * Indicates that the first value provided to a comparison function
 * (gst_value_compare()) is greater than the second one.
 */
public static final int VALUE_GREATER_THAN = 1;
    
/**
 * Indicates that the first value provided to a comparison function
 * (gst_value_compare()) is lesser than the second one.
 */
public static final int VALUE_LESS_THAN = -1;
    
/**
 * Indicates that the comparison function (gst_value_compare()) can not
 * determine a order for the two provided values.
 */
public static final int VALUE_UNORDERED = 2;
    
/**
 * The major version of GStreamer at compile time:
 */
public static final int VERSION_MAJOR = 1;
    
/**
 * The micro version of GStreamer at compile time:
 */
public static final int VERSION_MICRO = 4;
    
/**
 * The minor version of GStreamer at compile time:
 */
public static final int VERSION_MINOR = 20;
    
/**
 * The nano version of GStreamer at compile time:
 * Actual releases have 0, GIT versions have 1, prerelease versions have 2-...
 */
public static final int VERSION_NANO = 0;

/**
 * Gets the maximum amount of memory blocks that a buffer can hold. This is a
 * compile time constant that can be queried with the function.
 * <p>
 * When more memory blocks are added, existing memory blocks will be merged
 * together to make room for the new block.
 * @return the maximum amount of memory blocks that a buffer can hold.
 */
public static int bufferGetMaxMemory() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_buffer_get_max_memory.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Calculates the linear regression of the values {@code xy} and places the
 * result in {@code m_num}, {@code m_denom}, {@code b} and {@code xbase}, representing the function
 *   y(x) = m_num/m_denom * (x - xbase) + b
 * that has the least-square distance from all points {@code x} and {@code y}.
 * <p>
 * {@code r_squared} will contain the remaining error.
 * <p>
 * If {@code temp} is not {@code null}, it will be used as temporary space for the function,
 * in which case the function works without any allocation at all. If {@code temp} is
 * {@code null}, an allocation will take place. {@code temp} should have at least the same
 * amount of memory allocated as {@code xy}, i.e. 2<em>n</em>sizeof(GstClockTime).
 * <p>
 * <blockquote>
 *  This function assumes (x,y) values with reasonable large differences
 *  between them. It will not calculate the exact results if the differences
 *  between neighbouring values are too small due to not being able to
 *  represent sub-integer values during the calculations.
 * </blockquote>
 * @param xy Pairs of (x,y) values
 * @param temp Temporary scratch space used by the function
 * @param n number of (x,y) pairs
 * @param mNum numerator of calculated slope
 * @param mDenom denominator of calculated slope
 * @param b Offset at Y-axis
 * @param xbase Offset at X-axis
 * @param rSquared R-squared
 * @return {@code true} if the linear regression was successfully calculated
 */
public static boolean calculateLinearRegression(org.gstreamer.gst.ClockTime xy, org.gstreamer.gst.ClockTime temp, int n, org.gstreamer.gst.ClockTime mNum, org.gstreamer.gst.ClockTime mDenom, org.gstreamer.gst.ClockTime b, org.gstreamer.gst.ClockTime xbase, Out<Double> rSquared) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment xyPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment tempPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment mNumPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment mDenomPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment bPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment xbasePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment rSquaredPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_calculate_linear_regression.invokeExact(
                    (Addressable) xyPOINTER.address(),
                    (Addressable) tempPOINTER.address(),
                    n,
                    (Addressable) mNumPOINTER.address(),
                    (Addressable) mDenomPOINTER.address(),
                    (Addressable) bPOINTER.address(),
                    (Addressable) xbasePOINTER.address(),
                    (Addressable) rSquaredPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                xy.setValue(xyPOINTER.get(Interop.valueLayout.C_LONG, 0));
                temp.setValue(tempPOINTER.get(Interop.valueLayout.C_LONG, 0));
                mNum.setValue(mNumPOINTER.get(Interop.valueLayout.C_LONG, 0));
                mDenom.setValue(mDenomPOINTER.get(Interop.valueLayout.C_LONG, 0));
                b.setValue(bPOINTER.get(Interop.valueLayout.C_LONG, 0));
                xbase.setValue(xbasePOINTER.get(Interop.valueLayout.C_LONG, 0));
                rSquared.set(rSquaredPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Creates a {@link CapsFeatures} from a string representation.
 * @param features a string representation of a {@link CapsFeatures}.
 * @return a new {@link CapsFeatures} or
 *     {@code null} when the string could not be parsed.
 */
public static @Nullable org.gstreamer.gst.CapsFeatures capsFeaturesFromString(java.lang.String features) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_features_from_string.invokeExact(Marshal.stringToAddress.marshal(features, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.CapsFeatures.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Converts {@code caps} from a string representation.
 * <p>
 * The implementation of serialization up to 1.20 would lead to unexpected results
 * when there were nested {@link Caps} / {@link Structure} deeper than one level.
 * @param string a string to convert to {@link Caps}
 * @return a newly allocated {@link Caps}
 */
public static @Nullable org.gstreamer.gst.Caps capsFromString(java.lang.String string) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_from_string.invokeExact(Marshal.stringToAddress.marshal(string, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Clears a reference to a {@link MiniObject}.
 * <p>
 * {@code object_ptr} must not be {@code null}.
 * <p>
 * If the reference is {@code null} then this function does nothing.
 * Otherwise, the reference count of the object is decreased using
 * gst_mini_object_unref() and the pointer is set to {@code null}.
 * <p>
 * A macro is also included that allows this function to be used without
 * pointer casts.
 * @param objectPtr a pointer to a {@link MiniObject} reference
 */
public static void clearMiniObject(PointerProxy<org.gstreamer.gst.MiniObject> objectPtr) {
    try {
        DowncallHandles.gst_clear_mini_object.invokeExact(objectPtr.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Clears a reference to a {@link GstObject}.
 * <p>
 * {@code object_ptr} must not be {@code null}.
 * <p>
 * If the reference is {@code null} then this function does nothing.
 * Otherwise, the reference count of the object is decreased using
 * gst_object_unref() and the pointer is set to {@code null}.
 * <p>
 * A macro is also included that allows this function to be used without
 * pointer casts.
 * @param objectPtr a pointer to a {@link GstObject} reference
 */
public static void clearObject(PointerProxy<org.gstreamer.gst.GstObject> objectPtr) {
    try {
        DowncallHandles.gst_clear_object.invokeExact(objectPtr.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Clears a reference to a {@link Structure}.
 * <p>
 * {@code structure_ptr} must not be {@code null}.
 * <p>
 * If the reference is {@code null} then this function does nothing.
 * Otherwise, the structure is free'd using gst_structure_free() and the
 * pointer is set to {@code null}.
 * <p>
 * A macro is also included that allows this function to be used without
 * pointer casts.
 * @param structurePtr a pointer to a {@link Structure} reference
 */
public static void clearStructure(PointerProxy<org.gstreamer.gst.Structure> structurePtr) {
    try {
        DowncallHandles.gst_clear_structure.invokeExact(structurePtr.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

public static org.gtk.glib.Quark coreErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_core_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Adds the logging function to the list of logging functions.
 * Be sure to use {@code G_GNUC_NO_INSTRUMENT} on that function, it is needed.
 * @param func the function to use
 * @param notify called when {@code user_data} is not used anymore
 */
public static void debugAddLogFunction(org.gstreamer.gst.LogFunction func, org.gtk.glib.DestroyNotify notify) {
    try {
        DowncallHandles.gst_debug_add_log_function.invokeExact(
                (Addressable) func.toCallback(),
                (Addressable) MemoryAddress.NULL,
                (Addressable) notify.toCallback());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Adds a memory ringbuffer based debug logger that stores up to
 * {@code max_size_per_thread} bytes of logs per thread and times out threads after
 * {@code thread_timeout} seconds of inactivity.
 * <p>
 * Logs can be fetched with gst_debug_ring_buffer_logger_get_logs() and the
 * logger can be removed again with gst_debug_remove_ring_buffer_logger().
 * Only one logger at a time is possible.
 * @param maxSizePerThread Maximum size of log per thread in bytes
 * @param threadTimeout Timeout for threads in seconds
 */
public static void debugAddRingBufferLogger(int maxSizePerThread, int threadTimeout) {
    try {
        DowncallHandles.gst_debug_add_ring_buffer_logger.invokeExact(
                maxSizePerThread,
                threadTimeout);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * To aid debugging applications one can use this method to obtain the whole
 * network of gstreamer elements that form the pipeline into a dot file.
 * This data can be processed with graphviz to get an image.
 * @param bin the top-level pipeline that should be analyzed
 * @param details type of {@link DebugGraphDetails} to use
 * @return a string containing the pipeline in graphviz
 * dot format.
 */
public static java.lang.String debugBinToDotData(org.gstreamer.gst.Bin bin, org.gstreamer.gst.DebugGraphDetails details) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_debug_bin_to_dot_data.invokeExact(
                bin.handle(),
                details.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * To aid debugging applications one can use this method to write out the whole
 * network of gstreamer elements that form the pipeline into a dot file.
 * This file can be processed with graphviz to get an image.
 * <pre>{@code  shell
 *  dot -Tpng -oimage.png graph_lowlevel.dot
 * }</pre>
 * @param bin the top-level pipeline that should be analyzed
 * @param details type of {@link DebugGraphDetails} to use
 * @param fileName output base filename (e.g. "myplayer")
 */
public static void debugBinToDotFile(org.gstreamer.gst.Bin bin, org.gstreamer.gst.DebugGraphDetails details, java.lang.String fileName) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_debug_bin_to_dot_file.invokeExact(
                    bin.handle(),
                    details.getValue(),
                    Marshal.stringToAddress.marshal(fileName, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * This works like gst_debug_bin_to_dot_file(), but adds the current timestamp
 * to the filename, so that it can be used to take multiple snapshots.
 * @param bin the top-level pipeline that should be analyzed
 * @param details type of {@link DebugGraphDetails} to use
 * @param fileName output base filename (e.g. "myplayer")
 */
public static void debugBinToDotFileWithTs(org.gstreamer.gst.Bin bin, org.gstreamer.gst.DebugGraphDetails details, java.lang.String fileName) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_debug_bin_to_dot_file_with_ts.invokeExact(
                    bin.handle(),
                    details.getValue(),
                    Marshal.stringToAddress.marshal(fileName, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Constructs a string that can be used for getting the desired color in color
 * terminals.
 * You need to free the string after use.
 * @param colorinfo the color info
 * @return a string containing the color
 *     definition
 */
public static java.lang.String debugConstructTermColor(int colorinfo) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_debug_construct_term_color.invokeExact(colorinfo);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Constructs an integer that can be used for getting the desired color in
 * windows' terminals (cmd.exe). As there is no mean to underline, we simply
 * ignore this attribute.
 * <p>
 * This function returns 0 on non-windows machines.
 * @param colorinfo the color info
 * @return an integer containing the color definition
 */
public static int debugConstructWinColor(int colorinfo) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_debug_construct_win_color.invokeExact(colorinfo);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Returns a snapshot of a all categories that are currently in use . This list
 * may change anytime.
 * The caller has to free the list after use.
 * @return the list of
 *     debug categories
 */
public static org.gtk.glib.SList debugGetAllCategories() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_debug_get_all_categories.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
}

/**
 * Changes the coloring mode for debug output.
 * @return see {@code GstDebugColorMode} for possible values.
 */
public static org.gstreamer.gst.DebugColorMode debugGetColorMode() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_debug_get_color_mode.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.DebugColorMode.of(RESULT);
}

/**
 * Returns the default threshold that is used for new categories.
 * @return the default threshold level
 */
public static org.gstreamer.gst.DebugLevel debugGetDefaultThreshold() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_debug_get_default_threshold.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.DebugLevel.of(RESULT);
}

public static @Nullable java.lang.String debugGetStackTrace(org.gstreamer.gst.StackTraceFlags flags) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_debug_get_stack_trace.invokeExact(flags.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Checks if debugging output is activated.
 * @return {@code true}, if debugging is activated
 */
public static boolean debugIsActive() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_debug_is_active.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Checks if the debugging output should be colored.
 * @return {@code true}, if the debug output should be colored.
 */
public static boolean debugIsColored() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_debug_is_colored.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Get the string representation of a debugging level
 * @param level the level to get the name for
 * @return the name
 */
public static java.lang.String debugLevelGetName(org.gstreamer.gst.DebugLevel level) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_debug_level_get_name.invokeExact(level.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Logs the given message using the currently registered debugging handlers.
 * @param category category to log
 * @param level level of the message is in
 * @param file the file that emitted the message, usually the __FILE__ identifier
 * @param function the function that emitted the message
 * @param line the line from that the message was emitted, usually __LINE__
 * @param object the object this message relates to,
 *     or {@code null} if none
 * @param format a printf style format string
 * @param varargs optional arguments for the format
 */
public static void debugLog(org.gstreamer.gst.DebugCategory category, org.gstreamer.gst.DebugLevel level, java.lang.String file, java.lang.String function, int line, @Nullable org.gtk.gobject.GObject object, java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_debug_log.invokeExact(
                    category.handle(),
                    level.getValue(),
                    Marshal.stringToAddress.marshal(file, SCOPE),
                    Marshal.stringToAddress.marshal(function, SCOPE),
                    line,
                    (Addressable) (object == null ? MemoryAddress.NULL : object.handle()),
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * The default logging handler used by GStreamer. Logging functions get called
 * whenever a macro like GST_DEBUG or similar is used. By default this function
 * is setup to output the message and additional info to stderr (or the log file
 * specified via the GST_DEBUG_FILE environment variable) as received via
 * {@code user_data}.
 * <p>
 * You can add other handlers by using gst_debug_add_log_function().
 * And you can remove this handler by calling
 * gst_debug_remove_log_function(gst_debug_log_default);
 * @param category category to log
 * @param level level of the message
 * @param file the file that emitted the message, usually the __FILE__ identifier
 * @param function the function that emitted the message
 * @param line the line from that the message was emitted, usually __LINE__
 * @param object the object this message relates to,
 *     or {@code null} if none
 * @param message the actual message
 */
public static void debugLogDefault(org.gstreamer.gst.DebugCategory category, org.gstreamer.gst.DebugLevel level, java.lang.String file, java.lang.String function, int line, @Nullable org.gtk.gobject.GObject object, org.gstreamer.gst.DebugMessage message) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_debug_log_default.invokeExact(
                    category.handle(),
                    level.getValue(),
                    Marshal.stringToAddress.marshal(file, SCOPE),
                    Marshal.stringToAddress.marshal(function, SCOPE),
                    line,
                    (Addressable) (object == null ? MemoryAddress.NULL : object.handle()),
                    message.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Returns the string representation for the specified debug log message
 * formatted in the same way as gst_debug_log_default() (the default handler),
 * without color. The purpose is to make it easy for custom log output
 * handlers to get a log output that is identical to what the default handler
 * would write out.
 * @param category category to log
 * @param level level of the message
 * @param file the file that emitted the message, usually the __FILE__ identifier
 * @param function the function that emitted the message
 * @param line the line from that the message was emitted, usually __LINE__
 * @param object the object this message relates to,
 *     or {@code null} if none
 * @param message the actual message
 */
public static java.lang.String debugLogGetLine(org.gstreamer.gst.DebugCategory category, org.gstreamer.gst.DebugLevel level, java.lang.String file, java.lang.String function, int line, @Nullable org.gtk.gobject.GObject object, org.gstreamer.gst.DebugMessage message) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_debug_log_get_line.invokeExact(
                    category.handle(),
                    level.getValue(),
                    Marshal.stringToAddress.marshal(file, SCOPE),
                    Marshal.stringToAddress.marshal(function, SCOPE),
                    line,
                    (Addressable) (object == null ? MemoryAddress.NULL : object.handle()),
                    message.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Logs the given message using the currently registered debugging handlers.
 * @param category category to log
 * @param level level of the message is in
 * @param file the file that emitted the message, usually the __FILE__ identifier
 * @param function the function that emitted the message
 * @param line the line from that the message was emitted, usually __LINE__
 * @param object the object this message relates to,
 *     or {@code null} if none
 * @param messageString a message string
 */
public static void debugLogLiteral(org.gstreamer.gst.DebugCategory category, org.gstreamer.gst.DebugLevel level, java.lang.String file, java.lang.String function, int line, @Nullable org.gtk.gobject.GObject object, java.lang.String messageString) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_debug_log_literal.invokeExact(
                    category.handle(),
                    level.getValue(),
                    Marshal.stringToAddress.marshal(file, SCOPE),
                    Marshal.stringToAddress.marshal(function, SCOPE),
                    line,
                    (Addressable) (object == null ? MemoryAddress.NULL : object.handle()),
                    Marshal.stringToAddress.marshal(messageString, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Logs the given message using the currently registered debugging handlers.
 * @param category category to log
 * @param level level of the message is in
 * @param file the file that emitted the message, usually the __FILE__ identifier
 * @param function the function that emitted the message
 * @param line the line from that the message was emitted, usually __LINE__
 * @param object the object this message relates to,
 *     or {@code null} if none
 * @param format a printf style format string
 * @param args optional arguments for the format
 */
public static void debugLogValist(org.gstreamer.gst.DebugCategory category, org.gstreamer.gst.DebugLevel level, java.lang.String file, java.lang.String function, int line, @Nullable org.gtk.gobject.GObject object, java.lang.String format, VaList args) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_debug_log_valist.invokeExact(
                    category.handle(),
                    level.getValue(),
                    Marshal.stringToAddress.marshal(file, SCOPE),
                    Marshal.stringToAddress.marshal(function, SCOPE),
                    line,
                    (Addressable) (object == null ? MemoryAddress.NULL : object.handle()),
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * If libunwind, glibc backtrace or DbgHelp are present
 * a stack trace is printed.
 */
public static void debugPrintStackTrace() {
    try {
        DowncallHandles.gst_debug_print_stack_trace.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Removes all registered instances of the given logging functions.
 * @param func the log function to remove, or {@code null} to
 *     remove the default log function
 * @return How many instances of the function were removed
 */
public static int debugRemoveLogFunction(@Nullable org.gstreamer.gst.LogFunction func) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_debug_remove_log_function.invokeExact((Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Removes all registered instances of log functions with the given user data.
 * @return How many instances of the function were removed
 */
public static int debugRemoveLogFunctionByData() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_debug_remove_log_function_by_data.invokeExact((Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Removes any previously added ring buffer logger with
 * gst_debug_add_ring_buffer_logger().
 */
public static void debugRemoveRingBufferLogger() {
    try {
        DowncallHandles.gst_debug_remove_ring_buffer_logger.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Fetches the current logs per thread from the ring buffer logger. See
 * gst_debug_add_ring_buffer_logger() for details.
 * @return NULL-terminated array of
 * strings with the debug output per thread
 */
public static PointerString debugRingBufferLoggerGetLogs() {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_debug_ring_buffer_logger_get_logs.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

/**
 * If activated, debugging messages are sent to the debugging
 * handlers.
 * It makes sense to deactivate it for speed issues.
 * <blockquote>
 *  This function is not threadsafe. It makes sense to only call it
 * </blockquote>during initialization.
 * @param active Whether to use debugging output or not
 */
public static void debugSetActive(boolean active) {
    try {
        DowncallHandles.gst_debug_set_active.invokeExact(Marshal.booleanToInteger.marshal(active, null).intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Changes the coloring mode for debug output.
 * <p>
 * This function may be called before gst_init().
 * @param mode The coloring mode for debug output. See {@code GstDebugColorMode}.
 */
public static void debugSetColorMode(org.gstreamer.gst.DebugColorMode mode) {
    try {
        DowncallHandles.gst_debug_set_color_mode.invokeExact(mode.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Changes the coloring mode for debug output.
 * <p>
 * This function may be called before gst_init().
 * @param mode The coloring mode for debug output. One of the following:
 * "on", "auto", "off", "disable", "unix".
 */
public static void debugSetColorModeFromString(java.lang.String mode) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_debug_set_color_mode_from_string.invokeExact(Marshal.stringToAddress.marshal(mode, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Sets or unsets the use of coloured debugging output.
 * Same as gst_debug_set_color_mode () with the argument being
 * being GST_DEBUG_COLOR_MODE_ON or GST_DEBUG_COLOR_MODE_OFF.
 * <p>
 * This function may be called before gst_init().
 * @param colored Whether to use colored output or not
 */
public static void debugSetColored(boolean colored) {
    try {
        DowncallHandles.gst_debug_set_colored.invokeExact(Marshal.booleanToInteger.marshal(colored, null).intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Sets the default threshold to the given level and updates all categories to
 * use this threshold.
 * <p>
 * This function may be called before gst_init().
 * @param level level to set
 */
public static void debugSetDefaultThreshold(org.gstreamer.gst.DebugLevel level) {
    try {
        DowncallHandles.gst_debug_set_default_threshold.invokeExact(level.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Sets all categories which match the given glob style pattern to the given
 * level.
 * @param name name of the categories to set
 * @param level level to set them to
 */
public static void debugSetThresholdForName(java.lang.String name, org.gstreamer.gst.DebugLevel level) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_debug_set_threshold_for_name.invokeExact(
                    Marshal.stringToAddress.marshal(name, SCOPE),
                    level.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Sets the debug logging wanted in the same form as with the GST_DEBUG
 * environment variable. You can use wildcards such as '*', but note that
 * the order matters when you use wild cards, e.g. "foosrc:6,*src:3,*:2" sets
 * everything to log level 2.
 * @param list comma-separated list of "category:level" pairs to be used
 *     as debug logging levels
 * @param reset {@code true} to clear all previously-set debug levels before setting
 *     new thresholds
 * {@code false} if adding the threshold described by {@code list} to the one already set.
 */
public static void debugSetThresholdFromString(java.lang.String list, boolean reset) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_debug_set_threshold_from_string.invokeExact(
                    Marshal.stringToAddress.marshal(list, SCOPE),
                    Marshal.booleanToInteger.marshal(reset, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Resets all categories with the given name back to the default level.
 * @param name name of the categories to set
 */
public static void debugUnsetThresholdForName(java.lang.String name) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_debug_unset_threshold_for_name.invokeExact(Marshal.stringToAddress.marshal(name, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Clean up any resources created by GStreamer in gst_init().
 * <p>
 * It is normally not needed to call this function in a normal application
 * as the resources will automatically be freed when the program terminates.
 * This function is therefore mostly used by testsuites and other memory
 * profiling tools.
 * <p>
 * After this call GStreamer (including this method) should not be used anymore.
 */
public static void deinit() {
    try {
        DowncallHandles.gst_deinit.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Registers a new {@link DynamicTypeFactory} in the registry
 * @param plugin The {@link Plugin} to register {@code dyn_type} for
 * @param type The {@link org.gtk.glib.Type} to register dynamically
 */
public static boolean dynamicTypeRegister(org.gstreamer.gst.Plugin plugin, org.gtk.glib.Type type) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_dynamic_type_register.invokeExact(
                plugin.handle(),
                type.getValue().longValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Get a string describing the error message in the current locale.
 * @param domain the GStreamer error domain this error belongs to.
 * @param code the error code belonging to the domain.
 * @return a newly allocated string describing
 *     the error message (in UTF-8 encoding)
 */
public static java.lang.String errorGetMessage(org.gtk.glib.Quark domain, int code) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_error_get_message.invokeExact(
                domain.getValue().intValue(),
                code);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Gets the {@link EventTypeFlags} associated with {@code type}.
 * @param type a {@link EventType}
 * @return a {@link EventTypeFlags}.
 */
public static org.gstreamer.gst.EventTypeFlags eventTypeGetFlags(org.gstreamer.gst.EventType type) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_event_type_get_flags.invokeExact(type.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gstreamer.gst.EventTypeFlags(RESULT);
}

/**
 * Get a printable name for the given event type. Do not modify or free.
 * @param type the event type
 * @return a reference to the static name of the event.
 */
public static java.lang.String eventTypeGetName(org.gstreamer.gst.EventType type) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_event_type_get_name.invokeExact(type.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Get the unique quark for the given event type.
 * @param type the event type
 * @return the quark associated with the event type
 */
public static org.gtk.glib.Quark eventTypeToQuark(org.gstreamer.gst.EventType type) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_event_type_to_quark.invokeExact(type.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Similar to g_filename_to_uri(), but attempts to handle relative file paths
 * as well. Before converting {@code filename} into an URI, it will be prefixed by
 * the current working directory if it is a relative path, and then the path
 * will be canonicalised so that it doesn't contain any './' or '../' segments.
 * <p>
 * On Windows {@code filename} should be in UTF-8 encoding.
 * @param filename absolute or relative file name path
 * @return newly-allocated URI string, or NULL on error. The caller must
 *   free the URI string with g_free() when no longer needed.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static java.lang.String filenameToUri(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_filename_to_uri.invokeExact(Marshal.stringToAddress.marshal(filename, SCOPE),(Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Gets a string representing the given flow return.
 * @param ret a {@link FlowReturn} to get the name of.
 * @return a static string with the name of the flow return.
 */
public static java.lang.String flowGetName(org.gstreamer.gst.FlowReturn ret) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_flow_get_name.invokeExact(ret.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Get the unique quark for the given GstFlowReturn.
 * @param ret a {@link FlowReturn} to get the quark of.
 * @return the quark associated with the flow return or 0 if an
 * invalid return was specified.
 */
public static org.gtk.glib.Quark flowToQuark(org.gstreamer.gst.FlowReturn ret) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_flow_to_quark.invokeExact(ret.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Return the format registered with the given nick.
 * @param nick The nick of the format
 * @return The format with {@code nick} or GST_FORMAT_UNDEFINED
 * if the format was not registered.
 */
public static org.gstreamer.gst.Format formatGetByNick(java.lang.String nick) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_format_get_by_nick.invokeExact(Marshal.stringToAddress.marshal(nick, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Format.of(RESULT);
    }
}

/**
 * Get details about the given format.
 * @param format The format to get details of
 * @return The {@link FormatDefinition} for {@code format} or {@code null}
 * on failure.
 * <p>
 * MT safe.
 */
public static @Nullable org.gstreamer.gst.FormatDefinition formatGetDetails(org.gstreamer.gst.Format format) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_format_get_details.invokeExact(format.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.FormatDefinition.fromAddress.marshal(RESULT, null);
}

/**
 * Get a printable name for the given format. Do not modify or free.
 * @param format a {@link Format}
 * @return a reference to the static name of the format
 * or {@code null} if the format is unknown.
 */
public static @Nullable java.lang.String formatGetName(org.gstreamer.gst.Format format) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_format_get_name.invokeExact(format.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Iterate all the registered formats. The format definition is read
 * only.
 * @return a GstIterator of {@link FormatDefinition}.
 */
public static org.gstreamer.gst.Iterator formatIterateDefinitions() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_format_iterate_definitions.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Create a new GstFormat based on the nick or return an
 * already registered format with that nick.
 * @param nick The nick of the new format
 * @param description The description of the new format
 * @return A new GstFormat or an already registered format
 * with the same nick.
 * <p>
 * MT safe.
 */
public static org.gstreamer.gst.Format formatRegister(java.lang.String nick, java.lang.String description) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_format_register.invokeExact(
                    Marshal.stringToAddress.marshal(nick, SCOPE),
                    Marshal.stringToAddress.marshal(description, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Format.of(RESULT);
    }
}

/**
 * Get the unique quark for the given format.
 * @param format a {@link Format}
 * @return the quark associated with the format or 0 if the format
 * is unknown.
 */
public static org.gtk.glib.Quark formatToQuark(org.gstreamer.gst.Format format) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_format_to_quark.invokeExact(format.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * See if the given format is inside the format array.
 * @param formats The format array to search
 * @param format the format to find
 * @return {@code true} if the format is found inside the array
 */
public static boolean formatsContains(org.gstreamer.gst.Format[] formats, org.gstreamer.gst.Format format) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_formats_contains.invokeExact(
                    Interop.allocateNativeArray(Enumeration.getValues(formats), false, SCOPE),
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * This helper is mostly helpful for plugins that need to
 * inspect the folder of the main executable to determine
 * their set of features.
 * <p>
 * When a plugin is initialized from the gst-plugin-scanner
 * external process, the returned path will be the same as from the
 * parent process.
 * @return The path of the executable that
 *   initialized GStreamer, or {@code null} if it could not be determined.
 */
public static @Nullable java.lang.String getMainExecutablePath() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_get_main_executable_path.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Allocates, fills and returns a 0-terminated string from the printf style
 * {@code format} string and corresponding arguments.
 * <p>
 * See gst_info_vasprintf() for when this function is required.
 * <p>
 * Free with g_free().
 * @param format a printf style format string
 * @param varargs the printf arguments for {@code format}
 * @return a newly allocated null terminated string or {@code null} on any error
 */
public static @Nullable java.lang.String infoStrdupPrintf(java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_info_strdup_printf.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Allocates, fills and returns a null terminated string from the printf style
 * {@code format} string and {@code args}.
 * <p>
 * See gst_info_vasprintf() for when this function is required.
 * <p>
 * Free with g_free().
 * @param format a printf style format string
 * @param args the va_list of printf arguments for {@code format}
 * @return a newly allocated null terminated string or {@code null} on any error
 */
public static @Nullable java.lang.String infoStrdupVprintf(java.lang.String format, VaList args) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_info_strdup_vprintf.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Allocates and fills a string large enough (including the terminating null
 * byte) to hold the specified printf style {@code format} and {@code args}.
 * <p>
 * This function deals with the GStreamer specific printf specifiers
 * {@code GST_PTR_FORMAT} and {@code GST_SEGMENT_FORMAT}.  If you do not have these specifiers
 * in your {@code format} string, you do not need to use this function and can use
 * alternatives such as g_vasprintf().
 * <p>
 * Free {@code result} with g_free().
 * @param result the resulting string
 * @param format a printf style format string
 * @param args the va_list of printf arguments for {@code format}
 * @return the length of the string allocated into {@code result} or -1 on any error
 */
public static int infoVasprintf(Out<java.lang.String> result, java.lang.String format, VaList args) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment resultPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_info_vasprintf.invokeExact(
                    (Addressable) resultPOINTER.address(),
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                result.set(Marshal.addressToString.marshal(resultPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return RESULT;
    }
}

/**
 * Initializes the GStreamer library, setting up internal path lists,
 * registering built-in elements, and loading standard plugins.
 * <p>
 * Unless the plugin registry is disabled at compile time, the registry will be
 * loaded. By default this will also check if the registry cache needs to be
 * updated and rescan all plugins if needed. See gst_update_registry() for
 * details and section
 * &lt;link linkend="gst-running"&gt;Running GStreamer Applications&lt;/link&gt;
 * for how to disable automatic registry updates.
 * <p>
 * WARNING: This function will terminate your program if it was unable to
 * initialize GStreamer for some reason. If you want your program to fall back,
 * use gst_init_check() instead.
 * <p>
 * WARNING: This function does not work in the same way as corresponding
 * functions in other glib-style libraries, such as gtk_init\\(\\). In
 * particular, unknown command line options cause this function to
 * abort program execution.
 * @param argc pointer to application's argc
 * @param argv pointer to application's argv
 */
public static void init(Out<Integer> argc, @Nullable Out<java.lang.String[]> argv) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment argcPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment argvPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_init.invokeExact(
                    (Addressable) (argc == null ? MemoryAddress.NULL : (Addressable) argcPOINTER.address()),
                    (Addressable) (argv == null ? MemoryAddress.NULL : (Addressable) argvPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (argc != null) argc.set(argcPOINTER.get(Interop.valueLayout.C_INT, 0));
        java.lang.String[] argvARRAY = new java.lang.String[argc.get().intValue()];
        for (int I = 0; I < argc.get().intValue(); I++) {
            var OBJ = argvPOINTER.get(Interop.valueLayout.ADDRESS, I);
            argvARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
            }
        argv.set(argvARRAY);
    }
}

/**
 * Initializes the GStreamer library, setting up internal path lists,
 * registering built-in elements, and loading standard plugins.
 * <p>
 * This function will return {@code false} if GStreamer could not be initialized
 * for some reason.  If you want your program to fail fatally,
 * use gst_init() instead.
 * @param argc pointer to application's argc
 * @param argv pointer to application's argv
 * @return {@code true} if GStreamer could be initialized.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean initCheck(Out<Integer> argc, @Nullable Out<java.lang.String[]> argv) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment argcPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment argvPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_init_check.invokeExact(
                    (Addressable) (argc == null ? MemoryAddress.NULL : (Addressable) argcPOINTER.address()),
                    (Addressable) (argv == null ? MemoryAddress.NULL : (Addressable) argvPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (argc != null) argc.set(argcPOINTER.get(Interop.valueLayout.C_INT, 0));
        java.lang.String[] argvARRAY = new java.lang.String[argc.get().intValue()];
        for (int I = 0; I < argc.get().intValue(); I++) {
            var OBJ = argvPOINTER.get(Interop.valueLayout.ADDRESS, I);
            argvARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
            }
        argv.set(argvARRAY);
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Returns a {@link org.gtk.glib.OptionGroup} with GStreamer's argument specifications. The
 * group is set up to use standard GOption callbacks, so when using this
 * group in combination with GOption parsing methods, all argument parsing
 * and initialization is automated.
 * <p>
 * This function is useful if you want to integrate GStreamer with other
 * libraries that use GOption (see g_option_context_add_group() ).
 * <p>
 * If you use this function, you should make sure you initialise the GLib
 * threading system as one of the very first things in your program
 * (see the example at the beginning of this section).
 * @return a pointer to GStreamer's option group.
 */
public static @Nullable org.gtk.glib.OptionGroup initGetOptionGroup() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_init_get_option_group.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gtk.glib.OptionGroup.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Checks if {@code obj} is a {@link CapsFeatures}
 * @return {@code true} if {@code obj} is a {@link CapsFeatures} {@code false} otherwise
 */
public static boolean isCapsFeatures(@Nullable java.lang.foreign.MemoryAddress obj) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_is_caps_features.invokeExact((Addressable) (obj == null ? MemoryAddress.NULL : (Addressable) obj));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Use this function to check if GStreamer has been initialized with gst_init()
 * or gst_init_check().
 * @return {@code true} if initialization has been done, {@code false} otherwise.
 */
public static boolean isInitialized() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_is_initialized.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

public static org.gtk.glib.Quark libraryErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_library_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Create a {@link Structure} to be used with {@code gst_element_message_full_with_details}.
 * {@code null} terminator required.
 * @param name Name of the first field to set
 * @param varargs variable arguments in the same form as {@link Structure}
 */
public static org.gstreamer.gst.Structure makeElementMessageDetails(java.lang.String name, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_make_element_message_details.invokeExact(
                    Marshal.stringToAddress.marshal(name, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Modifies a pointer to a {@link Message} to point to a different {@link Message}. The
 * modification is done atomically (so this is useful for ensuring thread safety
 * in some cases), and the reference counts are updated appropriately (the old
 * message is unreffed, the new one is reffed).
 * <p>
 * Either {@code new_message} or the {@link Message} pointed to by {@code old_message} may be {@code null}.
 * @param oldMessage pointer to a
 *     pointer to a {@link Message} to be replaced.
 * @param newMessage pointer to a {@link Message} that will
 *     replace the message pointed to by {@code old_message}.
 * @return {@code true} if {@code new_message} was different from {@code old_message}
 */
public static boolean messageReplace(@Nullable Out<org.gstreamer.gst.Message> oldMessage, @Nullable org.gstreamer.gst.Message newMessage) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment oldMessagePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_message_replace.invokeExact(
                    (Addressable) (oldMessage == null ? MemoryAddress.NULL : (Addressable) oldMessagePOINTER.address()),
                    (Addressable) (newMessage == null ? MemoryAddress.NULL : newMessage.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (oldMessage != null) oldMessage.set(org.gstreamer.gst.Message.fromAddress.marshal(oldMessagePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Get a printable name for the given message type. Do not modify or free.
 * @param type the message type
 * @return a reference to the static name of the message.
 */
public static java.lang.String messageTypeGetName(org.gstreamer.gst.MessageType type) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_message_type_get_name.invokeExact(type.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Get the unique quark for the given message type.
 * @param type the message type
 * @return the quark associated with the message type
 */
public static org.gtk.glib.Quark messageTypeToQuark(org.gstreamer.gst.MessageType type) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_message_type_to_quark.invokeExact(type.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

public static PointerString metaApiTypeGetTags(org.gtk.glib.Type api) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_meta_api_type_get_tags.invokeExact(api.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

/**
 * Check if {@code api} was registered with {@code tag}.
 * @param api an API
 * @param tag the tag to check
 * @return {@code true} if {@code api} was registered with {@code tag}.
 */
public static boolean metaApiTypeHasTag(org.gtk.glib.Type api, org.gtk.glib.Quark tag) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_meta_api_type_has_tag.invokeExact(
                api.getValue().longValue(),
                tag.getValue().intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Register and return a GType for the {@code api} and associate it with
 * {@code tags}.
 * @param api an API to register
 * @param tags tags for {@code api}
 * @return a unique GType for {@code api}.
 */
public static org.gtk.glib.Type metaApiTypeRegister(java.lang.String api, java.lang.String[] tags) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_meta_api_type_register.invokeExact(
                    Marshal.stringToAddress.marshal(api, SCOPE),
                    Interop.allocateNativeArray(tags, false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
}

/**
 * Lookup a previously registered meta info structure by its implementation name
 * {@code impl}.
 * @param impl the name
 * @return a {@link MetaInfo} with {@code impl}, or
 * {@code null} when no such metainfo exists.
 */
public static @Nullable org.gstreamer.gst.MetaInfo metaGetInfo(java.lang.String impl) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_meta_get_info.invokeExact(Marshal.stringToAddress.marshal(impl, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
    }
}

/**
 * Register a new {@link Meta} implementation.
 * <p>
 * The same {@code info} can be retrieved later with gst_meta_get_info() by using
 * {@code impl} as the key.
 * @param api the type of the {@link Meta} API
 * @param impl the name of the {@link Meta} implementation
 * @param size the size of the {@link Meta} structure
 * @param initFunc a {@link MetaInitFunction}
 * @param freeFunc a {@link MetaFreeFunction}
 * @param transformFunc a {@link MetaTransformFunction}
 * @return a {@link MetaInfo} that can be used to
 * access metadata.
 */
public static org.gstreamer.gst.MetaInfo metaRegister(org.gtk.glib.Type api, java.lang.String impl, long size, org.gstreamer.gst.MetaInitFunction initFunc, org.gstreamer.gst.MetaFreeFunction freeFunc, org.gstreamer.gst.MetaTransformFunction transformFunc) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_meta_register.invokeExact(
                    api.getValue().longValue(),
                    Marshal.stringToAddress.marshal(impl, SCOPE),
                    size,
                    (Addressable) initFunc.toCallback(),
                    (Addressable) freeFunc.toCallback(),
                    (Addressable) transformFunc.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
    }
}

/**
 * Register a new custom {@link Meta} implementation, backed by an opaque
 * structure holding a {@link Structure}.
 * <p>
 * The registered info can be retrieved later with gst_meta_get_info() by using
 * {@code name} as the key.
 * <p>
 * The backing {@link Structure} can be retrieved with
 * gst_custom_meta_get_structure(), its mutability is conditioned by the
 * writability of the buffer the meta is attached to.
 * <p>
 * When {@code transform_func} is {@code null}, the meta and its backing {@link Structure}
 * will always be copied when the transform operation is copy, other operations
 * are discarded, copy regions are ignored.
 * @param name the name of the {@link Meta} implementation
 * @param tags tags for {@code api}
 * @param transformFunc a {@link MetaTransformFunction}
 * @param destroyData {@link org.gtk.glib.DestroyNotify} for user_data
 * @return a {@link MetaInfo} that can be used to
 * access metadata.
 */
public static org.gstreamer.gst.MetaInfo metaRegisterCustom(java.lang.String name, java.lang.String[] tags, @Nullable org.gstreamer.gst.CustomMetaTransformFunction transformFunc, org.gtk.glib.DestroyNotify destroyData) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_meta_register_custom.invokeExact(
                    Marshal.stringToAddress.marshal(name, SCOPE),
                    Interop.allocateNativeArray(tags, false, SCOPE),
                    (Addressable) (transformFunc == null ? MemoryAddress.NULL : (Addressable) transformFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroyData.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
    }
}

/**
 * Atomically modifies a pointer to point to a new mini-object.
 * The reference count of {@code olddata} is decreased and the reference count of
 * {@code newdata} is increased.
 * <p>
 * Either {@code newdata} and the value pointed to by {@code olddata} may be {@code null}.
 * @param olddata pointer to a pointer to a
 *     mini-object to be replaced
 * @param newdata pointer to new mini-object
 * @return {@code true} if {@code newdata} was different from {@code olddata}
 */
public static boolean miniObjectReplace(@Nullable Out<org.gstreamer.gst.MiniObject> olddata, @Nullable org.gstreamer.gst.MiniObject newdata) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment olddataPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mini_object_replace.invokeExact(
                    (Addressable) (olddata == null ? MemoryAddress.NULL : (Addressable) olddataPOINTER.address()),
                    (Addressable) (newdata == null ? MemoryAddress.NULL : newdata.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (olddata != null) olddata.set(org.gstreamer.gst.MiniObject.fromAddress.marshal(olddataPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Replace the current {@link MiniObject} pointer to by {@code olddata} with {@code null} and
 * return the old value.
 * @param olddata pointer to a pointer to a mini-object to
 *     be stolen
 * @return the {@link MiniObject} at {@code oldata}
 */
public static @Nullable org.gstreamer.gst.MiniObject miniObjectSteal(Out<org.gstreamer.gst.MiniObject> olddata) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment olddataPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mini_object_steal.invokeExact((Addressable) olddataPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                olddata.set(org.gstreamer.gst.MiniObject.fromAddress.marshal(olddataPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        var OBJECT = org.gstreamer.gst.MiniObject.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Modifies a pointer to point to a new mini-object. The modification
 * is done atomically. This version is similar to gst_mini_object_replace()
 * except that it does not increase the refcount of {@code newdata} and thus
 * takes ownership of {@code newdata}.
 * <p>
 * Either {@code newdata} and the value pointed to by {@code olddata} may be {@code null}.
 * @param olddata pointer to a pointer to a mini-object to
 *     be replaced
 * @param newdata pointer to new mini-object
 * @return {@code true} if {@code newdata} was different from {@code olddata}
 */
public static boolean miniObjectTake(Out<org.gstreamer.gst.MiniObject> olddata, org.gstreamer.gst.MiniObject newdata) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment olddataPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mini_object_take.invokeExact(
                    (Addressable) olddataPOINTER.address(),
                    newdata.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                olddata.set(org.gstreamer.gst.MiniObject.fromAddress.marshal(olddataPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Return the name of a pad mode, for use in debug messages mostly.
 * @param mode the pad mode
 * @return short mnemonic for pad mode {@code mode}
 */
public static java.lang.String padModeGetName(org.gstreamer.gst.PadMode mode) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_pad_mode_get_name.invokeExact(mode.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * This function creates a GstArray GParamSpec for use by objects/elements
 * that want to expose properties of GstArray type. This function is
 * typically * used in connection with g_object_class_install_property() in a
 * GObjects's instance_init function.
 * @param name canonical name of the property specified
 * @param nick nick name for the property specified
 * @param blurb description of the property specified
 * @param elementSpec GParamSpec of the array
 * @param flags flags for the property specified
 * @return a newly created parameter specification
 */
public static org.gtk.gobject.ParamSpec paramSpecArray(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.gobject.ParamSpec elementSpec, org.gtk.gobject.ParamFlags flags) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_param_spec_array.invokeExact(
                    Marshal.stringToAddress.marshal(name, SCOPE),
                    Marshal.stringToAddress.marshal(nick, SCOPE),
                    Marshal.stringToAddress.marshal(blurb, SCOPE),
                    elementSpec.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gobject.ParamSpec) Interop.register(RESULT, org.gtk.gobject.ParamSpec.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * This function creates a fraction GParamSpec for use by objects/elements
 * that want to expose properties of fraction type. This function is typically
 * used in connection with g_object_class_install_property() in a GObjects's
 * instance_init function.
 * @param name canonical name of the property specified
 * @param nick nick name for the property specified
 * @param blurb description of the property specified
 * @param minNum minimum value (fraction numerator)
 * @param minDenom minimum value (fraction denominator)
 * @param maxNum maximum value (fraction numerator)
 * @param maxDenom maximum value (fraction denominator)
 * @param defaultNum default value (fraction numerator)
 * @param defaultDenom default value (fraction denominator)
 * @param flags flags for the property specified
 * @return a newly created parameter specification
 */
public static @Nullable org.gtk.gobject.ParamSpec paramSpecFraction(java.lang.String name, java.lang.String nick, java.lang.String blurb, int minNum, int minDenom, int maxNum, int maxDenom, int defaultNum, int defaultDenom, org.gtk.gobject.ParamFlags flags) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_param_spec_fraction.invokeExact(
                    Marshal.stringToAddress.marshal(name, SCOPE),
                    Marshal.stringToAddress.marshal(nick, SCOPE),
                    Marshal.stringToAddress.marshal(blurb, SCOPE),
                    minNum,
                    minDenom,
                    maxNum,
                    maxDenom,
                    defaultNum,
                    defaultDenom,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gobject.ParamSpec) Interop.register(RESULT, org.gtk.gobject.ParamSpec.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

public static org.gtk.glib.Type parentBufferMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_parent_buffer_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

/**
 * Gets the global {@link MetaInfo} describing  the {@link ParentBufferMeta} meta.
 * @return The {@link MetaInfo}
 */
public static org.gstreamer.gst.MetaInfo parentBufferMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_parent_buffer_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}

/**
 * This is a convenience wrapper around gst_parse_launch() to create a
 * {@link Bin} from a gst-launch-style pipeline description. See
 * gst_parse_launch() and the gst-launch man page for details about the
 * syntax. Ghost pads on the bin for unlinked source or sink pads
 * within the bin can automatically be created (but only a maximum of
 * one ghost pad for each direction will be created; if you expect
 * multiple unlinked source pads or multiple unlinked sink pads
 * and want them all ghosted, you will have to create the ghost pads
 * yourself).
 * @param binDescription command line describing the bin
 * @param ghostUnlinkedPads whether to automatically create ghost pads
 *     for unlinked source or sink pads within the bin
 * @return a
 *   newly-created bin, or {@code null} if an error occurred.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static org.gstreamer.gst.Bin parseBinFromDescription(java.lang.String binDescription, boolean ghostUnlinkedPads) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_parse_bin_from_description.invokeExact(
                    Marshal.stringToAddress.marshal(binDescription, SCOPE),
                    Marshal.booleanToInteger.marshal(ghostUnlinkedPads, null).intValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (org.gstreamer.gst.Bin) Interop.register(RESULT, org.gstreamer.gst.Bin.fromAddress).marshal(RESULT, null);
    }
}

/**
 * This is a convenience wrapper around gst_parse_launch() to create a
 * {@link Bin} from a gst-launch-style pipeline description. See
 * gst_parse_launch() and the gst-launch man page for details about the
 * syntax. Ghost pads on the bin for unlinked source or sink pads
 * within the bin can automatically be created (but only a maximum of
 * one ghost pad for each direction will be created; if you expect
 * multiple unlinked source pads or multiple unlinked sink pads
 * and want them all ghosted, you will have to create the ghost pads
 * yourself).
 * @param binDescription command line describing the bin
 * @param ghostUnlinkedPads whether to automatically create ghost pads
 *     for unlinked source or sink pads within the bin
 * @param context a parse context allocated with
 *     gst_parse_context_new(), or {@code null}
 * @param flags parsing options, or {@code GST_PARSE_FLAG_NONE}
 * @return a newly-created
 *   element, which is guaranteed to be a bin unless
 *   {@code GST_PARSE_FLAG_NO_SINGLE_ELEMENT_BINS} was passed, or {@code null} if an error
 *   occurred.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static org.gstreamer.gst.Element parseBinFromDescriptionFull(java.lang.String binDescription, boolean ghostUnlinkedPads, @Nullable org.gstreamer.gst.ParseContext context, org.gstreamer.gst.ParseFlags flags) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_parse_bin_from_description_full.invokeExact(
                    Marshal.stringToAddress.marshal(binDescription, SCOPE),
                    Marshal.booleanToInteger.marshal(ghostUnlinkedPads, null).intValue(),
                    (Addressable) (context == null ? MemoryAddress.NULL : context.handle()),
                    flags.getValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (org.gstreamer.gst.Element) Interop.register(RESULT, org.gstreamer.gst.Element.fromAddress).marshal(RESULT, null);
    }
}

/**
 * Get the error quark used by the parsing subsystem.
 * @return the quark of the parse errors.
 */
public static org.gtk.glib.Quark parseErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_parse_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Create a new pipeline based on command line syntax.
 * Please note that you might get a return value that is not {@code null} even though
 * the {@code error} is set. In this case there was a recoverable parsing error and you
 * can try to play the pipeline.
 * <p>
 * To create a sub-pipeline (bin) for embedding into an existing pipeline
 * use gst_parse_bin_from_description().
 * @param pipelineDescription the command line describing the pipeline
 * @return a new element on success, {@code null} on
 *   failure. If more than one toplevel element is specified by the
 *   {@code pipeline_description}, all elements are put into a {@link Pipeline}, which
 *   than is returned.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static org.gstreamer.gst.Element parseLaunch(java.lang.String pipelineDescription) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_parse_launch.invokeExact(Marshal.stringToAddress.marshal(pipelineDescription, SCOPE),(Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (org.gstreamer.gst.Element) Interop.register(RESULT, org.gstreamer.gst.Element.fromAddress).marshal(RESULT, null);
    }
}

/**
 * Create a new pipeline based on command line syntax.
 * Please note that you might get a return value that is not {@code null} even though
 * the {@code error} is set. In this case there was a recoverable parsing error and you
 * can try to play the pipeline.
 * <p>
 * To create a sub-pipeline (bin) for embedding into an existing pipeline
 * use gst_parse_bin_from_description_full().
 * @param pipelineDescription the command line describing the pipeline
 * @param context a parse context allocated with
 *      gst_parse_context_new(), or {@code null}
 * @param flags parsing options, or {@code GST_PARSE_FLAG_NONE}
 * @return a new element on success, {@code null} on
 *    failure. If more than one toplevel element is specified by the
 *    {@code pipeline_description}, all elements are put into a {@link Pipeline}, which
 *    then is returned (unless the GST_PARSE_FLAG_PLACE_IN_BIN flag is set, in
 *    which case they are put in a {@link Bin} instead).
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static org.gstreamer.gst.Element parseLaunchFull(java.lang.String pipelineDescription, @Nullable org.gstreamer.gst.ParseContext context, org.gstreamer.gst.ParseFlags flags) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_parse_launch_full.invokeExact(
                    Marshal.stringToAddress.marshal(pipelineDescription, SCOPE),
                    (Addressable) (context == null ? MemoryAddress.NULL : context.handle()),
                    flags.getValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (org.gstreamer.gst.Element) Interop.register(RESULT, org.gstreamer.gst.Element.fromAddress).marshal(RESULT, null);
    }
}

/**
 * Create a new element based on command line syntax.
 * {@code error} will contain an error message if an erroneous pipeline is specified.
 * An error does not mean that the pipeline could not be constructed.
 * @param argv null-terminated array of arguments
 * @return a new element on success and {@code null}
 * on failure.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static org.gstreamer.gst.Element parseLaunchv(java.lang.String[] argv) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_parse_launchv.invokeExact(Interop.allocateNativeArray(argv, false, SCOPE),(Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (org.gstreamer.gst.Element) Interop.register(RESULT, org.gstreamer.gst.Element.fromAddress).marshal(RESULT, null);
    }
}

/**
 * Create a new element based on command line syntax.
 * {@code error} will contain an error message if an erroneous pipeline is specified.
 * An error does not mean that the pipeline could not be constructed.
 * @param argv null-terminated array of arguments
 * @param context a parse context allocated with
 *     gst_parse_context_new(), or {@code null}
 * @param flags parsing options, or {@code GST_PARSE_FLAG_NONE}
 * @return a new element on success; on
 *   failure, either {@code null} or a partially-constructed bin or element will be
 *   returned and {@code error} will be set (unless you passed
 *   {@code GST_PARSE_FLAG_FATAL_ERRORS} in {@code flags}, then {@code null} will always be returned
 *   on failure)
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static org.gstreamer.gst.Element parseLaunchvFull(java.lang.String[] argv, @Nullable org.gstreamer.gst.ParseContext context, org.gstreamer.gst.ParseFlags flags) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_parse_launchv_full.invokeExact(
                    Interop.allocateNativeArray(argv, false, SCOPE),
                    (Addressable) (context == null ? MemoryAddress.NULL : context.handle()),
                    flags.getValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (org.gstreamer.gst.Element) Interop.register(RESULT, org.gstreamer.gst.Element.fromAddress).marshal(RESULT, null);
    }
}

/**
 * Get the error quark.
 * @return The error quark used in GError messages
 */
public static org.gtk.glib.Quark pluginErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_plugin_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Create a new file descriptor set. If {@code controllable}, it
 * is possible to restart or flush a call to gst_poll_wait() with
 * gst_poll_restart() and gst_poll_set_flushing() respectively.
 * <p>
 * Free-function: gst_poll_free
 * @param controllable whether it should be possible to control a wait.
 * @return a new {@link Poll}, or {@code null} in
 *     case of an error.  Free with gst_poll_free().
 */
public static @Nullable org.gstreamer.gst.Poll pollNew(boolean controllable) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_poll_new.invokeExact(Marshal.booleanToInteger.marshal(controllable, null).intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Poll.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Create a new poll object that can be used for scheduling cancellable
 * timeouts.
 * <p>
 * A timeout is performed with gst_poll_wait(). Multiple timeouts can be
 * performed from different threads.
 * <p>
 * Free-function: gst_poll_free
 * @return a new {@link Poll}, or {@code null} in
 *     case of an error.  Free with gst_poll_free().
 */
public static @Nullable org.gstreamer.gst.Poll pollNewTimer() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_poll_new_timer.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Poll.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Gets the directory for application specific presets if set by the
 * application.
 * @return the directory or {@code null}, don't free or modify
 * the string
 */
public static @Nullable java.lang.String presetGetAppDir() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_preset_get_app_dir.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Sets an extra directory as an absolute path that should be considered when
 * looking for presets. Any presets in the application dir will shadow the
 * system presets.
 * @param appDir the application specific preset dir
 * @return {@code true} for success, {@code false} if the dir already has been set
 */
public static boolean presetSetAppDir(java.lang.String appDir) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_preset_set_app_dir.invokeExact(Marshal.stringToAddress.marshal(appDir, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Outputs a formatted message via the GLib print handler. The default print
 * handler simply outputs the message to stdout.
 * <p>
 * This function will not append a new-line character at the end, unlike
 * gst_println() which will.
 * <p>
 * All strings must be in ASCII or UTF-8 encoding.
 * <p>
 * This function differs from g_print() in that it supports all the additional
 * printf specifiers that are supported by GStreamer's debug logging system,
 * such as {@code GST_PTR_FORMAT} and {@code GST_SEGMENT_FORMAT}.
 * <p>
 * This function is primarily for printing debug output.
 * @param format a printf style format string
 * @param varargs the printf arguments for {@code format}
 */
public static void print(java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_print.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Outputs a formatted message via the GLib error message handler. The default
 * handler simply outputs the message to stderr.
 * <p>
 * This function will not append a new-line character at the end, unlike
 * gst_printerrln() which will.
 * <p>
 * All strings must be in ASCII or UTF-8 encoding.
 * <p>
 * This function differs from g_printerr() in that it supports the additional
 * printf specifiers that are supported by GStreamer's debug logging system,
 * such as {@code GST_PTR_FORMAT} and {@code GST_SEGMENT_FORMAT}.
 * <p>
 * This function is primarily for printing debug output.
 * @param format a printf style format string
 * @param varargs the printf arguments for {@code format}
 */
public static void printerr(java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_printerr.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Outputs a formatted message via the GLib error message handler. The default
 * handler simply outputs the message to stderr.
 * <p>
 * This function will append a new-line character at the end, unlike
 * gst_printerr() which will not.
 * <p>
 * All strings must be in ASCII or UTF-8 encoding.
 * <p>
 * This function differs from g_printerr() in that it supports the additional
 * printf specifiers that are supported by GStreamer's debug logging system,
 * such as {@code GST_PTR_FORMAT} and {@code GST_SEGMENT_FORMAT}.
 * <p>
 * This function is primarily for printing debug output.
 * @param format a printf style format string
 * @param varargs the printf arguments for {@code format}
 */
public static void printerrln(java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_printerrln.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Outputs a formatted message via the GLib print handler. The default print
 * handler simply outputs the message to stdout.
 * <p>
 * This function will append a new-line character at the end, unlike
 * gst_print() which will not.
 * <p>
 * All strings must be in ASCII or UTF-8 encoding.
 * <p>
 * This function differs from g_print() in that it supports all the additional
 * printf specifiers that are supported by GStreamer's debug logging system,
 * such as {@code GST_PTR_FORMAT} and {@code GST_SEGMENT_FORMAT}.
 * <p>
 * This function is primarily for printing debug output.
 * @param format a printf style format string
 * @param varargs the printf arguments for {@code format}
 */
public static void println(java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_println.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Iterates the supplied list of UUIDs and checks the GstRegistry for
 * all the decryptors supporting one of the supplied UUIDs.
 * @param systemIdentifiers A null terminated array of strings that contains the UUID values of each
 * protection system that is to be checked.
 * @return A null terminated array containing all
 * the {@code system_identifiers} supported by the set of available decryptors, or
 * {@code null} if no matches were found.
 */
public static @Nullable PointerString protectionFilterSystemsByAvailableDecryptors(java.lang.String[] systemIdentifiers) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_protection_filter_systems_by_available_decryptors.invokeExact(Interop.allocateNativeArray(systemIdentifiers, false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

public static org.gtk.glib.Type protectionMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_protection_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gstreamer.gst.MetaInfo protectionMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_protection_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}

/**
 * Iterates the supplied list of UUIDs and checks the GstRegistry for
 * an element that supports one of the supplied UUIDs. If more than one
 * element matches, the system ID of the highest ranked element is selected.
 * @param systemIdentifiers A null terminated array of strings
 * that contains the UUID values of each protection system that is to be
 * checked.
 * @return One of the strings from
 * {@code system_identifiers} that indicates the highest ranked element that
 * implements the protection system indicated by that system ID, or {@code null} if no
 * element has been found.
 */
public static @Nullable java.lang.String protectionSelectSystem(java.lang.String[] systemIdentifiers) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_protection_select_system.invokeExact(Interop.allocateNativeArray(systemIdentifiers, false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Gets the {@link QueryTypeFlags} associated with {@code type}.
 * @param type a {@link QueryType}
 * @return a {@link QueryTypeFlags}.
 */
public static org.gstreamer.gst.QueryTypeFlags queryTypeGetFlags(org.gstreamer.gst.QueryType type) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_query_type_get_flags.invokeExact(type.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gstreamer.gst.QueryTypeFlags(RESULT);
}

/**
 * Get a printable name for the given query type. Do not modify or free.
 * @param type the query type
 * @return a reference to the static name of the query.
 */
public static java.lang.String queryTypeGetName(org.gstreamer.gst.QueryType type) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_query_type_get_name.invokeExact(type.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Get the unique quark for the given query type.
 * @param type the query type
 * @return the quark associated with the query type
 */
public static org.gtk.glib.Quark queryTypeToQuark(org.gstreamer.gst.QueryType type) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_query_type_to_quark.invokeExact(type.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

public static org.gtk.glib.Type referenceTimestampMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_reference_timestamp_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

/**
 * Gets the global {@link MetaInfo} describing the {@link ReferenceTimestampMeta} meta.
 * @return The {@link MetaInfo}
 */
public static org.gstreamer.gst.MetaInfo referenceTimestampMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_reference_timestamp_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}

public static org.gtk.glib.Quark resourceErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_resource_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Some functions in the GStreamer core might install a custom SIGSEGV handler
 * to better catch and report errors to the application. Currently this feature
 * is enabled by default when loading plugins.
 * <p>
 * Applications might want to disable this behaviour with the
 * gst_segtrap_set_enabled() function. This is typically done if the application
 * wants to install its own handler without GStreamer interfering.
 * @return {@code true} if GStreamer is allowed to install a custom SIGSEGV handler.
 */
public static boolean segtrapIsEnabled() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_segtrap_is_enabled.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Applications might want to disable/enable the SIGSEGV handling of
 * the GStreamer core. See gst_segtrap_is_enabled() for more information.
 * @param enabled whether a custom SIGSEGV handler should be installed.
 */
public static void segtrapSetEnabled(boolean enabled) {
    try {
        DowncallHandles.gst_segtrap_set_enabled.invokeExact(Marshal.booleanToInteger.marshal(enabled, null).intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Gets a string representing the given state transition.
 * @param transition a {@link StateChange} to get the name of.
 * @return a string with the name of the state
 *    result.
 */
public static java.lang.String stateChangeGetName(org.gstreamer.gst.StateChange transition) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_state_change_get_name.invokeExact(transition.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

public static org.gtk.glib.Type staticCapsGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_static_caps_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gtk.glib.Type staticPadTemplateGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_static_pad_template_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gtk.glib.Quark streamErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_stream_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Get a descriptive string for a given {@link StreamType}
 * @param stype a {@link StreamType}
 * @return A string describing the stream type
 */
public static java.lang.String streamTypeGetName(org.gstreamer.gst.StreamType stype) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_stream_type_get_name.invokeExact(stype.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Atomically modifies a pointer to point to a new structure.
 * The {@link Structure} {@code oldstr_ptr} is pointing to is freed and
 * {@code newstr} is taken ownership over.
 * <p>
 * Either {@code newstr} and the value pointed to by {@code oldstr_ptr} may be {@code null}.
 * <p>
 * It is a programming error if both {@code newstr} and the value pointed to by
 * {@code oldstr_ptr} refer to the same, non-{@code null} structure.
 * @param oldstrPtr pointer to a place of
 *     a {@link Structure} to take
 * @param newstr a new {@link Structure}
 * @return {@code true} if {@code newstr} was different from {@code oldstr_ptr}
 */
public static boolean structureTake(@Nullable Out<org.gstreamer.gst.Structure> oldstrPtr, @Nullable org.gstreamer.gst.Structure newstr) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment oldstrPtrPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_take.invokeExact(
                    (Addressable) (oldstrPtr == null ? MemoryAddress.NULL : (Addressable) oldstrPtrPOINTER.address()),
                    (Addressable) (newstr == null ? MemoryAddress.NULL : newstr.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (oldstrPtr != null) oldstrPtr.set(org.gstreamer.gst.Structure.fromAddress.marshal(oldstrPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        newstr.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Checks if the given type is already registered.
 * @param tag name of the tag
 * @return {@code true} if the type is already registered
 */
public static boolean tagExists(java.lang.String tag) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_exists.invokeExact(Marshal.stringToAddress.marshal(tag, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Returns the human-readable description of this tag, You must not change or
 * free this string.
 * @param tag the tag
 * @return the human-readable description of this tag
 */
public static @Nullable java.lang.String tagGetDescription(java.lang.String tag) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_get_description.invokeExact(Marshal.stringToAddress.marshal(tag, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Gets the flag of {@code tag}.
 * @param tag the tag
 * @return the flag of this tag.
 */
public static org.gstreamer.gst.TagFlag tagGetFlag(java.lang.String tag) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_get_flag.invokeExact(Marshal.stringToAddress.marshal(tag, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.TagFlag.of(RESULT);
    }
}

/**
 * Returns the human-readable name of this tag, You must not change or free
 * this string.
 * @param tag the tag
 * @return the human-readable name of this tag
 */
public static @Nullable java.lang.String tagGetNick(java.lang.String tag) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_get_nick.invokeExact(Marshal.stringToAddress.marshal(tag, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Gets the {@link org.gtk.glib.Type} used for this tag.
 * @param tag the tag
 * @return the {@link org.gtk.glib.Type} of this tag
 */
public static org.gtk.glib.Type tagGetType(java.lang.String tag) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_tag_get_type.invokeExact(Marshal.stringToAddress.marshal(tag, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
}

/**
 * Checks if the given tag is fixed. A fixed tag can only contain one value.
 * Unfixed tags can contain lists of values.
 * @param tag tag to check
 * @return {@code true}, if the given tag is fixed.
 */
public static boolean tagIsFixed(java.lang.String tag) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_is_fixed.invokeExact(Marshal.stringToAddress.marshal(tag, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Copies the contents for the given tag into the value,
 * merging multiple values into one if multiple values are associated
 * with the tag.
 * You must g_value_unset() the value after use.
 * @param dest uninitialized {@link org.gtk.gobject.Value} to copy into
 * @param list list to get the tag from
 * @param tag tag to read out
 * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
 *          given list.
 */
public static boolean tagListCopyValue(org.gtk.gobject.Value dest, org.gstreamer.gst.TagList list, java.lang.String tag) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_copy_value.invokeExact(
                    dest.handle(),
                    list.handle(),
                    Marshal.stringToAddress.marshal(tag, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * This is a convenience function for the func argument of gst_tag_register().
 * It concatenates all given strings using a comma. The tag must be registered
 * as a G_TYPE_STRING or this function will fail.
 * @param dest uninitialized GValue to store result in
 * @param src GValue to copy from
 */
public static void tagMergeStringsWithComma(org.gtk.gobject.Value dest, org.gtk.gobject.Value src) {
    try {
        DowncallHandles.gst_tag_merge_strings_with_comma.invokeExact(
                dest.handle(),
                src.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * This is a convenience function for the func argument of gst_tag_register().
 * It creates a copy of the first value from the list.
 * @param dest uninitialized GValue to store result in
 * @param src GValue to copy from
 */
public static void tagMergeUseFirst(org.gtk.gobject.Value dest, org.gtk.gobject.Value src) {
    try {
        DowncallHandles.gst_tag_merge_use_first.invokeExact(
                dest.handle(),
                src.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Registers a new tag type for the use with GStreamer's type system. If a type
 * with that name is already registered, that one is used.
 * The old registration may have used a different type however. So don't rely
 * on your supplied values.
 * <p>
 * Important: if you do not supply a merge function the implication will be
 * that there can only be one single value for this tag in a tag list and
 * any additional values will silently be discarded when being added (unless
 * {@code GST_TAG_MERGE_REPLACE}, {@code GST_TAG_MERGE_REPLACE_ALL}, or
 * {@code GST_TAG_MERGE_PREPEND} is used as merge mode, in which case the new
 * value will replace the old one in the list).
 * <p>
 * The merge function will be called from gst_tag_list_copy_value() when
 * it is required that one or more values for a tag be condensed into
 * one single value. This may happen from gst_tag_list_get_string(),
 * gst_tag_list_get_int(), gst_tag_list_get_double() etc. What will happen
 * exactly in that case depends on how the tag was registered and if a
 * merge function was supplied and if so which one.
 * <p>
 * Two default merge functions are provided: gst_tag_merge_use_first() and
 * gst_tag_merge_strings_with_comma().
 * @param name the name or identifier string
 * @param flag a flag describing the type of tag info
 * @param type the type this data is in
 * @param nick human-readable name
 * @param blurb a human-readable description about this tag
 * @param func function for merging multiple values of this tag, or {@code null}
 */
public static void tagRegister(java.lang.String name, org.gstreamer.gst.TagFlag flag, org.gtk.glib.Type type, java.lang.String nick, java.lang.String blurb, @Nullable org.gstreamer.gst.TagMergeFunc func) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_tag_register.invokeExact(
                    Marshal.stringToAddress.marshal(name, SCOPE),
                    flag.getValue(),
                    type.getValue().longValue(),
                    Marshal.stringToAddress.marshal(nick, SCOPE),
                    Marshal.stringToAddress.marshal(blurb, SCOPE),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Registers a new tag type for the use with GStreamer's type system.
 * <p>
 * Same as gst_tag_register(), but {@code name}, {@code nick}, and {@code blurb} must be
 * static strings or inlined strings, as they will not be copied. (GStreamer
 * plugins will be made resident once loaded, so this function can be used
 * even from dynamically loaded plugins.)
 * @param name the name or identifier string (string constant)
 * @param flag a flag describing the type of tag info
 * @param type the type this data is in
 * @param nick human-readable name or short description (string constant)
 * @param blurb a human-readable description for this tag (string constant)
 * @param func function for merging multiple values of this tag, or {@code null}
 */
public static void tagRegisterStatic(java.lang.String name, org.gstreamer.gst.TagFlag flag, org.gtk.glib.Type type, java.lang.String nick, java.lang.String blurb, @Nullable org.gstreamer.gst.TagMergeFunc func) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_tag_register_static.invokeExact(
                    Marshal.stringToAddress.marshal(name, SCOPE),
                    flag.getValue(),
                    type.getValue().longValue(),
                    Marshal.stringToAddress.marshal(nick, SCOPE),
                    Marshal.stringToAddress.marshal(blurb, SCOPE),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Converts {@code type} to a string representation.
 * @param type a {@link TocEntryType}.
 * @return Returns a human-readable string for {@code type}. This string is
 *    only for debugging purpose and should not be displayed in a user
 *    interface.
 */
public static java.lang.String tocEntryTypeGetNick(org.gstreamer.gst.TocEntryType type) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_toc_entry_type_get_nick.invokeExact(type.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Get a list of all active tracer objects owned by the tracing framework for
 * the entirety of the run-time of the process or till gst_deinit() is called.
 * @return A {@link org.gtk.glib.List} of
 * {@link Tracer} objects
 */
public static org.gtk.glib.List tracingGetActiveTracers() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_tracing_get_active_tracers.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Register {@code func} to be called when the trace hook {@code detail} is getting invoked.
 * Use {@code null} for {@code detail} to register to all hooks.
 * @param tracer the tracer
 * @param detail the detailed hook
 * @param func the callback
 */
public static void tracingRegisterHook(org.gstreamer.gst.Tracer tracer, java.lang.String detail, org.gtk.gobject.Callback func) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_tracing_register_hook.invokeExact(
                    tracer.handle(),
                    Marshal.stringToAddress.marshal(detail, SCOPE),
                    (Addressable) func.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

public static org.gtk.glib.Type typeFindGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_type_find_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

/**
 * Registers a new typefind function to be used for typefinding. After
 * registering this function will be available for typefinding.
 * This function is typically called during an element's plugin initialization.
 * @param plugin A {@link Plugin}, or {@code null} for a static typefind function
 * @param name The name for registering
 * @param rank The rank (or importance) of this typefind function
 * @param func The {@link TypeFindFunction} to use
 * @param extensions Optional comma-separated list of extensions
 *     that could belong to this type
 * @param possibleCaps Optionally the caps that could be returned when typefinding
 *                 succeeds
 * @param dataNotify a {@link org.gtk.glib.DestroyNotify} that will be called on {@code data} when the plugin
 *        is unloaded.
 * @return {@code true} on success, {@code false} otherwise
 */
public static boolean typeFindRegister(@Nullable org.gstreamer.gst.Plugin plugin, java.lang.String name, int rank, org.gstreamer.gst.TypeFindFunction func, @Nullable java.lang.String extensions, @Nullable org.gstreamer.gst.Caps possibleCaps, org.gtk.glib.DestroyNotify dataNotify) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_type_find_register.invokeExact(
                    (Addressable) (plugin == null ? MemoryAddress.NULL : plugin.handle()),
                    Marshal.stringToAddress.marshal(name, SCOPE),
                    rank,
                    (Addressable) func.toCallback(),
                    (Addressable) (extensions == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(extensions, SCOPE)),
                    (Addressable) (possibleCaps == null ? MemoryAddress.NULL : possibleCaps.handle()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) dataNotify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Checks if {@code type} is plugin API. See gst_type_mark_as_plugin_api() for
 * details.
 * @param type a GType
 * @param flags What {@link PluginAPIFlags} the plugin was marked with
 * @return {@code true} if {@code type} is plugin API or {@code false} otherwise.
 */
public static boolean typeIsPluginApi(org.gtk.glib.Type type, @Nullable Out<org.gstreamer.gst.PluginAPIFlags> flags) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment flagsPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_type_is_plugin_api.invokeExact(
                    type.getValue().longValue(),
                    (Addressable) (flags == null ? MemoryAddress.NULL : (Addressable) flagsPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (flags != null) flags.set(new org.gstreamer.gst.PluginAPIFlags(flagsPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Marks {@code type} as plugin API. This should be called in {@code class_init} of
 * elements that expose new types (i.e. enums, flags or internal GObjects) via
 * properties, signals or pad templates.
 * <p>
 * Types exposed by plugins are not automatically added to the documentation
 * as they might originate from another library and should in that case be
 * documented via that library instead.
 * <p>
 * By marking a type as plugin API it will be included in the documentation of
 * the plugin that defines it.
 * @param type a GType
 * @param flags a set of {@link PluginAPIFlags} to further inform cache generation.
 */
public static void typeMarkAsPluginApi(org.gtk.glib.Type type, org.gstreamer.gst.PluginAPIFlags flags) {
    try {
        DowncallHandles.gst_type_mark_as_plugin_api.invokeExact(
                type.getValue().longValue(),
                flags.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Forces GStreamer to re-scan its plugin paths and update the default
 * plugin registry.
 * <p>
 * Applications will almost never need to call this function, it is only
 * useful if the application knows new plugins have been installed (or old
 * ones removed) since the start of the application (or, to be precise, the
 * first call to gst_init()) and the application wants to make use of any
 * newly-installed plugins without restarting the application.
 * <p>
 * Applications should assume that the registry update is neither atomic nor
 * thread-safe and should therefore not have any dynamic pipelines running
 * (including the playbin and decodebin elements) and should also not create
 * any elements or access the GStreamer registry while the update is in
 * progress.
 * <p>
 * Note that this function may block for a significant amount of time.
 * @return {@code true} if the registry has been updated successfully (does not
 *          imply that there were changes), otherwise {@code false}.
 */
public static boolean updateRegistry() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_update_registry.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Constructs a URI for a given valid protocol and location.
 * <p>
 * Free-function: g_free
 * @param protocol Protocol for URI
 * @param location Location for URI
 * @return a new string for this URI. Returns {@code null} if the
 *     given URI protocol is not valid, or the given location is {@code null}.
 * @deprecated Use GstURI instead.
 */
@Deprecated
public static java.lang.String uriConstruct(java.lang.String protocol, java.lang.String location) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_construct.invokeExact(
                    Marshal.stringToAddress.marshal(protocol, SCOPE),
                    Marshal.stringToAddress.marshal(location, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

public static org.gtk.glib.Quark uriErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_uri_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Parses a URI string into a new {@link Uri} object. Will return NULL if the URI
 * cannot be parsed.
 * @param uri The URI string to parse.
 * @return A new {@link Uri} object, or NULL.
 */
public static @Nullable org.gstreamer.gst.Uri uriFromString(java.lang.String uri) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_from_string.invokeExact(Marshal.stringToAddress.marshal(uri, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Uri.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Parses a URI string into a new {@link Uri} object. Will return NULL if the URI
 * cannot be parsed. This is identical to gst_uri_from_string() except that
 * the userinfo and fragment components of the URI will not be unescaped while
 * parsing.
 * <p>
 * Use this when you need to extract a username and password from the userinfo
 * such as https://user:password{@code example}.com since either may contain
 * a URI-escaped ':' character. gst_uri_from_string() will unescape the entire
 * userinfo component, which will make it impossible to know which ':'
 * delineates the username and password.
 * <p>
 * The same applies to the fragment component of the URI, such as
 * https://example.com/path{@code fragment} which may contain a URI-escaped '{@code '}.
 * @param uri The URI string to parse.
 * @return A new {@link Uri} object, or NULL.
 */
public static @Nullable org.gstreamer.gst.Uri uriFromStringEscaped(java.lang.String uri) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_from_string_escaped.invokeExact(Marshal.stringToAddress.marshal(uri, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Uri.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Extracts the location out of a given valid URI, ie. the protocol and "://"
 * are stripped from the URI, which means that the location returned includes
 * the hostname if one is specified. The returned string must be freed using
 * g_free().
 * <p>
 * Free-function: g_free
 * @param uri A URI string
 * @return the location for this URI. Returns
 *     {@code null} if the URI isn't valid. If the URI does not contain a location, an
 *     empty string is returned.
 */
public static @Nullable java.lang.String uriGetLocation(java.lang.String uri) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_get_location.invokeExact(Marshal.stringToAddress.marshal(uri, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Extracts the protocol out of a given valid URI. The returned string must be
 * freed using g_free().
 * @param uri A URI string
 * @return The protocol for this URI.
 */
public static @Nullable java.lang.String uriGetProtocol(java.lang.String uri) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_get_protocol.invokeExact(Marshal.stringToAddress.marshal(uri, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Checks if the protocol of a given valid URI matches {@code protocol}.
 * @param uri a URI string
 * @param protocol a protocol string (e.g. "http")
 * @return {@code true} if the protocol matches.
 */
public static boolean uriHasProtocol(java.lang.String uri, java.lang.String protocol) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_has_protocol.invokeExact(
                    Marshal.stringToAddress.marshal(uri, SCOPE),
                    Marshal.stringToAddress.marshal(protocol, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Tests if the given string is a valid URI identifier. URIs start with a valid
 * scheme followed by ":" and maybe a string identifying the location.
 * @param uri A URI string
 * @return {@code true} if the string is a valid URI
 */
public static boolean uriIsValid(java.lang.String uri) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_is_valid.invokeExact(Marshal.stringToAddress.marshal(uri, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * This is a convenience function to join two URI strings and return the result.
 * The returned string should be g_free()'d after use.
 * @param baseUri The percent-encoded base URI.
 * @param refUri The percent-encoded reference URI to join to the {@code base_uri}.
 * @return A string representing the percent-encoded join of
 *          the two URIs.
 */
public static java.lang.String uriJoinStrings(java.lang.String baseUri, java.lang.String refUri) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_join_strings.invokeExact(
                    Marshal.stringToAddress.marshal(baseUri, SCOPE),
                    Marshal.stringToAddress.marshal(refUri, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Checks if an element exists that supports the given URI protocol. Note
 * that a positive return value does not imply that a subsequent call to
 * gst_element_make_from_uri() is guaranteed to work.
 * @param type Whether to check for a source or a sink
 * @param protocol Protocol that should be checked for (e.g. "http" or "smb")
 * @return {@code true}
 */
public static boolean uriProtocolIsSupported(org.gstreamer.gst.URIType type, java.lang.String protocol) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_protocol_is_supported.invokeExact(
                    type.getValue(),
                    Marshal.stringToAddress.marshal(protocol, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Tests if the given string is a valid protocol identifier. Protocols
 * must consist of alphanumeric characters, '+', '-' and '.' and must
 * start with a alphabetic character. See RFC 3986 Section 3.1.
 * @param protocol A string
 * @return {@code true} if the string is a valid protocol identifier, {@code false} otherwise.
 */
public static boolean uriProtocolIsValid(java.lang.String protocol) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_protocol_is_valid.invokeExact(Marshal.stringToAddress.marshal(protocol, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Searches inside {@code array} for {@code search_data} by using the comparison function
 * {@code search_func}. {@code array} must be sorted ascending.
 * <p>
 * As {@code search_data} is always passed as second argument to {@code search_func} it's
 * not required that {@code search_data} has the same type as the array elements.
 * <p>
 * The complexity of this search function is O(log (num_elements)).
 * @param array the sorted input array
 * @param numElements number of elements in the array
 * @param elementSize size of every element in bytes
 * @param searchFunc function to compare two elements, {@code search_data} will always be passed as second argument
 * @param mode search mode that should be used
 * @return The address of the found
 * element or {@code null} if nothing was found
 */
public static @Nullable java.lang.foreign.MemoryAddress utilArrayBinarySearch(@Nullable java.lang.foreign.MemoryAddress array, int numElements, long elementSize, org.gtk.glib.CompareDataFunc searchFunc, org.gstreamer.gst.SearchMode mode) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_util_array_binary_search.invokeExact(
                (Addressable) (array == null ? MemoryAddress.NULL : (Addressable) array),
                numElements,
                elementSize,
                (Addressable) searchFunc.toCallback(),
                mode.getValue(),
                (Addressable) MemoryAddress.NULL,
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Transforms a {@code gdouble} to a fraction and simplifies
 * the result.
 * @param src {@code gdouble} to transform
 * @param destN pointer to a {@code gint} to hold the result numerator
 * @param destD pointer to a {@code gint} to hold the result denominator
 */
public static void utilDoubleToFraction(double src, Out<Integer> destN, Out<Integer> destD) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment destNPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment destDPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_util_double_to_fraction.invokeExact(
                    src,
                    (Addressable) destNPOINTER.address(),
                    (Addressable) destDPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                destN.set(destNPOINTER.get(Interop.valueLayout.C_INT, 0));
                destD.set(destDPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
}

/**
 * Dumps the buffer memory into a hex representation. Useful for debugging.
 * @param buf a {@link Buffer} whose memory to dump
 */
public static void utilDumpBuffer(org.gstreamer.gst.Buffer buf) {
    try {
        DowncallHandles.gst_util_dump_buffer.invokeExact(buf.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Dumps the memory block into a hex representation. Useful for debugging.
 * @param mem a pointer to the memory to dump
 * @param size the size of the memory block to dump
 */
public static void utilDumpMem(byte[] mem, int size) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_util_dump_mem.invokeExact(
                    Interop.allocateNativeArray(mem, false, SCOPE),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Adds the fractions {@code a_n}/{@code a_d} and {@code b_n}/{@code b_d} and stores
 * the result in {@code res_n} and {@code res_d}.
 * @param aN Numerator of first value
 * @param aD Denominator of first value
 * @param bN Numerator of second value
 * @param bD Denominator of second value
 * @param resN Pointer to {@code gint} to hold the result numerator
 * @param resD Pointer to {@code gint} to hold the result denominator
 * @return {@code false} on overflow, {@code true} otherwise.
 */
public static boolean utilFractionAdd(int aN, int aD, int bN, int bD, Out<Integer> resN, Out<Integer> resD) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment resNPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment resDPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_util_fraction_add.invokeExact(
                    aN,
                    aD,
                    bN,
                    bD,
                    (Addressable) resNPOINTER.address(),
                    (Addressable) resDPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                resN.set(resNPOINTER.get(Interop.valueLayout.C_INT, 0));
                resD.set(resDPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Compares the fractions {@code a_n}/{@code a_d} and {@code b_n}/{@code b_d} and returns
 * -1 if a &lt; b, 0 if a = b and 1 if a &gt; b.
 * @param aN Numerator of first value
 * @param aD Denominator of first value
 * @param bN Numerator of second value
 * @param bD Denominator of second value
 * @return -1 if a &lt; b; 0 if a = b; 1 if a &gt; b.
 */
public static int utilFractionCompare(int aN, int aD, int bN, int bD) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_util_fraction_compare.invokeExact(
                aN,
                aD,
                bN,
                bD);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Multiplies the fractions {@code a_n}/{@code a_d} and {@code b_n}/{@code b_d} and stores
 * the result in {@code res_n} and {@code res_d}.
 * @param aN Numerator of first value
 * @param aD Denominator of first value
 * @param bN Numerator of second value
 * @param bD Denominator of second value
 * @param resN Pointer to {@code gint} to hold the result numerator
 * @param resD Pointer to {@code gint} to hold the result denominator
 * @return {@code false} on overflow, {@code true} otherwise.
 */
public static boolean utilFractionMultiply(int aN, int aD, int bN, int bD, Out<Integer> resN, Out<Integer> resD) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment resNPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment resDPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_util_fraction_multiply.invokeExact(
                    aN,
                    aD,
                    bN,
                    bD,
                    (Addressable) resNPOINTER.address(),
                    (Addressable) resDPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                resN.set(resNPOINTER.get(Interop.valueLayout.C_INT, 0));
                resD.set(resDPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Transforms a fraction to a {@code gdouble}.
 * @param srcN Fraction numerator as {@code gint}
 * @param srcD Fraction denominator {@code gint}
 * @param dest pointer to a {@code gdouble} for the result
 */
public static void utilFractionToDouble(int srcN, int srcD, Out<Double> dest) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment destPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
        try {
            DowncallHandles.gst_util_fraction_to_double.invokeExact(
                    srcN,
                    srcD,
                    (Addressable) destPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                dest.set(destPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
    }
}

public static long utilGdoubleToGuint64(double value) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_util_gdouble_to_guint64.invokeExact(value);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Get a property of type {@code GST_TYPE_ARRAY} and transform it into a
 * {@link org.gtk.gobject.ValueArray}. This allow language bindings to get GST_TYPE_ARRAY
 * properties which are otherwise not an accessible type.
 * @param object the object to set the array to
 * @param name the name of the property to set
 * @param array a return {@link org.gtk.gobject.ValueArray}
 */
public static boolean utilGetObjectArray(org.gtk.gobject.GObject object, java.lang.String name, Out<org.gtk.gobject.ValueArray> array) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment arrayPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_util_get_object_array.invokeExact(
                    object.handle(),
                    Marshal.stringToAddress.marshal(name, SCOPE),
                    (Addressable) arrayPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                array.set(org.gtk.gobject.ValueArray.fromAddress.marshal(arrayPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Get a timestamp as GstClockTime to be used for interval measurements.
 * The timestamp should not be interpreted in any other way.
 * @return the timestamp
 */
public static org.gstreamer.gst.ClockTime utilGetTimestamp() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_util_get_timestamp.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gstreamer.gst.ClockTime(RESULT);
}

/**
 * Calculates the greatest common divisor of {@code a}
 * and {@code b}.
 * @param a First value as {@code gint}
 * @param b Second value as {@code gint}
 * @return Greatest common divisor of {@code a} and {@code b}
 */
public static int utilGreatestCommonDivisor(int a, int b) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_util_greatest_common_divisor.invokeExact(
                a,
                b);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Calculates the greatest common divisor of {@code a}
 * and {@code b}.
 * @param a First value as {@code gint64}
 * @param b Second value as {@code gint64}
 * @return Greatest common divisor of {@code a} and {@code b}
 */
public static long utilGreatestCommonDivisorInt64(long a, long b) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_util_greatest_common_divisor_int64.invokeExact(
                a,
                b);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Return a constantly incrementing group id.
 * <p>
 * This function is used to generate a new group-id for the
 * stream-start event.
 * <p>
 * This function never returns {@code GST_GROUP_ID_INVALID} (which is 0)
 * @return A constantly incrementing unsigned integer, which might
 * overflow back to 0 at some point.
 */
public static int utilGroupIdNext() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_util_group_id_next.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

public static double utilGuint64ToGdouble(long value) {
    double RESULT;
    try {
        RESULT = (double) DowncallHandles.gst_util_guint64_to_gdouble.invokeExact(value);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Compare two sequence numbers, handling wraparound.
 * <p>
 * The current implementation just returns (gint32)({@code s1} - {@code s2}).
 * @param s1 A sequence number.
 * @param s2 Another sequence number.
 * @return A negative number if {@code s1} is before {@code s2}, 0 if they are equal, or a
 * positive number if {@code s1} is after {@code s2}.
 */
public static int utilSeqnumCompare(int s1, int s2) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_util_seqnum_compare.invokeExact(
                s1,
                s2);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Return a constantly incrementing sequence number.
 * <p>
 * This function is used internally to GStreamer to be able to determine which
 * events and messages are "the same". For example, elements may set the seqnum
 * on a segment-done message to be the same as that of the last seek event, to
 * indicate that event and the message correspond to the same segment.
 * <p>
 * This function never returns {@code GST_SEQNUM_INVALID} (which is 0).
 * @return A constantly incrementing 32-bit unsigned integer, which might
 * overflow at some point. Use gst_util_seqnum_compare() to make sure
 * you handle wraparound correctly.
 */
public static int utilSeqnumNext() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_util_seqnum_next.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Converts the string value to the type of the objects argument and
 * sets the argument with it.
 * <p>
 * Note that this function silently returns if {@code object} has no property named
 * {@code name} or when {@code value} cannot be converted to the type of the property.
 * @param object the object to set the argument of
 * @param name the name of the argument to set
 * @param value the string value to set
 */
public static void utilSetObjectArg(org.gtk.gobject.GObject object, java.lang.String name, java.lang.String value) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_util_set_object_arg.invokeExact(
                    object.handle(),
                    Marshal.stringToAddress.marshal(name, SCOPE),
                    Marshal.stringToAddress.marshal(value, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Transfer a {@link org.gtk.gobject.ValueArray} to {@code GST_TYPE_ARRAY} and set this value on the
 * specified property name. This allow language bindings to set GST_TYPE_ARRAY
 * properties which are otherwise not an accessible type.
 * @param object the object to set the array to
 * @param name the name of the property to set
 * @param array a {@link org.gtk.gobject.ValueArray} containing the values
 */
public static boolean utilSetObjectArray(org.gtk.gobject.GObject object, java.lang.String name, org.gtk.gobject.ValueArray array) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_util_set_object_array.invokeExact(
                    object.handle(),
                    Marshal.stringToAddress.marshal(name, SCOPE),
                    array.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Converts the string to the type of the value and
 * sets the value with it.
 * <p>
 * Note that this function is dangerous as it does not return any indication
 * if the conversion worked or not.
 * @param value the value to set
 * @param valueStr the string to get the value from
 */
public static void utilSetValueFromString(org.gtk.gobject.Value value, java.lang.String valueStr) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_util_set_value_from_string.invokeExact(
                    value.handle(),
                    Marshal.stringToAddress.marshal(valueStr, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Scale {@code val} by the rational number {@code num} / {@code denom}, avoiding overflows and
 * underflows and without loss of precision.
 * <p>
 * This function can potentially be very slow if val and num are both
 * greater than G_MAXUINT32.
 * @param val the number to scale
 * @param num the numerator of the scale ratio
 * @param denom the denominator of the scale ratio
 * @return {@code val} * {@code num} / {@code denom}.  In the case of an overflow, this
 * function returns G_MAXUINT64.  If the result is not exactly
 * representable as an integer it is truncated.  See also
 * gst_util_uint64_scale_round(), gst_util_uint64_scale_ceil(),
 * gst_util_uint64_scale_int(), gst_util_uint64_scale_int_round(),
 * gst_util_uint64_scale_int_ceil().
 */
public static long utilUint64Scale(long val, long num, long denom) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_util_uint64_scale.invokeExact(
                val,
                num,
                denom);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Scale {@code val} by the rational number {@code num} / {@code denom}, avoiding overflows and
 * underflows and without loss of precision.
 * <p>
 * This function can potentially be very slow if val and num are both
 * greater than G_MAXUINT32.
 * @param val the number to scale
 * @param num the numerator of the scale ratio
 * @param denom the denominator of the scale ratio
 * @return {@code val} * {@code num} / {@code denom}.  In the case of an overflow, this
 * function returns G_MAXUINT64.  If the result is not exactly
 * representable as an integer, it is rounded up.  See also
 * gst_util_uint64_scale(), gst_util_uint64_scale_round(),
 * gst_util_uint64_scale_int(), gst_util_uint64_scale_int_round(),
 * gst_util_uint64_scale_int_ceil().
 */
public static long utilUint64ScaleCeil(long val, long num, long denom) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_util_uint64_scale_ceil.invokeExact(
                val,
                num,
                denom);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Scale {@code val} by the rational number {@code num} / {@code denom}, avoiding overflows and
 * underflows and without loss of precision.  {@code num} must be non-negative and
 * {@code denom} must be positive.
 * @param val guint64 (such as a {@link ClockTime}) to scale.
 * @param num numerator of the scale factor.
 * @param denom denominator of the scale factor.
 * @return {@code val} * {@code num} / {@code denom}.  In the case of an overflow, this
 * function returns G_MAXUINT64.  If the result is not exactly
 * representable as an integer, it is truncated.  See also
 * gst_util_uint64_scale_int_round(), gst_util_uint64_scale_int_ceil(),
 * gst_util_uint64_scale(), gst_util_uint64_scale_round(),
 * gst_util_uint64_scale_ceil().
 */
public static long utilUint64ScaleInt(long val, int num, int denom) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_util_uint64_scale_int.invokeExact(
                val,
                num,
                denom);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Scale {@code val} by the rational number {@code num} / {@code denom}, avoiding overflows and
 * underflows and without loss of precision.  {@code num} must be non-negative and
 * {@code denom} must be positive.
 * @param val guint64 (such as a {@link ClockTime}) to scale.
 * @param num numerator of the scale factor.
 * @param denom denominator of the scale factor.
 * @return {@code val} * {@code num} / {@code denom}.  In the case of an overflow, this
 * function returns G_MAXUINT64.  If the result is not exactly
 * representable as an integer, it is rounded up.  See also
 * gst_util_uint64_scale_int(), gst_util_uint64_scale_int_round(),
 * gst_util_uint64_scale(), gst_util_uint64_scale_round(),
 * gst_util_uint64_scale_ceil().
 */
public static long utilUint64ScaleIntCeil(long val, int num, int denom) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_util_uint64_scale_int_ceil.invokeExact(
                val,
                num,
                denom);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Scale {@code val} by the rational number {@code num} / {@code denom}, avoiding overflows and
 * underflows and without loss of precision.  {@code num} must be non-negative and
 * {@code denom} must be positive.
 * @param val guint64 (such as a {@link ClockTime}) to scale.
 * @param num numerator of the scale factor.
 * @param denom denominator of the scale factor.
 * @return {@code val} * {@code num} / {@code denom}.  In the case of an overflow, this
 * function returns G_MAXUINT64.  If the result is not exactly
 * representable as an integer, it is rounded to the nearest integer
 * (half-way cases are rounded up).  See also gst_util_uint64_scale_int(),
 * gst_util_uint64_scale_int_ceil(), gst_util_uint64_scale(),
 * gst_util_uint64_scale_round(), gst_util_uint64_scale_ceil().
 */
public static long utilUint64ScaleIntRound(long val, int num, int denom) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_util_uint64_scale_int_round.invokeExact(
                val,
                num,
                denom);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Scale {@code val} by the rational number {@code num} / {@code denom}, avoiding overflows and
 * underflows and without loss of precision.
 * <p>
 * This function can potentially be very slow if val and num are both
 * greater than G_MAXUINT32.
 * @param val the number to scale
 * @param num the numerator of the scale ratio
 * @param denom the denominator of the scale ratio
 * @return {@code val} * {@code num} / {@code denom}.  In the case of an overflow, this
 * function returns G_MAXUINT64.  If the result is not exactly
 * representable as an integer, it is rounded to the nearest integer
 * (half-way cases are rounded up).  See also gst_util_uint64_scale(),
 * gst_util_uint64_scale_ceil(), gst_util_uint64_scale_int(),
 * gst_util_uint64_scale_int_round(), gst_util_uint64_scale_int_ceil().
 */
public static long utilUint64ScaleRound(long val, long num, long denom) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_util_uint64_scale_round.invokeExact(
                val,
                num,
                denom);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Determines if {@code value1} and {@code value2} can be compared.
 * @param value1 a value to compare
 * @param value2 another value to compare
 * @return {@code true} if the values can be compared
 */
public static boolean valueCanCompare(org.gtk.gobject.Value value1, org.gtk.gobject.Value value2) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_can_compare.invokeExact(
                value1.handle(),
                value2.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Determines if intersecting two values will produce a valid result.
 * Two values will produce a valid intersection if they have the same
 * type.
 * @param value1 a value to intersect
 * @param value2 another value to intersect
 * @return {@code true} if the values can intersect
 */
public static boolean valueCanIntersect(org.gtk.gobject.Value value1, org.gtk.gobject.Value value2) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_can_intersect.invokeExact(
                value1.handle(),
                value2.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Checks if it's possible to subtract {@code subtrahend} from {@code minuend}.
 * @param minuend the value to subtract from
 * @param subtrahend the value to subtract
 * @return {@code true} if a subtraction is possible
 */
public static boolean valueCanSubtract(org.gtk.gobject.Value minuend, org.gtk.gobject.Value subtrahend) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_can_subtract.invokeExact(
                minuend.handle(),
                subtrahend.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Determines if {@code value1} and {@code value2} can be non-trivially unioned.
 * Any two values can be trivially unioned by adding both of them
 * to a GstValueList.  However, certain types have the possibility
 * to be unioned in a simpler way.  For example, an integer range
 * and an integer can be unioned if the integer is a subset of the
 * integer range.  If there is the possibility that two values can
 * be unioned, this function returns {@code true}.
 * @param value1 a value to union
 * @param value2 another value to union
 * @return {@code true} if there is a function allowing the two values to
 * be unioned.
 */
public static boolean valueCanUnion(org.gtk.gobject.Value value1, org.gtk.gobject.Value value2) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_can_union.invokeExact(
                value1.handle(),
                value2.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Compares {@code value1} and {@code value2}.  If {@code value1} and {@code value2} cannot be
 * compared, the function returns GST_VALUE_UNORDERED.  Otherwise,
 * if {@code value1} is greater than {@code value2}, GST_VALUE_GREATER_THAN is returned.
 * If {@code value1} is less than {@code value2}, GST_VALUE_LESS_THAN is returned.
 * If the values are equal, GST_VALUE_EQUAL is returned.
 * @param value1 a value to compare
 * @param value2 another value to compare
 * @return comparison result
 */
public static int valueCompare(org.gtk.gobject.Value value1, org.gtk.gobject.Value value2) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_compare.invokeExact(
                value1.handle(),
                value2.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Tries to deserialize a string into the type specified by the given GValue.
 * If the operation succeeds, {@code true} is returned, {@code false} otherwise.
 * @param dest {@link org.gtk.gobject.Value} to fill with contents of
 *     deserialization
 * @param src string to deserialize
 * @return {@code true} on success
 */
public static boolean valueDeserialize(org.gtk.gobject.Value dest, java.lang.String src) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_value_deserialize.invokeExact(
                    dest.handle(),
                    Marshal.stringToAddress.marshal(src, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Tries to deserialize a string into the type specified by the given GValue.
 * {@code pspec} may be used to guide the deserializing of nested members.
 * If the operation succeeds, {@code true} is returned, {@code false} otherwise.
 * @param dest {@link org.gtk.gobject.Value} to fill with contents of
 *     deserialization
 * @param src string to deserialize
 * @param pspec the {@link org.gtk.gobject.ParamSpec} describing the expected value
 * @return {@code true} on success
 */
public static boolean valueDeserializeWithPspec(org.gtk.gobject.Value dest, java.lang.String src, @Nullable org.gtk.gobject.ParamSpec pspec) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_value_deserialize_with_pspec.invokeExact(
                    dest.handle(),
                    Marshal.stringToAddress.marshal(src, SCOPE),
                    (Addressable) (pspec == null ? MemoryAddress.NULL : pspec.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Fixate {@code src} into a new value {@code dest}.
 * For ranges, the first element is taken. For lists and arrays, the
 * first item is fixated and returned.
 * If {@code src} is already fixed, this function returns {@code false}.
 * @param dest the {@link org.gtk.gobject.Value} destination
 * @param src the {@link org.gtk.gobject.Value} to fixate
 * @return {@code true} if {@code dest} contains a fixated version of {@code src}.
 */
public static boolean valueFixate(org.gtk.gobject.Value dest, org.gtk.gobject.Value src) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_fixate.invokeExact(
                dest.handle(),
                src.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Multiplies the two {@link org.gtk.gobject.Value} items containing a {@code GST_TYPE_FRACTION} and sets
 * {@code product} to the product of the two fractions.
 * @param product a GValue initialized to {@code GST_TYPE_FRACTION}
 * @param factor1 a GValue initialized to {@code GST_TYPE_FRACTION}
 * @param factor2 a GValue initialized to {@code GST_TYPE_FRACTION}
 * @return {@code false} in case of an error (like integer overflow), {@code true} otherwise.
 */
public static boolean valueFractionMultiply(org.gtk.gobject.Value product, org.gtk.gobject.Value factor1, org.gtk.gobject.Value factor2) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_fraction_multiply.invokeExact(
                product.handle(),
                factor1.handle(),
                factor2.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Subtracts the {@code subtrahend} from the {@code minuend} and sets {@code dest} to the result.
 * @param dest a GValue initialized to {@code GST_TYPE_FRACTION}
 * @param minuend a GValue initialized to {@code GST_TYPE_FRACTION}
 * @param subtrahend a GValue initialized to {@code GST_TYPE_FRACTION}
 * @return {@code false} in case of an error (like integer overflow), {@code true} otherwise.
 */
public static boolean valueFractionSubtract(org.gtk.gobject.Value dest, org.gtk.gobject.Value minuend, org.gtk.gobject.Value subtrahend) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_fraction_subtract.invokeExact(
                dest.handle(),
                minuend.handle(),
                subtrahend.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Gets the bitmask specified by {@code value}.
 * @param value a GValue initialized to {@code GST_TYPE_BITMASK}
 * @return the bitmask.
 */
public static long valueGetBitmask(org.gtk.gobject.Value value) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_value_get_bitmask.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Gets the contents of {@code value}. The reference count of the returned
 * {@link Caps} will not be modified, therefore the caller must take one
 * before getting rid of the {@code value}.
 * @param value a GValue initialized to GST_TYPE_CAPS
 * @return the contents of {@code value}
 */
public static org.gstreamer.gst.Caps valueGetCaps(org.gtk.gobject.Value value) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_value_get_caps.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
}

/**
 * Gets the contents of {@code value}.
 * @param value a GValue initialized to GST_TYPE_CAPS_FEATURES
 * @return the contents of {@code value}
 */
public static org.gstreamer.gst.CapsFeatures valueGetCapsFeatures(org.gtk.gobject.Value value) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_value_get_caps_features.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.CapsFeatures.fromAddress.marshal(RESULT, null);
}

/**
 * Gets the maximum of the range specified by {@code value}.
 * @param value a GValue initialized to GST_TYPE_DOUBLE_RANGE
 * @return the maximum of the range
 */
public static double valueGetDoubleRangeMax(org.gtk.gobject.Value value) {
    double RESULT;
    try {
        RESULT = (double) DowncallHandles.gst_value_get_double_range_max.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Gets the minimum of the range specified by {@code value}.
 * @param value a GValue initialized to GST_TYPE_DOUBLE_RANGE
 * @return the minimum of the range
 */
public static double valueGetDoubleRangeMin(org.gtk.gobject.Value value) {
    double RESULT;
    try {
        RESULT = (double) DowncallHandles.gst_value_get_double_range_min.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Retrieve the flags field of a GstFlagSet {@code value}.
 * @param value a GValue initialized to {@code GST_TYPE_FLAG_SET}
 * @return the flags field of the flagset instance.
 */
public static int valueGetFlagsetFlags(org.gtk.gobject.Value value) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_get_flagset_flags.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Retrieve the mask field of a GstFlagSet {@code value}.
 * @param value a GValue initialized to {@code GST_TYPE_FLAG_SET}
 * @return the mask field of the flagset instance.
 */
public static int valueGetFlagsetMask(org.gtk.gobject.Value value) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_get_flagset_mask.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Gets the denominator of the fraction specified by {@code value}.
 * @param value a GValue initialized to {@code GST_TYPE_FRACTION}
 * @return the denominator of the fraction.
 */
public static int valueGetFractionDenominator(org.gtk.gobject.Value value) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_get_fraction_denominator.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Gets the numerator of the fraction specified by {@code value}.
 * @param value a GValue initialized to {@code GST_TYPE_FRACTION}
 * @return the numerator of the fraction.
 */
public static int valueGetFractionNumerator(org.gtk.gobject.Value value) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_get_fraction_numerator.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Gets the maximum of the range specified by {@code value}.
 * @param value a GValue initialized to GST_TYPE_FRACTION_RANGE
 * @return the maximum of the range
 */
public static @Nullable org.gtk.gobject.Value valueGetFractionRangeMax(org.gtk.gobject.Value value) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_value_get_fraction_range_max.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.gobject.Value.fromAddress.marshal(RESULT, null);
}

/**
 * Gets the minimum of the range specified by {@code value}.
 * @param value a GValue initialized to GST_TYPE_FRACTION_RANGE
 * @return the minimum of the range
 */
public static @Nullable org.gtk.gobject.Value valueGetFractionRangeMin(org.gtk.gobject.Value value) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_value_get_fraction_range_min.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.gobject.Value.fromAddress.marshal(RESULT, null);
}

/**
 * Gets the maximum of the range specified by {@code value}.
 * @param value a GValue initialized to GST_TYPE_INT64_RANGE
 * @return the maximum of the range
 */
public static long valueGetInt64RangeMax(org.gtk.gobject.Value value) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_value_get_int64_range_max.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Gets the minimum of the range specified by {@code value}.
 * @param value a GValue initialized to GST_TYPE_INT64_RANGE
 * @return the minimum of the range
 */
public static long valueGetInt64RangeMin(org.gtk.gobject.Value value) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_value_get_int64_range_min.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Gets the step of the range specified by {@code value}.
 * @param value a GValue initialized to GST_TYPE_INT64_RANGE
 * @return the step of the range
 */
public static long valueGetInt64RangeStep(org.gtk.gobject.Value value) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_value_get_int64_range_step.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Gets the maximum of the range specified by {@code value}.
 * @param value a GValue initialized to GST_TYPE_INT_RANGE
 * @return the maximum of the range
 */
public static int valueGetIntRangeMax(org.gtk.gobject.Value value) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_get_int_range_max.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Gets the minimum of the range specified by {@code value}.
 * @param value a GValue initialized to GST_TYPE_INT_RANGE
 * @return the minimum of the range
 */
public static int valueGetIntRangeMin(org.gtk.gobject.Value value) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_get_int_range_min.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Gets the step of the range specified by {@code value}.
 * @param value a GValue initialized to GST_TYPE_INT_RANGE
 * @return the step of the range
 */
public static int valueGetIntRangeStep(org.gtk.gobject.Value value) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_get_int_range_step.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Gets the contents of {@code value}.
 * @param value a GValue initialized to GST_TYPE_STRUCTURE
 * @return the contents of {@code value}
 */
public static org.gstreamer.gst.Structure valueGetStructure(org.gtk.gobject.Value value) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_value_get_structure.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, null);
}

/**
 * Initialises the target value to be of the same type as source and then copies
 * the contents from source to target.
 * @param dest the target value
 * @param src the source value
 */
public static void valueInitAndCopy(org.gtk.gobject.Value dest, org.gtk.gobject.Value src) {
    try {
        DowncallHandles.gst_value_init_and_copy.invokeExact(
                dest.handle(),
                src.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Calculates the intersection of two values.  If the values have
 * a non-empty intersection, the value representing the intersection
 * is placed in {@code dest}, unless {@code null}.  If the intersection is non-empty,
 * {@code dest} is not modified.
 * @param dest a uninitialized {@link org.gtk.gobject.Value} that will hold the calculated
 *   intersection value. May be {@code null} if the resulting set if not
 *   needed.
 * @param value1 a value to intersect
 * @param value2 another value to intersect
 * @return {@code true} if the intersection is non-empty
 */
public static boolean valueIntersect(@Nullable org.gtk.gobject.Value dest, org.gtk.gobject.Value value1, org.gtk.gobject.Value value2) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_intersect.invokeExact(
                (Addressable) (dest == null ? MemoryAddress.NULL : dest.handle()),
                value1.handle(),
                value2.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    dest.yieldOwnership();
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Tests if the given GValue, if available in a GstStructure (or any other
 * container) contains a "fixed" (which means: one value) or an "unfixed"
 * (which means: multiple possible values, such as data lists or data
 * ranges) value.
 * @param value the {@link org.gtk.gobject.Value} to check
 * @return true if the value is "fixed".
 */
public static boolean valueIsFixed(org.gtk.gobject.Value value) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_is_fixed.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Check that {@code value1} is a subset of {@code value2}.
 * @param value1 a {@link org.gtk.gobject.Value}
 * @param value2 a {@link org.gtk.gobject.Value}
 * @return {@code true} is {@code value1} is a subset of {@code value2}
 */
public static boolean valueIsSubset(org.gtk.gobject.Value value1, org.gtk.gobject.Value value2) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_is_subset.invokeExact(
                value1.handle(),
                value2.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Registers functions to perform calculations on {@link org.gtk.gobject.Value} items of a given
 * type. Each type can only be added once.
 * @param table structure containing functions to register
 */
public static void valueRegister(org.gstreamer.gst.ValueTable table) {
    try {
        DowncallHandles.gst_value_register.invokeExact(table.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * tries to transform the given {@code value} into a string representation that allows
 * getting back this string later on using gst_value_deserialize().
 * <p>
 * Free-function: g_free
 * @param value a {@link org.gtk.gobject.Value} to serialize
 * @return the serialization for {@code value}
 * or {@code null} if none exists
 */
public static @Nullable java.lang.String valueSerialize(org.gtk.gobject.Value value) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_value_serialize.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Sets {@code value} to the bitmask specified by {@code bitmask}.
 * @param value a GValue initialized to {@code GST_TYPE_BITMASK}
 * @param bitmask the bitmask
 */
public static void valueSetBitmask(org.gtk.gobject.Value value, long bitmask) {
    try {
        DowncallHandles.gst_value_set_bitmask.invokeExact(
                value.handle(),
                bitmask);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Sets the contents of {@code value} to {@code caps}. A reference to the
 * provided {@code caps} will be taken by the {@code value}.
 * @param value a GValue initialized to GST_TYPE_CAPS
 * @param caps the caps to set the value to
 */
public static void valueSetCaps(org.gtk.gobject.Value value, org.gstreamer.gst.Caps caps) {
    try {
        DowncallHandles.gst_value_set_caps.invokeExact(
                value.handle(),
                caps.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Sets the contents of {@code value} to {@code features}.
 * @param value a GValue initialized to GST_TYPE_CAPS_FEATURES
 * @param features the features to set the value to
 */
public static void valueSetCapsFeatures(org.gtk.gobject.Value value, org.gstreamer.gst.CapsFeatures features) {
    try {
        DowncallHandles.gst_value_set_caps_features.invokeExact(
                value.handle(),
                features.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Sets {@code value} to the range specified by {@code start} and {@code end}.
 * @param value a GValue initialized to GST_TYPE_DOUBLE_RANGE
 * @param start the start of the range
 * @param end the end of the range
 */
public static void valueSetDoubleRange(org.gtk.gobject.Value value, double start, double end) {
    try {
        DowncallHandles.gst_value_set_double_range.invokeExact(
                value.handle(),
                start,
                end);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Sets {@code value} to the flags and mask values provided in {@code flags} and {@code mask}.
 * The {@code flags} value indicates the values of flags, the {@code mask} represents
 * which bits in the flag value have been set, and which are "don't care"
 * @param value a GValue initialized to {@code GST_TYPE_FLAG_SET}
 * @param flags The value of the flags set or unset
 * @param mask The mask indicate which flags bits must match for comparisons
 */
public static void valueSetFlagset(org.gtk.gobject.Value value, int flags, int mask) {
    try {
        DowncallHandles.gst_value_set_flagset.invokeExact(
                value.handle(),
                flags,
                mask);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Sets {@code value} to the fraction specified by {@code numerator} over {@code denominator}.
 * The fraction gets reduced to the smallest numerator and denominator,
 * and if necessary the sign is moved to the numerator.
 * @param value a GValue initialized to {@code GST_TYPE_FRACTION}
 * @param numerator the numerator of the fraction
 * @param denominator the denominator of the fraction
 */
public static void valueSetFraction(org.gtk.gobject.Value value, int numerator, int denominator) {
    try {
        DowncallHandles.gst_value_set_fraction.invokeExact(
                value.handle(),
                numerator,
                denominator);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Sets {@code value} to the range specified by {@code start} and {@code end}.
 * @param value a GValue initialized to GST_TYPE_FRACTION_RANGE
 * @param start the start of the range (a GST_TYPE_FRACTION GValue)
 * @param end the end of the range (a GST_TYPE_FRACTION GValue)
 */
public static void valueSetFractionRange(org.gtk.gobject.Value value, org.gtk.gobject.Value start, org.gtk.gobject.Value end) {
    try {
        DowncallHandles.gst_value_set_fraction_range.invokeExact(
                value.handle(),
                start.handle(),
                end.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Sets {@code value} to the range specified by {@code numerator_start}/{@code denominator_start}
 * and {@code numerator_end}/{@code denominator_end}.
 * @param value a GValue initialized to GST_TYPE_FRACTION_RANGE
 * @param numeratorStart the numerator start of the range
 * @param denominatorStart the denominator start of the range
 * @param numeratorEnd the numerator end of the range
 * @param denominatorEnd the denominator end of the range
 */
public static void valueSetFractionRangeFull(org.gtk.gobject.Value value, int numeratorStart, int denominatorStart, int numeratorEnd, int denominatorEnd) {
    try {
        DowncallHandles.gst_value_set_fraction_range_full.invokeExact(
                value.handle(),
                numeratorStart,
                denominatorStart,
                numeratorEnd,
                denominatorEnd);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Sets {@code value} to the range specified by {@code start} and {@code end}.
 * @param value a GValue initialized to GST_TYPE_INT64_RANGE
 * @param start the start of the range
 * @param end the end of the range
 */
public static void valueSetInt64Range(org.gtk.gobject.Value value, long start, long end) {
    try {
        DowncallHandles.gst_value_set_int64_range.invokeExact(
                value.handle(),
                start,
                end);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Sets {@code value} to the range specified by {@code start}, {@code end} and {@code step}.
 * @param value a GValue initialized to GST_TYPE_INT64_RANGE
 * @param start the start of the range
 * @param end the end of the range
 * @param step the step of the range
 */
public static void valueSetInt64RangeStep(org.gtk.gobject.Value value, long start, long end, long step) {
    try {
        DowncallHandles.gst_value_set_int64_range_step.invokeExact(
                value.handle(),
                start,
                end,
                step);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Sets {@code value} to the range specified by {@code start} and {@code end}.
 * @param value a GValue initialized to GST_TYPE_INT_RANGE
 * @param start the start of the range
 * @param end the end of the range
 */
public static void valueSetIntRange(org.gtk.gobject.Value value, int start, int end) {
    try {
        DowncallHandles.gst_value_set_int_range.invokeExact(
                value.handle(),
                start,
                end);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Sets {@code value} to the range specified by {@code start}, {@code end} and {@code step}.
 * @param value a GValue initialized to GST_TYPE_INT_RANGE
 * @param start the start of the range
 * @param end the end of the range
 * @param step the step of the range
 */
public static void valueSetIntRangeStep(org.gtk.gobject.Value value, int start, int end, int step) {
    try {
        DowncallHandles.gst_value_set_int_range_step.invokeExact(
                value.handle(),
                start,
                end,
                step);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Sets the contents of {@code value} to {@code structure}.
 * @param value a GValue initialized to GST_TYPE_STRUCTURE
 * @param structure the structure to set the value to
 */
public static void valueSetStructure(org.gtk.gobject.Value value, org.gstreamer.gst.Structure structure) {
    try {
        DowncallHandles.gst_value_set_structure.invokeExact(
                value.handle(),
                structure.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Subtracts {@code subtrahend} from {@code minuend} and stores the result in {@code dest}.
 * Note that this means subtraction as in sets, not as in mathematics.
 * @param dest the destination value
 *     for the result if the subtraction is not empty. May be {@code null},
 *     in which case the resulting set will not be computed, which can
 *     give a fair speedup.
 * @param minuend the value to subtract from
 * @param subtrahend the value to subtract
 * @return {@code true} if the subtraction is not empty
 */
public static boolean valueSubtract(@Nullable org.gtk.gobject.Value dest, org.gtk.gobject.Value minuend, org.gtk.gobject.Value subtrahend) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_subtract.invokeExact(
                (Addressable) (dest == null ? MemoryAddress.NULL : dest.handle()),
                minuend.handle(),
                subtrahend.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Creates a GValue corresponding to the union of {@code value1} and {@code value2}.
 * @param dest the destination value
 * @param value1 a value to union
 * @param value2 another value to union
 * @return {@code true} if the union succeeded.
 */
public static boolean valueUnion(org.gtk.gobject.Value dest, org.gtk.gobject.Value value1, org.gtk.gobject.Value value2) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_value_union.invokeExact(
                dest.handle(),
                value1.handle(),
                value2.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Gets the version number of the GStreamer library.
 * @param major pointer to a guint to store the major version number
 * @param minor pointer to a guint to store the minor version number
 * @param micro pointer to a guint to store the micro version number
 * @param nano pointer to a guint to store the nano version number
 */
public static void version(Out<Integer> major, Out<Integer> minor, Out<Integer> micro, Out<Integer> nano) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment majorPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment minorPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment microPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment nanoPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_version.invokeExact(
                    (Addressable) majorPOINTER.address(),
                    (Addressable) minorPOINTER.address(),
                    (Addressable) microPOINTER.address(),
                    (Addressable) nanoPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                major.set(majorPOINTER.get(Interop.valueLayout.C_INT, 0));
                minor.set(minorPOINTER.get(Interop.valueLayout.C_INT, 0));
                micro.set(microPOINTER.get(Interop.valueLayout.C_INT, 0));
                nano.set(nanoPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
}

/**
 * This function returns a string that is useful for describing this version
 * of GStreamer to the outside world: user agent strings, logging, ...
 * @return a newly allocated string describing this version
 *     of GStreamer.
 */
public static java.lang.String versionString() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_version_string.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}
    
    private static class DowncallHandles {

private static final MethodHandle gst_buffer_get_max_memory = Interop.downcallHandle(
        "gst_buffer_get_max_memory",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_calculate_linear_regression = Interop.downcallHandle(
        "gst_calculate_linear_regression",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_caps_features_from_string = Interop.downcallHandle(
        "gst_caps_features_from_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_caps_from_string = Interop.downcallHandle(
        "gst_caps_from_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_clear_mini_object = Interop.downcallHandle(
        "gst_clear_mini_object",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_clear_object = Interop.downcallHandle(
        "gst_clear_object",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_clear_structure = Interop.downcallHandle(
        "gst_clear_structure",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_core_error_quark = Interop.downcallHandle(
        "gst_core_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_debug_add_log_function = Interop.downcallHandle(
        "gst_debug_add_log_function",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_debug_add_ring_buffer_logger = Interop.downcallHandle(
        "gst_debug_add_ring_buffer_logger",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_debug_bin_to_dot_data = Interop.downcallHandle(
        "gst_debug_bin_to_dot_data",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_debug_bin_to_dot_file = Interop.downcallHandle(
        "gst_debug_bin_to_dot_file",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_debug_bin_to_dot_file_with_ts = Interop.downcallHandle(
        "gst_debug_bin_to_dot_file_with_ts",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_debug_construct_term_color = Interop.downcallHandle(
        "gst_debug_construct_term_color",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_debug_construct_win_color = Interop.downcallHandle(
        "gst_debug_construct_win_color",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_debug_get_all_categories = Interop.downcallHandle(
        "gst_debug_get_all_categories",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_debug_get_color_mode = Interop.downcallHandle(
        "gst_debug_get_color_mode",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_debug_get_default_threshold = Interop.downcallHandle(
        "gst_debug_get_default_threshold",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_debug_get_stack_trace = Interop.downcallHandle(
        "gst_debug_get_stack_trace",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_debug_is_active = Interop.downcallHandle(
        "gst_debug_is_active",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_debug_is_colored = Interop.downcallHandle(
        "gst_debug_is_colored",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_debug_level_get_name = Interop.downcallHandle(
        "gst_debug_level_get_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_debug_log = Interop.downcallHandle(
        "gst_debug_log",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle gst_debug_log_default = Interop.downcallHandle(
        "gst_debug_log_default",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_debug_log_get_line = Interop.downcallHandle(
        "gst_debug_log_get_line",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_debug_log_literal = Interop.downcallHandle(
        "gst_debug_log_literal",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_debug_log_valist = Interop.downcallHandle(
        "gst_debug_log_valist",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_debug_print_stack_trace = Interop.downcallHandle(
        "gst_debug_print_stack_trace",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle gst_debug_remove_log_function = Interop.downcallHandle(
        "gst_debug_remove_log_function",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_debug_remove_log_function_by_data = Interop.downcallHandle(
        "gst_debug_remove_log_function_by_data",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_debug_remove_ring_buffer_logger = Interop.downcallHandle(
        "gst_debug_remove_ring_buffer_logger",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle gst_debug_ring_buffer_logger_get_logs = Interop.downcallHandle(
        "gst_debug_ring_buffer_logger_get_logs",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle gst_debug_set_active = Interop.downcallHandle(
        "gst_debug_set_active",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_debug_set_color_mode = Interop.downcallHandle(
        "gst_debug_set_color_mode",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_debug_set_color_mode_from_string = Interop.downcallHandle(
        "gst_debug_set_color_mode_from_string",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_debug_set_colored = Interop.downcallHandle(
        "gst_debug_set_colored",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_debug_set_default_threshold = Interop.downcallHandle(
        "gst_debug_set_default_threshold",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_debug_set_threshold_for_name = Interop.downcallHandle(
        "gst_debug_set_threshold_for_name",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_debug_set_threshold_from_string = Interop.downcallHandle(
        "gst_debug_set_threshold_from_string",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_debug_unset_threshold_for_name = Interop.downcallHandle(
        "gst_debug_unset_threshold_for_name",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_deinit = Interop.downcallHandle(
        "gst_deinit",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle gst_dynamic_type_register = Interop.downcallHandle(
        "gst_dynamic_type_register",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_error_get_message = Interop.downcallHandle(
        "gst_error_get_message",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_event_type_get_flags = Interop.downcallHandle(
        "gst_event_type_get_flags",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_event_type_get_name = Interop.downcallHandle(
        "gst_event_type_get_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_event_type_to_quark = Interop.downcallHandle(
        "gst_event_type_to_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_filename_to_uri = Interop.downcallHandle(
        "gst_filename_to_uri",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_flow_get_name = Interop.downcallHandle(
        "gst_flow_get_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_flow_to_quark = Interop.downcallHandle(
        "gst_flow_to_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_format_get_by_nick = Interop.downcallHandle(
        "gst_format_get_by_nick",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_format_get_details = Interop.downcallHandle(
        "gst_format_get_details",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_format_get_name = Interop.downcallHandle(
        "gst_format_get_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_format_iterate_definitions = Interop.downcallHandle(
        "gst_format_iterate_definitions",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_format_register = Interop.downcallHandle(
        "gst_format_register",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_format_to_quark = Interop.downcallHandle(
        "gst_format_to_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_formats_contains = Interop.downcallHandle(
        "gst_formats_contains",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_get_main_executable_path = Interop.downcallHandle(
        "gst_get_main_executable_path",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_info_strdup_printf = Interop.downcallHandle(
        "gst_info_strdup_printf",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle gst_info_strdup_vprintf = Interop.downcallHandle(
        "gst_info_strdup_vprintf",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_info_vasprintf = Interop.downcallHandle(
        "gst_info_vasprintf",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_init = Interop.downcallHandle(
        "gst_init",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_init_check = Interop.downcallHandle(
        "gst_init_check",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_init_get_option_group = Interop.downcallHandle(
        "gst_init_get_option_group",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_is_caps_features = Interop.downcallHandle(
        "gst_is_caps_features",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_is_initialized = Interop.downcallHandle(
        "gst_is_initialized",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_library_error_quark = Interop.downcallHandle(
        "gst_library_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_make_element_message_details = Interop.downcallHandle(
        "gst_make_element_message_details",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle gst_message_replace = Interop.downcallHandle(
        "gst_message_replace",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_message_type_get_name = Interop.downcallHandle(
        "gst_message_type_get_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_message_type_to_quark = Interop.downcallHandle(
        "gst_message_type_to_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_meta_api_type_get_tags = Interop.downcallHandle(
        "gst_meta_api_type_get_tags",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_meta_api_type_has_tag = Interop.downcallHandle(
        "gst_meta_api_type_has_tag",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_meta_api_type_register = Interop.downcallHandle(
        "gst_meta_api_type_register",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_meta_get_info = Interop.downcallHandle(
        "gst_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_meta_register = Interop.downcallHandle(
        "gst_meta_register",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_meta_register_custom = Interop.downcallHandle(
        "gst_meta_register_custom",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_mini_object_replace = Interop.downcallHandle(
        "gst_mini_object_replace",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_mini_object_steal = Interop.downcallHandle(
        "gst_mini_object_steal",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_mini_object_take = Interop.downcallHandle(
        "gst_mini_object_take",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_pad_mode_get_name = Interop.downcallHandle(
        "gst_pad_mode_get_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_param_spec_array = Interop.downcallHandle(
        "gst_param_spec_array",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_param_spec_fraction = Interop.downcallHandle(
        "gst_param_spec_fraction",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_parent_buffer_meta_api_get_type = Interop.downcallHandle(
        "gst_parent_buffer_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_parent_buffer_meta_get_info = Interop.downcallHandle(
        "gst_parent_buffer_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_parse_bin_from_description = Interop.downcallHandle(
        "gst_parse_bin_from_description",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_parse_bin_from_description_full = Interop.downcallHandle(
        "gst_parse_bin_from_description_full",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_parse_error_quark = Interop.downcallHandle(
        "gst_parse_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_parse_launch = Interop.downcallHandle(
        "gst_parse_launch",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_parse_launch_full = Interop.downcallHandle(
        "gst_parse_launch_full",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_parse_launchv = Interop.downcallHandle(
        "gst_parse_launchv",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_parse_launchv_full = Interop.downcallHandle(
        "gst_parse_launchv_full",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_plugin_error_quark = Interop.downcallHandle(
        "gst_plugin_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_poll_new = Interop.downcallHandle(
        "gst_poll_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_poll_new_timer = Interop.downcallHandle(
        "gst_poll_new_timer",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_preset_get_app_dir = Interop.downcallHandle(
        "gst_preset_get_app_dir",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_preset_set_app_dir = Interop.downcallHandle(
        "gst_preset_set_app_dir",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_print = Interop.downcallHandle(
        "gst_print",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle gst_printerr = Interop.downcallHandle(
        "gst_printerr",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle gst_printerrln = Interop.downcallHandle(
        "gst_printerrln",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle gst_println = Interop.downcallHandle(
        "gst_println",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle gst_protection_filter_systems_by_available_decryptors = Interop.downcallHandle(
        "gst_protection_filter_systems_by_available_decryptors",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_protection_meta_api_get_type = Interop.downcallHandle(
        "gst_protection_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_protection_meta_get_info = Interop.downcallHandle(
        "gst_protection_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_protection_select_system = Interop.downcallHandle(
        "gst_protection_select_system",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_query_type_get_flags = Interop.downcallHandle(
        "gst_query_type_get_flags",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_query_type_get_name = Interop.downcallHandle(
        "gst_query_type_get_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_query_type_to_quark = Interop.downcallHandle(
        "gst_query_type_to_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_reference_timestamp_meta_api_get_type = Interop.downcallHandle(
        "gst_reference_timestamp_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_reference_timestamp_meta_get_info = Interop.downcallHandle(
        "gst_reference_timestamp_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_resource_error_quark = Interop.downcallHandle(
        "gst_resource_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_segtrap_is_enabled = Interop.downcallHandle(
        "gst_segtrap_is_enabled",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_segtrap_set_enabled = Interop.downcallHandle(
        "gst_segtrap_set_enabled",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_state_change_get_name = Interop.downcallHandle(
        "gst_state_change_get_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_static_caps_get_type = Interop.downcallHandle(
        "gst_static_caps_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_static_pad_template_get_type = Interop.downcallHandle(
        "gst_static_pad_template_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_stream_error_quark = Interop.downcallHandle(
        "gst_stream_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_stream_type_get_name = Interop.downcallHandle(
        "gst_stream_type_get_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_structure_take = Interop.downcallHandle(
        "gst_structure_take",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_exists = Interop.downcallHandle(
        "gst_tag_exists",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_get_description = Interop.downcallHandle(
        "gst_tag_get_description",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_get_flag = Interop.downcallHandle(
        "gst_tag_get_flag",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_get_nick = Interop.downcallHandle(
        "gst_tag_get_nick",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_get_type = Interop.downcallHandle(
        "gst_tag_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_is_fixed = Interop.downcallHandle(
        "gst_tag_is_fixed",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_list_copy_value = Interop.downcallHandle(
        "gst_tag_list_copy_value",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_merge_strings_with_comma = Interop.downcallHandle(
        "gst_tag_merge_strings_with_comma",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_merge_use_first = Interop.downcallHandle(
        "gst_tag_merge_use_first",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_register = Interop.downcallHandle(
        "gst_tag_register",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_register_static = Interop.downcallHandle(
        "gst_tag_register_static",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_toc_entry_type_get_nick = Interop.downcallHandle(
        "gst_toc_entry_type_get_nick",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_tracing_get_active_tracers = Interop.downcallHandle(
        "gst_tracing_get_active_tracers",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tracing_register_hook = Interop.downcallHandle(
        "gst_tracing_register_hook",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_type_find_get_type = Interop.downcallHandle(
        "gst_type_find_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_type_find_register = Interop.downcallHandle(
        "gst_type_find_register",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_type_is_plugin_api = Interop.downcallHandle(
        "gst_type_is_plugin_api",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_type_mark_as_plugin_api = Interop.downcallHandle(
        "gst_type_mark_as_plugin_api",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_update_registry = Interop.downcallHandle(
        "gst_update_registry",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_uri_construct = Interop.downcallHandle(
        "gst_uri_construct",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_uri_error_quark = Interop.downcallHandle(
        "gst_uri_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_uri_from_string = Interop.downcallHandle(
        "gst_uri_from_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_uri_from_string_escaped = Interop.downcallHandle(
        "gst_uri_from_string_escaped",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_uri_get_location = Interop.downcallHandle(
        "gst_uri_get_location",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_uri_get_protocol = Interop.downcallHandle(
        "gst_uri_get_protocol",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_uri_has_protocol = Interop.downcallHandle(
        "gst_uri_has_protocol",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_uri_is_valid = Interop.downcallHandle(
        "gst_uri_is_valid",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_uri_join_strings = Interop.downcallHandle(
        "gst_uri_join_strings",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_uri_protocol_is_supported = Interop.downcallHandle(
        "gst_uri_protocol_is_supported",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_uri_protocol_is_valid = Interop.downcallHandle(
        "gst_uri_protocol_is_valid",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_util_array_binary_search = Interop.downcallHandle(
        "gst_util_array_binary_search",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_util_double_to_fraction = Interop.downcallHandle(
        "gst_util_double_to_fraction",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_util_dump_buffer = Interop.downcallHandle(
        "gst_util_dump_buffer",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_util_dump_mem = Interop.downcallHandle(
        "gst_util_dump_mem",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_util_fraction_add = Interop.downcallHandle(
        "gst_util_fraction_add",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_util_fraction_compare = Interop.downcallHandle(
        "gst_util_fraction_compare",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_util_fraction_multiply = Interop.downcallHandle(
        "gst_util_fraction_multiply",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_util_fraction_to_double = Interop.downcallHandle(
        "gst_util_fraction_to_double",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_util_gdouble_to_guint64 = Interop.downcallHandle(
        "gst_util_gdouble_to_guint64",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle gst_util_get_object_array = Interop.downcallHandle(
        "gst_util_get_object_array",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_util_get_timestamp = Interop.downcallHandle(
        "gst_util_get_timestamp",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_util_greatest_common_divisor = Interop.downcallHandle(
        "gst_util_greatest_common_divisor",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_util_greatest_common_divisor_int64 = Interop.downcallHandle(
        "gst_util_greatest_common_divisor_int64",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_util_group_id_next = Interop.downcallHandle(
        "gst_util_group_id_next",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_util_guint64_to_gdouble = Interop.downcallHandle(
        "gst_util_guint64_to_gdouble",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_util_seqnum_compare = Interop.downcallHandle(
        "gst_util_seqnum_compare",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_util_seqnum_next = Interop.downcallHandle(
        "gst_util_seqnum_next",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_util_set_object_arg = Interop.downcallHandle(
        "gst_util_set_object_arg",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_util_set_object_array = Interop.downcallHandle(
        "gst_util_set_object_array",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_util_set_value_from_string = Interop.downcallHandle(
        "gst_util_set_value_from_string",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_util_uint64_scale = Interop.downcallHandle(
        "gst_util_uint64_scale",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_util_uint64_scale_ceil = Interop.downcallHandle(
        "gst_util_uint64_scale_ceil",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_util_uint64_scale_int = Interop.downcallHandle(
        "gst_util_uint64_scale_int",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_util_uint64_scale_int_ceil = Interop.downcallHandle(
        "gst_util_uint64_scale_int_ceil",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_util_uint64_scale_int_round = Interop.downcallHandle(
        "gst_util_uint64_scale_int_round",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_util_uint64_scale_round = Interop.downcallHandle(
        "gst_util_uint64_scale_round",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_value_can_compare = Interop.downcallHandle(
        "gst_value_can_compare",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_can_intersect = Interop.downcallHandle(
        "gst_value_can_intersect",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_can_subtract = Interop.downcallHandle(
        "gst_value_can_subtract",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_can_union = Interop.downcallHandle(
        "gst_value_can_union",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_compare = Interop.downcallHandle(
        "gst_value_compare",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_deserialize = Interop.downcallHandle(
        "gst_value_deserialize",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_deserialize_with_pspec = Interop.downcallHandle(
        "gst_value_deserialize_with_pspec",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_fixate = Interop.downcallHandle(
        "gst_value_fixate",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_fraction_multiply = Interop.downcallHandle(
        "gst_value_fraction_multiply",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_fraction_subtract = Interop.downcallHandle(
        "gst_value_fraction_subtract",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_bitmask = Interop.downcallHandle(
        "gst_value_get_bitmask",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_caps = Interop.downcallHandle(
        "gst_value_get_caps",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_caps_features = Interop.downcallHandle(
        "gst_value_get_caps_features",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_double_range_max = Interop.downcallHandle(
        "gst_value_get_double_range_max",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_double_range_min = Interop.downcallHandle(
        "gst_value_get_double_range_min",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_flagset_flags = Interop.downcallHandle(
        "gst_value_get_flagset_flags",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_flagset_mask = Interop.downcallHandle(
        "gst_value_get_flagset_mask",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_fraction_denominator = Interop.downcallHandle(
        "gst_value_get_fraction_denominator",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_fraction_numerator = Interop.downcallHandle(
        "gst_value_get_fraction_numerator",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_fraction_range_max = Interop.downcallHandle(
        "gst_value_get_fraction_range_max",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_fraction_range_min = Interop.downcallHandle(
        "gst_value_get_fraction_range_min",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_int64_range_max = Interop.downcallHandle(
        "gst_value_get_int64_range_max",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_int64_range_min = Interop.downcallHandle(
        "gst_value_get_int64_range_min",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_int64_range_step = Interop.downcallHandle(
        "gst_value_get_int64_range_step",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_int_range_max = Interop.downcallHandle(
        "gst_value_get_int_range_max",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_int_range_min = Interop.downcallHandle(
        "gst_value_get_int_range_min",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_int_range_step = Interop.downcallHandle(
        "gst_value_get_int_range_step",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_get_structure = Interop.downcallHandle(
        "gst_value_get_structure",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_init_and_copy = Interop.downcallHandle(
        "gst_value_init_and_copy",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_intersect = Interop.downcallHandle(
        "gst_value_intersect",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_is_fixed = Interop.downcallHandle(
        "gst_value_is_fixed",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_is_subset = Interop.downcallHandle(
        "gst_value_is_subset",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_register = Interop.downcallHandle(
        "gst_value_register",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_serialize = Interop.downcallHandle(
        "gst_value_serialize",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_set_bitmask = Interop.downcallHandle(
        "gst_value_set_bitmask",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_value_set_caps = Interop.downcallHandle(
        "gst_value_set_caps",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_set_caps_features = Interop.downcallHandle(
        "gst_value_set_caps_features",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_set_double_range = Interop.downcallHandle(
        "gst_value_set_double_range",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle gst_value_set_flagset = Interop.downcallHandle(
        "gst_value_set_flagset",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_value_set_fraction = Interop.downcallHandle(
        "gst_value_set_fraction",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_value_set_fraction_range = Interop.downcallHandle(
        "gst_value_set_fraction_range",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_set_fraction_range_full = Interop.downcallHandle(
        "gst_value_set_fraction_range_full",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_value_set_int64_range = Interop.downcallHandle(
        "gst_value_set_int64_range",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_value_set_int64_range_step = Interop.downcallHandle(
        "gst_value_set_int64_range_step",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_value_set_int_range = Interop.downcallHandle(
        "gst_value_set_int_range",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_value_set_int_range_step = Interop.downcallHandle(
        "gst_value_set_int_range_step",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_value_set_structure = Interop.downcallHandle(
        "gst_value_set_structure",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_subtract = Interop.downcallHandle(
        "gst_value_subtract",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_value_union = Interop.downcallHandle(
        "gst_value_union",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_version = Interop.downcallHandle(
        "gst_version",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_version_string = Interop.downcallHandle(
        "gst_version_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
    
    private static void registerTypes() {
        if (Allocator.isAvailable()) Interop.register(Allocator.getType(), Allocator.fromAddress);
        if (Bin.isAvailable()) Interop.register(Bin.getType(), Bin.fromAddress);
        if (Bitmask.isAvailable()) Interop.register(Bitmask.getType(), Bitmask.fromAddress);
        if (BufferPool.isAvailable()) Interop.register(BufferPool.getType(), BufferPool.fromAddress);
        if (Bus.isAvailable()) Interop.register(Bus.getType(), Bus.fromAddress);
        if (Clock.isAvailable()) Interop.register(Clock.getType(), Clock.fromAddress);
        if (ControlBinding.isAvailable()) Interop.register(ControlBinding.getType(), ControlBinding.fromAddress);
        if (ControlSource.isAvailable()) Interop.register(ControlSource.getType(), ControlSource.fromAddress);
        if (Device.isAvailable()) Interop.register(Device.getType(), Device.fromAddress);
        if (DeviceMonitor.isAvailable()) Interop.register(DeviceMonitor.getType(), DeviceMonitor.fromAddress);
        if (DeviceProvider.isAvailable()) Interop.register(DeviceProvider.getType(), DeviceProvider.fromAddress);
        if (DeviceProviderFactory.isAvailable()) Interop.register(DeviceProviderFactory.getType(), DeviceProviderFactory.fromAddress);
        if (DoubleRange.isAvailable()) Interop.register(DoubleRange.getType(), DoubleRange.fromAddress);
        if (DynamicTypeFactory.isAvailable()) Interop.register(DynamicTypeFactory.getType(), DynamicTypeFactory.fromAddress);
        if (Element.isAvailable()) Interop.register(Element.getType(), Element.fromAddress);
        if (ElementFactory.isAvailable()) Interop.register(ElementFactory.getType(), ElementFactory.fromAddress);
        if (FlagSet.isAvailable()) Interop.register(FlagSet.getType(), FlagSet.fromAddress);
        if (Fraction.isAvailable()) Interop.register(Fraction.getType(), Fraction.fromAddress);
        if (FractionRange.isAvailable()) Interop.register(FractionRange.getType(), FractionRange.fromAddress);
        if (GhostPad.isAvailable()) Interop.register(GhostPad.getType(), GhostPad.fromAddress);
        if (Int64Range.isAvailable()) Interop.register(Int64Range.getType(), Int64Range.fromAddress);
        if (IntRange.isAvailable()) Interop.register(IntRange.getType(), IntRange.fromAddress);
        if (GstObject.isAvailable()) Interop.register(GstObject.getType(), GstObject.fromAddress);
        if (Pad.isAvailable()) Interop.register(Pad.getType(), Pad.fromAddress);
        if (PadTemplate.isAvailable()) Interop.register(PadTemplate.getType(), PadTemplate.fromAddress);
        if (ParamArray.isAvailable()) Interop.register(ParamArray.getType(), ParamArray.fromAddress);
        if (ParamFraction.isAvailable()) Interop.register(ParamFraction.getType(), ParamFraction.fromAddress);
        if (Pipeline.isAvailable()) Interop.register(Pipeline.getType(), Pipeline.fromAddress);
        if (Plugin.isAvailable()) Interop.register(Plugin.getType(), Plugin.fromAddress);
        if (PluginFeature.isAvailable()) Interop.register(PluginFeature.getType(), PluginFeature.fromAddress);
        if (ProxyPad.isAvailable()) Interop.register(ProxyPad.getType(), ProxyPad.fromAddress);
        if (Registry.isAvailable()) Interop.register(Registry.getType(), Registry.fromAddress);
        if (SharedTaskPool.isAvailable()) Interop.register(SharedTaskPool.getType(), SharedTaskPool.fromAddress);
        if (Stream.isAvailable()) Interop.register(Stream.getType(), Stream.fromAddress);
        if (StreamCollection.isAvailable()) Interop.register(StreamCollection.getType(), StreamCollection.fromAddress);
        if (SystemClock.isAvailable()) Interop.register(SystemClock.getType(), SystemClock.fromAddress);
        if (Task.isAvailable()) Interop.register(Task.getType(), Task.fromAddress);
        if (TaskPool.isAvailable()) Interop.register(TaskPool.getType(), TaskPool.fromAddress);
        if (Tracer.isAvailable()) Interop.register(Tracer.getType(), Tracer.fromAddress);
        if (TracerFactory.isAvailable()) Interop.register(TracerFactory.getType(), TracerFactory.fromAddress);
        if (TracerRecord.isAvailable()) Interop.register(TracerRecord.getType(), TracerRecord.fromAddress);
        if (TypeFindFactory.isAvailable()) Interop.register(TypeFindFactory.getType(), TypeFindFactory.fromAddress);
        if (ValueArray.isAvailable()) Interop.register(ValueArray.getType(), ValueArray.fromAddress);
        if (ValueList.isAvailable()) Interop.register(ValueList.getType(), ValueList.fromAddress);
        if (ChildProxy.isAvailable()) Interop.register(ChildProxy.getType(), ChildProxy.fromAddress);
        if (Preset.isAvailable()) Interop.register(Preset.getType(), Preset.fromAddress);
        if (TagSetter.isAvailable()) Interop.register(TagSetter.getType(), TagSetter.fromAddress);
        if (TocSetter.isAvailable()) Interop.register(TocSetter.getType(), TocSetter.fromAddress);
        if (URIHandler.isAvailable()) Interop.register(URIHandler.getType(), URIHandler.fromAddress);
    }
}
