package org.pango;

import org.gtk.gobject.*;
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_language_get_sample_string(HANDLE());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_language_includes_script(HANDLE(), script.getValue());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_language_matches(HANDLE(), Interop.allocateNativeString(rangeList).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the RFC-3066 format string representing the given language tag.
     * 
     * Returns (transfer none): a string representing the language tag
     */
    public java.lang.String toString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_language_to_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
}
