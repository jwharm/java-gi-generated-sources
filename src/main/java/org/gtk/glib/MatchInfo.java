package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A GMatchInfo is an opaque struct used to return information about
 * matches.
 */
public class MatchInfo extends io.github.jwharm.javagi.ResourceBase {

    public MatchInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_match_info_expand_references = Interop.downcallHandle(
        "g_match_info_expand_references",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a new string containing the text in {@code string_to_expand} with
     * references and escape sequences expanded. References refer to the last
     * match done with {@code string} against {@code regex} and have the same syntax used by
     * g_regex_replace().
     * <p>
     * The {@code string_to_expand} must be UTF-8 encoded even if {@link RegexCompileFlags#RAW} was
     * passed to g_regex_new().
     * <p>
     * The backreferences are extracted from the string passed to the match
     * function, so you cannot call this function after freeing the string.
     * <p>
     * {@code match_info} may be {@code null} in which case {@code string_to_expand} must not
     * contain references. For instance "foo\\n" does not refer to an actual
     * pattern and '\\n' merely will be replaced with \\n character,
     * while to expand "\\0" (whole match) one needs the result of a match.
     * Use g_regex_check_replacement() to find out whether {@code string_to_expand}
     * contains references.
     */
    public java.lang.String expandReferences(java.lang.String stringToExpand) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_match_info_expand_references.invokeExact(handle(), Interop.allocateNativeString(stringToExpand).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_match_info_fetch = Interop.downcallHandle(
        "g_match_info_fetch",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the text matching the {@code match_num}'th capturing
     * parentheses. 0 is the full text of the match, 1 is the first paren
     * set, 2 the second, and so on.
     * <p>
     * If {@code match_num} is a valid sub pattern but it didn't match anything
     * (e.g. sub pattern 1, matching "b" against "(a)?b") then an empty
     * string is returned.
     * <p>
     * If the match was obtained using the DFA algorithm, that is using
     * g_regex_match_all() or g_regex_match_all_full(), the retrieved
     * string is not that of a set of parentheses but that of a matched
     * substring. Substrings are matched in reverse order of length, so
     * 0 is the longest match.
     * <p>
     * The string is fetched from the string passed to the match function,
     * so you cannot call this function after freeing the string.
     */
    public java.lang.String fetch(int matchNum) {
        try {
            var RESULT = (MemoryAddress) g_match_info_fetch.invokeExact(handle(), matchNum);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_match_info_fetch_all = Interop.downcallHandle(
        "g_match_info_fetch_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Bundles up pointers to each of the matching substrings from a match
     * and stores them in an array of gchar pointers. The first element in
     * the returned array is the match number 0, i.e. the entire matched
     * text.
     * <p>
     * If a sub pattern didn't match anything (e.g. sub pattern 1, matching
     * "b" against "(a)?b") then an empty string is inserted.
     * <p>
     * If the last match was obtained using the DFA algorithm, that is using
     * g_regex_match_all() or g_regex_match_all_full(), the retrieved
     * strings are not that matched by sets of parentheses but that of the
     * matched substring. Substrings are matched in reverse order of length,
     * so the first one is the longest match.
     * <p>
     * The strings are fetched from the string passed to the match function,
     * so you cannot call this function after freeing the string.
     */
    public PointerString fetchAll() {
        try {
            var RESULT = (MemoryAddress) g_match_info_fetch_all.invokeExact(handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_match_info_fetch_named = Interop.downcallHandle(
        "g_match_info_fetch_named",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the text matching the capturing parentheses named {@code name}.
     * <p>
     * If {@code name} is a valid sub pattern name but it didn't match anything
     * (e.g. sub pattern "X", matching "b" against "(?P&lt;X&gt;a)?b")
     * then an empty string is returned.
     * <p>
     * The string is fetched from the string passed to the match function,
     * so you cannot call this function after freeing the string.
     */
    public java.lang.String fetchNamed(java.lang.String name) {
        try {
            var RESULT = (MemoryAddress) g_match_info_fetch_named.invokeExact(handle(), Interop.allocateNativeString(name).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_match_info_fetch_named_pos = Interop.downcallHandle(
        "g_match_info_fetch_named_pos",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the position in bytes of the capturing parentheses named {@code name}.
     * <p>
     * If {@code name} is a valid sub pattern name but it didn't match anything
     * (e.g. sub pattern "X", matching "b" against "(?P&lt;X&gt;a)?b")
     * then {@code start_pos} and {@code end_pos} are set to -1 and {@code true} is returned.
     */
    public boolean fetchNamedPos(java.lang.String name, PointerInteger startPos, PointerInteger endPos) {
        try {
            var RESULT = (int) g_match_info_fetch_named_pos.invokeExact(handle(), Interop.allocateNativeString(name).handle(), startPos.handle(), endPos.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_match_info_fetch_pos = Interop.downcallHandle(
        "g_match_info_fetch_pos",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the position in bytes of the {@code match_num}'th capturing
     * parentheses. 0 is the full text of the match, 1 is the first
     * paren set, 2 the second, and so on.
     * <p>
     * If {@code match_num} is a valid sub pattern but it didn't match anything
     * (e.g. sub pattern 1, matching "b" against "(a)?b") then {@code start_pos}
     * and {@code end_pos} are set to -1 and {@code true} is returned.
     * <p>
     * If the match was obtained using the DFA algorithm, that is using
     * g_regex_match_all() or g_regex_match_all_full(), the retrieved
     * position is not that of a set of parentheses but that of a matched
     * substring. Substrings are matched in reverse order of length, so
     * 0 is the longest match.
     */
    public boolean fetchPos(int matchNum, PointerInteger startPos, PointerInteger endPos) {
        try {
            var RESULT = (int) g_match_info_fetch_pos.invokeExact(handle(), matchNum, startPos.handle(), endPos.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_match_info_free = Interop.downcallHandle(
        "g_match_info_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code match_info} is not {@code null}, calls g_match_info_unref(); otherwise does
     * nothing.
     */
    public void free() {
        try {
            g_match_info_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_match_info_get_match_count = Interop.downcallHandle(
        "g_match_info_get_match_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the number of matched substrings (including substring 0,
     * that is the whole matched text), so 1 is returned if the pattern
     * has no substrings in it and 0 is returned if the match failed.
     * <p>
     * If the last match was obtained using the DFA algorithm, that is
     * using g_regex_match_all() or g_regex_match_all_full(), the retrieved
     * count is not that of the number of capturing parentheses but that of
     * the number of matched substrings.
     */
    public int getMatchCount() {
        try {
            var RESULT = (int) g_match_info_get_match_count.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_match_info_get_regex = Interop.downcallHandle(
        "g_match_info_get_regex",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@link Regex} object used in {@code match_info}. It belongs to Glib
     * and must not be freed. Use g_regex_ref() if you need to keep it
     * after you free {@code match_info} object.
     */
    public Regex getRegex() {
        try {
            var RESULT = (MemoryAddress) g_match_info_get_regex.invokeExact(handle());
            return new Regex(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_match_info_get_string = Interop.downcallHandle(
        "g_match_info_get_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the string searched with {@code match_info}. This is the
     * string passed to g_regex_match() or g_regex_replace() so
     * you may not free it before calling this function.
     */
    public java.lang.String getString() {
        try {
            var RESULT = (MemoryAddress) g_match_info_get_string.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_match_info_is_partial_match = Interop.downcallHandle(
        "g_match_info_is_partial_match",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Usually if the string passed to g_regex_match*() matches as far as
     * it goes, but is too short to match the entire pattern, {@code false} is
     * returned. There are circumstances where it might be helpful to
     * distinguish this case from other cases in which there is no match.
     * <p>
     * Consider, for example, an application where a human is required to
     * type in data for a field with specific formatting requirements. An
     * example might be a date in the form ddmmmyy, defined by the pattern
     * "^\\d?\\d(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)\\d\\d$".
     * If the application sees the user’s keystrokes one by one, and can
     * check that what has been typed so far is potentially valid, it is
     * able to raise an error as soon as a mistake is made.
     * <p>
     * GRegex supports the concept of partial matching by means of the
     * {@link RegexMatchFlags#PARTIAL_SOFT} and {@link RegexMatchFlags#PARTIAL_HARD} flags.
     * When they are used, the return code for
     * g_regex_match() or g_regex_match_full() is, as usual, {@code true}
     * for a complete match, {@code false} otherwise. But, when these functions
     * return {@code false}, you can check if the match was partial calling
     * g_match_info_is_partial_match().
     * <p>
     * The difference between {@link RegexMatchFlags#PARTIAL_SOFT} and
     * {@link RegexMatchFlags#PARTIAL_HARD} is that when a partial match is encountered
     * with {@link RegexMatchFlags#PARTIAL_SOFT}, matching continues to search for a
     * possible complete match, while with {@link RegexMatchFlags#PARTIAL_HARD} matching
     * stops at the partial match.
     * When both {@link RegexMatchFlags#PARTIAL_SOFT} and {@link RegexMatchFlags#PARTIAL_HARD}
     * are set, the latter takes precedence.
     * <p>
     * There were formerly some restrictions on the pattern for partial matching.
     * The restrictions no longer apply.
     * <p>
     * See pcrepartial(3) for more information on partial matching.
     */
    public boolean isPartialMatch() {
        try {
            var RESULT = (int) g_match_info_is_partial_match.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_match_info_matches = Interop.downcallHandle(
        "g_match_info_matches",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the previous match operation succeeded.
     */
    public boolean matches() {
        try {
            var RESULT = (int) g_match_info_matches.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_match_info_next = Interop.downcallHandle(
        "g_match_info_next",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Scans for the next match using the same parameters of the previous
     * call to g_regex_match_full() or g_regex_match() that returned
     * {@code match_info}.
     * <p>
     * The match is done on the string passed to the match function, so you
     * cannot free it before calling this function.
     */
    public boolean next() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_match_info_next.invokeExact(handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_match_info_ref = Interop.downcallHandle(
        "g_match_info_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases reference count of {@code match_info} by 1.
     */
    public MatchInfo ref() {
        try {
            var RESULT = (MemoryAddress) g_match_info_ref.invokeExact(handle());
            return new MatchInfo(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_match_info_unref = Interop.downcallHandle(
        "g_match_info_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases reference count of {@code match_info} by 1. When reference count drops
     * to zero, it frees all the memory associated with the match_info structure.
     */
    public void unref() {
        try {
            g_match_info_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
