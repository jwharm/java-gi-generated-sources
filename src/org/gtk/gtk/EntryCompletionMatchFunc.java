package org.gtk.gtk;

@FunctionalInterface
public interface EntryCompletionMatchFunc {

        void onEntryCompletionMatchFunc(EntryCompletion completion, java.lang.String key, TreeIter iter);
}
