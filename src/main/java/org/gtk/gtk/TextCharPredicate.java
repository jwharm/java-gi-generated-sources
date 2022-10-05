package org.gtk.gtk;

import io.github.jwharm.javagi.*;

/**
 * The predicate function used by gtk_text_iter_forward_find_char() and
 * gtk_text_iter_backward_find_char().
 */
@FunctionalInterface
public interface TextCharPredicate {
        boolean onTextCharPredicate(int ch);
}