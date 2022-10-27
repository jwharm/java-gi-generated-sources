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
public class UriParamsIter extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("dummy0"),
        Interop.valueLayout.ADDRESS.withName("dummy1"),
        Interop.valueLayout.ADDRESS.withName("dummy2"),
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("dummy3")
    ).withName("GUriParamsIter");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public UriParamsIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
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
    public void init(@NotNull java.lang.String params, long length, @NotNull java.lang.String separators, @NotNull org.gtk.glib.UriParamsFlags flags) {
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        java.util.Objects.requireNonNull(separators, "Parameter 'separators' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_uri_params_iter_init.invokeExact(handle(), Interop.allocateNativeString(params), length, Interop.allocateNativeString(separators), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
        java.util.Objects.requireNonNullElse(attribute, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(value, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment attributePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_uri_params_iter_next.invokeExact(handle(), (Addressable) attributePOINTER.address(), (Addressable) valuePOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        attribute.set(attributePOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        value.set(valuePOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_uri_params_iter_init = Interop.downcallHandle(
            "g_uri_params_iter_init",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_uri_params_iter_next = Interop.downcallHandle(
            "g_uri_params_iter_next",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
