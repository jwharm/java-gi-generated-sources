package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A GPatternSpec struct is the 'compiled' form of a pattern. This
 * structure is opaque and its fields cannot be accessed directly.
 */
public class PatternSpec extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GPatternSpec";
    
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
     * Allocate a new {@link PatternSpec}
     * @return A new, uninitialized @{link PatternSpec}
     */
    public static PatternSpec allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PatternSpec newInstance = new PatternSpec(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PatternSpec proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PatternSpec(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PatternSpec> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PatternSpec(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String pattern) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_pattern_spec_new.invokeExact(
                    Marshal.stringToAddress.marshal(pattern, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Compiles a pattern to a {@link PatternSpec}.
     * @param pattern a zero-terminated UTF-8 encoded string
     */
    public PatternSpec(java.lang.String pattern) {
        super(constructNew(pattern), Ownership.FULL);
    }
    
    /**
     * Copies {@code pspec} in a new {@link PatternSpec}.
     * @return a copy of {@code pspec}.
     */
    public org.gtk.glib.PatternSpec copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_pattern_spec_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.PatternSpec.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Compares two compiled pattern specs and returns whether they will
     * match the same set of strings.
     * @param pspec2 another {@link PatternSpec}
     * @return Whether the compiled patterns are equal
     */
    public boolean equal(org.gtk.glib.PatternSpec pspec2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_pattern_spec_equal.invokeExact(
                    handle(),
                    pspec2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Frees the memory allocated for the {@link PatternSpec}.
     */
    public void free() {
        try {
            DowncallHandles.g_pattern_spec_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param stringLength the length of {@code string} (in bytes, i.e. strlen(),
     *     not g_utf8_strlen())
     * @param string the UTF-8 encoded string to match
     * @param stringReversed the reverse of {@code string} or {@code null}
     * @return {@code true} if {@code string} matches {@code pspec}
     */
    public boolean match(long stringLength, java.lang.String string, @Nullable java.lang.String stringReversed) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_pattern_spec_match.invokeExact(
                    handle(),
                    stringLength,
                    Marshal.stringToAddress.marshal(string, null),
                    (Addressable) (stringReversed == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(stringReversed, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Matches a string against a compiled pattern. If the string is to be
     * matched against more than one pattern, consider using
     * g_pattern_match() instead while supplying the reversed string.
     * @param string the UTF-8 encoded string to match
     * @return {@code true} if {@code string} matches {@code pspec}
     */
    public boolean matchString(java.lang.String string) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_pattern_spec_match_string.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(string, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_pattern_spec_new = Interop.downcallHandle(
            "g_pattern_spec_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_pattern_spec_copy = Interop.downcallHandle(
            "g_pattern_spec_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_pattern_spec_equal = Interop.downcallHandle(
            "g_pattern_spec_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_pattern_spec_free = Interop.downcallHandle(
            "g_pattern_spec_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_pattern_spec_match = Interop.downcallHandle(
            "g_pattern_spec_match",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_pattern_spec_match_string = Interop.downcallHandle(
            "g_pattern_spec_match_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
