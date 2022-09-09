package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `PangoLanguage` structure is used to
 * represent a language.
 * 
 * `PangoLanguage` pointers can be efficiently
 * copied and compared with each other.
 */
public class Language extends io.github.jwharm.javagi.interop.ResourceBase {

    public Language(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Get a string that is representative of the characters needed to
     * render a particular language.
     * 
     * The sample text may be a pangram, but is not necessarily. It is chosen
     * to be demonstrative of normal text in the language, as well as exposing
     * font feature requirements unique to the language. It is suitable for use
     * as sample text in a font selection dialog.
     * 
     * If @language is %NULL, the default language as found by
     * [func@Pango.Language.get_default] is used.
     * 
     * If Pango does not have a sample string for @language, the classic
     * "The quick brown fox..." is returned.  This can be detected by
     * comparing the returned pointer value to that returned for (non-existent)
     * language code "xx".  That is, compare to:
     * 
     * ```
     * pango_language_get_sample_string (pango_language_from_string ("xx"))
     * ```
     */
    public java.lang.String getSampleString() {
        var RESULT = gtk_h.pango_language_get_sample_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Determines if @script is one of the scripts used to
     * write @language.
     * 
     * The returned value is conservative; if nothing is known about
     * the language tag @language, %TRUE will be returned, since, as
     * far as Pango knows, @script might be used to write @language.
     * 
     * This routine is used in Pango's itemization process when
     * determining if a supplied language tag is relevant to
     * a particular section of text. It probably is not useful
     * for applications in most circumstances.
     * 
     * This function uses [method@Pango.Language.get_scripts] internally.
     */
    public boolean includesScript(Script script) {
        var RESULT = gtk_h.pango_language_includes_script(handle(), script.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a language tag matches one of the elements in a list of
     * language ranges.
     * 
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
     * 
     * Returns (transfer none): a string representing the language tag
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.pango_language_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Convert a language tag to a `PangoLanguage`.
     * 
     * The language tag must be in a RFC-3066 format. `PangoLanguage` pointers
     * can be efficiently copied (copy the pointer) and compared with other
     * language tags (compare the pointer.)
     * 
     * This function first canonicalizes the string by converting it to
     * lowercase, mapping '_' to '-', and stripping all characters other
     * than letters and '-'.
     * 
     * Use [func@Pango.Language.get_default] if you want to get the
     * `PangoLanguage` for the current locale of the process.
     */
    public static Language fromString(java.lang.String language) {
        var RESULT = gtk_h.pango_language_from_string(Interop.allocateNativeString(language).handle());
        return new Language(References.get(RESULT, false));
    }
    
    /**
     * Returns the `PangoLanguage` for the current locale of the process.
     * 
     * On Unix systems, this is the return value is derived from
     * `setlocale (LC_CTYPE, NULL)`, and the user can
     * affect this through the environment variables LC_ALL, LC_CTYPE or
     * LANG (checked in that order). The locale string typically is in
     * the form lang_COUNTRY, where lang is an ISO-639 language code, and
     * COUNTRY is an ISO-3166 country code. For instance, sv_FI for
     * Swedish as written in Finland or pt_BR for Portuguese as written in
     * Brazil.
     * 
     * On Windows, the C library does not use any such environment
     * variables, and setting them won't affect the behavior of functions
     * like ctime(). The user sets the locale through the Regional Options
     * in the Control Panel. The C library (in the setlocale() function)
     * does not use country and language codes, but country and language
     * names spelled out in English.
     * However, this function does check the above environment
     * variables, and does return a Unix-style locale string based on
     * either said environment variables or the thread's current locale.
     * 
     * Your application should call `setlocale(LC_ALL, "")` for the user
     * settings to take effect. GTK does this in its initialization
     * functions automatically (by calling gtk_set_locale()).
     * See the setlocale() manpage for more details.
     * 
     * Note that the default language can change over the life of an application.
     * 
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
     * 
     * The list is specified by the `PANGO_LANGUAGE` or `LANGUAGE`
     * environment variables, in order of preference. Note that this
     * list does not necessarily include the language returned by
     * [func@Pango.Language.get_default].
     * 
     * When choosing language-specific resources, such as the sample
     * text returned by [method@Pango.Language.get_sample_string],
     * you should first try the default language, followed by the
     * languages returned by this function.
     */
    public static Language getPreferred() {
        var RESULT = gtk_h.pango_language_get_preferred();
        return new Language(References.get(RESULT, false));
    }
    
}
