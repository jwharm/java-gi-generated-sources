package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A GPatternSpec struct is the 'compiled' form of a pattern. This
 * structure is opaque and its fields cannot be accessed directly.
 */
public class PatternSpec extends io.github.jwharm.javagi.ResourceBase {

    public PatternSpec(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_pattern_spec_new = Interop.downcallHandle(
        "g_pattern_spec_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull java.lang.String pattern) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_pattern_spec_new.invokeExact(Interop.allocateNativeString(pattern)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compiles a pattern to a {@link PatternSpec}.
     */
    public PatternSpec(@NotNull java.lang.String pattern) {
        super(constructNew(pattern));
    }
    
    private static final MethodHandle g_pattern_spec_copy = Interop.downcallHandle(
        "g_pattern_spec_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies {@code pspec} in a new {@link PatternSpec}.
     */
    public @NotNull PatternSpec copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_pattern_spec_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PatternSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_pattern_spec_equal = Interop.downcallHandle(
        "g_pattern_spec_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares two compiled pattern specs and returns whether they will
     * match the same set of strings.
     */
    public boolean equal(@NotNull PatternSpec pspec2) {
        int RESULT;
        try {
            RESULT = (int) g_pattern_spec_equal.invokeExact(handle(), pspec2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_pattern_spec_free = Interop.downcallHandle(
        "g_pattern_spec_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the memory allocated for the {@link PatternSpec}.
     */
    public @NotNull void free() {
        try {
            g_pattern_spec_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_pattern_spec_match = Interop.downcallHandle(
        "g_pattern_spec_match",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Matches a string against a compiled pattern. Passing the correct
     * length of the string given is mandatory. The reversed string can be
     * omitted by passing {@code null}, this is more efficient if the reversed
     * version of the string to be matched is not at hand, as
     * g_pattern_match() will only construct it if the compiled pattern
     * requires reverse matches.
     * <p>
     * Note that, if the user code will (possibly) match a string against a
     * multitude of patterns containing wildcards, chances are high that
     * some patterns will require a reversed string. In this case, it's
     * more efficient to provide the reversed string to avoid multiple
     * constructions thereof in the various calls to g_pattern_match().
     * <p>
     * Note also that the reverse of a UTF-8 encoded string can in general
     * not be obtained by g_strreverse(). This works only if the string
     * does not contain any multibyte characters. GLib offers the
     * g_utf8_strreverse() function to reverse UTF-8 encoded strings.
     */
    public boolean match(@NotNull long stringLength, @NotNull java.lang.String string, @Nullable java.lang.String stringReversed) {
        int RESULT;
        try {
            RESULT = (int) g_pattern_spec_match.invokeExact(handle(), stringLength, Interop.allocateNativeString(string), Interop.allocateNativeString(stringReversed));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_pattern_spec_match_string = Interop.downcallHandle(
        "g_pattern_spec_match_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Matches a string against a compiled pattern. If the string is to be
     * matched against more than one pattern, consider using
     * g_pattern_match() instead while supplying the reversed string.
     */
    public boolean matchString(@NotNull java.lang.String string) {
        int RESULT;
        try {
            RESULT = (int) g_pattern_spec_match_string.invokeExact(handle(), Interop.allocateNativeString(string));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
}
