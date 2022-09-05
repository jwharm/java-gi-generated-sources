package org.gtk.gtk;

@FunctionalInterface
public interface TextCharPredicate {

    /**
     * The predicate function used by gtk_text_iter_forward_find_char() and
     * gtk_text_iter_backward_find_char().
     */
    public boolean onTextCharPredicate(int ch, jdk.incubator.foreign.MemoryAddress userData);
}
