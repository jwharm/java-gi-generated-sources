package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque context struct for {@code GtkBuildableParser}.
 */
public class BuildableParseContext extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBuildableParseContext";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static BuildableParseContext allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BuildableParseContext newInstance = new BuildableParseContext(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public BuildableParseContext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Retrieves the name of the currently open element.
     * <p>
     * If called from the start_element or end_element handlers this will
     * give the element_name as passed to those functions. For the parent
     * elements, see gtk_buildable_parse_context_get_element_stack().
     * @return the name of the currently open element
     */
    public @Nullable java.lang.String getElement() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_buildable_parse_context_get_element.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves the element stack from the internal state of the parser.
     * <p>
     * The returned {@code GPtrArray} is an array of strings where the last item is
     * the currently open tag (as would be returned by
     * gtk_buildable_parse_context_get_element()) and the previous item is its
     * immediate parent.
     * <p>
     * This function is intended to be used in the start_element and
     * end_element handlers where gtk_buildable_parse_context_get_element()
     * would merely return the name of the element that is being
     * processed.
     * @return the element stack, which must not be modified
     */
    public @NotNull PointerString getElementStack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_buildable_parse_context_get_element_stack.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Retrieves the current line number and the number of the character on
     * that line. Intended for use in error messages; there are no strict
     * semantics for what constitutes the "current" line number other than
     * "the best number we could come up with for error messages."
     * @param lineNumber return location for a line number
     * @param charNumber return location for a char-on-line number
     */
    public void getPosition(Out<Integer> lineNumber, Out<Integer> charNumber) {
        java.util.Objects.requireNonNull(lineNumber, "Parameter 'lineNumber' must not be null");
        java.util.Objects.requireNonNull(charNumber, "Parameter 'charNumber' must not be null");
        MemorySegment lineNumberPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment charNumberPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_buildable_parse_context_get_position.invokeExact(
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
     * Completes the process of a temporary sub-parser redirection.
     * <p>
     * This function exists to collect the user_data allocated by a
     * matching call to gtk_buildable_parse_context_push(). It must be called
     * in the end_element handler corresponding to the start_element
     * handler during which gtk_buildable_parse_context_push() was called.
     * You must not call this function from the error callback -- the
     * {@code user_data} is provided directly to the callback in that case.
     * <p>
     * This function is not intended to be directly called by users
     * interested in invoking subparsers. Instead, it is intended to
     * be used by the subparsers themselves to implement a higher-level
     * interface.
     * @return the user data passed to gtk_buildable_parse_context_push()
     */
    public @Nullable java.lang.foreign.MemoryAddress pop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_buildable_parse_context_pop.invokeExact(
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
     * a {@code GtkBuildableParser}. It must be matched with a corresponding call to
     * gtk_buildable_parse_context_pop() in the matching end_element handler
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
     * which is why gtk_buildable_parse_context_pop() is provided to allow "one
     * last access" to the {@code user_data} provided to this function. In the
     * case of error, the {@code user_data} provided here is passed directly to
     * the error callback of the subparser and gtk_buildable_parse_context_pop()
     * should not be called. In either case, if {@code user_data} was allocated
     * then it ought to be freed from both of these locations.
     * <p>
     * This function is not intended to be directly called by users
     * interested in invoking subparsers. Instead, it is intended to be
     * used by the subparsers themselves to implement a higher-level
     * interface.
     * <p>
     * For an example of how to use this, see g_markup_parse_context_push() which
     * has the same kind of API.
     * @param parser a {@code GtkBuildableParser}
     * @param userData user data to pass to {@code GtkBuildableParser} functions
     */
    public void push(@NotNull org.gtk.gtk.BuildableParser parser, @Nullable java.lang.foreign.MemoryAddress userData) {
        java.util.Objects.requireNonNull(parser, "Parameter 'parser' must not be null");
        try {
            DowncallHandles.gtk_buildable_parse_context_push.invokeExact(
                    handle(),
                    parser.handle(),
                    userData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_buildable_parse_context_get_element = Interop.downcallHandle(
            "gtk_buildable_parse_context_get_element",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_buildable_parse_context_get_element_stack = Interop.downcallHandle(
            "gtk_buildable_parse_context_get_element_stack",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_buildable_parse_context_get_position = Interop.downcallHandle(
            "gtk_buildable_parse_context_get_position",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_buildable_parse_context_pop = Interop.downcallHandle(
            "gtk_buildable_parse_context_pop",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_buildable_parse_context_push = Interop.downcallHandle(
            "gtk_buildable_parse_context_push",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
