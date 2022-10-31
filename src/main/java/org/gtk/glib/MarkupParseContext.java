package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A parse context is used to parse a stream of bytes that
 * you expect to contain marked-up text.
 * <p>
 * See g_markup_parse_context_new(), {@link MarkupParser}, and so
 * on for more details.
 */
public class MarkupParseContext extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMarkupParseContext";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static MarkupParseContext allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MarkupParseContext newInstance = new MarkupParseContext(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public MarkupParseContext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.glib.MarkupParser parser, @NotNull org.gtk.glib.MarkupParseFlags flags, @Nullable java.lang.foreign.MemoryAddress userData, @NotNull org.gtk.glib.DestroyNotify userDataDnotify) {
        java.util.Objects.requireNonNull(parser, "Parameter 'parser' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_markup_parse_context_new.invokeExact(
                    parser.handle(),
                    flags.getValue(),
                    userData,
                    Interop.cbDestroyNotifySymbol()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new parse context. A parse context is used to parse
     * marked-up documents. You can feed any number of documents into
     * a context, as long as no errors occur; once an error occurs,
     * the parse context can't continue to parse text (you have to
     * free it and create a new parse context).
     * @param parser a {@link MarkupParser}
     * @param flags one or more {@link MarkupParseFlags}
     * @param userData user data to pass to {@link MarkupParser} functions
     * @param userDataDnotify user data destroy notifier called when
     *     the parse context is freed
     */
    public MarkupParseContext(@NotNull org.gtk.glib.MarkupParser parser, @NotNull org.gtk.glib.MarkupParseFlags flags, @Nullable java.lang.foreign.MemoryAddress userData, @NotNull org.gtk.glib.DestroyNotify userDataDnotify) {
        super(constructNew(parser, flags, userData, userDataDnotify));
    }
    
    /**
     * Signals to the {@link MarkupParseContext} that all data has been
     * fed into the parse context with g_markup_parse_context_parse().
     * <p>
     * This function reports an error if the document isn't complete,
     * for example if elements are still open.
     * @return {@code true} on success, {@code false} if an error was set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean endParse() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_markup_parse_context_end_parse.invokeExact(
                    handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Frees a {@link MarkupParseContext}.
     * <p>
     * This function can't be called from inside one of the
     * {@link MarkupParser} functions or while a subparser is pushed.
     */
    public void free() {
        try {
            DowncallHandles.g_markup_parse_context_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the name of the currently open element.
     * <p>
     * If called from the start_element or end_element handlers this will
     * give the element_name as passed to those functions. For the parent
     * elements, see g_markup_parse_context_get_element_stack().
     * @return the name of the currently open element, or {@code null}
     */
    public @NotNull java.lang.String getElement() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_markup_parse_context_get_element.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves the element stack from the internal state of the parser.
     * <p>
     * The returned {@link SList} is a list of strings where the first item is
     * the currently open tag (as would be returned by
     * g_markup_parse_context_get_element()) and the next item is its
     * immediate parent.
     * <p>
     * This function is intended to be used in the start_element and
     * end_element handlers where g_markup_parse_context_get_element()
     * would merely return the name of the element that is being
     * processed.
     * @return the element stack, which must not be modified
     */
    public @NotNull org.gtk.glib.SList getElementStack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_markup_parse_context_get_element_stack.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the current line number and the number of the character on
     * that line. Intended for use in error messages; there are no strict
     * semantics for what constitutes the "current" line number other than
     * "the best number we could come up with for error messages."
     * @param lineNumber return location for a line number, or {@code null}
     * @param charNumber return location for a char-on-line number, or {@code null}
     */
    public void getPosition(Out<Integer> lineNumber, Out<Integer> charNumber) {
        java.util.Objects.requireNonNull(lineNumber, "Parameter 'lineNumber' must not be null");
        java.util.Objects.requireNonNull(charNumber, "Parameter 'charNumber' must not be null");
        MemorySegment lineNumberPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment charNumberPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.g_markup_parse_context_get_position.invokeExact(
                    handle(),
                    (Addressable) lineNumberPOINTER.address(),
                    (Addressable) charNumberPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        lineNumber.set(lineNumberPOINTER.get(ValueLayout.JAVA_INT, 0));
        charNumber.set(charNumberPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    /**
     * Returns the user_data associated with {@code context}.
     * <p>
     * This will either be the user_data that was provided to
     * g_markup_parse_context_new() or to the most recent call
     * of g_markup_parse_context_push().
     * @return the provided user_data. The returned data belongs to
     *     the markup context and will be freed when
     *     g_markup_parse_context_free() is called.
     */
    public @Nullable java.lang.foreign.MemoryAddress getUserData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_markup_parse_context_get_user_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Feed some data to the {@link MarkupParseContext}.
     * <p>
     * The data need not be valid UTF-8; an error will be signaled if
     * it's invalid. The data need not be an entire document; you can
     * feed a document into the parser incrementally, via multiple calls
     * to this function. Typically, as you receive data from a network
     * connection or file, you feed each received chunk of data into this
     * function, aborting the process if an error occurs. Once an error
     * is reported, no further data may be fed to the {@link MarkupParseContext};
     * all errors are fatal.
     * @param text chunk of text to parse
     * @param textLen length of {@code text} in bytes
     * @return {@code false} if an error occurred, {@code true} on success
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean parse(@NotNull java.lang.String text, long textLen) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_markup_parse_context_parse.invokeExact(
                    handle(),
                    Interop.allocateNativeString(text),
                    textLen, (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Completes the process of a temporary sub-parser redirection.
     * <p>
     * This function exists to collect the user_data allocated by a
     * matching call to g_markup_parse_context_push(). It must be called
     * in the end_element handler corresponding to the start_element
     * handler during which g_markup_parse_context_push() was called.
     * You must not call this function from the error callback -- the
     * {@code user_data} is provided directly to the callback in that case.
     * <p>
     * This function is not intended to be directly called by users
     * interested in invoking subparsers. Instead, it is intended to
     * be used by the subparsers themselves to implement a higher-level
     * interface.
     * @return the user data passed to g_markup_parse_context_push()
     */
    public @Nullable java.lang.foreign.MemoryAddress pop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_markup_parse_context_pop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Temporarily redirects markup data to a sub-parser.
     * <p>
     * This function may only be called from the start_element handler of
     * a {@link MarkupParser}. It must be matched with a corresponding call to
     * g_markup_parse_context_pop() in the matching end_element handler
     * (except in the case that the parser aborts due to an error).
     * <p>
     * All tags, text and other data between the matching tags is
     * redirected to the subparser given by {@code parser}. {@code user_data} is used
     * as the user_data for that parser. {@code user_data} is also passed to the
     * error callback in the event that an error occurs. This includes
     * errors that occur in subparsers of the subparser.
     * <p>
     * The end tag matching the start tag for which this call was made is
     * handled by the previous parser (which is given its own user_data)
     * which is why g_markup_parse_context_pop() is provided to allow "one
     * last access" to the {@code user_data} provided to this function. In the
     * case of error, the {@code user_data} provided here is passed directly to
     * the error callback of the subparser and g_markup_parse_context_pop()
     * should not be called. In either case, if {@code user_data} was allocated
     * then it ought to be freed from both of these locations.
     * <p>
     * This function is not intended to be directly called by users
     * interested in invoking subparsers. Instead, it is intended to be
     * used by the subparsers themselves to implement a higher-level
     * interface.
     * <p>
     * As an example, see the following implementation of a simple
     * parser that counts the number of tags encountered.
     * <pre>{@code <!-- language="C" -->
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
     *   data->tag_count++;
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
     * }</pre>
     * <p>
     * In order to allow this parser to be easily used as a subparser, the
     * following interface is provided:
     * <pre>{@code <!-- language="C" -->
     * void
     * start_counting (GMarkupParseContext *context)
     * {
     *   CounterData *data = g_slice_new (CounterData);
     * 
     *   data->tag_count = 0;
     *   g_markup_parse_context_push (context, &counter_subparser, data);
     * }
     * 
     * gint
     * end_counting (GMarkupParseContext *context)
     * {
     *   CounterData *data = g_markup_parse_context_pop (context);
     *   int result;
     * 
     *   result = data->tag_count;
     *   g_slice_free (CounterData, data);
     * 
     *   return result;
     * }
     * }</pre>
     * <p>
     * The subparser would then be used as follows:
     * <pre>{@code <!-- language="C" -->
     * static void start_element (context, element_name, ...)
     * {
     *   if (strcmp (element_name, "count-these") == 0)
     *     start_counting (context);
     * 
     *   // else, handle other tags...
     * }
     * 
     * static void end_element (context, element_name, ...)
     * {
     *   if (strcmp (element_name, "count-these") == 0)
     *     g_print ("Counted %d tags\\n", end_counting (context));
     * 
     *   // else, handle other tags...
     * }
     * }</pre>
     * @param parser a {@link MarkupParser}
     * @param userData user data to pass to {@link MarkupParser} functions
     */
    public void push(@NotNull org.gtk.glib.MarkupParser parser, @Nullable java.lang.foreign.MemoryAddress userData) {
        java.util.Objects.requireNonNull(parser, "Parameter 'parser' must not be null");
        try {
            DowncallHandles.g_markup_parse_context_push.invokeExact(
                    handle(),
                    parser.handle(),
                    userData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increases the reference count of {@code context}.
     * @return the same {@code context}
     */
    public @NotNull org.gtk.glib.MarkupParseContext ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_markup_parse_context_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.MarkupParseContext(Refcounted.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count of {@code context}.  When its reference count
     * drops to 0, it is freed.
     */
    public void unref() {
        try {
            DowncallHandles.g_markup_parse_context_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_markup_parse_context_new = Interop.downcallHandle(
            "g_markup_parse_context_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_markup_parse_context_end_parse = Interop.downcallHandle(
            "g_markup_parse_context_end_parse",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_markup_parse_context_free = Interop.downcallHandle(
            "g_markup_parse_context_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_markup_parse_context_get_element = Interop.downcallHandle(
            "g_markup_parse_context_get_element",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_markup_parse_context_get_element_stack = Interop.downcallHandle(
            "g_markup_parse_context_get_element_stack",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_markup_parse_context_get_position = Interop.downcallHandle(
            "g_markup_parse_context_get_position",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_markup_parse_context_get_user_data = Interop.downcallHandle(
            "g_markup_parse_context_get_user_data",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_markup_parse_context_parse = Interop.downcallHandle(
            "g_markup_parse_context_parse",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_markup_parse_context_pop = Interop.downcallHandle(
            "g_markup_parse_context_pop",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_markup_parse_context_push = Interop.downcallHandle(
            "g_markup_parse_context_push",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_markup_parse_context_ref = Interop.downcallHandle(
            "g_markup_parse_context_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_markup_parse_context_unref = Interop.downcallHandle(
            "g_markup_parse_context_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
