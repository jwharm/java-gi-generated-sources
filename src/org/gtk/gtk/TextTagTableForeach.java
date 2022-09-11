package org.gtk.gtk;

/**
 * A function used with gtk_text_tag_table_foreach(),
 * to iterate over every `GtkTextTag` inside a `GtkTextTagTable`.
 */
@FunctionalInterface
public interface TextTagTableForeach {
        void onTextTagTableForeach(TextTag tag);
}
