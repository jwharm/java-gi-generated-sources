package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Determines if a string matches a file attribute.
 */
public class FileAttributeMatcher extends io.github.jwharm.javagi.ResourceBase {

    public FileAttributeMatcher(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_file_attribute_matcher_new = Interop.downcallHandle(
        "g_file_attribute_matcher_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull java.lang.String attributes) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_file_attribute_matcher_new.invokeExact(Interop.allocateNativeString(attributes)), true);
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
     * 
     * <h2>Examples of file attribute matcher strings and results</h2>
     * <ul>
     * <li>{@code "*"}: matches all attributes.
     * <li>{@code "standard::is-hidden"}: matches only the key is-hidden in the
     *   standard namespace.
     * <li>{@code "standard::type,unix::*"}: matches the type key in the standard
     *   namespace and all keys in the unix namespace.
     */
    public FileAttributeMatcher(@NotNull java.lang.String attributes) {
        super(constructNew(attributes));
    }
    
    private static final MethodHandle g_file_attribute_matcher_enumerate_namespace = Interop.downcallHandle(
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
    public boolean enumerateNamespace(@NotNull java.lang.String ns) {
        int RESULT;
        try {
            RESULT = (int) g_file_attribute_matcher_enumerate_namespace.invokeExact(handle(), Interop.allocateNativeString(ns));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_file_attribute_matcher_enumerate_next = Interop.downcallHandle(
        "g_file_attribute_matcher_enumerate_next",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the next matched attribute from a {@link FileAttributeMatcher}.
     */
    public @Nullable java.lang.String enumerateNext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_file_attribute_matcher_enumerate_next.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_file_attribute_matcher_matches = Interop.downcallHandle(
        "g_file_attribute_matcher_matches",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if an attribute will be matched by an attribute matcher. If
     * the matcher was created with the "*" matching string, this function
     * will always return {@code true}.
     */
    public boolean matches(@NotNull java.lang.String attribute) {
        int RESULT;
        try {
            RESULT = (int) g_file_attribute_matcher_matches.invokeExact(handle(), Interop.allocateNativeString(attribute));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_file_attribute_matcher_matches_only = Interop.downcallHandle(
        "g_file_attribute_matcher_matches_only",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a attribute matcher only matches a given attribute. Always
     * returns {@code false} if "*" was used when creating the matcher.
     */
    public boolean matchesOnly(@NotNull java.lang.String attribute) {
        int RESULT;
        try {
            RESULT = (int) g_file_attribute_matcher_matches_only.invokeExact(handle(), Interop.allocateNativeString(attribute));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_file_attribute_matcher_ref = Interop.downcallHandle(
        "g_file_attribute_matcher_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * References a file attribute matcher.
     */
    public @NotNull FileAttributeMatcher ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_file_attribute_matcher_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FileAttributeMatcher(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_file_attribute_matcher_subtract = Interop.downcallHandle(
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
    public @Nullable FileAttributeMatcher subtract(@Nullable FileAttributeMatcher subtract) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_file_attribute_matcher_subtract.invokeExact(handle(), subtract.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FileAttributeMatcher(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_file_attribute_matcher_to_string = Interop.downcallHandle(
        "g_file_attribute_matcher_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prints what the matcher is matching against. The format will be
     * equal to the format passed to g_file_attribute_matcher_new().
     * The output however, might not be identical, as the matcher may
     * decide to use a different order or omit needless parts.
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_file_attribute_matcher_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_file_attribute_matcher_unref = Interop.downcallHandle(
        "g_file_attribute_matcher_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Unreferences {@code matcher}. If the reference count falls below 1,
     * the {@code matcher} is automatically freed.
     */
    public @NotNull void unref() {
        try {
            g_file_attribute_matcher_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
