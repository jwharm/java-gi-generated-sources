package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque context struct for <code>GtkBuildableParser</code>.
 */
public class BuildableParseContext extends io.github.jwharm.javagi.ResourceBase {

    public BuildableParseContext(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Retrieves the name of the currently open element.
     * 
     * If called from the start_element or end_element handlers this will
     * give the element_name as passed to those functions. For the parent
     * elements, see gtk_buildable_parse_context_get_element_stack().
     */
    public java.lang.String getElement() {
        var RESULT = gtk_h.gtk_buildable_parse_context_get_element(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Completes the process of a temporary sub-parser redirection.
     * 
     * This function exists to collect the user_data allocated by a
     * matching call to gtk_buildable_parse_context_push(). It must be called
     * in the end_element handler corresponding to the start_element
     * handler during which gtk_buildable_parse_context_push() was called.
     * You must not call this function from the error callback -- the
     * @user_data is provided directly to the callback in that case.
     * 
     * This function is not intended to be directly called by users
     * interested in invoking subparsers. Instead, it is intended to
     * be used by the subparsers themselves to implement a higher-level
     * interface.
     */
    public jdk.incubator.foreign.MemoryAddress pop() {
        var RESULT = gtk_h.gtk_buildable_parse_context_pop(handle());
        return RESULT;
    }
    
    /**
     * Temporarily redirects markup data to a sub-parser.
     * <p>
     * This function may only be called from the start_element handler of
     * a <code>GtkBuildableParser</code>. It must be matched with a corresponding call to
     * gtk_buildable_parse_context_pop() in the matching end_element handler
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
     * which is why gtk_buildable_parse_context_pop() is provided to allow &#34;one
     * last access&#34; to the @user_data provided to this function. In the
     * case of error, the @user_data provided here is passed directly to
     * the error callback of the subparser and gtk_buildable_parse_context_pop()
     * should not be called. In either case, if @user_data was allocated
     * then it ought to be freed from both of these locations.
     * 
     * This function is not intended to be directly called by users
     * interested in invoking subparsers. Instead, it is intended to be
     * used by the subparsers themselves to implement a higher-level
     * interface.
     * 
     * For an example of how to use this, see g_markup_parse_context_push() which
     * has the same kind of API.
     */
    public void push(BuildableParser parser, jdk.incubator.foreign.MemoryAddress userData) {
        gtk_h.gtk_buildable_parse_context_push(handle(), parser.handle(), userData);
    }
    
}
