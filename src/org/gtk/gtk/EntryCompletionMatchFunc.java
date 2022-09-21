package org.gtk.gtk;

/**
 * A function which decides whether the row indicated by {@code iter} matches
 * a given {@code key}, and should be displayed as a possible completion for {@code key}.
 * <p>
 * Note that {@code key} is normalized and case-folded (see g_utf8_normalize()
 * and g_utf8_casefold()). If this is not appropriate, match functions
 * have access to the unmodified key via
 * {@code gtk_editable_get_text (GTK_EDITABLE (gtk_entry_completion_get_entry ()))}.
 */
@FunctionalInterface
public interface EntryCompletionMatchFunc {
        boolean onEntryCompletionMatchFunc(EntryCompletion completion, java.lang.String key, TreeIter iter);
}
