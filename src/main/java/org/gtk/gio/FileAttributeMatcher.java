package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Determines if a string matches a file attribute.
 */
public class FileAttributeMatcher extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileAttributeMatcher";
    
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
     * Allocate a new {@link FileAttributeMatcher}
     * @return A new, uninitialized @{link FileAttributeMatcher}
     */
    public static FileAttributeMatcher allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        FileAttributeMatcher newInstance = new FileAttributeMatcher(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a FileAttributeMatcher proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FileAttributeMatcher(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileAttributeMatcher> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FileAttributeMatcher(input);
    
    private static MemoryAddress constructNew(java.lang.String attributes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_file_attribute_matcher_new.invokeExact(Marshal.stringToAddress.marshal(attributes, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
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
     * <strong>Examples of file attribute matcher strings and results</strong><br/>
     * <ul>
     * <li>{@code "*"}: matches all attributes.
     * <li>{@code "standard::is-hidden"}: matches only the key is-hidden in the
     *   standard namespace.
     * <li>{@code "standard::type,unix::*"}: matches the type key in the standard
     *   namespace and all keys in the unix namespace.
     * </ul>
     * @param attributes an attribute string to match.
     */
    public FileAttributeMatcher(java.lang.String attributes) {
        super(constructNew(attributes));
        this.takeOwnership();
    }
    
    /**
     * Checks if the matcher will match all of the keys in a given namespace.
     * This will always return {@code true} if a wildcard character is in use (e.g. if
     * matcher was created with "standard::*" and {@code ns} is "standard", or if matcher was created
     * using "*" and namespace is anything.)
     * <p>
     * TODO: this is awkwardly worded.
     * @param ns a string containing a file attribute namespace.
     * @return {@code true} if the matcher matches all of the entries
     * in the given {@code ns}, {@code false} otherwise.
     */
    public boolean enumerateNamespace(java.lang.String ns) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_file_attribute_matcher_enumerate_namespace.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(ns, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Gets the next matched attribute from a {@link FileAttributeMatcher}.
     * @return a string containing the next attribute or, {@code null} if
     * no more attribute exist.
     */
    public @Nullable java.lang.String enumerateNext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_attribute_matcher_enumerate_next.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Checks if an attribute will be matched by an attribute matcher. If
     * the matcher was created with the "*" matching string, this function
     * will always return {@code true}.
     * @param attribute a file attribute key.
     * @return {@code true} if {@code attribute} matches {@code matcher}. {@code false} otherwise.
     */
    public boolean matches(java.lang.String attribute) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_file_attribute_matcher_matches.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(attribute, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Checks if a attribute matcher only matches a given attribute. Always
     * returns {@code false} if "*" was used when creating the matcher.
     * @param attribute a file attribute key.
     * @return {@code true} if the matcher only matches {@code attribute}. {@code false} otherwise.
     */
    public boolean matchesOnly(java.lang.String attribute) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_file_attribute_matcher_matches_only.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(attribute, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * References a file attribute matcher.
     * @return a {@link FileAttributeMatcher}.
     */
    public org.gtk.gio.FileAttributeMatcher ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_attribute_matcher_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gio.FileAttributeMatcher.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Subtracts all attributes of {@code subtract} from {@code matcher} and returns
     * a matcher that supports those attributes.
     * <p>
     * Note that currently it is not possible to remove a single
     * attribute when the {@code matcher} matches the whole namespace - or remove
     * a namespace or attribute when the matcher matches everything. This
     * is a limitation of the current implementation, but may be fixed
     * in the future.
     * @param subtract The matcher to subtract
     * @return A file attribute matcher matching all attributes of
     *     {@code matcher} that are not matched by {@code subtract}
     */
    public @Nullable org.gtk.gio.FileAttributeMatcher subtract(@Nullable org.gtk.gio.FileAttributeMatcher subtract) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_attribute_matcher_subtract.invokeExact(
                    handle(),
                    (Addressable) (subtract == null ? MemoryAddress.NULL : subtract.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gio.FileAttributeMatcher.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Prints what the matcher is matching against. The format will be
     * equal to the format passed to g_file_attribute_matcher_new().
     * The output however, might not be identical, as the matcher may
     * decide to use a different order or omit needless parts.
     * @return a string describing the attributes the matcher matches
     *   against or {@code null} if {@code matcher} was {@code null}.
     */
    public java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_attribute_matcher_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Unreferences {@code matcher}. If the reference count falls below 1,
     * the {@code matcher} is automatically freed.
     */
    public void unref() {
        try {
            DowncallHandles.g_file_attribute_matcher_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_file_attribute_matcher_new = Interop.downcallHandle(
                "g_file_attribute_matcher_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_attribute_matcher_enumerate_namespace = Interop.downcallHandle(
                "g_file_attribute_matcher_enumerate_namespace",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_attribute_matcher_enumerate_next = Interop.downcallHandle(
                "g_file_attribute_matcher_enumerate_next",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_attribute_matcher_matches = Interop.downcallHandle(
                "g_file_attribute_matcher_matches",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_attribute_matcher_matches_only = Interop.downcallHandle(
                "g_file_attribute_matcher_matches_only",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_attribute_matcher_ref = Interop.downcallHandle(
                "g_file_attribute_matcher_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_attribute_matcher_subtract = Interop.downcallHandle(
                "g_file_attribute_matcher_subtract",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_attribute_matcher_to_string = Interop.downcallHandle(
                "g_file_attribute_matcher_to_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_attribute_matcher_unref = Interop.downcallHandle(
                "g_file_attribute_matcher_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
}
