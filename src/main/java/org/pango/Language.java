package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoLanguage} structure is used to
 * represent a language.
 * <p>
 * {@code PangoLanguage} pointers can be efficiently
 * copied and compared with each other.
 */
public class Language extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoLanguage";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Language}
     * @return A new, uninitialized @{link Language}
     */
    public static Language allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Language newInstance = new Language(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Language proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Language(Addressable address, Ownership ownership) {
        super(address, ownership);
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
     * If {@code language} is {@code null}, the default language as found by
     * {@link Language#getDefault} is used.
     * <p>
     * If Pango does not have a sample string for {@code language}, the classic
     * "The quick brown fox..." is returned.  This can be detected by
     * comparing the returned pointer value to that returned for (non-existent)
     * language code "xx".  That is, compare to:
     * <pre>{@code 
     * pango_language_get_sample_string (pango_language_from_string ("xx"))
     * }</pre>
     * @return the sample string
     */
    public @NotNull java.lang.String getSampleString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_language_get_sample_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
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
     * @param numScripts location to return number of scripts
     * @return An array of {@code PangoScript} values, with the number of entries in
     *   the array stored in {@code num_scripts}, or {@code null} if Pango does not have
     *   any information about this particular language tag (also the case
     *   if {@code language} is {@code null}).
     */
    public @Nullable org.pango.Script[] getScripts(Out<Integer> numScripts) {
        java.util.Objects.requireNonNull(numScripts, "Parameter 'numScripts' must not be null");
        MemorySegment numScriptsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_language_get_scripts.invokeExact(
                    handle(),
                    (Addressable) numScriptsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        numScripts.set(numScriptsPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (RESULT.equals(MemoryAddress.NULL)) return null;
        org.pango.Script[] resultARRAY = new org.pango.Script[numScripts.get().intValue()];
        for (int I = 0; I < numScripts.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.C_INT, I);
            resultARRAY[I] = new org.pango.Script(OBJ);
        }
        return resultARRAY;
    }
    
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
     * @param script a {@code PangoScript}
     * @return {@code true} if {@code script} is one of the scripts used
     *   to write {@code language} or if nothing is known about {@code language}
     *   (including the case that {@code language} is {@code null}), {@code false} otherwise.
     */
    public boolean includesScript(@NotNull org.pango.Script script) {
        java.util.Objects.requireNonNull(script, "Parameter 'script' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_language_includes_script.invokeExact(
                    handle(),
                    script.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if a language tag matches one of the elements in a list of
     * language ranges.
     * <p>
     * A language tag is considered to match a range in the list if the
     * range is '*', the range is exactly the tag, or the range is a prefix
     * of the tag, and the character after it in the tag is '-'.
     * @param rangeList a list of language ranges, separated by ';', ':',
     *   ',', or space characters.
     *   Each element must either be '*', or a RFC 3066 language range
     *   canonicalized as by {@link Language#fromString}
     * @return {@code true} if a match was found
     */
    public boolean matches(@NotNull java.lang.String rangeList) {
        java.util.Objects.requireNonNull(rangeList, "Parameter 'rangeList' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_language_matches.invokeExact(
                    handle(),
                    Interop.allocateNativeString(rangeList));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the RFC-3066 format string representing the given language tag.
     * <p>
     * Returns (transfer none): a string representing the language tag
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_language_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
     * Use {@link Language#getDefault} if you want to get the
     * {@code PangoLanguage} for the current locale of the process.
     * @param language a string representing a language tag
     * @return a {@code PangoLanguage}
     */
    public static @Nullable org.pango.Language fromString(@Nullable java.lang.String language) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_language_from_string.invokeExact(
                    (Addressable) (language == null ? MemoryAddress.NULL : Interop.allocateNativeString(language)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Language(RESULT, Ownership.NONE);
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
     * @return the default language as a {@code PangoLanguage}
     */
    public static @NotNull org.pango.Language getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_language_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Language(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the list of languages that the user prefers.
     * <p>
     * The list is specified by the {@code PANGO_LANGUAGE} or {@code LANGUAGE}
     * environment variables, in order of preference. Note that this
     * list does not necessarily include the language returned by
     * {@link Language#getDefault}.
     * <p>
     * When choosing language-specific resources, such as the sample
     * text returned by {@link Language#getSampleString},
     * you should first try the default language, followed by the
     * languages returned by this function.
     * @return a {@code null}-terminated array
     *   of {@code PangoLanguage}*
     */
    public static @Nullable PointerProxy<org.pango.Language> getPreferred() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_language_get_preferred.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerProxy<org.pango.Language>(RESULT, org.pango.Language.class);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_language_get_sample_string = Interop.downcallHandle(
            "pango_language_get_sample_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_language_get_scripts = Interop.downcallHandle(
            "pango_language_get_scripts",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_language_includes_script = Interop.downcallHandle(
            "pango_language_includes_script",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_language_matches = Interop.downcallHandle(
            "pango_language_matches",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_language_to_string = Interop.downcallHandle(
            "pango_language_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_language_from_string = Interop.downcallHandle(
            "pango_language_from_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_language_get_default = Interop.downcallHandle(
            "pango_language_get_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_language_get_preferred = Interop.downcallHandle(
            "pango_language_get_preferred",
            FunctionDescriptor.ofVoid(),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Language struct;
        
         /**
         * A {@link Language.Build} object constructs a {@link Language} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Language.allocate();
        }
        
         /**
         * Finish building the {@link Language} struct.
         * @return A new instance of {@code Language} with the fields 
         *         that were set in the Build object.
         */
        public Language construct() {
            return struct;
        }
    }
}
