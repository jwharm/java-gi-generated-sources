package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoLanguage} structure is used to
 * represent a language.
 * <p>
 * {@code PangoLanguage} pointers can be efficiently
 * copied and compared with each other.
 */
public class Language extends io.github.jwharm.javagi.ResourceBase {

    public Language(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Get a string that is representative of the characters needed to
     * render a particular language.
     * <p>
     * The sample text may be a pangram, but is not necessarily. It is chosen
     * to be demonstrative of normal text in the language, as well as exposing
     * font feature requirements unique to the language. It is suitable for use
     * as sample text in a font selection dialog.
     * <p>
     * If {@code language} is <code>null</code>, the default language as found by
     * {@link Pango#Language} is used.
     * <p>
     * If Pango does not have a sample string for {@code language}, the classic
     * "The quick brown fox..." is returned.  This can be detected by
     * comparing the returned pointer value to that returned for (non-existent)
     * language code "xx".  That is, compare to:
     * <p>
     * <pre>{@code 
     * pango_language_get_sample_string (pango_language_from_string ("xx"))
     * }</pre>
     */
    public java.lang.String getSampleString() {
        var RESULT = gtk_h.pango_language_get_sample_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Determines if {@code script} is one of the scripts used to
     * write {@code language}.
     * <p>
     * The returned value is conservative; if nothing is known about
     * the language tag {@code language}, <code>true</code> will be returned, since, as
     * far as Pango knows, {@code script} might be used to write {@code language}.
     * <p>
     * This routine is used in Pango's itemization process when
     * determining if a supplied language tag is relevant to
     * a particular section of text. It probably is not useful
     * for applications in most circumstances.
     * <p>
     * This function uses {@link Language#getScripts} internally.
     */
    public boolean includesScript(Script script) {
        var RESULT = gtk_h.pango_language_includes_script(handle(), script.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a language tag matches one of the elements in a list of
     * language ranges.
     * <p>
     * A language tag is considered to match a range in the list if the
     * range is '*', the range is exactly the tag, or the range is a prefix
     * of the tag, and the character after it in the tag is '-'.
     */
    public boolean matches(java.lang.String rangeList) {
        var RESULT = gtk_h.pango_language_matches(handle(), Interop.allocateNativeString(rangeList).handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the RFC-3066 format string representing the given language tag.
     * <p>
     * Returns (transfer none): a string representing the language tag
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.pango_language_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Convert a language tag to a {@code PangoLanguage}.
     * <p>
     * The language tag must be in a RFC-3066 format. {@code PangoLanguage} pointers
     * can be efficiently copied (copy the pointer) and compared with other
     * language tags (compare the pointer.)
     * <p>
     * This function first canonicalizes the string by converting it to
     * lowercase, mapping '_' to '-', and stripping all characters other
     * than letters and '-'.
     * <p>
     * Use {@link Pango#Language} if you want to get the
     * {@code PangoLanguage} for the current locale of the process.
     */
    public static Language fromString(java.lang.String language) {
        var RESULT = gtk_h.pango_language_from_string(Interop.allocateNativeString(language).handle());
        return new Language(References.get(RESULT, false));
    }
    
    /**
     * Returns the {@code PangoLanguage} for the current locale of the process.
     * <p>
     * On Unix systems, this is the return value is derived from
     * {@code setlocale (LC_CTYPE, NULL)}, and the user can
     * affect this through the environment variables LC_ALL, LC_CTYPE or
     * LANG (checked in that order). The locale string typically is in
     * the form lang_COUNTRY, where lang is an ISO-639 language code, and
     * COUNTRY is an ISO-3166 country code. For instance, sv_FI for
     * Swedish as written in Finland or pt_BR for Portuguese as written in
     * Brazil.
     * <p>
     * On Windows, the C library does not use any such environment
     * variables, and setting them won't affect the behavior of functions
     * like ctime(). The user sets the locale through the Regional Options
     * in the Control Panel. The C library (in the setlocale() function)
     * does not use country and language codes, but country and language
     * names spelled out in English.
     * However, this function does check the above environment
     * variables, and does return a Unix-style locale string based on
     * either said environment variables or the thread's current locale.
     * <p>
     * Your application should call {@code setlocale(LC_ALL, "")} for the user
     * settings to take effect. GTK does this in its initialization
     * functions automatically (by calling gtk_set_locale()).
     * See the setlocale() manpage for more details.
     * <p>
     * Note that the default language can change over the life of an application.
     * <p>
     * Also note that this function will not do the right thing if you
     * use per-thread locales with uselocale(). In that case, you should
     * just call pango_language_from_string() yourself.
     */
    public static Language getDefault() {
        var RESULT = gtk_h.pango_language_get_default();
        return new Language(References.get(RESULT, false));
    }
    
    /**
     * Returns the list of languages that the user prefers.
     * <p>
     * The list is specified by the {@code PANGO_LANGUAGE} or {@code LANGUAGE}
     * environment variables, in order of preference. Note that this
     * list does not necessarily include the language returned by
     * {@link Pango#Language}.
     * <p>
     * When choosing language-specific resources, such as the sample
     * text returned by {@link Language#getSampleString},
     * you should first try the default language, followed by the
     * languages returned by this function.
     */
    public static Language getPreferred() {
        var RESULT = gtk_h.pango_language_get_preferred();
        return new Language(References.get(RESULT, false));
    }
    
}
