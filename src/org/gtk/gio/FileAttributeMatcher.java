package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Determines if a string matches a file attribute.
 */
public class FileAttributeMatcher extends io.github.jwharm.javagi.interop.ResourceBase {

    public FileAttributeMatcher(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Creates a new file attribute matcher, which matches attributes
     * against a given string. #GFileAttributeMatchers are reference
     * counted structures, and are created with a reference count of 1. If
     * the number of references falls to 0, the #GFileAttributeMatcher is
     * automatically destroyed.
     * 
     * The @attributes string should be formatted with specific keys separated
     * from namespaces with a double colon. Several "namespace::key" strings may be
     * concatenated with a single comma (e.g. "standard::type,standard::is-hidden").
     * The wildcard "*" may be used to match all keys and namespaces, or
     * "namespace::*" will match all keys in a given namespace.
     * 
     * ## Examples of file attribute matcher strings and results
     * 
     * - `"*"`: matches all attributes.
     * - `"standard::is-hidden"`: matches only the key is-hidden in the
     *   standard namespace.
     * - `"standard::type,unix::*"`: matches the type key in the standard
     *   namespace and all keys in the unix namespace.
     */
    public FileAttributeMatcher(java.lang.String attributes) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_attribute_matcher_new(Interop.allocateNativeString(attributes).HANDLE()), true));
    }
    
    /**
     * Checks if the matcher will match all of the keys in a given namespace.
     * This will always return %TRUE if a wildcard character is in use (e.g. if
     * matcher was created with "standard::*" and @ns is "standard", or if matcher was created
     * using "*" and namespace is anything.)
     * 
     * TODO: this is awkwardly worded.
     */
    public boolean enumerateNamespace(java.lang.String ns) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_attribute_matcher_enumerate_namespace(HANDLE(), Interop.allocateNativeString(ns).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the next matched attribute from a #GFileAttributeMatcher.
     */
    public java.lang.String enumerateNext() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_attribute_matcher_enumerate_next(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks if an attribute will be matched by an attribute matcher. If
     * the matcher was created with the "*" matching string, this function
     * will always return %TRUE.
     */
    public boolean matches(java.lang.String attribute) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_attribute_matcher_matches(HANDLE(), Interop.allocateNativeString(attribute).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a attribute matcher only matches a given attribute. Always
     * returns %FALSE if "*" was used when creating the matcher.
     */
    public boolean matchesOnly(java.lang.String attribute) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_attribute_matcher_matches_only(HANDLE(), Interop.allocateNativeString(attribute).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * References a file attribute matcher.
     */
    public FileAttributeMatcher ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_attribute_matcher_ref(HANDLE());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_attribute_matcher_subtract(HANDLE(), subtract.HANDLE());
        return new FileAttributeMatcher(References.get(RESULT, true));
    }
    
    /**
     * Prints what the matcher is matching against. The format will be
     * equal to the format passed to g_file_attribute_matcher_new().
     * The output however, might not be identical, as the matcher may
     * decide to use a different order or omit needless parts.
     */
    public java.lang.String toString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_attribute_matcher_to_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Unreferences @matcher. If the reference count falls below 1,
     * the @matcher is automatically freed.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_attribute_matcher_unref(HANDLE());
    }
    
}
