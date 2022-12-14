package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A GMatchInfo is an opaque struct used to return information about
 * matches.
 */
public class MatchInfo extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMatchInfo";
    
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
     * Allocate a new {@link MatchInfo}
     * @return A new, uninitialized @{link MatchInfo}
     */
    public static MatchInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MatchInfo newInstance = new MatchInfo(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a MatchInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MatchInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MatchInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MatchInfo(input);
    
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
     * @param stringToExpand the string to expand
     * @return the expanded string, or {@code null} if an error occurred
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @Nullable java.lang.String expandReferences(java.lang.String stringToExpand) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_match_info_expand_references.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(stringToExpand, SCOPE),
                        (Addressable) GERROR);
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
     * @param matchNum number of the sub expression
     * @return The matched substring, or {@code null} if an error
     *     occurred. You have to free the string yourself
     */
    public @Nullable java.lang.String fetch(int matchNum) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_match_info_fetch.invokeExact(
                    handle(),
                    matchNum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
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
     * @return a {@code null}-terminated array of gchar *
     *     pointers.  It must be freed using g_strfreev(). If the previous
     *     match failed {@code null} is returned
     */
    public PointerString fetchAll() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_match_info_fetch_all.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Retrieves the text matching the capturing parentheses named {@code name}.
     * <p>
     * If {@code name} is a valid sub pattern name but it didn't match anything
     * (e.g. sub pattern "X", matching "b" against "(?P&lt;X&gt;a)?b")
     * then an empty string is returned.
     * <p>
     * The string is fetched from the string passed to the match function,
     * so you cannot call this function after freeing the string.
     * @param name name of the subexpression
     * @return The matched substring, or {@code null} if an error
     *     occurred. You have to free the string yourself
     */
    public @Nullable java.lang.String fetchNamed(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_match_info_fetch_named.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Retrieves the position in bytes of the capturing parentheses named {@code name}.
     * <p>
     * If {@code name} is a valid sub pattern name but it didn't match anything
     * (e.g. sub pattern "X", matching "b" against "(?P&lt;X&gt;a)?b")
     * then {@code start_pos} and {@code end_pos} are set to -1 and {@code true} is returned.
     * @param name name of the subexpression
     * @param startPos pointer to location where to store
     *     the start position, or {@code null}
     * @param endPos pointer to location where to store
     *     the end position, or {@code null}
     * @return {@code true} if the position was fetched, {@code false} otherwise.
     *     If the position cannot be fetched, {@code start_pos} and {@code end_pos}
     *     are left unchanged.
     */
    public boolean fetchNamedPos(java.lang.String name, Out<Integer> startPos, Out<Integer> endPos) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment startPosPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment endPosPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_match_info_fetch_named_pos.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        (Addressable) (startPos == null ? MemoryAddress.NULL : (Addressable) startPosPOINTER.address()),
                        (Addressable) (endPos == null ? MemoryAddress.NULL : (Addressable) endPosPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (startPos != null) startPos.set(startPosPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (endPos != null) endPos.set(endPosPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
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
     * @param matchNum number of the sub expression
     * @param startPos pointer to location where to store
     *     the start position, or {@code null}
     * @param endPos pointer to location where to store
     *     the end position, or {@code null}
     * @return {@code true} if the position was fetched, {@code false} otherwise. If
     *   the position cannot be fetched, {@code start_pos} and {@code end_pos} are left
     *   unchanged
     */
    public boolean fetchPos(int matchNum, Out<Integer> startPos, Out<Integer> endPos) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment startPosPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment endPosPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_match_info_fetch_pos.invokeExact(
                        handle(),
                        matchNum,
                        (Addressable) (startPos == null ? MemoryAddress.NULL : (Addressable) startPosPOINTER.address()),
                        (Addressable) (endPos == null ? MemoryAddress.NULL : (Addressable) endPosPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (startPos != null) startPos.set(startPosPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (endPos != null) endPos.set(endPosPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * If {@code match_info} is not {@code null}, calls g_match_info_unref(); otherwise does
     * nothing.
     */
    public void free() {
        try {
            DowncallHandles.g_match_info_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the number of matched substrings (including substring 0,
     * that is the whole matched text), so 1 is returned if the pattern
     * has no substrings in it and 0 is returned if the match failed.
     * <p>
     * If the last match was obtained using the DFA algorithm, that is
     * using g_regex_match_all() or g_regex_match_all_full(), the retrieved
     * count is not that of the number of capturing parentheses but that of
     * the number of matched substrings.
     * @return Number of matched substrings, or -1 if an error occurred
     */
    public int getMatchCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_match_info_get_match_count.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns {@link Regex} object used in {@code match_info}. It belongs to Glib
     * and must not be freed. Use g_regex_ref() if you need to keep it
     * after you free {@code match_info} object.
     * @return {@link Regex} object used in {@code match_info}
     */
    public org.gtk.glib.Regex getRegex() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_match_info_get_regex.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Regex.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the string searched with {@code match_info}. This is the
     * string passed to g_regex_match() or g_regex_replace() so
     * you may not free it before calling this function.
     * @return the string searched with {@code match_info}
     */
    public java.lang.String getString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_match_info_get_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
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
     * If the application sees the user???s keystrokes one by one, and can
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
     * @return {@code true} if the match was partial, {@code false} otherwise
     */
    public boolean isPartialMatch() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_match_info_is_partial_match.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether the previous match operation succeeded.
     * @return {@code true} if the previous match operation succeeded,
     *   {@code false} otherwise
     */
    public boolean matches() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_match_info_matches.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Scans for the next match using the same parameters of the previous
     * call to g_regex_match_full() or g_regex_match() that returned
     * {@code match_info}.
     * <p>
     * The match is done on the string passed to the match function, so you
     * cannot free it before calling this function.
     * @return {@code true} is the string matched, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean next() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_match_info_next.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Increases reference count of {@code match_info} by 1.
     * @return {@code match_info}
     */
    public org.gtk.glib.MatchInfo ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_match_info_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.MatchInfo.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Decreases reference count of {@code match_info} by 1. When reference count drops
     * to zero, it frees all the memory associated with the match_info structure.
     */
    public void unref() {
        try {
            DowncallHandles.g_match_info_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_match_info_expand_references = Interop.downcallHandle(
                "g_match_info_expand_references",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_match_info_fetch = Interop.downcallHandle(
                "g_match_info_fetch",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_match_info_fetch_all = Interop.downcallHandle(
                "g_match_info_fetch_all",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_match_info_fetch_named = Interop.downcallHandle(
                "g_match_info_fetch_named",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_match_info_fetch_named_pos = Interop.downcallHandle(
                "g_match_info_fetch_named_pos",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_match_info_fetch_pos = Interop.downcallHandle(
                "g_match_info_fetch_pos",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_match_info_free = Interop.downcallHandle(
                "g_match_info_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_match_info_get_match_count = Interop.downcallHandle(
                "g_match_info_get_match_count",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_match_info_get_regex = Interop.downcallHandle(
                "g_match_info_get_regex",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_match_info_get_string = Interop.downcallHandle(
                "g_match_info_get_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_match_info_is_partial_match = Interop.downcallHandle(
                "g_match_info_is_partial_match",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_match_info_matches = Interop.downcallHandle(
                "g_match_info_matches",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_match_info_next = Interop.downcallHandle(
                "g_match_info_next",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_match_info_ref = Interop.downcallHandle(
                "g_match_info_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_match_info_unref = Interop.downcallHandle(
                "g_match_info_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
}
