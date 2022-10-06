package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 */
public class UriParamsIter extends io.github.jwharm.javagi.ResourceBase {

    public UriParamsIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_uri_params_iter_init = Interop.downcallHandle(
        "g_uri_params_iter_init",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     * <p>
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
     */
    public void init(java.lang.String params, long length, java.lang.String separators, UriParamsFlags flags) {
        try {
            g_uri_params_iter_init.invokeExact(handle(), Interop.allocateNativeString(params).handle(), length, Interop.allocateNativeString(separators).handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_params_iter_next = Interop.downcallHandle(
        "g_uri_params_iter_next",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean next(PointerString attribute, PointerString value) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_uri_params_iter_next.invokeExact(handle(), attribute.handle(), value.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
