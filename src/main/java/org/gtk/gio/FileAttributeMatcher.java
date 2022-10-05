package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Determines if a string matches a file attribute.
 */
public class FileAttributeMatcher extends io.github.jwharm.javagi.ResourceBase {

    public FileAttributeMatcher(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_file_attribute_matcher_new = Interop.downcallHandle(
        "g_file_attribute_matcher_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(java.lang.String attributes) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_file_attribute_matcher_new.invokeExact(Interop.allocateNativeString(attributes).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new file attribute matcher, which matches attributes
     * against a given string. {@code GFileAttributeMatchers} are reference
     * counted structures, and are created with a reference count of 1. If
     * the number of references falls to 0, the {@link FileAttributeMatcher} is
     * automatically destroyed.
     * <p>
     * The {@code attributes} string should be formatted with specific keys separated
     * from namespaces with a double colon. Several "namespace::key" strings may be
     * concatenated with a single comma (e.g. "standard::type,standard::is-hidden").
     * The wildcard "*" may be used to match all keys and namespaces, or
     * "namespace::*" will match all keys in a given namespace.
     * <p>
     * <h2>Examples of file attribute matcher strings and results</h2>
     * <p>
     * <ul>
     * <li>{@code "*"}: matches all attributes.
     * <li>{@code "standard::is-hidden"}: matches only the key is-hidden in the
     *   standard namespace.
     * <li>{@code "standard::type,unix::*"}: matches the type key in the standard
     *   namespace and all keys in the unix namespace.
     */
    public FileAttributeMatcher(java.lang.String attributes) {
        super(constructNew(attributes));
    }
    
    static final MethodHandle g_file_attribute_matcher_enumerate_namespace = Interop.downcallHandle(
        "g_file_attribute_matcher_enumerate_namespace",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the matcher will match all of the keys in a given namespace.
     * This will always return {@code true} if a wildcard character is in use (e.g. if
     * matcher was created with "standard::*" and {@code ns} is "standard", or if matcher was created
     * using "*" and namespace is anything.)
     * <p>
     * TODO: this is awkwardly worded.
     */
    public boolean enumerateNamespace(java.lang.String ns) {
        try {
            var RESULT = (int) g_file_attribute_matcher_enumerate_namespace.invokeExact(handle(), Interop.allocateNativeString(ns).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_attribute_matcher_enumerate_next = Interop.downcallHandle(
        "g_file_attribute_matcher_enumerate_next",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the next matched attribute from a {@link FileAttributeMatcher}.
     */
    public java.lang.String enumerateNext() {
        try {
            var RESULT = (MemoryAddress) g_file_attribute_matcher_enumerate_next.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_attribute_matcher_matches = Interop.downcallHandle(
        "g_file_attribute_matcher_matches",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if an attribute will be matched by an attribute matcher. If
     * the matcher was created with the "*" matching string, this function
     * will always return {@code true}.
     */
    public boolean matches(java.lang.String attribute) {
        try {
            var RESULT = (int) g_file_attribute_matcher_matches.invokeExact(handle(), Interop.allocateNativeString(attribute).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_attribute_matcher_matches_only = Interop.downcallHandle(
        "g_file_attribute_matcher_matches_only",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a attribute matcher only matches a given attribute. Always
     * returns {@code false} if "*" was used when creating the matcher.
     */
    public boolean matchesOnly(java.lang.String attribute) {
        try {
            var RESULT = (int) g_file_attribute_matcher_matches_only.invokeExact(handle(), Interop.allocateNativeString(attribute).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_attribute_matcher_ref = Interop.downcallHandle(
        "g_file_attribute_matcher_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * References a file attribute matcher.
     */
    public FileAttributeMatcher ref() {
        try {
            var RESULT = (MemoryAddress) g_file_attribute_matcher_ref.invokeExact(handle());
            return new FileAttributeMatcher(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_attribute_matcher_subtract = Interop.downcallHandle(
        "g_file_attribute_matcher_subtract",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Subtracts all attributes of {@code subtract} from {@code matcher} and returns
     * a matcher that supports those attributes.
     * <p>
     * Note that currently it is not possible to remove a single
     * attribute when the {@code matcher} matches the whole namespace - or remove
     * a namespace or attribute when the matcher matches everything. This
     * is a limitation of the current implementation, but may be fixed
     * in the future.
     */
    public FileAttributeMatcher subtract(FileAttributeMatcher subtract) {
        try {
            var RESULT = (MemoryAddress) g_file_attribute_matcher_subtract.invokeExact(handle(), subtract.handle());
            return new FileAttributeMatcher(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_attribute_matcher_to_string = Interop.downcallHandle(
        "g_file_attribute_matcher_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prints what the matcher is matching against. The format will be
     * equal to the format passed to g_file_attribute_matcher_new().
     * The output however, might not be identical, as the matcher may
     * decide to use a different order or omit needless parts.
     */
    public java.lang.String toString() {
        try {
            var RESULT = (MemoryAddress) g_file_attribute_matcher_to_string.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_attribute_matcher_unref = Interop.downcallHandle(
        "g_file_attribute_matcher_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Unreferences {@code matcher}. If the reference count falls below 1,
     * the {@code matcher} is automatically freed.
     */
    public void unref() {
        try {
            g_file_attribute_matcher_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
