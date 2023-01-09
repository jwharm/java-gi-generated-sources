package org.gstreamer.tag;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstTag namespace.
 */
public final class GstTag {
    
    static {
        LibLoad.loadLibrary("gsttag-1.0");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
/**
 * AcoustID Fingerprint (Chromaprint)
 */
public static final java.lang.String TAG_ACOUSTID_FINGERPRINT = "chromaprint-fingerprint";
    
/**
 * AcoustID Identifier
 */
public static final java.lang.String TAG_ACOUSTID_ID = "acoustid-id";
    
/**
 * Direction of contrast processing applied when capturing an image. (string)
 * <p>
 * The allowed values are:
 *  "normal"
 *  "soft"
 *  "hard"
 */
public static final java.lang.String TAG_CAPTURING_CONTRAST = "capturing-contrast";
    
/**
 * Digital zoom ratio used when capturing an image. (double)
 */
public static final java.lang.String TAG_CAPTURING_DIGITAL_ZOOM_RATIO = "capturing-digital-zoom-ratio";
    
/**
 * Exposure compensation using when capturing an image in EV. (double)
 */
public static final java.lang.String TAG_CAPTURING_EXPOSURE_COMPENSATION = "capturing-exposure-compensation";
    
/**
 * Exposure mode used when capturing an image. (string)
 * <p>
 * The allowed values are:
 *   "auto-exposure"
 *   "manual-exposure"
 *   "auto-bracket"
 */
public static final java.lang.String TAG_CAPTURING_EXPOSURE_MODE = "capturing-exposure-mode";
    
/**
 * Type of exposure control used when capturing an image. (string)
 * <p>
 * The allowed values are:
 *   "undefined"
 *   "manual"
 *   "normal" - automatically controlled
 *   "aperture-priority" - user selects aperture value
 *   "shutter-priority" - user selects shutter speed
 *   "creative" - biased towards depth of field
 *   "action" - biased towards fast shutter speed
 *   "portrait" - closeup, leaving background out of focus
 *   "landscape" - landscape photos, background in focus
 */
public static final java.lang.String TAG_CAPTURING_EXPOSURE_PROGRAM = "capturing-exposure-program";
    
/**
 * If flash was fired during the capture of an image. (boolean)
 * <p>
 * Note that if this tag isn't present, it should not be assumed that
 * the flash did not fire. It should be treated as unknown.
 */
public static final java.lang.String TAG_CAPTURING_FLASH_FIRED = "capturing-flash-fired";
    
/**
 * The flash mode selected during the capture of an image. (string)
 * <p>
 * The allowed values are:
 *  "auto"
 *  "always"
 *  "never"
 */
public static final java.lang.String TAG_CAPTURING_FLASH_MODE = "capturing-flash-mode";
    
/**
 * Focal length used when capturing an image, in mm. (double)
 */
public static final java.lang.String TAG_CAPTURING_FOCAL_LENGTH = "capturing-focal-length";
    
/**
 * 35 mm equivalent focal length used when capturing an image, in mm. (double)
 */
public static final java.lang.String TAG_CAPTURING_FOCAL_LENGTH_35_MM = "capturing-focal-length-35mm";
    
/**
 * Focal ratio (f-number) used when capturing an image. (double)
 * <p>
 * The value stored is the denominator of the focal ratio (f-number).
 * For example, if this tag value is 2, the focal ratio is f/2.
 */
public static final java.lang.String TAG_CAPTURING_FOCAL_RATIO = "capturing-focal-ratio";
    
/**
 * Gain adjustment applied to an image. (string)
 * <p>
 * The allowed values are:
 *   "none"
 *   "low-gain-up"
 *   "high-gain-up"
 *   "low-gain-down"
 *   "high-gain-down"
 */
public static final java.lang.String TAG_CAPTURING_GAIN_ADJUSTMENT = "capturing-gain-adjustment";
    
/**
 * ISO speed used when capturing an image. (integer)
 */
public static final java.lang.String TAG_CAPTURING_ISO_SPEED = "capturing-iso-speed";
    
/**
 * Defines the way a camera determines the exposure. (string)
 * <p>
 * The allowed values are:
 *   "unknown"
 *   "average"
 *   "center-weighted-average"
 *   "spot"
 *   "multi-spot"
 *   "pattern"
 *   "partial"
 *   "other"
 */
public static final java.lang.String TAG_CAPTURING_METERING_MODE = "capturing-metering-mode";
    
/**
 * Direction of saturation processing applied when capturing an image. (string)
 * <p>
 * The allowed values are:
 *  "normal"
 *  "low-saturation"
 *  "high-saturation"
 */
public static final java.lang.String TAG_CAPTURING_SATURATION = "capturing-saturation";
    
/**
 * Scene mode used when capturing an image. (string)
 * <p>
 * The allowed values are:
 *   "standard"
 *   "landscape"
 *   "portrait"
 *   "night-scene"
 */
public static final java.lang.String TAG_CAPTURING_SCENE_CAPTURE_TYPE = "capturing-scene-capture-type";
    
/**
 * Direction of sharpness processing applied when capturing an image. (string)
 * <p>
 * The allowed values are:
 *  "normal"
 *  "soft"
 *  "hard"
 */
public static final java.lang.String TAG_CAPTURING_SHARPNESS = "capturing-sharpness";
    
/**
 * Shutter speed used when capturing an image, in seconds. (fraction)
 */
public static final java.lang.String TAG_CAPTURING_SHUTTER_SPEED = "capturing-shutter-speed";
    
/**
 * Indicates the source of capture. The device/medium used to do the
 * capture. (string)
 * <p>
 * Allowed values are:
 *   "dsc" (= digital still camera)
 *   "transparent-scanner"
 *   "reflex-scanner"
 *   "other"
 */
public static final java.lang.String TAG_CAPTURING_SOURCE = "capturing-source";
    
/**
 * White balance mode used when capturing an image. (string)
 * <p>
 * The allowed values are:
 *   "auto"
 *   "manual"
 *   "daylight"
 *   "cloudy"
 *   "tungsten"
 *   "fluorescent"
 *   "fluorescent h" (newer daylight-calibrated fluorescents)
 *   "flash"
 */
public static final java.lang.String TAG_CAPTURING_WHITE_BALANCE = "capturing-white-balance";
    
/**
 * CDDB disc id in its short form (e.g. 'aa063d0f')
 */
public static final java.lang.String TAG_CDDA_CDDB_DISCID = "discid";
    
/**
 * CDDB disc id including all details
 */
public static final java.lang.String TAG_CDDA_CDDB_DISCID_FULL = "discid-full";
    
/**
 * Musicbrainz disc id (e.g. 'ahg7JUcfR3vCYBphSDIogOOWrr0-')
 */
public static final java.lang.String TAG_CDDA_MUSICBRAINZ_DISCID = "musicbrainz-discid";
    
/**
 * Musicbrainz disc id details
 */
public static final java.lang.String TAG_CDDA_MUSICBRAINZ_DISCID_FULL = "musicbrainz-discid-full";
    
/**
 * Annodex CMML clip element tag
 */
public static final java.lang.String TAG_CMML_CLIP = "cmml-clip";
    
/**
 * Annodex CMML head element tag
 */
public static final java.lang.String TAG_CMML_HEAD = "cmml-head";
    
/**
 * Annodex CMML stream element tag
 */
public static final java.lang.String TAG_CMML_STREAM = "cmml-stream";
    
/**
 * ID3V2 header size considered minimum input for some functions such as
 * gst_tag_list_from_id3v2_tag() and gst_tag_get_id3v2_tag_size() for example.
 */
public static final int TAG_ID3V2_HEADER_SIZE = 10;
    
/**
 * Media (image/video) intended horizontal pixel density in ppi. (double)
 */
public static final java.lang.String TAG_IMAGE_HORIZONTAL_PPI = "image-horizontal-ppi";
    
/**
 * Media (image/video) intended vertical pixel density in ppi. (double)
 */
public static final java.lang.String TAG_IMAGE_VERTICAL_PPI = "image-vertical-ppi";
    
/**
 * Musical key in which the sound starts. It is represented as a string
 * with a maximum length of three characters. The ground keys are
 * represented with "A","B","C","D","E", "F" and "G" and halfkeys
 * represented with "b" and "{@code "}. Minor is represented as "m" (e.g. "Dbm").
 * Off key is represented with an "o" only.
 * This notation might be extended in the future to support non-minor/major
 * keys.
 */
public static final java.lang.String TAG_MUSICAL_KEY = "musical-key";
    
/**
 * MusicBrainz album artist ID
 */
public static final java.lang.String TAG_MUSICBRAINZ_ALBUMARTISTID = "musicbrainz-albumartistid";
    
/**
 * MusicBrainz album ID
 */
public static final java.lang.String TAG_MUSICBRAINZ_ALBUMID = "musicbrainz-albumid";
    
/**
 * MusicBrainz artist ID
 */
public static final java.lang.String TAG_MUSICBRAINZ_ARTISTID = "musicbrainz-artistid";
    
/**
 * MusicBrainz Release Group ID
 */
public static final java.lang.String TAG_MUSICBRAINZ_RELEASEGROUPID = "musicbrainz-releasegroupid";
    
/**
 * MusicBrainz Release Track ID
 */
public static final java.lang.String TAG_MUSICBRAINZ_RELEASETRACKID = "musicbrainz-releasetrackid";
    
/**
 * MusicBrainz track ID
 */
public static final java.lang.String TAG_MUSICBRAINZ_TRACKID = "musicbrainz-trackid";
    
/**
 * MusicBrainz track TRM ID
 */
public static final java.lang.String TAG_MUSICBRAINZ_TRMID = "musicbrainz-trmid";

/**
 * Check if a given string contains a known ISO 639 language code.
 * <p>
 * This is useful in situations where it's not clear whether a given
 * string is a language code (which should be put into a {@code GST_TAG_LANGUAGE_CODE}
 * tag) or a free-form language name descriptor (which should be put into a
 * {@code GST_TAG_LANGUAGE_NAME} tag instead).
 * @param langCode ISO-639 language code (e.g. "deu" or "ger" or "de")
 * @return TRUE if the two- or three-letter language code in {@code lang_code}
 *     is a valid ISO-639 language code.
 */
public static boolean tagCheckLanguageCode(java.lang.String langCode) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_check_language_code.invokeExact(Marshal.stringToAddress.marshal(langCode, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Convenience function to read a string with unknown character encoding. If
 * the string is already in UTF-8 encoding, it will be returned right away.
 * If not it tries to detect byte-order-mark for UTF-16/32 cases and use that.
 * Otherwise, the environment will be searched for a number of environment
 * variables (whose names are specified in the NULL-terminated string array
 * {@code env_vars}) containing a list of character encodings to try/use. If none
 * are specified, the current locale will be tried. If that also doesn't work,
 * WINDOWS-1252/ISO-8859-1 is assumed (which will almost always succeed).
 * @param data string data
 * @param size length of string data, or -1 if the string is NUL-terminated
 * @param envVars a NULL-terminated string array of environment variable names, or NULL
 * @return a newly-allocated string in UTF-8 encoding, or NULL
 */
public static java.lang.String tagFreeformStringToUtf8(byte[] data, int size, java.lang.String[] envVars) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_freeform_string_to_utf8.invokeExact(
                    Interop.allocateNativeArray(data, false, SCOPE),
                    size,
                    Interop.allocateNativeArray(envVars, false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Looks up the GStreamer tag for a ID3v2 tag.
 * @param id3Tag ID3v2 tag to convert to GStreamer tag
 * @return The corresponding GStreamer tag or NULL if none exists.
 */
public static java.lang.String tagFromId3Tag(java.lang.String id3Tag) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_from_id3_tag.invokeExact(Marshal.stringToAddress.marshal(id3Tag, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Looks up the GStreamer tag for an ID3v2 user tag (e.g. description in
 * TXXX frame or owner in UFID frame).
 * @param type the type of ID3v2 user tag (e.g. "TXXX" or "UDIF")
 * @param id3UserTag ID3v2 user tag to convert to GStreamer tag
 * @return The corresponding GStreamer tag or NULL if none exists.
 */
public static java.lang.String tagFromId3UserTag(java.lang.String type, java.lang.String id3UserTag) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_from_id3_user_tag.invokeExact(
                    Marshal.stringToAddress.marshal(type, SCOPE),
                    Marshal.stringToAddress.marshal(id3UserTag, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Looks up the GStreamer tag for a vorbiscomment tag.
 * @param vorbisTag vorbiscomment tag to convert to GStreamer tag
 * @return The corresponding GStreamer tag or NULL if none exists.
 */
public static java.lang.String tagFromVorbisTag(java.lang.String vorbisTag) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_from_vorbis_tag.invokeExact(Marshal.stringToAddress.marshal(vorbisTag, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Determines size of an ID3v2 tag on buffer containing at least ID3v2 header,
 * i.e. at least {@code GST_TAG_ID3V2_HEADER_SIZE} (10) bytes;
 * @param buffer buffer holding ID3v2 tag (or at least the start of one)
 * @return Size of tag, or 0 if header is invalid or too small.
 */
public static int tagGetId3v2TagSize(org.gstreamer.gst.Buffer buffer) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_tag_get_id3v2_tag_size.invokeExact(buffer.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Returns two-letter ISO-639-1 language code given a three-letter ISO-639-2
 * language code or two-letter ISO-639-1 language code (both are accepted for
 * convenience).
 * <p>
 * Language codes are case-sensitive and expected to be lower case.
 * @param langCode ISO-639 language code (e.g. "deu" or "ger" or "de")
 * @return two-letter ISO-639-1 language code string that maps to {@code lang_code},
 *     or NULL if no mapping is known. The returned string must not be
 *     modified or freed.
 */
public static java.lang.String tagGetLanguageCodeIso6391(java.lang.String langCode) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_get_language_code_iso_639_1.invokeExact(Marshal.stringToAddress.marshal(langCode, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Returns three-letter ISO-639-2 "bibliographic" language code given a
 * two-letter ISO-639-1 language code or a three-letter ISO-639-2 language
 * code (both are accepted for convenience).
 * <p>
 * The "bibliographic" code is derived from the English name of the language
 * (e.g. "ger" for German instead of "de" or "deu"). In most scenarios, the
 * "terminological" codes are preferred.
 * <p>
 * Language codes are case-sensitive and expected to be lower case.
 * @param langCode ISO-639 language code (e.g. "deu" or "ger" or "de")
 * @return three-letter ISO-639-2 language code string that maps to {@code lang_code},
 *     or NULL if no mapping is known. The returned string must not be
 *     modified or freed.
 */
public static java.lang.String tagGetLanguageCodeIso6392B(java.lang.String langCode) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_get_language_code_iso_639_2B.invokeExact(Marshal.stringToAddress.marshal(langCode, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Returns three-letter ISO-639-2 "terminological" language code given a
 * two-letter ISO-639-1 language code or a three-letter ISO-639-2 language
 * code (both are accepted for convenience).
 * <p>
 * The "terminological" code is derived from the local name of the language
 * (e.g. "deu" for German instead of "ger"). In most scenarios, the
 * "terminological" codes are preferred over the "bibliographic" ones.
 * <p>
 * Language codes are case-sensitive and expected to be lower case.
 * @param langCode ISO-639 language code (e.g. "deu" or "ger" or "de")
 * @return three-letter ISO-639-2 language code string that maps to {@code lang_code},
 *     or NULL if no mapping is known. The returned string must not be
 *     modified or freed.
 */
public static java.lang.String tagGetLanguageCodeIso6392T(java.lang.String langCode) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_get_language_code_iso_639_2T.invokeExact(Marshal.stringToAddress.marshal(langCode, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Returns a list of known language codes (in form of two-letter ISO-639-1
 * codes). This is useful for UIs to build a list of available languages for
 * tagging purposes (e.g. to tag an audio track appropriately in a video or
 * audio editor).
 * @return NULL-terminated string array with two-letter
 *     language codes. Free with g_strfreev() when no longer needed.
 */
public static PointerString tagGetLanguageCodes() {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_get_language_codes.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

/**
 * Returns the name of the language given an ISO-639 language code as
 * found in a GST_TAG_LANGUAGE_CODE tag. The name will be translated
 * according to the current locale (if the library was built against the
 * iso-codes package, otherwise the English name will be returned).
 * <p>
 * Language codes are case-sensitive and expected to be lower case.
 * @param languageCode two or three-letter ISO-639 language code
 * @return language name in UTF-8 format, or NULL if {@code language_code} could
 *     not be mapped to a language name. The returned string must not be
 *     modified and does not need to freed; it will stay valid until the
 *     application is terminated.
 */
public static java.lang.String tagGetLanguageName(java.lang.String languageCode) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_get_language_name.invokeExact(Marshal.stringToAddress.marshal(languageCode, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Get the description of a license, which is a translated description
 * of the license's main features.
 * @param licenseRef a license reference string in form of a URI,
 *     e.g. "http://creativecommons.org/licenses/by-nc-nd/2.0/"
 * @return the description of the license, or NULL if the license is unknown
 *    or a description is not available.
 */
public static java.lang.String tagGetLicenseDescription(java.lang.String licenseRef) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_get_license_description.invokeExact(Marshal.stringToAddress.marshal(licenseRef, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Get the flags of a license, which describe most of the features of
 * a license in their most general form.
 * @param licenseRef a license reference string in form of a URI,
 *     e.g. "http://creativecommons.org/licenses/by-nc-nd/2.0/"
 * @return the flags of the license, or 0 if the license is unknown
 */
public static org.gstreamer.tag.TagLicenseFlags tagGetLicenseFlags(java.lang.String licenseRef) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_get_license_flags.invokeExact(Marshal.stringToAddress.marshal(licenseRef, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.tag.TagLicenseFlags(RESULT);
    }
}

/**
 * Get the jurisdiction code of a license. This is usually a two-letter
 * ISO 3166-1 alpha-2 code, but there is also the special case of Scotland,
 * for which no code exists and which is thus represented as "scotland".
 * <p>
 * Known jurisdictions: ar, at, au, be, bg, br, ca, ch, cl, cn, co, de,
 * dk, es, fi, fr, hr, hu, il, in, it, jp, kr, mk, mt, mx, my, nl, pe, pl,
 * pt, scotland, se, si, tw, uk, us, za.
 * @param licenseRef a license reference string in form of a URI,
 *     e.g. "http://creativecommons.org/licenses/by-nc-nd/2.0/"
 * @return the jurisdiction code of the license, or NULL if the license is
 *    unknown or is not specific to a particular jurisdiction.
 */
public static java.lang.String tagGetLicenseJurisdiction(java.lang.String licenseRef) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_get_license_jurisdiction.invokeExact(Marshal.stringToAddress.marshal(licenseRef, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Get the nick name of a license, which is a short (untranslated) string
 * such as e.g. "CC BY-NC-ND 2.0 UK".
 * @param licenseRef a license reference string in form of a URI,
 *     e.g. "http://creativecommons.org/licenses/by-nc-nd/2.0/"
 * @return the nick name of the license, or NULL if the license is unknown
 */
public static java.lang.String tagGetLicenseNick(java.lang.String licenseRef) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_get_license_nick.invokeExact(Marshal.stringToAddress.marshal(licenseRef, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Get the title of a license, which is a short translated description
 * of the license's features (generally not very pretty though).
 * @param licenseRef a license reference string in form of a URI,
 *     e.g. "http://creativecommons.org/licenses/by-nc-nd/2.0/"
 * @return the title of the license, or NULL if the license is unknown or
 *    no title is available.
 */
public static java.lang.String tagGetLicenseTitle(java.lang.String licenseRef) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_get_license_title.invokeExact(Marshal.stringToAddress.marshal(licenseRef, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Get the version of a license.
 * @param licenseRef a license reference string in form of a URI,
 *     e.g. "http://creativecommons.org/licenses/by-nc-nd/2.0/"
 * @return the version of the license, or NULL if the license is not known or
 *    has no version
 */
public static java.lang.String tagGetLicenseVersion(java.lang.String licenseRef) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_get_license_version.invokeExact(Marshal.stringToAddress.marshal(licenseRef, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Returns a list of known license references (in form of URIs). This is
 * useful for UIs to build a list of available licenses for tagging purposes
 * (e.g. to tag an audio track appropriately in a video or audio editor, or
 * an image in a camera application).
 * @return NULL-terminated array of license strings. Free
 *     with g_strfreev() when no longer needed.
 */
public static PointerString tagGetLicenses() {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_get_licenses.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

/**
 * Gets the number of ID3v1 genres that can be identified. Winamp genres are
 * included.
 * @return the number of ID3v1 genres that can be identified
 */
public static int tagId3GenreCount() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_tag_id3_genre_count.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Gets the ID3v1 genre name for a given ID.
 * @param id ID of genre to query
 * @return the genre or NULL if no genre is associated with that ID.
 */
public static java.lang.String tagId3GenreGet(int id) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_tag_id3_genre_get.invokeExact(id);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Helper function for tag-reading plugins to create a {@link org.gstreamer.gst.Sample} suitable to
 * add to a {@link org.gstreamer.gst.TagList} as an image tag (such as {@code GST_TAG_IMAGE} or
 * {@code GST_TAG_PREVIEW_IMAGE}) from the encoded image data and an (optional) image
 * type.
 * <p>
 * Background: cover art and other images in tags are usually stored as a
 * blob of binary image data, often accompanied by a MIME type or some other
 * content type string (e.g. 'png', 'jpeg', 'jpg'). Sometimes there is also an
 * 'image type' to indicate what kind of image this is (e.g. front cover,
 * back cover, artist, etc.). The image data may also be an URI to the image
 * rather than the image itself.
 * <p>
 * In GStreamer, image tags are {@link org.gstreamer.gst.Sample}&lt;!-- --&gt;s containing the raw image
 * data, with the sample caps describing the content type of the image
 * (e.g. image/jpeg, image/png, text/uri-list). The sample info may contain
 * an additional 'image-type' field of {@link TagImageType} to describe
 * the type of image (front cover, back cover etc.). {@code GST_TAG_PREVIEW_IMAGE}
 * tags should not carry an image type, their type is already indicated via
 * the special tag name.
 * <p>
 * This function will do various checks and typefind the encoded image
 * data (we can't trust the declared mime type).
 * @param imageData the (encoded) image
 * @param imageDataLen the length of the encoded image data at {@code image_data}
 * @param imageType type of the image, or {@code GST_TAG_IMAGE_TYPE_UNDEFINED}. Pass
 *     {@code GST_TAG_IMAGE_TYPE_NONE} if no image type should be set at all (e.g.
 *     for preview images)
 * @return a newly-allocated image sample for use in tag lists, or NULL
 */
public static org.gstreamer.gst.Sample tagImageDataToImageSample(byte[] imageData, int imageDataLen, org.gstreamer.tag.TagImageType imageType) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_image_data_to_image_sample.invokeExact(
                    Interop.allocateNativeArray(imageData, false, SCOPE),
                    imageDataLen,
                    imageType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Sample.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Adds an image from an ID3 APIC frame (or similar, such as used in FLAC)
 * to the given tag list. Also see gst_tag_image_data_to_image_sample() for
 * more information on image tags in GStreamer.
 * @param tagList a tag list
 * @param imageData the (encoded) image
 * @param imageDataLen the length of the encoded image data at {@code image_data}
 * @param id3PictureType picture type as per the ID3 (v2.4.0) specification for
 *    the APIC frame (0 = unknown/other)
 * @return {@code true} if the image was processed, otherwise {@code false}
 */
public static boolean tagListAddId3Image(org.gstreamer.gst.TagList tagList, byte[] imageData, int imageDataLen, int id3PictureType) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_add_id3_image.invokeExact(
                    tagList.handle(),
                    Interop.allocateNativeArray(imageData, false, SCOPE),
                    imageDataLen,
                    id3PictureType);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Parses the IFD and IFD tags data contained in the buffer and puts it
 * on a taglist. The base_offset is used to subtract from the offset in
 * the tag entries and be able to get the offset relative to the buffer
 * start
 * @param buffer The exif buffer
 * @param byteOrder byte order of the data
 * @param baseOffset Offset from the tiff header to this buffer
 * @return The parsed taglist
 */
public static org.gstreamer.gst.TagList tagListFromExifBuffer(org.gstreamer.gst.Buffer buffer, int byteOrder, int baseOffset) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_from_exif_buffer.invokeExact(
                buffer.handle(),
                byteOrder,
                baseOffset);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.TagList.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Parses the exif tags starting with a tiff header structure.
 * @param buffer The exif buffer
 * @return The taglist
 */
public static org.gstreamer.gst.TagList tagListFromExifBufferWithTiffHeader(org.gstreamer.gst.Buffer buffer) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_from_exif_buffer_with_tiff_header.invokeExact(buffer.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.TagList.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Creates a new tag list that contains the information parsed out of a
 * ID3 tag.
 * @param buffer buffer to convert
 * @return A new {@link org.gstreamer.gst.TagList} with all tags that could be extracted from the
 *          given vorbiscomment buffer or NULL on error.
 */
public static org.gstreamer.gst.TagList tagListFromId3v2Tag(org.gstreamer.gst.Buffer buffer) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_from_id3v2_tag.invokeExact(buffer.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.TagList.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Creates a new tag list that contains the information parsed out of a
 * vorbiscomment packet.
 * @param data data to convert
 * @param size size of {@code data}
 * @param idData identification data at start of stream
 * @param idDataLength length of identification data
 * @param vendorString pointer to a string that should take the
 *     vendor string of this vorbis comment or NULL if you don't need it.
 * @return A new {@link org.gstreamer.gst.TagList} with all tags that could be extracted from the
 *          given vorbiscomment buffer or NULL on error.
 */
public static org.gstreamer.gst.TagList tagListFromVorbiscomment(byte[] data, long size, byte[] idData, int idDataLength, @Nullable Out<java.lang.String> vendorString) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment vendorStringPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_from_vorbiscomment.invokeExact(
                    Interop.allocateNativeArray(data, false, SCOPE),
                    size,
                    Interop.allocateNativeArray(idData, false, SCOPE),
                    idDataLength,
                    (Addressable) (vendorString == null ? MemoryAddress.NULL : (Addressable) vendorStringPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (vendorString != null) vendorString.set(Marshal.addressToString.marshal(vendorStringPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        var OBJECT = org.gstreamer.gst.TagList.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Creates a new tag list that contains the information parsed out of a
 * vorbiscomment packet.
 * @param buffer buffer to convert
 * @param idData identification data at start of stream
 * @param idDataLength length of identification data
 * @param vendorString pointer to a string that should take the
 *     vendor string of this vorbis comment or NULL if you don't need it.
 * @return A new {@link org.gstreamer.gst.TagList} with all tags that could be extracted from the
 *          given vorbiscomment buffer or NULL on error.
 */
public static org.gstreamer.gst.TagList tagListFromVorbiscommentBuffer(org.gstreamer.gst.Buffer buffer, byte[] idData, int idDataLength, @Nullable Out<java.lang.String> vendorString) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment vendorStringPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_from_vorbiscomment_buffer.invokeExact(
                    buffer.handle(),
                    Interop.allocateNativeArray(idData, false, SCOPE),
                    idDataLength,
                    (Addressable) (vendorString == null ? MemoryAddress.NULL : (Addressable) vendorStringPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (vendorString != null) vendorString.set(Marshal.addressToString.marshal(vendorStringPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        var OBJECT = org.gstreamer.gst.TagList.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Parse a xmp packet into a taglist.
 * @param buffer buffer
 * @return new taglist or {@code null}, free the list when done
 */
public static org.gstreamer.gst.TagList tagListFromXmpBuffer(org.gstreamer.gst.Buffer buffer) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_from_xmp_buffer.invokeExact(buffer.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.TagList.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Parses the data containing an ID3v1 tag and returns a {@link org.gstreamer.gst.TagList} from the
 * parsed data.
 * @param data 128 bytes of data containing the ID3v1 tag
 * @return A new tag list or NULL if the data was not an ID3v1 tag.
 */
public static org.gstreamer.gst.TagList tagListNewFromId3v1(byte[] data) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_new_from_id3v1.invokeExact(Interop.allocateNativeArray(data, false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.TagList.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Formats the tags in taglist on exif format. The resulting buffer contains
 * the tags IFD and is followed by the data pointed by the tag entries.
 * @param taglist The taglist
 * @param byteOrder byte order used in writing (G_LITTLE_ENDIAN or G_BIG_ENDIAN)
 * @param baseOffset Offset from the tiff header first byte
 * @return A GstBuffer containing the tag entries followed by the tag data
 */
public static org.gstreamer.gst.Buffer tagListToExifBuffer(org.gstreamer.gst.TagList taglist, int byteOrder, int baseOffset) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_to_exif_buffer.invokeExact(
                taglist.handle(),
                byteOrder,
                baseOffset);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Formats the tags in taglist into exif structure, a tiff header
 * is put in the beginning of the buffer.
 * @param taglist The taglist
 * @return A GstBuffer containing the data
 */
public static org.gstreamer.gst.Buffer tagListToExifBufferWithTiffHeader(org.gstreamer.gst.TagList taglist) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_to_exif_buffer_with_tiff_header.invokeExact(taglist.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Creates a new vorbiscomment buffer from a tag list.
 * @param list tag list to convert
 * @param idData identification data at start of stream
 * @param idDataLength length of identification data, may be 0 if {@code id_data} is NULL
 * @param vendorString string that describes the vendor string or NULL
 * @return A new {@link org.gstreamer.gst.Buffer} containing a vorbiscomment buffer with all tags
 *          that could be converted from the given tag list.
 */
public static org.gstreamer.gst.Buffer tagListToVorbiscommentBuffer(org.gstreamer.gst.TagList list, byte[] idData, int idDataLength, @Nullable java.lang.String vendorString) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_to_vorbiscomment_buffer.invokeExact(
                    list.handle(),
                    Interop.allocateNativeArray(idData, false, SCOPE),
                    idDataLength,
                    (Addressable) (vendorString == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(vendorString, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Formats a taglist as a xmp packet using only the selected
 * schemas. An empty list ({@code null}) means that all schemas should
 * be used
 * @param list tags
 * @param readOnly does the container forbid inplace editing
 * @param schemas {@code null} terminated array of schemas to be used on serialization
 * @return new buffer or {@code null}, unref the buffer when done
 */
public static org.gstreamer.gst.Buffer tagListToXmpBuffer(org.gstreamer.gst.TagList list, boolean readOnly, java.lang.String[] schemas) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_to_xmp_buffer.invokeExact(
                    list.handle(),
                    Marshal.booleanToInteger.marshal(readOnly, null).intValue(),
                    Interop.allocateNativeArray(schemas, false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Convenience function to parse a GST_TAG_EXTENDED_COMMENT string and
 * separate it into its components.
 * <p>
 * If successful, {@code key}, {@code lang} and/or {@code value} will be set to newly allocated
 * strings that you need to free with g_free() when done. {@code key} and {@code lang}
 * may also be set to NULL by this function if there is no key or no language
 * code in the extended comment string.
 * @param extComment an extended comment string, see {@code GST_TAG_EXTENDED_COMMENT}
 * @param key return location for the comment description key, or NULL
 * @param lang return location for the comment ISO-639 language code, or NULL
 * @param value return location for the actual comment string, or NULL
 * @param failIfNoKey whether to fail if strings are not in key=value form
 * @return TRUE if the string could be parsed, otherwise FALSE
 */
public static boolean tagParseExtendedComment(java.lang.String extComment, @Nullable Out<java.lang.String> key, @Nullable Out<java.lang.String> lang, Out<java.lang.String> value, boolean failIfNoKey) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment keyPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment langPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment valuePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_parse_extended_comment.invokeExact(
                    Marshal.stringToAddress.marshal(extComment, SCOPE),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) keyPOINTER.address()),
                    (Addressable) (lang == null ? MemoryAddress.NULL : (Addressable) langPOINTER.address()),
                    (Addressable) valuePOINTER.address(),
                    Marshal.booleanToInteger.marshal(failIfNoKey, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (key != null) key.set(Marshal.addressToString.marshal(keyPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                if (lang != null) lang.set(Marshal.addressToString.marshal(langPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                value.set(Marshal.addressToString.marshal(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Registers additional musicbrainz-specific tags with the GStreamer tag
 * system. Plugins and applications that use these tags should call this
 * function before using them. Can be called multiple times.
 */
public static void tagRegisterMusicbrainzTags() {
    try {
        DowncallHandles.gst_tag_register_musicbrainz_tags.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Looks up the ID3v2 tag for a GStreamer tag.
 * @param gstTag GStreamer tag to convert to vorbiscomment tag
 * @return The corresponding ID3v2 tag or NULL if none exists.
 */
public static java.lang.String tagToId3Tag(java.lang.String gstTag) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_to_id3_tag.invokeExact(Marshal.stringToAddress.marshal(gstTag, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Creates a new tag list that contains the information parsed out of a
 * vorbiscomment packet.
 * @param list a {@link org.gstreamer.gst.TagList}
 * @param tag a GStreamer tag identifier, such as {@code GST_TAG_ARTIST}
 * @return A {@link org.gtk.glib.List} of newly-allocated
 *     key=value strings. Free with g_list_foreach (list, (GFunc) g_free, NULL)
 *     plus g_list_free (list)
 */
public static org.gtk.glib.List tagToVorbisComments(org.gstreamer.gst.TagList list, java.lang.String tag) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_to_vorbis_comments.invokeExact(
                    list.handle(),
                    Marshal.stringToAddress.marshal(tag, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Looks up the vorbiscomment tag for a GStreamer tag.
 * @param gstTag GStreamer tag to convert to vorbiscomment tag
 * @return The corresponding vorbiscomment tag or NULL if none exists.
 */
public static java.lang.String tagToVorbisTag(java.lang.String gstTag) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_to_vorbis_tag.invokeExact(Marshal.stringToAddress.marshal(gstTag, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Gets the list of supported schemas in the xmp lib
 * @return a {@code null} terminated array of strings with the
 *     schema names
 */
public static PointerString tagXmpListSchemas() {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_xmp_list_schemas.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

/**
 * Convenience function using gst_tag_from_vorbis_tag(), parsing
 * a vorbis comment string into the right type and adding it to the
 * given taglist {@code list}.
 * <p>
 * Unknown vorbiscomment tags will be added to the tag list in form
 * of a {@code GST_TAG_EXTENDED_COMMENT}.
 * @param list a {@link org.gstreamer.gst.TagList}
 * @param tag a vorbiscomment tag string (key in key=value), must be valid UTF-8
 * @param value a vorbiscomment value string (value in key=value), must be valid UTF-8
 */
public static void vorbisTagAdd(org.gstreamer.gst.TagList list, java.lang.String tag, java.lang.String value) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_vorbis_tag_add.invokeExact(
                    list.handle(),
                    Marshal.stringToAddress.marshal(tag, SCOPE),
                    Marshal.stringToAddress.marshal(value, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}
    
    private static class DowncallHandles {

private static final MethodHandle gst_tag_check_language_code = Interop.downcallHandle(
        "gst_tag_check_language_code",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_freeform_string_to_utf8 = Interop.downcallHandle(
        "gst_tag_freeform_string_to_utf8",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_from_id3_tag = Interop.downcallHandle(
        "gst_tag_from_id3_tag",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_from_id3_user_tag = Interop.downcallHandle(
        "gst_tag_from_id3_user_tag",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_from_vorbis_tag = Interop.downcallHandle(
        "gst_tag_from_vorbis_tag",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_get_id3v2_tag_size = Interop.downcallHandle(
        "gst_tag_get_id3v2_tag_size",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_get_language_code_iso_639_1 = Interop.downcallHandle(
        "gst_tag_get_language_code_iso_639_1",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_get_language_code_iso_639_2B = Interop.downcallHandle(
        "gst_tag_get_language_code_iso_639_2B",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_get_language_code_iso_639_2T = Interop.downcallHandle(
        "gst_tag_get_language_code_iso_639_2T",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_get_language_codes = Interop.downcallHandle(
        "gst_tag_get_language_codes",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle gst_tag_get_language_name = Interop.downcallHandle(
        "gst_tag_get_language_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_get_license_description = Interop.downcallHandle(
        "gst_tag_get_license_description",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_get_license_flags = Interop.downcallHandle(
        "gst_tag_get_license_flags",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_get_license_jurisdiction = Interop.downcallHandle(
        "gst_tag_get_license_jurisdiction",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_get_license_nick = Interop.downcallHandle(
        "gst_tag_get_license_nick",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_get_license_title = Interop.downcallHandle(
        "gst_tag_get_license_title",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_get_license_version = Interop.downcallHandle(
        "gst_tag_get_license_version",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_get_licenses = Interop.downcallHandle(
        "gst_tag_get_licenses",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle gst_tag_id3_genre_count = Interop.downcallHandle(
        "gst_tag_id3_genre_count",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_tag_id3_genre_get = Interop.downcallHandle(
        "gst_tag_id3_genre_get",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_tag_image_data_to_image_sample = Interop.downcallHandle(
        "gst_tag_image_data_to_image_sample",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_tag_list_add_id3_image = Interop.downcallHandle(
        "gst_tag_list_add_id3_image",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_tag_list_from_exif_buffer = Interop.downcallHandle(
        "gst_tag_list_from_exif_buffer",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_tag_list_from_exif_buffer_with_tiff_header = Interop.downcallHandle(
        "gst_tag_list_from_exif_buffer_with_tiff_header",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_list_from_id3v2_tag = Interop.downcallHandle(
        "gst_tag_list_from_id3v2_tag",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_list_from_vorbiscomment = Interop.downcallHandle(
        "gst_tag_list_from_vorbiscomment",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_list_from_vorbiscomment_buffer = Interop.downcallHandle(
        "gst_tag_list_from_vorbiscomment_buffer",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_list_from_xmp_buffer = Interop.downcallHandle(
        "gst_tag_list_from_xmp_buffer",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_list_new_from_id3v1 = Interop.downcallHandle(
        "gst_tag_list_new_from_id3v1",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_list_to_exif_buffer = Interop.downcallHandle(
        "gst_tag_list_to_exif_buffer",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_tag_list_to_exif_buffer_with_tiff_header = Interop.downcallHandle(
        "gst_tag_list_to_exif_buffer_with_tiff_header",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_list_to_vorbiscomment_buffer = Interop.downcallHandle(
        "gst_tag_list_to_vorbiscomment_buffer",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_list_to_xmp_buffer = Interop.downcallHandle(
        "gst_tag_list_to_xmp_buffer",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_parse_extended_comment = Interop.downcallHandle(
        "gst_tag_parse_extended_comment",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_tag_register_musicbrainz_tags = Interop.downcallHandle(
        "gst_tag_register_musicbrainz_tags",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle gst_tag_to_id3_tag = Interop.downcallHandle(
        "gst_tag_to_id3_tag",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_to_vorbis_comments = Interop.downcallHandle(
        "gst_tag_to_vorbis_comments",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_to_vorbis_tag = Interop.downcallHandle(
        "gst_tag_to_vorbis_tag",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_tag_xmp_list_schemas = Interop.downcallHandle(
        "gst_tag_xmp_list_schemas",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle gst_vorbis_tag_add = Interop.downcallHandle(
        "gst_vorbis_tag_add",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);
    }
    
    private static void registerTypes() {
        if (TagDemux.isAvailable()) Interop.register(TagDemux.getType(), TagDemux.fromAddress);
        if (TagMux.isAvailable()) Interop.register(TagMux.getType(), TagMux.fromAddress);
        if (TagXmpWriter.isAvailable()) Interop.register(TagXmpWriter.getType(), TagXmpWriter.fromAddress);
    }
}
