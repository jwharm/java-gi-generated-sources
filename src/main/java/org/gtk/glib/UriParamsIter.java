package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Many URI schemes include one or more attribute/value pairs as part of the URI
 * value. For example {@code scheme://server/path?query=string&is=there} has two
 * attributes – {@code query=string} and {@code is=there} – in its query part.
 * <p>
 * A {@link UriParamsIter} structure represents an iterator that can be used to
 * iterate over the attribute/value pairs of a URI query string. {@link UriParamsIter}
 * structures are typically allocated on the stack and then initialized with
 * g_uri_params_iter_init(). See the documentation for g_uri_params_iter_init()
 * for a usage example.
 * @version 2.66
 */
public class UriParamsIter extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GUriParamsIter";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("dummy0"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("dummy1"),
            Interop.valueLayout.ADDRESS.withName("dummy2"),
            MemoryLayout.sequenceLayout(256, Interop.valueLayout.C_BYTE).withName("dummy3")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link UriParamsIter}
     * @return A new, uninitialized @{link UriParamsIter}
     */
    public static UriParamsIter allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        UriParamsIter newInstance = new UriParamsIter(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a UriParamsIter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected UriParamsIter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, UriParamsIter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new UriParamsIter(input);
    
    /**
     * Initializes an attribute/value pair iterator.
     * <p>
     * The iterator keeps pointers to the {@code params} and {@code separators} arguments, those
     * variables must thus outlive the iterator and not be modified during the
     * iteration.
     * <p>
     * If {@link UriParamsFlags#WWW_FORM} is passed in {@code flags}, {@code +} characters in the param
     * string will be replaced with spaces in the output. For example, {@code foo=bar+baz}
     * will give attribute {@code foo} with value {@code bar baz}. This is commonly used on the
     * web (the {@code https} and {@code http} schemes only), but is deprecated in favour of
     * the equivalent of encoding spaces as {@code %20}.
     * <p>
     * Unlike with g_uri_parse_params(), {@link UriParamsFlags#CASE_INSENSITIVE} has no
     * effect if passed to {@code flags} for g_uri_params_iter_init(). The caller is
     * responsible for doing their own case-insensitive comparisons.
     * <pre>{@code <!-- language="C" -->
     * GUriParamsIter iter;
     * GError *error = NULL;
     * gchar *unowned_attr, *unowned_value;
     * 
     * g_uri_params_iter_init (&iter, "foo=bar&baz=bar&Foo=frob&baz=bar2", -1, "&", G_URI_PARAMS_NONE);
     * while (g_uri_params_iter_next (&iter, &unowned_attr, &unowned_value, &error))
     *   {
     *     g_autofree gchar *attr = g_steal_pointer (&unowned_attr);
     *     g_autofree gchar *value = g_steal_pointer (&unowned_value);
     *     // do something with attr and value; this code will be called 4 times
     *     // for the params string in this example: once with attr=foo and value=bar,
     *     // then with baz/bar, then Foo/frob, then baz/bar2.
     *   }
     * if (error)
     *   // handle parsing error
     * }</pre>
     * @param params a {@code %}-encoded string containing {@code attribute=value}
     *   parameters
     * @param length the length of {@code params}, or {@code -1} if it is nul-terminated
     * @param separators the separator byte character set between parameters. (usually
     *   {@code &}, but sometimes {@code ;} or both {@code &;}). Note that this function works on
     *   bytes not characters, so it can't be used to delimit UTF-8 strings for
     *   anything but ASCII characters. You may pass an empty set, in which case
     *   no splitting will occur.
     * @param flags flags to modify the way the parameters are handled.
     */
    public void init(java.lang.String params, long length, java.lang.String separators, org.gtk.glib.UriParamsFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_uri_params_iter_init.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(params, SCOPE),
                        length,
                        Marshal.stringToAddress.marshal(separators, SCOPE),
                        flags.getValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Advances {@code iter} and retrieves the next attribute/value. {@code false} is returned if
     * an error has occurred (in which case {@code error} is set), or if the end of the
     * iteration is reached (in which case {@code attribute} and {@code value} are set to {@code null}
     * and the iterator becomes invalid). If {@code true} is returned,
     * g_uri_params_iter_next() may be called again to receive another
     * attribute/value pair.
     * <p>
     * Note that the same {@code attribute} may be returned multiple times, since URIs
     * allow repeated attributes.
     * @param attribute on return, contains
     *     the attribute, or {@code null}.
     * @param value on return, contains
     *     the value, or {@code null}.
     * @return {@code false} if the end of the parameters has been reached or an error was
     *     encountered. {@code true} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean next(@Nullable Out<java.lang.String> attribute, @Nullable Out<java.lang.String> value) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment attributePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment valuePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_uri_params_iter_next.invokeExact(
                        handle(),
                        (Addressable) (attribute == null ? MemoryAddress.NULL : (Addressable) attributePOINTER.address()),
                        (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) valuePOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (attribute != null) attribute.set(Marshal.addressToString.marshal(attributePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (value != null) value.set(Marshal.addressToString.marshal(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_uri_params_iter_init = Interop.downcallHandle(
                "g_uri_params_iter_init",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_uri_params_iter_next = Interop.downcallHandle(
                "g_uri_params_iter_next",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link UriParamsIter.Builder} object constructs a {@link UriParamsIter} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link UriParamsIter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final UriParamsIter struct;
        
        private Builder() {
            struct = UriParamsIter.allocate();
        }
        
        /**
         * Finish building the {@link UriParamsIter} struct.
         * @return A new instance of {@code UriParamsIter} with the fields 
         *         that were set in the Builder object.
         */
        public UriParamsIter build() {
            return struct;
        }
        
        public Builder setDummy0(int dummy0) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dummy0"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), dummy0);
                return this;
            }
        }
        
        public Builder setDummy1(java.lang.foreign.MemoryAddress dummy1) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dummy1"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dummy1 == null ? MemoryAddress.NULL : (Addressable) dummy1));
                return this;
            }
        }
        
        public Builder setDummy2(java.lang.foreign.MemoryAddress dummy2) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dummy2"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dummy2 == null ? MemoryAddress.NULL : (Addressable) dummy2));
                return this;
            }
        }
        
        public Builder setDummy3(byte[] dummy3) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dummy3"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dummy3 == null ? MemoryAddress.NULL : Interop.allocateNativeArray(dummy3, false, SCOPE)));
                return this;
            }
        }
    }
}
