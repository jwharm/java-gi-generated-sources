package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A parse context is used to parse a stream of bytes that
 * you expect to contain marked-up text.
 * 
 * See g_markup_parse_context_new(), #GMarkupParser, and so
 * on for more details.
 */
public class MarkupParseContext extends io.github.jwharm.javagi.ResourceBase {

    public MarkupParseContext(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(MarkupParser parser, int flags, jdk.incubator.foreign.MemoryAddress userData, DestroyNotify userDataDnotify) {
        Reference RESULT = References.get(gtk_h.g_markup_parse_context_new(parser.handle(), flags, userData, 
                    Interop.cbDestroyNotifySymbol()), true);
        return RESULT;
    }
    
    /**
     * Creates a new parse context. A parse context is used to parse
     * marked-up documents. You can feed any number of documents into
     * a context, as long as no errors occur; once an error occurs,
     * the parse context can&#39;t continue to parse text (you have to
     * free it and create a new parse context).
     */
    public MarkupParseContext(MarkupParser parser, int flags, jdk.incubator.foreign.MemoryAddress userData, DestroyNotify userDataDnotify) {
        super(constructNew(parser, flags, userData, userDataDnotify));
    }
    
    /**
     * Signals to the #GMarkupParseContext that all data has been
     * fed into the parse context with g_markup_parse_context_parse().
     * 
     * This function reports an error if the document isn&#39;t complete,
     * for example if elements are still open.
     */
    public boolean endParse() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_markup_parse_context_end_parse(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Frees a #GMarkupParseContext.
     * 
     * This function can&#39;t be called from inside one of the
     * #GMarkupParser functions or while a subparser is pushed.
     */
    public void free() {
        gtk_h.g_markup_parse_context_free(handle());
    }
    
    /**
     * Retrieves the name of the currently open element.
     * 
     * If called from the start_element or end_element handlers this will
     * give the element_name as passed to those functions. For the parent
     * elements, see g_markup_parse_context_get_element_stack().
     */
    public java.lang.String getElement() {
        var RESULT = gtk_h.g_markup_parse_context_get_element(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the element stack from the internal state of the parser.
     * 
     * The returned #GSList is a list of strings where the first item is
     * the currently open tag (as would be returned by
     * g_markup_parse_context_get_element()) and the next item is its
     * immediate parent.
     * 
     * This function is intended to be used in the start_element and
     * end_element handlers where g_markup_parse_context_get_element()
     * would merely return the name of the element that is being
     * processed.
     */
    public org.gtk.glib.SList getElementStack() {
        var RESULT = gtk_h.g_markup_parse_context_get_element_stack(handle());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Returns the user_data associated with @context.
     * 
     * This will either be the user_data that was provided to
     * g_markup_parse_context_new() or to the most recent call
     * of g_markup_parse_context_push().
     */
    public jdk.incubator.foreign.MemoryAddress getUserData() {
        var RESULT = gtk_h.g_markup_parse_context_get_user_data(handle());
        return RESULT;
    }
    
    /**
     * Feed some data to the #GMarkupParseContext.
     * 
     * The data need not be valid UTF-8; an error will be signaled if
     * it&#39;s invalid. The data need not be an entire document; you can
     * feed a document into the parser incrementally, via multiple calls
     * to this function. Typically, as you receive data from a network
     * connection or file, you feed each received chunk of data into this
     * function, aborting the process if an error occurs. Once an error
     * is reported, no further data may be fed to the #GMarkupParseContext;
     * all errors are fatal.
     */
    public boolean parse(java.lang.String text, long textLen) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_markup_parse_context_parse(handle(), Interop.allocateNativeString(text).handle(), textLen, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Completes the process of a temporary sub-parser redirection.
     * 
     * This function exists to collect the user_data allocated by a
     * matching call to g_markup_parse_context_push(). It must be called
     * in the end_element handler corresponding to the start_element
     * handler during which g_markup_parse_context_push() was called.
     * You must not call this function from the error callback -- the
     * @user_data is provided directly to the callback in that case.
     * 
     * This function is not intended to be directly called by users
     * interested in invoking subparsers. Instead, it is intended to
     * be used by the subparsers themselves to implement a higher-level
     * interface.
     */
    public jdk.incubator.foreign.MemoryAddress pop() {
        var RESULT = gtk_h.g_markup_parse_context_pop(handle());
        return RESULT;
    }
    
    /**
     * Temporarily redirects markup data to a sub-parser.
     * 
     * This function may only be called from the start_element handler of
     * a #GMarkupParser. It must be matched with a corresponding call to
     * g_markup_parse_context_pop() in the matching end_element handler
     * (except in the case that the parser aborts due to an error).
     * 
     * All tags, text and other data between the matching tags is
     * redirected to the subparser given by @parser. @user_data is used
     * as the user_data for that parser. @user_data is also passed to the
     * error callback in the event that an error occurs. This includes
     * errors that occur in subparsers of the subparser.
     * 
     * The end tag matching the start tag for which this call was made is
     * handled by the previous parser (which is given its own user_data)
     * which is why g_markup_parse_context_pop() is provided to allow &#34;one
     * last access&#34; to the @user_data provided to this function. In the
     * case of error, the @user_data provided here is passed directly to
     * the error callback of the subparser and g_markup_parse_context_pop()
     * should not be called. In either case, if @user_data was allocated
     * then it ought to be freed from both of these locations.
     * 
     * This function is not intended to be directly called by users
     * interested in invoking subparsers. Instead, it is intended to be
     * used by the subparsers themselves to implement a higher-level
     * interface.
     * 
     * As an example, see the following implementation of a simple
     * parser that counts the number of tags encountered.
     * 
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     * typedef struct
     * {
     *   gint tag_count;
     * } CounterData;
     * 
     * static void
     * counter_start_element (GMarkupParseContext  *context,
     *                        const gchar          *element_name,
     *                        const gchar         **attribute_names,
     *                        const gchar         **attribute_values,
     *                        gpointer              user_data,
     *                        GError              **error)
     * {
     *   CounterData *data = user_data;
     * 
     *   data-&#62;tag_count++;
     * }
     * 
     * static void
     * counter_error (GMarkupParseContext *context,
     *                GError              *error,
     *                gpointer             user_data)
     * {
     *   CounterData *data = user_data;
     * 
     *   g_slice_free (CounterData, data);
     * }
     * 
     * static GMarkupParser counter_subparser =
     * {
     *   counter_start_element,
     *   NULL,
     *   NULL,
     *   NULL,
     *   counter_error
     * };
     * ]}|
     * 
     * In order to allow this parser to be easily used as a subparser, the
     * following interface is provided:
     * 
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     * void
     * start_counting (GMarkupParseContext *context)
     * {
     *   CounterData *data = g_slice_new (CounterData);
     * 
     *   data-&#62;tag_count = 0;
     *   g_markup_parse_context_push (context, &#38;counter_subparser, data);
     * }
     * 
     * gint
     * end_counting (GMarkupParseContext *context)
     * {
     *   CounterData *data = g_markup_parse_context_pop (context);
     *   int result;
     * 
     *   result = data-&#62;tag_count;
     *   g_slice_free (CounterData, data);
     * 
     *   return result;
     * }
     * ]}|
     * 
     * The subparser would then be used as follows:
     * 
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     * static void start_element (context, element_name, ...)
     * {
     *   if (strcmp (element_name, &#34;count-these&#34;) == 0)
     *     start_counting (context);
     * 
     *   // else, handle other tags...
     * }
     * 
     * static void end_element (context, element_name, ...)
     * {
     *   if (strcmp (element_name, &#34;count-these&#34;) == 0)
     *     g_print (&#34;Counted <code>d</code> tags\\n&#34;, end_counting (context));
     * 
     *   // else, handle other tags...
     * }
     * ]}|
     */
    public void push(MarkupParser parser, jdk.incubator.foreign.MemoryAddress userData) {
        gtk_h.g_markup_parse_context_push(handle(), parser.handle(), userData);
    }
    
    /**
     * Increases the reference count of @context.
     */
    public MarkupParseContext ref() {
        var RESULT = gtk_h.g_markup_parse_context_ref(handle());
        return new MarkupParseContext(References.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count of @context.  When its reference count
     * drops to 0, it is freed.
     */
    public void unref() {
        gtk_h.g_markup_parse_context_unref(handle());
    }
    
}
