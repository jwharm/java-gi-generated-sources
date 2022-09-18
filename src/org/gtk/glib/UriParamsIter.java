package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Many URI schemes include one or more attribute/value pairs as part of the URI
 * value. For example <code>scheme://server/path?query=string&<code>#38</code> is=there</code> has two
 * attributes &<code>#8211</code>  <code>query=string</code> and <code>is=there</code> &<code>#8211</code>  in its query part.
 * 
 * A {@link org.gtk.glib.UriParamsIter} structure represents an iterator that can be used to
 * iterate over the attribute/value pairs of a URI query string. {@link org.gtk.glib.UriParamsIter} structures are typically allocated on the stack and then initialized with
 * g_uri_params_iter_init(). See the documentation for g_uri_params_iter_init()
 * for a usage example.
 */
public class UriParamsIter extends io.github.jwharm.javagi.ResourceBase {

    public UriParamsIter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Initializes an attribute/value pair iterator.
     * <p>
     * The iterator keeps pointers to the @params and @separators arguments, those
     * variables must thus outlive the iterator and not be modified during the
     * iteration.
     * <p>
     * If {@link org.gtk.glib.UriParamsFlags<code>#WWW_FORM</code>  is passed in @flags, <code>+</code> characters in the param
     * string will be replaced with spaces in the output. For example, <code>foo=bar+baz</code>
     * will give attribute <code>foo</code> with value <code>bar baz</code>. This is commonly used on the
     * web (the <code>https</code> and <code>http</code> schemes only), but is deprecated in favour of
     * the equivalent of encoding spaces as <code><code>20</code> /code>.
     * 
     * Unlike with g_uri_parse_params(), {@link org.gtk.glib.UriParamsFlags<code>#CASE_INSENSITIVE</code>  has no
     * effect if passed to @flags for g_uri_params_iter_init(). The caller is
     * responsible for doing their own case-insensitive comparisons.
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     * GUriParamsIter iter;
     * GError *error = NULL;
     * gchar *unowned_attr, *unowned_value;
     * 
     * g_uri_params_iter_init (&<code>#38</code> iter, &<code>#34</code> foo=bar&<code>#38</code> baz=bar&<code>#38</code> Foo=frob&<code>#38</code> baz=bar2&<code>#34</code> , -1, &<code>#34</code> &<code>#38</code> &<code>#34</code> , G_URI_PARAMS_NONE);
     * while (g_uri_params_iter_next (&<code>#38</code> iter, &<code>#38</code> unowned_attr, &<code>#38</code> unowned_value, &<code>#38</code> error))
     *   {
     *     g_autofree gchar *attr = g_steal_pointer (&<code>#38</code> unowned_attr);
     *     g_autofree gchar *value = g_steal_pointer (&<code>#38</code> unowned_value);
     *     // do something with attr and value; this code will be called 4 times
     *     // for the params string in this example: once with attr=foo and value=bar,
     *     // then with baz/bar, then Foo/frob, then baz/bar2.
     *   }
     * if (error)
     *   // handle parsing error
     * ]}|
     */
    public void init(java.lang.String params, long length, java.lang.String separators, int flags) {
        gtk_h.g_uri_params_iter_init(handle(), Interop.allocateNativeString(params).handle(), length, Interop.allocateNativeString(separators).handle(), flags);
    }
    
    /**
     * Advances @iter and retrieves the next attribute/value. <code>false</code> is returned if
     * an error has occurred (in which case @error is set), or if the end of the
     * iteration is reached (in which case @attribute and @value are set to <code>null</code> and the iterator becomes invalid). If <code>true</code> is returned,
     * g_uri_params_iter_next() may be called again to receive another
     * attribute/value pair.
     * 
     * Note that the same @attribute may be returned multiple times, since URIs
     * allow repeated attributes.
     */
    public boolean next(java.lang.String[] attribute, java.lang.String[] value) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_uri_params_iter_next(handle(), Interop.allocateNativeArray(attribute).handle(), Interop.allocateNativeArray(value).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
}
