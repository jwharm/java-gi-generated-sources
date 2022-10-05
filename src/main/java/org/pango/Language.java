package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoLanguage} structure is used to
 * represent a language.
 * <p>
 * {@code PangoLanguage} pointers can be efficiently
 * copied and compared with each other.
 */
public class Language extends io.github.jwharm.javagi.ResourceBase {

    public Language(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle pango_language_get_sample_string = Interop.downcallHandle(
        "pango_language_get_sample_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get a string that is representative of the characters needed to
     * render a particular language.
     * <p>
     * The sample text may be a pangram, but is not necessarily. It is chosen
     * to be demonstrative of normal text in the language, as well as exposing
     * font feature requirements unique to the language. It is suitable for use
     * as sample text in a font selection dialog.
     * <p>
     * If {@code language} is {@code null}, the default language as found by
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
        try {
            var RESULT = (MemoryAddress) pango_language_get_sample_string.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_language_get_scripts = Interop.downcallHandle(
        "pango_language_get_scripts",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines the scripts used to to write {@code language}.
     * <p>
     * If nothing is known about the language tag {@code language},
     * or if {@code language} is {@code null}, then {@code null} is returned.
     * The list of scripts returned starts with the script that the
     * language uses most and continues to the one it uses least.
     * <p>
     * The value {@code num_script} points at will be set to the number
     * of scripts in the returned array (or zero if {@code null} is returned).
     * <p>
     * Most languages use only one script for writing, but there are
     * some that use two (Latin and Cyrillic for example), and a few
     * use three (Japanese for example). Applications should not make
     * any assumptions on the maximum number of scripts returned
     * though, except that it is positive if the return value is not
     * {@code null}, and it is a small number.
     * <p>
     * The {@link Language#includesScript} function uses this
     * function internally.
     * <p>
     * Note: while the return value is declared as {@code PangoScript}, the
     * returned values are from the {@code GUnicodeScript} enumeration, which
     * may have more values. Callers need to handle unknown values.
     */
    public PointerIterator<Script> getScripts(PointerInteger numScripts) {
        try {
            var RESULT = (MemoryAddress) pango_language_get_scripts.invokeExact(handle(), numScripts.handle());
            return new PointerEnumeration<Script>(RESULT, Script.class).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_language_includes_script = Interop.downcallHandle(
        "pango_language_includes_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines if {@code script} is one of the scripts used to
     * write {@code language}.
     * <p>
     * The returned value is conservative; if nothing is known about
     * the language tag {@code language}, {@code true} will be returned, since, as
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
        try {
            var RESULT = (int) pango_language_includes_script.invokeExact(handle(), script.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_language_matches = Interop.downcallHandle(
        "pango_language_matches",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a language tag matches one of the elements in a list of
     * language ranges.
     * <p>
     * A language tag is considered to match a range in the list if the
     * range is '*', the range is exactly the tag, or the range is a prefix
     * of the tag, and the character after it in the tag is '-'.
     */
    public boolean matches(java.lang.String rangeList) {
        try {
            var RESULT = (int) pango_language_matches.invokeExact(handle(), Interop.allocateNativeString(rangeList).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_language_to_string = Interop.downcallHandle(
        "pango_language_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the RFC-3066 format string representing the given language tag.
     * <p>
     * Returns (transfer none): a string representing the language tag
     */
    public java.lang.String toString() {
        try {
            var RESULT = (MemoryAddress) pango_language_to_string.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_language_from_string = Interop.downcallHandle(
        "pango_language_from_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) pango_language_from_string.invokeExact(Interop.allocateNativeString(language).handle());
            return new Language(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_language_get_default = Interop.downcallHandle(
        "pango_language_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) pango_language_get_default.invokeExact();
            return new Language(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_language_get_preferred = Interop.downcallHandle(
        "pango_language_get_preferred",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
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
    public static PointerProxy<Language> getPreferred() {
        try {
            var RESULT = (MemoryAddress) pango_language_get_preferred.invokeExact();
            return new PointerProxy<Language>(RESULT, Language.class);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
