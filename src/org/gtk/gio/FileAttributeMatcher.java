package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Determines if a string matches a file attribute.
 */
public class FileAttributeMatcher extends io.github.jwharm.javagi.ResourceBase {

    public FileAttributeMatcher(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(java.lang.String attributes) {
        Reference RESULT = References.get(gtk_h.g_file_attribute_matcher_new(Interop.allocateNativeString(attributes).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new file attribute matcher, which matches attributes
     * against a given string. #GFileAttributeMatchers are reference
     * counted structures, and are created with a reference count of 1. If
     * the number of references falls to 0, the #GFileAttributeMatcher is
     * automatically destroyed.
     * <p>
     * The @attributes string should be formatted with specific keys separated
     * from namespaces with a double colon. Several &#34;namespace::key&#34; strings may be
     * concatenated with a single comma (e.g. &#34;standard::type,standard::is-hidden&#34;).
     * The wildcard &#34;*&#34; may be used to match all keys and namespaces, or
     * &#34;namespace::*&#34; will match all keys in a given namespace.
     * <p>
     * <h2>Examples of file attribute matcher strings and results</h2>
     * <p>
     * <li><code>&#34;*&#34;</code>: matches all attributes.
     * <li><code>&#34;standard::is-hidden&#34;</code>: matches only the key is-hidden in the
     *   standard namespace.
     * <li><code>&#34;standard::type,unix::*&#34;</code>: matches the type key in the standard
     *   namespace and all keys in the unix namespace.
     */
    public FileAttributeMatcher(java.lang.String attributes) {
        super(constructNew(attributes));
    }
    
    /**
     * Checks if the matcher will match all of the keys in a given namespace.
     * This will always return <code>true</code> if a wildcard character is in use (e.g. if
     * matcher was created with &#34;standard::*&#34; and @ns is &#34;standard&#34;, or if matcher was created
     * using &#34;*&#34; and namespace is anything.)
     * 
     * TODO: this is awkwardly worded.
     */
    public boolean enumerateNamespace(java.lang.String ns) {
        var RESULT = gtk_h.g_file_attribute_matcher_enumerate_namespace(handle(), Interop.allocateNativeString(ns).handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the next matched attribute from a #GFileAttributeMatcher.
     */
    public java.lang.String enumerateNext() {
        var RESULT = gtk_h.g_file_attribute_matcher_enumerate_next(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks if an attribute will be matched by an attribute matcher. If
     * the matcher was created with the &#34;*&#34; matching string, this function
     * will always return 
     *             
     *           
     *         
     *       
     *       
     *         Checks if an attribute will be matched by an attribute matcher. If
     * the matcher was created with the &#34;*&#34; matching string, this function
     * will always return %TRUE.
     */
    public boolean matches(java.lang.String attribute) {
        var RESULT = gtk_h.g_file_attribute_matcher_matches(handle(), Interop.allocateNativeString(attribute).handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a attribute matcher only matches a given attribute. Always
     * returns <code>false</code> if &#34;*&#34; was used when creating the matcher.
     */
    public boolean matchesOnly(java.lang.String attribute) {
        var RESULT = gtk_h.g_file_attribute_matcher_matches_only(handle(), Interop.allocateNativeString(attribute).handle());
        return (RESULT != 0);
    }
    
    /**
     * References a file attribute matcher.
     */
    public FileAttributeMatcher ref() {
        var RESULT = gtk_h.g_file_attribute_matcher_ref(handle());
        return new FileAttributeMatcher(References.get(RESULT, true));
    }
    
    /**
     * Subtracts all attributes of @subtract from @matcher and returns
     * a matcher that supports those attributes.
     * 
     * Note that currently it is not possible to remove a single
     * attribute when the @matcher matches the whole namespace - or remove
     * a namespace or attribute when the matcher matches everything. This
     * is a limitation of the current implementation, but may be fixed
     * in the future.
     */
    public FileAttributeMatcher subtract(FileAttributeMatcher subtract) {
        var RESULT = gtk_h.g_file_attribute_matcher_subtract(handle(), subtract.handle());
        return new FileAttributeMatcher(References.get(RESULT, true));
    }
    
    /**
     * Prints what the matcher is matching against. The format will be
     * equal to the format passed to g_file_attribute_matcher_new().
     * The output however, might not be identical, as the matcher may
     * decide to use a different order or omit needless parts.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.g_file_attribute_matcher_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Unreferences @matcher. If the reference count falls below 1,
     * the @matcher is automatically freed.
     */
    public void unref() {
        gtk_h.g_file_attribute_matcher_unref(handle());
    }
    
}
