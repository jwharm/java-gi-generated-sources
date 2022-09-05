package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A GPatternSpec struct is the 'compiled' form of a pattern. This
 * structure is opaque and its fields cannot be accessed directly.
 */
public class PatternSpec extends io.github.jwharm.javagi.interop.ResourceBase {

    public PatternSpec(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Compiles a pattern to a #GPatternSpec.
     */
    public PatternSpec(java.lang.String pattern) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_pattern_spec_new(Interop.allocateNativeString(pattern).HANDLE()), true));
    }
    
    /**
     * Copies @pspec in a new #GPatternSpec.
     */
    public PatternSpec copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_pattern_spec_copy(HANDLE());
        return new PatternSpec(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Compares two compiled pattern specs and returns whether they will
     * match the same set of strings.
     */
    public boolean equal(PatternSpec pspec2) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_pattern_spec_equal(HANDLE(), pspec2.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Frees the memory allocated for the #GPatternSpec.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_pattern_spec_free(HANDLE());
    }
    
    /**
     * Matches a string against a compiled pattern. Passing the correct
     * length of the string given is mandatory. The reversed string can be
     * omitted by passing %NULL, this is more efficient if the reversed
     * version of the string to be matched is not at hand, as
     * g_pattern_match() will only construct it if the compiled pattern
     * requires reverse matches.
     * 
     * Note that, if the user code will (possibly) match a string against a
     * multitude of patterns containing wildcards, chances are high that
     * some patterns will require a reversed string. In this case, it's
     * more efficient to provide the reversed string to avoid multiple
     * constructions thereof in the various calls to g_pattern_match().
     * 
     * Note also that the reverse of a UTF-8 encoded string can in general
     * not be obtained by g_strreverse(). This works only if the string
     * does not contain any multibyte characters. GLib offers the
     * g_utf8_strreverse() function to reverse UTF-8 encoded strings.
     */
    public boolean match(long stringLength, java.lang.String string, java.lang.String stringReversed) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_pattern_spec_match(HANDLE(), stringLength, Interop.allocateNativeString(string).HANDLE(), Interop.allocateNativeString(stringReversed).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Matches a string against a compiled pattern. If the string is to be
     * matched against more than one pattern, consider using
     * g_pattern_match() instead while supplying the reversed string.
     */
    public boolean matchString(java.lang.String string) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_pattern_spec_match_string(HANDLE(), Interop.allocateNativeString(string).HANDLE());
        return (RESULT != 0);
    }
    
}
